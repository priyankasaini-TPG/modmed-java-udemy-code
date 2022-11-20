package section8.mobilePhone;

import java.util.ArrayList;

public class MobilePhone {
    private String myNumber;
    private ArrayList<Contacts> contactsArrayList;

    public MobilePhone(String myNumber) {
        this.myNumber = myNumber;
        contactsArrayList = new ArrayList<Contacts>();
    }

    public boolean storeContact(Contacts contact){
        if(findContact(contact.getName()) >= 0){
            System.out.println("Contact already exists.");
            return false;
        }
        contactsArrayList.add(contact);
        return true;
    }

    public boolean modifyContact(Contacts oldContact, Contacts newContact){
        int position = findContact(oldContact);
        if(position < 0){
            System.out.println("OldContact not found.");
            return false;
        }
        else if(findContact(newContact.getName()) != -1){
            System.out.println("Contact with same name exists already. So can't modify the list.");
            return false;
        }
        this.contactsArrayList.set(position, newContact);
        System.out.println("Old contact has been replaced with new contact.");
        return true;
    }

    public String queryContact(Contacts contact){
        if(findContact(contact) >= 0)
            return contact.getName();
        return null;
    }

    public Contacts queryContact(String name){
        int position = findContact(name);
        if(position >= 0)
            return this.contactsArrayList.get(position);
        return null;
    }

    public boolean removeContact(Contacts contact){
        if(findContact(contact) < 0){
            System.out.println("Contact does not exists. So can't remove");
            return false;
        }
        this.contactsArrayList.remove(contact);
        System.out.println("One contact has been removed.");
        return true;
    }

    private int findContact(Contacts contact){
        return this.contactsArrayList.indexOf(contact);
    }

    private int findContact(String contactName){
        for (int i = 0; i < this.contactsArrayList.size(); i++) {
            Contacts currentContact = this.contactsArrayList.get(i);
            if(currentContact.getName().equals(contactName))
                return i;
        }
        return -1;
    }

    public void printContacts(){
        System.out.println("Printing contacts");
        for (int i = 0; i < this.contactsArrayList.size(); i++) {
            System.out.println(this.contactsArrayList.get(i).getName() + " -> " + this.contactsArrayList.get(i).getNumber());
        }
    }
}
