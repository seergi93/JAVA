/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bowling;

/**
 *
 * @author Sergi
 */
public class ScoreCard {

    private String scoreCard = "";
    private int totalScore = 0;
    private String simbols = "-123456789X/";
    private int aux = 0;
    private int multiply = 0;
    private boolean firstShoot = true;

    public boolean isFirstShoot() {
        return firstShoot;
    }

    public void setFirstShoot(boolean firstShoot) {
        this.firstShoot = firstShoot;
    }

    public int getAux() {
        return aux;
    }

    public void setAux(int aux) {
        this.aux = aux;
    }

    public int getMultiply() {
        return multiply;
    }

    public void setMultiply(int multiply) {
        this.multiply += multiply;
    }


    /*Constructor ScoreCard*/
    public ScoreCard(String scoreCard) {
        this.scoreCard = scoreCard;
    }

    /*Getter Setters*/
    public void setTotalScore(int totalScore) {
        this.totalScore += totalScore;
    }

    public int getTotalScore() {
        return this.totalScore;
    }

    public String getScoreCard() {
        return this.scoreCard;
    }

    public void roll(char pin) {

        //FIRST SHOOT   
        if (getSimbolValue(pin) != 10 && isFirstShoot()) {
            setAux(getSimbolValue(pin));
            setFirstShoot(false);

        } else if (isFirstShoot()) {
            setTotalScore(10);
            setMultiply(2);
        } // SECOND SHOOT
        else {
            if (getSimbolValue(pin) != 11) {

                setTotalScore(getAux() + getSimbolValue(pin));

            } else {

                setTotalScore(10);
                setMultiply(1);
            }

        }

        for (getMultiply(); getMultiply() > 0; setMultiply(-1)) {
            setTotalScore(getAux());
            setAux(getSimbolValue(pin));

        }
        
        setAux(0);
    }

//        //FIRST SHOOT   
//        if (getSimbolValue(pin) != 10 && isFirstShoot()) {
//            setAux(getSimbolValue(pin));
//            setFirstShoot(false);
//
//        } else if (isFirstShoot()) {
//            setTotalScore(10);
//            setMultiply(2);
//        } 
//            // SECOND SHOOT
//        else {
//            if (getSimbolValue(pin) != 11) {
//
//                if (getMultiply() == 0) {
//                    setTotalScore(getAux() + getSimbolValue(pin));
//
//                } else {
//                    setTotalScore((getAux() + getSimbolValue(pin)) * 2);
//                    setMultiply(-1);
//
//                }
//                setAux(0);
//                setFirstShoot(true);
//
//            } else {
//                setTotalScore(10);
//                setMultiply(1);
//                setAux(0);
//                setFirstShoot(true);
//
//            }
//
//        }
//        
//        if(getMultiply()!=0){
//            get
//        }
//        
    public String getSimbols() {
        return simbols;
    }

    public int getSimbolValue(char symbol) {
        int simbolValue = 0;
        for (int i = 0; i < getSimbols().length(); i++) {
            if (symbol == getSimbols().charAt(i)) {
                simbolValue = i;

            }
        }

        return simbolValue;
    }

    private void ifSpare() {

    }

    public void calculateScore() {
        for (int i = 0; i < getScoreCard().length(); i++) {
            char pin = getScoreCard().charAt(i);
            roll(pin);
        }
    }

}
