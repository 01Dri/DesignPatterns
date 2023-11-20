package factory.MacModels;

import factory.interfaces.GUIFactory;
import factory.interfaces.IButton;
import factory.interfaces.ICheckBox;

public class MacFactory  implements GUIFactory {

    @Override
    public IButton createButton() {
        return new MacButton();
    }

    @Override
    public ICheckBox createCheckBox() {
        return new MacCheckBox();
    }
}
