package com.bridgelabzz;



public class Amstrong {

	public double check(double n) {
        int count = 0;
        double temp = n; // Store the original number in a temporary variable
        while (temp != 0) { // Use the temporary variable in the loop condition
            double lastdigit = temp % 10;
            count++;
            temp = temp / 10; // Update the temporary variable
        }
        System.out.println("Number of digits: " + count);
        
        double armstrong = 0; // Correct the variable name to 'armstrong'
        temp = n; // Reset the temporary variable to the original number
        while (temp != 0) { // Use the temporary variable in the loop condition
            double lastdigit = temp % 10;
            temp = temp / 10;
            armstrong = armstrong + Math.pow(lastdigit, count); // Use 'lastdigit' for the power calculation
        }
        return armstrong;
    }

    public static void main(String args[]) {
        double number = 153;
        Armstrong obj = new Armstrong(); // Correct the class name to 'Armstrong'
        double armnumber = obj.check(number);
        
        // Use a small tolerance value to compare doubles
        if (Math.abs(armnumber - number) < 0.0001) {
            System.out.println("Armstrong number");
        } else {
            System.out.println("Not Armstrong");
        }
    }
}

