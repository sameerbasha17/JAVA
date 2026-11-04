package JAVA.Interfaces;

class Phone
{
    void call() { System.out.println("Phone is ringing"); }
    void sms()  { System.out.println("Sms is sent"); }
}

interface ICamera
{
    void record();
    void capture();
}

interface IMusicPlayer
{
    void play();
    void pause();
    void repeat();
}

class SmartPhone extends Phone implements ICamera, IMusicPlayer
{
    void videoCall() { System.out.println("Smart Phone Vedio Call is started."); }
    @Override 
    public void record() { System.out.println("Smart Phone is recording."); }
    @Override 
    public void capture() { System.out.println("Smart Phone is Capturing."); }

    @Override 
    public void play() { System.out.println("Smart Phone Music is playing."); }
    public void pause() { System.out.println("Smart Phone Music is paused."); }
    // Override annotation is recommend for over ridden methods
    public void repeat() { System.out.println("Smart Phone music is repeated."); }
}

public class InterfaceExample
{
    public static void main(String[] as) 
    {
        SmartPhone s = new SmartPhone();
        s.play();
        s.capture();
        s.call();

        Phone p = s;
        p.call();
        //p.play();

        ICamera ic = s;
        ic.capture();
        //ic.repeat();

        IMusicPlayer im = s;
        im.repeat();
        //im.call();

        IMusicPlayer im2 = new SmartPhone();
        im2.play();
    }
}

/*
Output :
--------
Smart Phone Music is playing.
Smart Phone is Capturing.
Phone is ringing
Phone is ringing
Smart Phone is Capturing.
Smart Phone music is repeated.
Smart Phone Music is playing.

*/