package com.inmobi.media;

import android.media.MediaPlayer;
import android.widget.RelativeLayout;
import com.inmobi.media.Ud;

/* JADX INFO: loaded from: classes9.dex */
public final class Ud {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final C3452h5 f26437a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final RelativeLayout f26438b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final MediaPlayer f26439c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final C3605n9 f26440d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public Hj f26441e;

    public Ud(C3452h5 c3452h5, RelativeLayout relativeLayout, MediaPlayer mediaPlayer, C3605n9 c3605n9) {
        tn.p.k(c3452h5, "textureView");
        tn.p.k(relativeLayout, "parentView");
        tn.p.k(mediaPlayer, "mediaPlayer");
        this.f26437a = c3452h5;
        this.f26438b = relativeLayout;
        this.f26439c = mediaPlayer;
        this.f26440d = c3605n9;
    }

    public static final void a(Ud ud2, MediaPlayer mediaPlayer, int i10, int i11) {
        C3605n9 c3605n9 = ud2.f26440d;
        if (c3605n9 != null) {
            c3605n9.a("NativePlayerTextureManager", "Video Size Changed: " + i10 + " x " + i11);
        }
        int videoWidth = ud2.f26439c.getVideoWidth();
        int videoHeight = ud2.f26439c.getVideoHeight();
        if (videoHeight == 0) {
            ud2.f26437a.setAspectRatio(1.0f);
        } else {
            ud2.f26437a.setAspectRatio(videoWidth / videoHeight);
        }
    }

    public final void a() {
        this.f26439c.setOnVideoSizeChangedListener(new MediaPlayer.OnVideoSizeChangedListener() { // from class: n9.m4
            @Override // android.media.MediaPlayer.OnVideoSizeChangedListener
            public final void onVideoSizeChanged(MediaPlayer mediaPlayer, int i10, int i11) {
                Ud.a(this.f75498b, mediaPlayer, i10, i11);
            }
        });
    }

    public final void a(Hj hj2) {
        tn.p.k(hj2, "surfaceTextureListener");
        this.f26441e = hj2;
        RelativeLayout.LayoutParams layoutParams = new RelativeLayout.LayoutParams(-2, -2);
        layoutParams.addRule(13, -1);
        this.f26438b.addView(this.f26437a, layoutParams);
        a();
        int videoWidth = this.f26439c.getVideoWidth();
        int videoHeight = this.f26439c.getVideoHeight();
        if (videoHeight == 0) {
            this.f26437a.setAspectRatio(1.0f);
        } else {
            this.f26437a.setAspectRatio(videoWidth / videoHeight);
        }
        this.f26437a.setSurfaceTextureListener(new Td(this));
    }
}
