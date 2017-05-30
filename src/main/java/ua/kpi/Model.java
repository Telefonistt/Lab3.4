package ua.kpi;


public class Model {
    //    private String value;
    private int [] array;

    private  double average;
    private  double less_average;
    private  double equally_average;
    private double more_average;
    // The Program logic

    public int [] getArr() {
        return array;
    }

    public double getLess_average() {
        return less_average;
    }

    public double getEqually_average() {
        return equally_average;
    }

    public double  getMore_average() {
        return more_average;
    }

    public double  getAverage() {
        return average;
    }


    public void setRandomData() {
        //int []arr = {3,4,6,4,-3,5,4,3,-5,3};
        int []array = new int[10];
        for (int i = 0; i < array.length; i++)
            array[i] = (int) ( Math.random() * 10 );
        Task(array);
    }
    public void setData(int[] array) {

        Task(array);

    }

    private void Task(int [] array){
        this.array = array;
        double average=averageArr(array);
        this.average=average;
        double percent=100.0/array.length;
        for (int i=0;i<array.length;i++){
            if (array[i]<average)
            {
                less_average+=percent;
            }else {
                if (array[i]>average){
                    more_average+=percent;
                }else {
                    equally_average+=percent;
                }
            }
        }
    }

    public double averageArr(int [] array) {

        int sum=0;
        for (int i=0;i<array.length;i++) {
            sum += array[i];
        }
        double average=sum/(double)array.length;
        return average;
    }



}
