package hermes.pipeline.common.valueObject;

/**
 * @author 7Achilles
 **/
public enum PipelineTaskStatusEnum {

    START("开启");

    private String state;
    PipelineTaskStatusEnum(String state) {
        this.state = state;
    }

    public String getState() {
        return this.state;
    }
}
