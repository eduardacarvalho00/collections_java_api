package main.java.org.miawe.set.BasicOperations;

import java.util.HashSet;
import java.util.Set;

public class SetInviteds {
    private Set<Invited> invitedSet;

    public SetInviteds() {
        this.invitedSet = new HashSet<>();
    }

    public void addInvited(String name, int invitationCode){
        invitedSet.add(new Invited(name, invitationCode));
    }

    public void removeInvitedByCode(int invitationCode){
        Invited invitedByRemove = null;
        for(Invited i : invitedSet){
            if(i.getInvitationCode() == invitationCode){
                invitedByRemove = i;
                break;
            }else{
                System.out.println("There is no guest with this code");
            }
        }
        invitedSet.remove(invitedByRemove);
    }
    public int countInviteds(){
        return invitedSet.size();
    }

    public void listInviteds(){
        if (!invitedSet.isEmpty()) {
            System.out.println(invitedSet);
        } else {
            System.out.println("Set is empty!");
        }
    }

    public static void main(String[] args) {
        SetInviteds invitedSet = new SetInviteds();
        // Displaying the number of guests in the set (should be zero)
        System.out.println("There are " + invitedSet.countInviteds() + " guest(s) in the Guest Set");

        // Adding guests to the set
        invitedSet.addInvited("Alice", 1234);
        invitedSet.addInvited("Bob", 1235);
        invitedSet.addInvited("Charlie", 1235);
        invitedSet.addInvited("David", 1236);

        // Displaying the guests in the set
        System.out.println("Guests in the set:");
        invitedSet.listInviteds();
        System.out.println("Now there are " + invitedSet.countInviteds() + " guest(s) in the Guest Set");
    }
}
