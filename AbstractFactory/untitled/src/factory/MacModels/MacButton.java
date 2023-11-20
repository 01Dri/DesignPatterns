package factory.MacModels;

import factory.interfaces.IButton;

public class MacButton implements IButton {
    // Class implemenation  "Mac" of the IBUtton interface
    @Override
    public void paint() {
        System.out.println("Paiting with mac");
    }
}
