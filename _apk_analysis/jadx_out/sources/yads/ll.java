package yads;

import android.media.AudioTimestamp;
import android.media.AudioTrack;

/* JADX INFO: loaded from: classes12.dex */
public final class ll {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final AudioTrack f92015a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final AudioTimestamp f92016b = new AudioTimestamp();

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public long f92017c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public long f92018d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public long f92019e;

    public ll(AudioTrack audioTrack) {
        this.f92015a = audioTrack;
    }

    public final long a() {
        return this.f92016b.nanoTime / 1000;
    }

    public final boolean b() {
        boolean timestamp = this.f92015a.getTimestamp(this.f92016b);
        if (timestamp) {
            long j10 = this.f92016b.framePosition;
            if (this.f92018d > j10) {
                this.f92017c++;
            }
            this.f92018d = j10;
            this.f92019e = j10 + (this.f92017c << 32);
        }
        return timestamp;
    }
}
