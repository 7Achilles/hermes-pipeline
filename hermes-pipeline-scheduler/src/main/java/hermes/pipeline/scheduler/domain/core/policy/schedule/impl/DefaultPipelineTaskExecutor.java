package hermes.pipeline.scheduler.domain.event.policy.schedule.impl;

import hermes.pipeline.scheduler.domain.aggregate.PipelineTask;
import hermes.pipeline.scheduler.domain.aggregate.StageTask;
import hermes.pipeline.scheduler.domain.event.policy.schedule.PipelineTaskExecutor;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;
import java.util.concurrent.CompletableFuture;
import java.util.concurrent.ThreadPoolExecutor;

/**
 * @author 7Achilles
 **/
@Service
public class DefaultPipelineTaskExecutor implements PipelineTaskExecutor {

    @Resource
    private ThreadPoolExecutor defaultThreadPool;

    @Override
    public void execute(PipelineTask task) {

        CompletableFuture<PipelineTask> completableFuture = CompletableFuture.supplyAsync(() -> {
            // todo check
            return task;
        }, defaultThreadPool);

        List<StageTask> stages = task.makeStagesList();

        for (StageTask stageTask : stages) {
            completableFuture = completableFuture.thenApply(t -> {
                stageTask.execute(defaultThreadPool);
                return t;
            });
        }

        // success
        completableFuture = completableFuture.thenApply(t -> {
            // todo send event

            return t;
        });

        // handler exception
        completableFuture.exceptionally(e -> {
            task.setSuccess(false);
            // todo send event

            return task;
        });
    }


}
