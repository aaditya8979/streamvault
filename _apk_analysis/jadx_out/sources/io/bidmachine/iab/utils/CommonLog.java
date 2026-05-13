package io.bidmachine.iab.utils;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import io.bidmachine.iab.utils.Logger;

/* JADX INFO: loaded from: classes4.dex */
public class CommonLog {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static final Logger f69385a = new Logger("CommonLog");

    public static boolean canSendDLog() {
        return f69385a.canSendDLog();
    }

    public static boolean canSendELog() {
        return f69385a.canSendELog();
    }

    public static boolean canSendWLog() {
        return f69385a.canSendWLog();
    }

    public static void d(@NonNull String str, @Nullable String str2, @Nullable Object... objArr) {
        f69385a.d(str, str2, objArr);
    }

    public static void e(@NonNull String str, @Nullable String str2, @Nullable Object... objArr) {
        f69385a.e(str, str2, objArr);
    }

    public static void e(@NonNull String str, @NonNull Throwable th2) {
        f69385a.e(str, th2);
    }

    public static void setLoggingLevel(@Nullable Logger.LogLevel logLevel) {
        f69385a.setLoggingLevel(logLevel);
    }
}
