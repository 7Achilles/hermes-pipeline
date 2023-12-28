package hermes.pipeline.service.domain.repository;

import hermes.pipeline.service.domain.aggregate.Pipeline;

/**
 * @author 7Achilles
 * @version V1.17.0
 * @interfaceName PipelineResposity
 * @description
 * @date 2023/11/17 16:39
 **/
public interface PipelineRepository {

    Long save(Pipeline pipeline);

    Pipeline queryById(Long id);

}
