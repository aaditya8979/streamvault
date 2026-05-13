package com.moloco.sdk.internal.ilrd.provider;

import android.content.Context;
import androidx.compose.runtime.internal.StabilityInferred;
import bn.g;
import bn.r;
import com.ironsource.mediationsdk.IronSource;
import com.ironsource.mediationsdk.impressionData.ImpressionDataListener;
import com.moloco.sdk.internal.ilrd.f;
import com.moloco.sdk.internal.ilrd.i;
import go.k;
import go.l;
import go.q;
import go.u;
import go.v;
import io.bidmachine.ads.networks.gam_dynamic.GAMConfig;
import kotlin.Result;
import org.jetbrains.annotations.NotNull;
import p000do.l0;
import tn.p;

/* JADX INFO: loaded from: classes11.dex */
@StabilityInferred(parameters = 0)
public final class f implements com.moloco.sdk.internal.ilrd.f {

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    @NotNull
    public static final a f46230h = new a(null);

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public static final int f46231i = 8;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NotNull
    public final Context f46232a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @NotNull
    public final l0 f46233b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @NotNull
    public final com.moloco.sdk.internal.ilrd.model.a f46234c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    @NotNull
    public final g f46235d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    @NotNull
    public final g f46236e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    @NotNull
    public final l<i> f46237f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    @NotNull
    public final k<f.a.C0563a> f46238g;

    public static final class a {
        public a() {
        }

        public /* synthetic */ a(tn.i iVar) {
            this();
        }
    }

    public static final class b implements ImpressionDataListener {
        public b() {
        }
    }

    public f(@NotNull Context context, @NotNull l0 l0Var) {
        p.k(context, GAMConfig.KEY_CONTEXT);
        p.k(l0Var, "scope");
        this.f46232a = context;
        this.f46233b = l0Var;
        this.f46234c = com.moloco.sdk.internal.ilrd.model.a.f46209b;
        this.f46235d = kotlin.b.b(new sn.a() { // from class: com.moloco.sdk.internal.ilrd.provider.d
            @Override // sn.a
            public final Object invoke() {
                return f.f(this.f46228b);
            }
        });
        this.f46236e = kotlin.b.b(new sn.a() { // from class: com.moloco.sdk.internal.ilrd.provider.e
            @Override // sn.a
            public final Object invoke() {
                return f.d(this.f46229b);
            }
        });
        this.f46237f = v.a(i.c.f46207a);
        this.f46238g = q.b(0, 0, null, 7, null);
    }

    public static final go.p d(f fVar) {
        return go.f.b(fVar.f46238g);
    }

    public static final u f(f fVar) {
        return go.f.c(fVar.f46237f);
    }

    @Override // com.moloco.sdk.internal.ilrd.f
    @NotNull
    public com.moloco.sdk.internal.ilrd.model.a a() {
        return this.f46234c;
    }

    @Override // com.moloco.sdk.internal.ilrd.f
    @NotNull
    public synchronized Object b() {
        Object objG;
        objG = g();
        Throwable thM7537exceptionOrNullimpl = Result.m7537exceptionOrNullimpl(objG);
        if (thM7537exceptionOrNullimpl != null) {
            this.f46237f.setValue(new i.a(thM7537exceptionOrNullimpl.toString()));
        }
        if (Result.m7540isSuccessimpl(objG)) {
            this.f46237f.setValue(i.b.f46206a);
        }
        return objG;
    }

    @Override // com.moloco.sdk.internal.ilrd.f
    @NotNull
    public go.p<f.a.C0563a> c() {
        return (go.p) this.f46236e.getValue();
    }

    public final b e() {
        return new b();
    }

    public final Object g() {
        Object objM7534constructorimpl;
        try {
            Result.a aVar = Result.Companion;
            Class.forName("com.ironsource.mediationsdk.impressionData.ImpressionData");
            IronSource.addImpressionDataListener(e());
            objM7534constructorimpl = Result.m7534constructorimpl(r.f5635a);
        } catch (Throwable th2) {
            Result.a aVar2 = Result.Companion;
            objM7534constructorimpl = Result.m7534constructorimpl(kotlin.c.a(th2));
        }
        Throwable thM7537exceptionOrNullimpl = Result.m7537exceptionOrNullimpl(objM7534constructorimpl);
        return thM7537exceptionOrNullimpl == null ? Result.m7534constructorimpl(r.f5635a) : Result.m7534constructorimpl(kotlin.c.a(thM7537exceptionOrNullimpl));
    }

    @Override // com.moloco.sdk.internal.ilrd.f
    @NotNull
    public u<i> getState() {
        return (u) this.f46235d.getValue();
    }
}
