package cat.urv.deim.asm.labs.log.interfaces;

public interface ILog {


    void error(String tag, String message);

    void warning(String tag, String message);

    void debug(String tag, String message);

    void info(String tag, String message);

    void verbose(String tag, String message);



}
