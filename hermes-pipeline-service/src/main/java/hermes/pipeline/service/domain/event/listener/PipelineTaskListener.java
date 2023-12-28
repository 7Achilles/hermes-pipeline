package hermes.pipeline.service.domain.event.listener;

import hermes.pipeline.common.dto.PipelineTaskDTO;
import hermes.pipeline.common.util.SpringBeanUtil;
import hermes.pipeline.common.valueObject.PipelineTaskStatusEnum;
import hermes.pipeline.service.domain.event.PipelineTaskEvent;
import hermes.pipeline.service.domain.event.policy.PipelineTaskEventExecutor;
import hermes.pipeline.service.domain.event.policy.impl.PipelineTaskStartedEventExecutor;
import org.springframework.context.ApplicationListener;
import org.springframework.stereotype.Component;

import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

import static hermes.pipeline.common.valueObject.PipelineTaskStatusEnum.START;


/**
 * @author 7Achilles
 **/
@Component
public class PipelineTaskListener implements ApplicationListener<PipelineTaskEvent> {

    Map<PipelineTaskStatusEnum, PipelineTaskEventExecutor> config = new ConcurrentHashMap<PipelineTaskStatusEnum, PipelineTaskEventExecutor>() {{
        put(START, SpringBeanUtil.getBean(PipelineTaskStartedEventExecutor.class));
    }};

    @Override
    public void onApplicationEvent(PipelineTaskEvent event) {
        PipelineTaskDTO dto = event.getPipelineTaskDTO();
        Map<String, Object> context = event.getContext();
        config.get(dto.getStatus()).execute(dto, context);
    }


}
