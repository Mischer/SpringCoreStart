package com.springcorestart.Impls.Robot;

import com.springcorestart.Interfaces.Body;
import com.springcorestart.Interfaces.Hand;
import com.springcorestart.Interfaces.Head;
import com.springcorestart.Interfaces.Leg;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class ModelT1000 extends BaseModel {

    private String color;
    private int year;
    private boolean soundEnable;

    public ModelT1000() {
    }

    public ModelT1000(Body body, Head head, Hand hand, Leg leg) {
        super(body, head, hand, leg);
    }

    public ModelT1000(String color, int year, boolean soundEnable) {
        this.color = color;
        this.year = year;
        this.soundEnable = soundEnable;
    }

    public ModelT1000(Body body, Head head, Hand hand, Leg leg, String color, int year, boolean soundEnable) {
        super(body, head, hand, leg);
        this.color = color;
        this.year = year;
        this.soundEnable = soundEnable;
    }

    public void action() {
        getBody().connect();
        getHead().think();
        getHand().catchSomething();
        getLeg().go();

        System.out.println("Color is " + color);
        System.out.println("Year is " + year);
        System.out.println("Can play sound " + soundEnable);
    }

    public void dance() {
        System.out.println("T1000 is dancing!");
    }

    public void initObject() {
        System.out.println("Init");
    }

    public void destroyObject() {
        System.out.println("Destroy");
    }
}