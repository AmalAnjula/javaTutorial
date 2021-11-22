package com.amal.singleton;

public class doOtherJob {
   // private static  doOtherJob insDoOtherJob= new doOtherJob(); // static
    private static  doOtherJob insDoOtherJob; // lazy
    private doOtherJob(){  // default constructor
    }
    public static doOtherJob getInsDoOtherJob(){
    if(insDoOtherJob==null){  // no need in static
        insDoOtherJob= new doOtherJob();
    }
        return  insDoOtherJob;
    }

}
