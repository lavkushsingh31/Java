package com.lavkush.SimpleInterest;

import java.math.BigDecimal;

public class SimpleInterestCalculator {
	
	BigDecimal principal, interest, numOfYears;
	
	SimpleInterestCalculator(BigDecimal principal, BigDecimal interest) {
		this.principal = principal;
		this.interest = interest.divide(new BigDecimal("100"));
	}
	
	public BigDecimal calculateTotalValue(BigDecimal numOfYears )
	{
		this.numOfYears = numOfYears;
		BigDecimal SI = principal.multiply(interest).multiply(numOfYears);
		return SI.add(principal);
	}
}
