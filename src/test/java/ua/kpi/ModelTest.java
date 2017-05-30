package ua.kpi;

import org.junit.Assert;
import org.junit.BeforeClass;
import  org.junit.Test;




/**
 * Created by Администратор on 30.05.2017.
 */
public class ModelTest {
    private static Model model;

    @BeforeClass
    public static  void runTest() {

        model = new Model();

    }

    @Test
    public void getAverage() {
        int[] array={1,2,3,4,5,6,7,8,9,10,11};
        model.setData(array);
        double aver=model.getAverage();
        Assert.assertTrue("1",6==aver);

//        array=new int[] {};
//        model.setData(array);
//        aver=model.getAverage();
//        Assert.assertTrue("2",0==aver);
    }

    @Test
    public void  AverageArr(){
        int[] array={};
        model.setData(array);

        double aver=model.averageArr(array);
        Assert.assertTrue("1",Double.isNaN(aver));
    }



}