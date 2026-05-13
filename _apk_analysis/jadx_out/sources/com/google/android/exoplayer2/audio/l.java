package com.google.android.exoplayer2.audio;

import com.google.android.exoplayer2.audio.AudioProcessor;
import java.nio.ByteBuffer;
import s7.m0;

/* JADX INFO: compiled from: TrimmingAudioProcessor.java */
/* JADX INFO: loaded from: classes4.dex */
public final class l extends d {

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public int f21357i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public int f21358j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public boolean f21359k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public int f21360l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public byte[] f21361m = m0.f79492f;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public int f21362n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public long f21363o;

    @Override // com.google.android.exoplayer2.audio.d
    public AudioProcessor.a c(AudioProcessor.a aVar) throws AudioProcessor.UnhandledAudioFormatException {
        if (aVar.f21195c != 2) {
            throw new AudioProcessor.UnhandledAudioFormatException(aVar);
        }
        this.f21359k = true;
        return (this.f21357i == 0 && this.f21358j == 0) ? AudioProcessor.a.f21192e : aVar;
    }

    @Override // com.google.android.exoplayer2.audio.d
    public void d() {
        if (this.f21359k) {
            this.f21359k = false;
            int i10 = this.f21358j;
            int i11 = this.f21307b.f21196d;
            this.f21361m = new byte[i10 * i11];
            this.f21360l = this.f21357i * i11;
        }
        this.f21362n = 0;
    }

    @Override // com.google.android.exoplayer2.audio.d
    public void e() {
        if (this.f21359k) {
            int i10 = this.f21362n;
            if (i10 > 0) {
                this.f21363o += (long) (i10 / this.f21307b.f21196d);
            }
            this.f21362n = 0;
        }
    }

    @Override // com.google.android.exoplayer2.audio.d
    public void f() {
        this.f21361m = m0.f79492f;
    }

    @Override // com.google.android.exoplayer2.audio.d, com.google.android.exoplayer2.audio.AudioProcessor
    public ByteBuffer getOutput() {
        int i10;
        if (super.isEnded() && (i10 = this.f21362n) > 0) {
            g(i10).put(this.f21361m, 0, this.f21362n).flip();
            this.f21362n = 0;
        }
        return super.getOutput();
    }

    public long h() {
        return this.f21363o;
    }

    public void i() {
        this.f21363o = 0L;
    }

    @Override // com.google.android.exoplayer2.audio.d, com.google.android.exoplayer2.audio.AudioProcessor
    public boolean isEnded() {
        return super.isEnded() && this.f21362n == 0;
    }

    public void j(int i10, int i11) {
        this.f21357i = i10;
        this.f21358j = i11;
    }

    @Override // com.google.android.exoplayer2.audio.AudioProcessor
    public void queueInput(ByteBuffer byteBuffer) {
        int iPosition = byteBuffer.position();
        int iLimit = byteBuffer.limit();
        int i10 = iLimit - iPosition;
        if (i10 == 0) {
            return;
        }
        int iMin = Math.min(i10, this.f21360l);
        this.f21363o += (long) (iMin / this.f21307b.f21196d);
        this.f21360l -= iMin;
        byteBuffer.position(iPosition + iMin);
        if (this.f21360l > 0) {
            return;
        }
        int i11 = i10 - iMin;
        int length = (this.f21362n + i11) - this.f21361m.length;
        ByteBuffer byteBufferG = g(length);
        int iP = m0.p(length, 0, this.f21362n);
        byteBufferG.put(this.f21361m, 0, iP);
        int iP2 = m0.p(length - iP, 0, i11);
        byteBuffer.limit(byteBuffer.position() + iP2);
        byteBufferG.put(byteBuffer);
        byteBuffer.limit(iLimit);
        int i12 = i11 - iP2;
        int i13 = this.f21362n - iP;
        this.f21362n = i13;
        byte[] bArr = this.f21361m;
        System.arraycopy(bArr, iP, bArr, 0, i13);
        byteBuffer.get(this.f21361m, this.f21362n, i12);
        this.f21362n += i12;
        byteBufferG.flip();
    }
}
