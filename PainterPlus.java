import org.code.neighborhood.*;

public class PainterPlus extends Painter {
  
//turnRight
public void turnRight() {
    turnLeft();
    turnLeft();
    turnLeft();
   
  }

  //takes all the paint when the painter is on the bucket
    public void takeAllPaint() {
    while (isOnBucket()) {
      takePaint();
    }
  }

  

//moves till the edge of the grid. 
  public void moveFast() {
    while (canMove()) {
      move();
    }
  }

  //paints until the amount of paint is empty
  public void paintToEmpty(String color){
  while(hasPaint()){
  paint(color);
  move();
  }
  }

  //paints a donut.
 public void paintDonut(String color) {
    while (hasPaint()) {
      move();
      turnRight();
      paint(color);
      move();
      paint(color);
    }
  }

//move forward 4 spaces while painting each space. 
public void moveForwardPaint4(String color){
  move();
  paint(color);
  move();
  paint(color);
  move();
  paint(color);
   move();
  paint(color);
  
}
}

