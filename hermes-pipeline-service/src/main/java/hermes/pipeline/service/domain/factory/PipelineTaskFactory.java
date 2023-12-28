package hermes.pipeline.service.domain.factory;

import hermes.pipeline.service.domain.aggregate.Pipeline;
import hermes.pipeline.service.domain.entity.PipelineTask;
import hermes.pipeline.service.domain.entity.Stage;

/**
 * @author 7Achilles
 * buid pipeline task by pipeline
 **/
public class PipelineTaskFactory {

    public static PipelineTask create(Pipeline pipeline) {
        PipelineTask pipelineTask = new PipelineTask();
        pipelineTask.setPipelineId(pipeline.getId());
        pipelineTask.setRoot(pipeline.getRoot());
        return pipelineTask;
    }



}
