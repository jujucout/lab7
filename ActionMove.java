
public class ActionMove extends Action{

    /** derived from action class so extends
     *
     */


    /**
     * this class action move will represent an action the user is able to take where they move on their own unit  from
     * the "from square" on the board to the "to square" on the board
     */

    public void ActionMove(Game gameObject, int rowFromSquare, int colFromSquare, int rowToSquare , int colToSquare){
        super(playerTurn,rowFromSquare,colFromSquare,rowToSquare,colToSquare);
        //this.playerTurn = playerTurn;
        //this.rowFromSquare = rowFromSquare;
       // this.colFromSquare = colFromSquare;
       // this.rowToSquare = rowToSquare;
        //this.colToSquare = colToSquare;

       // super.performAction();
    }

    public void performAction() {

        /**
         * remove unit on "from square"
         */

        Unit unitToBeMoved = gameObject.getGameBoard().getBoardSquares()[this.rowFromSquare][this.colFromSquare].removeUnit();



        /**
         * set unit on "to square"
         */

        gameObject.getGameBoard().getBoardSquares()[this.rowToSquare][this.colToSquare].setUnit(unitToBeMoved);



        /**
         * change the turn
         */

        gameObject.changeTurn();

    }
}
