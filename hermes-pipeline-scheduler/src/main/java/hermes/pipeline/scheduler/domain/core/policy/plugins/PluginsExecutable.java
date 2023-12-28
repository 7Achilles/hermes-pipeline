package hermes.pipeline.scheduler.domain.core.policy.plugins;

import hermes.pipeline.scheduler.domain.entity.JobTask;

/**
 * @author 7Achilles
 * @version V1.17.0
 **/
public interface PluginsExecutable {

    void doExecute(JobTask jobTask);

}
