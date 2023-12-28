package hermes.pipeline.service.application.command;

import hermes.pipeline.service.application.qo.PipelineQO;
import hermes.pipeline.service.application.vo.PipelineVO;

/**
 * @author 7Achilles
 * @version V1.17.0
 * @className PipelineService
 * @description
 * @date 2023/11/17 16:02
 **/
public interface PipelineApplicationCommand {

    Long executePipeline(PipelineQO qo);

}
