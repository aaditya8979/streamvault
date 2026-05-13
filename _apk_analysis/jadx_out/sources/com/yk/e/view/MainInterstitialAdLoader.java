package com.yk.e.view;

import android.app.Activity;
import com.yk.e.callBack.MainInterstitialAdCallBack;
import com.yk.e.util.AdLog;
import cp.q;
import j.a0;
import jh.i0;

/* JADX INFO: loaded from: classes12.dex */
public abstract class MainInterstitialAdLoader {
    public final q IL1Iii;

    public MainInterstitialAdLoader(Activity activity, String str, MainInterstitialAdCallBack mainInterstitialAdCallBack) {
        this.IL1Iii = null;
        this.IL1Iii = new q(activity, str, mainInterstitialAdCallBack);
    }

    public boolean isExpired() {
        q qVar = this.IL1Iii;
        if (qVar != null) {
            return qVar.D();
        }
        AdLog.ad("插屏广告实例为空，请先进行实例化！！！");
        return true;
    }

    public void loadAd() {
        q qVar = this.IL1Iii;
        if (qVar != null) {
            qVar.y();
        } else {
            AdLog.ad("插屏广告实例为空，请先进行实例化！！！");
        }
    }

    public void setLoadTimeOut(int i10) {
        q qVar = this.IL1Iii;
        if (qVar != null) {
            qVar.f71929w = i10;
        } else {
            AdLog.ad("插屏广告实例为空，请先进行实例化！！！");
        }
    }

    public void setVideoHasVoice(boolean z10) {
        q qVar = this.IL1Iii;
        if (qVar != null) {
            qVar.F = z10;
        } else {
            AdLog.ad("插屏广告实例为空，请先进行实例化！！！");
        }
    }

    public void showAd() {
        q qVar = this.IL1Iii;
        if (qVar == null) {
            AdLog.ad("插屏广告实例为空，请先进行实例化！！！");
            return;
        }
        try {
            a0 a0Var = (a0) qVar.f71931y;
            if (a0Var != null) {
                i0 i0Var = a0Var.f71808b;
                if (i0Var != null) {
                    i0Var.C();
                }
            } else {
                qVar.C("Sub AdLoader is null!");
            }
        } catch (Exception e10) {
            qVar.p(e10);
        }
    }
}
