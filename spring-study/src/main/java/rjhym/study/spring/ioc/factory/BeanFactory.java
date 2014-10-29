package rjhym.study.spring.ioc.factory;

import rjhym.study.spring.ioc.BeanDefinition;

import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

/**
 * Created by hym on 14-10-29.
 */
public interface BeanFactory {
    Object getBean(String name);

    void registerBeanDefinition(String name, BeanDefinition beanDefinition);
}
