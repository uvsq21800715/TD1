public class Fraction{
    private int numerat, denomin;
    private double result;

    public Fraction(int num, int denom){
        this.numerat = num;
        this.denomin = denom;
        this.result = (double)(num/denom);
    }
    public String toString(){
        String a = (numerat + " / " + denomin + " = " + result);
        return a;
    }
}

