package com.mbridge.msdk.splash.view;

import android.annotation.SuppressLint;
import android.app.Activity;
import android.content.Context;
import android.content.res.Configuration;
import android.util.AttributeSet;
import android.util.Base64;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.webkit.WebView;
import android.widget.RelativeLayout;
import com.ironsource.C3978d4;
import com.mbridge.msdk.dycreator.listener.DyCountDownListener;
import com.mbridge.msdk.foundation.entity.CampaignEx;
import com.mbridge.msdk.foundation.tools.d0;
import com.mbridge.msdk.foundation.tools.f1;
import com.mbridge.msdk.foundation.tools.h;
import com.mbridge.msdk.foundation.tools.m0;
import com.mbridge.msdk.foundation.tools.q0;
import com.mbridge.msdk.foundation.tools.v0;
import com.mbridge.msdk.mbsignalcommon.windvane.f;
import com.safedk.android.analytics.brandsafety.DetectTouchUtils;
import com.safedk.android.utils.g;
import java.util.HashMap;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes10.dex */
public class MBSplashView extends RelativeLayout {

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    private static String f40078u = "MBSplashView";

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private int f40079a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private MBSplashWebview f40080b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private com.mbridge.msdk.splash.view.a f40081c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private ViewGroup f40082d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private View f40083e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private View f40084f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private int f40085g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private boolean f40086h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private boolean f40087i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private boolean f40088j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    private ViewGroup f40089k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    private View f40090l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    private boolean f40091m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private boolean f40092n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    private RelativeLayout.LayoutParams f40093o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    private com.mbridge.msdk.splash.signal.b f40094p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    private DyCountDownListener f40095q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    private boolean f40096r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    private View.OnTouchListener f40097s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    private boolean f40098t;

    public class a implements View.OnTouchListener {
        public a() {
        }

        @Override // android.view.View.OnTouchListener
        public boolean onTouch(View view, MotionEvent motionEvent) {
            return !MBSplashView.this.f40096r;
        }
    }

    public class b implements Runnable {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final /* synthetic */ CampaignEx f40100a;

        public b(CampaignEx campaignEx) {
            this.f40100a = campaignEx;
        }

        @Override // java.lang.Runnable
        public void run() {
            MBSplashView.this.b(this.f40100a);
        }
    }

    public class c implements Runnable {
        public c() {
        }

        @Override // java.lang.Runnable
        public void run() {
            try {
                q0.a(MBSplashView.f40078u, "webviewshow");
                String string = "";
                try {
                    int[] iArr = new int[2];
                    MBSplashView.this.f40080b.getLocationOnScreen(iArr);
                    q0.b(MBSplashView.f40078u, "coordinate:" + iArr[0] + "--" + iArr[1]);
                    JSONObject jSONObject = new JSONObject();
                    jSONObject.put("startX", v0.b(com.mbridge.msdk.foundation.controller.c.n().d(), (float) iArr[0]));
                    jSONObject.put("startY", v0.b(com.mbridge.msdk.foundation.controller.c.n().d(), (float) iArr[1]));
                    string = jSONObject.toString();
                } catch (Throwable th2) {
                    q0.b(MBSplashView.f40078u, th2.getMessage(), th2);
                }
                int[] iArr2 = new int[2];
                MBSplashView.this.f40080b.getLocationInWindow(iArr2);
                MBSplashView.transInfoForMraid(MBSplashView.this.f40080b, iArr2[0], iArr2[1], MBSplashView.this.f40080b.getWidth(), MBSplashView.this.f40080b.getHeight());
                f.a().a((WebView) MBSplashView.this.f40080b, "webviewshow", Base64.encodeToString(string.toString().getBytes(), 2));
            } catch (Exception e10) {
                e10.printStackTrace();
            }
        }
    }

    public MBSplashView(Context context) {
        this(context, null);
    }

    public MBSplashView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    public MBSplashView(Context context, AttributeSet attributeSet, int i10) {
        super(context, attributeSet, i10);
        this.f40096r = true;
        this.f40097s = new a();
        this.f40098t = true;
        b();
    }

    private void a(CampaignEx campaignEx) {
        View view;
        View view2;
        View view3;
        this.f40098t = true;
        if (this.f40084f != null) {
            if (this.f40082d == null) {
                RelativeLayout relativeLayout = new RelativeLayout(getContext());
                this.f40082d = relativeLayout;
                relativeLayout.setId(2147482647);
            }
            if (this.f40079a == 2) {
                this.f40085g = v0.g(getContext());
                RelativeLayout.LayoutParams layoutParams = new RelativeLayout.LayoutParams(-1, -1);
                layoutParams.addRule(0, this.f40082d.getId());
                if (!this.f40091m || (view2 = this.f40090l) == null) {
                    MBSplashWebview mBSplashWebview = this.f40080b;
                    if (mBSplashWebview != null && mBSplashWebview.getParent() == null) {
                        addView(this.f40080b, layoutParams);
                    }
                    b(campaignEx);
                } else {
                    if (view2.getParent() != null) {
                        f1.a(this.f40090l);
                    }
                    addView(this.f40090l, layoutParams);
                }
                ViewGroup viewGroup = this.f40082d;
                if (viewGroup != null && viewGroup.getParent() == null) {
                    int i10 = this.f40093o.width;
                    f1.a(this.f40084f);
                    int i11 = this.f40085g / 4;
                    if (i10 > i11) {
                        this.f40082d.addView(this.f40084f, i11, -1);
                        i10 = i11;
                    } else {
                        this.f40082d.addView(this.f40084f, i10, -1);
                    }
                    RelativeLayout.LayoutParams layoutParams2 = new RelativeLayout.LayoutParams(i10, -1);
                    layoutParams2.addRule(11);
                    layoutParams2.addRule(13);
                    addView(this.f40082d, layoutParams2);
                }
            } else {
                this.f40085g = v0.f(getContext());
                RelativeLayout.LayoutParams layoutParams3 = new RelativeLayout.LayoutParams(-1, -1);
                layoutParams3.addRule(2, this.f40082d.getId());
                if (!this.f40091m || (view = this.f40090l) == null) {
                    MBSplashWebview mBSplashWebview2 = this.f40080b;
                    if (mBSplashWebview2 != null && mBSplashWebview2.getParent() == null) {
                        addView(this.f40080b, layoutParams3);
                    }
                    b(campaignEx);
                } else {
                    if (view.getParent() != null) {
                        f1.a(this.f40090l);
                    }
                    addView(this.f40090l, layoutParams3);
                }
                ViewGroup viewGroup2 = this.f40082d;
                if (viewGroup2 != null && viewGroup2.getParent() == null) {
                    int i12 = this.f40093o.height;
                    int i13 = this.f40085g / 4;
                    if (i12 > i13) {
                        i12 = i13;
                    }
                    f1.a(this.f40084f);
                    this.f40082d.addView(this.f40084f, -1, i12);
                    RelativeLayout.LayoutParams layoutParams4 = new RelativeLayout.LayoutParams(-1, i12);
                    layoutParams4.addRule(12);
                    addView(this.f40082d, layoutParams4);
                }
            }
        } else if (!this.f40091m || (view3 = this.f40090l) == null) {
            MBSplashWebview mBSplashWebview3 = this.f40080b;
            if (mBSplashWebview3 != null && mBSplashWebview3.getParent() == null) {
                addView(this.f40080b, new ViewGroup.LayoutParams(-1, -1));
            }
            b(campaignEx);
        } else {
            if (view3.getParent() != null) {
                f1.a(this.f40090l);
            }
            addView(this.f40090l, new ViewGroup.LayoutParams(-1, -1));
        }
        View view4 = this.f40083e;
        if (view4 != null) {
            if (view4.getParent() != null) {
                bringChildToFront(this.f40083e);
                return;
            }
            RelativeLayout.LayoutParams layoutParams5 = new RelativeLayout.LayoutParams(v0.a(getContext(), 100.0f), v0.a(getContext(), 30.0f));
            layoutParams5.addRule(10);
            layoutParams5.addRule(11);
            layoutParams5.rightMargin = v0.a(getContext(), 10.0f);
            layoutParams5.topMargin = v0.a(getContext(), 10.0f);
            addView(this.f40083e, layoutParams5);
        }
    }

    private void b() {
        setBackgroundColor(0);
        this.f40079a = getResources().getConfiguration().orientation;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void b(CampaignEx campaignEx) {
        MBSplashWebview mBSplashWebview = this.f40080b;
        if (mBSplashWebview != null) {
            if (campaignEx != null ? h.b(campaignEx, null, mBSplashWebview, campaignEx.getImpReportType()) : true) {
                this.f40080b.setObject(this.f40094p);
                this.f40080b.post(new c());
            } else if (this.f40098t) {
                this.f40098t = false;
                this.f40080b.postDelayed(new b(campaignEx), 200L);
            }
        }
    }

    public static void transInfoForMraid(WebView webView, int i10, int i11, int i12, int i13) {
        q0.b(f40078u, "transInfoForMraid");
        try {
            int i14 = com.mbridge.msdk.foundation.controller.c.n().d().getResources().getConfiguration().orientation;
            JSONObject jSONObject = new JSONObject();
            jSONObject.put("orientation", i14 == 2 ? C3978d4.i.C : i14 == 1 ? C3978d4.i.D : "undefined");
            jSONObject.put("locked", "true");
            float fN = m0.n(com.mbridge.msdk.foundation.controller.c.n().d());
            float fM = m0.m(com.mbridge.msdk.foundation.controller.c.n().d());
            HashMap mapV = m0.v(com.mbridge.msdk.foundation.controller.c.n().d());
            int iIntValue = ((Integer) mapV.get("width")).intValue();
            int iIntValue2 = ((Integer) mapV.get("height")).intValue();
            HashMap map = new HashMap();
            map.put("placementType", "Interstitial");
            map.put("state", "default");
            map.put("viewable", "true");
            map.put("currentAppOrientation", jSONObject);
            float f10 = i10;
            float f11 = i11;
            float f12 = i12;
            float f13 = i13;
            com.mbridge.msdk.mbsignalcommon.mraid.a.a().b(webView, f10, f11, f12, f13);
            com.mbridge.msdk.mbsignalcommon.mraid.a.a().a(webView, f10, f11, f12, f13);
            com.mbridge.msdk.mbsignalcommon.mraid.a.a().b(webView, fN, fM);
            com.mbridge.msdk.mbsignalcommon.mraid.a.a().a(webView, iIntValue, iIntValue2);
            com.mbridge.msdk.mbsignalcommon.mraid.a.a().a(webView, map);
            com.mbridge.msdk.mbsignalcommon.mraid.a.a().a(webView);
        } catch (Throwable th2) {
            q0.b(f40078u, "transInfoForMraid", th2);
        }
    }

    public void changeCloseBtnState(int i10) {
        View view = this.f40083e;
        if (view != null) {
            if (i10 == 2) {
                view.setVisibility(8);
            } else {
                view.setVisibility(0);
            }
        }
    }

    public void clearResState() {
        this.f40088j = false;
        this.f40087i = false;
        this.f40086h = false;
    }

    public void destroy() {
        removeAllViews();
        ViewGroup viewGroup = this.f40089k;
        if (viewGroup != null) {
            viewGroup.removeAllViews();
        }
        MBSplashWebview mBSplashWebview = this.f40080b;
        if (mBSplashWebview == null || mBSplashWebview.isDestoryed()) {
            return;
        }
        this.f40080b.finishAdSession();
        com.mbridge.msdk.splash.signal.c.a(this.f40080b, "onSystemDestory", "");
        this.f40080b.release();
        this.f40080b = null;
    }

    @Override // android.view.ViewGroup, android.view.View
    public boolean dispatchTouchEvent(MotionEvent motionEvent) {
        DetectTouchUtils.viewOnTouch(g.f53141o, this, motionEvent);
        return super.dispatchTouchEvent(motionEvent);
    }

    public View.OnTouchListener getAllowClickSplashTouchListener() {
        return this.f40097s;
    }

    public View getCloseView() {
        return this.f40083e;
    }

    public ViewGroup getDevContainer() {
        return this.f40089k;
    }

    public View getIconVg() {
        return this.f40084f;
    }

    public View getSplashNativeView() {
        return this.f40090l;
    }

    public com.mbridge.msdk.splash.signal.b getSplashSignalCommunicationImpl() {
        return this.f40094p;
    }

    public MBSplashWebview getSplashWebview() {
        return this.f40080b;
    }

    public boolean isAttach() {
        return this.f40092n;
    }

    public boolean isDynamicView() {
        return this.f40091m;
    }

    public boolean isH5Ready() {
        return this.f40086h;
    }

    public boolean isImageReady() {
        return this.f40088j;
    }

    public boolean isVideoReady() {
        return this.f40087i;
    }

    @Override // android.view.ViewGroup, android.view.View
    public void onAttachedToWindow() {
        super.onAttachedToWindow();
        this.f40092n = true;
    }

    @Override // android.view.View
    public void onConfigurationChanged(Configuration configuration) {
        super.onConfigurationChanged(configuration);
        b();
    }

    @Override // android.widget.RelativeLayout, android.view.View
    protected void onMeasure(int i10, int i11) {
        if (1 == 0) {
            setMeasuredDimension(0, 0);
        } else {
            super.onMeasure(i10, i11);
        }
    }

    public void onPause() {
        View view = this.f40090l;
        if (view == null || !(view instanceof MBSplashNativeView)) {
            return;
        }
        ((MBSplashNativeView) view).setIsPause(true);
    }

    public void onResume() {
        View view = this.f40090l;
        if (view == null || !(view instanceof MBSplashNativeView)) {
            return;
        }
        ((MBSplashNativeView) view).setIsPause(false);
    }

    public void resetLoadState() {
        this.f40087i = false;
        this.f40086h = false;
    }

    @SuppressLint({"ClickableViewAccessibility"})
    public void setAllowClickSplash(boolean z10) {
        this.f40096r = z10;
        setOnTouchListener(this.f40097s);
    }

    public void setCloseView(View view) {
        this.f40083e = view;
        if (view != null) {
            view.setContentDescription("closeButton");
        }
    }

    public void setDevContainer(ViewGroup viewGroup) {
        this.f40089k = viewGroup;
    }

    public void setDyCountDownListener(DyCountDownListener dyCountDownListener) {
        this.f40095q = dyCountDownListener;
    }

    public void setDynamicView(boolean z10) {
        this.f40091m = z10;
    }

    public void setH5Ready(boolean z10) {
        this.f40086h = z10;
    }

    public void setIconVg(View view, RelativeLayout.LayoutParams layoutParams) {
        this.f40084f = view;
        this.f40093o = layoutParams;
    }

    public void setImageReady(boolean z10) {
        this.f40088j = z10;
    }

    public void setNotchPadding(int i10, int i11, int i12, int i13) {
        View view = this.f40090l;
        if (view != null && (view instanceof MBSplashNativeView)) {
            ((MBSplashNativeView) view).setNotchPadding(i10, i11, i12, i13);
        }
        if (this.f40080b != null) {
            f.a().a((WebView) this.f40080b, "oncutoutfetched", Base64.encodeToString(d0.a(-999, i10, i11, i12, i13).getBytes(), 0));
        }
    }

    public void setSplashNativeView(View view) {
        if (view != null) {
            this.f40090l = view;
        }
    }

    public void setSplashSignalCommunicationImpl(com.mbridge.msdk.splash.signal.b bVar) {
        this.f40094p = bVar;
        MBSplashWebview mBSplashWebview = this.f40080b;
        if (mBSplashWebview != null) {
            mBSplashWebview.setObject(bVar);
        }
    }

    public void setSplashWebView() {
        if (this.f40080b == null) {
            try {
                MBSplashWebview mBSplashWebview = new MBSplashWebview(getContext());
                this.f40080b = mBSplashWebview;
                com.mbridge.msdk.splash.signal.b bVar = this.f40094p;
                if (bVar != null) {
                    mBSplashWebview.setObject(bVar);
                }
                com.mbridge.msdk.splash.view.a aVar = this.f40081c;
                if (aVar != null) {
                    this.f40080b.setWebViewClient(aVar);
                    return;
                }
                com.mbridge.msdk.splash.view.a aVar2 = new com.mbridge.msdk.splash.view.a();
                this.f40081c = aVar2;
                this.f40080b.setWebViewClient(aVar2);
            } catch (Throwable th2) {
                q0.b(f40078u, th2.getMessage());
            }
        }
    }

    public void setVideoReady(boolean z10) {
        this.f40087i = z10;
    }

    public void show(CampaignEx campaignEx) {
        ViewGroup viewGroup;
        if (this.f40094p != null && (viewGroup = this.f40089k) != null && (viewGroup.getContext() instanceof Activity)) {
            this.f40094p.a(this.f40089k.getContext());
            com.mbridge.msdk.splash.view.a aVar = this.f40081c;
            if (aVar != null) {
                aVar.a(this.f40094p.a());
            }
        }
        a(campaignEx);
        clearResState();
    }

    public void updateCountdown(int i10) {
        DyCountDownListener dyCountDownListener;
        View view;
        if (this.f40080b != null && !this.f40091m) {
            try {
                JSONObject jSONObject = new JSONObject();
                jSONObject.put("countdown", i10);
                f.a().a((WebView) this.f40080b, "updateCountdown", Base64.encodeToString(jSONObject.toString().getBytes(), 2));
            } catch (JSONException e10) {
                e10.printStackTrace();
            }
        }
        if (this.f40091m && (view = this.f40090l) != null && (view instanceof MBSplashNativeView)) {
            ((MBSplashNativeView) view).updateCountDown(i10);
        }
        if (!this.f40091m || (dyCountDownListener = this.f40095q) == null) {
            return;
        }
        dyCountDownListener.getCountDownValue(i10);
    }
}
