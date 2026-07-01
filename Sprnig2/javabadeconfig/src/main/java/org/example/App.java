package org.example;


import org.example.config.MyConfig;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

/**
 * Hello world!
 *
 */
public class App {

    public static void main(String[] args) {
        System.out.println("Hello World!");

        ApplicationContext context = new AnnotationConfigApplicationContext(MyConfig.class);
        Student st =(Student) context.getBean("student");

       System.out.println(st.getRollno());
        st.WriteExam();

    }
}