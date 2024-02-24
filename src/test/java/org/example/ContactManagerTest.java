package org.example;

import org.junit.jupiter.api.*;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.ValueSource;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertFalse;

public class ContactManagerTest {


    private static ContactManager contactManager;
    @BeforeAll
    public static void setup(){
        contactManager=new ContactManager();

    }

    @Test
    @DisplayName("Should Create Contact")
    public void shouldCreateContact(){

      //  ContactManager contactManager=new ContactManager();

        Assumptions.assumeTrue("DEV".equals(System.getProperty("ENV")));
        contactManager.addContact("Mohan","Raju","7991937765");
        assertFalse(contactManager.getAllContacts().isEmpty());
        assertEquals(1, contactManager.getAllContacts().size());

    }


    @DisplayName("Should not Create Contact when first name is null")
    @ParameterizedTest
    @ValueSource(strings = {"1234567890","656478390","32759809734"})
    public void shouldthrowRuntimeExceptionWhenFirstNameIsNull(String pHnumber){

       // ContactManager contactManager=new ContactManager();
        Assertions.assertThrows(RuntimeException.class,()->{contactManager.
                addContact(null,"Ban",pHnumber);});

    }

    @Test
    @DisplayName("Should not Create Contact when last name is null")
    public void shouldthrowRuntimeExceptionWhenLastNameIsNull(){

        // ContactManager contactManager=new ContactManager();
        Assertions.assertThrows(RuntimeException.class,()->{contactManager.
                addContact("Samir",null,"7991937456");});

    }

    @Test
    @DisplayName("Should not Create Contact when phone number is null")
    public void shouldthrowRuntimeExceptionWhenPhoneNumberIsNull(){

        // ContactManager contactManager=new ContactManager();
        Assertions.assertThrows(RuntimeException.class,()->{contactManager.
                addContact("Sanjay","Ban",null);});

    }
}
