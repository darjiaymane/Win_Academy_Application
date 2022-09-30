package UML_Classes;

public class Role {
    protected int id;
    protected String name;

    /*
    @Create setters functions for the class role
     */
    public int getId(){
        int id;
        id = this.id;
        return id;
    }

    public String getName(){
        String name;
        name = this.name;
        return name;
    }

    /*
    @Create setters functions for the class role
     */
    public void setId(int id){
        this.id = id;
    }
    public void setName(String name){
        this.name = name;
    }
}
