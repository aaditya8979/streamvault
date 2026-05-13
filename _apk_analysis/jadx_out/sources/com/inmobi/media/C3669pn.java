package com.inmobi.media;

import android.content.Context;
import android.media.MediaPlayer;
import android.view.Surface;
import android.widget.RelativeLayout;
import java.util.ArrayList;
import java.util.concurrent.atomic.AtomicBoolean;

/* JADX INFO: renamed from: com.inmobi.media.pn, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes11.dex */
public final class C3669pn {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final p000do.l0 f27900a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final MediaPlayer f27901b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final C3605n9 f27902c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final AtomicBoolean f27903d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final ArrayList f27904e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final Ud f27905f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public Surface f27906g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public Ij f27907h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final Wm f27908i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final C3644on f27909j;

    public C3669pn(p000do.l0 l0Var, MediaPlayer mediaPlayer, RelativeLayout relativeLayout, Qm qm2, C3605n9 c3605n9) {
        tn.p.k(l0Var, "coroutineScope");
        tn.p.k(mediaPlayer, "mediaPlayer");
        tn.p.k(relativeLayout, "mediaPlayerLayout");
        tn.p.k(qm2, "config");
        this.f27900a = l0Var;
        this.f27901b = mediaPlayer;
        this.f27902c = c3605n9;
        this.f27903d = new AtomicBoolean(false);
        this.f27904e = new ArrayList();
        Context context = relativeLayout.getContext();
        tn.p.j(context, "getContext(...)");
        C3452h5 c3452h5 = new C3452h5(context);
        this.f27905f = new Ud(c3452h5, relativeLayout, mediaPlayer, c3605n9);
        this.f27908i = new Wm(l0Var, c3452h5, qm2.f26211e);
        this.f27909j = new C3644on(this);
    }

    public final void a() {
        if (this.f27906g != null && this.f27903d.get()) {
            C3836wg c3836wg = (C3836wg) this.f27908i.f26566d.getValue();
            c3836wg.f28447f.set(false);
            c3836wg.a();
        } else {
            C3836wg c3836wg2 = (C3836wg) this.f27908i.f26566d.getValue();
            c3836wg2.f28443b.setValue(Mn.f25977a);
            c3836wg2.f28447f.set(true);
            H6.a(c3836wg2.f28446e);
            c3836wg2.f28446e = null;
        }
    }

    public final void b() {
        P4.a(this.f27904e);
        Ud ud2 = this.f27905f;
        ud2.f26441e = null;
        ud2.f26437a.setSurfaceTextureListener(null);
        ud2.f26439c.setOnVideoSizeChangedListener(null);
        C3836wg c3836wg = (C3836wg) this.f27908i.f26566d.getValue();
        c3836wg.f28447f.set(true);
        H6.a(c3836wg.f28446e);
        c3836wg.f28446e = null;
        Surface surface = this.f27906g;
        if (surface != null) {
            surface.release();
        }
        this.f27906g = null;
        this.f27907h = null;
    }
}
