package algorithm.homework1;

import javax.swing.*;
import java.util.ArrayList;
import java.util.Random;

public class Main {
    public static void main(String[] args) {
        Random random = new Random();


        ArrayList<int[]> arrays = new ArrayList();

        arrays.add(random.ints(10000).toArray());
        arrays.add(random.ints(20000).toArray());
        arrays.add(random.ints(30000).toArray());
        arrays.add(random.ints(40000).toArray());
        arrays.add(random.ints(50000).toArray());
        arrays.add(random.ints(60000).toArray());
        arrays.add(random.ints(70000).toArray());
        arrays.add(random.ints(80000).toArray());
        arrays.add(random.ints(90000).toArray());
        arrays.add(random.ints(100000).toArray());


        ArrayList starts = new ArrayList();
        ArrayList finishes = new ArrayList();
        ArrayList runtimes = new ArrayList();

        for (int i=0; i<arrays.size(); i++){

        double start = System.nanoTime();

        double finish = System.nanoTime();
        double runtime = (finish - start)/1000000;
        runtimes.add(runtime);
        }


        for (int k = 0; k <10; k++)
            System.out.print(runtimes.get(k)+",");
    }
}