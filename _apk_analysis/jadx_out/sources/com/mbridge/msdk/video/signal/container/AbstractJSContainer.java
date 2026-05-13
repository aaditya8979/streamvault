package com.mbridge.msdk.video.signal.container;

import android.annotation.SuppressLint;
import android.app.Activity;
import android.content.Context;
import android.content.res.Configuration;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.util.Base64;
import android.view.MotionEvent;
import android.widget.FrameLayout;
import com.mbridge.msdk.foundation.entity.CampaignEx;
import com.mbridge.msdk.foundation.tools.q0;
import com.mbridge.msdk.mbsignalcommon.windvane.WindVaneWebView;
import com.mbridge.msdk.mbsignalcommon.windvane.f;
import com.mbridge.msdk.out.MBSupportMuteAdType;
import com.mbridge.msdk.video.signal.b;
import com.mbridge.msdk.video.signal.d;
import com.mbridge.msdk.video.signal.factory.IJSFactory;
import com.mbridge.msdk.video.signal.factory.a;
import com.mbridge.msdk.video.signal.i;
import com.mbridge.msdk.video.signal.impl.k;
import com.mbridge.msdk.video.signal.j;
import com.mbridge.msdk.videocommon.a;
import com.mbridge.msdk.videocommon.setting.c;
import com.safedk.android.analytics.brandsafety.DetectTouchUtils;
import com.safedk.android.utils.g;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes7.dex */
public abstract class AbstractJSContainer extends FrameLayout implements IJSFactory {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private int f42186a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private int f42187b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public Activity f42188c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public String f42189d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public String f42190e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public c f42191f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public String f42192g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public com.mbridge.msdk.videocommon.entity.c f42193h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public String f42194i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public int f42195j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public boolean f42196k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public boolean f42197l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public int f42198m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public int f42199n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public int f42200o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public boolean f42201p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public IJSFactory f42202q;

    public AbstractJSContainer(Context context) {
        super(context);
        this.f42186a = 0;
        this.f42187b = 1;
        this.f42195j = 2;
        this.f42196k = false;
        this.f42197l = false;
        this.f42201p = false;
        this.f42202q = new a();
    }

    public AbstractJSContainer(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f42186a = 0;
        this.f42187b = 1;
        this.f42195j = 2;
        this.f42196k = false;
        this.f42197l = false;
        this.f42201p = false;
        this.f42202q = new a();
    }

    @SuppressLint({"SourceLockedOrientationActivity"})
    private boolean i(int i10) {
        try {
        } catch (Throwable th2) {
            q0.b("AbstractJSContainer", th2.getMessage(), th2);
        }
        if (i10 != 1) {
            if (i10 == 2) {
                this.f42188c.setRequestedOrientation(11);
            }
            return false;
        }
        this.f42188c.setRequestedOrientation(12);
        return true;
    }

    public int a(CampaignEx campaignEx) {
        k kVarB = b(campaignEx);
        if (kVarB != null) {
            return kVarB.n();
        }
        return 0;
    }

    public void a(c cVar, CampaignEx campaignEx) {
        CampaignEx.c rewardTemplateMode;
        if (a(campaignEx) == 1) {
            return;
        }
        boolean zI = false;
        if (campaignEx != null && (rewardTemplateMode = campaignEx.getRewardTemplateMode()) != null) {
            zI = i(rewardTemplateMode.g());
        }
        if (zI || cVar == null) {
            return;
        }
        i(this.f42191f.y());
    }

    public void a(Object obj) {
        f.a().b(obj, h(this.f42186a));
    }

    public void a(Object obj, String str) {
        f.a().a(obj, Base64.encodeToString(str.getBytes(), 2));
    }

    public k b(CampaignEx campaignEx) {
        if (campaignEx == null) {
            return null;
        }
        a.C0529a c0529aA = com.mbridge.msdk.videocommon.a.a(this.f42196k ? MBSupportMuteAdType.INTERSTITIAL_VIDEO : 94, campaignEx);
        if (c0529aA != null && c0529aA.c()) {
            WindVaneWebView windVaneWebViewB = c0529aA.b();
            if (windVaneWebViewB.getObject() instanceof k) {
                return (k) windVaneWebViewB.getObject();
            }
        }
        return null;
    }

    public void b(Object obj, String str) {
        f.a().b(obj, Base64.encodeToString(str.getBytes(), 2));
    }

    public void b(String str) {
        q0.b("AbstractJSContainer", str);
        Activity activity = this.f42188c;
        if (activity != null) {
            activity.finish();
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    public boolean dispatchTouchEvent(MotionEvent motionEvent) {
        DetectTouchUtils.viewOnTouch(g.f53141o, this, motionEvent);
        return super.dispatchTouchEvent(motionEvent);
    }

    @Override // com.mbridge.msdk.video.signal.factory.IJSFactory
    public b getActivityProxy() {
        return this.f42202q.getActivityProxy();
    }

    @Override // com.mbridge.msdk.video.signal.factory.IJSFactory
    public i getIJSRewardVideoV1() {
        return this.f42202q.getIJSRewardVideoV1();
    }

    public String getInnerPlacementId() {
        c cVar;
        return (!TextUtils.isEmpty(this.f42190e) || (cVar = this.f42191f) == null || TextUtils.isEmpty(cVar.t())) ? this.f42190e : this.f42191f.t();
    }

    @Override // com.mbridge.msdk.video.signal.factory.IJSFactory
    public com.mbridge.msdk.video.signal.c getJSBTModule() {
        return this.f42202q.getJSBTModule();
    }

    @Override // com.mbridge.msdk.video.signal.factory.IJSFactory
    public d getJSCommon() {
        return this.f42202q.getJSCommon();
    }

    @Override // com.mbridge.msdk.video.signal.factory.IJSFactory
    public com.mbridge.msdk.video.signal.f getJSContainerModule() {
        return this.f42202q.getJSContainerModule();
    }

    @Override // com.mbridge.msdk.video.signal.factory.IJSFactory
    public com.mbridge.msdk.video.signal.g getJSNotifyProxy() {
        return this.f42202q.getJSNotifyProxy();
    }

    @Override // com.mbridge.msdk.video.signal.factory.IJSFactory
    public j getJSVideoModule() {
        return this.f42202q.getJSVideoModule();
    }

    public String getPlacementId() {
        return this.f42190e;
    }

    public String getUnitId() {
        return this.f42189d;
    }

    public String h(int i10) {
        try {
            JSONObject jSONObject = new JSONObject();
            jSONObject.put("code", i10);
            String string = jSONObject.toString();
            if (!TextUtils.isEmpty(string)) {
                return Base64.encodeToString(string.getBytes(), 2);
            }
        } catch (Throwable unused) {
            q0.b("AbstractJSContainer", "code to string is error");
        }
        return "";
    }

    @Override // android.view.View
    public void onConfigurationChanged(Configuration configuration) {
        if (getJSCommon().a()) {
            getActivityProxy().a(configuration);
        }
    }

    public void onDestroy() {
        if (getJSCommon().a()) {
            getActivityProxy().b();
        }
    }

    @Override // android.widget.FrameLayout, android.view.View
    protected void onMeasure(int i10, int i11) {
        if (1 == 0) {
            setMeasuredDimension(0, 0);
        } else {
            super.onMeasure(i10, i11);
        }
    }

    public void onPause() {
        if (getJSCommon().a()) {
            getActivityProxy().g();
        }
        getActivityProxy().a(1);
    }

    public void onRestart() {
        if (getJSCommon().a()) {
            getActivityProxy().f();
        }
        getActivityProxy().a(4);
    }

    public void onResume() {
        if (com.mbridge.msdk.foundation.feedback.b.f37652f) {
            return;
        }
        if (getJSCommon().a()) {
            getActivityProxy().d();
        }
        getActivityProxy().a(0);
    }

    public void onStart() {
        if (getJSCommon().a()) {
            getActivityProxy().h();
        }
        getActivityProxy().a(2);
    }

    public void onStop() {
        if (getJSCommon().a()) {
            getActivityProxy().c();
        }
        getActivityProxy().a(3);
    }

    public void registerJsFactory(IJSFactory iJSFactory) {
        this.f42202q = iJSFactory;
    }

    public void setActivity(Activity activity) {
        this.f42188c = activity;
    }

    public void setBidCampaign(boolean z10) {
        this.f42197l = z10;
    }

    public void setBigOffer(boolean z10) {
        this.f42201p = z10;
    }

    public void setIV(boolean z10) {
        this.f42196k = z10;
    }

    public void setIVRewardEnable(int i10, int i11, int i12) {
        this.f42198m = i10;
        this.f42199n = i11;
        this.f42200o = i12;
    }

    public void setMute(int i10) {
        this.f42195j = i10;
    }

    public void setPlacementId(String str) {
        this.f42190e = str;
    }

    public void setReward(com.mbridge.msdk.videocommon.entity.c cVar) {
        this.f42193h = cVar;
    }

    public void setRewardId(String str) {
        this.f42194i = str;
    }

    public void setRewardUnitSetting(c cVar) {
        this.f42191f = cVar;
    }

    public void setUnitId(String str) {
        this.f42189d = str;
    }

    public void setUserId(String str) {
        this.f42192g = str;
    }
}
