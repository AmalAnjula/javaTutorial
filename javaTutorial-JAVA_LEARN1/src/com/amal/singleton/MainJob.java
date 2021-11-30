package com.amal.singleton;

public class MainJob {

    public static void main(String[] args) {
        DoJobSeparate drink = new DoJobSeparate();
        DoJobSeparate sleep = new DoJobSeparate();
        System.out.println(drink.hashCode());
        System.out.println(sleep.hashCode());
        doOtherJob run = doOtherJob.getInsDoOtherJob();
        doOtherJob walk = doOtherJob.getInsDoOtherJob();
        System.out.println(run.hashCode());
        System.out.println(walk.hashCode());
    }
}
