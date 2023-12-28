package hermes.pipeline.service.domain.valueObject;

/**
 * @author 7Achilles
 * @version V1.17.0
 * @className PipelineTaskEnum
 * @description
 * @date 2023/11/17 17:04
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
