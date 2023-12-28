package hermes.pipeline.service.domain.event.policy;



import hermes.pipeline.common.dto.PipelineTaskDTO;

import java.util.Map;

/**
 * @author 7Achilles
 **/
public interface PipelineTaskEventExecutor {

    void execute(PipelineTaskDTO dto, Map<String, Object> param);

}
