package com.fyber.inneractive.sdk.player.exoplayer2.audio;

import android.media.AudioTimestamp;
import android.media.AudioTrack;

/* JADX INFO: loaded from: classes8.dex */
public final class l extends k {

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final AudioTimestamp f17274j = new AudioTimestamp();

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public long f17275k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public long f17276l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public long f17277m;

    @Override // com.fyber.inneractive.sdk.player.exoplayer2.audio.k
    public final void a(AudioTrack audioTrack, boolean z10) {
        super.a(audioTrack, z10);
        this.f17275k = 0L;
        this.f17276l = 0L;
        this.f17277m = 0L;
    }

    @Override // com.fyber.inneractive.sdk.player.exoplayer2.audio.k
    public final long b() {
        return this.f17277m;
    }

    @Override // com.fyber.inneractive.sdk.player.exoplayer2.audio.k
    public final long c() {
        return this.f17274j.nanoTime;
    }

    @Override // com.fyber.inneractive.sdk.player.exoplayer2.audio.k
    public final boolean e() {
        boolean timestamp = this.f17265a.getTimestamp(this.f17274j);
        if (timestamp) {
            long j10 = this.f17274j.framePosition;
            if (this.f17276l > j10) {
                this.f17275k++;
            }
            this.f17276l = j10;
            this.f17277m = j10 + (this.f17275k << 32);
        }
        return timestamp;
    }
}
