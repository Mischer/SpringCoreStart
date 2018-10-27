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

    public ModelT1000() {
    }

    public ModelT1000(Head head, Hand hand, Leg leg) {
        this.head = head;
        this.hand = hand;
        this.leg = leg;
    }

    public void action() {
        head.think();
        hand.catchSomething();
        leg.go();
    }

    public void dance() {
        System.out.println("T1000 is dancing!");
    }

}