package hermes.pipeline.scheduler.application.command.mq;

import hermes.pipeline.scheduler.domain.event.policy.schedule.PipelineTaskScheduleExecutor;
import org.apache.rocketmq.spring.annotation.RocketMQMessageListener;
import org.apache.rocketmq.spring.core.RocketMQListener;
import org.springframework.stereotype.Component;

import javax.annotation.Resource;


/**
 * @author 7Achilles
 **/
@Component
//todo consumerGroup
@RocketMQMessageListener(topic = "PIPELINE_TASK",consumerGroup = "test1")
public class MQPipelineTaskConsumerService implements RocketMQListener<String> {

    @Resource
    private PipelineTaskScheduleExecutor executor;

    @Override
    public void onMessage(String s) {
        executor.schedule(s);
    }


}
