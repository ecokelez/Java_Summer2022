package day07_If_Statementns;

public class C02_IfStatements {

    public static void main(String[] args) {
         int sayi=10;

         if (sayi>0) {
             System.out.println("sayi pozitif");
         }

         if (sayi%2==0){
             System.out.println("sayi cift");
         }
         if (sayi%5==0){
             System.out.println("sayi 5' in tam katı");
         }
          /*
          Bast if cum. kodun diger parcalarından baımsızdır,
          sadece bır sart kontrol eder , sart saglanıyorsa, ıf body calısır, yoksa calısmaz
          Bırden fazla  basıt ıf cumleleri varsa gırılen sarta baglı olarak,
          tumunde if body' si calısabılır, kısmen if bodyleri calısabılır
           ve ya hıcbır if body'sı calısmayabilir

           */
    }
}
