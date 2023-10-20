import org.junit.Assert;
import org.junit.Test;

public class JunitTest {

    /*
    Assertion: Test sonuçlarını doğrulamak için kullanacağımız class ve metotlardır.
    Test geçti veya kaldı şeklinde dönütler alabilmek için doğrulama (assertion) işlemi gerçekleştiririz.
    */

    //ASSERTİON TÜRLERİ:
    //1.assertEquals()--> İçerisine eklenen parametreler eşitse test geçer,değilse kalır.
    @Test
    public void deneme1(){
        String expectedData ="Selam";
        String actualData ="Selamlar";

        Assert.assertEquals(expectedData,actualData);
    }
    //2. assertTrue() --> İçerisine eklenen işlem sonucu true ise test geçer,false ise kalır.
    @Test
    public void deneme2(){
        int sayi=5;

        Assert.assertTrue(sayi>0);

    }
    //3.assertNotEquals() --> içerisine eklenen parametreler eşit değilse test geçer,eşitse kalır.
    @Test
    public void deneme3(){
        int sayi1=5;
        int sayi2=2;

        Assert.assertNotEquals(sayi1,sayi2);

    }
    //4.assertFalse() -->İçerisine eklenen işlem sonucu false ise test geçer,true ise kalır.
    @Test
    public void deneme4(){
        int sayi=5;

        Assert.assertFalse(sayi>0);
    }
}
