package cat.urv.deim.asm.labs.log;

import cat.urv.deim.asm.labs.log.interfaces.IColor;
import cat.urv.deim.asm.labs.log.interfaces.ILog;

import static cat.urv.deim.asm.labs.log.ConsoleLog.consoleMessage;

public class Log implements ILog, IColor {

    public Log() {
    }

    public static void e(String tag, String message) {
        consoleMessage(tag, message, Log.ERROR);
    }

    public static void w(String tag, String message){
        consoleMessage(tag, message, Log.WARNING);
    }

    public static void d(String tag, String message){
        consoleMessage(tag, message, Log.DEBUG);
    }

    public static void i(String tag, String message){
        consoleMessage(tag, message, Log.INFO);
    }

    public static void v(String tag, String message){
        consoleMessage(tag, message, Log.VERBOSE);
    }


    @Override
    public void error(String tag, String message) {
        Log.e(tag, message);
    }

    @Override
    public void warning(String tag, String message) {
        Log.w(tag, message);
    }

    @Override
    public void debug(String tag, String message) {
        Log.d(tag, message);
    }

    @Override
    public void info(String tag, String message) {
        Log.i(tag, message);
    }

    @Override
    public void verbose(String tag, String message) {
        Log.v(tag, message);
    }
}
