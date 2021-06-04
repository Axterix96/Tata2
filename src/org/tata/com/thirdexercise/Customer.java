package org.tata.com.thirdexercise;

public class Customer {
    private String userName;
    private int connectionId;
    private String type;
    private int plantype;

    public Customer(String userName, int connectionId, String type, int plantype) {
        this.userName = userName;
        this.connectionId = connectionId;
        this.type = type;
        this.plantype = plantype;
    }

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public int getConnectionId() {
        return connectionId;
    }

    public void setConnectionId(int connectionId) {
        this.connectionId = connectionId;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public int getPlantype() {
        return plantype;
    }

    public void setPlantype(int plantype) {
        this.plantype = plantype;
    }
}
