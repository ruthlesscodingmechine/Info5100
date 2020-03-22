package src.partA;
import java.util.*;
public class Mreview implements Comparable<Mreview>{
    private String title;
    private ArrayList<Integer> ratings;

    public Mreview(){
        title = "";
        ratings = new ArrayList<Integer>();
    }
    public Mreview(java.lang.String ttl){
        title = ttl;
        ratings = new ArrayList<Integer>();
    }
    public Mreview(java.lang.String ttl, int firstRating){
        title = ttl;
        ratings = new ArrayList<Integer>();
        ratings.add(firstRating);
    }
    public void addRating(int r){
        ratings.add(r);
    }
    public double aveRating(){
        int sum = 0;
        for(int i = 0; i < ratings.size(); i++){
            sum += ratings.get(i);
        }
        return sum / ratings.size();
    }
    @Override
    public int compareTo(Mreview o) {
        return this.title.compareTo(o.title);
    }
    public boolean equals(Object o){
        if((o instanceof Mreview) && this.title.equals((((Mreview) o).title))){
            return true;
        }
        return false;
    }
    public String getTitle(){
        return this.title;
    }
    public int numRatings(){
        return this.ratings.size();
    }
    public String toString(){
        return this.getTitle() + ", " + "average " + this.aveRating() + " out of " + this.numRatings() + " ratings";
    }
}
