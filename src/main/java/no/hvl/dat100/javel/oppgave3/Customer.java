package no.hvl.dat100.javel.oppgave3;

public class Customer {
// objektvariabler
        public String name;
        public String email;
        public int costumer_id;
        public PowerAgreementType agreement;

    public Customer(String name, String email, int customer_id, PowerAgreementType agreement) {
        this.name = name;
        this.email = email;
        this.costumer_id = customer_id;
        this.agreement = agreement;
    }
// get metoder
    public String getName() {
        return name;
    }
    public String getEmail() {
        return email;
    }
    public int getCustomer_id() {
        return costumer_id;
    }
    public PowerAgreementType getAgreement() {
        return agreement;
    }
// set metoder
    public void setName(String name) {
        this.name = name;
    }

    public void setEmail(String email) {
        this.email = email;
    }
    public void setCustomer_id(int costumer_id) {
        this.costumer_id = costumer_id;
    }
    public void setAgreement(PowerAgreementType agreement) {
        this.agreement = agreement;
    }

// toString metode
    public String toString() {
        return "Costumer number: " + costumer_id +"\nnavn: " + name + "\nemail: " + email + "\nagreement: " + agreement;
    }



}
