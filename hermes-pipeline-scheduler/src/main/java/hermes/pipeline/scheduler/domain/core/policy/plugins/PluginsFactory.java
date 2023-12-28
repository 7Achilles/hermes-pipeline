package hermes.pipeline.scheduler.domain.event.policy.plugins;


import hermes.pipeline.common.valueObject.PipelineTaskJobType;
import hermes.pipeline.scheduler.domain.event.policy.plugins.impl.BasePlugin;
import hermes.pipeline.scheduler.domain.event.policy.plugins.impl.DockerBuildPlugin;

import java.util.Map;
import java.util.Optional;
import java.util.concurrent.ConcurrentHashMap;


/**
 * @author 7Achilles
 **/
public class PluginsFactory {

    private static Map<PipelineTaskJobType, BasePlugin> config = new ConcurrentHashMap<PipelineTaskJobType, BasePlugin>() {{
        put(PipelineTaskJobType.DOCKER_BUILD, new DockerBuildPlugin());
    }};

    public static BasePlugin getPlugin(PipelineTaskJobType type) {
        if(!Optional.ofNullable(type).isPresent() || config.containsKey(type)) throw new RuntimeException("job task type in unknown");
        return config.get(type);
    }
}
