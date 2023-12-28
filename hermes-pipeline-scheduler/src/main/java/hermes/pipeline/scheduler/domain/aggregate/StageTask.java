package hermes.pipeline.scheduler.domain.aggregate;

import hermes.pipeline.common.util.SpringBeanUtil;
import hermes.pipeline.scheduler.domain.core.policy.schedule.StageTaskExecutable;
import hermes.pipeline.scheduler.domain.core.policy.schedule.impl.ParallelStageTaskExecutor;
import hermes.pipeline.scheduler.domain.core.policy.schedule.impl.SerialStageTaskExecutor;
import hermes.pipeline.scheduler.domain.entity.JobTask;
import lombok.Data;
import java.util.List;


/**
 * @author 7Achilles
 **/
@Data
public class StageTask {

    private Long id;

    private StageTask pre;

    private StageTask next;

    private Boolean parallel;

    private List<JobTask> jobTasks;

    private Boolean success;

    public void execute() {
        StageTaskExecutable<StageTask> executor = parallel ? SpringBeanUtil.getBean(ParallelStageTaskExecutor.class) : SpringBeanUtil.getBean(SerialStageTaskExecutor.class);
        executor.execute(this);
    }


    public void check() {

    }


}
