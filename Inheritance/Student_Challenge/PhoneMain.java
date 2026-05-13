public class PhoneMain 
{
    public static void main(String [] args)
    {
        SmartPhone sm = new SmartPhone();
        sm.call();
        sm.photo();
        sm.play();
    }    
}

class CellPhone
{
    private String phno = "8885787828";
    private String imie = "356938031234567";
    
    public void call()
    {
        System.out.println("You are calling to friend.");
    }

    public void photo()
    {
        System.out.println("A Photo is taken.");
    }
}

class SmartPhone extends CellPhone
{
    private String mac = "00:1A:2B:3C:4D:5E";

    public void play()
    {
        System.out.println("You are playing a game.");
    }
}