package yads;

import android.os.Looper;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.atomic.AtomicBoolean;

/* JADX INFO: loaded from: classes2.dex */
public final class vf {

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public static final Object f96067j = new Object();

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public static volatile vf f96068k;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final long f96069a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final long f96070b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final Set f96071c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final p000do.l0 f96072d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final jf f96073e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final pf f96074f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final d63 f96075g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final x10 f96076h = new x10();

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final AtomicBoolean f96077i = new AtomicBoolean(false);

    public vf(long j10, long j11, Set set, p000do.l0 l0Var, jf jfVar, pf pfVar, d63 d63Var) {
        this.f96069a = j10;
        this.f96070b = j11;
        this.f96071c = set;
        this.f96072d = l0Var;
        this.f96073e = jfVar;
        this.f96074f = pfVar;
        this.f96075g = d63Var;
    }

    public static final void a(vf vfVar) {
        vfVar.f96075g.getClass();
        Map<Thread, StackTraceElement[]> allStackTraces = Thread.getAllStackTraces();
        StackTraceElement[] stackTraceElementArr = allStackTraces.get(Looper.getMainLooper().getThread());
        if (stackTraceElementArr != null) {
            Set set = h33.f90233a;
            if (h33.a(stackTraceElementArr, vfVar.f96071c)) {
                vfVar.f96074f.f93574a.reportAnr(allStackTraces);
            }
        }
    }
}
