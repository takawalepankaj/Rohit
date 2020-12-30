package com.jpm.cib.utils;

public class common {

    public static void waitForSpecifiedTime(int seconds) {
        try {
            Thread.sleep(seconds * 1000);
        } catch (InterruptedException e) {


            e.printStackTrace();
        }
    }

}
