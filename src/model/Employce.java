package model;

import java.util.Date;

public class Employce {

    private String name;
    private int id;
    private int age;
    private String email;
    private Date birthday;



    public Employce() {
        this.name = name;
        this.id = id;
        this.age = age;
        this.email = email;
        this.birthday = birthday;
    }
    public Employce(int id, String name, int age, String email, Date birthday){
        this.name = name;
        this.id = id;
        this.age = age;
        this.email = email;
        this.birthday = birthday;
    }

    public String getName(){
       return name;
   }
   public void setName(String name){
       this.name = name;
   }
   public int getId(){
       return id;
   }
   public void setId(int id){
       this.id = id;
   }
    public int getAge(){
       return age;
   }
   public void setAge(int age){
       this.age = age;
   }
   public String getEmail(String employceEmail){
       return email;
   }
   public void setEmail(String email){
        this.email = email;
   }

    public Date getBirthday(java.sql.Date date){
       return birthday;
   }
   public void setBirthday(Date birthday){
       this.birthday = birthday;
   }
    public String toString() {
        return getClass().getSimpleName() + "Employce{" +
                "name='" + name + '\'' +
                ", id=" + id +
                ", age=" + age +
                ", email='" + email + '\'' +
                ", birthday=" + birthday +
                '}';
    }
}


    

