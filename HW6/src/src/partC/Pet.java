package src.partC;

public class Pet {
    private String name;
    private String ownerName;
    private String color;
    protected int sex;

    public static final int MALE = 1;
    public static final int FEMALE = 2;
    public static final int SPAYED = 3;
    public static final int NEUTERED = 4;

    public Pet(String name, String ownerName, String color){
        this.name = name;
        this.ownerName = ownerName;
        this.color = color;
    }
    public String getPetName(){
        return name;
    }

    public String getOwnerName(){
        return ownerName;
    }
    public String getColor(){
        return color;
    }
    public void setSex(int sexid){
        sex = sexid;
    }

    public String getSex(){
        switch (sex){
            case 1: return "Male";
            case 2: return "Female";
            case 3: return "spayed";
            case 4: return "neutered";
            default: return "this is not a valid sex";
        }
    }

    public String toString(){
        return name + " owned by " + getOwnerName() + "\n"
                + "color: " + getColor() + "\n"
                + "Sex: " + getSex();
    }



}
