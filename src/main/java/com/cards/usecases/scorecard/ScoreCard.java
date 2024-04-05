package com.cards.usecases.scorecard;

public class ScoreCard {
    public Score score;
    
    public String showScore(int points, Enum type){
        double scorePoints= score.calculateScore( points,  type);
        String result = String.format("Score calculate  %d",scorePoints);
        System.out.println(result);
        return  result;
    }
}
