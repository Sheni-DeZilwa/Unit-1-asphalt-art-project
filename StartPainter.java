
import org.code.neighborhood.*;

public class StartPainter extends PainterPlus {

//paint on one block move to another and paint that block
public void paintTwo(String color){
  paint(color);
  move();
  paint(color);
}

public void moveForwardTwice(){
  move();
  move();
}
  
//from the start of the grid gets to position to make the start of the barn.
public void getToPosition(){
  turnRight();
  move();
  move();
  turnLeft();
  }

//establishes the amount of paint.
public void getmyPaint(int gridSize) {
  setPaint(gridSize * gridSize);
}
  
//While painter can face east and can move, move,
  //if it can move south, make it turn Right
  public void moveEastTurnSouth() {
    while (isFacingEast()) {
      if(canMove()) {
        move();
      }

      if (canMove("south")) {
        turnRight();
      }
    }
  }

  //Paint a diagonal to outline the top part of the barn.
public void paintDiagonal(String color){
//while painter has the paint, can move east, or move south,
//and if they're facing east paint, if can move move then turn right and if can move, move. 
while(hasPaint() && (canMove("east")) || canMove("south")){
    if(isFacingEast()){
      paint(color);
    
    if(canMove()){
    move();
  }
    turnRight();
  
    if(canMove()){
      move();
    }
  }
  
//if has paint and is facing south, paint, if can move, 
  //move then turn left and move if possible.
  if(hasPaint()){
    if(isFacingSouth()){
      paint(color);
    
    if(canMove()){
    move();
  }
    turnLeft();

   if(canMove()){
    move();
  }
  }
  } 
}

//get the position of painting the bottom of the part ready.
turnRight();
turnRight();
}
  
//paitns the bottom of the barn
  public void paintBottom(String color){
 while(hasPaint() && canMove("west")){
   paint(color);
   move();
 }
    paint(color);
  }
  
//gets the painter to the top of the barn.  
    public void gotoTopBarn(){
    moveForwardTwice();
    moveForwardTwice();
    turnRight();
    moveForwardTwice();
    moveForwardTwice();
  }

  //make a diagonal going up instead of down compared to the other one, uses west instead of south.
  public void paintupsideDiagonal(String color){
while(hasPaint() && (canMove("west")) || canMove("south")){
    if(isFacingWest()){
      paint(color);
    
    if(canMove()){
    move();
  }
    turnLeft();
  
    if(canMove()){
      move();
    }
  }
  if(hasPaint()){
    if(isFacingSouth()){
      paint(color);
    
    if(canMove()){
    move();
  }
    turnRight();

   if(canMove()){
    move();
  }
  }
  } 
  }
  }

  //painter paints the (rows) inside of the barn.
  public void paintInside(String color){
 paint(color);
 move();
 paint(color);
 move();
 paint(color);
 move();
 paint(color);
 move();
 paint(color);
 move();
 paint(color);
 move();
 paint(color);
 move();
 paint(color);
 move();
 paint(color);
 move();
 paint(color);

}

  //painter moves paints, then moves and paints. 
  public void paintMove(String color){
  
    move();
    paint(color);
    move();
    paint(color); 
    
  }

  //painter paints move and does that 2 more times then turns right.
  public void paintMove2(String color){
    paint(color);
    move();
    paint(color);
    move();
    paint(color);
    move();
    turnRight();
  }


  //paints a square for the barn to act as a window. 
  public void paintSquare(String color){
    paint(color);
    move();
    paint(color);
    turnRight();
    move();
    paint(color);
    turnRight();
    move();
    paint(color);
    move();
  }

  //moves then paints, and moves and paints.
  public void paint2(String color){
  move();
  paint(color);
  move();
  paint(color);
 
  }

  //paints then moves and then paints again. 
  public void paint2On(String color){
  paint(color);
  move();
  paint(color);
  }
}

  

