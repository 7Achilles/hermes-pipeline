package hermes.pipeline.scheduler.application.command.mq;

import hermes.pipeline.scheduler.application.command.PipelineTaskService;
import org.apache.rocketmq.spring.annotation.RocketMQMessageListener;
import org.apache.rocketmq.spring.core.RocketMQListener;
import org.springframework.stereotype.Component;
import javax.annotation.Resource;


/**
 * @author 7Achilles
 **/
@Component
@RocketMQMessageListener(topic = "PIPELINE_TASK",consumerGroup = "test1")
public class MQPipelineTaskConsumer implements RocketMQListener<String> {

    @Resource
    private PipelineTaskService pipelineTaskService;

    @Override
    public void onMessage(String s) {

        pipelineTaskService.schedule(s);

    }


}
