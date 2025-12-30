package com.day16.EncapsulationAssignment;

public class Car {
    private String company_name;
    private String model_name;
    private int year;
    private double mileage;

    public String getCompanyName() { return company_name; }
    public void setCompanyName(String company_name) { this.company_name = company_name; }

    public String getModelName() { return model_name; }
    public void setModelName(String model_name) { this.model_name = model_name; }

    public int getYear() { return year; }
    public void setYear(int year) { this.year = year; }

    public double getMileage() { return mileage; }
}
