package com.applovin.impl;

import android.app.Activity;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import androidx.core.view.ViewCompat;
import com.applovin.impl.sdk.ad.b;

/* JADX INFO: loaded from: classes7.dex */
abstract class v1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final com.applovin.impl.sdk.k f10535a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Activity f10536b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final com.applovin.impl.sdk.ad.b f10537c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final ViewGroup f10538d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final FrameLayout.LayoutParams f10539e;

    public v1(com.applovin.impl.sdk.ad.b bVar, Activity activity, com.applovin.impl.sdk.k kVar) {
        FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams(-1, -1, 17);
        this.f10539e = layoutParams;
        this.f10537c = bVar;
        this.f10535a = kVar;
        this.f10536b = activity;
        FrameLayout frameLayout = new FrameLayout(activity);
        this.f10538d = frameLayout;
        frameLayout.setBackgroundColor(ViewCompat.MEASURED_STATE_MASK);
        frameLayout.setLayoutParams(layoutParams);
    }

    public void a(View view) {
        this.f10538d.removeView(view);
    }

    public void a(com.applovin.impl.adview.g gVar) {
        if (gVar == null || gVar.getParent() != null) {
            return;
        }
        a(this.f10537c.n(), (this.f10537c.u0() ? 3 : 5) | 48, gVar);
    }

    public void a(b.d dVar, int i10, com.applovin.impl.adview.g gVar) {
        gVar.a(dVar.f9958a, dVar.f9962e, dVar.f9961d, i10);
        FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams(gVar.getLayoutParams());
        int i11 = dVar.f9960c;
        layoutParams.setMargins(i11, dVar.f9959b, i11, 0);
        layoutParams.gravity = i10;
        this.f10538d.addView(gVar, layoutParams);
    }
}
