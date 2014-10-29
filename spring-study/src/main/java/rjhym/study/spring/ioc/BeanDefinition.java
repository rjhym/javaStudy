package rjhym.study.spring.ioc;

/**
 * Created by hym on 14-10-29.
 */
public class BeanDefinition {
    private Object bean;

    public BeanDefinition(Object bean) {
        this.bean = bean;
    }

    public Object getBean() {
        return bean;
    }
}
