package hermes.pipeline.scheduler.application.command.impl;

import hermes.pipeline.common.dto.PipelineTaskDTO;
import hermes.pipeline.scheduler.application.command.PipelineTaskService;
import hermes.pipeline.scheduler.domain.aggregate.PipelineTask;
import hermes.pipeline.scheduler.domain.core.policy.express.PipelineTaskParser;
import hermes.pipeline.scheduler.domain.core.policy.schedule.PipelineTaskExecutable;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;

/**
 * @author 7Achilles
 **/
@Service
public class DefaultPipelineTaskServiceImpl implements PipelineTaskService {

    @Resource
    private PipelineTaskParser<PipelineTaskDTO> parser;

    @Resource
    private PipelineTaskExecutable pipelineTaskExecutor;

    @Override
    public void schedule(String spec) {

        PipelineTaskDTO taskDTO = parser.express(spec);

        // transform
        PipelineTask task = new PipelineTask();

        task.run(pipelineTaskExecutor);

    }

}
