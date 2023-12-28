package hermes.pipeline.scheduler.domain.core.policy.schedule;

import hermes.pipeline.scheduler.domain.aggregate.PipelineTask;

/**
 * @author 7Achilles
 **/
public interface PipelineTaskExecutable {

    void execute(PipelineTask task);

}
