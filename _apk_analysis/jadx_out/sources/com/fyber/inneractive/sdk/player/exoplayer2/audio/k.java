package com.fyber.inneractive.sdk.player.exoplayer2.audio;

import android.media.AudioTrack;
import android.os.SystemClock;

/* JADX INFO: loaded from: classes8.dex */
public class k {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public AudioTrack f17265a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public boolean f17266b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public int f17267c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public long f17268d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public long f17269e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public long f17270f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public long f17271g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public long f17272h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public long f17273i;

    public final long a() {
        if (this.f17271g != -9223372036854775807L) {
            return Math.min(this.f17273i, this.f17272h + ((((SystemClock.elapsedRealtime() * 1000) - this.f17271g) * ((long) this.f17267c)) / 1000000));
        }
        int playState = this.f17265a.getPlayState();
        if (playState == 1) {
            return 0L;
        }
        long playbackHeadPosition = ((long) this.f17265a.getPlaybackHeadPosition()) & 4294967295L;
        if (this.f17266b) {
            if (playState == 2 && playbackHeadPosition == 0) {
                this.f17270f = this.f17268d;
            }
            playbackHeadPosition += this.f17270f;
        }
        if (this.f17268d > playbackHeadPosition) {
            this.f17269e++;
        }
        this.f17268d = playbackHeadPosition;
        return playbackHeadPosition + (this.f17269e << 32);
    }

    public final void a(long j10) {
        this.f17272h = a();
        this.f17271g = SystemClock.elapsedRealtime() * 1000;
        this.f17273i = j10;
        this.f17265a.stop();
    }

    public void a(AudioTrack audioTrack, boolean z10) {
        this.f17265a = audioTrack;
        this.f17266b = z10;
        this.f17271g = -9223372036854775807L;
        this.f17268d = 0L;
        this.f17269e = 0L;
        this.f17270f = 0L;
        if (audioTrack != null) {
            this.f17267c = audioTrack.getSampleRate();
        }
    }

    public long b() {
        throw new UnsupportedOperationException();
    }

    public long c() {
        throw new UnsupportedOperationException();
    }

    public final void d() {
        if (this.f17271g != -9223372036854775807L) {
            return;
        }
        this.f17265a.pause();
    }

    public boolean e() {
        return false;
    }
}
