package hermes.pipeline.service.domain;

import lombok.Data;

import java.util.List;

/**
 * @author 7Achilles
 * @version V1.17.0
 * @className Stage
 * @description
 * @date 2023/11/17 16:00
 **/
@Data
public class Stage {

    private Long id;

    private List<Job> jobs;

}
