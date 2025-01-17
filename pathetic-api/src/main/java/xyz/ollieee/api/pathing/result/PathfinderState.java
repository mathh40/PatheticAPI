package xyz.ollieee.api.pathing.result;

public enum PathfinderState {
    
    /**
     * The Path was successfully found for a given strategy
     */
    FOUND,
    /**
     * The Path wasn't found, either it reached its max search depth or it couldn't find more locations
     */
    FAILED,

}
