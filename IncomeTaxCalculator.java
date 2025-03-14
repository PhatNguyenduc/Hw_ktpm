public class IncomeTaxCalculator {
    public static double caculateNetIncome(int age, double salary) {
        // Your code here
        if(age < 14 || age > 60){
            throw new IllegalArgumentException("Tuổi không nằm trong phạm vi tính thuế");
        }
        if(salary < 0){
            throw new IllegalArgumentException("Lương không hợp lệ");
        }
        double tax = 0;
        
        if(salary >= 30000000){
            tax = 0.2;
        }
        else if(salary >= 15000000){
            tax = 0.1; 
        }
        else if(salary >= 5000000){
            tax = 0.05;
        }
        if(age >= 60) {
            tax *= 0.5;
        }
        return salary - tax * salary;
    }
    public static void main(String[] args) {
        System.out.println(caculateNetIncome(20, 10000000));
        System.out.println(caculateNetIncome(10, 20000000));
    }
}