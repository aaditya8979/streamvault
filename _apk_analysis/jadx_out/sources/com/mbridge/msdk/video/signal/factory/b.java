package com.mbridge.msdk.video.signal.factory;

import android.app.Activity;
import android.webkit.WebView;
import com.mbridge.msdk.foundation.entity.CampaignEx;
import com.mbridge.msdk.video.bt.module.MBridgeBTContainer;
import com.mbridge.msdk.video.module.MBridgeContainerView;
import com.mbridge.msdk.video.module.MBridgeVideoView;
import com.mbridge.msdk.video.signal.a;
import com.mbridge.msdk.video.signal.c;
import com.mbridge.msdk.video.signal.d;
import com.mbridge.msdk.video.signal.f;
import com.mbridge.msdk.video.signal.g;
import com.mbridge.msdk.video.signal.impl.i;
import com.mbridge.msdk.video.signal.impl.j;
import com.mbridge.msdk.video.signal.impl.k;
import com.mbridge.msdk.video.signal.impl.m;
import com.mbridge.msdk.video.signal.impl.n;
import com.mbridge.msdk.video.signal.impl.o;
import com.mbridge.msdk.video.signal.impl.q;
import java.util.List;

/* JADX INFO: compiled from: JSFactory.java */
/* JADX INFO: loaded from: classes4.dex */
public class b extends a {

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private Activity f42210h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private WebView f42211i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private MBridgeVideoView f42212j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    private MBridgeContainerView f42213k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    private CampaignEx f42214l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    private MBridgeBTContainer f42215m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private a.InterfaceC0527a f42216n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    private String f42217o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    private List<CampaignEx> f42218p;

    public b(Activity activity) {
        this.f42210h = activity;
    }

    public b(Activity activity, WebView webView, MBridgeVideoView mBridgeVideoView, MBridgeContainerView mBridgeContainerView, CampaignEx campaignEx, a.InterfaceC0527a interfaceC0527a) {
        this.f42210h = activity;
        this.f42211i = webView;
        this.f42212j = mBridgeVideoView;
        this.f42213k = mBridgeContainerView;
        this.f42214l = campaignEx;
        this.f42216n = interfaceC0527a;
        this.f42217o = mBridgeVideoView.getUnitId();
    }

    public b(Activity activity, MBridgeBTContainer mBridgeBTContainer, WebView webView) {
        this.f42210h = activity;
        this.f42215m = mBridgeBTContainer;
        this.f42211i = webView;
    }

    public void a(k kVar) {
        this.f42204b = kVar;
    }

    public void a(List<CampaignEx> list) {
        this.f42218p = list;
    }

    @Override // com.mbridge.msdk.video.signal.factory.a, com.mbridge.msdk.video.signal.factory.IJSFactory
    public com.mbridge.msdk.video.signal.b getActivityProxy() {
        WebView webView = this.f42211i;
        if (webView == null) {
            return super.getActivityProxy();
        }
        if (this.f42203a == null) {
            this.f42203a = new i(webView);
        }
        return this.f42203a;
    }

    @Override // com.mbridge.msdk.video.signal.factory.a, com.mbridge.msdk.video.signal.factory.IJSFactory
    public com.mbridge.msdk.video.signal.i getIJSRewardVideoV1() {
        Activity activity;
        MBridgeContainerView mBridgeContainerView = this.f42213k;
        if (mBridgeContainerView == null || (activity = this.f42210h) == null) {
            return super.getIJSRewardVideoV1();
        }
        if (this.f42208f == null) {
            this.f42208f = new o(activity, mBridgeContainerView);
        }
        return this.f42208f;
    }

    @Override // com.mbridge.msdk.video.signal.factory.a, com.mbridge.msdk.video.signal.factory.IJSFactory
    public c getJSBTModule() {
        if (this.f42210h == null || this.f42215m == null) {
            return super.getJSBTModule();
        }
        if (this.f42209g == null) {
            this.f42209g = new j(this.f42210h, this.f42215m);
        }
        return this.f42209g;
    }

    @Override // com.mbridge.msdk.video.signal.factory.a, com.mbridge.msdk.video.signal.factory.IJSFactory
    public d getJSCommon() {
        CampaignEx campaignEx;
        List<CampaignEx> list;
        Activity activity = this.f42210h;
        if (activity == null || (campaignEx = this.f42214l) == null) {
            return super.getJSCommon();
        }
        if (this.f42204b == null) {
            this.f42204b = new k(activity, campaignEx);
        }
        if (this.f42214l.getDynamicTempCode() == 5 && (list = this.f42218p) != null) {
            d dVar = this.f42204b;
            if (dVar instanceof k) {
                ((k) dVar).a(list);
            }
        }
        this.f42204b.setActivity(this.f42210h);
        this.f42204b.setUnitId(this.f42217o);
        this.f42204b.a(this.f42216n);
        return this.f42204b;
    }

    @Override // com.mbridge.msdk.video.signal.factory.a, com.mbridge.msdk.video.signal.factory.IJSFactory
    public f getJSContainerModule() {
        MBridgeContainerView mBridgeContainerView = this.f42213k;
        if (mBridgeContainerView == null) {
            return super.getJSContainerModule();
        }
        if (this.f42207e == null) {
            this.f42207e = new m(mBridgeContainerView);
        }
        return this.f42207e;
    }

    @Override // com.mbridge.msdk.video.signal.factory.a, com.mbridge.msdk.video.signal.factory.IJSFactory
    public g getJSNotifyProxy() {
        WebView webView = this.f42211i;
        if (webView == null) {
            return super.getJSNotifyProxy();
        }
        if (this.f42206d == null) {
            this.f42206d = new n(webView);
        }
        return this.f42206d;
    }

    @Override // com.mbridge.msdk.video.signal.factory.a, com.mbridge.msdk.video.signal.factory.IJSFactory
    public com.mbridge.msdk.video.signal.j getJSVideoModule() {
        MBridgeVideoView mBridgeVideoView = this.f42212j;
        if (mBridgeVideoView == null) {
            return super.getJSVideoModule();
        }
        if (this.f42205c == null) {
            this.f42205c = new q(mBridgeVideoView);
        }
        return this.f42205c;
    }
}
