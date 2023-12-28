package hermes.pipeline.service.command;

import hermes.pipeline.service.command.vo.PipelineVO;

/**
 * @author 7Achilles
 * @version V1.17.0
 * @className PipelineService
 * @description
 * @date 2023/11/17 16:02
 **/
public interface PipelineApplicationCommand {

    Long createPipeline(PipelineVO vo);

    Long executePipeline(PipelineVO vo);

}
