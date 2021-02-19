package com.forest;

import com.Drone;
import com.creatures.Animal;
import com.creatures.Bear;
import com.creatures.Monkey;
import com.creatures.Tiger;

public class Main
{

    public static void main(String[] args)
    {

        //ex14
        Animal ani1 = new Animal();
        Bear br1 = new Bear();
        Monkey monk1 = new Monkey();
        Tiger tig1 = new Tiger();

        //ex15
        Drone dro1 = new Drone("comp1", 1_000f, 10_000f, "noidea");
        dro1.takeOff();
        //Airplane should inherit from Aircraft



    }
}
