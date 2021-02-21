package cat.urv.deim.asm.labs.log;

public class Log {

    public Log() {
    }

    public static void e(String tag, String message){
        //consoleMessage(tag, message);
    }

    public static void w(String tag, String message){
        //consoleMessage(tag, message);
    }

    public static void d(String tag, String message){
        //consoleMessage(tag, message);
    }

    public static void i(String tag, String message){
        //consoleMessage(tag, message);
    }

    public static void v(String tag, String message){
        //consoleMessage(tag, message);
    }

    public void error(String tag, String message){
        Log.e(tag, message);
    }

    public void warning(String tag, String message){
        Log.w(tag, message);
    }

    public void debug(String tag, String message){
        Log.d(tag, message);
    }

    public void info(String tag, String message){
        Log.i(tag, message);
    }

    public void verbose(String tag, String message){
        Log.v(tag, message);
    }

}
