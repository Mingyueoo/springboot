package com.ming.boot;

import com.ming.boot.bean.Cat;
import com.ming.boot.bean.User;
import com.ming.boot.config.MyConfig;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;

@SpringBootApplication
public class Boot302DemoApplication {

    public static void main(String[] args) {
        //返回IOC容器

        ConfigurableApplicationContext run = SpringApplication.run(Boot302DemoApplication.class, args);
        //查看容器里面的组件
        String[] names = run.getBeanDefinitionNames();
        for (String name : names) {
            System.out.println(name);
        }
        //从容器中获取组件

//        Cat tom = run.getBean("tom", Cat.class);
//        Cat tom1 = run.getBean("tom", Cat.class);
//
//        System.out.println("component: "+(tom==tom1));
//
//        MyConfig bean = run.getBean(MyConfig.class);
//        System.out.println(bean);
//
//        //调用这个方法Return new User
//        User user = bean.user01();
//        User user01 = bean.user01();
//        System.out.println("==========================================");
//        String[] beanNamesForType = run.getBeanNamesForType(User.class);
//        for (String s : beanNamesForType) {
//            System.out.println(s);
//        }
        boolean tom = run.containsBean("tom");
        System.out.println("容器中Tom组件：" +tom);

        boolean user01 = run.containsBean("user01");
        System.out.println("容器中User组件： "+ user01);

        boolean tom22 = run.containsBean("tom22");
        System.out.println("容器中Tom22组件：" +tom22);


    }


}
