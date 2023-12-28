package hermes.pipeline.scheduler.domain.core.policy.express;

/**
 * @author 7Achilles
 **/
public interface PipelineTaskParser<T> {

    T express(String spec);

}
