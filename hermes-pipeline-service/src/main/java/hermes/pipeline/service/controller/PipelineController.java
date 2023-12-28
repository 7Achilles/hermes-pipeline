package hermes.pipeline.service.controller;

import hermes.pipeline.service.application.command.PipelineApplicationCommand;
import hermes.pipeline.service.application.qo.PipelineQO;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;

/**
 * @author 7Achilles
 **/
@RestController(value = "/pipeline")
public class PipelineController {

    @Resource
    private PipelineApplicationCommand pipelineApplicationCommand;

    @PostMapping(path = "/execute")
    public Long execute(@RequestBody PipelineQO qo) {
        return pipelineApplicationCommand.executePipeline(qo);
    }


}
