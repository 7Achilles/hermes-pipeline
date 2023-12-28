package hermes.pipeline.scheduler.domain.core.policy.plugins.impl;

import hermes.pipeline.scheduler.domain.entity.JobTask;
import hermes.pipeline.scheduler.domain.core.policy.plugins.PluginsExecutable;

/**
 * @author 7Achilles
 **/
public abstract class BasePlugin implements PluginsExecutable {

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
