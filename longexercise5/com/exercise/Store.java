package com.exercise;

import lombok.ToString;

@ToString

//ex4 + ex6

public class Store
{
    public String name;
    public final String address;
    private String m_owner_name;
    // m_ = signifies a class member (unlike a variable in Main or a method)

    public Store(String name, String address, String m_owner_name)
    {
        this.name = name;
        this.address = address;
        this.m_owner_name = m_owner_name;
        // this = indicates the member referred to belongs to this class
    }

    // this() method inside a ctor calls another ctor within the class. in the ctor it would
    // appear first in the code, before other actions are implemented, as it triggers another ctor.

}
