package com.mbridge.msdk.video.dynview.widget;

import android.content.Context;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.view.animation.AlphaAnimation;
import android.view.animation.TranslateAnimation;
import android.widget.ImageView;
import android.widget.RelativeLayout;
import com.mbridge.msdk.foundation.entity.CampaignEx;
import com.mbridge.msdk.foundation.same.report.j;
import com.mbridge.msdk.foundation.same.report.metrics.e;
import com.mbridge.msdk.foundation.tools.q0;
import com.mbridge.msdk.setting.g;
import com.mbridge.msdk.video.bt.module.orglistener.f;
import com.mbridge.msdk.video.dynview.listener.h;
import com.mbridge.msdk.video.module.MBridgeBaseView;
import com.mbridge.msdk.widget.FeedBackButton;
import com.safedk.android.analytics.brandsafety.DetectTouchUtils;
import java.util.HashMap;
import java.util.List;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes11.dex */
public class MBridgeOrderCampView extends MBridgeBaseView {

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    private MBridgeOrderCampView f41530m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private List<CampaignEx> f41531n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    private int f41532o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    private int f41533p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    private int f41534q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    private int f41535r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    private String f41536s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    private FeedBackButton f41537t;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    private ImageView f41538u;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    private boolean f41539v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    private com.mbridge.msdk.video.dynview.listener.c f41540w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    private com.mbridge.msdk.video.dynview.listener.b f41541x;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    private boolean f41542y;

    public class a implements com.mbridge.msdk.video.dynview.listener.c {
        public a() {
        }

        @Override // com.mbridge.msdk.video.dynview.listener.c
        public void a(CampaignEx campaignEx, int i10) {
            if (campaignEx != null) {
                try {
                    MBridgeOrderCampView.this.setCampaign(campaignEx);
                    campaignEx.setClickTempSource(2);
                    campaignEx.setTriggerClickSource(2);
                    MBridgeOrderCampView.this.a(campaignEx, 0, i10);
                } catch (Exception e10) {
                    q0.b(MBridgeBaseView.TAG, e10.getMessage());
                }
            }
        }

        @Override // com.mbridge.msdk.video.dynview.listener.c
        public void close() {
            MBridgeOrderCampView.this.g();
        }
    }

    public class b implements h {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final /* synthetic */ ViewGroup f41544a;

        public b(ViewGroup viewGroup) {
            this.f41544a = viewGroup;
        }

        @Override // com.mbridge.msdk.video.dynview.listener.h
        public void a(com.mbridge.msdk.video.dynview.a aVar) {
            if (aVar != null) {
                try {
                    MBridgeOrderCampView.this.f41530m.addView(aVar.b());
                    MBridgeOrderCampView.this.f41539v = aVar.c();
                    this.f41544a.removeAllViews();
                    this.f41544a.addView(MBridgeOrderCampView.this.f41530m);
                    f.a(com.mbridge.msdk.foundation.controller.c.n().d(), (List<CampaignEx>) MBridgeOrderCampView.this.f41531n, ((CampaignEx) MBridgeOrderCampView.this.f41531n.get(0)).getCampaignUnitId());
                    MBridgeOrderCampView.this.setViewStatus();
                    if (MBridgeOrderCampView.this.f41541x != null) {
                        MBridgeOrderCampView.this.f41541x.a();
                    }
                } catch (Exception e10) {
                    q0.b(MBridgeBaseView.TAG, e10.getMessage());
                }
            }
        }

        @Override // com.mbridge.msdk.video.dynview.listener.h
        public void a(com.mbridge.msdk.video.dynview.error.a aVar) {
            try {
                f.a(com.mbridge.msdk.foundation.controller.c.n().d(), (List<CampaignEx>) MBridgeOrderCampView.this.f41531n, ((CampaignEx) MBridgeOrderCampView.this.f41531n.get(0)).getCampaignUnitId(), aVar.g());
                if (MBridgeOrderCampView.this.f41541x != null) {
                    MBridgeOrderCampView.this.f41541x.b();
                }
            } catch (Exception e10) {
                q0.b(MBridgeBaseView.TAG, e10.getMessage());
            }
        }
    }

    public class c implements com.mbridge.msdk.foundation.feedback.a {
        public c() {
        }

        @Override // com.mbridge.msdk.foundation.feedback.a
        public void a() {
        }

        @Override // com.mbridge.msdk.foundation.feedback.a
        public void a(String str) {
        }

        @Override // com.mbridge.msdk.foundation.feedback.a
        public void close() {
        }
    }

    public class d implements View.OnClickListener {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final /* synthetic */ String f41547a;

        public d(String str) {
            this.f41547a = str;
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            com.mbridge.msdk.click.c.e(MBridgeOrderCampView.this.f41631a, this.f41547a);
        }
    }

    public MBridgeOrderCampView(Context context) {
        super(context);
        this.f41539v = false;
        this.f41540w = new a();
        this.f41542y = false;
    }

    public MBridgeOrderCampView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f41539v = false;
        this.f41540w = new a();
        this.f41542y = false;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void a(CampaignEx campaignEx, int i10, int i11) {
        JSONObject jSONObject;
        JSONException e10;
        if (campaignEx != null && campaignEx.isDynamicView()) {
            try {
                CampaignEx.c rewardTemplateMode = campaignEx.getRewardTemplateMode();
                String str = "";
                if (rewardTemplateMode != null) {
                    str = rewardTemplateMode.k() + "";
                }
                String str2 = str;
                j.a(com.mbridge.msdk.foundation.controller.c.n().d(), "order_view_click" + str2, campaignEx.getCampaignUnitId(), campaignEx.isBidCampaign(), campaignEx.getRequestId(), campaignEx.getRequestIdNotice(), campaignEx.getId(), str2);
            } catch (Exception e11) {
                q0.b(MBridgeBaseView.TAG, e11.getMessage());
            }
        }
        try {
            jSONObject = new JSONObject();
            try {
                jSONObject.put(com.mbridge.msdk.foundation.same.a.f37701j, a(i10));
                jSONObject.put("camp_position", i11);
            } catch (JSONException e12) {
                e10 = e12;
                e10.printStackTrace();
            }
        } catch (JSONException e13) {
            jSONObject = null;
            e10 = e13;
        }
        com.mbridge.msdk.video.module.listener.a aVar = this.notifyListener;
        if (aVar != null) {
            aVar.a(105, jSONObject);
        }
    }

    private void e() {
        List<CampaignEx> list = this.f41531n;
        if (list == null || list.get(0) == null) {
            FeedBackButton feedBackButton = this.f41537t;
            if (feedBackButton != null) {
                feedBackButton.setVisibility(8);
                return;
            }
            return;
        }
        this.f41536s = this.f41531n.get(0).getCampaignUnitId();
        this.f41632b = this.f41531n.get(0);
        com.mbridge.msdk.foundation.feedback.b.b().a(this.f41536s + "_2", this.f41632b);
        if (this.f41537t == null) {
            return;
        }
        if (!com.mbridge.msdk.foundation.feedback.b.b().a()) {
            this.f41537t.setVisibility(8);
            return;
        }
        com.mbridge.msdk.foundation.feedback.b.b().a(this.f41536s + "_2", new c());
        com.mbridge.msdk.foundation.feedback.b.b().a(this.f41536s + "_2", this.f41537t);
    }

    private void f() {
        if (this.f41538u == null) {
            return;
        }
        g gVarD = com.mbridge.msdk.setting.h.b().d(com.mbridge.msdk.foundation.controller.c.n().b());
        if (gVarD == null) {
            this.f41538u.setVisibility(8);
            return;
        }
        String strC = gVarD.c();
        if (TextUtils.isEmpty(strC)) {
            this.f41538u.setVisibility(8);
        }
        this.f41538u.setOnClickListener(new d(strC));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void g() {
        try {
            e eVar = new e();
            eVar.a("type", 2);
            com.mbridge.msdk.foundation.same.report.metrics.d.b().a("2000152", eVar);
            com.mbridge.msdk.foundation.same.report.metrics.d.b().a("2000134", this.f41632b);
        } catch (Throwable th2) {
            q0.a(MBridgeBaseView.TAG, th2.getMessage());
        }
        try {
            com.mbridge.msdk.video.dynview.moffer.a.a().b();
        } catch (Exception e10) {
            q0.b(MBridgeBaseView.TAG, e10.getMessage());
        }
        com.mbridge.msdk.video.module.listener.a aVar = this.notifyListener;
        if (aVar != null) {
            aVar.a(104, "");
        }
    }

    public void createView(ViewGroup viewGroup) {
        if (this.f41531n == null) {
            com.mbridge.msdk.video.dynview.listener.b bVar = this.f41541x;
            if (bVar != null) {
                bVar.b();
                return;
            }
            return;
        }
        HashMap map = new HashMap();
        map.put("order_view_callback", this.f41540w);
        com.mbridge.msdk.video.dynview.b.a().a(new com.mbridge.msdk.video.dynview.wrapper.c().b(com.mbridge.msdk.foundation.controller.c.n().d(), this.f41531n), new b(viewGroup), map);
    }

    @Override // com.mbridge.msdk.video.module.MBridgeBaseView, android.view.ViewGroup, android.view.View
    public boolean dispatchTouchEvent(MotionEvent motionEvent) {
        DetectTouchUtils.viewOnTouch(com.safedk.android.utils.g.f53141o, this, motionEvent);
        return super.dispatchTouchEvent(motionEvent);
    }

    @Override // com.mbridge.msdk.video.module.MBridgeBaseView
    public void init(Context context) {
        this.f41530m = this;
    }

    @Override // android.view.ViewGroup, android.view.View
    public void onAttachedToWindow() {
        JSONObject jSONObject;
        JSONException e10;
        super.onAttachedToWindow();
        if (this.f41531n == null) {
            return;
        }
        for (int i10 = 0; i10 < this.f41531n.size(); i10++) {
            try {
                jSONObject = new JSONObject();
                try {
                    jSONObject.put("camp_position", i10);
                } catch (JSONException e11) {
                    e10 = e11;
                    e10.printStackTrace();
                }
            } catch (JSONException e12) {
                jSONObject = null;
                e10 = e12;
            }
            com.mbridge.msdk.video.module.listener.a aVar = this.notifyListener;
            if (aVar != null) {
                aVar.a(110, jSONObject);
            }
        }
    }

    @Override // com.mbridge.msdk.video.module.MBridgeBaseView, android.widget.RelativeLayout, android.view.View
    protected void onMeasure(int i10, int i11) {
        if (1 == 0) {
            setMeasuredDimension(0, 0);
        } else {
            super.onMeasure(i10, i11);
        }
    }

    public void setCampOrderViewBuildCallback(com.mbridge.msdk.video.dynview.listener.b bVar) {
        this.f41541x = bVar;
    }

    public void setCampaignExes(List<CampaignEx> list) {
        this.f41531n = list;
    }

    public void setNotchPadding(int i10, int i11, int i12, int i13) {
        this.f41532o = i10;
        this.f41533p = i11;
        this.f41534q = i12;
        this.f41535r = i13;
        setViewStatus();
    }

    public void setRewarded(boolean z10) {
        this.f41542y = z10;
    }

    public void setViewStatus() {
        MBridgeOrderCampView mBridgeOrderCampView = this.f41530m;
        if (mBridgeOrderCampView == null || !this.f41542y) {
            return;
        }
        RelativeLayout relativeLayout = (RelativeLayout) mBridgeOrderCampView.findViewById(filterFindViewId(this.f41539v, "mbridge_native_order_camp_controller"));
        this.f41537t = (FeedBackButton) this.f41530m.findViewById(filterFindViewId(this.f41539v, "mbridge_native_order_camp_feed_btn"));
        this.f41538u = (ImageView) this.f41530m.findViewById(filterFindViewId(this.f41539v, "mbridge_iv_link"));
        if (relativeLayout != null) {
            relativeLayout.setPadding(this.f41532o, this.f41534q, this.f41533p, this.f41535r);
        }
        if (this.f41537t != null) {
            try {
                e();
            } catch (Exception e10) {
                q0.b(MBridgeBaseView.TAG, e10.getMessage());
            }
        }
        if (this.f41538u != null) {
            try {
                f();
            } catch (Exception e11) {
                q0.b(MBridgeBaseView.TAG, e11.getMessage());
            }
        }
    }

    public void startAlphaAnimation() {
        AlphaAnimation alphaAnimation = new AlphaAnimation(0.0f, 1.0f);
        alphaAnimation.setDuration(500L);
        this.f41530m.startAnimation(alphaAnimation);
    }

    public void startTranslateAnimation() {
        TranslateAnimation translateAnimation = new TranslateAnimation(2, 1.0f, 2, 0.0f, 2, 0.0f, 2, 0.0f);
        translateAnimation.setDuration(500L);
        this.f41530m.startAnimation(translateAnimation);
    }
}
