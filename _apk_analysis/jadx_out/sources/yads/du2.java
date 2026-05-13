package yads;

import android.content.Context;
import io.appmetrica.analytics.AppMetricaLibraryAdapter;
import java.util.HashSet;
import kotlin.Result;

/* JADX INFO: loaded from: classes9.dex */
public final class du2 implements oo, uo2 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final xt2 f88981a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final tt2 f88982b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final w5 f88983c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final Context f88984d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final xy f88985e = xy.f96922c;

    public du2(Context context, xt2 xt2Var, tt2 tt2Var, w5 w5Var) {
        this.f88981a = xt2Var;
        this.f88982b = tt2Var;
        this.f88983c = w5Var;
        this.f88984d = context.getApplicationContext();
    }

    @Override // yads.up2
    public final void a(Object obj) {
        HashSet<ot2> hashSet;
        Object objM7534constructorimpl;
        nt2 nt2Var = (nt2) obj;
        xt2 xt2Var = this.f88981a;
        Context context = this.f88984d;
        xt2Var.getClass();
        synchronized (xt2.f96867b) {
            hashSet = new HashSet(xt2Var.f96869a.keySet());
            Object obj2 = dw2.f89000j;
            cw2.a().a(context, nt2Var);
            bn.r rVar = bn.r.f5635a;
        }
        for (ot2 ot2Var : hashSet) {
            boolean z10 = !ot2Var.f93324a.f88002a.b(context);
            if (ot2Var.f93325b.f95179a.b()) {
                try {
                    Result.a aVar = Result.Companion;
                    AppMetricaLibraryAdapter.setAdvIdentifiersTracking(z10);
                    objM7534constructorimpl = Result.m7534constructorimpl(bn.r.f5635a);
                } catch (Throwable th2) {
                    Result.a aVar2 = Result.Companion;
                    objM7534constructorimpl = Result.m7534constructorimpl(kotlin.c.a(th2));
                }
                if (Result.m7537exceptionOrNullimpl(objM7534constructorimpl) != null) {
                    boolean z11 = ad1.f87661a;
                }
            }
        }
        this.f88983c.a(v5.f95934m);
        tt2 tt2Var = this.f88982b;
        xy xyVar = this.f88985e;
        if (tt2Var.f95354a.isActive()) {
            p000do.k kVar = tt2Var.f95354a;
            Result.a aVar3 = Result.Companion;
            kVar.resumeWith(Result.m7534constructorimpl(new hu2(nt2Var, xyVar)));
        }
    }

    @Override // yads.tp2
    public final void a(im3 im3Var) {
        this.f88983c.a(v5.f95934m);
        tt2 tt2Var = this.f88982b;
        xy xyVar = this.f88985e;
        if (tt2Var.f95354a.isActive()) {
            p000do.k kVar = tt2Var.f95354a;
            Result.a aVar = Result.Companion;
            kVar.resumeWith(Result.m7534constructorimpl(new gu2(im3Var, xyVar)));
        }
    }

    @Override // yads.uo2
    public final void b() {
        this.f88983c.a(v5.f95933l);
        this.f88983c.a(v5.f95934m, null);
    }
}
