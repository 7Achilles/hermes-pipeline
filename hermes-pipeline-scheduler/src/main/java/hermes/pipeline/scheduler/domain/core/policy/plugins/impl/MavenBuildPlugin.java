package hermes.pipeline.scheduler.domain.core.policy.plugins.impl;

import hermes.pipeline.scheduler.domain.entity.JobTask;

/**
 * @author 7Achilles
 **/

public class MavenBuildPlugin extends BasePlugin{
    @Override
    protected JobTask beforeExecute(JobTask jobTask) {
        // todo check 仓库连通性


        return jobTask;
    }

    @Override
    protected JobTask execute(JobTask jobTask) {
        return null;
    }

    @Override
    protected void afterExecute(JobTask jobTask) {

    }


}
