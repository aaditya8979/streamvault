package com.moloco.sdk.internal;

import android.text.TextUtils;
import android.util.Log;
import androidx.annotation.VisibleForTesting;
import androidx.compose.runtime.internal.StabilityInferred;
import androidx.core.app.NotificationCompat;
import com.moloco.sdk.internal.MolocoLogger;
import java.util.Iterator;
import java.util.LinkedHashSet;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes5.dex */
@StabilityInferred(parameters = 0)
public final class MolocoLogger {

    @NotNull
    private static final String MOLOCO_TAG = "Moloco";

    @NotNull
    public static final MolocoLogger INSTANCE = new MolocoLogger();

    @NotNull
    private static c configuration = new d(new b());

    @NotNull
    private static final LinkedHashSet<LoggerListener> listeners = new LinkedHashSet<>();
    public static final int $stable = 8;

    public interface LoggerListener {
        void onLog(@NotNull String str, @NotNull String str2);
    }

    public interface a {
        boolean a();
    }

    public static final class b implements a {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        @NotNull
        public static final a f45914b = new a(null);

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public boolean f45915a;

        public static final class a {
            public a() {
            }

            public /* synthetic */ a(tn.i iVar) {
                this();
            }
        }

        public b() {
            gn.a.b(false, false, null, null, 0, new sn.a() { // from class: com.moloco.sdk.internal.d
                @Override // sn.a
                public final Object invoke() {
                    return MolocoLogger.b.a(this.f46006b);
                }
            }, 31, null);
        }

        public static final bn.r a(b bVar) {
            bVar.c(bVar.d());
            return bn.r.f5635a;
        }

        @Override // com.moloco.sdk.internal.MolocoLogger.a
        public boolean a() {
            return this.f45915a;
        }

        public final String b(String str) {
            try {
                Object objInvoke = Class.forName("android.os.SystemProperties").getMethod("get", String.class).invoke(null, str);
                tn.p.i(objInvoke, "null cannot be cast to non-null type kotlin.String");
                String str2 = (String) objInvoke;
                try {
                    if (TextUtils.isEmpty(str2)) {
                        return null;
                    }
                } catch (Exception unused) {
                }
                return str2;
            } catch (Exception unused2) {
                return null;
            }
        }

        public void c(boolean z10) {
            this.f45915a = z10;
        }

        public final boolean d() {
            return Boolean.parseBoolean(b("debug.moloco.internal_logging"));
        }
    }

    public interface c {
        void a(boolean z10);

        boolean a();

        boolean b();

        boolean c();
    }

    public static final class d implements c {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        @NotNull
        public final a f45916a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public boolean f45917b;

        public d(@NotNull a aVar) {
            tn.p.k(aVar, "adb");
            this.f45916a = aVar;
        }

        @Override // com.moloco.sdk.internal.MolocoLogger.c
        public void a(boolean z10) {
            this.f45917b = z10;
        }

        @Override // com.moloco.sdk.internal.MolocoLogger.c
        public boolean a() {
            return this.f45916a.a();
        }

        @Override // com.moloco.sdk.internal.MolocoLogger.c
        public boolean b() {
            return this.f45917b;
        }

        @Override // com.moloco.sdk.internal.MolocoLogger.c
        public boolean c() {
            return false;
        }
    }

    private MolocoLogger() {
    }

    public static final void addListener(@NotNull LoggerListener loggerListener) {
        tn.p.k(loggerListener, "loggerListener");
        listeners.add(loggerListener);
    }

    public static /* synthetic */ void debug$default(MolocoLogger molocoLogger, String str, String str2, boolean z10, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            str = MOLOCO_TAG;
        }
        if ((i10 & 4) != 0) {
            z10 = false;
        }
        molocoLogger.debug(str, str2, z10);
    }

    public static /* synthetic */ void debugBuildLog$default(MolocoLogger molocoLogger, String str, String str2, boolean z10, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            str = MOLOCO_TAG;
        }
        if ((i10 & 4) != 0) {
            z10 = false;
        }
        molocoLogger.debugBuildLog(str, str2, z10);
    }

    public static /* synthetic */ void error$default(MolocoLogger molocoLogger, String str, String str2, Throwable th2, boolean z10, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            str = MOLOCO_TAG;
        }
        if ((i10 & 4) != 0) {
            th2 = null;
        }
        if ((i10 & 8) != 0) {
            z10 = false;
        }
        molocoLogger.error(str, str2, th2, z10);
    }

    private final StackTraceElement findMostRelevantStackTrace(StackTraceElement[] stackTraceElementArr) {
        for (StackTraceElement stackTraceElement : stackTraceElementArr) {
            if (!tn.p.f(stackTraceElement.getClassName(), INSTANCE.getClass().getCanonicalName())) {
                return stackTraceElement;
            }
        }
        return (StackTraceElement) cn.r.W(stackTraceElementArr);
    }

    private final void fireListeners(String str, String str2) {
        Iterator<T> it = listeners.iterator();
        while (it.hasNext()) {
            ((LoggerListener) it.next()).onLog(INSTANCE.prefixWithMolocoName(str), str2);
        }
    }

    public static final boolean getLogEnabled() {
        c cVar = configuration;
        return cVar.c() || cVar.a() || cVar.b();
    }

    public static /* synthetic */ void getLogEnabled$annotations() {
    }

    public static /* synthetic */ void info$default(MolocoLogger molocoLogger, String str, String str2, Throwable th2, boolean z10, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            str = MOLOCO_TAG;
        }
        if ((i10 & 4) != 0) {
            th2 = null;
        }
        if ((i10 & 8) != 0) {
            z10 = false;
        }
        molocoLogger.info(str, str2, th2, z10);
    }

    private final String prefixWithMethodName(String str) {
        try {
            return '[' + getCallingMethodName() + "] " + str;
        } catch (Exception unused) {
            return str;
        }
    }

    private final String prefixWithMolocoName(String str) {
        if (bo.a0.W(str, MOLOCO_TAG, false, 2, null)) {
            return str;
        }
        return MOLOCO_TAG + str;
    }

    public static final void removeListener(@NotNull LoggerListener loggerListener) {
        tn.p.k(loggerListener, "loggerListener");
        listeners.remove(loggerListener);
    }

    public static final void setLogEnabled(boolean z10) {
        configuration.a(z10);
    }

    public static /* synthetic */ void tlog$default(MolocoLogger molocoLogger, String str, Throwable th2, int i10, Object obj) {
        if ((i10 & 2) != 0) {
            th2 = null;
        }
        molocoLogger.tlog(str, th2);
    }

    public static /* synthetic */ void warn$default(MolocoLogger molocoLogger, String str, String str2, Throwable th2, boolean z10, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            str = MOLOCO_TAG;
        }
        if ((i10 & 4) != 0) {
            th2 = null;
        }
        if ((i10 & 8) != 0) {
            z10 = false;
        }
        molocoLogger.warn(str, str2, th2, z10);
    }

    public final void debug(@NotNull String str, @NotNull String str2, boolean z10) {
        tn.p.k(str, "tag");
        tn.p.k(str2, NotificationCompat.CATEGORY_MESSAGE);
        if (getLogEnabled() || z10) {
            String strPrefixWithMolocoName = prefixWithMolocoName(str);
            String strPrefixWithMethodName = prefixWithMethodName(str2);
            Log.d(strPrefixWithMolocoName, strPrefixWithMethodName);
            fireListeners(strPrefixWithMolocoName, strPrefixWithMethodName);
        }
    }

    public final void debugBuildLog(@NotNull String str, @NotNull String str2, boolean z10) {
        tn.p.k(str, "tag");
        tn.p.k(str2, NotificationCompat.CATEGORY_MESSAGE);
    }

    public final void error(@NotNull String str, @NotNull String str2, @Nullable Throwable th2, boolean z10) {
        tn.p.k(str, "tag");
        tn.p.k(str2, NotificationCompat.CATEGORY_MESSAGE);
        if (getLogEnabled() || z10) {
            String strPrefixWithMolocoName = prefixWithMolocoName(str);
            String strPrefixWithMethodName = prefixWithMethodName(str2);
            Log.e(strPrefixWithMolocoName, strPrefixWithMethodName, th2);
            fireListeners(strPrefixWithMolocoName, strPrefixWithMethodName);
        }
    }

    @NotNull
    public final String getCallingMethodName() throws ClassNotFoundException {
        StackTraceElement[] stackTrace = new Throwable().getStackTrace();
        tn.p.j(stackTrace, "getStackTrace(...)");
        StackTraceElement stackTraceElementFindMostRelevantStackTrace = findMostRelevantStackTrace(stackTrace);
        String className = stackTraceElementFindMostRelevantStackTrace.getClassName();
        stackTraceElementFindMostRelevantStackTrace.getMethodName();
        Class<?> cls = Class.forName(className);
        cls.isAnonymousClass();
        cls.getDeclaredMethods();
        String methodName = stackTraceElementFindMostRelevantStackTrace.getMethodName();
        if (tn.p.f(methodName, "invokeSuspend")) {
            String className2 = stackTraceElementFindMostRelevantStackTrace.getClassName();
            tn.p.j(className2, "getClassName(...)");
            methodName = bo.d0.i1(bo.d0.M0(className2, "$1"), "$", null, 2, null);
        }
        tn.p.j(methodName, "let(...)");
        return methodName;
    }

    public final void info(@NotNull String str, @NotNull String str2, @Nullable Throwable th2, boolean z10) {
        tn.p.k(str, "tag");
        tn.p.k(str2, NotificationCompat.CATEGORY_MESSAGE);
        if (getLogEnabled() || z10) {
            String strPrefixWithMolocoName = prefixWithMolocoName(str);
            String strPrefixWithMethodName = prefixWithMethodName(str2);
            Log.i(strPrefixWithMolocoName, strPrefixWithMethodName, th2);
            fireListeners(strPrefixWithMolocoName, strPrefixWithMethodName);
        }
    }

    @VisibleForTesting(otherwise = 5)
    public final void setConfiguration$moloco_sdk_release(@NotNull c cVar) {
        tn.p.k(cVar, com.safedk.android.utils.i.f53156c);
        configuration = cVar;
    }

    public final void tlog(@NotNull String str, @Nullable Throwable th2) {
        tn.p.k(str, NotificationCompat.CATEGORY_MESSAGE);
        Log.i("==tlog==", prefixWithMethodName(str), th2);
    }

    public final void warn(@NotNull String str, @NotNull String str2, @Nullable Throwable th2, boolean z10) {
        tn.p.k(str, "tag");
        tn.p.k(str2, NotificationCompat.CATEGORY_MESSAGE);
        if (getLogEnabled() || z10) {
            String strPrefixWithMolocoName = prefixWithMolocoName(str);
            String strPrefixWithMethodName = prefixWithMethodName(str2);
            Log.w(strPrefixWithMolocoName, strPrefixWithMethodName, th2);
            fireListeners(strPrefixWithMolocoName, strPrefixWithMethodName);
        }
    }
}
