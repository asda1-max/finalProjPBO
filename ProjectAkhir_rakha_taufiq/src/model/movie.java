/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package model;

/**
 *
 * @author A Z E R O T H
 */
public class movie {
    private Integer movie_id, movie_duration;
    private String movie_name, movie_description, movie_schedule;
    
    public void setData(int id, String nama, String desc, String schedule, int dura){
        this.movie_id = id;
        this.movie_duration = dura;
        this.movie_name = nama;
        this.movie_description = desc;
        this.movie_schedule = schedule;
    }
    
    public Integer getid(){
        return movie_id;
    }
    public Integer getduration(){
        return movie_duration;
    }
    public String getname(){
        return movie_name;
    }
    public String getdescription(){
        return movie_description;
    }
    public String getSchedule(){
        return movie_schedule;
    }
}
