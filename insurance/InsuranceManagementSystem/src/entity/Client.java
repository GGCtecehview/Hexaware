package entity;

import java.sql.ResultSet;
import java.sql.SQLException;


public class Client {
    private Long clientId;
    private String clientName;
    private String contactInfo;
    private Policy policy; 
    // Represents the policy associated with the client

    // Default constructor
    public Client() {
    }

    // Parameterized constructor
    public Client(Long clientId, String clientName, String contactInfo, Policy policy) {
        this.clientId = clientId;
        this.clientName = clientName;
        this.contactInfo = contactInfo;
        this.policy = policy;
    }
    public Client(ResultSet rs) throws SQLException {
        this.clientId = rs.getLong("client_id");
        this.clientName = rs.getString("client_name");
        this.contactInfo = rs.getString("contact_info");

        // Assuming you have a suitable constructor in the Policy class
        // and the policy_id column exists in the clients table
        this.policy = new Policy(rs.getLong("policy_id"), null, null);
    }

    // Getters
    public Long getClientId() {
        return clientId;
    }

    public String getClientName() {
        return clientName;
    }

    public String getContactInfo() {
        return contactInfo;
    }

    public Policy getPolicy() {
        return policy;
    }

    // Setters
    public void setClientId(Long clientId) {
        this.clientId = clientId;
    }

    public void setClientName(String clientName) {
        this.clientName = clientName;
    }

    public void setContactInfo(String contactInfo) {
        this.contactInfo = contactInfo;
    }

    public void setPolicy(Policy policy) {
        this.policy = policy;
    }

    // toString method
    @Override
    public String toString() {
        return "Client{" +
                "clientId=" + clientId +
                ", clientName='" + clientName + '\'' +
                ", contactInfo='" + contactInfo + '\'' +
                ", policy='" + policy + '\'' +
                '}';
    }
}
