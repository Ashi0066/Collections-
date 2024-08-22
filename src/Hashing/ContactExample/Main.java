package Hashing.ContactExample;

import jdk.jfr.MetadataDefinition;

import java.security.Security;
import java.util.*;

public class Main
{

    public static void main(String[] args)
    {
        List<Contact> email = MainPhone.getData("phone");
        List<Contact> phone = MainPhone.getData("email");
        printData("Phone List",phone);
        printData("Email List ",email);


        Set<Contact> emailContacts = new HashSet<>(email);
        Set<Contact> phoneContacts = new HashSet<>(phone);

        printData("Phone Contacts",phoneContacts);
        printData("email Contacts",emailContacts);

        int index = email.indexOf(new Contact("Robin Hood"));

        Contact robinHood = email.get(index);

        robinHood.addEmail("giotech");

        robinHood.replaceEmailIfExists("RHood@giotech.com","Rhood@pitch.com");






        System.out.println(robinHood.toString());

        // Union of A and B
        Set<Contact> unionAB = new HashSet<>();
        unionAB.addAll(emailContacts);
        unionAB.addAll(phoneContacts);
        printData("( A ∪ B) Union of emails (A) with phones (B)",unionAB);


        // Intersect of A and B
        Set<Contact> intersectAB = new HashSet<>(emailContacts);
        intersectAB.retainAll(phoneContacts);

        printData("A ∩ B",intersectAB);





        // All contact that is in the email contact but not in phone contact
        Set<Contact> AMinusB = new HashSet<>(emailContacts);
        AMinusB.removeAll(phoneContacts);
        printData("(A - B) emails (A) - phones (B)", AMinusB);


        // All contacts that are in the phone contact but not in email contact.
        Set<Contact> BMinusA = new HashSet<>(phoneContacts);
        BMinusA.removeAll(emailContacts);
        printData("(B - A) phones (B) - email (A)",BMinusA);




        // Symmetric difference: phones and Emails i.e the contact that was neither part of te A U B and B intersects A


        Set<Contact> symmetricDiff = new HashSet<>(AMinusB);
        symmetricDiff.addAll(BMinusA);

        printData("Symmetric Difference: phones and emails",symmetricDiff);













    }

    public static void printData (String header, Collection<Contact> collections){

        System.out.println("-".repeat(40));
        System.out.println(header);
        System.out.println("-".repeat(40));
        collections.forEach(System.out::println);
    }
}
