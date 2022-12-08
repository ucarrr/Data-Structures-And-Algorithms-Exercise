package algorithm.dynamicprogramming;

public class Crazy8 {
    String[] nCardSequence;
    String[] nMaxTrick;

    public Crazy8(String[] cardSeq) {
        nCardSequence = cardSeq;

    }

    public void findTrickSeq() {
        int[] myTrick = new int[nCardSequence.length];
        int cur_max;
        int MaxIndex;
        int[] prevIndex = new int[nCardSequence.length];
        myTrick[0] = 1;
        MaxIndex = 0;
        prevIndex[0] = 0;
        for (int i = 1; i < myTrick.length; i++) {
            cur_max = 0;
            for (int j = 0; j < i; j++) { //iterate through calculated subarray
                if (myTrick[j] > cur_max) {
                    if (cardMatch(nCardSequence[i], nCardSequence[j])) {
                        cur_max = myTrick[j];
                        myTrick[i] = cur_max + 1;
                        prevIndex[i] = j;
                    }
                }
            }
            if (myTrick[i] > myTrick[MaxIndex])
                MaxIndex = i;
        }
        nMaxTrick = new String[myTrick[MaxIndex]];
        int curPrev = MaxIndex;
        for (int i = nMaxTrick.length - 1; i >= 0; i--) {
            nMaxTrick[i] = nCardSequence[curPrev];
            curPrev = prevIndex[curPrev];
        }
    }

    public void printTrickSeqeunce() {
        System.out.println("The length of trick sequence = " + nMaxTrick.length);
        System.out.println("Trick Sequence");
        for (int i = 0; i < nMaxTrick.length; i++) {
            System.out.print(nMaxTrick[i] + " ");
        }
        System.out.println();
    }

    private boolean cardMatch(String c1, String c2) {
        char irank = c1.charAt(0);
        char isuit = c1.charAt(1);
        char jrank = c2.charAt(0);
        char jsuit = c2.charAt(1);
        if (irank == jrank)
            return true;
        if (isuit == jsuit)
            return true;
        if (irank == '8' || jrank == '8')
            return true;
        return false;
    }
}
