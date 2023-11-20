package factory.WinModels;

import factory.interfaces.IButton;

public class WinButton implements IButton {


    @Override
    public void paint() {
        System.out.println("painting with windows");
    }
}
