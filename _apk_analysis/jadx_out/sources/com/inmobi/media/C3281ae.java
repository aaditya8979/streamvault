package com.inmobi.media;

import android.content.Context;
import android.media.MediaPlayer;
import android.view.View;
import android.widget.RelativeLayout;
import com.google.android.gms.common.internal.ServiceSpecificExtraArgs;
import com.inmobi.media.C3281ae;
import java.lang.ref.WeakReference;

/* JADX INFO: renamed from: com.inmobi.media.ae, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes11.dex */
public final class C3281ae {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final RelativeLayout f26788a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final p000do.l0 f26789b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final MediaPlayer f26790c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final Qm f26791d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final go.k f26792e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final Q1 f26793f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final RelativeLayout f26794g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final float f26795h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public boolean f26796i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final C3501j5 f26797j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public final C3501j5 f26798k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public final C3316bn f26799l;

    public C3281ae(RelativeLayout relativeLayout, p000do.l0 l0Var, MediaPlayer mediaPlayer, Qm qm2, go.k kVar) {
        tn.p.k(relativeLayout, "parentView");
        tn.p.k(l0Var, "coroutineScope");
        tn.p.k(mediaPlayer, "mediaPlayer");
        tn.p.k(qm2, "config");
        tn.p.k(kVar, "mediaPlayerFlow");
        this.f26788a = relativeLayout;
        this.f26789b = l0Var;
        this.f26790c = mediaPlayer;
        this.f26791d = qm2;
        this.f26792e = kVar;
        Context context = relativeLayout.getContext();
        tn.p.j(context, "getContext(...)");
        Q1 q12 = new Q1(context);
        this.f26793f = q12;
        RelativeLayout relativeLayout2 = new RelativeLayout(relativeLayout.getContext());
        this.f26794g = relativeLayout2;
        this.f26795h = J5.b();
        this.f26799l = new C3316bn(l0Var, relativeLayout2, qm2.f26209c, kVar);
        Vd vd2 = new Vd(this);
        tn.p.k(vd2, ServiceSpecificExtraArgs.CastExtraArgs.LISTENER);
        q12.f26157c = new WeakReference(vd2);
        Context context2 = relativeLayout2.getContext();
        tn.p.j(context2, "getContext(...)");
        this.f26797j = new C3501j5(context2, (byte) 9, null);
        Context context3 = relativeLayout2.getContext();
        tn.p.j(context3, "getContext(...)");
        this.f26798k = new C3501j5(context3, (byte) 10, null);
        b();
        relativeLayout2.setWillNotDraw(true);
        relativeLayout2.setBackgroundColor(0);
        Rm.a(mediaPlayer, q12);
    }

    public static final void a(C3281ae c3281ae, View view) {
        P4.a(c3281ae.f26789b, new Zd(c3281ae, null));
    }

    public static final void b(C3281ae c3281ae, View view) {
        c3281ae.a();
        c3281ae.f26793f.a();
    }

    public final void a() {
        MediaPlayer mediaPlayer = this.f26790c;
        tn.p.k(mediaPlayer, "<this>");
        try {
            mediaPlayer.setVolume(0.0f, 0.0f);
        } catch (IllegalStateException unused) {
        }
        a(this.f26797j, this.f26798k);
        P4.a(this.f26792e, this.f26789b, new S1(0.0f, true));
        this.f26796i = true;
    }

    public final void a(C3501j5 c3501j5, C3501j5 c3501j52) {
        if (tn.p.f(c3501j5.getParent(), this.f26794g)) {
            return;
        }
        this.f26794g.removeView(c3501j52);
        O1 o12 = this.f26791d.f26210d;
        float f10 = this.f26795h;
        tn.p.k(c3501j5, "<this>");
        tn.p.k(o12, "audioConfig");
        RelativeLayout.LayoutParams layoutParams = new RelativeLayout.LayoutParams((int) (o12.f26058b * f10), (int) (o12.f26059c * f10));
        int i10 = o12.f26061e;
        if (i10 == 0) {
            layoutParams.addRule(9, -1);
            layoutParams.addRule(10, -1);
        } else if (i10 == 1) {
            layoutParams.addRule(11, -1);
            layoutParams.addRule(10, -1);
        } else if (i10 == 2) {
            layoutParams.addRule(9, -1);
            layoutParams.addRule(12, -1);
        } else if (i10 == 3) {
            layoutParams.addRule(11, -1);
            layoutParams.addRule(12, -1);
        }
        Yb yb2 = o12.f26060d;
        layoutParams.leftMargin = (int) (yb2.f26633a * f10);
        layoutParams.topMargin = (int) (yb2.f26634b * f10);
        layoutParams.rightMargin = (int) (yb2.f26635c * f10);
        layoutParams.bottomMargin = (int) (yb2.f26636d * f10);
        c3501j5.setLayoutParams(layoutParams);
        this.f26794g.addView(c3501j5);
    }

    public final void b() {
        this.f26797j.setOnClickListener(new View.OnClickListener() { // from class: n9.q5
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                C3281ae.a(this.f75585b, view);
            }
        });
        this.f26798k.setOnClickListener(new View.OnClickListener() { // from class: n9.r5
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                C3281ae.b(this.f75598b, view);
            }
        });
    }
}
