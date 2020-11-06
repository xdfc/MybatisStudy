package Mybatis_hello.entity;

public class User {
    private int id;
    private String mingzi;
    private int password;

/*    public void setName(String name) {
        this.name = name;
    }*/

    public void setId(int id) {
        this.id = id;
    }

/*    public String getName() {
        return name;
    }*/

    public int getId() {
        return id;
    }


    @Override
    public String toString() {
        return "[id="+id+",name="+mingzi+",pwd="+password+"]";
    }

    public int getPassword() {
        return password;
    }

    public void setPassword(int password) {
        this.password = password;
    }

    public String getMingzi() {
        return mingzi;
    }

    public void setMingzi(String mingzi) {
        this.mingzi = mingzi;
    }
}
