public class Student {
    private String name;
    private int ID;

    Student(String Name, int id) {
        this.name = Name;
        this.ID = id;
    }
    public String getName(){
        return this.name;
    }
    public int getID(){
        return this.ID;
    }

    public void setName(String name1) {
        this.name = name1;
    }

    public void setID(int id) {
        this.ID = id;
    }
}