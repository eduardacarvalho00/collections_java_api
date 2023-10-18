package main.java.org.miawe.set.Search;

import java.util.HashSet;
import java.util.Set;

public class AgendaContacts {

    private Set<Contact> contactSet;

    public AgendaContacts() {
        this.contactSet = new HashSet<>();
    }

    public void addContact(String name, int number){
        contactSet.add(new Contact(name, number));
    }

    public void ListContacts(){
        System.out.println(contactSet);
    }

    public Set<Contact> searchByName(String name){
        Set<Contact> contactByName = new HashSet<>();
        for(Contact c : contactSet){
            if(c.getName().startsWith(name)){
                contactByName.add(c);
            }
        }
        return contactByName;
    }

    public Contact updateNumber(String name, int newNumber){
        Contact contactUpdate = null;
        for(Contact c : contactSet){
            if(c.getName().equalsIgnoreCase(name)){
                c.setNumber(newNumber);
                contactUpdate = c;
                break;
            }
        }
        return contactUpdate;
    }
}
