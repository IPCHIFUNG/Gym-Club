package com.zifung.gymclub.list;

public class RecyclerList {
    private String Name;  // course name
    private String Time;  // course time

    public RecyclerList(){

    }
    public RecyclerList(String name,String time){
        this.Name=name;
        this.Time=time;
    }
    public String getName(){
        return Name;
    }
    public String getTime(){
        return Time;
    }
}
