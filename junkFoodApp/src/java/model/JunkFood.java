
package model;

public class JunkFood {
    
    private int junkFoodID;
    private String junkFoodName;
    private String junkFoodType;
    private int calories;
    private int junkFoodRank;
    
     public JunkFood() {
        this.junkFoodID = 0;
        this.junkFoodName = "";
        this.junkFoodType = "";
        this.calories = 0;
        this.junkFoodRank = 0;
    }

    public JunkFood(int junkFoodID, String junkFoodName, String junkFoodType, int calories, int junkFoodRank) {
        this.junkFoodID = junkFoodID;
        this.junkFoodName = junkFoodName;
        this.junkFoodType = junkFoodType;
        this.calories = calories;
        this.junkFoodRank = junkFoodRank;
    }
    
    
}
