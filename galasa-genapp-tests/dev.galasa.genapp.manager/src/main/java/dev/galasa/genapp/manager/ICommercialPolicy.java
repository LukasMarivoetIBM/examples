/*
 * Licensed Materials - Property of IBM
 * 
 * (c) Copyright IBM Corp. 2020.
 */
package dev.galasa.genapp.manager;

/**
 * Commercial CB12 Policy
 */
public interface ICommercialPolicy {

    public int getPolicyNumber();

    public int getCustomerNumber();

    public String getPostcode();

    public String getCustomerName();

    public String getStatus();

}