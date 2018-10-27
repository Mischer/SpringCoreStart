package com.springcorestart.Impls.Robot;

import com.springcorestart.Interfaces.Hand;
import com.springcorestart.Interfaces.Head;
import com.springcorestart.Interfaces.Leg;
import com.springcorestart.Interfaces.Robot;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class ModelT1000 implements Robot {

    private Head head;
    private Hand hand;
    private Leg leg;

    private String color;
    private int year;
    private boolean soundEnable;

    public ModelT1000() {
    }

    public ModelT1000(Head head, Hand hand, Leg leg) {
        this.head = head;
        this.hand = hand;
        this.leg = leg;
    }

    public ModelT1000(String color, int year, boolean soundEnable) {
        this.color = color;
        this.year = year;
        this.soundEnable = soundEnable;
    }

    public ModelT1000(Head head, Hand hand, Leg leg, String color, int year, boolean soundEnable) {
        this.head = head;
        this.hand = hand;
        this.leg = leg;
        this.color = color;
        this.year = year;
        this.soundEnable = soundEnable;
    }

    public void action() {
        head.think();
        hand.catchSomething();
        leg.go();

        System.out.println("Color is " + color);
        System.out.println("Year is " + year);
        System.out.println("Can play sound " + soundEnable);
    }

    public void dance() {
        System.out.println("T1000 is dancing!");
    }

}