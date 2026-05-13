package com.mbridge.msdk.advanced.manager;

import android.content.Context;
import android.graphics.Bitmap;
import android.net.http.SslError;
import android.os.Bundle;
import android.os.Handler;
import android.os.Looper;
import android.os.Message;
import android.text.TextUtils;
import android.webkit.SslErrorHandler;
import android.webkit.WebView;
import androidx.annotation.NonNull;
import androidx.core.app.NotificationCompat;
import com.ironsource.Z7;
import com.mbridge.msdk.MBridgeConstans;
import com.mbridge.msdk.advanced.view.MBNativeAdvancedView;
import com.mbridge.msdk.advanced.view.MBNativeAdvancedWebview;
import com.mbridge.msdk.foundation.download.download.H5DownLoadManager;
import com.mbridge.msdk.foundation.entity.CampaignEx;
import com.mbridge.msdk.foundation.entity.CampaignUnit;
import com.mbridge.msdk.foundation.entity.n;
import com.mbridge.msdk.foundation.same.c;
import com.mbridge.msdk.foundation.tools.a1;
import com.mbridge.msdk.foundation.tools.q0;
import com.mbridge.msdk.foundation.tools.v0;
import com.mbridge.msdk.foundation.tools.y;
import com.mbridge.msdk.out.MBridgeIds;
import com.safedk.android.internal.partials.MintegralNetworkBridge;
import java.io.File;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.CopyOnWriteArrayList;

/* JADX INFO: compiled from: NativeAdvancedLoadManager.java */
/* JADX INFO: loaded from: classes6.dex */
public class b {

    /* JADX INFO: renamed from: z, reason: collision with root package name */
    private static String f35383z = "NativeAdvancedLoadManager";

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private String f35384a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private String f35385b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private long f35386c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private com.mbridge.msdk.advanced.middle.b f35387d;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private MBNativeAdvancedView f35389f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private com.mbridge.msdk.setting.l f35390g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private List<CampaignEx> f35391h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private CampaignEx f35392i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private int f35393j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    private int f35394k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    private int f35395l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    private int f35396m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private String f35397n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    private int f35398o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    private boolean f35399p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    private volatile boolean f35400q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    private com.mbridge.msdk.videocommon.listener.a f35401r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    private H5DownLoadManager.ZipDownloadListener f35402s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    private H5DownLoadManager.ZipDownloadListener f35403t;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    private String f35404u;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    private int f35405v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    private String f35406w = "";

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    private Handler f35407x = new e(Looper.getMainLooper());

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    private Runnable f35408y = new f();

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private Context f35388e = com.mbridge.msdk.foundation.controller.c.n().d();

    /* JADX INFO: compiled from: NativeAdvancedLoadManager.java */
    public class a implements H5DownLoadManager.ZipDownloadListener {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final /* synthetic */ CampaignEx f35409a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final /* synthetic */ int f35410b;

        public a(CampaignEx campaignEx, int i10) {
            this.f35409a = campaignEx;
            this.f35410b = i10;
        }

        @Override // com.mbridge.msdk.foundation.download.download.H5DownLoadManager.H5ResDownloadListerInter
        public void onFailed(String str, String str2) {
            q0.a(b.f35383z, "zip 下载失败： " + str2 + Z7.f30794r + str);
            Message messageObtain = Message.obtain();
            messageObtain.what = 2;
            Bundle bundle = new Bundle();
            bundle.putSerializable("campaignex", this.f35409a);
            bundle.putString(NotificationCompat.CATEGORY_MESSAGE, str);
            bundle.putInt("type", 3);
            messageObtain.obj = bundle;
            b.this.f35407x.sendMessage(messageObtain);
            b.this.a(this.f35409a, str2, false, str);
        }

        @Override // com.mbridge.msdk.foundation.download.download.H5DownLoadManager.H5ResDownloadListerInter
        public void onSuccess(String str, String str2, boolean z10) {
            q0.a(b.f35383z, "zip 下载成功： " + str);
            Message messageObtain = Message.obtain();
            messageObtain.what = 1;
            messageObtain.obj = this.f35409a;
            messageObtain.arg1 = this.f35410b;
            b.this.f35407x.sendMessage(messageObtain);
            if (z10) {
                return;
            }
            b.this.a(this.f35409a, str, true, "");
        }
    }

    /* JADX INFO: renamed from: com.mbridge.msdk.advanced.manager.b$b, reason: collision with other inner class name */
    /* JADX INFO: compiled from: NativeAdvancedLoadManager.java */
    public class C0415b extends com.mbridge.msdk.mbsignalcommon.listener.b {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final /* synthetic */ CampaignEx f35412a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final /* synthetic */ int f35413b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final /* synthetic */ long f35414c;

        public C0415b(CampaignEx campaignEx, int i10, long j10) {
            this.f35412a = campaignEx;
            this.f35413b = i10;
            this.f35414c = j10;
        }

        @Override // com.mbridge.msdk.mbsignalcommon.listener.b, com.mbridge.msdk.mbsignalcommon.windvane.c
        public void a(WebView webView, int i10) throws Throwable {
            super.a(webView, i10);
            q0.b("NativeAdvancedLoadManager", "=========readyState: " + i10);
            if (i10 != 1) {
                b.this.a(this.f35412a, "readyState 2", this.f35413b);
                com.mbridge.msdk.advanced.report.a.a(com.mbridge.msdk.foundation.controller.c.n().d(), this.f35412a, b.this.f35384a, "readyState 2", this.f35414c, 3);
                return;
            }
            b.this.f35389f.setH5Ready(true);
            com.mbridge.msdk.advanced.common.c.a(b.this.f35385b + b.this.f35384a + this.f35412a.getRequestId(), true);
            b.this.h(this.f35412a, this.f35413b);
            com.mbridge.msdk.advanced.report.a.a(com.mbridge.msdk.foundation.controller.c.n().d(), this.f35412a, b.this.f35384a, "", this.f35414c, 1);
        }

        @Override // com.mbridge.msdk.mbsignalcommon.listener.b, com.mbridge.msdk.mbsignalcommon.windvane.c
        public void onPageFinished(WebView webView, String str) {
            super.onPageFinished(webView, str);
            q0.b("NativeAdvancedLoadManager", "onPageFinished");
            if (!this.f35412a.isHasMBTplMark()) {
                b.this.f35389f.setH5Ready(true);
                q0.b("NativeAdvancedLoadManager", "=======onPageFinished OK");
                com.mbridge.msdk.advanced.common.c.a(b.this.f35385b + b.this.f35384a + this.f35412a.getRequestId(), true);
                b.this.h(this.f35412a, this.f35413b);
                com.mbridge.msdk.advanced.report.a.a(com.mbridge.msdk.foundation.controller.c.n().d(), this.f35412a, b.this.f35384a, "", this.f35414c, 1);
            }
            com.mbridge.msdk.advanced.signal.a.a(webView);
        }

        @Override // com.mbridge.msdk.mbsignalcommon.listener.b, com.mbridge.msdk.mbsignalcommon.windvane.c
        public void onReceivedError(WebView webView, int i10, String str, String str2) throws Throwable {
            super.onReceivedError(webView, i10, str, str2);
            q0.b("NativeAdvancedLoadManager", "onReceivedError： " + i10 + "  " + str + "  " + str2);
            b.this.a(this.f35412a, str, this.f35413b);
            com.mbridge.msdk.advanced.report.a.a(com.mbridge.msdk.foundation.controller.c.n().d(), this.f35412a, b.this.f35384a, "error code:" + i10 + str, this.f35414c, 3);
        }

        @Override // com.mbridge.msdk.mbsignalcommon.listener.b, com.mbridge.msdk.mbsignalcommon.windvane.c
        public void onReceivedSslError(WebView webView, SslErrorHandler sslErrorHandler, SslError sslError) throws Throwable {
            super.onReceivedSslError(webView, sslErrorHandler, sslError);
            q0.b("NativeAdvancedLoadManager", "onReceivedSslError: " + sslError.getPrimaryError());
            b.this.a(this.f35412a, "onReceivedSslError:" + sslError.getUrl(), this.f35413b);
            com.mbridge.msdk.advanced.report.a.a(com.mbridge.msdk.foundation.controller.c.n().d(), this.f35412a, b.this.f35384a, "error url:" + sslError.getUrl(), this.f35414c, 3);
        }
    }

    /* JADX INFO: compiled from: NativeAdvancedLoadManager.java */
    public class c implements Runnable {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final /* synthetic */ MBNativeAdvancedWebview f35416a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final /* synthetic */ String f35417b;

        public c(MBNativeAdvancedWebview mBNativeAdvancedWebview, String str) {
            this.f35416a = mBNativeAdvancedWebview;
            this.f35417b = str;
        }

        @Override // java.lang.Runnable
        public void run() {
            MintegralNetworkBridge.webviewLoadUrl(this.f35416a, this.f35417b);
        }
    }

    /* JADX INFO: compiled from: NativeAdvancedLoadManager.java */
    public class d implements com.mbridge.msdk.videocommon.listener.a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final /* synthetic */ CampaignEx f35419a;

        public d(CampaignEx campaignEx) {
            this.f35419a = campaignEx;
        }

        @Override // com.mbridge.msdk.videocommon.listener.a
        public void a(String str) {
            q0.a(b.f35383z, "Video 下载成功： " + str);
            Message messageObtain = Message.obtain();
            messageObtain.obj = this.f35419a;
            messageObtain.what = 5;
            b.this.f35407x.sendMessage(messageObtain);
        }

        @Override // com.mbridge.msdk.videocommon.listener.a
        public void a(String str, String str2) {
            q0.a(b.f35383z, "Video 下载失败： " + str);
            Message messageObtain = Message.obtain();
            Bundle bundle = new Bundle();
            bundle.putSerializable("campaignex", this.f35419a);
            bundle.putString(NotificationCompat.CATEGORY_MESSAGE, str);
            bundle.putInt("type", 1);
            messageObtain.obj = bundle;
            messageObtain.what = 2;
            b.this.f35407x.sendMessage(messageObtain);
        }
    }

    /* JADX INFO: compiled from: NativeAdvancedLoadManager.java */
    public class e extends Handler {
        public e(Looper looper) {
            super(looper);
        }

        @Override // android.os.Handler
        public void handleMessage(@NonNull Message message) throws Throwable {
            Object obj;
            super.handleMessage(message);
            int i10 = message.what;
            if (i10 == 1) {
                Object obj2 = message.obj;
                int i11 = message.arg1;
                if (obj2 == null || !(obj2 instanceof CampaignEx)) {
                    return;
                }
                CampaignEx campaignEx = (CampaignEx) obj2;
                b.this.a(H5DownLoadManager.getInstance().getH5ResAddress(campaignEx.getAdZip()), campaignEx, i11);
                return;
            }
            if (i10 == 2) {
                Object obj3 = message.obj;
                try {
                    if (obj3 instanceof Bundle) {
                        int i12 = ((Bundle) obj3).getInt("type");
                        com.mbridge.msdk.foundation.error.b bVar = new com.mbridge.msdk.foundation.error.b(i12 == 1 ? 880004 : i12 == 2 ? 880007 : i12 == 3 ? 880006 : 880024);
                        String string = ((Bundle) obj3).getString(NotificationCompat.CATEGORY_MESSAGE);
                        CampaignEx campaignEx2 = (CampaignEx) ((Bundle) obj3).getSerializable("campaignex");
                        bVar.c(string);
                        bVar.a(campaignEx2);
                        b bVar2 = b.this;
                        bVar2.a(bVar, bVar2.f35397n, b.this.f35398o, campaignEx2);
                        return;
                    }
                    return;
                } catch (Exception e10) {
                    com.mbridge.msdk.foundation.error.b bVar3 = new com.mbridge.msdk.foundation.error.b(880000);
                    bVar3.a((Throwable) e10);
                    b bVar4 = b.this;
                    bVar4.a(bVar3, bVar4.f35397n, b.this.f35398o, (CampaignEx) null);
                    return;
                }
            }
            if (i10 == 3) {
                Object obj4 = message.obj;
                if (obj4 == null || !(obj4 instanceof CampaignEx)) {
                    return;
                }
                b bVar5 = b.this;
                bVar5.i((CampaignEx) obj4, bVar5.f35398o);
                return;
            }
            if (i10 != 4) {
                if (i10 == 5 && (obj = message.obj) != null && (obj instanceof CampaignEx)) {
                    if (b.this.f35389f != null) {
                        b.this.f35389f.setVideoReady(true);
                    }
                    b bVar6 = b.this;
                    bVar6.i((CampaignEx) obj, bVar6.f35398o);
                    return;
                }
                return;
            }
            Object obj5 = message.obj;
            if (obj5 == null || !(obj5 instanceof CampaignEx)) {
                return;
            }
            if (b.this.f35389f != null) {
                b.this.f35389f.setEndCardReady(true);
            }
            b bVar7 = b.this;
            bVar7.i((CampaignEx) obj5, bVar7.f35398o);
        }
    }

    /* JADX INFO: compiled from: NativeAdvancedLoadManager.java */
    public class f implements Runnable {
        public f() {
        }

        @Override // java.lang.Runnable
        public void run() throws Throwable {
            com.mbridge.msdk.foundation.error.b bVar = new com.mbridge.msdk.foundation.error.b(880010);
            b bVar2 = b.this;
            bVar2.a(bVar, bVar2.f35397n, b.this.f35398o, (CampaignEx) null);
        }
    }

    /* JADX INFO: compiled from: NativeAdvancedLoadManager.java */
    public class g extends com.mbridge.msdk.advanced.request.b {

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public final /* synthetic */ String f35423e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        public final /* synthetic */ int f35424f;

        /* JADX INFO: compiled from: NativeAdvancedLoadManager.java */
        public class a implements Runnable {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public final /* synthetic */ Exception f35426a;

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ int f35427b;

            /* JADX INFO: renamed from: c, reason: collision with root package name */
            public final /* synthetic */ CampaignUnit f35428c;

            public a(Exception exc, int i10, CampaignUnit campaignUnit) {
                this.f35426a = exc;
                this.f35427b = i10;
                this.f35428c = campaignUnit;
            }

            @Override // java.lang.Runnable
            public void run() throws Throwable {
                com.mbridge.msdk.foundation.error.b bVar = new com.mbridge.msdk.foundation.error.b(880003);
                bVar.a((Throwable) this.f35426a);
                g gVar = g.this;
                b bVar2 = b.this;
                String str = gVar.f35423e;
                int i10 = this.f35427b;
                CampaignUnit campaignUnit = this.f35428c;
                bVar2.a(bVar, str, i10, (campaignUnit == null || campaignUnit.getAds() == null || this.f35428c.getAds().size() == 0) ? null : this.f35428c.getAds().get(0));
            }
        }

        /* JADX INFO: renamed from: com.mbridge.msdk.advanced.manager.b$g$b, reason: collision with other inner class name */
        /* JADX INFO: compiled from: NativeAdvancedLoadManager.java */
        public class RunnableC0416b implements Runnable {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public final /* synthetic */ String f35430a;

            public RunnableC0416b(String str) {
                this.f35430a = str;
            }

            @Override // java.lang.Runnable
            public void run() throws Throwable {
                com.mbridge.msdk.foundation.error.b bVar = new com.mbridge.msdk.foundation.error.b(880002);
                bVar.c(this.f35430a);
                g gVar = g.this;
                b.this.a(bVar, gVar.f35423e, gVar.f35424f, (CampaignEx) null);
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public g(int i10, String str, int i11) {
            super(i10);
            this.f35423e = str;
            this.f35424f = i11;
        }

        @Override // com.mbridge.msdk.advanced.request.b
        public void a(CampaignUnit campaignUnit, int i10) throws Throwable {
            try {
                b bVar = b.this;
                bVar.a(campaignUnit, i10, bVar.f35384a, this.f35423e);
                b.this.f35406w = campaignUnit.getRequestId();
                b.this.f35391h = campaignUnit.getAds();
            } catch (Exception e10) {
                q0.b(b.f35383z, e10.getMessage());
                q0.c(b.f35383z, "onLoadCompaginSuccess 数据刚请求失败");
                if (b.this.f35407x != null) {
                    b.this.f35407x.post(new a(e10, i10, campaignUnit));
                }
                b.this.f();
            }
        }

        @Override // com.mbridge.msdk.advanced.request.b
        public void b(int i10, String str) {
            q0.b(b.f35383z, str);
            q0.c(b.f35383z, "onLoadCompaginFailed load failed errorCode:" + i10 + " msg:" + str);
            if (b.this.f35407x != null) {
                b.this.f35407x.post(new RunnableC0416b(str));
            }
            b.this.f();
        }
    }

    /* JADX INFO: compiled from: NativeAdvancedLoadManager.java */
    public class h extends c.a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final /* synthetic */ CampaignEx f35432a;

        public h(CampaignEx campaignEx, com.mbridge.msdk.foundation.same.report.metrics.callback.a aVar) {
            this.f35432a = campaignEx;
        }

        @Override // com.mbridge.msdk.foundation.same.c.a
        public void a(String str, com.mbridge.msdk.foundation.same.report.metrics.c cVar) {
            com.mbridge.msdk.advanced.report.a.a(str, cVar, this.f35432a, b.this.f35388e, null);
        }
    }

    /* JADX INFO: compiled from: NativeAdvancedLoadManager.java */
    public class i implements Runnable {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final /* synthetic */ CampaignEx f35434a;

        public i(CampaignEx campaignEx) {
            this.f35434a = campaignEx;
        }

        @Override // java.lang.Runnable
        public void run() {
            com.mbridge.msdk.foundation.db.j.a(com.mbridge.msdk.foundation.db.g.a(b.this.f35388e)).d();
            y.a(b.this.f35388e, this.f35434a);
        }
    }

    /* JADX INFO: compiled from: NativeAdvancedLoadManager.java */
    public class j implements com.mbridge.msdk.foundation.same.image.c {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final /* synthetic */ CampaignEx f35436a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final /* synthetic */ int f35437b;

        /* JADX INFO: compiled from: NativeAdvancedLoadManager.java */
        public class a implements Runnable {
            public a() {
            }

            @Override // java.lang.Runnable
            public void run() {
                j jVar = j.this;
                b.this.i(jVar.f35436a, jVar.f35437b);
            }
        }

        /* JADX INFO: renamed from: com.mbridge.msdk.advanced.manager.b$j$b, reason: collision with other inner class name */
        /* JADX INFO: compiled from: NativeAdvancedLoadManager.java */
        public class RunnableC0417b implements Runnable {
            public RunnableC0417b() {
            }

            @Override // java.lang.Runnable
            public void run() {
                j jVar = j.this;
                b.this.i(jVar.f35436a, jVar.f35437b);
            }
        }

        public j(CampaignEx campaignEx, int i10) {
            this.f35436a = campaignEx;
            this.f35437b = i10;
        }

        @Override // com.mbridge.msdk.foundation.same.image.c
        public void onFailedLoad(String str, String str2) {
            q0.a(b.f35383z, "gifurl 下载失败： " + str2);
            if (b.this.f35407x != null) {
                b.this.f35407x.post(new RunnableC0417b());
            }
        }

        @Override // com.mbridge.msdk.foundation.same.image.c
        public void onSuccessLoad(Bitmap bitmap, String str) {
            q0.a(b.f35383z, "giturl 下载成功： " + str);
            if (b.this.f35407x != null) {
                b.this.f35407x.post(new a());
            }
        }
    }

    /* JADX INFO: compiled from: NativeAdvancedLoadManager.java */
    public class k implements H5DownLoadManager.ZipDownloadListener {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final /* synthetic */ CampaignEx f35441a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final /* synthetic */ int f35442b;

        public k(CampaignEx campaignEx, int i10) {
            this.f35441a = campaignEx;
            this.f35442b = i10;
        }

        @Override // com.mbridge.msdk.foundation.download.download.H5DownLoadManager.H5ResDownloadListerInter
        public void onFailed(String str, String str2) {
            q0.a(b.f35383z, "endcard 下载失败： " + str2);
            if (b.this.f35389f != null) {
                b.this.f35389f.setEndCardReady(false);
            }
            Message messageObtain = Message.obtain();
            messageObtain.what = 2;
            Bundle bundle = new Bundle();
            bundle.putSerializable("campaignex", this.f35441a);
            bundle.putString(NotificationCompat.CATEGORY_MESSAGE, str);
            bundle.putInt("type", 2);
            messageObtain.obj = bundle;
            b.this.f35407x.sendMessage(messageObtain);
        }

        @Override // com.mbridge.msdk.foundation.download.download.H5DownLoadManager.H5ResDownloadListerInter
        public void onSuccess(String str, String str2, boolean z10) {
            q0.a(b.f35383z, "endcard 下载成功： " + str);
            if (b.this.f35407x != null) {
                Message messageObtain = Message.obtain();
                messageObtain.what = 4;
                messageObtain.obj = this.f35441a;
                messageObtain.arg1 = this.f35442b;
                b.this.f35407x.sendMessage(messageObtain);
            }
        }
    }

    /* JADX INFO: compiled from: NativeAdvancedLoadManager.java */
    public class l implements com.mbridge.msdk.foundation.same.image.c {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final /* synthetic */ CampaignEx f35444a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final /* synthetic */ int f35445b;

        /* JADX INFO: compiled from: NativeAdvancedLoadManager.java */
        public class a implements Runnable {
            public a() {
            }

            @Override // java.lang.Runnable
            public void run() {
                l lVar = l.this;
                b.this.i(lVar.f35444a, lVar.f35445b);
            }
        }

        /* JADX INFO: renamed from: com.mbridge.msdk.advanced.manager.b$l$b, reason: collision with other inner class name */
        /* JADX INFO: compiled from: NativeAdvancedLoadManager.java */
        public class RunnableC0418b implements Runnable {
            public RunnableC0418b() {
            }

            @Override // java.lang.Runnable
            public void run() {
                l lVar = l.this;
                b.this.i(lVar.f35444a, lVar.f35445b);
            }
        }

        public l(CampaignEx campaignEx, int i10) {
            this.f35444a = campaignEx;
            this.f35445b = i10;
        }

        @Override // com.mbridge.msdk.foundation.same.image.c
        public void onFailedLoad(String str, String str2) {
            q0.a(b.f35383z, "image 下载失败： " + str2);
            if (b.this.f35407x != null) {
                b.this.f35407x.post(new RunnableC0418b());
            }
        }

        @Override // com.mbridge.msdk.foundation.same.image.c
        public void onSuccessLoad(Bitmap bitmap, String str) {
            q0.a(b.f35383z, "image 下载成功： " + str);
            if (b.this.f35407x != null) {
                b.this.f35407x.post(new a());
            }
        }
    }

    /* JADX INFO: compiled from: NativeAdvancedLoadManager.java */
    public class m implements Runnable {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final /* synthetic */ File f35449a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final /* synthetic */ CampaignEx f35450b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final /* synthetic */ int f35451c;

        public m(File file, CampaignEx campaignEx, int i10) {
            this.f35449a = file;
            this.f35450b = campaignEx;
            this.f35451c = i10;
        }

        @Override // java.lang.Runnable
        public void run() throws Throwable {
            b.this.a("file:////" + this.f35449a.getAbsolutePath(), this.f35450b, this.f35451c);
        }
    }

    public b(String str, String str2, long j10) {
        this.f35385b = str;
        this.f35384a = str2;
    }

    @NonNull
    private com.mbridge.msdk.advanced.request.b a(String str, int i10) {
        g gVar = new g(i10, str, i10);
        gVar.a(str);
        gVar.setUnitId(this.f35384a);
        gVar.setPlacementId(this.f35385b);
        gVar.setAdType(298);
        return gVar;
    }

    private List<CampaignEx> a(CampaignUnit campaignUnit) {
        if (campaignUnit == null || campaignUnit.getAds() == null) {
            return null;
        }
        ArrayList arrayList = new ArrayList();
        CampaignEx campaignEx = campaignUnit.getAds().get(0);
        campaignEx.setLocalRequestId(campaignUnit.getLocalRequestId());
        campaignEx.setCampaignUnitId(this.f35384a);
        a(campaignEx);
        this.f35404u = campaignUnit.getSessionId();
        if (campaignEx.getOfferType() != 99 && (!TextUtils.isEmpty(campaignEx.getAdZip()) || !TextUtils.isEmpty(campaignEx.getAdHtml()))) {
            if (v0.c(campaignEx)) {
                campaignEx.setRtinsType(v0.c(this.f35388e, campaignEx.getPackageName()) ? 1 : 2);
            }
            if (com.mbridge.msdk.foundation.same.c.b(this.f35388e, campaignEx)) {
                arrayList.add(campaignEx);
            } else {
                v0.a(this.f35384a, campaignEx, com.mbridge.msdk.foundation.same.a.f37715x);
            }
            a(campaignEx, (com.mbridge.msdk.foundation.same.report.metrics.c) null, (com.mbridge.msdk.foundation.same.report.metrics.callback.a) null);
        }
        return arrayList;
    }

    private void a(long j10) {
        this.f35407x.postDelayed(this.f35408y, j10);
    }

    private void a(Context context, String str, int i10) throws Throwable {
        try {
            if (context == null) {
                a(new com.mbridge.msdk.foundation.error.b(880025), str, i10, (CampaignEx) null);
                return;
            }
            if (a1.a(this.f35384a)) {
                a(new com.mbridge.msdk.foundation.error.b(880032), str, i10, (CampaignEx) null);
                return;
            }
            try {
                com.mbridge.msdk.advanced.manager.d.b(this.f35384a);
            } catch (Throwable th2) {
                q0.b(f35383z, th2.getMessage());
            }
            q0.c(f35383z, "load 开始准备请求参数");
            MBridgeIds mBridgeIds = new MBridgeIds(this.f35385b, this.f35384a);
            com.mbridge.msdk.advanced.request.f fVar = new com.mbridge.msdk.advanced.request.f();
            fVar.d(i10);
            fVar.c(this.f35405v);
            fVar.a(this.f35404u);
            fVar.b(this.f35396m);
            fVar.a(this.f35395l);
            com.mbridge.msdk.foundation.same.net.wrapper.e eVarB = com.mbridge.msdk.advanced.request.e.b(context, mBridgeIds, fVar);
            if (eVarB == null) {
                q0.c(f35383z, "load 请求参数为空 load失败");
                a(new com.mbridge.msdk.foundation.error.b(880001), str, i10, (CampaignEx) null);
                return;
            }
            if (!TextUtils.isEmpty(str)) {
                eVarB.a("token", str);
            }
            String strD = v0.d(this.f35384a);
            if (!TextUtils.isEmpty(strD)) {
                eVarB.a("j", strD);
            }
            new com.mbridge.msdk.advanced.request.c(context).choiceV3OrV5BySetting(1, eVarB, a(str, i10), str, com.mbridge.msdk.foundation.same.c.a(this.f35386c, 30000L));
        } catch (Exception e10) {
            q0.b(f35383z, e10.getMessage());
            com.mbridge.msdk.foundation.error.b bVar = new com.mbridge.msdk.foundation.error.b(880020);
            bVar.a((Throwable) e10);
            a(bVar, str, i10, (CampaignEx) null);
            f();
        }
    }

    private void a(CampaignEx campaignEx) {
        new Thread(new i(campaignEx)).start();
    }

    private void a(CampaignEx campaignEx, int i10) {
        String str;
        this.f35403t = new k(campaignEx, i10);
        if (campaignEx != null) {
            i = campaignEx.getAabEntity() != null ? campaignEx.getAabEntity().h3c : 0;
            str = campaignEx.getendcard_url();
        } else {
            str = "";
        }
        com.mbridge.msdk.foundation.same.report.metrics.c cVar = new com.mbridge.msdk.foundation.same.report.metrics.c();
        cVar.a(campaignEx);
        cVar.f(i);
        H5DownLoadManager.getInstance().downloadH5Res(cVar, str, this.f35403t);
    }

    private void a(CampaignEx campaignEx, com.mbridge.msdk.foundation.same.report.metrics.c cVar, com.mbridge.msdk.foundation.same.report.metrics.callback.a aVar) {
        try {
            com.mbridge.msdk.foundation.same.c.a(campaignEx, this.f35388e, cVar, new h(campaignEx, aVar));
        } catch (Exception e10) {
            if (MBridgeConstans.DEBUG) {
                e10.printStackTrace();
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void a(CampaignEx campaignEx, String str, int i10) throws Throwable {
        com.mbridge.msdk.foundation.error.b bVar = new com.mbridge.msdk.foundation.error.b(880009);
        bVar.c(str);
        a(bVar, this.f35397n, i10, campaignEx);
        com.mbridge.msdk.advanced.report.a.a(2, str, this.f35384a, campaignEx);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void a(CampaignEx campaignEx, String str, boolean z10, String str2) {
        try {
            n nVar = new n();
            nVar.e(2);
            nVar.j("m_download_end");
            if (campaignEx != null) {
                nVar.b(campaignEx.isMraid() ? n.N : n.O);
                nVar.o(campaignEx.getRequestIdNotice());
            }
            nVar.b("url", str);
            nVar.b("scenes", "1");
            if (z10) {
                nVar.d(1);
            } else {
                nVar.d(3);
                nVar.m(str2);
            }
            com.mbridge.msdk.foundation.same.report.metrics.d.b().a(nVar, campaignEx);
        } catch (Exception e10) {
            if (MBridgeConstans.DEBUG) {
                q0.b(f35383z, e10.getMessage());
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void a(CampaignUnit campaignUnit, int i10, String str, String str2) throws Throwable {
        com.mbridge.msdk.foundation.same.report.metrics.e eVar = new com.mbridge.msdk.foundation.same.report.metrics.e();
        eVar.a("adtp", 298);
        if (TextUtils.isEmpty(str2)) {
            eVar.a(CampaignEx.JSON_KEY_HB, 0);
        } else {
            eVar.a(CampaignEx.JSON_KEY_HB, 1);
        }
        if (campaignUnit != null && campaignUnit.getAds() != null) {
            campaignUnit.setLocalRequestId(com.mbridge.msdk.foundation.same.report.metrics.d.b().a(i10 == 1, str2, eVar, campaignUnit.getAds().get(0), str).t());
        }
        List<CampaignEx> listA = a(campaignUnit);
        if (listA == null || listA.size() <= 0) {
            q0.c(f35383z, "onload load失败 返回的compaign没有可以用的");
            a(new com.mbridge.msdk.foundation.error.b(880033), str2, i10, (campaignUnit == null || campaignUnit.getAds() == null || campaignUnit.getAds().size() == 0) ? null : campaignUnit.getAds().get(0));
            return;
        }
        g();
        q0.c(f35383z, "onload load成功 size:" + listA.size());
        CampaignEx campaignEx = listA.get(0);
        if (!TextUtils.isEmpty(campaignEx.getAdZip()) || (!TextUtils.isEmpty(campaignEx.getAdHtml()) && campaignEx.getAdHtml().contains("<MBTPLMARK>"))) {
            campaignEx.setHasMBTplMark(true);
            campaignEx.setIsMraid(false);
        } else {
            campaignEx.setHasMBTplMark(false);
            campaignEx.setIsMraid(true);
        }
        j(campaignEx, i10);
    }

    private void a(com.mbridge.msdk.foundation.error.b bVar, int i10, CampaignEx campaignEx) {
        if (this.f35400q) {
            return;
        }
        b();
        if (bVar != null) {
            q0.b(f35383z, "real failed: " + bVar.l());
        }
        this.f35400q = true;
        com.mbridge.msdk.advanced.middle.b bVar2 = this.f35387d;
        if (bVar2 != null) {
            bVar2.a(bVar, i10);
        }
    }

    private void a(com.mbridge.msdk.foundation.error.b bVar, int i10, String str) throws Throwable {
        CampaignEx campaignExA = com.mbridge.msdk.advanced.manager.d.a(this.f35389f, this.f35385b, this.f35384a, str, this.f35393j, true, true);
        if (campaignExA == null) {
            a(bVar, i10, campaignExA);
        } else {
            q0.b(f35383z, "load failed cache ");
            j(campaignExA, i10);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void a(com.mbridge.msdk.foundation.error.b bVar, String str, int i10, CampaignEx campaignEx) throws Throwable {
        if (this.f35399p) {
            this.f35399p = false;
            a(bVar, i10, str);
        } else {
            if (bVar != null) {
                bVar.a(campaignEx);
            }
            a(bVar, i10, campaignEx);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void a(String str, CampaignEx campaignEx, int i10) throws Throwable {
        MBNativeAdvancedView mBNativeAdvancedView = this.f35389f;
        if (mBNativeAdvancedView == null || mBNativeAdvancedView.getAdvancedNativeWebview() == null) {
            return;
        }
        com.mbridge.msdk.advanced.report.a.b(this.f35384a, campaignEx);
        com.mbridge.msdk.advanced.signal.b bVar = new com.mbridge.msdk.advanced.signal.b(this.f35389f.getContext(), this.f35385b, this.f35384a);
        ArrayList arrayList = new ArrayList();
        arrayList.add(campaignEx);
        bVar.a(arrayList);
        bVar.a(this.f35393j);
        bVar.b(this.f35394k);
        this.f35389f.setAdvancedNativeSignalCommunicationImpl(bVar);
        long jCurrentTimeMillis = System.currentTimeMillis();
        MBNativeAdvancedWebview advancedNativeWebview = this.f35389f.getAdvancedNativeWebview();
        if (advancedNativeWebview == null) {
            a(campaignEx, "webview is null", i10);
            return;
        }
        if (advancedNativeWebview.isDestoryed()) {
            a(campaignEx, "webview is destroyed", i10);
            return;
        }
        advancedNativeWebview.setWebViewListener(new C0415b(campaignEx, i10, jCurrentTimeMillis));
        if (advancedNativeWebview.isDestoryed()) {
            a(new com.mbridge.msdk.foundation.error.b(880031), this.f35397n, i10, campaignEx);
            com.mbridge.msdk.advanced.report.a.a(com.mbridge.msdk.foundation.controller.c.n().d(), campaignEx, this.f35384a, "webview had destory", jCurrentTimeMillis, 3);
            return;
        }
        q0.b(f35383z, "=======开始渲染: " + str);
        Handler handler = this.f35407x;
        if (handler != null) {
            handler.post(new c(advancedNativeWebview, str));
        }
    }

    private void b() {
        this.f35407x.removeCallbacks(this.f35408y);
    }

    private void b(CampaignEx campaignEx, int i10) {
        com.mbridge.msdk.foundation.same.image.b.a(com.mbridge.msdk.foundation.controller.c.n().d()).a(campaignEx.getGifUrl(), new j(campaignEx, i10));
    }

    private void c(CampaignEx campaignEx, int i10) {
        com.mbridge.msdk.foundation.same.image.b.a(com.mbridge.msdk.foundation.controller.c.n().d()).a(campaignEx.getImageUrl(), new l(campaignEx, i10));
    }

    /* JADX WARN: Can't wrap try/catch for region: R(12:0|2|82|(4:80|3|77|4)|(8:6|(1:8)|9|89|10|(6:12|93|13|(1:15)|16|17)|79|68)(1:24)|83|25|(1:27)|42|(1:51)(2:48|(1:50))|(3:53|79|68)(1:96)|(2:(0)|(1:92))) */
    /* JADX WARN: Code restructure failed: missing block: B:29:0x00aa, code lost:
    
        r5 = move-exception;
     */
    /* JADX WARN: Code restructure failed: missing block: B:30:0x00ab, code lost:
    
        r5 = r4;
        r4 = r5;
     */
    /* JADX WARN: Code restructure failed: missing block: B:40:0x00cd, code lost:
    
        r4.close();
     */
    /* JADX WARN: Removed duplicated region for block: B:40:0x00cd A[Catch: Exception -> 0x0127, all -> 0x0142, TRY_ENTER, TryCatch #2 {all -> 0x0142, blocks: (B:62:0x0127, B:40:0x00cd, B:42:0x00d1, B:44:0x00d7, B:46:0x00dd, B:48:0x00e3, B:50:0x00f6, B:51:0x00ff, B:27:0x00a6), top: B:82:0x000a }] */
    /* JADX WARN: Removed duplicated region for block: B:51:0x00ff A[Catch: Exception -> 0x0127, all -> 0x0142, TRY_LEAVE, TryCatch #2 {all -> 0x0142, blocks: (B:62:0x0127, B:40:0x00cd, B:42:0x00d1, B:44:0x00d7, B:46:0x00dd, B:48:0x00e3, B:50:0x00f6, B:51:0x00ff, B:27:0x00a6), top: B:82:0x000a }] */
    /* JADX WARN: Removed duplicated region for block: B:53:0x0118 A[Catch: IOException -> 0x0137, TRY_ENTER, TRY_LEAVE, TryCatch #1 {IOException -> 0x0137, blocks: (B:64:0x0133, B:53:0x0118), top: B:80:0x000a }] */
    /* JADX WARN: Removed duplicated region for block: B:64:0x0133 A[Catch: IOException -> 0x0137, TRY_ENTER, TRY_LEAVE, TryCatch #1 {IOException -> 0x0137, blocks: (B:64:0x0133, B:53:0x0118), top: B:80:0x000a }] */
    /* JADX WARN: Removed duplicated region for block: B:96:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:97:? A[RETURN, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private void d(com.mbridge.msdk.foundation.entity.CampaignEx r11, int r12) throws java.lang.Throwable {
        /*
            Method dump skipped, instruction units count: 340
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.mbridge.msdk.advanced.manager.b.d(com.mbridge.msdk.foundation.entity.CampaignEx, int):void");
    }

    private void e(CampaignEx campaignEx, int i10) throws Throwable {
        MBNativeAdvancedView mBNativeAdvancedView = this.f35389f;
        if (mBNativeAdvancedView != null) {
            mBNativeAdvancedView.clearResState();
        }
        if (!TextUtils.isEmpty(campaignEx.getAdZip())) {
            q0.a(f35383z, "开始下载zip： " + campaignEx.getAdZip());
            g(campaignEx, i10);
        }
        if (!TextUtils.isEmpty(campaignEx.getAdHtml())) {
            q0.a(f35383z, "开始下载HTML： " + campaignEx.getAdHtml());
            d(campaignEx, i10);
        }
        if (!TextUtils.isEmpty(campaignEx.getVideoUrlEncode())) {
            q0.a(f35383z, "开始下载Video： " + campaignEx.getVideoUrlEncode());
            f(campaignEx, i10);
        }
        if (!TextUtils.isEmpty(campaignEx.getImageUrl())) {
            q0.a(f35383z, "开始下载image： " + campaignEx.getImageUrl());
            c(campaignEx, i10);
        }
        if (!TextUtils.isEmpty(campaignEx.getendcard_url())) {
            q0.a(f35383z, "开始下载EndCard： " + campaignEx.getendcard_url());
            a(campaignEx, i10);
        }
        if (TextUtils.isEmpty(campaignEx.getGifUrl())) {
            return;
        }
        q0.a(f35383z, "开始下载gitUrl： " + campaignEx.getGifUrl());
        b(campaignEx, i10);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void f() {
        this.f35405v = 0;
    }

    private void f(CampaignEx campaignEx, int i10) {
        this.f35401r = new d(campaignEx);
        CopyOnWriteArrayList<CampaignEx> copyOnWriteArrayList = new CopyOnWriteArrayList<>();
        copyOnWriteArrayList.add(campaignEx);
        com.mbridge.msdk.videocommon.download.b.getInstance().createUnitCache(this.f35388e, this.f35384a, copyOnWriteArrayList, 298, this.f35401r);
        if (!com.mbridge.msdk.videocommon.download.b.getInstance().b(298, this.f35384a, campaignEx.isBidCampaign())) {
            q0.a(f35383z, " load Video");
            com.mbridge.msdk.videocommon.download.b.getInstance().load(this.f35384a);
        } else {
            q0.a(f35383z, " load Video isReady true");
            this.f35389f.setVideoReady(true);
            i(campaignEx, i10);
        }
    }

    private void g() {
        try {
            int i10 = this.f35405v + 1;
            this.f35405v = i10;
            com.mbridge.msdk.setting.l lVar = this.f35390g;
            if (lVar == null || i10 > lVar.y()) {
                q0.c(f35383z, "onload 重置offset为0");
                this.f35405v = 0;
            }
            q0.c(f35383z, "onload 算出 下次的offset是:" + this.f35405v);
        } catch (Exception e10) {
            e10.printStackTrace();
        }
    }

    private void g(CampaignEx campaignEx, int i10) {
        String adZip;
        this.f35402s = new a(campaignEx, i10);
        com.mbridge.msdk.foundation.same.report.metrics.c cVar = new com.mbridge.msdk.foundation.same.report.metrics.c();
        cVar.a(campaignEx);
        if (campaignEx != null) {
            i = campaignEx.getAabEntity() != null ? campaignEx.getAabEntity().h3c : 0;
            adZip = campaignEx.getAdZip();
        } else {
            adZip = "";
        }
        cVar.f(i);
        cVar.e(2);
        H5DownLoadManager.getInstance().downloadH5Res(cVar, adZip, this.f35402s);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void h(CampaignEx campaignEx, int i10) {
        if (this.f35389f.isH5Ready()) {
            i(campaignEx, i10);
            com.mbridge.msdk.advanced.report.a.a(1, "", this.f35384a, campaignEx);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void i(CampaignEx campaignEx, int i10) {
        if (!com.mbridge.msdk.advanced.manager.d.a(this.f35389f, campaignEx, this.f35385b, this.f35384a) || this.f35400q) {
            return;
        }
        b();
        com.mbridge.msdk.advanced.manager.d.a(campaignEx, this.f35384a);
        this.f35400q = true;
        com.mbridge.msdk.advanced.middle.b bVar = this.f35387d;
        if (bVar != null) {
            bVar.a(campaignEx, i10);
        }
    }

    private void j(CampaignEx campaignEx, int i10) throws Throwable {
        this.f35392i = campaignEx;
        if (com.mbridge.msdk.advanced.manager.d.a(this.f35389f, campaignEx, this.f35385b, this.f35384a)) {
            i(campaignEx, i10);
        } else {
            e(campaignEx, i10);
        }
    }

    public String a(String str) {
        int iO;
        if (this.f35392i == null) {
            return "";
        }
        try {
            com.mbridge.msdk.videocommon.download.a aVarA = com.mbridge.msdk.videocommon.download.b.getInstance().a(this.f35384a, this.f35392i.getId() + this.f35392i.getVideoUrlEncode() + this.f35392i.getBidToken());
            if (aVarA == null || (iO = aVarA.o()) != 5) {
                return str;
            }
            String strP = aVarA.p();
            if (!new File(strP).exists()) {
                return str;
            }
            q0.b(f35383z, "本地已下载完 拿本地播放地址：" + strP + " state：" + iO);
            return strP;
        } catch (Exception e10) {
            q0.b(f35383z, e10.getMessage());
            return str;
        }
    }

    public void a(int i10) {
        this.f35393j = i10;
    }

    public void a(int i10, int i11) {
        this.f35396m = i10;
        this.f35395l = i11;
    }

    public void a(com.mbridge.msdk.advanced.middle.b bVar) {
        this.f35387d = bVar;
    }

    public void a(MBNativeAdvancedView mBNativeAdvancedView) {
        this.f35389f = mBNativeAdvancedView;
    }

    public void a(com.mbridge.msdk.setting.l lVar) {
        this.f35390g = lVar;
    }

    public void b(String str, int i10) {
        List<Integer> listC;
        this.f35400q = false;
        this.f35397n = str;
        this.f35398o = i10;
        this.f35392i = null;
        if (this.f35389f == null) {
            a(new com.mbridge.msdk.foundation.error.b(880030), str, i10, (CampaignEx) null);
            return;
        }
        CampaignEx campaignExA = TextUtils.isEmpty(str) ? com.mbridge.msdk.advanced.manager.d.a(this.f35389f, this.f35385b, this.f35384a, str, this.f35393j, false, false) : com.mbridge.msdk.advanced.manager.d.a(this.f35389f, this.f35385b, this.f35384a, str, this.f35393j, false, true);
        long timestamp = campaignExA != null ? campaignExA.getTimestamp() : 0L;
        com.mbridge.msdk.setting.l lVar = this.f35390g;
        if (lVar != null && lVar.t() == 1 && this.f35389f != null && campaignExA != null) {
            j(campaignExA, i10);
            return;
        }
        this.f35399p = false;
        com.mbridge.msdk.setting.l lVar2 = this.f35390g;
        if (lVar2 == null || (listC = lVar2.c()) == null || listC.size() <= 0) {
            this.f35386c = 30000L;
        } else {
            this.f35386c = listC.get(0).intValue() * 1000;
        }
        q0.a(f35383z, "开始从V3请求新的 offer，超时 ：" + this.f35386c);
        if (this.f35390g == null || timestamp <= 0 || !TextUtils.isEmpty(str)) {
            a(this.f35386c);
            a(this.f35388e, str, i10);
        } else if (System.currentTimeMillis() - timestamp <= this.f35390g.v() * 1000) {
            j(campaignExA, i10);
        } else {
            a(this.f35386c);
            a(this.f35388e, str, i10);
        }
    }

    public String c() {
        return com.mbridge.msdk.foundation.same.c.b(this.f35391h);
    }

    public String d() {
        return this.f35406w;
    }

    public void e() {
        if (this.f35387d != null) {
            this.f35387d = null;
        }
        if (this.f35401r != null) {
            this.f35401r = null;
        }
        if (this.f35402s != null) {
            this.f35402s = null;
        }
    }
}
