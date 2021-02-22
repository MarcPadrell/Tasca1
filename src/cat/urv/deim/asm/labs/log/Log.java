package cat.urv.deim.asm.labs.log;

import cat.urv.deim.asm.labs.log.interfaces.IColor;
import cat.urv.deim.asm.labs.log.interfaces.ILog;

import static cat.urv.deim.asm.labs.log.ConsoleLog.consoleMessage;

public class Log implements ILog, IColor {

    public Log() {
    }

    public static void e(String tag, String message) {
        consoleMessage(ANSI_RED,ANSI_RED+tag+ANSI_RESET, ANSI_RED+message+ANSI_RESET, Log.ERROR);
    }

    public static void w(String tag, String message){
        consoleMessage(ANSI_ORANGE,ANSI_ORANGE+tag, ANSI_ORANGE+message+ANSI_RESET, Log.WARNING);
    }

    public static void d(String tag, String message){

        consoleMessage(ANSI_BLUE,ANSI_BLUE+tag, ANSI_BLUE+message+ANSI_RESET, Log.DEBUG);
    }

    public static void i(String tag, String message){

        consoleMessage(ANSI_BLACK,ANSI_BLACK+tag, ANSI_BLACK+message+ANSI_RESET, Log.INFO);
    }

    public static void v(String tag, String message){
        consoleMessage(ANSI_BLACK,ANSI_BLACK+tag, ANSI_BLACK+message+ANSI_RESET, Log.VERBOSE);
    }


    @Override
    public void error(String tag, String message) {
        Log.e(ANSI_RED+tag, ANSI_RED+message+ANSI_RESET);
    }

    @Override
    public void warning(String tag, String message) {

        Log.w(ANSI_ORANGE+tag, ANSI_ORANGE+message+ANSI_RESET);
    }

    @Override
    public void debug(String tag, String message) {
        Log.d(ANSI_BLUE+tag, ANSI_BLUE+message+ANSI_RESET);
    }

    @Override
    public void info(String tag, String message) {
        Log.i(ANSI_BLACK+tag, ANSI_BLACK+message+ANSI_RESET);
    }

    @Override
    public void verbose(String tag, String message) {
        Log.v(ANSI_BLACK+tag, ANSI_BLACK+message+ANSI_RESET);
    }
}
