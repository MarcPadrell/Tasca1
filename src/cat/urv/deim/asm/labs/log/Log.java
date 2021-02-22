package cat.urv.deim.asm.labs.log;

import cat.urv.deim.asm.labs.log.interfaces.IColor;
import cat.urv.deim.asm.labs.log.interfaces.ILog;

import static cat.urv.deim.asm.labs.log.ConsoleLog.consoleMessage;

public class Log implements ILog, IColor {
    public static final String ANSI_RED = "\u001B[31m";
    public static final String ANSI_GREEN = "\u001B[32m";
    public static final String ANSI_YELLOW = "\u001B[33m";
    public static final String ANSI_BLUE = "\u001B[34m";
    public static final String ANSI_PURPLE = "\u001B[35m";
    public static final String ANSI_RESET = "\u001B[0m";
    public Log() {
    }

    public static void e(String tag, String message) {
        consoleMessage(tag, ANSI_RED+message+ANSI_RESET, Log.ERROR);
    }

    public static void w(String tag, String message){
        consoleMessage(tag, ANSI_YELLOW+message+ANSI_RESET, Log.WARNING);
    }

    public static void d(String tag, String message){
        consoleMessage(tag, ANSI_BLUE+message+ANSI_RESET, Log.DEBUG);
    }

    public static void i(String tag, String message){
        consoleMessage(tag, ANSI_GREEN+message+ANSI_RESET, Log.INFO);
    }

    public static void v(String tag, String message){
        consoleMessage(tag, ANSI_PURPLE+message+ANSI_RESET, Log.VERBOSE);
    }


    @Override
    public void error(String tag, String message) {
        Log.e(tag, ANSI_RED+message+ANSI_RESET);
    }

    @Override
    public void warning(String tag, String message) {
        Log.w(tag, ANSI_YELLOW+message+ANSI_RESET);
    }

    @Override
    public void debug(String tag, String message) {
        Log.d(tag, ANSI_BLUE+message+ANSI_RESET);
    }

    @Override
    public void info(String tag, String message) {
        Log.i(tag, ANSI_GREEN+message+ANSI_RESET);
    }

    @Override
    public void verbose(String tag, String message) {
        Log.v(tag, ANSI_PURPLE+message+ANSI_RESET);
    }
}
