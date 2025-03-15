public class IncomeTaxCalculator {
    public static double caculateNetIncome(int age, double salary) {
        // Your code here
        if(age < 14 || age > 80){
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
        try {
            System.out.println(IncomeTaxCalculator.caculateNetIncome(-1, 10)); // Error
        } catch (IllegalArgumentException e) {
            System.out.println("Error");
        }

        try {
            System.out.println(IncomeTaxCalculator.caculateNetIncome(20, -1)); // Error
        } catch (IllegalArgumentException e) {
            System.out.println("Error");
        }

        System.out.println(caculateNetIncome(70, 50000000)); // 45,000,000
        System.out.println(caculateNetIncome(30, 50000000)); // 40,000,000
        System.out.println(caculateNetIncome(20, 20000000)); // 18,000,000
        System.out.println(caculateNetIncome(20, 6000000));  // 5,700,000
        System.out.println(caculateNetIncome(20, 3000000));  // 3,000,000
    }
}
