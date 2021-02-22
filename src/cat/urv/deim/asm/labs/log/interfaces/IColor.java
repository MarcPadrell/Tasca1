package cat.urv.deim.asm.labs.log.interfaces;

public interface IColor {

     String ERROR = "(E)";
     String WARNING = "(W)";
     String DEBUG = "(D)";
     String INFO = "(I)";
     String VERBOSE = "(V)";

     String ANSI_RED = "\u001B[31m";
     String ANSI_ORANGE = "\u001B[33m";
     String ANSI_BLUE = "\u001B[34m";
     String ANSI_BLACK = "\u001B[30m";
     String ANSI_RESET = "\u001B[0m";


}
