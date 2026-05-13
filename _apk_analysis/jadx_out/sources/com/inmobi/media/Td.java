package com.inmobi.media;

import android.graphics.SurfaceTexture;
import android.view.TextureView;

/* JADX INFO: loaded from: classes9.dex */
public final class Td implements TextureView.SurfaceTextureListener {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ Ud f26355a;

    public Td(Ud ud2) {
        this.f26355a = ud2;
    }

    @Override // android.view.TextureView.SurfaceTextureListener
    public final void onSurfaceTextureAvailable(SurfaceTexture surfaceTexture, int i10, int i11) {
        tn.p.k(surfaceTexture, "surface");
        Hj hj2 = this.f26355a.f26441e;
        if (hj2 != null) {
            hj2.a(surfaceTexture);
        }
    }

    @Override // android.view.TextureView.SurfaceTextureListener
    public final boolean onSurfaceTextureDestroyed(SurfaceTexture surfaceTexture) {
        tn.p.k(surfaceTexture, "surface");
        Hj hj2 = this.f26355a.f26441e;
        if (hj2 == null) {
            return true;
        }
        hj2.a();
        return true;
    }

    @Override // android.view.TextureView.SurfaceTextureListener
    public final void onSurfaceTextureSizeChanged(SurfaceTexture surfaceTexture, int i10, int i11) {
        tn.p.k(surfaceTexture, "surface");
    }

    @Override // android.view.TextureView.SurfaceTextureListener
    public final void onSurfaceTextureUpdated(SurfaceTexture surfaceTexture) {
        tn.p.k(surfaceTexture, "surface");
    }
}
