package rjhym.study.spring.ioc;

import org.junit.Test;
import rjhym.study.spring.ioc.factory.AutowireCapableBeanFactory;
import rjhym.study.spring.ioc.factory.BeanFactory;

/**
 * Created by hym on 14-10-29.
 */
public class BeanFactoryTest {
    @Test
    public void test() {
        // 1.初始化beanfactory
        BeanFactory beanFactory = new AutowireCapableBeanFactory();

        // 2.注入bean
        BeanDefinition beanDefinition = new BeanDefinition();
        beanDefinition.setBeanClassName("rjhym.study.spring.ioc.HelloWorldService");
        beanFactory.registerBeanDefinition("helloWorldService", beanDefinition);

        // 3.获取bean
        HelloWorldService helloWorldService = (HelloWorldService) beanFactory.getBean("helloWorldService");
        helloWorldService.helloWorld();
    }
}
