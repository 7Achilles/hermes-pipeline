package hermes.pipeline.service.domain.event.policy.impl;

import com.alibaba.fastjson.JSONObject;
import hermes.pipeline.common.dto.PipelineTaskDTO;
import hermes.pipeline.service.domain.event.policy.PipelineTaskEventExecutor;
import hermes.pipeline.service.domain.mq.MQProducer;
import org.springframework.stereotype.Component;
import javax.annotation.Resource;
import java.util.Map;

/**
 * @author 7Achilles
 **/
@Component
public class PipelineTaskStartedEventExecutor implements PipelineTaskEventExecutor {

    @Resource
    private MQProducer mqProducer;

    @Override
    public void execute(PipelineTaskDTO dto, Map<String, Object> param) {
        String topic = (String) param.get("topic");
        mqProducer.send(topic,JSONObject.toJSONString(dto));
    }



}
