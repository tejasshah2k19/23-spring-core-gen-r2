package com.bean;

public class EmployeeBean {

	Integer salary;
	PolicyBean policyBean;

	// 1500
	// medicalim , ppf , lic ,
	public Integer getSalary() {
		return salary;
	}

	public void setSalary(Integer salary) {
		this.salary = salary;
	}

	public PolicyBean getPolicyBean() {
		return policyBean;
	}

	public void setPolicyBean(PolicyBean policyBean) {
		this.policyBean = policyBean;
	}

}
