package entity;

import java.util.Date;

public class Claim {
    private Long claimId;
    private String claimNumber;
    private Date dateFiled; // Consider using LocalDate instead for modern applications
    private Double claimAmount;
    private String status;
    private Policy policy; // Represents the policy associated with the claim
    private Client client; // Represents the client associated with the claim

    // Default constructor
    public Claim() {
    }

    // Parameterized constructor
    public Claim(Long claimId, String claimNumber, Date dateFiled, Double claimAmount, String status, Policy policy, Client client) {
        this.claimId = claimId;
        this.claimNumber = claimNumber;
        this.dateFiled = dateFiled;
        this.claimAmount = claimAmount;
        this.status = status;
        this.policy = policy;
        this.client = client;
    }

    // Getters
    public Long getClaimId() {
        return claimId;
    }

    public String getClaimNumber() {
        return claimNumber;
    }

    public Date getDateFiled() {
        return dateFiled;
    }

    public Double getClaimAmount() {
        return claimAmount;
    }

    public String getStatus() {
        return status;
    }

    public Policy getPolicy() {
        return policy;
    }

    public Client getClient() {
        return client;
    }

    // Setters
    public void setClaimId(Long claimId) {
        this.claimId = claimId;
    }

    public void setClaimNumber(String claimNumber) {
        this.claimNumber = claimNumber;
    }

    public void setDateFiled(Date dateFiled) {
        this.dateFiled = dateFiled;
    }

    public void setClaimAmount(Double claimAmount) {
        this.claimAmount = claimAmount;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public void setPolicy(Policy policy) {
        this.policy = policy;
    }

    public void setClient(Client client) {
        this.client = client;
    }

    // toString method
    @Override
    public String toString() {
        return "Claim{" +
                "claimId=" + claimId +
                ", claimNumber='" + claimNumber + '\'' +
                ", dateFiled=" + dateFiled +
                ", claimAmount=" + claimAmount +
                ", status='" + status + '\'' +
                ", policy='" + policy + '\'' +
                ", client=" + client +
                '}';
    }
}
