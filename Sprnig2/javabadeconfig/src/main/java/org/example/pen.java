package org.example;

import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Component;

@Component


public class pen implements Writer {
   public  pen(){
        System.out.println("pen construced is created");
    }
   public void writer(){
        System.out.println("the writer is pen");
    }
}
