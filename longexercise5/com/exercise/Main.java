package com.exercise;

public class Main
{

    public static void main(String[] args)
    {

        //ex4
        Store s1 = new Store("newstore", "new st 1", "newowner");
        // System.out.println(s1.m_owner_name);
        // there is no access to m_owner_name as it is a private field,
        // therefore there's only access from the class itself

        /* ex8, 9, 10, 11
        with inheritance, a subclass would acquire the members and methods of the base class. this would
        save on repeating the code for each subclass. "extends" is used to indicate which base class the subclass
        is connected to. it is not possible in java to inherit more than one base class, whereas base classes
        can have multiple subclasses.
        a public member x in base class A would be accessible from A's subclass B.

        a private final member can have a getter - just retrieves its value. it cannot have a setter - the member's
        value cannot be changed once initialised (in definition or in the constructor).


        */


    }


}