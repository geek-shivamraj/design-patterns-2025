package com.geek.design.patterns.solid.dependency.inversion.problem;

import com.geek.design.patterns.solid.dependency.inversion.WiredKeyboard;
import com.geek.design.patterns.solid.dependency.inversion.WiredMouse;
import lombok.Data;

/*
    Dependency inversion principle:
        - It states that class should depend on interfaces rather than concrete classes.

    Question: Is this class "MacBook" following Dependency inversion principle ?
    Answer: NO
    Reason:
        - By using concrete class "WiredKeyboard" & "WiredMouse" in MacBook class instead of using Keyboard or Mouse interface,
            we've constrained the class to not add any other devices like BluetoothKeyboard, BluetoothMouse

    Solution:
        - Rather than using concrete class objects, we should use interfaces like Keyboard, Mouse
 */

@Data
public class MacBook {
    private final WiredKeyboard keyboard;
    private final WiredMouse mouse;

    public MacBook() {
        keyboard = new WiredKeyboard();
        mouse = new WiredMouse();
    }
}
