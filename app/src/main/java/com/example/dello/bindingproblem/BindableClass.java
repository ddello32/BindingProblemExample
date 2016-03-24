package com.example.dello.bindingproblem;

/**
 * Created by dello on 24/03/16.
 */
public class BindableClass {
    private String string;

    public BindableClass(String string){
        this.string = string;
    }

    public void setString(String string){
        this.string = string;
    }

    public String getString(){
        return string;
    }
}
