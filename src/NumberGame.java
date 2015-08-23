
import javax.microedition.midlet.MIDlet;
import javax.microedition.lcdui.Display;

public class NumberGame extends MIDlet 
{	
Game gm;
public NumberGame() 
{
gm = new Game(this);
}	
public void startApp() 
{
Display.getDisplay(this).setCurrent(gm);
}
public void pauseApp() { }
public void destroyApp(boolean unc) { }
}