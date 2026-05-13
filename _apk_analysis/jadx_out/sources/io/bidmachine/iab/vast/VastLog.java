package io.bidmachine.iab.vast;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import io.bidmachine.iab.utils.LogListener;
import io.bidmachine.iab.utils.Logger;

/* JADX INFO: loaded from: classes3.dex */
public class VastLog {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static final Logger f69458a = new Logger("VastLog");

    public static void addLogListener(@Nullable LogListener logListener) {
        f69458a.addLogListener(logListener);
    }

    public static boolean canSendDLog() {
        return f69458a.canSendDLog();
    }

    public static boolean canSendELog() {
        return f69458a.canSendELog();
    }

    public static boolean canSendWLog() {
        return f69458a.canSendWLog();
    }

    public static void d(@NonNull String str, @Nullable String str2, @Nullable Object... objArr) {
        f69458a.d(str, str2, objArr);
    }

    public static void e(@NonNull String str, @Nullable String str2, @Nullable Object... objArr) {
        f69458a.e(str, str2, objArr);
    }

    public static void e(@NonNull String str, @NonNull Throwable th2) {
        f69458a.e(str, th2);
    }

    public static boolean removeLogListener(@Nullable LogListener logListener) {
        return f69458a.removeLogListener(logListener);
    }

    public static void setLoggingLevel(@Nullable Logger.LogLevel logLevel) {
        f69458a.setLoggingLevel(logLevel);
    }
}
