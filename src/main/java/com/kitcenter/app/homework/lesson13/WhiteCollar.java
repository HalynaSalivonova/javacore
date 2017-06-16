package com.kitcenter.app.homework.lesson13;

public class WhiteCollar extends Human{
    private String company;

    public WhiteCollar(int age, String name, String company) {
        super(age, name);
        setCompany(company);
    }

    public String getCompany() {
        return company;
    }

    public void setCompany(String company) {
        if(company.matches(("^[a-zA-Z ,-]+"))){
            this.company = company;
            System.out.println("Company name setted");
        } else {
            System.out.println("Company name is invalid");
        }
    }
}
