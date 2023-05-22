package com.spring.memberpolicy.vo;

import java.util.Date;

public class PlanVO {

	private String planId;
	private String planValue;
	private Date monthly_due_date;
	private String tenure;
	
	public String getPlanId() {
		return planId;
	}
	public String getPlanValue() {
		return planValue;
	}
	public Date getMonthly_due_date() {
		return monthly_due_date;
	}
	public String getTenure() {
		return tenure;
	}
	public void setPlanId(String planId) {
		this.planId = planId;
	}
	public void setPlanValue(String planValue) {
		this.planValue = planValue;
	}
	public void setMonthly_due_date(Date monthly_due_date) {
		this.monthly_due_date = monthly_due_date;
	}
	public void setTenure(String tenure) {
		this.tenure = tenure;
	}
	
	
	
}
