package com.example.temperatureconverter;

public class ConverterClass {
    public double c2f_fn(double celsius) {
        return (celsius*1.8)+32;
    }

    public double f2c_fn(double fahrenheit) {
        return (fahrenheit-32)/1.0;
    }
}
