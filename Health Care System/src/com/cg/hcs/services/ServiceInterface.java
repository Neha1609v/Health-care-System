package com.cg.hcs.services;

import java.util.List;

import com.cg.hcs.bean.*;


public interface ServiceInterface {
	public abstract void addCenter(String centerName,List<Test>testArray,List<DiagnosticCenter>centerArray);
	public abstract void removeCenter(String centerId,List<DiagnosticCenter>centerArray);
	public abstract void addTest(String testName,List<Test> testArray);
	public abstract void removeTest(String testId,List<Test> testArray);
	public abstract boolean approveAppointment();
	public abstract void Register(List<User> customer, String password);
}
