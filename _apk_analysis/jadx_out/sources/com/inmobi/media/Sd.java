package com.inmobi.media;

import android.content.Context;
import android.media.MediaPlayer;
import android.widget.RelativeLayout;
import io.bidmachine.ads.networks.gam_dynamic.GAMConfig;
import java.util.ArrayList;

/* JADX INFO: loaded from: classes9.dex */
public final class Sd implements InterfaceC3382ec {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final p000do.l0 f26301a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Qm f26302b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final C3605n9 f26303c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final ArrayList f26304d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public EnumC3736sg f26305e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final go.k f26306f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final RelativeLayout f26307g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final MediaPlayer f26308h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final C3281ae f26309i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final C3419fn f26310j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public final C3669pn f26311k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public final Rd f26312l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public final go.k f26313m;

    public Sd(Context context, p000do.l0 l0Var, Qm qm2, C3605n9 c3605n9) {
        tn.p.k(context, GAMConfig.KEY_CONTEXT);
        tn.p.k(l0Var, "coroutineScope");
        tn.p.k(qm2, "config");
        this.f26301a = l0Var;
        this.f26302b = qm2;
        this.f26303c = c3605n9;
        this.f26304d = new ArrayList();
        this.f26305e = EnumC3736sg.f28122a;
        go.k kVarB = go.q.b(0, 0, null, 7, null);
        this.f26306f = kVarB;
        RelativeLayout relativeLayout = new RelativeLayout(context);
        this.f26307g = relativeLayout;
        Context context2 = relativeLayout.getContext();
        tn.p.j(context2, "getContext(...)");
        MediaPlayer mediaPlayerA = Rm.a(context2);
        this.f26308h = mediaPlayerA;
        this.f26309i = new C3281ae(relativeLayout, l0Var, mediaPlayerA, qm2, kVarB);
        this.f26310j = new C3419fn(mediaPlayerA, l0Var, qm2.f26209c.f25449f, kVarB);
        this.f26311k = new C3669pn(l0Var, mediaPlayerA, relativeLayout, qm2, c3605n9);
        this.f26312l = new Rd(this);
        this.f26313m = kVarB;
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object a(java.util.ArrayList r7, kotlin.coroutines.jvm.internal.ContinuationImpl r8) {
        /*
            Method dump skipped, instruction units count: 232
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.inmobi.media.Sd.a(java.util.ArrayList, kotlin.coroutines.jvm.internal.ContinuationImpl):java.lang.Object");
    }
}
