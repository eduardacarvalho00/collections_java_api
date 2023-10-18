package main.java.org.miawe.set.BasicOperations;

import java.util.Objects;

public class Invited {
    private String name;
    private int invitationCode;

    public Invited(String name, int invitationCode) {
        this.name = name;
        this.invitationCode = invitationCode;
    }

    public String getName() {
        return name;
    }

    public int getInvitationCode() {
        return invitationCode;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Invited invited)) return false;
        return getInvitationCode() == invited.getInvitationCode();
    }

    @Override
    public int hashCode() {
        return Objects.hash(getInvitationCode());
    }

    @Override
    public String toString() {
        return "Invited{" +
                "name='" + name + '\'' +
                ", invitationCode=" + invitationCode +
                '}';
    }
}



