package com.mbridge.msdk.splash.manager;

import android.app.Activity;
import android.content.Context;
import android.graphics.drawable.BitmapDrawable;
import android.os.Handler;
import android.os.Looper;
import android.text.TextUtils;
import android.util.Base64;
import android.view.View;
import android.view.ViewGroup;
import android.webkit.WebView;
import android.widget.ImageView;
import android.widget.RelativeLayout;
import android.widget.TextView;
import androidx.constraintlayout.core.motion.utils.TypedValues;
import com.iab.omid.library.mmadbridge.adsession.AdSession;
import com.iab.omid.library.mmadbridge.adsession.FriendlyObstructionPurpose;
import com.mbridge.msdk.click.j;
import com.mbridge.msdk.foundation.entity.CampaignEx;
import com.mbridge.msdk.foundation.entity.l;
import com.mbridge.msdk.foundation.tools.b1;
import com.mbridge.msdk.foundation.tools.i0;
import com.mbridge.msdk.foundation.tools.q0;
import com.mbridge.msdk.foundation.tools.u0;
import com.mbridge.msdk.foundation.tools.v0;
import com.mbridge.msdk.out.Campaign;
import com.mbridge.msdk.out.MBridgeIds;
import com.mbridge.msdk.splash.view.MBSplashView;
import com.mbridge.msdk.splash.view.MBSplashWebview;
import com.mbridge.msdk.widget.FeedBackButton;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import org.json.JSONObject;

/* JADX INFO: compiled from: BaseSplashShowManager.java */
/* JADX INFO: loaded from: classes10.dex */
public class b {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private CampaignEx f39801b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public MBSplashView f39802c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public com.mbridge.msdk.splash.middle.d f39803d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public com.mbridge.msdk.click.a f39804e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private boolean f39805f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private TextView f39806g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private View f39807h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public String f39808i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private String f39809j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public MBridgeIds f39810k;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public boolean f39816q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    private boolean f39817r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public Context f39818s;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    private ImageView f39820u;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    private i f39821v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    private AdSession f39822w;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f39800a = "SplashShowManager";

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public int f39811l = 5;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public String f39812m = "点击跳过|";

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public String f39813n = "点击跳过|";

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public String f39814o = "秒";

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public String f39815p = "秒后自动关闭";

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public boolean f39819t = true;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    private View.OnClickListener f39823x = new a();

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public Handler f39824y = new HandlerC0498b(Looper.getMainLooper());

    /* JADX INFO: renamed from: z, reason: collision with root package name */
    private boolean f39825z = true;
    public j A = new e();

    /* JADX INFO: compiled from: BaseSplashShowManager.java */
    public class a implements View.OnClickListener {
        public a() {
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            if (b.this.f39805f) {
                b.this.b(1);
                b.this.d(-1);
            }
        }
    }

    /* JADX INFO: renamed from: com.mbridge.msdk.splash.manager.b$b, reason: collision with other inner class name */
    /* JADX INFO: compiled from: BaseSplashShowManager.java */
    public class HandlerC0498b extends Handler {
        public HandlerC0498b(Looper looper) {
            super(looper);
        }

        /* JADX WARN: Removed duplicated region for block: B:35:0x00da  */
        @Override // android.os.Handler
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public void handleMessage(@androidx.annotation.NonNull android.os.Message r9) {
            /*
                Method dump skipped, instruction units count: 240
                To view this dump add '--comments-level debug' option
            */
            throw new UnsupportedOperationException("Method not decompiled: com.mbridge.msdk.splash.manager.b.HandlerC0498b.handleMessage(android.os.Message):void");
        }
    }

    /* JADX INFO: compiled from: BaseSplashShowManager.java */
    public class c implements Runnable {
        public c() {
        }

        @Override // java.lang.Runnable
        public void run() {
            b.this.k();
        }
    }

    /* JADX INFO: compiled from: BaseSplashShowManager.java */
    public class d implements com.mbridge.msdk.foundation.feedback.a {
        public d() {
        }

        @Override // com.mbridge.msdk.foundation.feedback.a
        public void a() {
            String string;
            b.this.f();
            try {
                JSONObject jSONObject = new JSONObject();
                if (com.mbridge.msdk.foundation.controller.c.n().d() != null) {
                    jSONObject.put("status", 1);
                }
                string = jSONObject.toString();
            } catch (Throwable th2) {
                q0.b("SplashShowManager", th2.getMessage(), th2);
                string = "";
            }
            com.mbridge.msdk.mbsignalcommon.windvane.f.a().a((WebView) b.this.f39802c.getSplashWebview(), "onFeedbackAlertStatusNotify", Base64.encodeToString(string.getBytes(), 2));
        }

        @Override // com.mbridge.msdk.foundation.feedback.a
        public void a(String str) {
            String string;
            b.this.g();
            try {
                JSONObject jSONObject = new JSONObject();
                if (com.mbridge.msdk.foundation.controller.c.n().d() != null) {
                    jSONObject.put("status", 2);
                }
                string = jSONObject.toString();
            } catch (Throwable th2) {
                q0.b("SplashShowManager", th2.getMessage(), th2);
                string = "";
            }
            com.mbridge.msdk.mbsignalcommon.windvane.f.a().a((WebView) b.this.f39802c.getSplashWebview(), "onFeedbackAlertStatusNotify", Base64.encodeToString(string.getBytes(), 2));
        }

        @Override // com.mbridge.msdk.foundation.feedback.a
        public void close() {
            String string;
            b.this.g();
            try {
                JSONObject jSONObject = new JSONObject();
                if (com.mbridge.msdk.foundation.controller.c.n().d() != null) {
                    jSONObject.put("status", 2);
                }
                string = jSONObject.toString();
            } catch (Throwable th2) {
                q0.b("SplashShowManager", th2.getMessage(), th2);
                string = "";
            }
            com.mbridge.msdk.mbsignalcommon.windvane.f.a().a((WebView) b.this.f39802c.getSplashWebview(), "onFeedbackAlertStatusNotify", Base64.encodeToString(string.getBytes(), 2));
        }
    }

    /* JADX INFO: compiled from: BaseSplashShowManager.java */
    public class e implements j {
        public e() {
        }

        @Override // com.mbridge.msdk.out.BaseTrackingListener
        public void onFinishRedirection(Campaign campaign, String str) {
            if (campaign == null) {
                return;
            }
            u0.a(campaign, b.this.f39802c);
        }

        @Override // com.mbridge.msdk.out.BaseTrackingListener
        public void onRedirectionFailed(Campaign campaign, String str) {
            if (campaign == null) {
                return;
            }
            u0.a(campaign, b.this.f39802c);
        }

        @Override // com.mbridge.msdk.out.BaseTrackingListener
        public void onStartRedirection(Campaign campaign, String str) {
            u0.b(campaign, b.this.f39802c);
        }
    }

    /* JADX INFO: compiled from: BaseSplashShowManager.java */
    public class f implements Runnable {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final /* synthetic */ int f39831a;

        public f(int i10) {
            this.f39831a = i10;
        }

        @Override // java.lang.Runnable
        public void run() {
            b.this.a(this.f39831a);
        }
    }

    /* JADX INFO: compiled from: BaseSplashShowManager.java */
    public class g implements Runnable {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final /* synthetic */ Context f39833a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final /* synthetic */ CampaignEx f39834b;

        public g(Context context, CampaignEx campaignEx) {
            this.f39833a = context;
            this.f39834b = campaignEx;
        }

        @Override // java.lang.Runnable
        public void run() {
            try {
                com.mbridge.msdk.foundation.db.j.a(com.mbridge.msdk.foundation.db.g.a(this.f39833a)).b(this.f39834b.getId());
            } catch (Exception unused) {
                q0.b("SplashShowManager", "campain can't insert db");
            }
        }
    }

    /* JADX INFO: compiled from: BaseSplashShowManager.java */
    public class h implements com.mbridge.msdk.foundation.feedback.a {
        public h() {
        }

        @Override // com.mbridge.msdk.foundation.feedback.a
        public void a() {
            b.this.f();
        }

        @Override // com.mbridge.msdk.foundation.feedback.a
        public void a(String str) {
            b.this.g();
        }

        @Override // com.mbridge.msdk.foundation.feedback.a
        public void close() {
            b.this.g();
        }
    }

    /* JADX INFO: compiled from: BaseSplashShowManager.java */
    public class i implements com.mbridge.msdk.splash.middle.a {
        private i() {
        }

        public /* synthetic */ i(b bVar, a aVar) {
            this();
        }

        @Override // com.mbridge.msdk.splash.middle.a
        public void a(int i10) {
            q0.b("SplashShowManager", "resetCountdown" + i10);
            b bVar = b.this;
            bVar.f39811l = i10;
            bVar.f39824y.removeMessages(1);
            b.this.f39824y.sendEmptyMessageDelayed(1, 1000L);
        }

        @Override // com.mbridge.msdk.splash.middle.a
        public void a(int i10, int i11) {
            if (i10 == 1) {
                b.this.f39824y.removeMessages(1);
            }
            if (i10 == 2) {
                b bVar = b.this;
                bVar.f39811l = i11;
                bVar.f39824y.removeMessages(1);
                b.this.f39824y.sendEmptyMessageDelayed(1, 1000L);
            }
        }

        @Override // com.mbridge.msdk.splash.middle.a
        public void a(CampaignEx campaignEx) {
            b.this.b(campaignEx, false, "");
        }

        @Override // com.mbridge.msdk.splash.middle.a
        public void a(boolean z10) {
            if (z10) {
                b.this.f39824y.removeMessages(1);
            }
        }

        @Override // com.mbridge.msdk.splash.middle.a
        public void a(boolean z10, String str) {
            try {
                if (b.this.f39803d != null) {
                    if (TextUtils.isEmpty(str)) {
                        b bVar = b.this;
                        bVar.f39803d.a(bVar.f39810k);
                    } else {
                        CampaignEx campaignWithBackData = CampaignEx.parseCampaignWithBackData(CampaignEx.campaignToJsonObject(b.this.f39801b));
                        campaignWithBackData.setClickTempSource(2);
                        campaignWithBackData.setClickType(2);
                        campaignWithBackData.setTriggerClickSource(2);
                        campaignWithBackData.setClickURL(str);
                        b.this.b(campaignWithBackData, true, str);
                    }
                }
            } catch (Exception e10) {
                q0.b("SplashShowManager", e10.getMessage());
            }
        }

        @Override // com.mbridge.msdk.splash.middle.a
        public void close() {
            b.this.b(1);
        }

        @Override // com.mbridge.msdk.splash.middle.a
        public void toggleCloseBtn(int i10) {
            MBSplashView mBSplashView = b.this.f39802c;
            if (mBSplashView != null) {
                mBSplashView.changeCloseBtnState(i10);
            }
        }

        @Override // com.mbridge.msdk.splash.middle.a
        public void triggerCloseBtn(Object obj, String str) {
            b.this.b(1);
        }
    }

    public b(Context context, String str, String str2) {
        this.f39808i = str2;
        this.f39809j = str;
        this.f39810k = new MBridgeIds(str, str2);
        this.f39818s = context;
        if (this.f39806g == null) {
            TextView textView = new TextView(context);
            this.f39806g = textView;
            textView.setGravity(1);
            this.f39806g.setTextIsSelectable(false);
            this.f39806g.setPadding(v0.a(context, 5.0f), v0.a(context, 5.0f), v0.a(context, 5.0f), v0.a(context, 5.0f));
            RelativeLayout.LayoutParams layoutParams = (RelativeLayout.LayoutParams) this.f39806g.getLayoutParams();
            this.f39806g.setLayoutParams(layoutParams == null ? new RelativeLayout.LayoutParams(v0.a(context, 100.0f), v0.a(context, 50.0f)) : layoutParams);
            e();
        }
    }

    private void a() {
        CampaignEx campaignEx = this.f39801b;
        if (campaignEx != null) {
            campaignEx.setCampaignUnitId(this.f39808i);
            com.mbridge.msdk.foundation.feedback.b.b().a(this.f39808i, 3);
            com.mbridge.msdk.foundation.feedback.b.b().a(this.f39808i, this.f39801b);
        }
        if (com.mbridge.msdk.foundation.feedback.b.b().a()) {
            MBSplashView mBSplashView = this.f39802c;
            if (mBSplashView == null || !mBSplashView.isDynamicView()) {
                com.mbridge.msdk.foundation.feedback.b.b().a(this.f39808i, new d());
                FeedBackButton feedBackButtonA = com.mbridge.msdk.foundation.feedback.b.b().a(this.f39808i);
                if (feedBackButtonA != null) {
                    RelativeLayout.LayoutParams layoutParams = null;
                    try {
                        layoutParams = (RelativeLayout.LayoutParams) feedBackButtonA.getLayoutParams();
                    } catch (Exception e10) {
                        e10.printStackTrace();
                    }
                    if (layoutParams == null) {
                        layoutParams = new RelativeLayout.LayoutParams(com.mbridge.msdk.foundation.feedback.b.f37651e, com.mbridge.msdk.foundation.feedback.b.f37650d);
                    }
                    layoutParams.topMargin = v0.a(com.mbridge.msdk.foundation.controller.c.n().d(), 10.0f);
                    layoutParams.leftMargin = v0.a(com.mbridge.msdk.foundation.controller.c.n().d(), 10.0f);
                    ViewGroup viewGroup = (ViewGroup) feedBackButtonA.getParent();
                    if (viewGroup != null) {
                        viewGroup.removeView(feedBackButtonA);
                    }
                    MBSplashView mBSplashView2 = this.f39802c;
                    if (mBSplashView2 != null) {
                        mBSplashView2.addView(feedBackButtonA, layoutParams);
                    }
                }
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void a(int i10) {
        MBSplashView mBSplashView;
        try {
            com.mbridge.msdk.splash.middle.d dVar = this.f39803d;
            if (dVar != null) {
                dVar.a(this.f39810k, i10);
                this.f39803d = null;
                com.mbridge.msdk.splash.report.a.a(this.f39808i, this.f39801b);
            }
            ImageView imageView = this.f39820u;
            if (imageView != null && imageView.getParent() != null && (mBSplashView = this.f39802c) != null) {
                mBSplashView.removeView(this.f39820u);
                this.f39820u.setVisibility(8);
            }
            this.f39817r = false;
            com.mbridge.msdk.splash.report.a.a(this.f39808i, i10, this.f39801b);
            Handler handler = this.f39824y;
            if (handler != null) {
                handler.removeCallbacksAndMessages(null);
            }
        } catch (Exception e10) {
            q0.b("SplashShowManager", e10.getMessage());
        }
    }

    private void a(View view) {
        if (view != null) {
            view.setOnClickListener(this.f39823x);
        }
    }

    private void a(CampaignEx campaignEx) {
        b(campaignEx, com.mbridge.msdk.foundation.controller.c.n().d(), this.f39808i);
        a(campaignEx, com.mbridge.msdk.foundation.controller.c.n().d(), this.f39808i);
        c(campaignEx, com.mbridge.msdk.foundation.controller.c.n().d(), this.f39808i);
        campaignEx.setReport(true);
        com.mbridge.msdk.foundation.same.buffer.b.a(this.f39808i, campaignEx, "splash");
    }

    private void a(CampaignEx campaignEx, Context context, String str) {
        com.mbridge.msdk.foundation.controller.c.n().a(context);
        if (!TextUtils.isEmpty(campaignEx.getImpressionURL())) {
            new Thread(new g(context, campaignEx)).start();
            com.mbridge.msdk.click.a.a(context, campaignEx, str, campaignEx.getImpressionURL(), false, true, com.mbridge.msdk.click.retry.a.f35715m);
        }
        if (TextUtils.isEmpty(str) || campaignEx.getNativeVideoTracking() == null || campaignEx.getNativeVideoTracking().p() == null) {
            return;
        }
        com.mbridge.msdk.click.a.a(context, campaignEx, str, campaignEx.getNativeVideoTracking().p(), false, false);
    }

    private void a(String str) {
        com.mbridge.msdk.splash.middle.d dVar = this.f39803d;
        if (dVar != null) {
            dVar.a(this.f39810k, "web show failed:" + str);
        }
        MBSplashView mBSplashView = this.f39802c;
        if (mBSplashView == null || mBSplashView.getParent() == null || !(this.f39802c.getParent() instanceof ViewGroup)) {
            return;
        }
        ((ViewGroup) this.f39802c.getParent()).removeView(this.f39802c);
    }

    private void b(CampaignEx campaignEx) {
        boolean z10 = true;
        if (campaignEx.isHasMBTplMark()) {
            z10 = false;
        } else {
            a(campaignEx, com.mbridge.msdk.foundation.controller.c.n().d(), this.f39808i);
            campaignEx.setReport(true);
            com.mbridge.msdk.foundation.same.buffer.b.a(this.f39808i, campaignEx, "splash");
        }
        if (z10) {
            b(campaignEx, com.mbridge.msdk.foundation.controller.c.n().d(), this.f39808i);
            c(campaignEx, com.mbridge.msdk.foundation.controller.c.n().d(), this.f39808i);
        }
    }

    private void b(CampaignEx campaignEx, Context context, String str) {
        if (campaignEx != null) {
            try {
                if (TextUtils.isEmpty(campaignEx.getOnlyImpressionURL())) {
                    return;
                }
                com.mbridge.msdk.click.a.a(context, campaignEx, str, campaignEx.getOnlyImpressionURL(), false, true, com.mbridge.msdk.click.retry.a.f35716n);
            } catch (Throwable th2) {
                q0.b("SplashShowManager", th2.getMessage());
            }
        }
    }

    private void c(CampaignEx campaignEx, Context context, String str) {
        if (campaignEx != null) {
            try {
                List<String> pv_urls = campaignEx.getPv_urls();
                if (pv_urls == null || pv_urls.size() <= 0) {
                    return;
                }
                Iterator<String> it = pv_urls.iterator();
                while (it.hasNext()) {
                    com.mbridge.msdk.click.a.a(context, campaignEx, str, it.next(), false, true);
                }
            } catch (Throwable th2) {
                q0.b("SplashShowManager", th2.getMessage());
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void d(int i10) {
        MBSplashView mBSplashView = this.f39802c;
        if (mBSplashView != null) {
            mBSplashView.updateCountdown(i10);
            if (this.f39802c.getSplashSignalCommunicationImpl() != null) {
                this.f39802c.getSplashSignalCommunicationImpl().c(i10);
            }
        }
        if (i10 < 0) {
            this.f39811l = i10;
            return;
        }
        com.mbridge.msdk.splash.middle.d dVar = this.f39803d;
        if (dVar != null) {
            dVar.a(this.f39810k, i10 * 1000);
        }
        if (this.f39807h == null) {
            j();
        }
    }

    private void e() {
        Context contextD = com.mbridge.msdk.foundation.controller.c.n().d();
        if (contextD != null) {
            String strI = com.mbridge.msdk.foundation.controller.c.n().i();
            int identifier = contextD.getResources().getIdentifier("mbridge_splash_count_time_can_skip", TypedValues.Custom.S_STRING, strI);
            int identifier2 = contextD.getResources().getIdentifier("mbridge_splash_count_time_can_skip_not", TypedValues.Custom.S_STRING, strI);
            int identifier3 = contextD.getResources().getIdentifier("mbridge_splash_count_time_can_skip_s", TypedValues.Custom.S_STRING, strI);
            this.f39813n = contextD.getResources().getString(identifier);
            String string = contextD.getResources().getString(identifier2);
            this.f39815p = string;
            this.f39812m = string;
            this.f39814o = contextD.getResources().getString(identifier3);
            this.f39806g.setBackgroundResource(contextD.getResources().getIdentifier("mbridge_splash_close_bg", "drawable", com.mbridge.msdk.foundation.controller.c.n().i()));
            this.f39806g.setTextColor(contextD.getResources().getColor(contextD.getResources().getIdentifier("mbridge_splash_count_time_skip_text_color", "color", strI)));
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public synchronized void i() {
        MBSplashView mBSplashView;
        if (this.f39801b == null) {
            return;
        }
        this.f39817r = true;
        if (this.f39803d != null && (mBSplashView = this.f39802c) != null) {
            if (mBSplashView.getContext() != null && (this.f39802c.getContext() instanceof Activity) && ((Activity) this.f39802c.getContext()).isFinishing()) {
                q0.a("SplashShowManager", "Activity is finishing");
            }
            if (this.f39802c.isShown()) {
                this.f39803d.b(this.f39810k);
            } else {
                this.f39803d.a(this.f39810k, "SplashView or container is not visibility");
            }
        }
        if (!this.f39801b.isReport()) {
            MBSplashView mBSplashView2 = this.f39802c;
            if (mBSplashView2 == null || mBSplashView2.isDynamicView()) {
                a(this.f39801b);
            } else {
                b(this.f39801b);
            }
            com.mbridge.msdk.splash.report.a.a(com.mbridge.msdk.foundation.controller.c.n().d(), this.f39801b, this.f39808i);
        }
    }

    private void j() {
        String str;
        if (this.f39805f) {
            str = this.f39813n + this.f39811l + this.f39814o;
        } else {
            str = this.f39811l + this.f39815p;
        }
        this.f39806g.setText(str);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void k() {
        MBSplashView mBSplashView;
        MBSplashWebview splashWebview;
        View splashWebview2 = this.f39802c.getSplashWebview();
        if (splashWebview2 == null) {
            splashWebview2 = this.f39802c.getSplashNativeView();
        }
        l lVarA = com.mbridge.msdk.foundation.tools.h.a(splashWebview2, this.f39801b.getImpReportType());
        ArrayList arrayList = new ArrayList();
        arrayList.add(this.f39801b);
        if (lVarA.a()) {
            com.mbridge.msdk.foundation.tools.h.a(arrayList, lVarA);
        } else if (this.f39825z) {
            this.f39825z = false;
            this.f39802c.postDelayed(new c(), 200L);
            return;
        } else {
            com.mbridge.msdk.foundation.tools.h.a(arrayList, lVarA);
            if (this.f39801b.getLocalCheckShow() == 1) {
                a("ad env is not available");
                return;
            }
        }
        CampaignEx campaignEx = this.f39801b;
        if (campaignEx != null && campaignEx.isActiveOm() && (mBSplashView = this.f39802c) != null && (splashWebview = mBSplashView.getSplashWebview()) != null) {
            try {
                AdSession adSessionA = com.mbridge.msdk.omsdk.b.a(com.mbridge.msdk.foundation.controller.c.n().d(), splashWebview, splashWebview.getUrl(), this.f39801b);
                this.f39822w = adSessionA;
                if (adSessionA != null) {
                    splashWebview.setAdSession(adSessionA);
                    this.f39822w.registerAdView(splashWebview);
                    this.f39822w.start();
                }
                q0.a("OMSDK", "adSession.start()");
            } catch (Throwable th2) {
                q0.a("OMSDK", th2.getMessage());
                CampaignEx campaignEx2 = this.f39801b;
                if (campaignEx2 != null) {
                    String requestId = campaignEx2.getRequestId();
                    String requestIdNotice = this.f39801b.getRequestIdNotice();
                    String id2 = this.f39801b.getId();
                    new com.mbridge.msdk.foundation.same.report.h(splashWebview.getContext()).a(requestId, requestIdNotice, id2, this.f39808i, "fetch OM failed, exception" + th2.getMessage());
                }
            }
        }
        com.mbridge.msdk.splash.manager.d.b(this.f39808i);
        this.f39824y.removeMessages(1);
        this.f39824y.sendEmptyMessageDelayed(1, 1000L);
        this.f39824y.sendEmptyMessageDelayed(2, 1000L);
        b();
        if (!this.f39801b.isMraid()) {
            a();
        }
        com.mbridge.msdk.click.c.a(com.mbridge.msdk.foundation.controller.c.n().d(), this.f39801b.getMaitve(), this.f39801b.getMaitve_src());
        try {
            BitmapDrawable bitmapDrawableA = com.mbridge.msdk.foundation.controller.c.n().a(this.f39808i, this.f39801b.getAdType());
            if (bitmapDrawableA != null) {
                if (this.f39820u == null) {
                    this.f39820u = new ImageView(com.mbridge.msdk.foundation.controller.c.n().d());
                }
                if (this.f39820u.getVisibility() != 0) {
                    this.f39820u.setVisibility(0);
                }
                v0.a(this.f39820u, bitmapDrawableA, this.f39802c.getResources().getDisplayMetrics());
                if (this.f39820u.getParent() == null) {
                    this.f39802c.addView(this.f39820u, new ViewGroup.LayoutParams(-1, -1));
                }
                AdSession adSession = this.f39822w;
                if (adSession != null) {
                    adSession.addFriendlyObstruction(this.f39820u, FriendlyObstructionPurpose.OTHER, null);
                }
            }
        } catch (Exception e10) {
            e10.printStackTrace();
        }
    }

    public void a(ViewGroup viewGroup) {
        if (viewGroup != null) {
            viewGroup.setOnClickListener(this.f39823x);
        }
        this.f39807h = viewGroup;
    }

    public void a(CampaignEx campaignEx, MBSplashView mBSplashView) {
        a(this.f39805f);
        this.f39801b = campaignEx;
        this.f39802c = mBSplashView;
        com.mbridge.msdk.splash.signal.b splashSignalCommunicationImpl = mBSplashView.getSplashSignalCommunicationImpl();
        if (splashSignalCommunicationImpl == null) {
            splashSignalCommunicationImpl = new com.mbridge.msdk.splash.signal.b(mBSplashView.getContext(), this.f39809j, this.f39808i);
            ArrayList arrayList = new ArrayList();
            arrayList.add(campaignEx);
            splashSignalCommunicationImpl.a(arrayList);
        }
        splashSignalCommunicationImpl.b(this.f39811l);
        splashSignalCommunicationImpl.a(this.f39805f ? 1 : 0);
        if (this.f39821v == null) {
            this.f39821v = new i(this, null);
        }
        splashSignalCommunicationImpl.a(this.f39821v);
        mBSplashView.setSplashSignalCommunicationImpl(splashSignalCommunicationImpl);
        boolean zIsHasMBTplMark = campaignEx.isHasMBTplMark();
        View view = this.f39807h;
        if (view == null) {
            if (zIsHasMBTplMark) {
                this.f39806g.setVisibility(8);
            }
            j();
            a(this.f39806g);
            mBSplashView.setCloseView(this.f39806g);
        } else {
            if (zIsHasMBTplMark) {
                view.setVisibility(8);
            }
            a(this.f39807h);
            mBSplashView.setCloseView(this.f39807h);
        }
        b1.a(mBSplashView.getSplashWebview() != null ? mBSplashView.getSplashWebview() : mBSplashView.getSplashNativeView(), this.f39801b.getLocalRequestId(), this.f39801b.getLocalAllowTrackClick(), mBSplashView.getAllowClickSplashTouchListener());
        mBSplashView.show(campaignEx);
        this.f39825z = true;
        k();
    }

    public void a(CampaignEx campaignEx, boolean z10, String str) {
        if (this.f39804e == null) {
            com.mbridge.msdk.click.a aVar = new com.mbridge.msdk.click.a(com.mbridge.msdk.foundation.controller.c.n().d(), this.f39808i);
            this.f39804e = aVar;
            aVar.a(this.A);
        }
        campaignEx.setCampaignUnitId(this.f39808i);
        this.f39804e.a(campaignEx);
        if (!this.f39801b.isReportClick()) {
            this.f39801b.setReportClick(true);
            com.mbridge.msdk.splash.report.a.a(com.mbridge.msdk.foundation.controller.c.n().d(), campaignEx);
        }
        com.mbridge.msdk.splash.middle.d dVar = this.f39803d;
        if (dVar != null) {
            dVar.a(this.f39810k);
            b(3);
        }
        if (!z10 || TextUtils.isEmpty(str)) {
            return;
        }
        com.mbridge.msdk.splash.report.a.a(campaignEx, this.f39808i, str);
    }

    public void a(com.mbridge.msdk.splash.middle.d dVar) {
        this.f39803d = dVar;
    }

    public void a(boolean z10) {
        this.f39805f = z10;
        if (z10) {
            this.f39812m = this.f39813n;
        } else {
            this.f39812m = this.f39815p;
        }
    }

    public void b() {
        MBSplashView mBSplashView;
        Context context;
        CampaignEx campaignEx = this.f39801b;
        if (campaignEx == null) {
            return;
        }
        if (!(campaignEx.getPrivacyButtonTemplateVisibility() == 1) || (mBSplashView = this.f39802c) == null || mBSplashView.getSplashWebview() == null || this.f39802c.isDynamicView() || !this.f39801b.isMraid() || (context = this.f39802c.getContext()) == null) {
            return;
        }
        try {
            int iA = i0.a(context, "mbridge_splash_notice", "drawable");
            int iA2 = v0.a(context, 35.0f);
            int iA3 = v0.a(context, 9.0f);
            ImageView imageView = new ImageView(context);
            RelativeLayout.LayoutParams layoutParams = new RelativeLayout.LayoutParams(iA2, iA2);
            layoutParams.addRule(9);
            layoutParams.addRule(10);
            layoutParams.setMargins(iA3, iA3, iA3, iA3);
            imageView.setScaleType(ImageView.ScaleType.CENTER);
            imageView.setBackgroundResource(iA);
            v0.a(3, imageView, this.f39801b, context, true, new h());
            this.f39802c.addView(imageView);
        } catch (Throwable th2) {
            q0.b("SplashShowManager", th2.getMessage());
        }
    }

    public void b(int i10) {
        CampaignEx campaignEx;
        MBSplashWebview splashWebview;
        MBSplashView mBSplashView = this.f39802c;
        if (mBSplashView != null && (splashWebview = mBSplashView.getSplashWebview()) != null) {
            splashWebview.finishAdSession();
        }
        if (this.f39824y == null || (campaignEx = this.f39801b) == null || !campaignEx.isActiveOm()) {
            a(i10);
        } else {
            this.f39824y.postDelayed(new f(i10), 1500L);
        }
    }

    public void b(CampaignEx campaignEx, boolean z10, String str) {
        throw null;
    }

    public String c() {
        ArrayList arrayList = new ArrayList();
        CampaignEx campaignEx = this.f39801b;
        if (campaignEx != null) {
            arrayList.add(campaignEx);
        }
        return com.mbridge.msdk.foundation.same.c.b(arrayList);
    }

    public void c(int i10) {
        this.f39811l = i10;
    }

    public String d() {
        CampaignEx campaignEx = this.f39801b;
        return (campaignEx == null || campaignEx.getRequestId() == null) ? "" : this.f39801b.getRequestId();
    }

    public void f() {
        Handler handler;
        this.f39819t = false;
        if (this.f39802c != null && this.f39811l > 0 && (handler = this.f39824y) != null) {
            handler.removeMessages(1);
        }
        MBSplashView mBSplashView = this.f39802c;
        if (mBSplashView != null) {
            mBSplashView.onPause();
            MBSplashWebview splashWebview = this.f39802c.getSplashWebview();
            if (splashWebview == null || splashWebview.isDestoryed()) {
                return;
            }
            com.mbridge.msdk.splash.signal.c.a(splashWebview, "onSystemPause", "");
        }
    }

    public void g() {
        MBSplashView mBSplashView;
        Handler handler;
        this.f39819t = true;
        if (this.f39802c != null && this.f39811l > 0 && (handler = this.f39824y) != null) {
            handler.removeMessages(1);
            View splashWebview = this.f39802c.getSplashWebview();
            if (splashWebview == null) {
                splashWebview = this.f39802c.getSplashNativeView();
            }
            CampaignEx campaignEx = this.f39801b;
            if (campaignEx != null ? com.mbridge.msdk.foundation.tools.h.b(campaignEx, null, splashWebview, campaignEx.getImpReportType()) : true) {
                this.f39824y.sendEmptyMessageDelayed(1, 1000L);
            }
        }
        if (com.mbridge.msdk.foundation.feedback.b.f37652f || (mBSplashView = this.f39802c) == null) {
            return;
        }
        mBSplashView.onResume();
        MBSplashWebview splashWebview2 = this.f39802c.getSplashWebview();
        if (splashWebview2 == null || splashWebview2.isDestoryed()) {
            return;
        }
        com.mbridge.msdk.splash.signal.c.a(splashWebview2, "onSystemPause", "");
    }

    public void h() {
        if (this.f39803d != null) {
            this.f39803d = null;
        }
        if (this.f39821v != null) {
            this.f39821v = null;
        }
        if (this.f39823x != null) {
            this.f39823x = null;
        }
        MBSplashView mBSplashView = this.f39802c;
        if (mBSplashView != null) {
            mBSplashView.destroy();
        }
        com.mbridge.msdk.foundation.feedback.b.b().d(this.f39808i);
    }
}
