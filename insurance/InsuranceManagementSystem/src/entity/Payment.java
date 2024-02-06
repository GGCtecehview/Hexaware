package entity;

import java.util.Date;

public class Payment {
    private Long paymentId;
    private Date paymentDate; // Consider using LocalDate here as well
    private Double paymentAmount;
    private Client client; // Represents the client associated with the payment

    // Default constructor
    public Payment() {
    }

    // Parameterized constructor
    public Payment(Long paymentId, Date paymentDate, Double paymentAmount, Client client) {
        this.paymentId = paymentId;
        this.paymentDate = paymentDate;
        this.paymentAmount = paymentAmount;
        this.client = client;
    }

    // Getters
    public Long getPaymentId() {
        return paymentId;
    }

    public Date getPaymentDate() {
        return paymentDate;
    }

    public Double getPaymentAmount() {
        return paymentAmount;
    }

    public Client getClient() {
        return client;
    }

    // Setters
    public void setPaymentId(Long paymentId) {
        this.paymentId = paymentId;
    }

    public void setPaymentDate(Date paymentDate) {
        this.paymentDate = paymentDate;
    }

    public void setPaymentAmount(Double paymentAmount) {
        this.paymentAmount = paymentAmount;
    }

    public void setClient(Client client) {
        this.client = client;
    }

    // toString method
    @Override
    public String toString() {
        return "Payment{" +
                "paymentId=" + paymentId +
                ", paymentDate=" + paymentDate +
                ", paymentAmount=" + paymentAmount +
                ", client=" + client +
                '}';
    }
}
