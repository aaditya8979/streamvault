package com.ironsource;

import android.content.Context;
import android.util.AttributeSet;
import android.view.MotionEvent;
import android.view.View;
import android.webkit.WebView;
import android.widget.FrameLayout;
import com.ironsource.C3978d4;
import com.ironsource.mediationsdk.logger.IronLog;
import com.ironsource.sdk.utils.Logger;
import com.safedk.android.analytics.brandsafety.DetectTouchUtils;
import com.safedk.android.internal.partials.IronSourceVideoBridge;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: renamed from: com.ironsource.k8, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes12.dex */
public class C4107k8 extends FrameLayout implements K8 {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private static final String f32140b = "IronSourceAdContainer";

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private C4199p8 f32141a;

    /* JADX INFO: renamed from: com.ironsource.k8$a */
    public class a implements Runnable {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final /* synthetic */ String f32142a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final /* synthetic */ String f32143b;

        public a(String str, String str2) {
            this.f32142a = str;
            this.f32143b = str2;
        }

        @Override // java.lang.Runnable
        public void run() {
            C4107k8 c4107k8 = C4107k8.this;
            c4107k8.removeView(c4107k8.f32141a.getPresentingView());
            C4107k8.this.f32141a.a(this.f32142a, this.f32143b);
            C4107k8.this.f32141a = null;
        }
    }

    public C4107k8(Context context) {
        super(context);
    }

    public C4107k8(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
    }

    public C4107k8(C4199p8 c4199p8, Context context) {
        super(context);
        setLayoutParams(new FrameLayout.LayoutParams(c4199p8.c().c(), c4199p8.c().a()));
        this.f32141a = c4199p8;
        addView(c4199p8.getPresentingView());
    }

    private void b() throws Exception {
        JSONObject jSONObjectJsonObjectInit;
        try {
            jSONObjectJsonObjectInit = this.f32141a.b().a().getJSONObject(C4089j8.f32059p).getJSONObject(C4089j8.f32062s);
        } catch (Exception e10) {
            C4228r4.d().a(e10);
            jSONObjectJsonObjectInit = IronSourceVideoBridge.jsonObjectInit();
        }
        jSONObjectJsonObjectInit.put("adViewId", this.f32141a.a());
        this.f32141a.b().a(C3978d4.h.S, jSONObjectJsonObjectInit);
    }

    public void a() throws Exception {
        C4199p8 c4199p8 = this.f32141a;
        if (c4199p8 == null || c4199p8.b() == null) {
            throw new Exception("mAdPresenter or mAdPresenter.getAdViewLogic() are null");
        }
        b();
    }

    @Override // com.ironsource.K8
    public synchronized void a(String str, String str2) {
        C4199p8 c4199p8 = this.f32141a;
        if (c4199p8 != null && c4199p8.b() != null && this.f32141a.getPresentingView() != null) {
            this.f32141a.b().e();
            V7.f30593a.d(new a(str, str2));
        }
    }

    @Override // com.ironsource.K8
    public void a(String str, String str2, String str3) {
        C4199p8 c4199p8 = this.f32141a;
        if (c4199p8 == null) {
            return;
        }
        c4199p8.a(str, str2, str3);
    }

    @Override // com.ironsource.K8
    public void a(JSONObject jSONObject, String str, String str2) {
        this.f32141a.a(jSONObject, str, str2);
    }

    @Override // com.ironsource.K8
    public void b(JSONObject jSONObject, String str, String str2) {
        this.f32141a.b(jSONObject, str, str2);
    }

    @Override // com.ironsource.K8
    public void c(JSONObject jSONObject, String str, String str2) throws JSONException {
        this.f32141a.c(jSONObject, str, str2);
    }

    @Override // android.view.ViewGroup, android.view.View
    public boolean dispatchTouchEvent(MotionEvent motionEvent) {
        DetectTouchUtils.viewOnTouch(com.safedk.android.utils.g.f53132f, this, motionEvent);
        return super.dispatchTouchEvent(motionEvent);
    }

    @Override // com.ironsource.K8
    public WebView getPresentingView() {
        return this.f32141a.getPresentingView();
    }

    public C4072i8 getSize() {
        C4199p8 c4199p8 = this.f32141a;
        return c4199p8 != null ? c4199p8.c() : new C4072i8();
    }

    @Override // android.widget.FrameLayout, android.view.View
    protected void onMeasure(int i10, int i11) {
        if (1 == 0) {
            setMeasuredDimension(0, 0);
        } else {
            super.onMeasure(i10, i11);
        }
    }

    @Override // android.view.View
    public void onVisibilityChanged(View view, int i10) {
        Logger.i(f32140b, "onVisibilityChanged: " + i10);
        C4199p8 c4199p8 = this.f32141a;
        if (c4199p8 == null) {
            return;
        }
        try {
            c4199p8.b().a(C4089j8.f32054k, i10, isShown());
        } catch (Exception e10) {
            C4228r4.d().a(e10);
            IronLog.INTERNAL.error(e10.toString());
        }
    }

    @Override // android.view.View
    public void onWindowVisibilityChanged(int i10) {
        Logger.i(f32140b, "onWindowVisibilityChanged: " + i10);
        C4199p8 c4199p8 = this.f32141a;
        if (c4199p8 == null) {
            return;
        }
        try {
            c4199p8.b().a(C4089j8.f32055l, i10, isShown());
        } catch (Exception e10) {
            C4228r4.d().a(e10);
            IronLog.INTERNAL.error(e10.toString());
        }
    }
}
