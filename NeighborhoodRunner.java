import org.code.neighborhood.*;

public class NeighborhoodRunner {
  public static void main(String[] args) {

BarnPainter ava = new BarnPainter();
    
  ava.getToPosition();
  ava.getmyPaint(32);
  ava.paintBarnOutline("gray");
  ava.paintBarnInside("red");
  ava.paintDoor("white");
  ava.painterBarnTop("white");
  ava.colorTopBarnIn("brown");
  ava.buildChimney("brown");
  }
}