package factory;

import factory.MacModels.MacFactory;
import factory.WinModels.WinFactory;
import factory.interfaces.GUIFactory;
import factory.interfaces.IButton;


public class Main {



    public static void main(String[] args) {
        GUIFactory winFactory = new WinFactory();  // Implementation Windows of the interface GUIFactory
        GUIFactory macFactory = new MacFactory();  // Implementation Mac of the interface GUIFactory


        winFactory.createButton().paint();
        winFactory.createCheckBox().check();

        macFactory.createButton().paint();
        macFactory.createCheckBox().check();


        // Important to repair that all is a interface, but each factory have your implementation at the time of its instantiation


    }
}