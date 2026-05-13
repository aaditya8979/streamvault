package com.inmobi.media;

import androidx.media3.common.Format;
import androidx.media3.common.PlaybackException;
import androidx.media3.common.Player;
import androidx.media3.common.Tracks;
import androidx.media3.common.VideoSize;
import com.google.common.collect.ImmutableList;
import io.bidmachine.iab.vast.tags.VastAttributes;
import java.util.Iterator;

/* JADX INFO: loaded from: classes6.dex */
public final class F7 implements Player.Listener {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ N7 f25419a;

    public F7(N7 n72) {
        this.f25419a = n72;
    }

    @Override // androidx.media3.common.Player.Listener
    public final void onIsLoadingChanged(boolean z10) {
        super.onIsLoadingChanged(z10);
        if (z10) {
            this.f25419a.f26006o.setVisibility(0);
        } else {
            this.f25419a.f26006o.setVisibility(8);
        }
        if (this.f25419a.f26007p.getPlaybackState() == 3 && this.f25419a.f26007p.getBufferedPercentage() == 100) {
            this.f25419a.a(W7.f26525a);
        }
    }

    @Override // androidx.media3.common.Player.Listener
    public final void onPlaybackStateChanged(int i10) {
        super.onPlaybackStateChanged(i10);
        if (i10 == 4) {
            InterfaceC3580m9 interfaceC3580m9 = this.f25419a.f25993b;
            if (interfaceC3580m9 != null) {
                ((C3605n9) interfaceC3580m9).b("HtmlMediaPlayer", "Playback ended");
            }
            C3776u6 c3776u6 = this.f25419a.f26015x;
            if (c3776u6.f28234g != 2) {
                c3776u6.f28234g = 2;
                p000do.i.d(c3776u6.f28229b, p000do.w0.c().M(), null, new C3677q6(c3776u6, c3776u6.f28228a.getDuration(), null), 2, null);
            }
        }
    }

    @Override // androidx.media3.common.Player.Listener
    public final void onPlayerError(PlaybackException playbackException) {
        tn.p.k(playbackException, "error");
        InterfaceC3580m9 interfaceC3580m9 = this.f25419a.f25993b;
        if (interfaceC3580m9 != null) {
            ((C3605n9) interfaceC3580m9).a("HtmlMediaPlayer", "Playback error: " + playbackException.getErrorCodeName(), playbackException);
        }
        this.f25419a.f26003l.set(EnumC3736sg.f28128g);
        N7 n72 = this.f25419a;
        int i10 = playbackException.errorCode;
        String errorCodeName = playbackException.getErrorCodeName();
        tn.p.j(errorCodeName, "getErrorCodeName(...)");
        n72.a(new C3480i8(errorCodeName));
        this.f25419a.f();
    }

    @Override // androidx.media3.common.Player.Listener
    public final void onTracksChanged(Tracks tracks) {
        Tracks.Group next;
        tn.p.k(tracks, "tracks");
        ImmutableList<Tracks.Group> groups = tracks.getGroups();
        tn.p.j(groups, "getGroups(...)");
        Iterator<Tracks.Group> it = groups.iterator();
        while (true) {
            if (it.hasNext()) {
                next = it.next();
                if (next.getType() == 2) {
                    break;
                }
            } else {
                next = null;
                break;
            }
        }
        Tracks.Group group = next;
        if (group != null) {
            N7 n72 = this.f25419a;
            int i10 = group.getMediaTrackGroup().length;
            for (int i11 = 0; i11 < i10; i11++) {
                Format format = group.getMediaTrackGroup().getFormat(i11);
                tn.p.j(format, "getFormat(...)");
                InterfaceC3580m9 interfaceC3580m9 = n72.f25993b;
                if (interfaceC3580m9 != null) {
                    ((C3605n9) interfaceC3580m9).b("HtmlMediaPlayer", "Metadata loaded: " + format.width + VastAttributes.HORIZONTAL_POSITION + format.height + ", " + format.sampleMimeType);
                }
                n72.a(C3455h8.f27283a);
            }
        }
    }

    @Override // androidx.media3.common.Player.Listener
    public final void onVideoSizeChanged(VideoSize videoSize) {
        tn.p.k(videoSize, "videoSize");
        InterfaceC3580m9 interfaceC3580m9 = this.f25419a.f25993b;
        if (interfaceC3580m9 != null) {
            ((C3605n9) interfaceC3580m9).b("HtmlMediaPlayer", "onVideoSizeChanged: width=" + videoSize.width + ", height=" + videoSize.height + ", ratio=" + videoSize.pixelWidthHeightRatio);
        }
        this.f25419a.f26000i = (int) (videoSize.width * videoSize.pixelWidthHeightRatio);
        this.f25419a.f26001j = videoSize.height;
        N7 n72 = this.f25419a;
        G1 g12 = n72.f26005n;
        int i10 = n72.f26000i;
        int i11 = this.f25419a.f26001j;
        g12.getClass();
        if (i10 > 0 && i11 > 0) {
            g12.f25505a = i10 / i11;
            g12.requestLayout();
        }
        this.f25419a.f26017z.f27762d.a(videoSize.width, videoSize.height);
    }

    @Override // androidx.media3.common.Player.Listener
    public final void onVolumeChanged(float f10) {
        super.onVolumeChanged(f10);
        if (f10 == 0.0f || f10 == 1.0f) {
            return;
        }
        N7 n72 = this.f25419a;
        boolean z10 = n72.f26016y.f26289e;
        n72.a(new Vn());
    }
}
