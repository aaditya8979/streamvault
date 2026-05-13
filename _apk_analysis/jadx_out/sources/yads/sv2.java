package yads;

import android.content.Context;
import java.util.LinkedHashMap;
import java.util.Map;
import kotlin.reflect.KProperty;

/* JADX INFO: loaded from: classes11.dex */
public final class sv2 implements w22 {

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public static final /* synthetic */ KProperty[] f94950f = {wb.a(sv2.class, "nativeAdLoadManager", "getNativeAdLoadManager()Lcom/monetization/ads/nativeads/NativeAdLoadManager;", 0)};

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final d4 f94951a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final mv2 f94952b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final lm2 f94953c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final zs2 f94954d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final d22 f94955e;

    public sv2(m02 m02Var, d4 d4Var, mv2 mv2Var) {
        this.f94951a = d4Var;
        this.f94952b = mv2Var;
        this.f94953c = mm2.a(m02Var);
        this.f94954d = new zs2(m02Var.e(), m02Var.h());
        this.f94955e = new d22(m02Var.e());
    }

    @Override // yads.w22
    public final void a(Context context, v9 v9Var) {
        lm2 lm2Var = this.f94953c;
        KProperty kProperty = f94950f[0];
        m02 m02Var = (m02) lm2Var.f92035a.get();
        if (m02Var != null) {
            m02Var.f97677b.a(v5.f95924c, null);
            d12 d12Var = (d12) v9Var.f96009t;
            d4 d4Var = this.f94951a;
            f22 f22Var = new f22();
            this.f94954d.a(context, v9Var, this.f94955e);
            zs2 zs2Var = this.f94954d;
            zs2Var.getClass();
            Map mapJ = kotlin.collections.a.j();
            if ((tn.y.m(mapJ) ? mapJ : null) == null) {
                new LinkedHashMap();
            }
            fo2 fo2VarA = f22Var.a(v9Var, d4Var, d12Var);
            do2 do2Var = do2.f88937c;
            fo2VarA.b("success", "status");
            zs2Var.a(context, v9Var, co2.f88538h, fo2VarA);
            xz1 xz1VarA = this.f94952b.a(v9Var);
            if (m02Var.f97693r == z5.f97392b) {
                return;
            }
            d12 d12Var2 = (d12) v9Var.f96009t;
            mz1 mz1Var = m02Var.B;
            p000do.i.d(mz1Var.f92662d, null, null, new lz1(mz1Var, v9Var, d12Var2, xz1VarA, m02Var.C, null), 3, null);
        }
    }
}
