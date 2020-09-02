package com.okbo;

public class Test implements   Runnable{

    @Override
    public void run() {
        Test test = new Test();
        new Thread(test).start();
    }
}
