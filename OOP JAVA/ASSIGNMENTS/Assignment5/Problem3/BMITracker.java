package com.in.IR;

public class BMITracker {
    private double weight;
    private double height;
    private double bmi;

    // Constructor
    public BMITracker(double weight, double height) {
        this.weight = weight;
        this.height = height;
        calculateBMI();
    }

    public double getWeight() {
        return weight;
    }

    public void setWeight(double weight) {
        this.weight = weight;
        calculateBMI();  // Recalculate BMI when weight is updated
    }

    public double getHeight() {
        return height;
    }

    public void setHeight(double height) {
        this.height = height;
        calculateBMI();  // Recalculate BMI when height is updated
    }

    public double getBMI() {
        return bmi;
    }

    private void calculateBMI() {
        if (height > 0) {
            this.bmi = weight / (height * height);
        }
    }

    public String classifyBMI() {
        if (bmi < 18.5) {
            return "Underweight";
        } else if (bmi < 24.9) {
            return "Normal weight";
        } else if (bmi < 29.9) {
            return "Overweight";
        } else {
            return "Obese";
        }
    }

    @Override
    public String toString() {
        return String.format("BMI: %.2f\n%s", bmi, classifyBMI());
    }
}

