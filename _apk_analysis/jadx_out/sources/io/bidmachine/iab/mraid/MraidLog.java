package io.bidmachine.iab.mraid;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import io.bidmachine.iab.utils.LogListener;
import io.bidmachine.iab.utils.Logger;

/* JADX INFO: loaded from: classes2.dex */
public class MraidLog {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static final Logger f69251a = new Logger("MraidLog");

    public static void addLogListener(@Nullable LogListener logListener) {
        f69251a.addLogListener(logListener);
    }

    public static boolean canSendDLog() {
        return f69251a.canSendDLog();
    }

    public static boolean canSendELog() {
        return f69251a.canSendELog();
    }

    public static boolean canSendWLog() {
        return f69251a.canSendWLog();
    }

    public static void d(@NonNull String str, @Nullable String str2, @Nullable Object... objArr) {
        f69251a.d(str, str2, objArr);
    }

    public static void e(@NonNull String str, @Nullable String str2, @Nullable Object... objArr) {
        f69251a.e(str, str2, objArr);
    }

    public static void e(@NonNull String str, @NonNull Throwable th2) {
        f69251a.e(str, th2);
    }

    @Nullable
    public static Logger.LogLevel getLoggingLevel() {
        return f69251a.getLoggingLevel();
    }

    public static boolean removeLogListener(@Nullable LogListener logListener) {
        return f69251a.removeLogListener(logListener);
    }

    public static void setLoggingLevel(@Nullable Logger.LogLevel logLevel) {
        f69251a.setLoggingLevel(logLevel);
    }

    public static void w(@NonNull String str, @Nullable String str2, @Nullable Object... objArr) {
        f69251a.w(str, str2, objArr);
    }
}
