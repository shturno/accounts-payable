package com.algaworks.accountspayable.model;

import com.algaworks.payments.Beneficiary;
import com.algaworks.payments.PayableDocument;

public class Payslip implements PayableDocument {

    private Beneficiary employee;
    private double hourlyRate;
    private int hoursWorked;

    public Payslip(Beneficiary employee, double hourlyRate, int hoursWorked) {
        this.employee = employee;
        this.hourlyRate = hourlyRate;
        this.hoursWorked = hoursWorked;
    }

    public Beneficiary getEmployee() {
        return employee;
    }

    public void setEmployee(Beneficiary employee) {
        this.employee = employee;
    }

    public double getHourlyRate() {
        return hourlyRate;
    }

    public void setHourlyRate(double hourlyRate) {
        this.hourlyRate = hourlyRate;
    }

    public int getHoursWorked() {
        return hoursWorked;
    }

    public void setHoursWorked(int hoursWorked) {
        this.hoursWorked = hoursWorked;
    }


    @Override
    public double getTotalAmount() {
        return getHourlyRate() * getHoursWorked();
    }

    @Override
    public Beneficiary getBeneficiary() {
        return getEmployee();
    }
}
