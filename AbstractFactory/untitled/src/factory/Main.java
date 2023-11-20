package factory;

import factory.MacModels.MacFactory;
import factory.WinModels.WinFactory;
import factory.interfaces.GUIFactory;

public class Main {



    public static void main(String[] args) {
        GUIFactory winFactory = new WinFactory();
        GUIFactory macFactory = new MacFactory();

        winFactory.createButton().paint();
        winFactory.createCheckBox().check();

        macFactory.createButton().paint();
        macFactory.createCheckBox().check();


    }
}