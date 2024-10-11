package ice.task.pkg9;


import javax.swing.JOptionPane;

public class Calculator {

    public static void main(String[] args) {
        // Get two numbers from the user
        String num1Str = JOptionPane.showInputDialog("Enter the first number:");
        String num2Str = JOptionPane.showInputDialog("Enter the second number:");

        double num1 = Double.parseDouble(num1Str);
        double num2 = Double.parseDouble(num2Str);
        
        int option;
        
        // Menu loop
        do {
            String menu = """
                          Select an option:
                          1. Addition
                          2. Subtraction
                          3. Division
                          4. Multiplication
                          0. Exit""";
            String optionStr = JOptionPane.showInputDialog(menu);
            option = Integer.parseInt(optionStr);

            switch (option) {

                case 1 -> {
                    double sum = num1 + num2;
                    JOptionPane.showMessageDialog(null, "Result: " + sum);
                }
                case 2 -> {
                    double difference = num1 - num2;
                    JOptionPane.showMessageDialog(null, "Result: " + difference);
                }
                case 3 -> {
                    if (num2 != 0) {
                        double quotient = num1 / num2;
                        JOptionPane.showMessageDialog(null, "Result: " + quotient);
                    } else {
                        JOptionPane.showMessageDialog(null, "Error: Division by zero!");
                    }
                }
                case 4 -> {
                    double product = num1 * num2;
                    JOptionPane.showMessageDialog(null, "Result: " + product);
                }
                case 0 -> JOptionPane.showMessageDialog(null, "Exiting the calculator.");
                default -> JOptionPane.showMessageDialog(null, "Calculation not recognized.");
            }
        } while (option != 0);
    }
}
