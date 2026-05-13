package com.fyber.inneractive.sdk.player.controller;

import android.view.Surface;
import com.fyber.inneractive.sdk.player.exoplayer2.decoder.DecoderCounters;
import com.fyber.inneractive.sdk.player.exoplayer2.video.VideoRendererEventListener;
import com.fyber.inneractive.sdk.util.IAlog;
import java.lang.ref.WeakReference;

/* JADX INFO: loaded from: classes8.dex */
public final class b0 implements VideoRendererEventListener {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final WeakReference f17145a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public boolean f17146b = false;

    public b0(f fVar) {
        this.f17145a = new WeakReference(fVar);
    }

    public final String a() {
        f fVar = (f) this.f17145a.get();
        return fVar == null ? b0.class.getName() : IAlog.a(fVar);
    }

    public final void a(int i10, boolean z10) {
        com.fyber.inneractive.sdk.player.exoplayer2.g gVar;
        IAlog.a("%sonPlayerStateChanged called with pwr = %s state = %d", a(), Boolean.valueOf(z10), Integer.valueOf(i10));
        f fVar = (f) this.f17145a.get();
        if (fVar == null || (gVar = fVar.f17160s) == null || fVar.f17167z) {
            return;
        }
        if (i10 != 3) {
            if (i10 == 2) {
                if (fVar.f17186e == com.fyber.inneractive.sdk.player.enums.b.Playing) {
                    fVar.a(com.fyber.inneractive.sdk.player.enums.b.Buffering);
                    return;
                }
                return;
            } else {
                if (i10 == 4) {
                    fVar.a(com.fyber.inneractive.sdk.player.enums.b.Completed);
                    return;
                }
                return;
            }
        }
        if (z10) {
            fVar.a(com.fyber.inneractive.sdk.player.enums.b.Playing);
            return;
        }
        if (fVar.f17186e == com.fyber.inneractive.sdk.player.enums.b.Preparing) {
            com.fyber.inneractive.sdk.player.exoplayer2.trackselection.h hVar = gVar.f18317o;
            if (hVar != null && hVar.f18594a > 0) {
                com.fyber.inneractive.sdk.player.exoplayer2.trackselection.b bVar = hVar.f18595b[0];
                com.fyber.inneractive.sdk.player.exoplayer2.o oVar = bVar == null ? null : bVar.f18588d[bVar.a()];
                if (oVar != null) {
                    int i11 = oVar.f18457j;
                    int i12 = oVar.f18458k;
                    fVar.f17161t = i11;
                    fVar.f17162u = i12;
                }
            }
            this.f17146b = true;
            fVar.a(com.fyber.inneractive.sdk.player.enums.b.Prepared);
        }
    }

    @Override // com.fyber.inneractive.sdk.player.exoplayer2.video.VideoRendererEventListener
    public final void onDroppedFrames(int i10, long j10) {
    }

    @Override // com.fyber.inneractive.sdk.player.exoplayer2.video.VideoRendererEventListener
    public final void onRenderedFirstFrame(Surface surface) {
    }

    @Override // com.fyber.inneractive.sdk.player.exoplayer2.video.VideoRendererEventListener
    public final void onVideoDecoderInitialized(String str, long j10, long j11) {
    }

    @Override // com.fyber.inneractive.sdk.player.exoplayer2.video.VideoRendererEventListener
    public final void onVideoDisabled(DecoderCounters decoderCounters) {
    }

    @Override // com.fyber.inneractive.sdk.player.exoplayer2.video.VideoRendererEventListener
    public final void onVideoEnabled(DecoderCounters decoderCounters) {
    }

    @Override // com.fyber.inneractive.sdk.player.exoplayer2.video.VideoRendererEventListener
    public final void onVideoInputFormatChanged(com.fyber.inneractive.sdk.player.exoplayer2.o oVar) {
    }

    @Override // com.fyber.inneractive.sdk.player.exoplayer2.video.VideoRendererEventListener
    public final void onVideoSizeChanged(int i10, int i11, int i12, float f10) {
        f fVar = (f) this.f17145a.get();
        if (fVar != null) {
            fVar.f17161t = i10;
            fVar.f17162u = i11;
        }
    }
}
