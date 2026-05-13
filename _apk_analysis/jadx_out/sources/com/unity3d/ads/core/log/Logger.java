package com.unity3d.ads.core.log;

import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import sn.a;

/* JADX INFO: compiled from: Logger.kt */
/* JADX INFO: loaded from: classes10.dex */
public interface Logger {

    /* JADX INFO: compiled from: Logger.kt */
    public static final class DefaultImpls {
        public static /* synthetic */ void error$default(Logger logger, String str, Throwable th2, int i10, Object obj) {
            if (obj != null) {
                throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: error");
            }
            if ((i10 & 2) != 0) {
                th2 = null;
            }
            logger.error(str, th2);
        }

        public static /* synthetic */ void trace$default(Logger logger, String str, Throwable th2, int i10, Object obj) {
            if (obj != null) {
                throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: trace");
            }
            if ((i10 & 2) != 0) {
                th2 = null;
            }
            logger.trace(str, th2);
        }
    }

    void debug(@NotNull String str);

    void debug(@NotNull a<String> aVar);

    void error(@NotNull String str, @Nullable Throwable th2);

    @NotNull
    LogLevel getLogLevel();

    void info(@NotNull String str);

    void setLogLevel(@NotNull LogLevel logLevel);

    void trace(@NotNull String str, @Nullable Throwable th2);
}
