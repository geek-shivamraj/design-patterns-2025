package com.geek.design.patterns.solid.dependency.inversion.solution;

import com.geek.design.patterns.solid.dependency.inversion.Keyboard;
import com.geek.design.patterns.solid.dependency.inversion.Mouse;
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
        - Now this class is capable of handling both Wired & Bluetooth keyboard & mouse.
 */

@Data
public class MacBook {
    private final Keyboard keyboard;
    private final Mouse mouse;

    public MacBook(Keyboard keyboard, Mouse mouse) {    // Constructor Injection
        this.keyboard = keyboard;
        this.mouse = mouse;
    }
}
