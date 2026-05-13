package com.mbridge.msdk.video.signal.impl;

import android.app.Activity;
import com.applovin.impl.sdk.utils.JsonUtils;
import com.iab.omid.library.mmadbridge.adsession.AdEvents;
import com.iab.omid.library.mmadbridge.adsession.AdSession;
import com.iab.omid.library.mmadbridge.adsession.media.MediaEvents;
import com.ironsource.C3978d4;
import com.mbridge.msdk.foundation.tools.q0;
import com.mbridge.msdk.out.Campaign;
import com.mbridge.msdk.out.NativeListener;
import com.mbridge.msdk.video.signal.a;

/* JADX INFO: compiled from: BaseDefaultJSCommon.java */
/* JADX INFO: loaded from: classes7.dex */
public abstract class a implements com.mbridge.msdk.video.signal.d {

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public String f42228j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public com.mbridge.msdk.videocommon.setting.c f42229k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public com.mbridge.msdk.click.a f42230l;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public boolean f42219a = false;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public boolean f42220b = false;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public int f42221c = 0;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public int f42222d = 0;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public int f42223e = 0;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public int f42224f = 0;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public int f42225g = 0;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public int f42226h = 1;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public int f42227i = -1;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public a.InterfaceC0527a f42231m = new C0528a();

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public int f42232n = 2;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public int f42233o = 2;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    private AdSession f42234p = null;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    private MediaEvents f42235q = null;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    private AdEvents f42236r = null;

    /* JADX INFO: renamed from: com.mbridge.msdk.video.signal.impl.a$a, reason: collision with other inner class name */
    /* JADX INFO: compiled from: BaseDefaultJSCommon.java */
    public static class C0528a implements a.InterfaceC0527a {
        @Override // com.mbridge.msdk.video.signal.a.InterfaceC0527a
        public void a() {
            q0.a("DefaultJSCommon", "videoLocationReady");
        }

        @Override // com.mbridge.msdk.video.signal.a.InterfaceC0527a
        public void a(int i10, String str) {
            q0.a("DefaultJSCommon", "onH5Error,code:" + i10 + "，msg:" + str);
        }

        @Override // com.mbridge.msdk.video.signal.a.InterfaceC0527a
        public void a(boolean z10) {
            q0.a("DefaultJSCommon", "onStartInstall");
        }

        @Override // com.mbridge.msdk.out.NativeListener.NativeTrackingListener
        public void onDismissLoading(Campaign campaign) {
            q0.a("DefaultJSCommon", "onDismissLoading,campaign:" + campaign);
        }

        @Override // com.mbridge.msdk.out.NativeListener.NativeTrackingListener
        public void onDownloadFinish(Campaign campaign) {
            q0.a("DefaultJSCommon", "onDownloadFinish,campaign:" + campaign);
        }

        @Override // com.mbridge.msdk.out.NativeListener.NativeTrackingListener
        public void onDownloadProgress(int i10) {
            q0.a("DefaultJSCommon", "onDownloadProgress,progress:" + i10);
        }

        @Override // com.mbridge.msdk.out.NativeListener.NativeTrackingListener
        public void onDownloadStart(Campaign campaign) {
            q0.a("DefaultJSCommon", "onDownloadStart,campaign:" + campaign);
        }

        @Override // com.mbridge.msdk.out.BaseTrackingListener
        public void onFinishRedirection(Campaign campaign, String str) {
            q0.a("DefaultJSCommon", "onFinishRedirection,campaign:" + campaign + ",url:" + str);
        }

        @Override // com.mbridge.msdk.video.signal.a.InterfaceC0527a
        public void onInitSuccess() {
            q0.a("DefaultJSCommon", "onInitSuccess");
        }

        @Override // com.mbridge.msdk.out.NativeListener.NativeTrackingListener
        public boolean onInterceptDefaultLoadingDialog() {
            q0.a("DefaultJSCommon", "onInterceptDefaultLoadingDialog");
            return false;
        }

        @Override // com.mbridge.msdk.out.BaseTrackingListener
        public void onRedirectionFailed(Campaign campaign, String str) {
            q0.a("DefaultJSCommon", "onFinishRedirection,campaign:" + campaign + ",url:" + str);
        }

        @Override // com.mbridge.msdk.out.NativeListener.NativeTrackingListener
        public void onShowLoading(Campaign campaign) {
            q0.a("DefaultJSCommon", "onShowLoading,campaign:" + campaign);
        }

        @Override // com.mbridge.msdk.out.BaseTrackingListener
        public void onStartRedirection(Campaign campaign, String str) {
            q0.a("DefaultJSCommon", "onStartRedirection,campaign:" + campaign + ",url:" + str);
        }
    }

    /* JADX INFO: compiled from: BaseDefaultJSCommon.java */
    public static class b implements a.InterfaceC0527a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private com.mbridge.msdk.video.signal.d f42237a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private a.InterfaceC0527a f42238b;

        public b(com.mbridge.msdk.video.signal.d dVar, a.InterfaceC0527a interfaceC0527a) {
            this.f42237a = dVar;
            this.f42238b = interfaceC0527a;
        }

        @Override // com.mbridge.msdk.video.signal.a.InterfaceC0527a
        public void a() {
            a.InterfaceC0527a interfaceC0527a = this.f42238b;
            if (interfaceC0527a != null) {
                interfaceC0527a.a();
            }
        }

        @Override // com.mbridge.msdk.video.signal.a.InterfaceC0527a
        public void a(int i10, String str) {
            a.InterfaceC0527a interfaceC0527a = this.f42238b;
            if (interfaceC0527a != null) {
                interfaceC0527a.a(i10, str);
            }
        }

        @Override // com.mbridge.msdk.video.signal.a.InterfaceC0527a
        public void a(boolean z10) {
            a.InterfaceC0527a interfaceC0527a = this.f42238b;
            if (interfaceC0527a != null) {
                interfaceC0527a.a(z10);
            }
        }

        @Override // com.mbridge.msdk.out.NativeListener.NativeTrackingListener
        public void onDismissLoading(Campaign campaign) {
            a.InterfaceC0527a interfaceC0527a = this.f42238b;
            if (interfaceC0527a != null) {
                interfaceC0527a.onDismissLoading(campaign);
            }
        }

        @Override // com.mbridge.msdk.out.NativeListener.NativeTrackingListener
        public void onDownloadFinish(Campaign campaign) {
            a.InterfaceC0527a interfaceC0527a = this.f42238b;
            if (interfaceC0527a != null) {
                interfaceC0527a.onDownloadFinish(campaign);
            }
        }

        @Override // com.mbridge.msdk.out.NativeListener.NativeTrackingListener
        public void onDownloadProgress(int i10) {
            a.InterfaceC0527a interfaceC0527a = this.f42238b;
            if (interfaceC0527a != null) {
                interfaceC0527a.onDownloadProgress(i10);
            }
        }

        @Override // com.mbridge.msdk.out.NativeListener.NativeTrackingListener
        public void onDownloadStart(Campaign campaign) {
            a.InterfaceC0527a interfaceC0527a = this.f42238b;
            if (interfaceC0527a != null) {
                interfaceC0527a.onDownloadStart(campaign);
            }
        }

        @Override // com.mbridge.msdk.out.BaseTrackingListener
        public void onFinishRedirection(Campaign campaign, String str) {
            a.InterfaceC0527a interfaceC0527a = this.f42238b;
            if (interfaceC0527a != null) {
                interfaceC0527a.onFinishRedirection(campaign, str);
            }
            com.mbridge.msdk.video.signal.d dVar = this.f42237a;
            if (dVar != null) {
                dVar.f();
            }
        }

        @Override // com.mbridge.msdk.video.signal.a.InterfaceC0527a
        public void onInitSuccess() {
            a.InterfaceC0527a interfaceC0527a = this.f42238b;
            if (interfaceC0527a != null) {
                interfaceC0527a.onInitSuccess();
            }
        }

        @Override // com.mbridge.msdk.out.NativeListener.NativeTrackingListener
        public boolean onInterceptDefaultLoadingDialog() {
            a.InterfaceC0527a interfaceC0527a = this.f42238b;
            return interfaceC0527a != null && interfaceC0527a.onInterceptDefaultLoadingDialog();
        }

        @Override // com.mbridge.msdk.out.BaseTrackingListener
        public void onRedirectionFailed(Campaign campaign, String str) {
            a.InterfaceC0527a interfaceC0527a = this.f42238b;
            if (interfaceC0527a != null) {
                interfaceC0527a.onRedirectionFailed(campaign, str);
            }
            com.mbridge.msdk.video.signal.d dVar = this.f42237a;
            if (dVar != null) {
                dVar.f();
            }
        }

        @Override // com.mbridge.msdk.out.NativeListener.NativeTrackingListener
        public void onShowLoading(Campaign campaign) {
            a.InterfaceC0527a interfaceC0527a = this.f42238b;
            if (interfaceC0527a != null) {
                interfaceC0527a.onShowLoading(campaign);
            }
        }

        @Override // com.mbridge.msdk.out.BaseTrackingListener
        public void onStartRedirection(Campaign campaign, String str) {
            a.InterfaceC0527a interfaceC0527a = this.f42238b;
            if (interfaceC0527a != null) {
                interfaceC0527a.onStartRedirection(campaign, str);
            }
        }
    }

    @Override // com.mbridge.msdk.video.signal.a
    public void a(int i10) {
        this.f42227i = i10;
    }

    @Override // com.mbridge.msdk.video.signal.a
    public void a(int i10, String str) {
        q0.a("DefaultJSCommon", "statistics,type:" + i10 + ",json:" + str);
    }

    @Override // com.mbridge.msdk.video.signal.a
    public void a(a.InterfaceC0527a interfaceC0527a) {
        q0.a("DefaultJSCommon", "setTrackingListener:" + interfaceC0527a);
        this.f42231m = interfaceC0527a;
    }

    @Override // com.mbridge.msdk.video.signal.a
    public void a(String str) {
        q0.a("DefaultJSCommon", "setNotchArea");
    }

    @Override // com.mbridge.msdk.video.signal.a
    public void a(boolean z10) {
        q0.a("DefaultJSCommon", "setIsShowingTransparent:" + z10);
        this.f42220b = z10;
    }

    @Override // com.mbridge.msdk.video.signal.a
    public boolean a() {
        return this.f42219a;
    }

    @Override // com.mbridge.msdk.video.signal.a
    public int b() {
        return this.f42225g;
    }

    @Override // com.mbridge.msdk.video.signal.a
    public void b(int i10) {
        this.f42221c = i10;
    }

    @Override // com.mbridge.msdk.video.signal.a
    public void b(boolean z10) {
        this.f42219a = z10;
    }

    @Override // com.mbridge.msdk.video.signal.a
    public String c() {
        q0.a("DefaultJSCommon", C3978d4.a.f31210f);
        return JsonUtils.EMPTY_JSON;
    }

    @Override // com.mbridge.msdk.video.signal.a
    public void c(int i10) {
        this.f42223e = i10;
    }

    @Override // com.mbridge.msdk.video.signal.e
    public void click(int i10, String str) {
        q0.a("DefaultJSCommon", "click:type" + i10 + ",pt:" + str);
    }

    @Override // com.mbridge.msdk.video.signal.a
    public int d() {
        q0.a("DefaultJSCommon", "getAlertDialogRole " + this.f42226h);
        return this.f42226h;
    }

    @Override // com.mbridge.msdk.video.signal.a
    public void d(int i10) {
        q0.a("DefaultJSCommon", "setAlertDialogRole " + i10);
        this.f42226h = i10;
    }

    @Override // com.mbridge.msdk.video.signal.a
    public String e() {
        q0.a("DefaultJSCommon", "getNotchArea");
        return null;
    }

    @Override // com.mbridge.msdk.video.signal.a
    public void e(int i10) {
        this.f42222d = i10;
    }

    @Override // com.mbridge.msdk.video.signal.a
    public String f(int i10) {
        q0.a("DefaultJSCommon", "getSDKInfo");
        return JsonUtils.EMPTY_JSON;
    }

    @Override // com.mbridge.msdk.video.signal.a
    public void f() {
        q0.a("DefaultJSCommon", "finish");
    }

    @Override // com.mbridge.msdk.video.signal.a
    public String g() {
        return JsonUtils.EMPTY_JSON;
    }

    @Override // com.mbridge.msdk.video.signal.a
    public void g(int i10) {
        this.f42232n = i10;
    }

    @Override // com.mbridge.msdk.video.signal.a
    public void h() {
    }

    @Override // com.mbridge.msdk.video.signal.e
    public void handlerH5Exception(int i10, String str) {
        q0.a("DefaultJSCommon", "handlerH5Exception,code=" + i10 + ",msg:" + str);
    }

    @Override // com.mbridge.msdk.video.signal.a
    public int i() {
        return this.f42227i;
    }

    public AdEvents j() {
        return this.f42236r;
    }

    public AdSession k() {
        return this.f42234p;
    }

    public int l() {
        if (this.f42221c == 0 && this.f42220b) {
            this.f42221c = 1;
        }
        return this.f42221c;
    }

    public int m() {
        if (this.f42222d == 0 && this.f42220b) {
            this.f42222d = 1;
        }
        return this.f42222d;
    }

    public int n() {
        if (this.f42223e == 0 && this.f42220b) {
            this.f42223e = 1;
        }
        return this.f42223e;
    }

    public MediaEvents o() {
        return this.f42235q;
    }

    public boolean p() {
        return this.f42220b;
    }

    @Override // com.mbridge.msdk.video.signal.a
    public void release() {
        q0.a("DefaultJSCommon", "release");
        com.mbridge.msdk.click.a aVar = this.f42230l;
        if (aVar != null) {
            aVar.a(false);
            this.f42230l.a((NativeListener.NativeTrackingListener) null);
            this.f42230l.c();
        }
    }

    @Override // com.mbridge.msdk.video.signal.a
    public void setActivity(Activity activity) {
        q0.a("DefaultJSCommon", "setActivity ");
    }

    @Override // com.mbridge.msdk.video.signal.a
    public void setAdEvents(AdEvents adEvents) {
        this.f42236r = adEvents;
    }

    @Override // com.mbridge.msdk.video.signal.a
    public void setAdSession(AdSession adSession) {
        this.f42234p = adSession;
    }

    @Override // com.mbridge.msdk.video.signal.a
    public void setRewardUnitSetting(com.mbridge.msdk.videocommon.setting.c cVar) {
        q0.a("DefaultJSCommon", "setSetting:" + cVar);
        this.f42229k = cVar;
    }

    @Override // com.mbridge.msdk.video.signal.a
    public void setUnitId(String str) {
        q0.a("DefaultJSCommon", "setUnitId:" + str);
        this.f42228j = str;
    }

    @Override // com.mbridge.msdk.video.signal.a
    public void setVideoEvents(MediaEvents mediaEvents) {
        this.f42235q = mediaEvents;
    }

    @Override // com.mbridge.msdk.video.signal.a
    public void setWebViewFront(int i10) {
        this.f42225g = i10;
    }
}
