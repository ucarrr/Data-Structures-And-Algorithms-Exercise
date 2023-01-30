package finalpractice;

import java.util.ArrayList;
import java.util.Collections;

/*

JobID   Deadline  Profit

  a            2          100
  b            1          19
  c            2          27
 d            1          25
 e            3          15

*/
public class JobSequencing {
    public static void main(String[] args) {

    }

    public void printJobScheduling(ArrayList<Job> arr, int t, int n) {

        Job j1 = new Job('a', 2, 100);
        Job j2 = new Job('b', 1, 19);
        Job j3 = new Job('c', 2, 27);
        Job j4 = new Job('d', 1, 25);
        Job j5 = new Job('e', 3, 15);

        ArrayList<Job> arrayList = new ArrayList<>();
        arrayList.add(j1);
        arrayList.add(j2);
        arrayList.add(j3);
        arrayList.add(j4);
        arrayList.add(j5);





    }
}

class Job implements Comparable {


    char id;
    int deadline;
    int profit;


    public Job(char id, int deadline, int profit) {
        this.id = id;
        this.deadline = deadline;
        this.profit = profit;
    }

    @Override
    public int compareTo(Object o) {

        return 0;
    }
}