package factory.MacModels;

import factory.interfaces.ICheckBox;

public class MacCheckBox implements ICheckBox {

    // Class implemenation  "Mac" of the ICheckBox interface
    @Override
    public void check() {
        System.out.println("Checking with mac");
    }
}
