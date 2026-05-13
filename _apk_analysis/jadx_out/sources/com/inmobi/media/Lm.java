package com.inmobi.media;

import androidx.media3.common.PlaybackException;
import androidx.media3.common.Player;
import androidx.media3.exoplayer.ExoPlayer;

/* JADX INFO: loaded from: classes7.dex */
public final class Lm implements Player.Listener {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ kotlinx.coroutines.c f25909a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ K2 f25910b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ String f25911c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ InterfaceC3580m9 f25912d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final /* synthetic */ ExoPlayer f25913e;

    public Lm(kotlinx.coroutines.c cVar, K2 k22, String str, InterfaceC3580m9 interfaceC3580m9, ExoPlayer exoPlayer) {
        this.f25909a = cVar;
        this.f25910b = k22;
        this.f25911c = str;
        this.f25912d = interfaceC3580m9;
        this.f25913e = exoPlayer;
    }

    @Override // androidx.media3.common.Player.Listener
    public final void onPlaybackStateChanged(int i10) {
        if (i10 == 3) {
            if (this.f25909a.isActive()) {
                int iA = this.f25910b.a(this.f25911c);
                InterfaceC3580m9 interfaceC3580m9 = this.f25912d;
                if (interfaceC3580m9 != null) {
                    ((C3605n9) interfaceC3580m9).a("VideoLoaderHelper", "Media loaded successfully from URL with cache progress: " + iA);
                }
                P4.a(this.f25909a, new C3404f8(iA, this.f25913e.getDuration(), this.f25911c));
            }
            this.f25913e.removeListener(this);
        }
    }

    @Override // androidx.media3.common.Player.Listener
    public final void onPlayerError(PlaybackException playbackException) {
        tn.p.k(playbackException, "error");
        InterfaceC3580m9 interfaceC3580m9 = this.f25912d;
        if (interfaceC3580m9 != null) {
            ((C3605n9) interfaceC3580m9).b("VideoLoaderHelper", "Failed to load URL (" + this.f25911c + "): " + playbackException.getMessage());
        }
        if (this.f25909a.isActive()) {
            P4.a(this.f25909a, new C3327c8(Am.f25180d));
        }
        this.f25913e.removeListener(this);
        this.f25913e.stop();
        this.f25913e.clearMediaItems();
    }
}
