/*
 * Licensed Materials - Property of IBM
 * 
 * (c) Copyright IBM Corp. 2020.
 */
package dev.galasa.genapp.manager;

/**
 * Endowment CB12-policy
 */
public interface IEndowmentPolicy {

    public int getPolicyNumber();

    public int getCustomerNumber();

    public String getFundName();

    public String getLifeAssured();

    public String getWithProfits();

    public String getEquities();

    public String getManagedFunds();

}