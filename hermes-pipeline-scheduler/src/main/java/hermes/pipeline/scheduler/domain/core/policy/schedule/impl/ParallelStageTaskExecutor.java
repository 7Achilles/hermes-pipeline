package hermes.pipeline.scheduler.domain.core.policy.schedule.impl;

import hermes.pipeline.common.util.SpringBeanUtil;
import hermes.pipeline.scheduler.domain.aggregate.StageTask;
import hermes.pipeline.scheduler.domain.core.policy.plugins.PluginsFactory;
import hermes.pipeline.scheduler.domain.core.policy.schedule.StageTaskExecutable;
import hermes.pipeline.scheduler.domain.entity.JobTask;
import org.springframework.stereotype.Component;

import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.CompletableFuture;
import java.util.concurrent.ThreadPoolExecutor;

/**
 * @author 7Achilles
 **/
@Component
public class ParallelStageTaskExecutor implements StageTaskExecutable<StageTask> {
    @Override
    public void execute(StageTask stageTask) {
        List<CompletableFuture<JobTask>> list = new ArrayList<>();
        List<JobTask> jobTasks = stageTask.getJobTasks();
        for (JobTask jobTask : jobTasks) {
            CompletableFuture<JobTask> completableFuture = CompletableFuture.supplyAsync(() -> {
                jobTask.run(PluginsFactory.getPlugin(jobTask.getType()));
                return jobTask;
            }, (ThreadPoolExecutor) SpringBeanUtil.getBean("defaultThreadPool"));
            list.add(completableFuture);
        }
        CompletableFuture<Void> completableFuture = CompletableFuture.allOf(list.toArray(new CompletableFuture[jobTasks.size()]));
        completableFuture.whenComplete((v, t) -> {
            // todo stage state
        });
    }

}
