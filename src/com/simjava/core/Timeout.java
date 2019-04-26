package com.simjava.core;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Function;

public class Timeout extends Event{

    private Environment environment;
    private List<Function> callBackList;
    private Object value;
    private int delay;
    private boolean ok;


    public Timeout(Environment environment, int delay, Object value){
        this.environment = environment;
        this.callBackList = new ArrayList<>();
        this.value = value;
        this.delay = delay;
        this.ok = true;
        environment.Schedule(this, NORMAL, delay);
    }

}