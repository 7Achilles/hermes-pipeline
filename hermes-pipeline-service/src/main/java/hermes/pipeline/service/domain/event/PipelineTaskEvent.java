package hermes.pipeline.service.domain.event;

import org.springframework.context.ApplicationEvent;

/**
 * @author 7Achilles
 **/
public class PipelineTaskStartEvent extends ApplicationEvent {


    public PipelineTaskStartEvent(Object source) {
        super(source);
    }
}
