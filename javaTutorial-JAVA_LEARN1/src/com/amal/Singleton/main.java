package com.amal.Singleton;

public class main {

    public static void main(String[] args) {

        doJobSeparate drink =new doJobSeparate();
        doJobSeparate sleep =new doJobSeparate();

        System.out.println(drink.hashCode());
        System.out.println(sleep.hashCode());

        doOtherJob run = doOtherJob.getInsDoOtherJob();
        doOtherJob walk =doOtherJob.getInsDoOtherJob();

        System.out.println(run.hashCode());
        System.out.println(walk.hashCode());
    }
}
