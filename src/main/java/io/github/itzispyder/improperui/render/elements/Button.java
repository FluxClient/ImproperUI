package io.github.itzispyder.improperui.render.elements;

import io.github.itzispyder.improperui.render.Element;

public class Button extends Element {

    public Button() {
        super();
        queueProperty("size: 69 7");
        queueProperty("inner-text: \"Button\"");
        queueProperty("background-color: green");
        queueProperty("padding: 2");
        queueProperty("margin: 2");
        queueProperty("text-align: center");
        queueProperty("hovered => { border-thickness: 1; border-color: white; }");
        queueProperty("selected => { border-thickness: 0; background-color: gray; }");
    }
}
