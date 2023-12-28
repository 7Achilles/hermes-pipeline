package hermes.pipeline.service.domain.dto;

import hermes.pipeline.service.domain.valueObject.PipelineTaskStatusEnum;
import lombok.Data;

/**
 * @author 7Achilles
 **/
@Data
public class PipelineTaskDTO {

    private Long id;

    private PipelineTaskStatusEnum status;

}
