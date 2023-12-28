package hermes.pipeline.service.application.service.impl;

import hermes.pipeline.service.application.qo.PipelineQO;
import hermes.pipeline.service.application.vo.PipelineVO;
import hermes.pipeline.service.application.service.PipelineApplicationService;
import hermes.pipeline.service.domain.aggregate.Pipeline;
import hermes.pipeline.service.domain.repository.PipelineRepository;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;

/**
 * @author 7Achilles
 **/
@Service
public class PipelineApplicationServiceImpl implements PipelineApplicationService {

    @Resource
    private PipelineRepository pipelineRepository;

    @Override
    public PipelineVO queryById(PipelineQO qo) {

        Pipeline pipeline = pipelineRepository.queryById(qo.getId());

        // todo vo
        return new PipelineVO();
    }

}
