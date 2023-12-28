package hermes.pipeline.service.domain.event.publisher;

import org.springframework.context.ApplicationEventPublisher;
import org.springframework.stereotype.Component;

import javax.annotation.Resource;

/**
 * @author 7Achilles
 **/
@Component
public class PipelineTaskPublisher<E> {

    @Resource
    private ApplicationEventPublisher appEventPublisher;

    public void syncPublish(E event) {
        appEventPublisher.publishEvent(event);
    }


}
