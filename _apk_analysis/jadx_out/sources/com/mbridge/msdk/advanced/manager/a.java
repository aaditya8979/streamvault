package com.mbridge.msdk.advanced.manager;

import android.content.Context;
import android.os.Handler;
import android.os.Looper;
import android.os.Message;
import android.text.TextUtils;
import android.util.Base64;
import android.view.View;
import android.view.ViewGroup;
import android.webkit.WebView;
import android.widget.ImageView;
import android.widget.RelativeLayout;
import androidx.annotation.NonNull;
import com.iab.omid.library.mmadbridge.adsession.AdEvents;
import com.iab.omid.library.mmadbridge.adsession.AdSession;
import com.mbridge.msdk.advanced.view.MBNativeAdvancedView;
import com.mbridge.msdk.advanced.view.MBNativeAdvancedWebview;
import com.mbridge.msdk.foundation.db.g;
import com.mbridge.msdk.foundation.db.j;
import com.mbridge.msdk.foundation.entity.CampaignEx;
import com.mbridge.msdk.foundation.entity.l;
import com.mbridge.msdk.foundation.same.report.h;
import com.mbridge.msdk.foundation.tools.b1;
import com.mbridge.msdk.foundation.tools.q0;
import com.mbridge.msdk.foundation.tools.v0;
import com.mbridge.msdk.out.MBridgeIds;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import org.json.JSONObject;

/* JADX INFO: compiled from: BaseNativeAdvancedShowManager.java */
/* JADX INFO: loaded from: classes6.dex */
public class a {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public CampaignEx f35357b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public MBNativeAdvancedView f35358c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public com.mbridge.msdk.advanced.middle.d f35359d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public com.mbridge.msdk.click.a f35360e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private com.mbridge.msdk.advanced.middle.c f35361f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private boolean f35362g;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private ImageView f35364i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public String f35365j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    private String f35366k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public MBridgeIds f35367l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    private boolean f35368m;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private String f35356a = "NativeAdvancedShowManager";

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private int f35363h = -1;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private View.OnClickListener f35369n = new ViewOnClickListenerC0414a();

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public Handler f35370o = new b(Looper.getMainLooper());

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    private com.mbridge.msdk.advanced.middle.a f35371p = new c();

    /* JADX INFO: renamed from: com.mbridge.msdk.advanced.manager.a$a, reason: collision with other inner class name */
    /* JADX INFO: compiled from: BaseNativeAdvancedShowManager.java */
    public class ViewOnClickListenerC0414a implements View.OnClickListener {
        public ViewOnClickListenerC0414a() {
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            if (a.this.f35362g) {
                a.this.a(1);
            }
        }
    }

    /* JADX INFO: compiled from: BaseNativeAdvancedShowManager.java */
    public class b extends Handler {
        public b(Looper looper) {
            super(looper);
        }

        @Override // android.os.Handler
        public void handleMessage(@NonNull Message message) {
            CampaignEx campaignEx;
            MBNativeAdvancedView mBNativeAdvancedView;
            MBNativeAdvancedWebview advancedNativeWebview;
            super.handleMessage(message);
            if (message.what != 2 || (campaignEx = a.this.f35357b) == null || !campaignEx.isActiveOm() || (mBNativeAdvancedView = a.this.f35358c) == null || (advancedNativeWebview = mBNativeAdvancedView.getAdvancedNativeWebview()) == null) {
                return;
            }
            try {
                AdSession adSession = advancedNativeWebview.getAdSession();
                if (adSession != null) {
                    AdEvents adEventsCreateAdEvents = AdEvents.createAdEvents(adSession);
                    adEventsCreateAdEvents.loaded();
                    adEventsCreateAdEvents.impressionOccurred();
                    q0.a("OMSDK", "adSession.impressionOccurred()");
                }
            } catch (Throwable th2) {
                q0.a("OMSDK", th2.getMessage());
                CampaignEx campaignEx2 = a.this.f35357b;
                if (campaignEx2 != null) {
                    String requestId = campaignEx2.getRequestId();
                    String requestIdNotice = a.this.f35357b.getRequestIdNotice();
                    String id2 = a.this.f35357b.getId();
                    new h(advancedNativeWebview.getContext()).a(requestId, requestIdNotice, id2, a.this.f35365j, "fetch OM failed, exception" + th2.getMessage());
                }
            }
        }
    }

    /* JADX INFO: compiled from: BaseNativeAdvancedShowManager.java */
    public class c implements com.mbridge.msdk.advanced.middle.a {
        public c() {
        }

        @Override // com.mbridge.msdk.advanced.middle.a
        public void a(int i10) {
            q0.b(a.this.f35356a, "resetCountdown" + i10);
        }

        @Override // com.mbridge.msdk.advanced.middle.a
        public void a(CampaignEx campaignEx) {
            a.this.a(campaignEx, false, "");
        }

        @Override // com.mbridge.msdk.advanced.middle.a
        public void a(boolean z10) {
            a aVar = a.this;
            if (aVar.f35359d != null) {
                aVar.f35368m = z10;
                if (z10) {
                    a aVar2 = a.this;
                    aVar2.f35359d.f(aVar2.f35367l);
                } else {
                    a aVar3 = a.this;
                    aVar3.f35359d.a(aVar3.f35367l);
                }
            }
        }

        @Override // com.mbridge.msdk.advanced.middle.a
        public void a(boolean z10, String str) {
            try {
                if (a.this.f35359d != null) {
                    if (TextUtils.isEmpty(str)) {
                        a aVar = a.this;
                        aVar.f35359d.b(aVar.f35367l);
                        a aVar2 = a.this;
                        aVar2.f35359d.d(aVar2.f35367l);
                    } else {
                        CampaignEx campaignWithBackData = CampaignEx.parseCampaignWithBackData(CampaignEx.campaignToJsonObject(a.this.f35357b));
                        campaignWithBackData.setClickTempSource(2);
                        campaignWithBackData.setClickType(2);
                        campaignWithBackData.setTriggerClickSource(2);
                        campaignWithBackData.setClickURL(str);
                        a.this.a(campaignWithBackData, z10, str);
                    }
                }
            } catch (Exception e10) {
                q0.b(a.this.f35356a, e10.getMessage());
            }
        }

        @Override // com.mbridge.msdk.advanced.middle.a
        public void close() {
            a.this.a(1);
        }

        @Override // com.mbridge.msdk.advanced.middle.a
        public void toggleCloseBtn(int i10) {
            a.this.f35363h = i10;
            MBNativeAdvancedView mBNativeAdvancedView = a.this.f35358c;
            if (mBNativeAdvancedView != null) {
                mBNativeAdvancedView.changeCloseBtnState(i10);
            }
        }

        @Override // com.mbridge.msdk.advanced.middle.a
        public void triggerCloseBtn(Object obj, String str) {
            MBNativeAdvancedView mBNativeAdvancedView = a.this.f35358c;
            if (mBNativeAdvancedView != null) {
                mBNativeAdvancedView.setVisibility(8);
            }
            a.this.a(1);
        }
    }

    /* JADX INFO: compiled from: BaseNativeAdvancedShowManager.java */
    public class d implements com.mbridge.msdk.foundation.feedback.a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final /* synthetic */ MBNativeAdvancedView f35375a;

        public d(MBNativeAdvancedView mBNativeAdvancedView) {
            this.f35375a = mBNativeAdvancedView;
        }

        @Override // com.mbridge.msdk.foundation.feedback.a
        public void a() {
            String string;
            a.this.e();
            try {
                JSONObject jSONObject = new JSONObject();
                if (com.mbridge.msdk.foundation.controller.c.n().d() != null) {
                    jSONObject.put("status", 1);
                }
                string = jSONObject.toString();
            } catch (Throwable th2) {
                q0.b(a.this.f35356a, th2.getMessage(), th2);
                string = "";
            }
            com.mbridge.msdk.mbsignalcommon.windvane.f.a().a((WebView) this.f35375a.getAdvancedNativeWebview(), "onFeedbackAlertStatusNotify", Base64.encodeToString(string.getBytes(), 2));
        }

        @Override // com.mbridge.msdk.foundation.feedback.a
        public void a(String str) {
            String string;
            a.this.f();
            try {
                JSONObject jSONObject = new JSONObject();
                if (com.mbridge.msdk.foundation.controller.c.n().d() != null) {
                    jSONObject.put("status", 2);
                }
                string = jSONObject.toString();
            } catch (Throwable th2) {
                q0.b(a.this.f35356a, th2.getMessage(), th2);
                string = "";
            }
            com.mbridge.msdk.mbsignalcommon.windvane.f.a().a((WebView) this.f35375a.getAdvancedNativeWebview(), "onFeedbackAlertStatusNotify", Base64.encodeToString(string.getBytes(), 2));
        }

        @Override // com.mbridge.msdk.foundation.feedback.a
        public void close() {
            String string;
            a.this.f();
            try {
                JSONObject jSONObject = new JSONObject();
                if (com.mbridge.msdk.foundation.controller.c.n().d() != null) {
                    jSONObject.put("status", 2);
                }
                string = jSONObject.toString();
            } catch (Throwable th2) {
                q0.b(a.this.f35356a, th2.getMessage(), th2);
                string = "";
            }
            com.mbridge.msdk.mbsignalcommon.windvane.f.a().a((WebView) this.f35375a.getAdvancedNativeWebview(), "onFeedbackAlertStatusNotify", Base64.encodeToString(string.getBytes(), 2));
        }
    }

    /* JADX INFO: compiled from: BaseNativeAdvancedShowManager.java */
    public class e implements Runnable {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final /* synthetic */ CampaignEx f35377a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final /* synthetic */ MBNativeAdvancedView f35378b;

        public e(CampaignEx campaignEx, MBNativeAdvancedView mBNativeAdvancedView) {
            this.f35377a = campaignEx;
            this.f35378b = mBNativeAdvancedView;
        }

        @Override // java.lang.Runnable
        public void run() {
            a.this.a(this.f35377a, this.f35378b, false);
        }
    }

    /* JADX INFO: compiled from: BaseNativeAdvancedShowManager.java */
    public class f implements Runnable {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final /* synthetic */ Context f35380a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final /* synthetic */ CampaignEx f35381b;

        public f(Context context, CampaignEx campaignEx) {
            this.f35380a = context;
            this.f35381b = campaignEx;
        }

        @Override // java.lang.Runnable
        public void run() {
            try {
                j.a(g.a(this.f35380a)).b(this.f35381b.getId());
            } catch (Exception unused) {
                q0.b(a.this.f35356a, "campain can't insert db");
            }
        }
    }

    public a(Context context, String str, String str2) {
        this.f35365j = str2;
        this.f35366k = str;
        this.f35367l = new MBridgeIds(str, str2);
        if (this.f35364i == null) {
            ImageView imageView = new ImageView(context);
            this.f35364i = imageView;
            imageView.setPadding(v0.a(context, 2.0f), v0.a(context, 2.0f), v0.a(context, 2.0f), v0.a(context, 2.0f));
            d();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void a(int i10) {
        com.mbridge.msdk.advanced.middle.d dVar = this.f35359d;
        if (dVar != null) {
            dVar.c(this.f35367l);
            this.f35359d = null;
            com.mbridge.msdk.advanced.report.a.a(this.f35365j, this.f35357b);
        }
        com.mbridge.msdk.advanced.report.a.a(this.f35365j, i10, this.f35357b);
        MBNativeAdvancedView mBNativeAdvancedView = this.f35358c;
        if (mBNativeAdvancedView != null) {
            mBNativeAdvancedView.setVisibility(8);
            e();
            MBNativeAdvancedWebview advancedNativeWebview = this.f35358c.getAdvancedNativeWebview();
            if (advancedNativeWebview != null) {
                advancedNativeWebview.finishAdSession();
            }
        }
        Handler handler = this.f35370o;
        if (handler != null) {
            handler.removeCallbacksAndMessages(null);
        }
    }

    private void a(View view) {
        if (view != null) {
            view.setOnClickListener(this.f35369n);
        }
    }

    private void a(CampaignEx campaignEx) {
        boolean z10 = true;
        if (campaignEx.isHasMBTplMark()) {
            z10 = false;
        } else {
            a(campaignEx, com.mbridge.msdk.foundation.controller.c.n().d(), this.f35365j);
            campaignEx.setReport(true);
            com.mbridge.msdk.foundation.same.buffer.b.a(this.f35365j, campaignEx, "h5_native");
        }
        if (z10) {
            b(campaignEx, com.mbridge.msdk.foundation.controller.c.n().d(), this.f35365j);
            c(campaignEx, com.mbridge.msdk.foundation.controller.c.n().d(), this.f35365j);
        }
    }

    private void a(CampaignEx campaignEx, Context context, String str) {
        com.mbridge.msdk.foundation.controller.c.n().a(context);
        if (!TextUtils.isEmpty(campaignEx.getImpressionURL())) {
            new Thread(new f(context, campaignEx)).start();
            com.mbridge.msdk.click.a.a(context, campaignEx, str, campaignEx.getImpressionURL(), false, true, com.mbridge.msdk.click.retry.a.f35715m);
        }
        if (TextUtils.isEmpty(str) || campaignEx.getNativeVideoTracking() == null || campaignEx.getNativeVideoTracking().p() == null) {
            return;
        }
        com.mbridge.msdk.click.a.a(context, campaignEx, str, campaignEx.getNativeVideoTracking().p(), false, false);
    }

    private void b(CampaignEx campaignEx, Context context, String str) {
        if (campaignEx != null) {
            try {
                if (TextUtils.isEmpty(campaignEx.getOnlyImpressionURL())) {
                    return;
                }
                com.mbridge.msdk.click.a.a(context, campaignEx, str, campaignEx.getOnlyImpressionURL(), false, true, com.mbridge.msdk.click.retry.a.f35716n);
            } catch (Throwable th2) {
                q0.b(this.f35356a, th2.getMessage());
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
                q0.b(this.f35356a, th2.getMessage());
            }
        }
    }

    private void d() {
        Context contextD = com.mbridge.msdk.foundation.controller.c.n().d();
        this.f35364i.setScaleType(ImageView.ScaleType.FIT_XY);
        RelativeLayout.LayoutParams layoutParams = (RelativeLayout.LayoutParams) this.f35364i.getLayoutParams();
        if (layoutParams == null) {
            layoutParams = new RelativeLayout.LayoutParams(v0.a(contextD, 29.0f), v0.a(contextD, 16.0f));
        }
        this.f35364i.setLayoutParams(layoutParams);
        this.f35364i.setImageResource(contextD.getResources().getIdentifier("mbridge_native_advanced_close_icon", "drawable", com.mbridge.msdk.foundation.controller.c.n().i()));
    }

    private void h() {
        if (this.f35357b.isReport()) {
            return;
        }
        a(this.f35357b);
        com.mbridge.msdk.advanced.report.a.a(com.mbridge.msdk.foundation.controller.c.n().d(), this.f35357b, this.f35365j);
        com.mbridge.msdk.advanced.middle.d dVar = this.f35359d;
        if (dVar != null) {
            dVar.e(this.f35367l);
        }
    }

    private void i() {
        CampaignEx campaignEx;
        MBNativeAdvancedView mBNativeAdvancedView = this.f35358c;
        if (mBNativeAdvancedView == null || (campaignEx = this.f35357b) == null) {
            return;
        }
        mBNativeAdvancedView.setAdChoiceCampaign(campaignEx);
    }

    public String a() {
        ArrayList arrayList = new ArrayList();
        CampaignEx campaignEx = this.f35357b;
        if (campaignEx != null) {
            arrayList.add(campaignEx);
        }
        return com.mbridge.msdk.foundation.same.c.b(arrayList);
    }

    public void a(com.mbridge.msdk.advanced.middle.c cVar) {
        this.f35361f = cVar;
    }

    public void a(com.mbridge.msdk.advanced.middle.d dVar) {
        this.f35359d = dVar;
    }

    public void a(CampaignEx campaignEx, MBNativeAdvancedView mBNativeAdvancedView, boolean z10) {
        MBNativeAdvancedWebview advancedNativeWebview;
        View viewA;
        if (mBNativeAdvancedView == null) {
            return;
        }
        this.f35357b = campaignEx;
        this.f35358c = mBNativeAdvancedView;
        com.mbridge.msdk.foundation.feedback.b.b().a(this.f35365j, new d(mBNativeAdvancedView));
        if (campaignEx.isMraid() && com.mbridge.msdk.foundation.feedback.b.b().a() && (viewA = com.mbridge.msdk.foundation.feedback.b.b().a(this.f35365j)) != null) {
            RelativeLayout.LayoutParams layoutParams = null;
            try {
                layoutParams = (RelativeLayout.LayoutParams) viewA.getLayoutParams();
            } catch (Exception e10) {
                e10.printStackTrace();
            }
            if (layoutParams == null) {
                layoutParams = new RelativeLayout.LayoutParams(com.mbridge.msdk.foundation.feedback.b.f37651e, com.mbridge.msdk.foundation.feedback.b.f37650d);
            }
            layoutParams.addRule(12);
            ViewGroup viewGroup = (ViewGroup) viewA.getParent();
            if (viewGroup != null) {
                viewGroup.removeView(viewA);
            }
            mBNativeAdvancedView.addView(viewA, layoutParams);
        }
        a(this.f35362g);
        com.mbridge.msdk.advanced.signal.b advancedNativeSignalCommunicationImpl = mBNativeAdvancedView.getAdvancedNativeSignalCommunicationImpl();
        campaignEx.setLocalRequestId(campaignEx.getCurrentLocalRid());
        List<CampaignEx> arrayList = new ArrayList<>();
        arrayList.add(campaignEx);
        if (advancedNativeSignalCommunicationImpl == null) {
            advancedNativeSignalCommunicationImpl = new com.mbridge.msdk.advanced.signal.b(mBNativeAdvancedView.getContext(), this.f35366k, this.f35365j);
            advancedNativeSignalCommunicationImpl.a(arrayList);
        }
        advancedNativeSignalCommunicationImpl.a(this.f35362g ? 1 : 0);
        advancedNativeSignalCommunicationImpl.a(this.f35371p);
        mBNativeAdvancedView.setAdvancedNativeSignalCommunicationImpl(advancedNativeSignalCommunicationImpl);
        b1.a(mBNativeAdvancedView.getAdvancedNativeWebview(), campaignEx.getLocalRequestId(), campaignEx.getLocalAllowTrackClick());
        if (campaignEx.isHasMBTplMark() || !this.f35362g) {
            this.f35364i.setVisibility(8);
        }
        a(this.f35364i);
        mBNativeAdvancedView.setCloseView(this.f35364i);
        if (mBNativeAdvancedView.getVisibility() != 0) {
            mBNativeAdvancedView.setVisibility(0);
        }
        l lVarA = com.mbridge.msdk.foundation.tools.h.a(mBNativeAdvancedView.getAdvancedNativeWebview(), campaignEx.getImpReportType());
        if (this.f35361f == null || !lVarA.a() || this.f35361f.d() == null || this.f35361f.d().getAlpha() < 0.5f || this.f35361f.d().getVisibility() != 0 || this.f35368m) {
            if (z10) {
                mBNativeAdvancedView.postDelayed(new e(campaignEx, mBNativeAdvancedView), 200L);
                return;
            }
            return;
        }
        com.mbridge.msdk.foundation.tools.h.a(arrayList, lVarA);
        mBNativeAdvancedView.show();
        com.mbridge.msdk.foundation.controller.c.n().a(mBNativeAdvancedView.getContext());
        campaignEx.setCampaignUnitId(this.f35365j);
        com.mbridge.msdk.foundation.feedback.b.b().a(this.f35365j, campaignEx);
        CampaignEx campaignEx2 = this.f35357b;
        if (campaignEx2 != null && campaignEx2.isActiveOm() && (advancedNativeWebview = mBNativeAdvancedView.getAdvancedNativeWebview()) != null) {
            try {
                AdSession adSessionA = com.mbridge.msdk.omsdk.b.a(com.mbridge.msdk.foundation.controller.c.n().d(), advancedNativeWebview, advancedNativeWebview.getUrl(), this.f35357b);
                if (adSessionA != null) {
                    advancedNativeWebview.setAdSession(adSessionA);
                    adSessionA.registerAdView(advancedNativeWebview);
                    adSessionA.start();
                    q0.a("OMSDK", "adSession.start()");
                }
            } catch (Throwable th2) {
                q0.a("OMSDK", th2.getMessage());
                CampaignEx campaignEx3 = this.f35357b;
                if (campaignEx3 != null) {
                    String requestId = campaignEx3.getRequestId();
                    String requestIdNotice = this.f35357b.getRequestIdNotice();
                    String id2 = this.f35357b.getId();
                    new h(com.mbridge.msdk.foundation.controller.c.n().d()).a(requestId, requestIdNotice, id2, this.f35365j, "fetch OM failed, exception" + th2.getMessage());
                }
            }
        }
        h();
        if (campaignEx.isMraid()) {
            i();
        }
        int i10 = this.f35363h;
        if (i10 != -1) {
            mBNativeAdvancedView.changeCloseBtnState(i10);
        }
        com.mbridge.msdk.advanced.manager.d.b(this.f35365j);
        com.mbridge.msdk.advanced.common.c.b(this.f35366k + this.f35365j + campaignEx.getRequestId());
        this.f35370o.sendEmptyMessageDelayed(2, 1000L);
        com.mbridge.msdk.click.c.a(com.mbridge.msdk.foundation.controller.c.n().d(), this.f35357b.getMaitve(), this.f35357b.getMaitve_src());
    }

    public void a(CampaignEx campaignEx, boolean z10, String str) {
        throw null;
    }

    public void a(boolean z10) {
        this.f35362g = z10;
    }

    public com.mbridge.msdk.advanced.middle.a b() {
        return this.f35371p;
    }

    public String c() {
        CampaignEx campaignEx = this.f35357b;
        return (campaignEx == null || campaignEx.getRequestId() == null) ? "" : this.f35357b.getRequestId();
    }

    public void e() {
        MBNativeAdvancedWebview advancedNativeWebview;
        MBNativeAdvancedView mBNativeAdvancedView = this.f35358c;
        if (mBNativeAdvancedView == null || (advancedNativeWebview = mBNativeAdvancedView.getAdvancedNativeWebview()) == null || advancedNativeWebview.isDestoryed()) {
            return;
        }
        com.mbridge.msdk.mbsignalcommon.windvane.f.a().a((WebView) advancedNativeWebview, "onViewDisappeared", "");
    }

    public void f() {
        MBNativeAdvancedWebview advancedNativeWebview;
        if (this.f35358c == null || com.mbridge.msdk.foundation.feedback.b.f37652f || (advancedNativeWebview = this.f35358c.getAdvancedNativeWebview()) == null || advancedNativeWebview.isDestoryed()) {
            return;
        }
        com.mbridge.msdk.advanced.signal.a.a(advancedNativeWebview, "onViewAppeared", "");
    }

    public void g() {
        if (this.f35359d != null) {
            this.f35359d = null;
        }
        if (this.f35371p != null) {
            this.f35371p = null;
        }
        if (this.f35369n != null) {
            this.f35369n = null;
        }
        MBNativeAdvancedView mBNativeAdvancedView = this.f35358c;
        if (mBNativeAdvancedView != null) {
            MBNativeAdvancedWebview advancedNativeWebview = mBNativeAdvancedView.getAdvancedNativeWebview();
            if (advancedNativeWebview != null) {
                advancedNativeWebview.finishAdSession();
            }
            this.f35358c.destroy();
        }
        if (this.f35361f != null) {
            this.f35361f = null;
        }
        com.mbridge.msdk.foundation.feedback.b.b().d(this.f35365j);
    }
}
