public class Main
{
    public static void main(String[] args)
    {
        MyTestPotato myTestPotato =new MyTestPotato(2);
        myTestPotato.save("da.cartof");

        MyTestPotato secondPotato = (MyTestPotato) MyTestPotato.load("da.cartof");
        assert secondPotato != null;
        System.out.println("Potato: "+secondPotato.getCartof());
    }
}