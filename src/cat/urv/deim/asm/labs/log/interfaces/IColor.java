package cat.urv.deim.asm.labs.log.interfaces;

public interface IColor {
     String ANSI_RED = "\u001B[31m";
     String ANSI_GREEN = "\u001B[32m";
     String ANSI_YELLOW = "\u001B[33m";
     String ANSI_BLUE = "\u001B[34m";
     String ANSI_PURPLE = "\u001B[35m";
     String ANSI_RESET = "\u001B[0m";

     String ERROR = ANSI_RED+"(E)"+ANSI_RESET;
     String WARNING = ANSI_YELLOW +"(W)"+ANSI_RESET;
     String DEBUG = ANSI_BLUE+"(D)"+ANSI_RESET;
     String INFO = ANSI_GREEN+"(I)"+ANSI_RESET;
     String VERBOSE = ANSI_PURPLE+"(V)"+ANSI_RESET;


}
