package hermes.pipeline.scheduler.domain.event.policy.plugins.impl;

import hermes.pipeline.scheduler.domain.entity.JobTask;

/**
 * @author 7Achilles
 **/
public class DockerBuildPlugin extends BasePlugin {
    @Override
    protected JobTask beforeExecute(JobTask jobTask) {

        return null;
    }

    @Override
    protected JobTask execute(JobTask jobTask) {
        return null;
    }

    @Override
    protected void afterExecute(JobTask jobTask) {

    }
}
