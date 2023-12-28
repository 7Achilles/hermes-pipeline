package hermes.pipeline.service.domain.aggregate;

import hermes.pipeline.common.util.SpringBeanUtil;
import hermes.pipeline.service.domain.entity.PipelineTask;
import hermes.pipeline.service.domain.entity.Stage;
import hermes.pipeline.service.domain.event.PipelineTaskEvent;
import hermes.pipeline.service.domain.event.publisher.PipelineTaskPublisher;
import hermes.pipeline.service.domain.factory.PipelineTaskFactory;
import hermes.pipeline.service.domain.repository.PipelineRepository;
import lombok.Data;

/**
 * @author 7Achilles
 **/
@Data
public class Pipeline {

    private Long id;

    private Stage root;

    public Long save() {

        // bean
        PipelineRepository pipelineRepository = null;

        return pipelineRepository.save(this);
    }

    public Long execute() {

        PipelineTask pipelineTask = PipelineTaskFactory.create(this);

        Long taskId = pipelineTask.save();

        publishEvent();

        return taskId;

    }

    private void publishEvent() {

        PipelineTaskPublisher<PipelineTaskEvent> publisher = SpringBeanUtil.getBean(PipelineTaskPublisher.class);

        PipelineTaskEvent event = new PipelineTaskEvent();

        publisher.syncPublish();


    }


}
