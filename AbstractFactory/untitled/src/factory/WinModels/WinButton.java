package factory.WinModels;

import factory.interfaces.IButton;

public class WinButton implements IButton {

    // Class implemenation  "Windows" of the IBUtton interface


    @Override
    public void paint() {
        System.out.println("painting with windows");
    }
}
