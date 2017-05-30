package ua.kpi;


public class View {
    public static final String ARRAY = "Array: ";
    public static final String AVERAGE_ELEMENT = "Average element ";
    public static final String ELEMENTS_LESS = "Percent elements that less average element: ";
    public static final String ELEMENTS_EQUALLY = "Percent elements that equally average element: ";
    public static final String ELEMENTS_MORE = "Percent elements that more average element: ";


    public void printArray(int []array){
        for (int i = 0; i < array.length; i++) {
            System.out.print(array[i] + " ");
        }
        System.out.println();
    }

    public void printMessage(String message){
        System.out.println(message);
    }

    public void printDouble(double number){
        System.out.println(number);
    }
   /* public void printMessageAndInt(String message, int value){
        System.out.println(message + value);
    }*/

}
