package Mybatis_hello.entity;

public class User {
    private int id;
    private String name;
    private int pwd;

    public void setName(String name) {
        this.name = name;
    }

    public void setId(int id) {
        this.id = id;
    }

    public void setPwd(int pwd) {
        this.pwd = pwd;
    }

    public String getName() {
        return name;
    }

    public int getId() {
        return id;
    }

    public int getPwd() {
        return pwd;
    }
}
