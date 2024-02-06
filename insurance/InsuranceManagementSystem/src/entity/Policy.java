package entity;

public class Policy {
    private Long policyId;
    private String policyName;
    private String policyDetails;
    private Client client;

    // Default constructor
    public Policy() {
    }

    // Parameterized constructor
    public Policy(Long policyId, String policyName, String policyDetails) {
        this.policyId = policyId;
        this.policyName = policyName;
        this.policyDetails = policyDetails;
    }

    // Getters and setters
    public Long getPolicyId() {
        return policyId;
    }

    public void setPolicyId(Long policyId) {
        this.policyId = policyId;
    }

    public String getPolicyName() {
        return policyName;
    }

    public void setPolicyName(String policyName) {
        this.policyName = policyName;
    }

    public String getPolicyDetails() {
        return policyDetails;
    }

    public void setPolicyDetails(String policyDetails) {
        this.policyDetails = policyDetails;
    }
    
    public Client getClient() {
        return client;
    }
    
    public void setClient(Client client) {
        this.client = client;
    }

    // toString method
    @Override
    public String toString() {
        return "Policy{" +
                "policyId=" + policyId +
                ", policyName='" + policyName + '\'' +
                ", policyDetails='" + policyDetails + '\'' +
                '}';
    }


}
