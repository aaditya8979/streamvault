package com.inmobi.media;

import android.graphics.SurfaceTexture;
import android.view.TextureView;

/* JADX INFO: loaded from: classes8.dex */
public final class O7 implements TextureView.SurfaceTextureListener {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ P7 f26071a;

    public O7(P7 p72) {
        this.f26071a = p72;
    }

    @Override // android.view.TextureView.SurfaceTextureListener
    public final void onSurfaceTextureAvailable(SurfaceTexture surfaceTexture, int i10, int i11) {
        tn.p.k(surfaceTexture, "surface");
        Hj hj2 = this.f26071a.f26115e;
        if (hj2 != null) {
            hj2.a(surfaceTexture);
        }
    }

    @Override // android.view.TextureView.SurfaceTextureListener
    public final boolean onSurfaceTextureDestroyed(SurfaceTexture surfaceTexture) {
        tn.p.k(surfaceTexture, "surface");
        Hj hj2 = this.f26071a.f26115e;
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
