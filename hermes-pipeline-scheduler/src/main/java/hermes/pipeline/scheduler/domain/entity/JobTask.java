package hermes.pipeline.scheduler.domain.entity;

import hermes.pipeline.common.valueObject.PipelineTaskJobType;
import lombok.Data;

/**
 * @author 7Achilles
 **/
@Data
public class Job {

    private Long id;

    private PipelineTaskJobType type;

}
