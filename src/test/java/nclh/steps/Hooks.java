package nclh.steps;

import io.cucumber.java.Before;
import io.cucumber.java.BeforeAll;
import io.cucumber.java.BeforeStep;

public class Hooks {

    @BeforeAll
    public static void before_or_after_all(){
        System.out.println("Before All");
    }

    @Before
    public static void before_Scenario(){
        System.out.println("Before Scenario");
    }

    @BeforeStep
    public static void before_Step(){
        System.out.println("Before Step");
    }
}
