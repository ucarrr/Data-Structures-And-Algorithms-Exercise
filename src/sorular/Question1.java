package sorular;

public class Question1 {
    public static void main(String[] args) {
        int [] dizi = new int[100];
         int toplam = 0;
        for (int i = 0; i <dizi.length ; i++) {
            int random=(int)(Math.random() *100);
            dizi[i]=random;
            toplam=+random;
        }

        for (int i = 0; i <dizi.length ; i++) {
            System.out.println("index :" + dizi[i]);
        }
    }
}
