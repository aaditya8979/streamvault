package com.inmobi.media;

import android.content.Context;
import android.view.Surface;
import androidx.media3.exoplayer.ExoPlayer;
import java.util.ArrayList;

/* JADX INFO: renamed from: com.inmobi.media.o8, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes12.dex */
public final class C3629o8 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final p000do.l0 f27759a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final ExoPlayer f27760b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final ArrayList f27761c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final P7 f27762d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public Surface f27763e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public Ij f27764f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public boolean f27765g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final C3604n8 f27766h;

    public C3629o8(p000do.l0 l0Var, ExoPlayer exoPlayer, G1 g12, InterfaceC3580m9 interfaceC3580m9) {
        tn.p.k(l0Var, "coroutineScope");
        tn.p.k(exoPlayer, "mediaPlayer");
        tn.p.k(g12, "mediaPlayerLayout");
        this.f27759a = l0Var;
        this.f27760b = exoPlayer;
        this.f27761c = new ArrayList();
        Context context = g12.getContext();
        tn.p.j(context, "getContext(...)");
        this.f27762d = new P7(new C3452h5(context), g12, exoPlayer, interfaceC3580m9);
        this.f27766h = new C3604n8(this);
    }

    public final void a() {
        P4.a(this.f27761c);
        P7 p72 = this.f27762d;
        p72.f26115e = null;
        p72.f26111a.setSurfaceTextureListener(null);
        Surface surface = this.f27763e;
        if (surface != null) {
            surface.release();
        }
        this.f27763e = null;
        this.f27764f = null;
    }
}
