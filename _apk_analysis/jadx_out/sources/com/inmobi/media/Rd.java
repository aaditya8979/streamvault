package com.inmobi.media;

import android.content.Context;
import android.media.MediaPlayer;
import com.safedk.android.internal.partials.InMobiVideoBridge;

/* JADX INFO: loaded from: classes9.dex */
public final class Rd implements Ij {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ Sd f26247a;

    public Rd(Sd sd2) {
        this.f26247a = sd2;
    }

    @Override // com.inmobi.media.Ij
    public final void a() {
        Sd sd2 = this.f26247a;
        EnumC3736sg enumC3736sg = sd2.f26305e;
        if (enumC3736sg == EnumC3736sg.f28126e || enumC3736sg == EnumC3736sg.f28124c) {
            Context context = sd2.f26307g.getContext();
            tn.p.j(context, "getContext(...)");
            if (Rm.a(context, sd2.f26302b.f26207a)) {
                C3281ae c3281ae = sd2.f26309i;
                P4.a(c3281ae.f26789b, new Yd(c3281ae, null));
                sd2.f26310j.b();
                MediaPlayer mediaPlayer = sd2.f26308h;
                tn.p.k(mediaPlayer, "<this>");
                try {
                    InMobiVideoBridge.MediaPlayerStart(mediaPlayer);
                } catch (IllegalStateException unused) {
                }
                P4.a(sd2.f26306f, sd2.f26301a, new C3470hn(sd2.f26308h.getCurrentPosition()));
                sd2.f26305e = EnumC3736sg.f28125d;
            }
        }
    }

    @Override // com.inmobi.media.Ij
    public final void b() {
        Sd sd2 = this.f26247a;
        if (sd2.f26305e != EnumC3736sg.f28125d) {
            return;
        }
        MediaPlayer mediaPlayer = sd2.f26308h;
        tn.p.k(mediaPlayer, "<this>");
        try {
            mediaPlayer.pause();
        } catch (IllegalStateException unused) {
        }
        sd2.f26310j.c();
        C3281ae c3281ae = sd2.f26309i;
        P4.a(c3281ae.f26789b, new Xd(c3281ae, null));
        P4.a(sd2.f26306f, sd2.f26301a, new Om(sd2.f26308h.getCurrentPosition()));
        sd2.f26305e = EnumC3736sg.f28126e;
    }

    @Override // com.inmobi.media.Ij
    public final void c() {
        Sd sd2 = this.f26247a;
        if (sd2.f26305e != EnumC3736sg.f28127f) {
            return;
        }
        MediaPlayer mediaPlayer = sd2.f26308h;
        tn.p.k(mediaPlayer, "<this>");
        try {
            mediaPlayer.seekTo(0);
        } catch (IllegalStateException unused) {
        }
    }
}
