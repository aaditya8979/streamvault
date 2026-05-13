package com.fyber.inneractive.sdk.player.ui;

import android.content.Context;
import android.view.GestureDetector;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.RelativeLayout;
import android.widget.TextView;
import com.fyber.inneractive.sdk.R;
import com.fyber.inneractive.sdk.util.IAlog;
import com.fyber.inneractive.sdk.util.h1;
import com.fyber.inneractive.sdk.util.v;
import com.safedk.android.analytics.brandsafety.DetectTouchUtils;

/* JADX INFO: loaded from: classes4.dex */
public abstract class s extends e {

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final int f19069i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final int f19070j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public final int f19071k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public ViewGroup f19072l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public Button f19073m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public int f19074n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public int f19075o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public boolean f19076p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public ViewGroup f19077q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public ViewGroup f19078r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public final h1 f19079s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public h1 f19080t;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    public TextView f19081u;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public final com.fyber.inneractive.sdk.config.global.r f19082v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final String f19083w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public final h1 f19084x;

    public s(Context context, com.fyber.inneractive.sdk.config.global.r rVar, String str) {
        super(context);
        this.f19074n = -1;
        this.f19075o = -1;
        this.f19076p = false;
        this.f19079s = new h1(0, 0);
        this.f19084x = new h1(0, 0);
        IAlog.a("%sctor called", IAlog.a(this));
        int tickFractions = getTickFractions();
        this.f19070j = tickFractions;
        this.f19069i = getMaxTickFactor();
        this.f19071k = 1000 / tickFractions;
        setBackgroundColor(getResources().getColor(R.color.ia_video_background_color));
        setLayoutParams(new RelativeLayout.LayoutParams(-1, -1));
        this.f19082v = rVar;
        this.f19083w = str;
    }

    public abstract void a(int i10, int i11);

    public final void a(View view, int i10) {
        if (view != null) {
            view.setOnTouchListener(new r(new GestureDetector(view.getContext(), new q(this, view, new int[2], i10))));
        }
    }

    public abstract void a(com.fyber.inneractive.sdk.flow.endcard.b bVar, b bVar2);

    public void a(com.fyber.inneractive.sdk.flow.endcard.d dVar, b bVar) {
        ViewGroup defaultEndCardContainer = getDefaultEndCardContainer();
        if (defaultEndCardContainer != null) {
            defaultEndCardContainer.setVisibility(0);
            n nVar = this.f19022g;
            com.fyber.inneractive.sdk.flow.endcard.f fVar = (com.fyber.inneractive.sdk.flow.endcard.f) dVar.f();
            fVar.a(bVar, nVar);
            ViewGroup viewGroup = fVar.f16317c;
            v.a(viewGroup);
            defaultEndCardContainer.addView(viewGroup);
            dVar.a(dVar.f16310e, dVar.f16308c);
        }
    }

    public abstract void a(boolean z10);

    public void a(boolean z10, int i10, int i11) {
        this.f19074n = i10;
        this.f19075o = i11;
        this.f19076p = z10;
    }

    public abstract void a(boolean z10, com.fyber.inneractive.sdk.ignite.m mVar);

    public abstract void a(boolean z10, String str);

    public abstract void b(boolean z10);

    @Override // com.fyber.inneractive.sdk.player.ui.m
    public boolean b() {
        return this.f19077q.getVisibility() == 0 || this.f19078r.getChildCount() > 0;
    }

    public abstract void c(boolean z10);

    public abstract void d(boolean z10);

    public void destroy() {
        h();
        setVisibility(8);
        if (this.f19022g != null) {
            this.f19022g = null;
        }
        IAlog.a("%sdestroyed called", IAlog.a(this));
    }

    @Override // com.fyber.inneractive.sdk.player.ui.e, android.view.ViewGroup, android.view.View
    public boolean dispatchTouchEvent(MotionEvent motionEvent) {
        DetectTouchUtils.viewOnTouch(com.safedk.android.utils.g.f53142p, this, motionEvent);
        return super.dispatchTouchEvent(motionEvent);
    }

    public abstract void e(boolean z10);

    public abstract void f();

    public abstract void f(boolean z10);

    public abstract void g();

    public abstract void g(boolean z10);

    public ViewGroup getDefaultEndCardContainer() {
        return this.f19077q;
    }

    public abstract View getEndCardView();

    public int getMaxTickFactor() {
        return 1000;
    }

    public ViewGroup getTextureHost() {
        return this.f19072l;
    }

    public int getTickFractions() {
        return 5;
    }

    public abstract View[] getTrackingFriendlyView();

    public abstract View[] getTrackingFriendlyViewObstructionPurposeOther();

    public int getVideoHeight() {
        return this.f19075o;
    }

    public int getVideoWidth() {
        return this.f19074n;
    }

    public abstract void h();

    public abstract boolean i();

    public abstract void j();

    public abstract void k();

    public abstract boolean l();

    public abstract void m();

    public abstract void n();

    public abstract void o();

    @Override // com.fyber.inneractive.sdk.player.ui.e, android.widget.RelativeLayout, android.view.View
    public final void onMeasure(int i10, int i11) {
        int size = View.MeasureSpec.getSize(i10);
        int size2 = View.MeasureSpec.getSize(i11);
        a(this.f19084x, size, size2);
        h1 h1Var = this.f19084x;
        int i12 = h1Var.f19532a;
        if (i12 <= 0 || h1Var.f19533b <= 0) {
            h1Var.f19532a = size;
            h1Var.f19533b = size2;
        } else {
            int iMakeMeasureSpec = View.MeasureSpec.makeMeasureSpec(i12, 1073741824);
            i11 = View.MeasureSpec.makeMeasureSpec(this.f19084x.f19533b, 1073741824);
            i10 = iMakeMeasureSpec;
        }
        if (!this.f19079s.equals(this.f19084x)) {
            h1 h1Var2 = this.f19079s;
            h1 h1Var3 = this.f19084x;
            h1Var2.getClass();
            h1Var2.f19532a = h1Var3.f19532a;
            h1Var2.f19533b = h1Var3.f19533b;
            o();
        }
        super.onMeasure(i10, i11);
    }

    public abstract void setAppInfoButtonRound(TextView textView);

    public abstract void setMuteButtonState(boolean z10);

    public abstract void setRemainingTime(String str);

    public abstract void setSkipText(String str);
}
