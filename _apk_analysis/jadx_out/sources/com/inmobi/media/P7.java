package com.inmobi.media;

import android.widget.FrameLayout;
import androidx.media3.exoplayer.ExoPlayer;

/* JADX INFO: loaded from: classes8.dex */
public final class P7 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final C3452h5 f26111a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final G1 f26112b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final ExoPlayer f26113c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final InterfaceC3580m9 f26114d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public Hj f26115e;

    public P7(C3452h5 c3452h5, G1 g12, ExoPlayer exoPlayer, InterfaceC3580m9 interfaceC3580m9) {
        tn.p.k(c3452h5, "textureView");
        tn.p.k(g12, "parentView");
        tn.p.k(exoPlayer, "mediaPlayer");
        this.f26111a = c3452h5;
        this.f26112b = g12;
        this.f26113c = exoPlayer;
        this.f26114d = interfaceC3580m9;
    }

    public final void a(int i10, int i11) {
        InterfaceC3580m9 interfaceC3580m9 = this.f26114d;
        if (interfaceC3580m9 != null) {
            ((C3605n9) interfaceC3580m9).a("HtmlPlayerTextureManager", "Video Size Changed: " + i10 + " x " + i11);
        }
        int i12 = this.f26113c.getVideoSize().width;
        int i13 = this.f26113c.getVideoSize().height;
        if (i13 == 0) {
            this.f26111a.setAspectRatio(1.0f);
        } else {
            this.f26111a.setAspectRatio(i12 / i13);
        }
    }

    public final void a(Hj hj2) {
        tn.p.k(hj2, "surfaceTextureListener");
        this.f26115e = hj2;
        this.f26112b.addView(this.f26111a, new FrameLayout.LayoutParams(-1, -1));
        int i10 = this.f26113c.getVideoSize().width;
        int i11 = this.f26113c.getVideoSize().height;
        if (i11 == 0) {
            this.f26111a.setAspectRatio(1.0f);
        } else {
            this.f26111a.setAspectRatio(i10 / i11);
        }
        this.f26111a.setSurfaceTextureListener(new O7(this));
    }
}
