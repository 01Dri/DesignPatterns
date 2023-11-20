package factory.WinModels;

import factory.interfaces.ICheckBox;

public class WinCheckBox implements ICheckBox {




    @Override
    public void check() {
        System.out.println("Check with windows");
    }
}
