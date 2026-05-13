package com.inmobi.media;

import android.graphics.SurfaceTexture;
import android.view.Surface;

/* JADX INFO: renamed from: com.inmobi.media.n8, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes12.dex */
public final class C3604n8 implements Hj {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ C3629o8 f27674a;

    public C3604n8(C3629o8 c3629o8) {
        this.f27674a = c3629o8;
    }

    @Override // com.inmobi.media.Hj
    public final void a() {
        this.f27674a.f27760b.clearVideoSurface();
        this.f27674a.f27760b.setVideoSurface(null);
        Surface surface = this.f27674a.f27763e;
        if (surface != null) {
            surface.release();
        }
        this.f27674a.f27763e = null;
    }

    @Override // com.inmobi.media.Hj
    public final void a(SurfaceTexture surfaceTexture) {
        tn.p.k(surfaceTexture, "surface");
        Surface surface = new Surface(surfaceTexture);
        C3629o8 c3629o8 = this.f27674a;
        Surface surface2 = c3629o8.f27763e;
        if (surface2 != null) {
            surface2.release();
        }
        c3629o8.f27763e = surface;
        Ij ij2 = this.f27674a.f27764f;
        if (ij2 != null) {
            ij2.c();
        }
    }
}
