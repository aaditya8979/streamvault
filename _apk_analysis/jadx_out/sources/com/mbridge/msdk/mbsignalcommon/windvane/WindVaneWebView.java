package com.mbridge.msdk.mbsignalcommon.windvane;

import android.content.Context;
import android.content.IntentFilter;
import android.os.Handler;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.view.MotionEvent;
import com.mbridge.msdk.foundation.entity.CampaignEx;
import com.mbridge.msdk.foundation.tools.v0;
import com.mbridge.msdk.mbsignalcommon.base.BaseWebView;
import com.safedk.android.analytics.brandsafety.DetectTouchUtils;
import com.safedk.android.internal.partials.MintegralNetworkBridge;
import com.unity3d.ads.adplayer.AndroidWebViewClient;

/* JADX INFO: loaded from: classes9.dex */
public class WindVaneWebView extends BaseWebView {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public j f38897d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public b f38898e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public e f38899f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private Object f38900g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private Object f38901h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private String f38902i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private c f38903j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    private String f38904k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    private String f38905l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    private CampaignEx f38906m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private int f38907n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    private boolean f38908o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    private float f38909p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    private float f38910q;

    public class a implements Runnable {
        public a() {
        }

        @Override // java.lang.Runnable
        public void run() {
            WindVaneWebView.this.f38908o = true;
            WindVaneWebView.this.destroy();
        }
    }

    public WindVaneWebView(Context context) {
        super(context);
        this.f38908o = false;
        this.f38909p = 0.0f;
        this.f38910q = 0.0f;
    }

    public WindVaneWebView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f38908o = false;
        this.f38909p = 0.0f;
        this.f38910q = 0.0f;
    }

    public WindVaneWebView(Context context, AttributeSet attributeSet, int i10) {
        super(context, attributeSet, i10);
        this.f38908o = false;
        this.f38909p = 0.0f;
        this.f38910q = 0.0f;
    }

    @Override // com.mbridge.msdk.mbsignalcommon.base.BaseWebView
    public void a() {
        super.a();
        getSettings().setSavePassword(false);
        getSettings().setUserAgentString(getSettings().getUserAgentString() + " WindVane/3.0.2");
        if (this.f38897d == null) {
            this.f38897d = new j(this);
        }
        setWebViewChromeClient(this.f38897d);
        k kVar = new k();
        this.mWebViewClient = kVar;
        setWebViewClient(kVar);
        if (this.f38898e == null) {
            b hVar = new h(this.f38797a);
            this.f38898e = hVar;
            setSignalCommunication(hVar);
        }
        this.f38899f = new e(this.f38797a, this);
    }

    public void clearWebView() {
        if (this.f38908o) {
            return;
        }
        MintegralNetworkBridge.webviewLoadUrl(this, AndroidWebViewClient.BLANK_PAGE);
    }

    @Override // com.mbridge.msdk.mbsignalcommon.base.BaseWebView, android.view.ViewGroup, android.view.View
    public boolean dispatchTouchEvent(MotionEvent motionEvent) {
        DetectTouchUtils.viewOnTouch(com.safedk.android.utils.g.f53141o, this, motionEvent);
        return super.dispatchTouchEvent(motionEvent);
    }

    public CampaignEx getCampaignEx() {
        return this.f38906m;
    }

    public String getCampaignId() {
        return this.f38902i;
    }

    public Object getJsObject(String str) {
        e eVar = this.f38899f;
        if (eVar == null) {
            return null;
        }
        return eVar.a(str);
    }

    public String getLocalRequestId() {
        return this.f38905l;
    }

    public Object getMraidObject() {
        return this.f38901h;
    }

    public Object getObject() {
        return this.f38900g;
    }

    public String getRid() {
        return this.f38904k;
    }

    public b getSignalCommunication() {
        return this.f38898e;
    }

    public c getWebViewListener() {
        return this.f38903j;
    }

    public boolean isDestoryed() {
        return this.f38908o;
    }

    @Override // com.mbridge.msdk.mbsignalcommon.base.BaseWebView, android.webkit.WebView, android.widget.AbsoluteLayout, android.view.View
    protected void onMeasure(int i10, int i11) {
        if (1 == 0) {
            setMeasuredDimension(0, 0);
        } else {
            super.onMeasure(i10, i11);
        }
    }

    @Override // android.webkit.WebView, android.view.View
    public boolean onTouchEvent(MotionEvent motionEvent) {
        com.mbridge.msdk.mbsignalcommon.base.b bVar = this.mWebViewClient;
        if (bVar != null && (bVar.a() instanceof IntentFilter)) {
            String url = getUrl();
            if (!TextUtils.isEmpty(url) && url.contains("https://play.google.com")) {
                if (motionEvent.getAction() == 0) {
                    this.f38909p = motionEvent.getRawX();
                    this.f38910q = motionEvent.getRawY();
                } else {
                    float rawX = motionEvent.getRawX() - this.f38909p;
                    float y10 = motionEvent.getY() - this.f38910q;
                    if ((rawX >= 0.0f || rawX * (-1.0f) <= 48) && ((rawX <= 0.0f || rawX <= 48) && ((y10 >= 0.0f || (-1.0f) * y10 <= 48) && (y10 <= 0.0f || y10 <= 48)))) {
                        setClickable(false);
                        return true;
                    }
                }
            }
        }
        return super.onTouchEvent(motionEvent);
    }

    public void registerWindVanePlugin(Class cls) {
        e eVar = this.f38899f;
        if (eVar == null) {
            return;
        }
        eVar.a(cls.getSimpleName(), cls);
    }

    public void release() {
        try {
            if (!this.f38908o) {
                com.mbridge.msdk.foundation.same.report.metrics.e eVar = new com.mbridge.msdk.foundation.same.report.metrics.e();
                eVar.a("type", Integer.valueOf(this.f38907n));
                if (this.f38906m != null) {
                    com.mbridge.msdk.foundation.same.report.metrics.d.b().a("2000135", this.f38906m, eVar);
                }
            }
        } catch (Exception unused) {
        }
        try {
            setVisibility(8);
            removeAllViews();
            setDownloadListener(null);
            this.f38900g = null;
            if (v0.b(getContext()) == 0) {
                this.f38908o = true;
                destroy();
            } else {
                new Handler().postDelayed(new a(), r0 * 1000);
            }
        } catch (Throwable th2) {
            th2.printStackTrace();
        }
    }

    public void setApiManagerContext(Context context) {
        e eVar = this.f38899f;
        if (eVar != null) {
            eVar.a(context);
        }
    }

    public void setApiManagerJSFactory(Object obj) {
        e eVar = this.f38899f;
        if (eVar != null) {
            eVar.a(obj);
        }
    }

    public void setCampaignEx(CampaignEx campaignEx) {
        this.f38906m = campaignEx;
    }

    public void setCampaignId(String str) {
        this.f38902i = str;
    }

    public void setLocalRequestId(String str) {
        this.f38905l = str;
    }

    public void setMraidObject(Object obj) {
        this.f38901h = obj;
    }

    public void setObject(Object obj) {
        this.f38900g = obj;
    }

    public void setRid(String str) {
        this.f38904k = str;
    }

    public void setSignalCommunication(b bVar) {
        this.f38898e = bVar;
        bVar.a(this);
    }

    public void setTempTypeForMetrics(int i10) {
        this.f38907n = i10;
    }

    public void setWebViewChromeClient(j jVar) {
        this.f38897d = jVar;
        setWebChromeClient(jVar);
    }

    public void setWebViewListener(c cVar) {
        this.f38903j = cVar;
        j jVar = this.f38897d;
        if (jVar != null) {
            jVar.a(cVar);
        }
        com.mbridge.msdk.mbsignalcommon.base.b bVar = this.mWebViewClient;
        if (bVar != null) {
            bVar.a(cVar);
        }
    }

    public void setWebViewTransparent() {
        super.setTransparent();
    }
}
