package hermes.pipeline.scheduler.domain.event.policy.express;

/**
 * @author 7Achilles
 **/
public interface PipelineTaskParser<T> {

    T express(String spec);

}
