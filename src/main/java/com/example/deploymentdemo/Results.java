package com.example.deploymentdemo;

public class Results {
    private double calculatedOutput;

    public Results(double input) {
        this.calculatedOutput = input;
    }

    public double getCalculatedOutput() {
        return this.calculatedOutput;
    }

    public void setCalculatedOutput(double input) {
        this.calculatedOutput = input;
    }
}
