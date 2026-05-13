package com.unity3d.ads.gl;

import org.jetbrains.annotations.NotNull;
import tn.p;

/* JADX INFO: compiled from: OffscreenSurface.kt */
/* JADX INFO: loaded from: classes8.dex */
public final class OffscreenSurface extends EglSurfaceBase {
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public OffscreenSurface(@NotNull EglCore eglCore, int i10, int i11) {
        super(eglCore);
        p.k(eglCore, "eglCore");
        createOffscreenSurface(i10, i11);
    }

    public final void release() {
        releaseEglSurface();
    }
}
