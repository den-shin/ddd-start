package domain;

public class Receiver {
    private String name;
    private String phoneNumber;

    public Receiver(String name, String phoneNumber) {
        this.name = name;
        this.phoneNumber = phoneNumber;

    }

    public String getName() {
        return this.name;
    }

    public String getPhoneNumber() {
        return this.phoneNumber;
    }

    @Override
    public boolean equals(Object other) {
        if (other == null) return false;
        if (this == other) return true;
        if (!(other instanceof Receiver)) return false;
        Receiver that = (Receiver)other;
        return this.name.equals(that.name) &&
                this.phoneNumber.equals(that.phoneNumber);
    }

}
