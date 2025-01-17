/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package supermarket;

/**
 *
 * @author OOI ZHENG YUE
 */
public class Register {
    private int id;
    private String fullname,username,password,type;

    public Register(int id, String fullname, String username, String password, String type){
        
        this.id=id;
        this.fullname=fullname;
        this.username=username;
        this.password=password;
        this.type=type;
        
    }
    public int getid(){
        return id;
    }
    public String getfullname(){
        return fullname;
    }
    public String getusername(){
        return username;
    }
    public String getpassword(){
        return password;
    }
    public String gettype(){
        return type;
    }
}
