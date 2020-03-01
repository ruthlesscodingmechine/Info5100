package src.partC;

public class Cat extends Pet implements Boardable {
    private String hairLength;
    private String boardingStart;
    private String boardingEnd;
    public Cat(String name, String ownerName, String color, String hairLength){
        super(name, ownerName, color);
        this.hairLength = hairLength;
    }
    public String getHairLength(){
        return hairLength;
    }
    public String toString(){
        return "CAT:" + "\n" + this.getPetName() + " owned by " + getOwnerName() + "\n"
        + "Color: " + this.getColor() + "\n" + "Sex: " + this.getSex() + "\n"
        + "Hair: " + this.getHairLength();
    }

    @Override
    public void setBoardStart(int month, int day, int year) {
        this.boardingStart = "";

        this.boardingStart += (month > 9) ?  "" : "0";
        this.boardingStart += Integer.toString(month);
        this.boardingStart += day > 9? "" : Integer.toString(0);
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

    public boolean boarding(int month, int day, int year){
        if(year > (Integer.parseInt(this.boardingStart.substring(4, 8)))
                && (year < (Integer.parseInt(this.boardingEnd.substring(4, 8))))){
            return true;
        }
        else if(year == Integer.parseInt(this.boardingStart.substring(4, 8))){
            if(month > Integer.parseInt(this.boardingStart.substring(2, 4))){
                return true;
            }
            else if(month == Integer.parseInt(this.boardingStart.substring(2, 4))
                    && day >= Integer.parseInt(this.boardingStart.substring(0, 2))){
                return true;
            }
                return false;
        }
        else if(year == Integer.parseInt(this.boardingEnd.substring(4, 8))){
            if(month < Integer.parseInt(this.boardingEnd.substring(2, 4))){
                return true;
            }
            else if(month == Integer.parseInt(this.boardingEnd.substring(2, 4))
                    && day <= Integer.parseInt(this.boardingEnd.substring(0, 2))){
                return true;
            }
            return false;

    }
        return false;
    }
}
