package yads;

import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Objects;
import java.util.concurrent.Executor;
import yads.at1;

/* JADX INFO: loaded from: classes11.dex */
public final class at1 implements io2 {

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final Object f87801e = new Object();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final io2 f87802a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final boolean f87803b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final Executor f87804c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final bn.g f87805d;

    public at1(gh ghVar, bn.g gVar, boolean z10, Executor executor) {
        this.f87802a = ghVar;
        this.f87803b = z10;
        this.f87804c = executor;
        this.f87805d = gVar;
    }

    public static void a(String str, Throwable th2) {
        Objects.toString(th2);
        boolean z10 = ad1.f87661a;
    }

    public static void a(String str, Map map) {
        LinkedHashMap linkedHashMap = new LinkedHashMap(cn.p0.f(map.size()));
        for (Map.Entry entry : map.entrySet()) {
            linkedHashMap.put(entry.getKey(), cn.o.c(new Object[]{entry.getValue()}));
        }
        linkedHashMap.toString();
        boolean z10 = ad1.f87661a;
    }

    public static void a(Throwable th2) {
        Objects.toString(th2);
        boolean z10 = ad1.f87661a;
    }

    public static void a(Map map) {
        LinkedHashMap linkedHashMap = new LinkedHashMap(cn.p0.f(map.size()));
        for (Map.Entry entry : map.entrySet()) {
            linkedHashMap.put(entry.getKey(), cn.r.G0((Object[]) entry.getValue()));
        }
        linkedHashMap.toString();
        boolean z10 = ad1.f87661a;
    }

    public static final void a(at1 at1Var, String str, Throwable th2) {
        try {
            at1Var.getClass();
            a(str, th2);
            at1Var.f87802a.reportError(str, th2);
        } catch (Throwable unused) {
            boolean z10 = ad1.f87661a;
        }
    }

    public static final void a(at1 at1Var, Throwable th2) {
        try {
            at1Var.getClass();
            a(th2);
            at1Var.f87802a.reportUnhandledException(th2);
        } catch (Throwable unused) {
            boolean z10 = ad1.f87661a;
        }
    }

    public static final void a(at1 at1Var, Map map) {
        try {
            at1Var.getClass();
            a(map);
            at1Var.f87802a.reportAnr(map);
        } catch (Throwable unused) {
            boolean z10 = ad1.f87661a;
        }
    }

    public static final void a(at1 at1Var, eo2 eo2Var) {
        try {
            xb3.a((ou3) at1Var.f87805d.getValue(), eo2Var);
            a(eo2Var.f89339a, eo2Var.f89340b);
            at1Var.f87802a.a(eo2Var);
        } catch (Throwable unused) {
            boolean z10 = ad1.f87661a;
        }
    }

    @Override // yads.io2
    public final void a(final eo2 eo2Var) {
        if (this.f87802a != null) {
            this.f87804c.execute(new Runnable() { // from class: bt.e
                @Override // java.lang.Runnable
                public final void run() {
                    at1.a(this.f6002b, eo2Var);
                }
            });
        } else {
            boolean z10 = ad1.f87661a;
        }
    }

    @Override // yads.io2
    public final void reportAnr(final Map map) {
        if (this.f87802a != null) {
            this.f87804c.execute(new Runnable() { // from class: bt.c
                @Override // java.lang.Runnable
                public final void run() {
                    at1.a(this.f5962b, map);
                }
            });
        } else {
            boolean z10 = ad1.f87661a;
        }
    }

    @Override // yads.rm0
    public final void reportError(final String str, final Throwable th2) {
        if (this.f87803b) {
            if (this.f87802a != null) {
                this.f87804c.execute(new Runnable() { // from class: bt.d
                    @Override // java.lang.Runnable
                    public final void run() {
                        at1.a(this.f5977b, str, th2);
                    }
                });
            } else {
                boolean z10 = ad1.f87661a;
            }
        }
    }

    @Override // yads.io2
    public final void reportUnhandledException(final Throwable th2) {
        if (this.f87802a != null) {
            this.f87804c.execute(new Runnable() { // from class: bt.f
                @Override // java.lang.Runnable
                public final void run() {
                    at1.a(this.f6025b, th2);
                }
            });
        } else {
            boolean z10 = ad1.f87661a;
        }
    }
}
