package yads;

import android.content.Context;
import com.yandex.mobile.ads.R$layout;

/* JADX INFO: loaded from: classes6.dex */
public final class eg2 implements vy0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final zf0 f89243a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final io2 f89244b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final rx f89245c;

    public eg2(qw qwVar, at1 at1Var, rx rxVar) {
        this.f89243a = qwVar;
        this.f89244b = at1Var;
        this.f89245c = rxVar;
    }

    @Override // yads.vy0
    public final se1 a(Context context, v9 v9Var, w02 w02Var, kz kzVar, z00 z00Var) {
        y00 adAssets = w02Var.getAdAssets();
        rx rxVar = this.f89245c;
        zf0 zf0Var = this.f89243a;
        io2 io2Var = this.f89244b;
        rxVar.getClass();
        return new se1(R$layout.monetization_ads_internal_native_interstitial_portrait, new jy(rx.a(w02Var, kzVar, z00Var, zf0Var, io2Var), new gm1(new bz1(), new qj1(adAssets)), new gn3(), new xs(w02Var), new vs(new jy1(), new us(context))), new ua2(1));
    }
}
