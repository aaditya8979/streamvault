package com.yk.e.subad;

import android.app.Activity;
import android.os.Handler;
import android.view.ViewGroup;
import androidx.constraintlayout.core.motion.utils.TypedValues;
import bp.r0;
import com.yk.e.MainSDK;
import com.yk.e.callBack.MainFloatViewCallback;
import com.yk.e.object.AdInfo;
import com.yk.e.util.AdLog;
import com.yk.e.util.Constant;
import dp.b;
import dp.c;
import dp.e;
import j.o1;
import j.q;
import j.x0;
import j.y1;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes11.dex */
public class MainFloatViewLoader extends y1 {
    public e llI;

    /* JADX INFO: renamed from: 丨丨, reason: contains not printable characters */
    public final MainFloatViewCallback f3390;

    /* JADX INFO: renamed from: l1IIi1丨, reason: contains not printable characters */
    public float f3388l1IIi1 = 1.0f;

    /* JADX INFO: renamed from: L丨1l, reason: contains not printable characters */
    public float f3387L1l = 0.5f;

    /* JADX INFO: renamed from: 丨iI丨丨LLl, reason: contains not printable characters */
    public int f3389iILLl = 0;

    public MainFloatViewLoader(Activity activity, String str, MainFloatViewCallback mainFloatViewCallback) {
        this.curAdType = TypedValues.Custom.S_FLOAT;
        this.IL1Iii = activity;
        this.adPlcID = str;
        this.f3397IL = 27;
        this.f3390 = mainFloatViewCallback;
    }

    @Override // j.y1
    public final void IL1Iii(JSONObject jSONObject) {
        try {
            String strOptString = jSONObject.optString("platform");
            if (strOptString.hashCode() == 3809 && strOptString.equals(Constant.platform)) {
                this.llI = new e();
            } else {
                this.llI = null;
            }
            e eVar = this.llI;
            if (eVar == null) {
                this.IL1Iii.runOnUiThread(new q(this, this.f3390));
                return;
            }
            eVar.f71969r = this.IL1Iii;
            eVar.f71970s = this.LL1IL;
            eVar.p(jSONObject, 27, this.curAdType, this.adPlcID, this.f3403iILLL1);
            this.llI.getClass();
            e eVar2 = this.llI;
            float f10 = this.f3388l1IIi1;
            eVar2.E = f10;
            if (f10 < 0.0f || f10 > 1.0f) {
                AdLog.subAd("浮屏广告, 位置x值只能大于零小于1");
                eVar2.E = 0.5f;
            }
            e eVar3 = this.llI;
            float f11 = this.f3387L1l;
            eVar3.F = f11;
            if (f11 < 0.0f || f11 > 1.0f) {
                AdLog.subAd("浮屏广告, 位置y值只能大于零小于1");
                eVar3.F = 0.5f;
            }
            e eVar4 = this.llI;
            eVar4.G = this.f3389iILLl;
            x0 x0Var = new x0(this, eVar4, this.f3390);
            eVar4.f71974w = x0Var;
            eVar4.B(this.IL1Iii, x0Var);
        } catch (Exception e10) {
            AdLog.e(e10.getMessage(), e10);
            this.IL1Iii.runOnUiThread(new q(this, this.f3390));
        }
    }

    public void destroyFloatView() {
        e eVar = this.llI;
        if (eVar != null) {
            eVar.D();
            this.llI = null;
            return;
        }
        AdLog.subAd(this.curAdType + " platform = " + this.platform + " , 浮屏广告实例为空，请先实例化浮屏广告");
    }

    public void hide() {
        MainFloatViewCallback mainFloatViewCallback;
        e eVar = this.llI;
        if (eVar == null) {
            AdLog.subAd(this.curAdType + " platform = " + this.platform + " , 浮屏广告实例为空，请先实例化浮屏广告");
            return;
        }
        ViewGroup viewGroup = eVar.H;
        if (viewGroup != null) {
            viewGroup.setVisibility(8);
            if (eVar.D || (mainFloatViewCallback = eVar.C) == null) {
                return;
            }
            mainFloatViewCallback.onAdHide();
        }
    }

    @Override // j.y1
    public boolean isExpired() {
        return false;
    }

    public void isKeep(boolean z10) {
    }

    @Override // j.y1
    public void loadAd() {
        super.loadAd();
        MainSDK.getInstance().reqFloatViewAd(this.IL1Iii, 27, this.curAdType, this.adPlcID, new o1(this));
    }

    public void setExpressSize(int i10) {
        this.f3389iILLl = i10;
    }

    public void setLocationX(float f10) {
        this.f3388l1IIi1 = f10;
    }

    public void setLocationY(float f10) {
        this.f3387L1l = f10;
    }

    public void show() {
        MainFloatViewCallback mainFloatViewCallback;
        e eVar = this.llI;
        if (eVar == null) {
            AdLog.subAd(this.curAdType + " platform = " + this.platform + " , 浮屏广告实例为空，请先实例化浮屏广告");
            return;
        }
        if (!eVar.f71973v) {
            AdLog.subAd("float loading not complete");
            AdLog.d("BaseMainAd", "float loading not complete");
            return;
        }
        ViewGroup viewGroup = eVar.H;
        if (viewGroup == null || viewGroup.getVisibility() != 8) {
            return;
        }
        eVar.H.setVisibility(0);
        if (eVar.K.getVisibility() != 0) {
            new Handler().postDelayed(new c(eVar), ((long) eVar.f71961j.countDownTime) * 1000);
        }
        AdInfo adInfoB = r0.b(null, eVar.f71957f);
        if (!eVar.D && (mainFloatViewCallback = eVar.C) != null) {
            mainFloatViewCallback.onAdShow(adInfoB);
        }
        eVar.o(new b(eVar));
    }
}
