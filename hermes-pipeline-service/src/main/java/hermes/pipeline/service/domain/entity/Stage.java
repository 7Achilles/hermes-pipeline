package hermes.pipeline.service.domain.entity;

import lombok.Data;

import java.util.List;

/**
 * @author 7Achilles
 **/
@Data
public class Stage {

    private Long id;

    private List<Job> jobs;

    private Stage pre;

    private Stage next;

}
