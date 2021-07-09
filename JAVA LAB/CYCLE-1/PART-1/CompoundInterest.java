public class CompoundInterest
{
    public static void main(String args[]) 
    {
        float p = 5000, r = 10, t = 3 , n=1; 
        System.out.println("The entered principle amount is = " + p);
        System.out.println("The entered rate is = " + r);
        System.out.println("The entered time period is " + t);
        System.out.println("The entered number of times the interest is compounded is " + n);
        
    	double amount = p * Math.pow(1 + (r / n), n * t);
        double cinterest = amount - p;
        System.out.println("Compound Interest after " + t + " years: "+cinterest);
        System.out.println("Amount after " + t + " years: "+amount);
    }
}