package hermes.pipeline.service.domain.util;

import org.springframework.beans.BeansException;
import org.springframework.context.ApplicationContext;
import org.springframework.context.ApplicationContextAware;
import org.springframework.stereotype.Component;

/**
 * @author 7Achilles
 **/
@Component
public class SpringBeanUtil implements ApplicationContextAware {

    private static ApplicationContext applicationContext;

    @Override
    public void setApplicationContext(ApplicationContext applicationContext) throws BeansException {
        SpringBeanUtil.applicationContext = applicationContext;
    }

    public static Object getBean(String name) {
        return SpringBeanUtil.applicationContext.getBean(name);
    }

    public static<T> T getBean(Class<T> clazz){
        return SpringBeanUtil.applicationContext.getBean(clazz);
    }
}
