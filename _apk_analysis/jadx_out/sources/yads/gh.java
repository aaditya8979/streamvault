package yads;

import io.appmetrica.analytics.IReporter;
import java.util.Map;

/* JADX INFO: loaded from: classes3.dex */
public final class gh implements io2 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final zg f89982a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final bn.g f89983b;

    public gh(bn.g gVar, zg zgVar) {
        this.f89982a = zgVar;
        this.f89983b = gVar;
    }

    @Override // yads.io2
    public final void a(eo2 eo2Var) {
        if (this.f89982a.a()) {
            try {
                ((IReporter) this.f89983b.getValue()).reportEvent(eo2Var.f89339a, eo2Var.f89340b);
            } catch (Throwable unused) {
                boolean z10 = ad1.f87661a;
            }
        }
    }

    @Override // yads.io2
    public final void reportAnr(Map map) {
        if (this.f89982a.a()) {
            try {
                ((IReporter) this.f89983b.getValue()).reportAnr(map);
            } catch (Throwable unused) {
                boolean z10 = ad1.f87661a;
            }
        }
    }

    @Override // yads.rm0
    public final void reportError(String str, Throwable th2) {
        if (this.f89982a.a()) {
            try {
                ((IReporter) this.f89983b.getValue()).reportError(str, th2);
            } catch (Throwable unused) {
                boolean z10 = ad1.f87661a;
            }
        }
    }

    @Override // yads.io2
    public final void reportUnhandledException(Throwable th2) {
        if (this.f89982a.a()) {
            try {
                ((IReporter) this.f89983b.getValue()).reportUnhandledException(th2);
            } catch (Throwable unused) {
                boolean z10 = ad1.f87661a;
            }
        }
    }
}
