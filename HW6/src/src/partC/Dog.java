package src.partC;

public class Dog extends Pet implements Boardable{
    private String size;
    private String boardingStart;
    private String boardingEnd;

    public Dog(String name, String ownerName, String color, String size){
        super(name, ownerName, color);
        this.size = size;
    }

    public String getSize(){
        return size;
    }
    public String toString(){
        return "DOG:" + "\n" + getPetName() + " owned by " + getOwnerName() + "\n"
                + "Color: " + getColor() + "\n" + "Sex: " + getSex() + "\n"
                + "Size: " + getSize();
    }

    @Override
    public void setBoardStart(int month, int day, int year) {
        this.boardingStart = "";
        this.boardingStart += month > 9? "" : "0";
        this.boardingStart += Integer.toString(month);
        this.boardingStart += day > 9? "" : "0";
        this.boardingStart += Integer.toString(day);
        this.boardingStart += Integer.toString(year);
    }

    @Override
    public void setBoardEnd(int month, int day, int year) {
        this.boardingEnd = "";
        this.boardingEnd += month > 9? "" : "0";
        this.boardingEnd += Integer.toString(month);
        this.boardingEnd += day > 9? "" : "0";
        this.boardingEnd += Integer.toString(day);
        this.boardingEnd += Integer.toString(year);
    }

    @Override
    public boolean boarding(int month, int day, int year) {
        if(year > Integer.parseInt(this.boardingStart.substring(4, 8))
                && (year < Integer.parseInt(this.boardingEnd.substring(4, 8)))){
            return true;
        }
        else if(year == Integer.parseInt(this.boardingStart.substring(4, 8))){
            if(month > Integer.parseInt(this.boardingStart.substring(0, 2))){
                return true;
            }
            else if(month == Integer.parseInt(this.boardingStart.substring(0, 2))
                    && day >= Integer.parseInt(this.boardingStart.substring(2, 4))){
                return true;
            }
            else
                return false;
        }
        else if(year == Integer.parseInt(this.boardingEnd.substring(4, 8))){
            if(month < Integer.parseInt(this.boardingEnd.substring(0, 2))){
                return true;
            }
            else if(month == Integer.parseInt(this.boardingEnd.substring(0, 2))
                    && day <= Integer.parseInt(this.boardingEnd.substring(2, 4))){
                return true;
            }
            else{
                return false;
            }
        }
        else return false;
    }
}
