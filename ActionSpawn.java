public class ActionSpawn extends Action {

    public void ActionSpawn(Game gameObject, int rowFromSquare, int colFromSquare, int rowToSquare , int colToSquare) {
        super(gameObject, rowFromSquare, colFromSquare, rowToSquare, colToSquare);
    }

    public void performAction(){
        /**
         * call the unit on the from squares spawn method
         */
        Unit unitPerformingAction = gameObject.getGameBoard().getBoardSquares()[this.rowFromSquare][this.colFromSquare].getUnit().spawn();

        /**
         * add unit that was just created to the current team
         */

        gameObject.getGameBoard().getBoardSquares()[this.rowToSquare][this.colToSquare].addUnit(unitPerformingAction);

        /**
         * put unit that was just created to the current team
         */
        gameObject.getGameBoard().getBoardSquares()[this.unitToBeMoved].setUnit(unitPerformingAction);

        /**
         * change the turn
         */
        gameObject.changeTurn();
    }
}
