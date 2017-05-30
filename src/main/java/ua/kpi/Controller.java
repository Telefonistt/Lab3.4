package ua.kpi;


public class Controller {

    Model model;
    View view;
    // Constructor
    public Controller(Model model, View view) {
        this.model  = model;
        this.view = view;
    }

    // The Work method
    public void processUser(){



        model.setRandomData();


        view.printMessage(view.ARRAY);
        view.printArray(model.getArr());

        view.printMessage(view.AVERAGE_ELEMENT);
        view.printDouble(model.getAverage());

        view.printMessage(view.ELEMENTS_LESS);
        view.printDouble(model.getLess_average());

        view.printMessage(view.ELEMENTS_EQUALLY);
        view.printDouble(model.getEqually_average());

        view.printMessage(view.ELEMENTS_MORE);
        view.printDouble(model.getMore_average());

    }


}
