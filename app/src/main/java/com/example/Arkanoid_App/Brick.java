package com.example.Arkanoid_App;

public class Brick {
    private boolean visible;
    public int row,column,width,height;
    public Brick(int row,int column,int width,int height){
        visible = true;
        this.row = row;
        this.column=column;
        this.width=width;
        this.height=height;
    }
    public  boolean getVisibility(){
        return  visible;
    }
    public void setVisibility(boolean visible){
        this.visible = visible;
    }
}
