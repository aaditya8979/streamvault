package com.inmobi.media;

import android.media.MediaPlayer;

/* JADX INFO: loaded from: classes9.dex */
public final class Vd implements P1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ C3281ae f26495a;

    public Vd(C3281ae c3281ae) {
        this.f26495a = c3281ae;
    }

    @Override // com.inmobi.media.P1
    public final void a() {
        this.f26495a.a();
    }

    @Override // com.inmobi.media.P1
    public final void b() {
        C3281ae c3281ae = this.f26495a;
        MediaPlayer mediaPlayer = c3281ae.f26790c;
        tn.p.k(mediaPlayer, "<this>");
        try {
            mediaPlayer.setVolume(1.0f, 1.0f);
        } catch (IllegalStateException unused) {
        }
        c3281ae.a(c3281ae.f26798k, c3281ae.f26797j);
        P4.a(c3281ae.f26792e, c3281ae.f26789b, new S1(1.0f, false));
        c3281ae.f26796i = false;
    }
}
