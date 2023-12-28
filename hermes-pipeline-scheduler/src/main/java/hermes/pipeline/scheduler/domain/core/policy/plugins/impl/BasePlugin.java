package hermes.pipeline.scheduler.domain.event.policy.plugins.impl;

import hermes.pipeline.scheduler.domain.entity.JobTask;
import hermes.pipeline.scheduler.domain.event.policy.plugins.Executable;

/**
 * @author 7Achilles
 **/
public abstract class BasePlugin implements Executable {

    @Override
    public void doExecute(JobTask jobTask) {

        jobTask = beforeExecute(jobTask);

        jobTask = execute(jobTask);

        afterExecute(jobTask);

    }

    protected abstract JobTask beforeExecute(JobTask jobTask);

    protected abstract JobTask execute(JobTask jobTask);

    protected abstract void afterExecute(JobTask jobTask);

}
