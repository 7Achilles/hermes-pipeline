package hermes.pipeline.service.domain;

import hermes.pipeline.service.domain.repository.PipelineRepository;
import lombok.Data;

/**
 * @author 7Achilles
 * @version V1.17.0
 * @className Pipeline
 * @description
 * @date 2023/11/17 15:44
 **/

@Data
public class Pipeline {

    private Long id;

    private Stage root;

    public Long save(){

        // bean
        PipelineRepository pipelineRepository = null;

        return pipelineRepository.save(this);
    }

    public Long execute(){

        // check

        // write record into mysql


    }



}
