package com.exercise;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@ToString

//ex5

public class MyClass
{
    private @Getter @Setter String m_name;   // with lombok - simple default code
    private String m_nameTwo;     // for manual getter/setter

    public String getName(String nameTwo)
    {      // manual - possible to add code, e.g. conditions, to the getter/setter
        return m_nameTwo;
    }

    public void setName(String nameTwo)
    {     // manual
        this.m_nameTwo = nameTwo;
    }

}
