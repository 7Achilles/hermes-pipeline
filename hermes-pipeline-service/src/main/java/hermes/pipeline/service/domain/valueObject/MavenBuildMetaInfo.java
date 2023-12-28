package hermes.pipeline.service.domain.valueObject;

import lombok.Data;

/**
 * @author 7Achilles
 **/
@Data
public class MavenBuildMetaInfo {

    private String sourcePath;

    private String spec;

    private String name;

    private String version;

}
