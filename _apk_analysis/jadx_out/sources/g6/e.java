package g6;

import s7.m0;

/* JADX INFO: compiled from: DecoderCounters.java */
/* JADX INFO: loaded from: classes3.dex */
public final class e {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public int f62096a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public int f62097b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public int f62098c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public int f62099d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public int f62100e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public int f62101f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public int f62102g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public int f62103h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public int f62104i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public int f62105j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public long f62106k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public int f62107l;

    public void a(long j10) {
        b(j10, 1);
    }

    public final void b(long j10, int i10) {
        this.f62106k += j10;
        this.f62107l += i10;
    }

    public synchronized void c() {
    }

    public String toString() {
        return m0.z("DecoderCounters {\n decoderInits=%s,\n decoderReleases=%s\n queuedInputBuffers=%s\n skippedInputBuffers=%s\n renderedOutputBuffers=%s\n skippedOutputBuffers=%s\n droppedBuffers=%s\n droppedInputBuffers=%s\n maxConsecutiveDroppedBuffers=%s\n droppedToKeyframeEvents=%s\n totalVideoFrameProcessingOffsetUs=%s\n videoFrameProcessingOffsetCount=%s\n}", Integer.valueOf(this.f62096a), Integer.valueOf(this.f62097b), Integer.valueOf(this.f62098c), Integer.valueOf(this.f62099d), Integer.valueOf(this.f62100e), Integer.valueOf(this.f62101f), Integer.valueOf(this.f62102g), Integer.valueOf(this.f62103h), Integer.valueOf(this.f62104i), Integer.valueOf(this.f62105j), Long.valueOf(this.f62106k), Integer.valueOf(this.f62107l));
    }
}
