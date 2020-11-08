package Mybatis_manytoone.entity;

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

    public String getName() {
        return name;
    }

    public int getId() {
        return id;
    }


    @Override
    public String toString() {
        return "[id="+id+",name="+name+",pwd="+pwd+"]";
    }

}
