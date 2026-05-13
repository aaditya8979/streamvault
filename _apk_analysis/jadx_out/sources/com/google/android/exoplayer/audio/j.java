package com.google.android.exoplayer.audio;

import a6.k0;
import com.google.android.exoplayer.audio.AudioProcessor;
import java.nio.ByteBuffer;

/* JADX INFO: compiled from: TrimmingAudioProcessor.java */
/* JADX INFO: loaded from: classes2.dex */
public final class j extends c {

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public int f20068i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public int f20069j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public boolean f20070k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public int f20071l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public byte[] f20072m = k0.f3579f;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public int f20073n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public long f20074o;

    @Override // com.google.android.exoplayer.audio.c
    public AudioProcessor.a c(AudioProcessor.a aVar) throws AudioProcessor.UnhandledAudioFormatException {
        if (aVar.f19948c != 2) {
            throw new AudioProcessor.UnhandledAudioFormatException(aVar);
        }
        this.f20070k = true;
        return (this.f20068i == 0 && this.f20069j == 0) ? AudioProcessor.a.f19945e : aVar;
    }

    @Override // com.google.android.exoplayer.audio.c
    public void d() {
        if (this.f20070k) {
            this.f20070k = false;
            int i10 = this.f20069j;
            int i11 = this.f20026b.f19949d;
            this.f20072m = new byte[i10 * i11];
            this.f20071l = this.f20068i * i11;
        }
        this.f20073n = 0;
    }

    @Override // com.google.android.exoplayer.audio.c
    public void e() {
        if (this.f20070k) {
            int i10 = this.f20073n;
            if (i10 > 0) {
                this.f20074o += (long) (i10 / this.f20026b.f19949d);
            }
            this.f20073n = 0;
        }
    }

    @Override // com.google.android.exoplayer.audio.c
    public void f() {
        this.f20072m = k0.f3579f;
    }

    @Override // com.google.android.exoplayer.audio.c, com.google.android.exoplayer.audio.AudioProcessor
    public ByteBuffer getOutput() {
        int i10;
        if (super.isEnded() && (i10 = this.f20073n) > 0) {
            g(i10).put(this.f20072m, 0, this.f20073n).flip();
            this.f20073n = 0;
        }
        return super.getOutput();
    }

    public long h() {
        return this.f20074o;
    }

    public void i() {
        this.f20074o = 0L;
    }

    @Override // com.google.android.exoplayer.audio.c, com.google.android.exoplayer.audio.AudioProcessor
    public boolean isEnded() {
        return super.isEnded() && this.f20073n == 0;
    }

    public void j(int i10, int i11) {
        this.f20068i = i10;
        this.f20069j = i11;
    }

    @Override // com.google.android.exoplayer.audio.AudioProcessor
    public void queueInput(ByteBuffer byteBuffer) {
        int iPosition = byteBuffer.position();
        int iLimit = byteBuffer.limit();
        int i10 = iLimit - iPosition;
        if (i10 == 0) {
            return;
        }
        int iMin = Math.min(i10, this.f20071l);
        this.f20074o += (long) (iMin / this.f20026b.f19949d);
        this.f20071l -= iMin;
        byteBuffer.position(iPosition + iMin);
        if (this.f20071l > 0) {
            return;
        }
        int i11 = i10 - iMin;
        int length = (this.f20073n + i11) - this.f20072m.length;
        ByteBuffer byteBufferG = g(length);
        int iQ = k0.q(length, 0, this.f20073n);
        byteBufferG.put(this.f20072m, 0, iQ);
        int iQ2 = k0.q(length - iQ, 0, i11);
        byteBuffer.limit(byteBuffer.position() + iQ2);
        byteBufferG.put(byteBuffer);
        byteBuffer.limit(iLimit);
        int i12 = i11 - iQ2;
        int i13 = this.f20073n - iQ;
        this.f20073n = i13;
        byte[] bArr = this.f20072m;
        System.arraycopy(bArr, iQ, bArr, 0, i13);
        byteBuffer.get(this.f20072m, this.f20073n, i12);
        this.f20073n += i12;
        byteBufferG.flip();
    }
}
