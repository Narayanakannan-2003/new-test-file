package org.example;

import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Component;

@Component

public class pencil implements Writer {
   public pencil(){
        System.out.println("pencil constructer is created");
    }
    public void writer(){
        System.out.println("the writer is pencil");
    }
}
