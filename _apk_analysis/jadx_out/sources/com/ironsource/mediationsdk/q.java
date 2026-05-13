package com.ironsource.mediationsdk;

import android.app.Activity;
import android.content.Context;
import android.view.MotionEvent;
import android.widget.FrameLayout;
import com.ironsource.C4277u2;
import com.ironsource.Ga;
import com.safedk.android.analytics.brandsafety.DetectTouchUtils;

/* JADX INFO: loaded from: classes12.dex */
public class q extends FrameLayout {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private ISBannerSize f32721a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private String f32722b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private boolean f32723c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private a f32724d;

    public interface a {
        void onWindowFocusChanged(boolean z10);
    }

    public q(Activity activity, ISBannerSize iSBannerSize) {
        super(activity);
        this.f32723c = false;
        this.f32721a = iSBannerSize == null ? ISBannerSize.BANNER : iSBannerSize;
    }

    public q(Context context) {
        super(context);
        this.f32723c = false;
    }

    public q(Context context, ISBannerSize iSBannerSize) {
        super(context);
        this.f32723c = false;
        this.f32721a = iSBannerSize == null ? ISBannerSize.BANNER : iSBannerSize;
    }

    public void a() {
        this.f32723c = true;
        this.f32721a = null;
        this.f32722b = null;
        this.f32724d = null;
        C4277u2.a().a((Ga) null);
    }

    public boolean b() {
        return this.f32723c;
    }

    public q c() {
        q qVar = new q(getContext(), this.f32721a);
        qVar.f32722b = this.f32722b;
        return qVar;
    }

    @Override // android.view.ViewGroup, android.view.View
    public boolean dispatchTouchEvent(MotionEvent motionEvent) {
        DetectTouchUtils.viewOnTouch(com.safedk.android.utils.g.f53132f, this, motionEvent);
        return super.dispatchTouchEvent(motionEvent);
    }

    public ISBannerSize getSize() {
        return this.f32721a;
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
    public void onWindowFocusChanged(boolean z10) {
        super.onWindowFocusChanged(z10);
        a aVar = this.f32724d;
        if (aVar != null) {
            aVar.onWindowFocusChanged(z10);
        }
    }

    public void setBannerSize(ISBannerSize iSBannerSize) {
        this.f32721a = iSBannerSize;
    }
}
