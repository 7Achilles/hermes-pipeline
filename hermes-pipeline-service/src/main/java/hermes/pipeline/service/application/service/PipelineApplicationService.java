package hermes.pipeline.service.application.service;

import hermes.pipeline.service.application.qo.PipelineQO;
import hermes.pipeline.service.application.vo.PipelineVO;

/**
 * @author 7Achilles
 **/
public interface PipelineApplicationService {

    PipelineVO queryById(PipelineQO vo);

}
