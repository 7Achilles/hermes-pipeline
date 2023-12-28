package hermes.pipeline.service.domain.entity;

import hermes.pipeline.service.domain.valueObject.MavenBuildMetaInfo;
import lombok.Data;

/**
 * @author 7Achilles
 **/
@Data
public class MavenBuildJob extends Job{

    private MavenBuildMetaInfo mavenBuildMetaInfo;

}
