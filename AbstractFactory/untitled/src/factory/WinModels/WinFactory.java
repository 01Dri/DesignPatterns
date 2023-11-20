package factory.WinModels;

import factory.interfaces.IButton;
import factory.interfaces.ICheckBox;
import factory.interfaces.GUIFactory;

public class WinFactory  implements GUIFactory {

    //Class  WinFactory responsible for the implementation GUIFactory interface

    @Override
    public IButton createButton() {
        // Here return the WinButton class with your implementation  of the IButton
        return new WinButton();
    }

    @Override
    public ICheckBox createCheckBox() {
        // Here return the WinCheckBox class with your implementation  of the ICheck
        return new WinCheckBox();
    }
}
