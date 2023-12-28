package hermes.pipeline.scheduler.domain.aggregate;

import hermes.pipeline.common.valueObject.PipelineTaskStatusEnum;
import hermes.pipeline.scheduler.domain.core.policy.schedule.PipelineTaskExecutable;
import lombok.Data;
import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

/**
 * @author 7Achilles
 **/
@Data
public class PipelineTask {

    private Long id;

    private PipelineTaskStatusEnum status;
    private StageTask root;

    private Boolean success;

    private Throwable throwable;

    public List<StageTask> makeStagesList() {

        List<StageTask> stages = new ArrayList<>();

        StageTask node = root;
        while (Optional.ofNullable(node).isPresent()) {
            stages.add(node);
            node = node.getNext();
        }
        return stages;
    }

    public void run(PipelineTaskExecutable executor) {
        buildTask();
        executor.execute(this);
    }

    public Boolean checkValid() {

        return true;
    }

    private PipelineTask buildTask() {
        return this;
    }


}
