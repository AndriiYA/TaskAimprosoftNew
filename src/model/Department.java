package model;

import java.util.List;

public class Department {

    private int id;
    private String name;
    private List<Employce> employceList;

    public int getId (){
        return id;
    }
    public void setId(){
        this.id = id;
    }
    public String getName(){
        return name;
    }
    public void setName(){
       this.name = name;
    }

    public List<Employce> getEmployeeList() {
        return employceList;
    }

    public void setEmployeeList(List<Employce> employeeList) {
        this.employceList = employeeList;
    }

    public String toString() {
        return "Department{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", employeeList=" + employceList +
                '}';
    }
}
