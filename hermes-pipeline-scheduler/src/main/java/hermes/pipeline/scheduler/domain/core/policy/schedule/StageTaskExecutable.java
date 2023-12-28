package hermes.pipeline.scheduler.domain.core.policy.schedule;

/**
 * @author 7Achilles
 **/
public interface StageTaskExecutable<T> {

    void execute(T t);
}
