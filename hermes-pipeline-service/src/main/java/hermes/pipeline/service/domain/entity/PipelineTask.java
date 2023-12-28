package hermes.pipeline.service.domain.entity;

import hermes.pipeline.common.valueObject.PipelineTaskStatusEnum;
import hermes.pipeline.service.domain.repository.PipelineTaskRepository;
import lombok.Data;

/**
 * @author 7Achilles
 **/
@Data
public class PipelineTask {

    private Long id;

    private PipelineTaskStatusEnum status = PipelineTaskStatusEnum.START;

    private Long pipelineId;

    private Stage root;

    public Long save() {

        // todo insert pipeline task

        // todo insert pipeline stage meta info

        // todo insert pipeline task mq

        // bean
        PipelineTaskRepository taskRepository = null;

        return taskRepository.save(this);
    }


}
