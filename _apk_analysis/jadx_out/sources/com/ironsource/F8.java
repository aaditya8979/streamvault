package com.ironsource;

import android.content.Context;
import android.view.MotionEvent;
import android.view.View;
import android.widget.FrameLayout;
import com.ironsource.sdk.utils.Logger;
import com.safedk.android.analytics.brandsafety.DetectTouchUtils;
import io.bidmachine.ads.networks.gam_dynamic.GAMConfig;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes9.dex */
public final class F8 extends FrameLayout {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NotNull
    private final String f29306a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @Nullable
    private a f29307b;

    public interface a {
        void a(@NotNull pg pgVar);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public F8(@NotNull Context context) {
        super(context);
        tn.p.k(context, GAMConfig.KEY_CONTEXT);
        this.f29306a = "ISNNativeAdContainer";
    }

    private final pg a() {
        return new pg(getVisibility() == 0, getWindowVisibility() == 0, isShown());
    }

    @Override // android.view.ViewGroup, android.view.View
    public boolean dispatchTouchEvent(MotionEvent motionEvent) {
        DetectTouchUtils.viewOnTouch(com.safedk.android.utils.g.f53132f, this, motionEvent);
        return super.dispatchTouchEvent(motionEvent);
    }

    @Nullable
    public final a getListener$mediationsdk_release() {
        return this.f29307b;
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
    public void onVisibilityChanged(@NotNull View view, int i10) {
        tn.p.k(view, "changedView");
        Logger.i(this.f29306a, "onVisibilityChanged: " + i10);
        a aVar = this.f29307b;
        if (aVar != null) {
            aVar.a(a());
        }
    }

    @Override // android.view.View
    public void onWindowVisibilityChanged(int i10) {
        Logger.i(this.f29306a, "onWindowVisibilityChanged: " + i10);
        a aVar = this.f29307b;
        if (aVar != null) {
            aVar.a(a());
        }
    }

    public final void setListener$mediationsdk_release(@Nullable a aVar) {
        this.f29307b = aVar;
    }
}
