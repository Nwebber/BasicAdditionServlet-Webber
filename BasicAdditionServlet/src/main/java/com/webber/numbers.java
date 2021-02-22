package com.webber;

import java.math.BigDecimal;

/**
 *
 * @author Dorchek
 */
public class numbers {
    private String result;
    private BigDecimal firstNumber;
    private BigDecimal secondNumber;
    
    public String getResult() {
        return result;
    }
    
    public void setResult(String result) {
        result = firstNumber.add(secondNumber).toString();
    }
    
    public String getFirstNumber() {
        return firstNumber.toString();
    }
    
    public void setFirstNumber(String firstNumber) {
        this.firstNumber = new BigDecimal(firstNumber);
    }
    
    public String getSecondNumber() {
        return secondNumber.toString();
    }
    
    public void setSecondNumber(String secondNumber) {
        this.secondNumber = new BigDecimal(secondNumber);
    }
}
