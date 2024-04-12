public class Dice {
    public Dice(){

    }
    public int randomNumber(){
        int rand = (int)(Math.random() * 6)+1;
        return rand;
    }
    public Integer diceSum(int numberOfDices){
        int sum=0;
        for(int i =0; i<numberOfDices;i++){
            sum+=randomNumber();
        }
        return sum;
    }

//    Dice dice = new Dice(2); // for craps
//    Dice dice = new Dice(5); // for yatzee
//
//    Integer toss = dice.tossAndSum();

}
