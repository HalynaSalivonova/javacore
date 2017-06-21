package com.kitcenter.runners.classwork.lesson17;


import com.kitcenter.app.classwork.lesson17.Company;

public class CompanyRunner {
    public static void main(String[] args) {
        for(Company company: Company.values()){
            System.out.println(company.getFullName());
            company.setValue(20);
            System.out.println(company.getValue());
        }
    }
}
