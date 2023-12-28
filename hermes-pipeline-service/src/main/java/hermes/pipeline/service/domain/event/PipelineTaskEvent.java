package hermes.pipeline.service.domain.event;


import hermes.pipeline.common.dto.PipelineTaskDTO;
import org.springframework.context.ApplicationEvent;
import java.util.Map;

/**
 * @author 7Achilles
 **/
public class PipelineTaskEvent extends ApplicationEvent {

    private Map<String, Object> context;

    private PipelineTaskDTO pipelineTaskDTO;

    public PipelineTaskEvent(Object source, PipelineTaskDTO pipelineTaskDTO, Map<String, Object> context) {
        super(source);
        this.context = context;
        this.pipelineTaskDTO = pipelineTaskDTO;
    }

    public PipelineTaskDTO getPipelineTaskDTO() {
        return this.pipelineTaskDTO;
    }

    public Map<String, Object> getContext(){
        return this.context;
    }

}
