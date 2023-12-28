package hermes.pipeline.common.valueObject;

/**
 * @author 7Achilles
 **/
public enum PipelineTaskJobType {

    DOCKER_BUILD("DOCKER-BUILD-JOB"),
    MAVEN_BUILD("MAVEN-BUILD-JOB"),
    SPRINGBOOT_DEPLOY("SPRINGBOOT_DEPLOY");

    private String type;

    PipelineTaskJobType(String type) {
        this.type = type;
    }

    public String getType() {
        return this.type;
    }
}
