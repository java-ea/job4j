package ru.job4j.tracker;

import org.junit.Test;

import java.util.ArrayList;

import static org.hamcrest.Matchers.is;
import static org.junit.Assert.assertThat;

public class StartUITest {
    @Test
    public void whenExit() {
        StubInput input = new StubInput(
                new String[]{"0"}
        );
        StubAction action = new StubAction();
        ArrayList<UserAction> act = new  ArrayList<UserAction>();
        act.add(action);
        new StartUI().init(input, new Tracker(), act);
        assertThat(action.isCall(), is(true));
    }

}
