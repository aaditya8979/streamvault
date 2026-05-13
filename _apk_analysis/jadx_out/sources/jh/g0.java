package jh;

import android.app.Activity;
import bp.m1;
import com.applovin.mediation.MaxAd;
import com.applovin.mediation.ads.MaxInterstitialAd;
import com.yk.e.inf.IComCallback;
import com.yk.e.util.AdLog;

/* JADX INFO: loaded from: classes4.dex */
public final class g0 implements IComCallback {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ Activity f72442a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ t f72443b;

    public g0(t tVar, Activity activity) {
        this.f72443b = tVar;
        this.f72442a = activity;
    }

    @Override // com.yk.e.inf.IComCallback
    public final void onFailed(int i10, String str) {
        this.f72443b.x(str);
    }

    @Override // com.yk.e.inf.IComCallback
    public final void onSuccess() {
        m1 m1Var;
        bp.x xVarA = bp.x.a();
        String str = this.f72443b.H;
        synchronized (xVarA) {
            m1 m1Var2 = null;
            try {
                m1Var = (m1) xVarA.f5886a.get(str);
                if (m1Var != null) {
                    try {
                        AdLog.d(xVarA.f5887b, "has cache, unitID " + str);
                        xVarA.f5886a.remove(str);
                    } catch (Exception e10) {
                        e = e10;
                        m1Var2 = m1Var;
                        AdLog.e(e.getMessage(), e);
                        m1Var = m1Var2;
                    }
                }
            } catch (Exception e11) {
                e = e11;
            }
        }
        if (m1Var != null) {
            t tVar = this.f72443b;
            MaxInterstitialAd maxInterstitialAd = m1Var.f5815a;
            tVar.D = maxInterstitialAd;
            MaxAd maxAd = m1Var.f5816b;
            if (maxInterstitialAd.isReady() && maxAd != null) {
                t tVar2 = this.f72443b;
                tVar2.D.setListener(tVar2.I);
                this.f72443b.I.onAdLoaded(maxAd);
                return;
            }
        }
        this.f72443b.D = new MaxInterstitialAd(this.f72443b.H, this.f72442a);
        t tVar3 = this.f72443b;
        tVar3.D.setListener(tVar3.I);
        this.f72443b.D.loadAd();
    }
}
