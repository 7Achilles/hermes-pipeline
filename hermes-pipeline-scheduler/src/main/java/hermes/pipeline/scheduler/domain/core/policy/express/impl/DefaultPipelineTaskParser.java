package hermes.pipeline.scheduler.domain.core.policy.express.impl;


import com.alibaba.fastjson.JSONObject;
import hermes.pipeline.common.dto.PipelineTaskDTO;
import hermes.pipeline.scheduler.domain.core.policy.express.PipelineTaskParser;
import org.springframework.stereotype.Service;

/**
 * @author 7Achilles
 **/
@Service
public class DefaultPipelineTaskParser implements PipelineTaskParser<PipelineTaskDTO> {

    @Override
    public PipelineTaskDTO express(String spec) {
        return JSONObject.parseObject(spec, PipelineTaskDTO.class);
    }

}
