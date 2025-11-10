package com.jenkins.test;

/**
 * Main application class for Jenkins Maven Test
 */
public class App {
    
    public static void main(String[] args) {
        System.out.println("Hello from Jenkins Maven Test Project!");
        
        Calculator calc = new Calculator();
        int result = calc.add(5, 3);
        System.out.println("5 + 3 = " + result);
        
        result = calc.multiply(4, 6);
        System.out.println("4 * 6 = " + result);
        
        System.out.println("Application executed successfully!");
    }
}
