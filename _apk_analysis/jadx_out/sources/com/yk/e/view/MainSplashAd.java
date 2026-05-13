package com.yk.e.view;

import android.app.Activity;
import android.view.ViewGroup;
import com.yk.e.callBack.MainSplashAdCallBack;
import com.yk.e.util.AdLog;
import cp.l;
import j.d1;
import k.t0;

/* JADX INFO: loaded from: classes4.dex */
public class MainSplashAd {
    public final l IL1Iii;

    public MainSplashAd(Activity activity, String str, ViewGroup viewGroup, MainSplashAdCallBack mainSplashAdCallBack) {
        this.IL1Iii = new l(activity, str, viewGroup, mainSplashAdCallBack);
    }

    public void destroy() {
        l lVar = this.IL1Iii;
        if (lVar == null) {
            AdLog.ad("开屏广告实例为空，请先进行实例化！！！");
        } else {
            lVar.f71928v = true;
            AdLog.i("BaseSliceLoader", "splash onDestroy");
        }
    }

    public boolean isExpired() {
        l lVar = this.IL1Iii;
        if (lVar != null) {
            return lVar.D();
        }
        AdLog.ad("开屏广告实例为空，请先进行实例化！！！");
        return true;
    }

    public void loadAd() {
        l lVar = this.IL1Iii;
        if (lVar != null) {
            lVar.y();
        } else {
            AdLog.ad("开屏广告实例为空，请先进行实例化！！！");
        }
    }

    public void setLoadTimeOut(int i10) {
        l lVar = this.IL1Iii;
        if (lVar != null) {
            lVar.f71929w = i10;
        } else {
            AdLog.ad("开屏广告实例为空，请先进行实例化！！！");
        }
    }

    public void setVideoHasVoice(boolean z10) {
        l lVar = this.IL1Iii;
        if (lVar != null) {
            lVar.G = z10;
        } else {
            AdLog.ad("开屏广告实例为空，请先进行实例化！！！");
        }
    }

    public void showAd() {
        l lVar = this.IL1Iii;
        if (lVar == null) {
            AdLog.ad("开屏广告实例为空，请先进行实例化！！！");
            return;
        }
        try {
            if (lVar.f71928v) {
                lVar.C("SplashAd is destroyed!");
            } else {
                d1 d1Var = (d1) lVar.f71931y;
                if (d1Var != null) {
                    try {
                        t0 t0Var = d1Var.f71847c;
                        if (t0Var != null) {
                            t0Var.C();
                        }
                    } catch (Exception e10) {
                        AdLog.e(e10.getMessage(), e10);
                    }
                } else {
                    lVar.C("Sub AdLoader is null!");
                }
            }
        } catch (Exception e11) {
            lVar.p(e11);
        }
    }
}
