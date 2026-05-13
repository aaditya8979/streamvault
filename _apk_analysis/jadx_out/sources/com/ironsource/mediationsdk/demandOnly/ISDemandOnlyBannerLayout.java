package com.ironsource.mediationsdk.demandOnly;

import android.app.Activity;
import android.content.Context;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.widget.FrameLayout;
import com.ironsource.C4260t2;
import com.ironsource.environment.thread.IronSourceThreadManager;
import com.ironsource.mediationsdk.ISBannerSize;
import com.ironsource.mediationsdk.logger.IronLog;
import com.safedk.android.analytics.brandsafety.DetectTouchUtils;

/* JADX INFO: loaded from: classes2.dex */
public class ISDemandOnlyBannerLayout extends FrameLayout {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private View f32432a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private ISBannerSize f32433b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private String f32434c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private Activity f32435d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private boolean f32436e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private C4260t2 f32437f;

    public class a implements Runnable {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final /* synthetic */ View f32438a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final /* synthetic */ FrameLayout.LayoutParams f32439b;

        public a(View view, FrameLayout.LayoutParams layoutParams) {
            this.f32438a = view;
            this.f32439b = layoutParams;
        }

        @Override // java.lang.Runnable
        public void run() {
            ISDemandOnlyBannerLayout.this.removeAllViews();
            ViewParent parent = this.f32438a.getParent();
            if (parent instanceof ViewGroup) {
                ((ViewGroup) parent).removeView(this.f32438a);
            }
            ISDemandOnlyBannerLayout iSDemandOnlyBannerLayout = ISDemandOnlyBannerLayout.this;
            View view = this.f32438a;
            iSDemandOnlyBannerLayout.f32432a = view;
            iSDemandOnlyBannerLayout.addView(view, 0, this.f32439b);
        }
    }

    public ISDemandOnlyBannerLayout(Activity activity, ISBannerSize iSBannerSize) {
        super(activity);
        this.f32436e = false;
        this.f32435d = activity;
        this.f32433b = iSBannerSize == null ? ISBannerSize.BANNER : iSBannerSize;
        this.f32437f = new C4260t2();
    }

    private ISDemandOnlyBannerLayout(Context context) {
        super(context);
        this.f32436e = false;
    }

    public void a() {
        this.f32436e = true;
        this.f32435d = null;
        this.f32433b = null;
        this.f32434c = null;
        this.f32432a = null;
        removeBannerListener();
    }

    public void a(View view, FrameLayout.LayoutParams layoutParams) {
        IronSourceThreadManager.INSTANCE.postOnUiThreadTask(new a(view, layoutParams));
    }

    @Override // android.view.ViewGroup, android.view.View
    public boolean dispatchTouchEvent(MotionEvent motionEvent) {
        DetectTouchUtils.viewOnTouch(com.safedk.android.utils.g.f53132f, this, motionEvent);
        return super.dispatchTouchEvent(motionEvent);
    }

    public Activity getActivity() {
        return this.f32435d;
    }

    public ISDemandOnlyBannerListener getBannerDemandOnlyListener() {
        return this.f32437f.a();
    }

    public View getBannerView() {
        return this.f32432a;
    }

    public C4260t2 getListener() {
        return this.f32437f;
    }

    public String getPlacementName() {
        return this.f32434c;
    }

    public ISBannerSize getSize() {
        return this.f32433b;
    }

    public boolean isDestroyed() {
        return this.f32436e;
    }

    @Override // android.widget.FrameLayout, android.view.View
    protected void onMeasure(int i10, int i11) {
        if (1 == 0) {
            setMeasuredDimension(0, 0);
        } else {
            super.onMeasure(i10, i11);
        }
    }

    public void removeBannerListener() {
        IronLog.API.info();
        this.f32437f.b((Object) null);
    }

    public void setBannerDemandOnlyListener(ISDemandOnlyBannerListener iSDemandOnlyBannerListener) {
        IronLog.API.info();
        this.f32437f.b(iSDemandOnlyBannerListener);
    }

    public void setPlacementName(String str) {
        this.f32434c = str;
    }
}
