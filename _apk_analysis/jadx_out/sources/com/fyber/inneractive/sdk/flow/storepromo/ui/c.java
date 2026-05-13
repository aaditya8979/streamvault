package com.fyber.inneractive.sdk.flow.storepromo.ui;

import android.content.Context;
import android.content.IntentFilter;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.widget.RelativeLayout;
import com.fyber.inneractive.sdk.R;
import com.fyber.inneractive.sdk.config.IAConfigManager;
import com.fyber.inneractive.sdk.config.o;

/* JADX INFO: loaded from: classes12.dex */
public final class c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public View f16633a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public ViewGroup f16634b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final Animation f16635c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final Animation f16636d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public b f16637e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public com.fyber.inneractive.sdk.flow.storepromo.b f16638f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final float f16639g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public int f16640h = -1;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final a f16641i = new a(this);

    public c(Context context, View view, com.fyber.inneractive.sdk.flow.storepromo.b bVar) {
        float f10;
        this.f16633a = view;
        this.f16635c = AnimationUtils.loadAnimation(context, R.anim.store_promo_appear_anim);
        this.f16636d = AnimationUtils.loadAnimation(context, R.anim.store_promo_disappear_anim);
        o oVar = IAConfigManager.O.f15975u.f16144b;
        oVar.getClass();
        try {
            f10 = Float.parseFloat(oVar.a("dtx_store_promo_height", Float.toString(0.7f)));
        } catch (Throwable unused) {
            f10 = 0.7f;
        }
        this.f16639g = Math.max(f10, 0.7f);
        this.f16638f = bVar;
        ViewGroup viewGroup = (ViewGroup) LayoutInflater.from(context).inflate(R.layout.dt_store_promo_layout, (ViewGroup) null);
        this.f16634b = viewGroup;
        viewGroup.setOnClickListener(null);
        this.f16634b.setBackgroundColor(context.getResources().getColor(R.color.dtx_store_promo_bg_fade));
        ViewGroup.LayoutParams layoutParams = new ViewGroup.LayoutParams(-1, -1);
        RelativeLayout.LayoutParams layoutParams2 = new RelativeLayout.LayoutParams(-1, -2);
        layoutParams2.addRule(12);
        this.f16633a.setLayoutParams(layoutParams2);
        this.f16634b.setVisibility(8);
        ViewGroup viewGroup2 = this.f16634b;
        if (viewGroup2 != null) {
            viewGroup2.setLayoutParams(layoutParams);
            this.f16634b.addView(this.f16633a);
        }
        if (this.f16637e == null) {
            b bVar2 = new b(this);
            this.f16637e = bVar2;
            com.fyber.inneractive.sdk.util.o.f19548a.registerReceiver(bVar2, new IntentFilter("android.intent.action.CONFIGURATION_CHANGED"));
        }
    }

    public final void a() {
        View view;
        int iC = com.fyber.inneractive.sdk.util.o.c();
        if (iC == this.f16640h || (view = this.f16633a) == null || view.getLayoutParams() == null) {
            return;
        }
        this.f16640h = iC;
        RelativeLayout.LayoutParams layoutParams = (RelativeLayout.LayoutParams) this.f16633a.getLayoutParams();
        layoutParams.height = iC == 2 ? com.fyber.inneractive.sdk.util.o.e() : (int) (com.fyber.inneractive.sdk.util.o.d() * this.f16639g);
        this.f16633a.setLayoutParams(layoutParams);
    }
}
