package Hashing.ContactExample;

import java.util.HashSet;
import java.util.Objects;
import java.util.Set;

public class Contact
{

    private String name;
    public Set<String> emails = new HashSet<>();
    private Set<String> phones = new HashSet<>();

    public Contact(String name){
        this.name=name;
    }
    public Contact(String name,String email){
        this(name);
        if (email!=null)
        {
            emails.add(email);
        }

    }
    public Contact(String name,long phone){
        this(name);
        String[] parts = String.valueOf(phone).split("");
        String firstPart="("+ parts[0]+parts[1]+parts[2]+")";
        String secondPart = String.valueOf(phone).substring(2,5);
        String thirdPart = String.valueOf(phone).substring(6,9);
        String complete = firstPart+secondPart+"-"+thirdPart;


        phones.add(complete);


    }
    public Contact(String name,String email,long phone){
        this(name,phone);
        emails.add(email);

    }

    public String getName(){
        return name;
    }

    @Override
    public String toString(){
       return "%s: %s %s".formatted(name,emails,phones);

    }

    public Contact mergeContactData(Contact contact){

        Contact newContact = new Contact(name);
        newContact.phones = new HashSet<>(this.phones);
        newContact.emails =new HashSet<>(this.emails);
        newContact.emails.addAll(contact.emails);
        newContact.phones.addAll(contact.phones);
        return newContact;


    }

    @Override
    public boolean equals(Object o)
    {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Contact contact = (Contact) o;
        return getName().equals(contact.getName());
    }

    @Override
    public int hashCode()
    {
        return getName().hashCode();
    }


    public void addEmail(String companyName){
        String[] names = name.split(" ");
        String email = "%c%s@%s.com".formatted(name.charAt(0),names[names.length-1],companyName.replaceAll(" ", "").toLowerCase());

        if (!emails.add(email)){
            System.out.println(name + " already has an email " + email);
        }else {
            System.out.println(name + " now has email "+email);
        }

    }

    public void replaceEmailIfExists(String oldEmail,String newEmail){
        if (emails.contains(oldEmail)){
            emails.remove(oldEmail.toLowerCase());
            System.out.println(oldEmail + "Removed");
            emails.add(newEmail);
        }
    }
}
