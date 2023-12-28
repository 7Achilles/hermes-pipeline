package hermes.pipeline.scheduler.domain.entity;

import lombok.Data;

import java.util.List;

/**
 * @author 7Achilles
 **/
@Data
public class Stage {

    private Long id;

    private Stage pre;

    private Stage next;

    private Boolean parallel;

    private List<Job> jobList;

    public 


}
