package hermes.pipeline.service.application.command.impl;


import hermes.pipeline.service.application.command.PipelineApplicationCommand;
import hermes.pipeline.service.application.qo.PipelineQO;
import hermes.pipeline.service.domain.aggregate.Pipeline;
import hermes.pipeline.service.domain.dto.PipelineDTO;
import org.springframework.transaction.annotation.Transactional;
import hermes.pipeline.service.domain.factory.PipelineFactory;
import org.springframework.stereotype.Service;

import java.io.IOException;


/**
 * @author 7Achilles
 **/
@Service
public class PipelineApplicationCommandImpl implements PipelineApplicationCommand {

    @Transactional
    @Override
    public Long executePipeline(PipelineQO qo) {

        Pipeline pipeline = new Pipeline();
        return pipeline.execute();

    }

}
