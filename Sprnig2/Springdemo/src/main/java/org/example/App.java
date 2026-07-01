package org.example;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;


/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args ) {
        ApplicationContext context=new ClassPathXmlApplicationContext("Springconfig.xml");
        Student student= (Student) context.getBean("s2");


        student.writeExam();
//        System.out.println(student.getAge()+":"+student.getRollno());
//        student.show();

       // System.out.println( "Hello World!" );

    }
}
