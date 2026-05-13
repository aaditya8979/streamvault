package com.moloco.sdk.acm.services;

import android.util.Log;
import androidx.core.app.NotificationCompat;
import bn.r;
import bo.a0;
import bo.d0;
import java.util.ArrayList;
import java.util.Iterator;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p000do.i;
import p000do.l0;
import p000do.w0;
import sn.p;

/* JADX INFO: loaded from: classes7.dex */
public final class e {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NotNull
    public static final e f45892a = new e();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @NotNull
    public static final l0 f45893b = kotlinx.coroutines.d.a(w0.c());

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @NotNull
    public static final ArrayList<a> f45894c = new ArrayList<>();

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static boolean f45895d = com.moloco.sdk.acm.services.a.f45883a.a("debug.moloco.enable_logs");

    public interface a {
        void a(@NotNull String str, @NotNull String str2);
    }

    @jn.d(c = "com.moloco.sdk.acm.services.MolocoMetricsLogger$fireListeners$1", f = "MolocoMetricsLogger.kt", l = {}, m = "invokeSuspend")
    public static final class b extends SuspendLambda implements p<l0, hn.c<? super r>, Object> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public int f45896a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final /* synthetic */ String f45897b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final /* synthetic */ String f45898c;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public b(String str, String str2, hn.c<? super b> cVar) {
            super(2, cVar);
            this.f45897b = str;
            this.f45898c = str2;
        }

        @Override // sn.p
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final Object mo2invoke(l0 l0Var, hn.c<? super r> cVar) {
            return ((b) create(l0Var, cVar)).invokeSuspend(r.f5635a);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final hn.c<r> create(Object obj, hn.c<?> cVar) {
            return new b(this.f45897b, this.f45898c, cVar);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            in.a.g();
            if (this.f45896a != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            kotlin.c.b(obj);
            ArrayList arrayList = e.f45894c;
            String str = this.f45897b;
            String str2 = this.f45898c;
            Iterator it = arrayList.iterator();
            while (it.hasNext()) {
                ((a) it.next()).a(e.f45892a.k(str), str2);
            }
            return r.f5635a;
        }
    }

    public static /* synthetic */ void e(e eVar, String str, String str2, Throwable th2, boolean z10, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            str = "ACM";
        }
        if ((i10 & 4) != 0) {
            th2 = null;
        }
        if ((i10 & 8) != 0) {
            z10 = false;
        }
        eVar.h(str, str2, th2, z10);
    }

    public static /* synthetic */ void f(e eVar, String str, String str2, boolean z10, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            str = "ACM";
        }
        if ((i10 & 4) != 0) {
            z10 = false;
        }
        eVar.i(str, str2, z10);
    }

    public static /* synthetic */ void l(e eVar, String str, String str2, Throwable th2, boolean z10, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            str = "ACM";
        }
        if ((i10 & 4) != 0) {
            th2 = null;
        }
        if ((i10 & 8) != 0) {
            z10 = false;
        }
        eVar.n(str, str2, th2, z10);
    }

    public static /* synthetic */ void m(e eVar, String str, String str2, boolean z10, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            str = "ACM";
        }
        if ((i10 & 4) != 0) {
            z10 = false;
        }
        eVar.o(str, str2, z10);
    }

    public final StackTraceElement a(StackTraceElement[] stackTraceElementArr) {
        for (StackTraceElement stackTraceElement : stackTraceElementArr) {
            if (!tn.p.f(stackTraceElement.getClassName(), f45892a.getClass().getCanonicalName())) {
                return stackTraceElement;
            }
        }
        return (StackTraceElement) cn.r.W(stackTraceElementArr);
    }

    public final String c(String str) {
        try {
            return '[' + j() + "] " + str;
        } catch (Exception unused) {
            return str;
        }
    }

    public final void g(String str, String str2) {
        i.d(f45893b, null, null, new b(str, str2, null), 3, null);
    }

    public final void h(@NotNull String str, @NotNull String str2, @Nullable Throwable th2, boolean z10) {
        tn.p.k(str, "tag");
        tn.p.k(str2, NotificationCompat.CATEGORY_MESSAGE);
        if (f45895d || z10) {
            String strK = k(str);
            String strC = c(str2);
            Log.e(strK, strC, th2);
            g(strK, strC);
        }
    }

    public final void i(@NotNull String str, @NotNull String str2, boolean z10) {
        tn.p.k(str, "tag");
        tn.p.k(str2, NotificationCompat.CATEGORY_MESSAGE);
        if (f45895d || z10) {
            String strK = k(str);
            String strC = c(str2);
            Log.d(strK, strC);
            g(strK, strC);
        }
    }

    @NotNull
    public final String j() throws ClassNotFoundException {
        StackTraceElement[] stackTrace = new Throwable().getStackTrace();
        tn.p.j(stackTrace, "getStackTrace(...)");
        StackTraceElement stackTraceElementA = a(stackTrace);
        String className = stackTraceElementA.getClassName();
        stackTraceElementA.getMethodName();
        Class<?> cls = Class.forName(className);
        cls.isAnonymousClass();
        cls.getDeclaredMethods();
        String methodName = stackTraceElementA.getMethodName();
        if (tn.p.f(methodName, "invokeSuspend")) {
            String className2 = stackTraceElementA.getClassName();
            tn.p.j(className2, "getClassName(...)");
            methodName = d0.i1(d0.M0(className2, "$1"), "$", null, 2, null);
        }
        tn.p.j(methodName, "let(...)");
        return methodName;
    }

    public final String k(String str) {
        if (a0.W(str, "ACM", false, 2, null)) {
            return str;
        }
        return "ACM" + str;
    }

    public final void n(@NotNull String str, @NotNull String str2, @Nullable Throwable th2, boolean z10) {
        tn.p.k(str, "tag");
        tn.p.k(str2, NotificationCompat.CATEGORY_MESSAGE);
        if (f45895d || z10) {
            String strK = k(str);
            String strC = c(str2);
            Log.w(strK, strC, th2);
            g(strK, strC);
        }
    }

    public final void o(@NotNull String str, @NotNull String str2, boolean z10) {
        tn.p.k(str, "tag");
        tn.p.k(str2, NotificationCompat.CATEGORY_MESSAGE);
        if (f45895d || z10) {
            String strK = k(str);
            String strC = c(str2);
            Log.i(strK, strC);
            g(strK, strC);
        }
    }
}
