package hermes.pipeline.service.command.impl;

import hermes.pipeline.service.domain.aggregate.Pipeline;
import hermes.pipeline.service.domain.factory.PipelineFactory;
import hermes.pipeline.service.domain.repository.PipelineRepository;
import hermes.pipeline.service.command.vo.PipelineVO;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;

/**
 * @author 7Achilles
 **/
@Service
public class PipelineApplicationCommandImpl implements hermes.pipeline.service.command.PipelineApplicationCommand {

    @Resource
    private PipelineRepository pipelineRepository;

    @Override
    public Long createPipeline(PipelineVO vo) {
        Pipeline pipeline = PipelineFactory.create(vo);
        return pipeline.save();
    }

    @Override
    public Long executePipeline(PipelineVO vo) {

        Pipeline pipeline = pipelineRepository.queryById(vo.getId());
        return pipeline.execute();

    }
}
