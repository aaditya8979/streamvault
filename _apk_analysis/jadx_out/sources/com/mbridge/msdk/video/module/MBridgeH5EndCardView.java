package com.mbridge.msdk.video.module;

import android.app.Activity;
import android.content.Context;
import android.content.res.Configuration;
import android.graphics.drawable.ColorDrawable;
import android.net.Uri;
import android.os.Handler;
import android.os.Looper;
import android.os.Message;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.util.Base64;
import android.util.DisplayMetrics;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.webkit.WebView;
import android.widget.ImageView;
import android.widget.RelativeLayout;
import androidx.exifinterface.media.ExifInterface;
import androidx.multidex.MultiDexExtractor;
import androidx.recyclerview.widget.ItemTouchHelper;
import com.ironsource.C3978d4;
import com.mbridge.msdk.MBridgeConstans;
import com.mbridge.msdk.foundation.download.download.H5DownLoadManager;
import com.mbridge.msdk.foundation.download.download.HTMLResourceManager;
import com.mbridge.msdk.foundation.entity.CampaignEx;
import com.mbridge.msdk.foundation.entity.n;
import com.mbridge.msdk.foundation.tools.a1;
import com.mbridge.msdk.foundation.tools.b1;
import com.mbridge.msdk.foundation.tools.i0;
import com.mbridge.msdk.foundation.tools.m0;
import com.mbridge.msdk.foundation.tools.q0;
import com.mbridge.msdk.foundation.tools.u0;
import com.mbridge.msdk.foundation.tools.v0;
import com.mbridge.msdk.mbsignalcommon.windvane.WindVaneWebView;
import com.mbridge.msdk.out.Campaign;
import com.safedk.android.analytics.brandsafety.DetectTouchUtils;
import com.safedk.android.internal.partials.MintegralNetworkBridge;
import java.io.File;
import java.util.HashMap;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes3.dex */
public class MBridgeH5EndCardView extends MBridgeH5EndCardViewDiff {
    private int A;
    private long B;
    private boolean C;
    private boolean D;
    private boolean E;
    private boolean F;
    private boolean G;
    private boolean H;
    private boolean I;
    private boolean J;
    private String K;
    public Handler L;
    private boolean M;
    private boolean N;
    public boolean O;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public View f41679m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public RelativeLayout f41680n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public ImageView f41681o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public WindVaneWebView f41682p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    private boolean f41683q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public Handler f41684r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public String f41685s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public boolean f41686t;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    public boolean f41687u;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    private boolean f41688v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    private int f41689w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    private int f41690x;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    private boolean f41691y;

    /* JADX INFO: renamed from: z, reason: collision with root package name */
    private boolean f41692z;

    public class a extends Handler {
        public a(Looper looper) {
            super(looper);
        }

        @Override // android.os.Handler
        public void handleMessage(Message message) {
            super.handleMessage(message);
            if (message.what != 100) {
                return;
            }
            if (MBridgeH5EndCardView.this.C) {
                MBridgeH5EndCardView.this.notifyListener.a(122, "");
            }
            MBridgeH5EndCardView.this.notifyListener.a(103, "");
        }
    }

    public class b implements View.OnClickListener {
        public b() {
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            MBridgeH5EndCardView.this.onCloseViewClick();
        }
    }

    public class c extends com.mbridge.msdk.mbsignalcommon.listener.b {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final /* synthetic */ boolean f41695a;

        public c(boolean z10) {
            this.f41695a = z10;
        }

        @Override // com.mbridge.msdk.mbsignalcommon.listener.b, com.mbridge.msdk.mbsignalcommon.windvane.c
        public void a(WebView webView, int i10) {
            super.a(webView, i10);
            q0.c("WindVaneWebView", "h5EncardView readyStatus:" + i10 + "- isError" + MBridgeH5EndCardView.this.f41687u);
            MBridgeH5EndCardView.this.A = i10;
            if (!MBridgeH5EndCardView.this.f41687u) {
                MBridgeH5EndCardView.this.a(System.currentTimeMillis() - MBridgeH5EndCardView.this.B, false);
            }
            if (this.f41695a) {
                try {
                    com.mbridge.msdk.foundation.same.report.metrics.e eVar = new com.mbridge.msdk.foundation.same.report.metrics.e();
                    eVar.a("type", 3);
                    eVar.a("result", Integer.valueOf(i10));
                    com.mbridge.msdk.foundation.same.report.metrics.d.b().a("2000155", MBridgeH5EndCardView.this.f41632b, eVar);
                } catch (Throwable th2) {
                    q0.b("WindVaneWebView", th2.getMessage());
                }
            }
        }

        @Override // com.mbridge.msdk.mbsignalcommon.listener.b, com.mbridge.msdk.mbsignalcommon.windvane.c
        public void b(WebView webView, int i10) {
            super.b(webView, i10);
            MBridgeH5EndCardView.this.A = i10;
            if (MBridgeH5EndCardView.this.f41692z) {
                return;
            }
            MBridgeH5EndCardView.this.f41692z = true;
            if (i10 == 1) {
                MBridgeH5EndCardView.this.reportRenderResult("success", 4);
            } else {
                MBridgeH5EndCardView.this.notifyListener.a(127, "");
                MBridgeH5EndCardView.this.reportRenderResult(C3978d4.i.f31363t, 6);
            }
        }

        @Override // com.mbridge.msdk.mbsignalcommon.listener.b, com.mbridge.msdk.mbsignalcommon.windvane.c
        public void onPageFinished(WebView webView, String str) {
            super.onPageFinished(webView, str);
            MBridgeH5EndCardView mBridgeH5EndCardView = MBridgeH5EndCardView.this;
            if (mBridgeH5EndCardView.f41687u) {
                return;
            }
            mBridgeH5EndCardView.f41686t = true;
            mBridgeH5EndCardView.notifyListener.a(100, "");
            if (MBridgeH5EndCardView.this.f41632b != null) {
                n nVar = new n();
                nVar.n(MBridgeH5EndCardView.this.f41632b.getRequestId());
                nVar.o(MBridgeH5EndCardView.this.f41632b.getRequestIdNotice());
                nVar.b(MBridgeH5EndCardView.this.f41632b.getId());
                nVar.d(1);
                nVar.e(String.valueOf(System.currentTimeMillis() - MBridgeH5EndCardView.this.B));
                nVar.m("onPageFinished");
                String str2 = "2";
                if (MBridgeH5EndCardView.this.f41632b.getAdType() == 287) {
                    nVar.a(ExifInterface.GPS_MEASUREMENT_3D);
                } else if (MBridgeH5EndCardView.this.f41632b.getAdType() == 94) {
                    nVar.a("1");
                } else if (MBridgeH5EndCardView.this.f41632b.getAdType() == 42) {
                    nVar.a("2");
                }
                if (MBridgeH5EndCardView.this.f41632b.isMraid()) {
                    nVar.b(n.N);
                } else {
                    nVar.g(MBridgeH5EndCardView.this.f41632b.getendcard_url());
                    if (a1.b(MBridgeH5EndCardView.this.f41632b.getendcard_url()) && MBridgeH5EndCardView.this.f41632b.getendcard_url().contains(MultiDexExtractor.EXTRACTED_SUFFIX)) {
                        str2 = "1";
                    }
                    nVar.f(str2);
                    nVar.b(n.O);
                }
                MBridgeH5EndCardView mBridgeH5EndCardView2 = MBridgeH5EndCardView.this;
                com.mbridge.msdk.foundation.same.report.g.b(nVar, mBridgeH5EndCardView2.unitId, mBridgeH5EndCardView2.f41632b);
            }
            MBridgeH5EndCardView.this.notifyListener.a(120, "");
            if (this.f41695a) {
                return;
            }
            try {
                com.mbridge.msdk.foundation.same.report.metrics.e eVar = new com.mbridge.msdk.foundation.same.report.metrics.e();
                eVar.a("type", 3);
                eVar.a("result", 1);
                com.mbridge.msdk.foundation.same.report.metrics.d.b().a("2000155", MBridgeH5EndCardView.this.f41632b, eVar);
            } catch (Throwable th2) {
                q0.b("WindVaneWebView", th2.getMessage());
            }
        }

        @Override // com.mbridge.msdk.mbsignalcommon.listener.b, com.mbridge.msdk.mbsignalcommon.windvane.c
        public void onReceivedError(WebView webView, int i10, String str, String str2) {
            super.onReceivedError(webView, i10, str, str2);
            MBridgeH5EndCardView mBridgeH5EndCardView = MBridgeH5EndCardView.this;
            if (mBridgeH5EndCardView.f41687u) {
                return;
            }
            mBridgeH5EndCardView.notifyListener.a(118, "onReceivedError " + i10 + str);
            MBridgeH5EndCardView.this.reportRenderResult(str, 3);
            MBridgeH5EndCardView.this.notifyListener.a(127, "");
            MBridgeH5EndCardView.this.notifyListener.a(129, "");
            MBridgeH5EndCardView.this.f41687u = true;
        }

        @Override // com.mbridge.msdk.mbsignalcommon.listener.b, com.mbridge.msdk.mbsignalcommon.windvane.c
        public void onRenderProcessGone(WebView webView) {
            super.onRenderProcessGone(webView);
            MBridgeH5EndCardView.this.setCloseVisible(0);
        }
    }

    public class d implements Runnable {
        public d() {
        }

        @Override // java.lang.Runnable
        public void run() {
            String string;
            try {
                q0.a(MBridgeBaseView.TAG, "webviewshow");
                try {
                    int[] iArr = new int[2];
                    MBridgeH5EndCardView.this.f41682p.getLocationOnScreen(iArr);
                    q0.b(MBridgeBaseView.TAG, "coordinate:" + iArr[0] + "--" + iArr[1]);
                    JSONObject jSONObject = new JSONObject();
                    Context contextD = com.mbridge.msdk.foundation.controller.c.n().d();
                    if (contextD != null) {
                        jSONObject.put("startX", v0.b(contextD, iArr[0]));
                        jSONObject.put("startY", v0.b(contextD, iArr[1]));
                        jSONObject.put(com.mbridge.msdk.foundation.same.a.f37703l, v0.d(contextD));
                    }
                    string = jSONObject.toString();
                } catch (Throwable th2) {
                    q0.b(MBridgeBaseView.TAG, th2.getMessage(), th2);
                    string = "";
                }
                com.mbridge.msdk.mbsignalcommon.windvane.f.a().a((WebView) MBridgeH5EndCardView.this.f41682p, "webviewshow", Base64.encodeToString(string.toString().getBytes(), 2));
                MBridgeH5EndCardView.this.notifyListener.a(109, "");
                MBridgeH5EndCardView.this.i();
                MBridgeH5EndCardView.this.startCounterEndCardShowTimer();
                com.mbridge.msdk.mbsignalcommon.windvane.f fVarA = com.mbridge.msdk.mbsignalcommon.windvane.f.a();
                MBridgeH5EndCardView mBridgeH5EndCardView = MBridgeH5EndCardView.this;
                fVarA.a((WebView) mBridgeH5EndCardView.f41682p, "oncutoutfetched", Base64.encodeToString(mBridgeH5EndCardView.K.getBytes(), 0));
                MBridgeH5EndCardView.this.e();
            } catch (Exception e10) {
                e10.printStackTrace();
            }
        }
    }

    public class e implements com.mbridge.msdk.foundation.feedback.a {
        public e() {
        }

        @Override // com.mbridge.msdk.foundation.feedback.a
        public void a() {
            String string;
            try {
                JSONObject jSONObject = new JSONObject();
                if (com.mbridge.msdk.foundation.controller.c.n().d() != null) {
                    jSONObject.put("status", 1);
                }
                string = jSONObject.toString();
            } catch (Throwable th2) {
                q0.b(MBridgeBaseView.TAG, th2.getMessage(), th2);
                string = "";
            }
            com.mbridge.msdk.mbsignalcommon.windvane.f.a().a((WebView) MBridgeH5EndCardView.this.f41682p, "onFeedbackAlertStatusNotify", Base64.encodeToString(string.getBytes(), 2));
        }

        @Override // com.mbridge.msdk.foundation.feedback.a
        public void a(String str) {
            String string;
            try {
                JSONObject jSONObject = new JSONObject();
                if (com.mbridge.msdk.foundation.controller.c.n().d() != null) {
                    jSONObject.put("status", 2);
                }
                string = jSONObject.toString();
            } catch (Throwable th2) {
                q0.b(MBridgeBaseView.TAG, th2.getMessage(), th2);
                string = "";
            }
            com.mbridge.msdk.mbsignalcommon.windvane.f.a().a((WebView) MBridgeH5EndCardView.this.f41682p, "onFeedbackAlertStatusNotify", Base64.encodeToString(string.getBytes(), 2));
        }

        @Override // com.mbridge.msdk.foundation.feedback.a
        public void close() {
            String string;
            try {
                JSONObject jSONObject = new JSONObject();
                if (com.mbridge.msdk.foundation.controller.c.n().d() != null) {
                    jSONObject.put("status", 2);
                }
                string = jSONObject.toString();
            } catch (Throwable th2) {
                q0.b(MBridgeBaseView.TAG, th2.getMessage(), th2);
                string = "";
            }
            com.mbridge.msdk.mbsignalcommon.windvane.f.a().a((WebView) MBridgeH5EndCardView.this.f41682p, "onFeedbackAlertStatusNotify", Base64.encodeToString(string.getBytes(), 2));
        }
    }

    public class f implements Runnable {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private MBridgeH5EndCardView f41699a;

        public f(MBridgeH5EndCardView mBridgeH5EndCardView) {
            this.f41699a = mBridgeH5EndCardView;
        }

        @Override // java.lang.Runnable
        public void run() {
            Handler handler;
            try {
                Thread.sleep(300L);
            } catch (InterruptedException e10) {
                q0.b("CloseRunnable", e10.getMessage());
            }
            MBridgeH5EndCardView mBridgeH5EndCardView = this.f41699a;
            if (mBridgeH5EndCardView == null || (handler = mBridgeH5EndCardView.L) == null) {
                return;
            }
            handler.sendEmptyMessage(100);
        }
    }

    public class g implements Runnable {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private MBridgeH5EndCardView f41701a;

        public g(MBridgeH5EndCardView mBridgeH5EndCardView) {
            this.f41701a = mBridgeH5EndCardView;
        }

        @Override // java.lang.Runnable
        public void run() {
            MBridgeH5EndCardView mBridgeH5EndCardView = this.f41701a;
            if (mBridgeH5EndCardView == null || mBridgeH5EndCardView.f41692z) {
                return;
            }
            this.f41701a.f41692z = true;
            this.f41701a.f41686t = false;
            MBridgeH5EndCardView.this.reportRenderResult("timeout", 5);
            this.f41701a.notifyListener.a(127, "");
            q0.a(MBridgeBaseView.TAG, "notify TYPE_NOTIFY_SHOW_NATIVE_ENDCARD");
        }
    }

    public static class h implements Runnable {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private MBridgeH5EndCardView f41703a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private int f41704b;

        public h(MBridgeH5EndCardView mBridgeH5EndCardView, int i10) {
            this.f41703a = mBridgeH5EndCardView;
            this.f41704b = i10;
        }

        @Override // java.lang.Runnable
        public void run() {
            MBridgeH5EndCardView mBridgeH5EndCardView = this.f41703a;
            if (mBridgeH5EndCardView == null || mBridgeH5EndCardView.f41632b == null) {
                return;
            }
            try {
                if (mBridgeH5EndCardView.f41691y) {
                    q0.c(MBridgeBaseView.TAG, "insertEndCardReadyState hasInsertLoadEndCardReport true return");
                    return;
                }
                this.f41703a.f41691y = true;
                n nVar = new n("m_download_end", 12, (this.f41704b * 1000) + "", this.f41703a.f41632b.getendcard_url(), this.f41703a.f41632b.getId(), this.f41703a.unitId, "ready timeout", (a1.b(this.f41703a.f41632b.getendcard_url()) && this.f41703a.f41632b.getendcard_url().contains(MultiDexExtractor.EXTRACTED_SUFFIX)) ? "1" : "2");
                try {
                    if (this.f41703a.f41632b.getAdType() == 287) {
                        nVar.a(ExifInterface.GPS_MEASUREMENT_3D);
                    } else if (this.f41703a.f41632b.getAdType() == 94) {
                        nVar.a("1");
                    } else if (this.f41703a.f41632b.getAdType() == 42) {
                        nVar.a("2");
                    }
                } catch (Exception e10) {
                    e10.printStackTrace();
                }
                nVar.n(this.f41703a.f41632b.getRequestId());
                nVar.k(this.f41703a.f41632b.getCurrentLocalRid());
                nVar.o(this.f41703a.f41632b.getRequestIdNotice());
                nVar.a(this.f41703a.f41632b.getAdSpaceT());
                this.f41703a.isLoadSuccess();
            } catch (Throwable th2) {
                q0.b(MBridgeBaseView.TAG, th2.getMessage(), th2);
            }
        }
    }

    public class i implements Runnable {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private MBridgeH5EndCardView f41705a;

        public i(MBridgeH5EndCardView mBridgeH5EndCardView) {
            this.f41705a = mBridgeH5EndCardView;
        }

        @Override // java.lang.Runnable
        public void run() {
            MBridgeH5EndCardView mBridgeH5EndCardView = this.f41705a;
            if (mBridgeH5EndCardView != null) {
                mBridgeH5EndCardView.G = true;
            }
        }
    }

    public class j implements Runnable {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private MBridgeH5EndCardView f41707a;

        public j(MBridgeH5EndCardView mBridgeH5EndCardView) {
            this.f41707a = mBridgeH5EndCardView;
        }

        @Override // java.lang.Runnable
        public void run() {
            MBridgeH5EndCardView mBridgeH5EndCardView = this.f41707a;
            if (mBridgeH5EndCardView != null) {
                mBridgeH5EndCardView.H = true;
            }
        }
    }

    public class k implements Runnable {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private MBridgeH5EndCardView f41709a;

        public k(MBridgeH5EndCardView mBridgeH5EndCardView) {
            this.f41709a = mBridgeH5EndCardView;
        }

        @Override // java.lang.Runnable
        public void run() {
            MBridgeH5EndCardView mBridgeH5EndCardView = this.f41709a;
            if (mBridgeH5EndCardView != null) {
                if (!mBridgeH5EndCardView.I) {
                    MBridgeH5EndCardView.this.setCloseVisible(0);
                }
                this.f41709a.D = true;
            }
        }
    }

    public MBridgeH5EndCardView(Context context) {
        super(context);
        this.f41683q = false;
        this.f41684r = new Handler();
        this.f41686t = false;
        this.f41687u = false;
        this.f41688v = false;
        this.f41689w = 1;
        this.f41690x = 1;
        this.f41691y = false;
        this.f41692z = false;
        this.A = 1;
        this.B = 0L;
        this.C = false;
        this.D = false;
        this.E = false;
        this.F = false;
        this.G = false;
        this.H = false;
        this.I = false;
        this.J = false;
        this.K = "";
        this.L = new a(Looper.getMainLooper());
        this.M = false;
        this.N = false;
        this.O = false;
    }

    public MBridgeH5EndCardView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f41683q = false;
        this.f41684r = new Handler();
        this.f41686t = false;
        this.f41687u = false;
        this.f41688v = false;
        this.f41689w = 1;
        this.f41690x = 1;
        this.f41691y = false;
        this.f41692z = false;
        this.A = 1;
        this.B = 0L;
        this.C = false;
        this.D = false;
        this.E = false;
        this.F = false;
        this.G = false;
        this.H = false;
        this.I = false;
        this.J = false;
        this.K = "";
        this.L = new a(Looper.getMainLooper());
        this.M = false;
        this.N = false;
        this.O = false;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Can't wrap try/catch for region: R(13:6|7|(1:12)(1:11)|13|(1:15)(2:16|(1:18)(8:20|21|50|22|(1:24)(2:25|(1:27)(2:28|(1:30)))|49|34|(1:53)(4:38|(1:40)(1:41)|42|54)))|19|21|50|22|(0)(0)|49|34|(2:36|53)(1:52)) */
    /* JADX WARN: Code restructure failed: missing block: B:32:0x00a7, code lost:
    
        r0 = move-exception;
     */
    /* JADX WARN: Code restructure failed: missing block: B:33:0x00a8, code lost:
    
        r0.printStackTrace();
     */
    /* JADX WARN: Removed duplicated region for block: B:24:0x0085 A[Catch: NullPointerException -> 0x00a7, all -> 0x011c, TryCatch #1 {NullPointerException -> 0x00a7, blocks: (B:22:0x007b, B:24:0x0085, B:25:0x008b, B:27:0x0095, B:28:0x0099, B:30:0x00a3), top: B:50:0x007b, outer: #0 }] */
    /* JADX WARN: Removed duplicated region for block: B:25:0x008b A[Catch: NullPointerException -> 0x00a7, all -> 0x011c, TryCatch #1 {NullPointerException -> 0x00a7, blocks: (B:22:0x007b, B:24:0x0085, B:25:0x008b, B:27:0x0095, B:28:0x0099, B:30:0x00a3), top: B:50:0x007b, outer: #0 }] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public void a(long r18, boolean r20) {
        /*
            Method dump skipped, instruction units count: 295
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.mbridge.msdk.video.module.MBridgeH5EndCardView.a(long, boolean):void");
    }

    private static void a(n nVar, CampaignEx campaignEx) {
        try {
            com.mbridge.msdk.videocommon.setting.c cVarC = com.mbridge.msdk.videocommon.setting.b.b().c(com.mbridge.msdk.foundation.controller.c.n().b(), campaignEx.getCampaignUnitId());
            if (cVarC != null) {
                nVar.s(cVarC.x());
            }
            com.mbridge.msdk.videocommon.setting.a aVarC = com.mbridge.msdk.videocommon.setting.b.b().c();
            if (aVarC != null) {
                nVar.r(aVarC.f());
            }
        } catch (Exception e10) {
            q0.b(MBridgeBaseView.TAG, e10.getMessage());
        }
    }

    private boolean a(View view) {
        this.f41681o = (ImageView) view.findViewById(findID("mbridge_windwv_close"));
        this.f41680n = (RelativeLayout) view.findViewById(findID("mbridge_windwv_content_rl"));
        WindVaneWebView windVaneWebView = new WindVaneWebView(getContext());
        this.f41682p = windVaneWebView;
        CampaignEx campaignEx = this.f41632b;
        if (campaignEx != null) {
            windVaneWebView.setLocalRequestId(campaignEx.getCurrentLocalRid());
        }
        this.f41682p.setLayoutParams(new RelativeLayout.LayoutParams(-1, -1));
        this.f41680n.addView(this.f41682p);
        return isNotNULL(this.f41681o, this.f41682p);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void e() {
        try {
            CampaignEx campaignEx = this.f41632b;
            if (campaignEx != null) {
                campaignEx.setCampaignUnitId(this.unitId);
                com.mbridge.msdk.foundation.feedback.b.b().d(this.unitId + "_1");
                com.mbridge.msdk.foundation.feedback.b.b().a(this.unitId + "_2", this.f41632b);
            }
            CampaignEx campaignEx2 = this.f41632b;
            if (campaignEx2 == null || !campaignEx2.isMraid()) {
                return;
            }
            ImageView imageView = new ImageView(com.mbridge.msdk.foundation.controller.c.n().d());
            imageView.setBackgroundResource(i0.a(com.mbridge.msdk.foundation.controller.c.n().d(), "mbridge_reward_notice", "drawable"));
            ImageView imageView2 = this.f41681o;
            RelativeLayout.LayoutParams layoutParams = imageView2 != null ? (RelativeLayout.LayoutParams) imageView2.getLayoutParams() : null;
            RelativeLayout.LayoutParams layoutParams2 = new RelativeLayout.LayoutParams(v0.a(com.mbridge.msdk.foundation.controller.c.n().d(), 12.0f), v0.a(com.mbridge.msdk.foundation.controller.c.n().d(), 12.0f));
            layoutParams2.addRule(9);
            layoutParams2.addRule(10);
            if (layoutParams != null) {
                layoutParams2.leftMargin = layoutParams.rightMargin;
                layoutParams2.topMargin = layoutParams.topMargin;
                layoutParams2.width = layoutParams.width;
                layoutParams2.height = layoutParams.height;
            } else {
                layoutParams2.leftMargin = v0.a(com.mbridge.msdk.foundation.controller.c.n().d(), 12.0f);
                layoutParams2.topMargin = v0.a(com.mbridge.msdk.foundation.controller.c.n().d(), 12.0f);
            }
            addView(imageView, layoutParams2);
            v0.a(4, imageView, this.f41632b, com.mbridge.msdk.foundation.controller.c.n().d(), false, new e());
        } catch (Exception e10) {
            e10.printStackTrace();
        }
    }

    private void f() {
        if (this.M || this.E) {
            return;
        }
        this.M = true;
        int i10 = this.f41689w;
        if (i10 == 0) {
            this.G = true;
            return;
        }
        this.G = false;
        if (i10 > -1) {
            this.f41684r.postDelayed(new i(this), this.f41689w * 1000);
        }
    }

    private void g() {
        if (this.N || this.E) {
            return;
        }
        this.N = true;
        int i10 = this.f41690x;
        if (i10 == 0) {
            this.H = true;
            return;
        }
        this.H = false;
        if (i10 > -1) {
            this.f41684r.postDelayed(new j(this), this.f41690x * 1000);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:34:0x008b  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private void h() {
        /*
            r7 = this;
            java.lang.String r0 = "wfr=1"
            java.lang.String r1 = "="
            long r2 = java.lang.System.currentTimeMillis()     // Catch: java.lang.Throwable -> L96
            r7.B = r2     // Catch: java.lang.Throwable -> L96
            com.mbridge.msdk.foundation.entity.CampaignEx r2 = r7.f41632b     // Catch: java.lang.Throwable -> L96
            java.lang.String r2 = r2.getendcard_url()     // Catch: java.lang.Throwable -> L96
            com.mbridge.msdk.videocommon.setting.b r3 = com.mbridge.msdk.videocommon.setting.b.b()     // Catch: java.lang.Throwable -> L96
            com.mbridge.msdk.foundation.controller.c r4 = com.mbridge.msdk.foundation.controller.c.n()     // Catch: java.lang.Throwable -> L96
            java.lang.String r4 = r4.b()     // Catch: java.lang.Throwable -> L96
            java.lang.String r5 = r7.unitId     // Catch: java.lang.Throwable -> L96
            com.mbridge.msdk.videocommon.setting.c r3 = r3.c(r4, r5)     // Catch: java.lang.Throwable -> L96
            boolean r4 = r7.f41688v     // Catch: java.lang.Throwable -> L96
            if (r4 == 0) goto La0
            boolean r4 = com.mbridge.msdk.foundation.tools.a1.b(r2)     // Catch: java.lang.Throwable -> L96
            if (r4 == 0) goto La0
            boolean r4 = r2.contains(r0)     // Catch: java.lang.Throwable -> L96
            if (r4 != 0) goto L3b
            if (r3 == 0) goto La0
            int r4 = r3.v()     // Catch: java.lang.Throwable -> L96
            if (r4 <= 0) goto La0
        L3b:
            boolean r0 = r2.contains(r0)     // Catch: java.lang.Throwable -> L96
            r4 = 20
            if (r0 == 0) goto L7e
            java.lang.String r0 = "&"
            java.lang.String[] r0 = r2.split(r0)     // Catch: java.lang.Throwable -> L96
            if (r0 == 0) goto L8b
            int r2 = r0.length     // Catch: java.lang.Throwable -> L96
            if (r2 <= 0) goto L8b
            int r2 = r0.length     // Catch: java.lang.Throwable -> L96
            r3 = 0
        L50:
            if (r3 >= r2) goto L8b
            r5 = r0[r3]     // Catch: java.lang.Throwable -> L96
            boolean r6 = com.mbridge.msdk.foundation.tools.a1.b(r5)     // Catch: java.lang.Throwable -> L96
            if (r6 == 0) goto L7b
            java.lang.String r6 = "to"
            boolean r6 = r5.contains(r6)     // Catch: java.lang.Throwable -> L96
            if (r6 == 0) goto L7b
            java.lang.String[] r6 = r5.split(r1)     // Catch: java.lang.Throwable -> L96
            if (r6 == 0) goto L7b
            java.lang.String[] r6 = r5.split(r1)     // Catch: java.lang.Throwable -> L96
            int r6 = r6.length     // Catch: java.lang.Throwable -> L96
            if (r6 <= 0) goto L7b
            java.lang.String[] r0 = r5.split(r1)     // Catch: java.lang.Throwable -> L96
            r1 = 1
            r0 = r0[r1]     // Catch: java.lang.Throwable -> L96
            int r0 = com.mbridge.msdk.foundation.tools.v0.a(r0)     // Catch: java.lang.Throwable -> L96
            goto L8c
        L7b:
            int r3 = r3 + 1
            goto L50
        L7e:
            if (r3 == 0) goto L8b
            int r0 = r3.v()     // Catch: java.lang.Throwable -> L96
            if (r0 <= 0) goto L8b
            int r0 = r3.v()     // Catch: java.lang.Throwable -> L96
            goto L8c
        L8b:
            r0 = r4
        L8c:
            if (r0 < 0) goto L92
            r7.excuteEndCardShowTask(r0)     // Catch: java.lang.Throwable -> L96
            goto La0
        L92:
            r7.excuteEndCardShowTask(r4)     // Catch: java.lang.Throwable -> L96
            goto La0
        L96:
            r0 = move-exception
            java.lang.String r1 = r0.getMessage()
            java.lang.String r2 = "MBridgeBaseView"
            com.mbridge.msdk.foundation.tools.q0.b(r2, r1, r0)
        La0:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.mbridge.msdk.video.module.MBridgeH5EndCardView.h():void");
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void i() {
        CampaignEx campaignEx = this.f41632b;
        if (campaignEx == null || !campaignEx.isMraid()) {
            return;
        }
        int i10 = getResources().getConfiguration().orientation;
        String str = "undefined";
        if (i10 != 0) {
            if (i10 == 1) {
                str = C3978d4.i.D;
            } else if (i10 == 2) {
                str = C3978d4.i.C;
            }
        }
        JSONObject jSONObject = new JSONObject();
        try {
            jSONObject.put("orientation", str);
            jSONObject.put("locked", "true");
        } catch (Exception e10) {
            e10.printStackTrace();
        }
        HashMap map = new HashMap();
        map.put("placementType", "Interstitial");
        map.put("state", "default");
        map.put("viewable", "true");
        map.put("currentAppOrientation", jSONObject);
        if (getContext() instanceof Activity) {
            float fN = m0.n(getContext());
            float fM = m0.m(getContext());
            DisplayMetrics displayMetrics = new DisplayMetrics();
            ((Activity) getContext()).getWindowManager().getDefaultDisplay().getMetrics(displayMetrics);
            float f10 = displayMetrics.widthPixels;
            float f11 = displayMetrics.heightPixels;
            com.mbridge.msdk.mbsignalcommon.mraid.a.a().b(this.f41682p, fN, fM);
            com.mbridge.msdk.mbsignalcommon.mraid.a.a().a(this.f41682p, f10, f11);
        }
        com.mbridge.msdk.mbsignalcommon.mraid.a.a().b(this.f41682p, r7.getLeft(), this.f41682p.getTop(), this.f41682p.getWidth(), this.f41682p.getHeight());
        com.mbridge.msdk.mbsignalcommon.mraid.a.a().a(this.f41682p, r13.getLeft(), this.f41682p.getTop(), this.f41682p.getWidth(), this.f41682p.getHeight());
        com.mbridge.msdk.mbsignalcommon.mraid.a.a().a(this.f41682p, map);
        com.mbridge.msdk.mbsignalcommon.mraid.a.a().a(this.f41682p, com.mbridge.msdk.mbsignalcommon.mraid.d.f38880f);
        com.mbridge.msdk.mbsignalcommon.mraid.a.a().a(this.f41682p);
    }

    public boolean canBackPress() {
        ImageView imageView = this.f41681o;
        return imageView != null && imageView.getVisibility() == 0;
    }

    @Override // com.mbridge.msdk.video.module.MBridgeH5EndCardViewDiff, com.mbridge.msdk.mbsignalcommon.mraid.b
    public void close() {
        try {
            onCloseViewClick();
        } catch (Exception e10) {
            q0.b(MBridgeBaseView.TAG, e10.getMessage());
        }
    }

    @Override // com.mbridge.msdk.video.module.MBridgeBaseView
    public void d() {
        super.d();
        if (this.f41635e) {
            this.f41681o.setOnClickListener(new b());
        }
    }

    @Override // com.mbridge.msdk.video.module.MBridgeBaseView
    public void defaultShow() {
        super.defaultShow();
    }

    @Override // com.mbridge.msdk.video.module.MBridgeH5EndCardViewDiff, com.mbridge.msdk.video.module.MBridgeBaseView, android.view.ViewGroup, android.view.View
    public boolean dispatchTouchEvent(MotionEvent motionEvent) {
        DetectTouchUtils.viewOnTouch(com.safedk.android.utils.g.f53141o, this, motionEvent);
        return super.dispatchTouchEvent(motionEvent);
    }

    public void excuteEndCardShowTask(int i10) {
        this.f41684r.postDelayed(new h(this, i10), i10 * 1000);
    }

    public void excuteTask() {
        if (this.f41688v || this.f41689w <= -1) {
            return;
        }
        this.f41684r.postDelayed(new k(this), this.f41689w * 1000);
    }

    public void executeEndCardShow(int i10) {
        this.f41684r.postDelayed(new g(this), i10 * 1000);
    }

    @Override // com.mbridge.msdk.video.module.MBridgeH5EndCardViewDiff, com.mbridge.msdk.mbsignalcommon.mraid.b
    public void expand(String str, boolean z10) {
    }

    public RelativeLayout.LayoutParams getContentLayoutParams() {
        return new RelativeLayout.LayoutParams(-1, -1);
    }

    @Override // com.mbridge.msdk.video.module.MBridgeH5EndCardViewDiff, com.mbridge.msdk.mbsignalcommon.mraid.b
    public CampaignEx getMraidCampaign() {
        return this.f41632b;
    }

    public String getURL() {
        CampaignEx campaignEx = this.f41632b;
        if (campaignEx == null) {
            this.C = false;
            return null;
        }
        this.C = true;
        if (campaignEx.isMraid()) {
            this.f41688v = false;
            String mraid = this.f41632b.getMraid();
            if (TextUtils.isEmpty(mraid)) {
                return this.f41632b.getEndScreenUrl();
            }
            File file = new File(mraid);
            try {
                if (file.exists() && file.isFile() && file.canRead()) {
                    mraid = "file:////" + mraid;
                } else {
                    mraid = this.f41632b.getEndScreenUrl();
                }
                return mraid;
            } catch (Throwable th2) {
                if (!MBridgeConstans.DEBUG) {
                    return mraid;
                }
                th2.printStackTrace();
                return mraid;
            }
        }
        String str = this.f41632b.getendcard_url();
        if (a1.a(str)) {
            this.f41688v = false;
            return this.f41632b.getEndScreenUrl();
        }
        this.f41688v = true;
        String h5ResAddress = H5DownLoadManager.getInstance().getH5ResAddress(str);
        if (!TextUtils.isEmpty(h5ResAddress)) {
            return h5ResAddress + "&native_adtype=" + this.f41632b.getAdType();
        }
        try {
            String path = Uri.parse(str).getPath();
            if (!TextUtils.isEmpty(path) && path.toLowerCase().endsWith(MultiDexExtractor.EXTRACTED_SUFFIX)) {
                String endScreenUrl = this.f41632b.getEndScreenUrl();
                if (TextUtils.isEmpty(endScreenUrl)) {
                    return null;
                }
                this.f41688v = false;
                excuteTask();
                return endScreenUrl;
            }
        } catch (Throwable th3) {
            q0.b(MBridgeBaseView.TAG, th3.getMessage());
        }
        return str + "&native_adtype=" + this.f41632b.getAdType();
    }

    @Override // com.mbridge.msdk.video.module.MBridgeH5EndCardViewDiff
    public void handlerPlayableException(String str) {
        if (this.f41687u) {
            return;
        }
        this.f41687u = true;
        this.f41686t = false;
        if (this.f41632b != null) {
            n nVar = new n();
            nVar.n(this.f41632b.getRequestId());
            nVar.o(this.f41632b.getRequestIdNotice());
            nVar.b(this.f41632b.getId());
            nVar.m(str);
            com.mbridge.msdk.foundation.same.report.g.a(nVar, this.f41631a.getApplicationContext(), this.unitId);
        }
    }

    @Override // com.mbridge.msdk.video.module.MBridgeBaseView
    public void init(Context context) {
        int iFindLayout = findLayout("mbridge_reward_endcard_h5");
        if (i0.a(iFindLayout)) {
            View viewInflate = this.f41633c.inflate(iFindLayout, (ViewGroup) null);
            this.f41679m = viewInflate;
            try {
                this.f41635e = a(viewInflate);
            } catch (Exception unused) {
                this.f41635e = false;
            }
            addView(this.f41679m, getContentLayoutParams());
            d();
            j();
        }
    }

    @Override // com.mbridge.msdk.video.module.MBridgeH5EndCardViewDiff
    public void install(CampaignEx campaignEx) {
    }

    public boolean isLoadSuccess() {
        return this.f41686t;
    }

    public boolean isPlayable() {
        return this.f41688v;
    }

    public void j() {
        if (this.f41635e) {
            setMatchParent();
        }
    }

    @Override // com.mbridge.msdk.video.module.MBridgeH5EndCardViewDiff, com.mbridge.msdk.video.signal.h
    public void notifyCloseBtn(int i10) {
        if (i10 == 0) {
            this.E = true;
        } else {
            if (i10 != 1) {
                return;
            }
            this.F = true;
        }
    }

    public void onBackPress() {
        boolean z10;
        if (this.D || (((z10 = this.E) && this.F) || (!(z10 || !this.G || this.O) || (!z10 && this.H && this.O)))) {
            onCloseViewClick();
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.String] */
    /* JADX WARN: Type inference failed for: r0v6, types: [com.mbridge.msdk.foundation.same.report.metrics.d] */
    /* JADX WARN: Type inference failed for: r1v0 */
    /* JADX WARN: Type inference failed for: r1v6, types: [java.lang.String] */
    /* JADX WARN: Type inference failed for: r2v0 */
    /* JADX WARN: Type inference failed for: r2v7, types: [com.mbridge.msdk.foundation.entity.CampaignEx] */
    /* JADX WARN: Type inference fix 'apply assigned field type' failed
    java.lang.UnsupportedOperationException: ArgType.getObject(), call class: class jadx.core.dex.instructions.args.ArgType$UnknownArg
    	at jadx.core.dex.instructions.args.ArgType.getObject(ArgType.java:593)
    	at jadx.core.dex.attributes.nodes.ClassTypeVarsAttr.getTypeVarsMapFor(ClassTypeVarsAttr.java:35)
    	at jadx.core.dex.nodes.utils.TypeUtils.replaceClassGenerics(TypeUtils.java:177)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.insertExplicitUseCast(FixTypesVisitor.java:397)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryFieldTypeWithNewCasts(FixTypesVisitor.java:359)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.applyFieldType(FixTypesVisitor.java:309)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.visit(FixTypesVisitor.java:94)
     */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:9:0x0032 -> B:17:0x005a). Please report as a decompilation issue!!! */
    public void onCloseViewClick() {
        Object objB = "";
        int i10 = 119;
        int i11 = 103;
        try {
            if (this.f41682p != null) {
                com.mbridge.msdk.mbsignalcommon.windvane.f.a().a((WebView) this.f41682p, "onSystemDestory", "");
                new Thread(new f(this)).start();
            } else {
                this.notifyListener.a(103, "");
                this.notifyListener.a(119, "webview is null when closing webview");
            }
        } catch (Exception e10) {
            this.notifyListener.a(i11, objB);
            this.notifyListener.a(i10, "close webview exception" + e10.getMessage());
            q0.a(MBridgeBaseView.TAG, e10.getMessage());
        }
        try {
            com.mbridge.msdk.foundation.same.report.metrics.e eVar = new com.mbridge.msdk.foundation.same.report.metrics.e();
            eVar.a("type", 2);
            com.mbridge.msdk.foundation.same.report.metrics.d.b().a("2000152", eVar);
            objB = com.mbridge.msdk.foundation.same.report.metrics.d.b();
            i10 = "2000134";
            i11 = this.f41632b;
            objB.a("2000134", i11);
        } catch (Throwable th2) {
            if (MBridgeConstans.DEBUG) {
                th2.printStackTrace();
            }
        }
    }

    @Override // com.mbridge.msdk.out.BaseTrackingListener
    public void onFinishRedirection(Campaign campaign, String str) {
        if (campaign == null) {
            return;
        }
        u0.a(campaign, this);
    }

    @Override // com.mbridge.msdk.video.module.MBridgeH5EndCardViewDiff, com.mbridge.msdk.video.module.MBridgeBaseView, android.widget.RelativeLayout, android.view.View
    protected void onMeasure(int i10, int i11) {
        if (1 == 0) {
            setMeasuredDimension(0, 0);
        } else {
            super.onMeasure(i10, i11);
        }
    }

    @Override // com.mbridge.msdk.out.BaseTrackingListener
    public void onRedirectionFailed(Campaign campaign, String str) {
        if (campaign == null) {
            return;
        }
        u0.a(campaign, this);
    }

    @Override // com.mbridge.msdk.video.module.MBridgeBaseView
    public void onSelfConfigurationChanged(Configuration configuration) {
        super.onSelfConfigurationChanged(configuration);
        orientation(configuration);
    }

    @Override // com.mbridge.msdk.out.BaseTrackingListener
    public void onStartRedirection(Campaign campaign, String str) {
        u0.b(campaign, this);
    }

    @Override // android.view.View
    public void onVisibilityChanged(View view, int i10) {
        super.onVisibilityChanged(view, i10);
        if (i10 != 0 || this.J) {
            return;
        }
        this.J = true;
        setFocusableInTouchMode(true);
        requestFocus();
        requestFocusFromTouch();
    }

    @Override // android.view.View
    public void onWindowFocusChanged(boolean z10) {
        super.onWindowFocusChanged(z10);
        CampaignEx campaignEx = this.f41632b;
        if (campaignEx == null || !campaignEx.isMraid()) {
            return;
        }
        if (z10) {
            com.mbridge.msdk.mbsignalcommon.mraid.a.a().c(this.f41682p, "true");
        } else {
            com.mbridge.msdk.mbsignalcommon.mraid.a.a().c(this.f41682p, com.ironsource.mediationsdk.metadata.a.f32683h);
        }
    }

    @Override // com.mbridge.msdk.video.module.MBridgeH5EndCardViewDiff, com.mbridge.msdk.mbsignalcommon.mraid.b
    public void open(String str) {
        super.open(str);
    }

    @Override // com.mbridge.msdk.video.module.MBridgeH5EndCardViewDiff
    public void orientation(Configuration configuration) {
        try {
            JSONObject jSONObject = new JSONObject();
            if (configuration.orientation == 2) {
                jSONObject.put("orientation", C3978d4.i.C);
            } else {
                jSONObject.put("orientation", C3978d4.i.D);
            }
            com.mbridge.msdk.mbsignalcommon.windvane.f.a().a((WebView) this.f41682p, "orientation", Base64.encodeToString(jSONObject.toString().getBytes(), 2));
        } catch (Exception e10) {
            e10.printStackTrace();
        }
    }

    @Override // com.mbridge.msdk.video.module.MBridgeH5EndCardViewDiff
    public void preLoadData(com.mbridge.msdk.video.signal.factory.b bVar) {
        String url = getURL();
        if (!this.f41635e || this.f41632b == null || TextUtils.isEmpty(url) || this.f41682p == null) {
            reportRenderResult("PL URL IS NULL", 3);
            this.notifyListener.a(127, "");
            this.notifyListener.a(129, "");
        } else {
            this.B = System.currentTimeMillis();
            try {
                reportRenderResult("start", 0);
            } catch (Exception unused) {
            }
            com.mbridge.msdk.foundation.same.webview.a aVar = new com.mbridge.msdk.foundation.same.webview.a(this.f41632b);
            aVar.a(this.f41632b.getAppName());
            this.f41682p.setDownloadListener(aVar);
            this.f41682p.setCampaignId(this.f41632b.getId());
            this.f41682p.setTempTypeForMetrics(3);
            CampaignEx campaignEx = this.f41632b;
            if (campaignEx != null) {
                this.f41682p.setCampaignEx(campaignEx);
            }
            setCloseVisible(8);
            this.f41682p.setApiManagerJSFactory(bVar);
            if (this.f41632b.isMraid()) {
                this.f41682p.setMraidObject(this);
            }
            boolean z10 = url.contains("wfr=1") || url.contains("wfl=1");
            b1.a(this.f41682p, this.f41632b.getLocalRequestId(), this.f41632b.getLocalAllowTrackClick());
            this.f41682p.setWebViewListener(new c(z10));
            if (TextUtils.isEmpty(this.f41632b.getMraid())) {
                h();
            }
            setHtmlSource(HTMLResourceManager.getInstance().getHtmlContentFromUrl(url));
            if (TextUtils.isEmpty(this.f41685s)) {
                MintegralNetworkBridge.webviewLoadUrl(this.f41682p, url);
            } else {
                MintegralNetworkBridge.webviewLoadDataWithBaseURL(this.f41682p, url, this.f41685s, "text/html", "UTF-8", null);
            }
        }
        this.O = false;
    }

    @Override // com.mbridge.msdk.video.module.MBridgeH5EndCardViewDiff
    public void readyStatus(int i10) {
    }

    public void release() {
        Handler handler = this.f41684r;
        if (handler != null) {
            handler.removeCallbacksAndMessages(null);
            this.f41684r = null;
        }
        Handler handler2 = this.L;
        if (handler2 != null) {
            handler2.removeCallbacksAndMessages(null);
            this.L = null;
        }
        this.f41680n.removeAllViews();
        this.f41682p.release();
        this.f41682p = null;
    }

    @Override // com.mbridge.msdk.video.module.MBridgeH5EndCardViewDiff
    public void reportOpen(String str) {
        CampaignEx mraidCampaign = getMraidCampaign();
        if (mraidCampaign != null) {
            new com.mbridge.msdk.foundation.same.report.h(getContext()).a(mraidCampaign.getRequestId(), mraidCampaign.getRequestIdNotice(), mraidCampaign.getId(), this.unitId, str, this.f41632b.isBidCampaign());
        }
    }

    public void reportRenderResult(String str, int i10) {
        if (this.f41632b == null || this.f41687u) {
            return;
        }
        n nVar = new n();
        nVar.n(this.f41632b.getRequestId());
        nVar.o(this.f41632b.getRequestIdNotice());
        nVar.b(this.f41632b.getId());
        nVar.d(i10);
        nVar.e(String.valueOf(System.currentTimeMillis() - this.B));
        nVar.m(str);
        String str2 = "2";
        if (this.f41632b.getAdType() == 287) {
            nVar.a(ExifInterface.GPS_MEASUREMENT_3D);
        } else if (this.f41632b.getAdType() == 94) {
            nVar.a("1");
        } else if (this.f41632b.getAdType() == 42) {
            nVar.a("2");
        }
        if (this.f41632b.isMraid()) {
            nVar.b(n.N);
        } else {
            nVar.g(this.f41632b.getendcard_url());
            if (a1.b(this.f41632b.getendcard_url()) && this.f41632b.getendcard_url().contains(MultiDexExtractor.EXTRACTED_SUFFIX)) {
                str2 = "1";
            }
            nVar.f(str2);
            nVar.b(n.O);
        }
        com.mbridge.msdk.foundation.same.report.g.b(nVar, this.unitId, this.f41632b);
    }

    public void setCloseDelayShowTime(int i10) {
        this.f41689w = i10;
    }

    public void setCloseVisible(int i10) {
        if (this.f41635e) {
            this.f41681o.setVisibility(i10);
        }
    }

    public void setCloseVisibleForMraid(int i10) {
        if (this.f41635e) {
            this.I = true;
            if (i10 == 4) {
                this.f41681o.setImageDrawable(new ColorDrawable(ItemTouchHelper.ACTION_MODE_DRAG_MASK));
            } else {
                this.f41681o.setImageResource(findDrawable("mbridge_reward_close"));
            }
            this.f41681o.setVisibility(0);
        }
    }

    public void setError(boolean z10) {
        this.f41687u = z10;
    }

    public void setHtmlSource(String str) {
        this.f41685s = str;
    }

    public void setLoadPlayable(boolean z10) {
        this.O = z10;
    }

    public void setNotchValue(String str, int i10, int i11, int i12, int i13) {
        if (!TextUtils.isEmpty(str)) {
            this.K = str;
        }
        CampaignEx campaignEx = this.f41632b;
        if (campaignEx == null || campaignEx.getAdSpaceT() == 2) {
            return;
        }
        q0.b(MBridgeBaseView.TAG, "NOTCH H5ENDCARD " + String.format("%1s-%2s-%3s-%4s", Integer.valueOf(i10), Integer.valueOf(i11), Integer.valueOf(i12), Integer.valueOf(i13)));
        RelativeLayout.LayoutParams layoutParams = (RelativeLayout.LayoutParams) this.f41681o.getLayoutParams();
        int iA = v0.a(getContext(), 20.0f);
        layoutParams.setMargins(i10 + iA, i12 + iA, i11 + iA, i13 + iA);
        this.f41681o.setLayoutParams(layoutParams);
    }

    public void setPlayCloseBtnTm(int i10) {
        this.f41690x = i10;
    }

    public void setUnitId(String str) {
        this.unitId = str;
    }

    public void startCounterEndCardShowTimer() {
        try {
            String str = this.f41632b.getendcard_url();
            int iA = 15;
            if (a1.b(str) && str.contains("wfl=1")) {
                String[] strArrSplit = str.split(C3978d4.j.f31381c);
                if (strArrSplit != null && strArrSplit.length > 0) {
                    for (String str2 : strArrSplit) {
                        if (a1.b(str2) && str2.contains("timeout") && str2.split("=") != null && str2.split("=").length > 0) {
                            iA = v0.a((Object) str2.split("=")[1]);
                        }
                    }
                }
                executeEndCardShow(iA);
            }
        } catch (Throwable th2) {
            q0.a(MBridgeBaseView.TAG, th2.getMessage());
        }
    }

    @Override // com.mbridge.msdk.video.module.MBridgeH5EndCardViewDiff, com.mbridge.msdk.video.signal.h
    public void toggleCloseBtn(int i10) {
        int visibility = this.f41681o.getVisibility();
        if (i10 == 1) {
            this.D = true;
            visibility = 0;
        } else if (i10 == 2) {
            this.D = false;
            visibility = 8;
            if (this.O) {
                g();
            } else {
                f();
            }
        }
        setCloseVisible(visibility);
    }

    @Override // com.mbridge.msdk.video.module.MBridgeH5EndCardViewDiff, com.mbridge.msdk.mbsignalcommon.mraid.b
    public void unload() {
        close();
    }

    @Override // com.mbridge.msdk.video.module.MBridgeH5EndCardViewDiff, com.mbridge.msdk.mbsignalcommon.mraid.b
    public void useCustomClose(boolean z10) {
        try {
            setCloseVisibleForMraid(z10 ? 4 : 0);
        } catch (Exception e10) {
            q0.b(MBridgeBaseView.TAG, e10.getMessage());
        }
    }

    public void volumeChange(double d10) {
        com.mbridge.msdk.mbsignalcommon.mraid.a.a().a(this.f41682p, d10);
    }

    @Override // com.mbridge.msdk.video.module.MBridgeH5EndCardViewDiff
    public void webviewshow() {
        WindVaneWebView windVaneWebView = this.f41682p;
        if (windVaneWebView != null) {
            windVaneWebView.post(new d());
        }
    }
}
