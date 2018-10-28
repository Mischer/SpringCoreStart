package com.springcorestart.impls.robot;

import com.springcorestart.interfaces.*;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public abstract class BaseModel implements Robot {

    private Body body;
    private Head head;
    private Hand hand;
    private Leg leg;

    public BaseModel() {
    }

    public BaseModel(Body body, Head head, Hand hand, Leg leg) {
        this.body = body;
        this.head = head;
        this.hand = hand;
        this.leg = leg;
    }
}
