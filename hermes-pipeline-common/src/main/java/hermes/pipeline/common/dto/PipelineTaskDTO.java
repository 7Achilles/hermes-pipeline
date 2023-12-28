package hermes.pipeline.common.dto;

import hermes.pipeline.common.valueObject.PipelineTaskStatusEnum;
import lombok.Data;

/**
 * @author 7Achilles
 **/
@Data
public class PipelineTaskDTO {

    private Long id;

    private PipelineTaskStatusEnum status;

}
