package hermes.pipeline.service.domain.factory;

import hermes.pipeline.service.domain.aggregate.Pipeline;
import hermes.pipeline.service.domain.dto.PipelineDTO;

/**
 * @author 7Achilles
 **/
public class PipelineFactory {

    public static Pipeline create(PipelineDTO dto){

        Pipeline pipeline = new Pipeline();
        // transform

        return pipeline;
    }



}
