package factory.MacModels;

import factory.interfaces.IButton;

public class MacButton implements IButton {
    @Override
    public void paint() {
        System.out.println("Paiting with mac");
    }
}
