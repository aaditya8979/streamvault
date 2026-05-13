package io.bidmachine.iab.utils;

import android.text.TextUtils;
import android.util.Log;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.CopyOnWriteArrayList;

/* JADX INFO: loaded from: classes11.dex */
public class Logger {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private static LogLevel f69428c = LogLevel.error;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final String f69429a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final List f69430b = new CopyOnWriteArrayList();

    public enum LogLevel {
        debug(1),
        info(2),
        warning(3),
        error(4),
        none(5);


        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final int f69431a;

        LogLevel(int i10) {
            this.f69431a = i10;
        }

        public int getValue() {
            return this.f69431a;
        }
    }

    public static /* synthetic */ class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ int[] f69432a;

        static {
            int[] iArr = new int[LogLevel.values().length];
            f69432a = iArr;
            try {
                iArr[LogLevel.debug.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f69432a[LogLevel.error.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f69432a[LogLevel.warning.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
        }
    }

    public Logger(@NonNull String str) {
        this.f69429a = str;
    }

    private static String a(String str, String str2) {
        return String.format("[%s] %s", str, str2);
    }

    private static String a(String str, String str2, Object... objArr) {
        String strA = a(str, str2);
        if (objArr == null || objArr.length == 0) {
            return strA;
        }
        try {
            return String.format(strA, objArr);
        } catch (Throwable unused) {
            return strA;
        }
    }

    private void a(LogLevel logLevel, String str) {
        int i10 = a.f69432a[logLevel.ordinal()];
        if (i10 == 1) {
            Log.d(this.f69429a, str);
        } else if (i10 == 2) {
            Log.e(this.f69429a, str);
        } else {
            if (i10 != 3) {
                return;
            }
            Log.w(this.f69429a, str);
        }
    }

    private void a(LogLevel logLevel, String str, String str2, Object... objArr) {
        if (TextUtils.isEmpty(str2)) {
            return;
        }
        boolean zB = b(logLevel);
        boolean zA = a();
        if (zB || zA) {
            String strA = a(str, str2, objArr);
            if (zB) {
                a(logLevel, strA);
            }
            if (zA) {
                b(logLevel, strA);
            }
        }
    }

    private boolean a() {
        return !this.f69430b.isEmpty();
    }

    private boolean a(LogLevel logLevel) {
        return b(logLevel) || a();
    }

    private void b(LogLevel logLevel, String str) {
        Iterator it = this.f69430b.iterator();
        while (it.hasNext()) {
            ((LogListener) it.next()).onLog(logLevel, this.f69429a, str);
        }
    }

    private boolean b(LogLevel logLevel) {
        LogLevel logLevel2 = f69428c;
        return logLevel2 != null && logLevel2.getValue() <= logLevel.getValue();
    }

    public void addLogListener(@Nullable LogListener logListener) {
        if (logListener != null) {
            this.f69430b.add(logListener);
        }
    }

    public boolean canSendDLog() {
        return a(LogLevel.debug);
    }

    public boolean canSendELog() {
        return a(LogLevel.error);
    }

    public boolean canSendWLog() {
        return a(LogLevel.warning);
    }

    public void d(@NonNull String str, @Nullable String str2, @Nullable Object... objArr) {
        a(LogLevel.debug, str, str2, objArr);
    }

    public void e(@NonNull String str, @Nullable String str2, @Nullable Object... objArr) {
        a(LogLevel.error, str, str2, objArr);
    }

    public void e(@NonNull String str, @NonNull Throwable th2) {
        a(LogLevel.error, str, th2.toString(), new Object[0]);
    }

    @Nullable
    public LogLevel getLoggingLevel() {
        return f69428c;
    }

    public boolean removeLogListener(@Nullable LogListener logListener) {
        return logListener != null && this.f69430b.remove(logListener);
    }

    public void setLoggingLevel(@Nullable LogLevel logLevel) {
        Log.d(this.f69429a, String.format("Changing logging level. From: %s, To: %s", f69428c, logLevel));
        f69428c = logLevel;
    }

    public void w(@NonNull String str, @Nullable String str2, @Nullable Object... objArr) {
        a(LogLevel.warning, str, str2, objArr);
    }
}
