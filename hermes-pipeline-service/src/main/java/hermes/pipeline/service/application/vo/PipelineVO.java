package hermes.pipeline.service.application.vo;

import lombok.Data;

/**
 * @author 7Achilles
 * @version V1.17.0
 * @className PipelineVO
 * @description
 * @date 2023/11/17 16:14
 **/
@Data
public class PipelineVO {

    private Long id;

    private StageVO root;


}
