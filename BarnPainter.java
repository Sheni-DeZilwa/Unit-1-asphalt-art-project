
import org.code.neighborhood.*;

public class BarnPainter extends StartPainter {
  
//painter paints the outline of the barn.
//The painter uses this method that uses sequencing, selection, and iteration
public void paintBarnOutline(String color){
    moveForwardTwice();
    moveForwardTwice();
    paintTwo(color);
    move();
    paintTwo(color);
    moveFast();
  //next if-statement to  just paint the rest of the outline including the roof and walls/floor
    if(!canMove("east")){
      moveEastTurnSouth();
      move();
      turnRight();
      moveForwardTwice();
      move();
      turnLeft();
      turnLeft();
      paintDiagonal(color);
      paintBottom(color);
      turnRight();
    }
  
    moveForwardPaint4(color);
    move();
    paint(color);
    gotoTopBarn();
    turnRight();
    turnRight();
    paintupsideDiagonal(color);
  }
  
//Painter paints the inside of the barn
//Painter uses methods fromt the StartPaitner class. 
public void paintBarnInside(String color){
  turnRight(); 
  moveForwardTwice();
  moveForwardTwice();
  turnRight();
  move();
  paintInside(color);
  turnRight();
  paintMove(color);
  move();
  turnRight();
  paintInside(color);
  turnRight();
  paintMove(color);
  turnRight();
  paintInside(color);
  turnRight();
  move();
  turnRight();
  paintInside(color);
  turnRight();
  move(); 
  turnRight();
}

//painter paints the door of the barn using white
public void paintDoor(String color){
  move();
  moveForwardTwice();
  paint(color);
  paintMove2(color);
  paintMove2(color);
  paintMove2(color);
  paintMove2(color);
  move();
  turnRight();
  move();
  paint(color);
  move(); 
  paint(color);
  turnLeft();
  move();
  turnLeft();
  paintMove2(color);
} 

//Painter paints the top of the barn making a while square and gets to position to fill in the top of the barn. 
public void painterBarnTop(String color){
  turnLeft();
  turnLeft();
  move();
  turnRight();
  moveForwardTwice();
  paintSquare("white");
  turnRight();
  moveForwardTwice();
  turnRight();
  moveForwardTwice();
  move();
  turnRight();
  move();
  turnRight();
  turnRight();
 moveForwardTwice();
  moveForwardTwice();
//gets to position
  turnLeft();
  turnLeft();
  move();
  turnRight();

}

//colors in the Top part of the Barn
public void colorTopBarnIn(String color){
  //gets the Painter into position part 2
  turnLeft();
  moveForwardTwice();


  // Paints the top part of the roof
  move();
  paint(color);
  move();
  paint(color);
  move();

  // Move down to start painting the inside
  turnRight();
  paint(color);
  move();
  

  // Left side of the top part of the bar is painted.
  paint(color);
  turnLeft();
  move();
  paint(color);
  move();
  turnRight();
  move();
  turnRight();
  paintMove2(color);
  turnRight();
  turnRight();
  move();
  turnLeft();
  moveForwardPaint4(color);
  turnLeft();
  turnLeft();
  move();
  paint(color);
  moveForwardTwice();
  moveForwardPaint4(color);
  paintMove(color);
  //Paint Right section of the top part of the barn.
  turnRight();
  move();
  turnRight(); 
  move();
  paint(color);
  paint2(color);
  turnLeft();
  move();
  turnLeft();
  paint2On(color);
  turnRight();
  move();
  turnRight();
  move();
  paint(color);
}

//painter paints the Chimney.
public void buildChimney(String color){
  turnLeft();
  turnLeft();
  moveForwardTwice();
  turnRight();
  paint2On(color);
  move();
  paint(color);
  turnRight();
  move();
  turnRight();
  paint2On(color);
}
  
}