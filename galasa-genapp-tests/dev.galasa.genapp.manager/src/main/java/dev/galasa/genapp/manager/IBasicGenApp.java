package dev.galasa.genapp.manager;

/**
 * The basic interface for the Galasa General application CB12 (CICS)
 * BasicGenApp just provides a way to generate cust ID and holding the Applid and the base address
 */
public interface IBasicGenApp {

    /**
     * Application ID of the CB12-CICS-application
     * @return ApplId
     */
    public String getApplId();

    /**
     * URI of the CB12-endpoint
     * @return URI
     */
    public String getBaseAddress();

    /**
     * Random customer ID generator
     * @return cust ID of CB12
     */
    public String provisionCustomerName();

}