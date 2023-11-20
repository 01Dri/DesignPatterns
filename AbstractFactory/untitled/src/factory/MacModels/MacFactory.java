package factory.MacModels;

import factory.interfaces.GUIFactory;
import factory.interfaces.IButton;
import factory.interfaces.ICheckBox;

public class MacFactory  implements GUIFactory {


    //Class  MacFactory responsible for the implementation GUIFactory interface
    @Override
    public IButton createButton() {

        // Here return the MacButton class with your implementation  of the IButton
        return new MacButton();
    }

    @Override
    public ICheckBox createCheckBox() {
        // Here return the MacCheckBox class with your implementation  of the ICheck
        return new MacCheckBox();
    }
}
