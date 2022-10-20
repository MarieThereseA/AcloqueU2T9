public class LuckyNumbers{
    public LuckyNumbers() {}

    public int randomIntegerBetween(int min, int max) {
        return (int)(Math.random() * (max - min) + 1) + min;
    }

    public String getLuckyNumbers() {
        String numbers = "Your luck numbers are: " + randomIntegerBetween(1,56) + "," + randomIntegerBetween(1,56) + "," + randomIntegerBetween(1,56) + "," + randomIntegerBetween(1,56) + "," + randomIntegerBetween(1,56);
        numbers += "\nThe super ball is: " + randomIntegerBetween(1,30);
        return numbers;
    }
}


