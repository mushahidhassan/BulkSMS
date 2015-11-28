package com.declarevariable.bulksms;

import java.util.ArrayList;

/**
 * Created by mushahid on 11/23/2015.
 */
public class Common {

    public static final String SHARED_PREFS = "shared_pref";
    public static final String PREF_CONTACTS_ARRAY = "contacts_array";

    public static class Arr{
        public static ArrayList<String> getContacts(){
            ArrayList<String> contacts = new ArrayList<String>();

            contacts.add("00923458503090");
            contacts.add("00923458503090");
            contacts.add("00923458503090");
            contacts.add("00923458503090");
            contacts.add("00923458503090");

            return contacts;
        }
    }
}
