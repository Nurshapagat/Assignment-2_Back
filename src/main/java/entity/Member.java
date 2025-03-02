package org.example.entity;

public class Member {
    private int id;
    private String name;
    private String membersType;
    private double payment;

    public Member(int id, String name, String membersType, double payment) {
        this.id = id;
        this.name = name;
        this.membersType = membersType;
        this.payment = payment;
    }

    public int getId() { return id; }
    public String getName() { return name; }
    public String getMembersType() { return membersType; }
    public double getPayment() { return payment; }

    @Override
    public String toString() {
        return "Member id=" + id + ", name='" + name + "', membersType='" + membersType + "', payment=" + payment;
    }
}
