package hermes.pipeline.scheduler.domain.core.policy.schedule.impl;

import hermes.pipeline.common.util.SpringBeanUtil;
import hermes.pipeline.scheduler.domain.aggregate.StageTask;
import hermes.pipeline.scheduler.domain.core.policy.plugins.PluginsFactory;
import hermes.pipeline.scheduler.domain.core.policy.schedule.StageTaskExecutable;
import hermes.pipeline.scheduler.domain.entity.JobTask;
import org.springframework.stereotype.Component;

import java.util.List;
import java.util.concurrent.CompletableFuture;
import java.util.concurrent.ThreadPoolExecutor;

/**
 * @author 7Achilles
 **/
@Component
public class SerialStageTaskExecutor implements StageTaskExecutable<StageTask> {

    @Override
    public void execute(StageTask stageTask) {
        List<JobTask> jobTasks = stageTask.getJobTasks();
        CompletableFuture<Void> completableFuture = CompletableFuture.runAsync(() -> {
            // todo log
        }, (ThreadPoolExecutor) SpringBeanUtil.getBean("defaultThreadPool"));

        for (JobTask jobTask : jobTasks) {
            completableFuture = completableFuture.thenRun(() -> {
                jobTask.run(PluginsFactory.getPlugin(jobTask.getType()));
            });
        }

        completableFuture.exceptionally(throwable -> {
            // todo call back
            throw new RuntimeException();
        });
    }

}
