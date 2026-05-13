package com.inmobi.media;

import android.graphics.SurfaceTexture;
import android.media.MediaPlayer;
import android.view.Surface;
import com.safedk.android.internal.partials.InMobiVideoBridge;

/* JADX INFO: renamed from: com.inmobi.media.on, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes11.dex */
public final class C3644on implements Hj {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ C3669pn f27814a;

    public C3644on(C3669pn c3669pn) {
        this.f27814a = c3669pn;
    }

    @Override // com.inmobi.media.Hj
    public final void a() {
        Surface surface = this.f27814a.f27906g;
        if (surface != null) {
            surface.release();
        }
        C3669pn c3669pn = this.f27814a;
        c3669pn.f27906g = null;
        MediaPlayer mediaPlayer = c3669pn.f27901b;
        tn.p.k(mediaPlayer, "<this>");
        try {
            InMobiVideoBridge.MediaPlayerSetSurface(mediaPlayer, null);
        } catch (IllegalStateException unused) {
        }
        this.f27814a.a();
    }

    @Override // com.inmobi.media.Hj
    public final void a(SurfaceTexture surfaceTexture) {
        tn.p.k(surfaceTexture, "surface");
        Surface surface = new Surface(surfaceTexture);
        C3669pn c3669pn = this.f27814a;
        c3669pn.f27906g = surface;
        MediaPlayer mediaPlayer = c3669pn.f27901b;
        tn.p.k(mediaPlayer, "<this>");
        try {
            InMobiVideoBridge.MediaPlayerSetSurface(mediaPlayer, surface);
        } catch (IllegalStateException unused) {
        }
        this.f27814a.a();
        Ij ij2 = this.f27814a.f27907h;
        if (ij2 != null) {
            ij2.c();
        }
    }
}
