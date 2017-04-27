package com.bfs;

/**
 * Created by lukman on 4/24/17.
 */
public class Health {
    private static final int INITIAL_VALUE = 30;
    private int value;

    public Health() {
        value = INITIAL_VALUE;
    }

    public int getValue(){
        return value;
    }

    public void decrease(int amount) {
        value -= amount;
    }

    public void increase(int amount) {
        value += amount;
    }
}
