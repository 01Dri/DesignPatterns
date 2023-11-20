package factory.WinModels;

import factory.interfaces.ICheckBox;

public class WinCheckBox implements ICheckBox {


    // Class implementation  "Windows" of the ICheckBox interface
    @Override
    public void check() {
        System.out.println("Check with windows");
    }
}
