package hermes.pipeline.service.domain.repository;

import hermes.pipeline.service.domain.entity.PipelineTask;

/**
 * @author 7Achilles
 * @version V1.17.0
 * @interfaceName PipelineTaskRepository
 * @description
 * @date 2023/11/20 08:42
 **/
public interface PipelineTaskRepository {

    Long save(PipelineTask task);



}
