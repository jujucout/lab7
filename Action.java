public abstract class Action {

    /**
     * member field of type game i named playerTurn
     */

    protected Game gameObject;
    protected int rowFromSquare;
    protected int colFromSquare;
    protected int rowToSquare;
    protected int colToSquare;

    /**
     * constructor with 5 parameters in this order. from square refers to unit on board
     * that is making action. to square parameters represent actions like moving to. both
     * exist for the rows and columns on the board square.
     * @param playerTurn
     * @param rowFromSquare
     * @param colFromSquare
     * @param rowToSquare
     * @param colToSquare
     */
    public void Action(Game gameObject, int rowFromSquare, int colFromSquare, int rowToSquare , int colToSquare){
        this.gameObject = gameObject;
        this.rowFromSquare = rowFromSquare;
        this.colFromSquare = colFromSquare;
        this.rowToSquare = rowToSquare;
        this.colToSquare = colToSquare;
    }




    /**
     * abstract method performAction that takes no parameters and returns nothing
     */
    public abstract void performAction();



}
