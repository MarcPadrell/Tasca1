package cat.urv.deim.asm.labs.log;

import cat.urv.deim.asm.labs.log.interfaces.ILog;

public class Log extends ConsoleLog implements ILog {

    public Log() {
    }

    @Override
    public void error(String tag, String message) {
        Log.e(ANSI_RED+tag, message+ANSI_RESET);
    }

    @Override
    public void warning(String tag, String message) {

        Log.w(ANSI_ORANGE+tag, ANSI_ORANGE+message+ANSI_RESET);
    }

    @Override
    public void debug(String tag, String message) {
        Log.d(ANSI_BLUE+tag, message+ANSI_RESET);
    }

    @Override
    public void info(String tag, String message) {
        Log.i(ANSI_BLACK+tag, message+ANSI_RESET);
    }

    @Override
    public void verbose(String tag, String message) {
        Log.v(ANSI_BLACK+tag, message+ANSI_RESET);
    }
}
