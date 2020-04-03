package com.selenium.express;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;

public class Human {
    @Autowired
    @Qualifier("heart")
    public Heart heart;
    public void startPumping()
    {
        if(heart != null)
        {
            heart.pumping();
        }
        else
        {
            System.out.println("You are dead");
        }
    }

}
