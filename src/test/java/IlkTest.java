public class IlkTest {

    /*
    Expected Data:Beklenen Data
    Actual Data: Gerçek Data

    Test:Beklenen data ile gerçek datanın karşılaştırılmasıdır.
    */

    public static void main(String[] args) {

        // TEST-1
        String expectedData = "Selam";
        String actualData = "Selamlar";

        if(actualData.equals(expectedData)){
            System.out.println("Test PASSED");
        }else {
            System.out.println("Test FAILED");
        }

        // TEST-2
        int sayi1=5;
        int sayi2=5;

        if (sayi1==sayi2){
            System.out.println("Test PASSED");
        }else {
            System.out.println("Test FAILED");
        }

        // TEST-3
        if (sayi1>sayi2){
            System.out.println("Test PASSED");
        }else {
            System.out.println("Test FAILED");
        }

        //Otomasyon testi yapabilmek için bir Test Framework'üne ihtiyacımız vardır.(JUnit,TestNG,Cucumber)




    }


}
