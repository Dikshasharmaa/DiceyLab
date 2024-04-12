public class Simulation {
    private int numberOfDices;
    private int numberOfToss;
    Dice dice = new Dice();
    Bins results;

    public Simulation(int numberOfDices, int numberOfToss) {
        this.results = new Bins(numberOfDices);
        this.numberOfDices = numberOfDices;
        this.numberOfToss = numberOfToss;
    }
    public void runSimulation(){
        int total =0;
        for(int i =0;i<numberOfToss;i++){
            total = dice.diceSum(numberOfDices);
            results.incrementBin(total);
        }
    }

    public void printResults(){
        for(int i =numberOfDices;i<=numberOfDices*6;i++){
            double Percentage = results.getBin(i)/numberOfToss;
            System.out.printf("%2d: %7d: %8.2f",i,results.getBin(i),Percentage);
        }
    }


}
