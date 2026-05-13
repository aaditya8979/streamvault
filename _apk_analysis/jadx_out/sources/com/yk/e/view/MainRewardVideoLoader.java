package com.yk.e.view;

import android.app.Activity;
import c.f;
import com.yk.e.callBack.MainRewardVideoAdCallBack;
import com.yk.e.util.AdLog;
import cp.g0;
import j.j1;

/* JADX INFO: loaded from: classes3.dex */
public class MainRewardVideoLoader {
    public final g0 IL1Iii;

    public MainRewardVideoLoader(Activity activity, String str, MainRewardVideoAdCallBack mainRewardVideoAdCallBack) {
        this.IL1Iii = new g0(activity, str, mainRewardVideoAdCallBack);
    }

    public boolean isExpired() {
        g0 g0Var = this.IL1Iii;
        if (g0Var != null) {
            return g0Var.D();
        }
        AdLog.ad("激励视频广告实例为空，请先进行实例化！！！");
        return true;
    }

    public void loadAd() {
        g0 g0Var = this.IL1Iii;
        if (g0Var != null) {
            g0Var.y();
        } else {
            AdLog.ad("激励视频广告实例为空，请先进行实例化！！！");
        }
    }

    public void setExtraMsg(String str) {
        g0 g0Var = this.IL1Iii;
        if (g0Var != null) {
            g0Var.H = str;
        } else {
            AdLog.ad("激励视频广告实例为空，请先进行实例化！！！");
        }
    }

    public void setLoadTimeOut(int i10) {
        g0 g0Var = this.IL1Iii;
        if (g0Var != null) {
            g0Var.f71929w = i10;
        } else {
            AdLog.ad("激励视频广告实例为空，请先进行实例化！！！");
        }
    }

    public void setOrientation(int i10) {
        g0 g0Var = this.IL1Iii;
        if (g0Var != null) {
            g0Var.F = i10;
        } else {
            AdLog.ad("激励视频广告实例为空，请先进行实例化！！！");
        }
    }

    public void setUserID(String str) {
        g0 g0Var = this.IL1Iii;
        if (g0Var != null) {
            g0Var.G = str;
        } else {
            AdLog.ad("激励视频广告实例为空，请先进行实例化！！！");
        }
    }

    public void showAd() {
        g0 g0Var = this.IL1Iii;
        if (g0Var == null) {
            AdLog.ad("激励视频广告实例为空，请先进行实例化！！！");
            return;
        }
        try {
            j1 j1Var = (j1) g0Var.f71931y;
            if (j1Var != null) {
                f fVar = j1Var.f71893b;
                if (fVar != null) {
                    fVar.C();
                }
            } else {
                g0Var.C("Sub AdLoader is null!");
            }
        } catch (Exception e10) {
            g0Var.p(e10);
        }
    }
}
