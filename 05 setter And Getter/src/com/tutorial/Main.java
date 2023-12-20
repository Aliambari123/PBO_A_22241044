package com.tutorial;

class User{
    private String username;
    private String password;

    // membuat konstruktor
    User(String username, String password){
        this.username = username;
        this.password = password;
    }

    // method getter
    public String getUsername(){
        return this.username;

        }
        public String getPasword(){
            return this.password;
        }
        public void setPasword(String pasword){
            this.password = pasword;
        }
    }
public class Main {
    public static void main(String[] args) {
        System.out.println("Program JAVA Pertama Saya");
        // instansi objek
        User person_1 = new User("Saitama","123456789");


        // panggil method getter
    System.out.println(person_1.getUsername());
    System.out.println(person_1.getPasword());

    } 
    
}
