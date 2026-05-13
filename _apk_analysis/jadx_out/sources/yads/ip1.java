package yads;

import android.content.Context;
import com.monetization.ads.mediation.interstitial.MediatedInterstitialAdapter;

/* JADX INFO: loaded from: classes9.dex */
public final class ip1 implements eo1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final mo1 f90948a;

    public ip1(mo1 mo1Var) {
        this.f90948a = mo1Var;
    }

    @Override // yads.eo1
    public final co1 a(Context context) {
        return this.f90948a.a(context, MediatedInterstitialAdapter.class);
    }
}
