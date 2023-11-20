package factory.MacModels;

import factory.interfaces.ICheckBox;

public class MacCheckBox implements ICheckBox {
    @Override
    public void check() {
        System.out.println("Checking with mac");
    }
}
