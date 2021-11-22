package pacman.controllers;

import pacman.controllers.Controller;
import pacman.game.Constants.MOVE;
import pacman.game.Game;
import pacman.game.Constants.GHOST;

import static pacman.game.Constants.*;

public class OurController extends Controller<MOVE> {

    public MOVE getMove(Game game, long timeDue) {
		int currentNodeIndex=game.getPacmanCurrentNodeIndex();
        int blinkyCurrentNode=game.getGhostCurrentNodeIndex(GHOST.BLINKY);
        return game.getNextMoveTowardsTarget(currentNodeIndex, blinkyCurrentNode, DM.PATH);
    }
    
}
