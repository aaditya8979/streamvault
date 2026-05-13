package rs;

import org.slf4j.event.Level;

/* JADX INFO: compiled from: Logger.java */
/* JADX INFO: loaded from: classes2.dex */
public interface c {
    default us.b atDebug() {
        return isDebugEnabled() ? makeLoggingEventBuilder(Level.DEBUG) : us.d.a();
    }

    default us.b atError() {
        return isErrorEnabled() ? makeLoggingEventBuilder(Level.ERROR) : us.d.a();
    }

    default us.b atInfo() {
        return isInfoEnabled() ? makeLoggingEventBuilder(Level.INFO) : us.d.a();
    }

    default us.b atLevel(Level level) {
        return isEnabledForLevel(level) ? makeLoggingEventBuilder(level) : us.d.a();
    }

    default us.b atTrace() {
        return isTraceEnabled() ? makeLoggingEventBuilder(Level.TRACE) : us.d.a();
    }

    default us.b atWarn() {
        return isWarnEnabled() ? makeLoggingEventBuilder(Level.WARN) : us.d.a();
    }

    void debug(String str, Throwable th2);

    boolean isDebugEnabled();

    default boolean isEnabledForLevel(Level level) {
        int i10 = level.toInt();
        if (i10 == 0) {
            return isTraceEnabled();
        }
        if (i10 == 10) {
            return isDebugEnabled();
        }
        if (i10 == 20) {
            return isInfoEnabled();
        }
        if (i10 == 30) {
            return isWarnEnabled();
        }
        if (i10 == 40) {
            return isErrorEnabled();
        }
        throw new IllegalArgumentException("Level [" + level + "] not recognized.");
    }

    boolean isErrorEnabled();

    boolean isInfoEnabled();

    boolean isTraceEnabled();

    boolean isWarnEnabled();

    default us.b makeLoggingEventBuilder(Level level) {
        return new us.a(this, level);
    }

    void trace(String str);

    void warn(String str);
}
