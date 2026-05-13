package yads;

import android.app.Activity;
import com.yandex.mobile.ads.common.AdInfo;
import com.yandex.mobile.ads.interstitial.InterstitialAd;
import com.yandex.mobile.ads.interstitial.InterstitialAdEventListener;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: loaded from: classes2.dex */
public final class ts3 implements InterstitialAd {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final jd1 f95346a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final xp3 f95347b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final lk f95348c;

    public ts3(jd1 jd1Var, xp3 xp3Var, lk lkVar) {
        this.f95346a = jd1Var;
        this.f95347b = xp3Var;
        this.f95348c = lkVar;
    }

    public final boolean equals(Object obj) {
        return (obj instanceof ts3) && tn.p.f(((ts3) obj).f95346a, this.f95346a);
    }

    @Override // com.yandex.mobile.ads.interstitial.InterstitialAd
    public final List getAdAttributes() {
        List<gc> listA = this.f95346a.f91180a.f94209f.a();
        ArrayList arrayList = new ArrayList(cn.x.x(listA, 10));
        for (gc gcVar : listA) {
            this.f95348c.getClass();
            arrayList.add(new kk(gcVar));
        }
        return arrayList;
    }

    @Override // com.yandex.mobile.ads.interstitial.InterstitialAd
    public final AdInfo getInfo() {
        xp3 xp3Var = this.f95347b;
        c00 c00VarD = this.f95346a.f91180a.d();
        xp3Var.getClass();
        return xp3.a(c00VarD);
    }

    public final int hashCode() {
        return this.f95346a.hashCode();
    }

    @Override // com.yandex.mobile.ads.interstitial.InterstitialAd
    public final void setAdEventListener(InterstitialAdEventListener interstitialAdEventListener) {
        zs3 zs3Var = new zs3(interstitialAdEventListener);
        jd1 jd1Var = this.f95346a;
        jd1Var.f91182c.a();
        jd1Var.f91181b.f95255c = zs3Var;
    }

    @Override // com.yandex.mobile.ads.interstitial.InterstitialAd
    public final void show(Activity activity) {
        this.f95346a.a(activity);
    }
}
