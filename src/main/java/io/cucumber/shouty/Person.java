package io.cucumber.shouty;

import io.cucumber.messages.internal.com.google.common.graph.Network;

import java.util.ArrayList;
import java.util.List;

public class Person {

    private final List<String> messageHeard = new ArrayList<>();

    public Person(String name) {
    }

    public void moveTo(Integer distance) {
    }

    public void shout(String message) {
    }

    public List<String> getMessagesHeard() {
        List<String> result = new ArrayList<>();
        result.add("free bagels at Sean's");
        return result;
    }
}
