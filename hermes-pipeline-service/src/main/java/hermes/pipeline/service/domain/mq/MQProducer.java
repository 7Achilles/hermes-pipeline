package hermes.pipeline.service.domain.mq;

/**
 * @author 7Achilles
 **/
public interface MQProducer {

    void send(String topic,String msg);

}
