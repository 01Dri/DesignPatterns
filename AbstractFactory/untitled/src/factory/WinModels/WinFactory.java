package factory.WinModels;

import factory.interfaces.IButton;
import factory.interfaces.ICheckBox;
import factory.interfaces.GUIFactory;

public class WinFactory  implements GUIFactory {


    @Override
    public IButton createButton() {
        return new WinButton();
    }

    @Override
    public ICheckBox createCheckBox() {
        return new WinCheckBox();
    }
}
