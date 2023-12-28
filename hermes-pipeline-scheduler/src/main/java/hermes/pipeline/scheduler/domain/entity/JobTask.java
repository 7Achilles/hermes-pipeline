package hermes.pipeline.scheduler.domain.entity;

import hermes.pipeline.common.valueObject.PipelineTaskJobType;
import hermes.pipeline.scheduler.domain.core.policy.plugins.impl.BasePlugin;
import lombok.Data;

/**
 * @author 7Achilles
 **/
@Data
public class JobTask{

    private Long id;

    private PipelineTaskJobType type;

    public void run(BasePlugin plugins){
        plugins.doExecute(this);
    }


}
