/*
 * Licensed Materials - Property of IBM
 * 
 * (c) Copyright IBM Corp. 2020.
 */
package dev.galasa.genapp.manager;

public interface ICustomer {

    public int getCustomerNumber();

    public String getFirstName();

    public String getLastName();

    public String getDateOfBirth();

    public String getHouseName();

    public String getHouseNumber();

    public String getPostCode();

    public String getHomePhone();

    public String getMobilePhone();

    public String getEmailAddress();

    public void updateFirstName(String firstName) throws GenAppManagerException;

    public void updateLastName(String lastName) throws GenAppManagerException;

    public void updateDateOfBirth(String dateOfBirth) throws GenAppManagerException;

    public void updateHouseName(String houseName) throws GenAppManagerException;

    public void updateHouseNumber(String houseNumber) throws GenAppManagerException;

    public void updatePostCode(String postCode) throws GenAppManagerException;

    public void updateHomePhone(String homePhone) throws GenAppManagerException;

    public void updateMobilePhone(String mobilePhone) throws GenAppManagerException;

    public void updateEmailAddress(String emailAddress) throws GenAppManagerException;

}