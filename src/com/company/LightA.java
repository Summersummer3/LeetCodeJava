package com.company;

/**
 * Created by summer on 2017/4/5.
 */
public class LightA implements Light {
    public boolean flag;

    LightA(){
        this.flag = false;
    }

    @Override
    public void open() {
        if(!this.flag){
            this.flag = true;
        }
    }

    @Override
    public void cutoff() {
        if(this.flag){
            this.flag = false;
        }
    }
}
