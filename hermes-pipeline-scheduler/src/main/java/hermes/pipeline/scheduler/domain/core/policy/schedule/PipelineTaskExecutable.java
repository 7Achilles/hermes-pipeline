package hermes.pipeline.scheduler.domain.core.policy.schedule;

import hermes.pipeline.scheduler.domain.aggregate.PipelineTask;

/**
 * @author 7Achilles
 **/
public interface PipelineTaskExecutor {

    void execute(PipelineTask task);

}
