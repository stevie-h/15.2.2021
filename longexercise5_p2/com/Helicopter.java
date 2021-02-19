package com;

import lombok.ToString;

@ToString

//ex15

public class Helicopter extends Aircraft
{
    private String m_engine_power;

    public String getM_engine_power()
    {
        return m_engine_power;
    }

    //ctor with super
    public Helicopter(String m_manufacturer, float m_max_speed, float m_max_altitude, String m_engine_power)
    {
        super(m_manufacturer, m_max_speed, m_max_altitude);
        this.m_engine_power = m_engine_power;
    }



}
