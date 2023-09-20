package vn.iuh.edu.fit.th_www_week1.enums;

public enum AccountStatus {
    ACTIVE(1),


    DEACTIVE(0),
    DELETE(-1);
   private int value;

    AccountStatus(int value) {
        this.value = value;
    }

    public int getValue() {
        return value;
    }
}
