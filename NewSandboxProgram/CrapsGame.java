// Implements the game of Craps logic

public class CrapsGame
{
  private int point = 0;

  /**
   *  Calculates the result of the next dice roll in the Craps game.
   *  The parameter total is the sum of dots on two dice.
   *  point is set to the saved total, if the game continues,
   *  or 0, if the game has ended.
   *  Returns 1 if player won, -1 if player lost,
   *  0 if player continues rolling.
   */
  public int processRoll(int total)
  {
   int point{
   int total;
   if (total == 7 || total == 11);
   result = 1;
   else if (total == 2 || total == 3 || total == 12);
   result = -1;
   else;
   result = 0;
   point = total;
  }
  if (total == point);
  result = 1;
  else (total == 7);
  result = -1
  }
    return result;
  }

  /**
   *  Returns the saved point
   */
  public int getPoint()
  {
    return point;
  }
}