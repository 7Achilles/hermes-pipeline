package hermes.pipeline.scheduler.domain.configuration;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import java.util.concurrent.Executors;
import java.util.concurrent.LinkedBlockingDeque;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;

/**
 * @author 7Achilles
 **/
@Configuration
public class DefaultThreadPool {

    @Bean(name = "defaultThreadPool")
    public ThreadPoolExecutor defaultThreadPool() {
        return new ThreadPoolExecutor(
                200,
                500,
                300,
                TimeUnit.SECONDS,
                new LinkedBlockingDeque<>(100),
                Executors.defaultThreadFactory(),
                new ThreadPoolExecutor.AbortPolicy());
    }


}
