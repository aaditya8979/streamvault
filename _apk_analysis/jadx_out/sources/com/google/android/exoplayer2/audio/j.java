package com.google.android.exoplayer2.audio;

import com.google.android.exoplayer2.audio.AudioProcessor;
import java.nio.ByteBuffer;
import s7.m0;

/* JADX INFO: compiled from: SilenceSkippingAudioProcessor.java */
/* JADX INFO: loaded from: classes4.dex */
public final class j extends d {

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final long f21330i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final long f21331j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public final short f21332k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public int f21333l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public boolean f21334m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public byte[] f21335n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public byte[] f21336o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public int f21337p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public int f21338q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public int f21339r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public boolean f21340s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public long f21341t;

    public j() {
        this(150000L, 20000L, (short) 1024);
    }

    public j(long j10, long j11, short s10) {
        s7.a.a(j11 <= j10);
        this.f21330i = j10;
        this.f21331j = j11;
        this.f21332k = s10;
        byte[] bArr = m0.f79492f;
        this.f21335n = bArr;
        this.f21336o = bArr;
    }

    @Override // com.google.android.exoplayer2.audio.d
    public AudioProcessor.a c(AudioProcessor.a aVar) throws AudioProcessor.UnhandledAudioFormatException {
        if (aVar.f21195c == 2) {
            return this.f21334m ? aVar : AudioProcessor.a.f21192e;
        }
        throw new AudioProcessor.UnhandledAudioFormatException(aVar);
    }

    @Override // com.google.android.exoplayer2.audio.d
    public void d() {
        if (this.f21334m) {
            this.f21333l = this.f21307b.f21196d;
            int iH = h(this.f21330i) * this.f21333l;
            if (this.f21335n.length != iH) {
                this.f21335n = new byte[iH];
            }
            int iH2 = h(this.f21331j) * this.f21333l;
            this.f21339r = iH2;
            if (this.f21336o.length != iH2) {
                this.f21336o = new byte[iH2];
            }
        }
        this.f21337p = 0;
        this.f21341t = 0L;
        this.f21338q = 0;
        this.f21340s = false;
    }

    @Override // com.google.android.exoplayer2.audio.d
    public void e() {
        int i10 = this.f21338q;
        if (i10 > 0) {
            m(this.f21335n, i10);
        }
        if (this.f21340s) {
            return;
        }
        this.f21341t += (long) (this.f21339r / this.f21333l);
    }

    @Override // com.google.android.exoplayer2.audio.d
    public void f() {
        this.f21334m = false;
        this.f21339r = 0;
        byte[] bArr = m0.f79492f;
        this.f21335n = bArr;
        this.f21336o = bArr;
    }

    public final int h(long j10) {
        return (int) ((j10 * ((long) this.f21307b.f21193a)) / 1000000);
    }

    public final int i(ByteBuffer byteBuffer) {
        int iLimit = byteBuffer.limit();
        do {
            iLimit -= 2;
            if (iLimit < byteBuffer.position()) {
                return byteBuffer.position();
            }
        } while (Math.abs((int) byteBuffer.getShort(iLimit)) <= this.f21332k);
        int i10 = this.f21333l;
        return ((iLimit / i10) * i10) + i10;
    }

    @Override // com.google.android.exoplayer2.audio.d, com.google.android.exoplayer2.audio.AudioProcessor
    public boolean isActive() {
        return this.f21334m;
    }

    public final int j(ByteBuffer byteBuffer) {
        for (int iPosition = byteBuffer.position(); iPosition < byteBuffer.limit(); iPosition += 2) {
            if (Math.abs((int) byteBuffer.getShort(iPosition)) > this.f21332k) {
                int i10 = this.f21333l;
                return i10 * (iPosition / i10);
            }
        }
        return byteBuffer.limit();
    }

    public long k() {
        return this.f21341t;
    }

    public final void l(ByteBuffer byteBuffer) {
        int iRemaining = byteBuffer.remaining();
        g(iRemaining).put(byteBuffer).flip();
        if (iRemaining > 0) {
            this.f21340s = true;
        }
    }

    public final void m(byte[] bArr, int i10) {
        g(i10).put(bArr, 0, i10).flip();
        if (i10 > 0) {
            this.f21340s = true;
        }
    }

    public final void n(ByteBuffer byteBuffer) {
        int iLimit = byteBuffer.limit();
        int iJ = j(byteBuffer);
        int iPosition = iJ - byteBuffer.position();
        byte[] bArr = this.f21335n;
        int length = bArr.length;
        int i10 = this.f21338q;
        int i11 = length - i10;
        if (iJ < iLimit && iPosition < i11) {
            m(bArr, i10);
            this.f21338q = 0;
            this.f21337p = 0;
            return;
        }
        int iMin = Math.min(iPosition, i11);
        byteBuffer.limit(byteBuffer.position() + iMin);
        byteBuffer.get(this.f21335n, this.f21338q, iMin);
        int i12 = this.f21338q + iMin;
        this.f21338q = i12;
        byte[] bArr2 = this.f21335n;
        if (i12 == bArr2.length) {
            if (this.f21340s) {
                m(bArr2, this.f21339r);
                this.f21341t += (long) ((this.f21338q - (this.f21339r * 2)) / this.f21333l);
            } else {
                this.f21341t += (long) ((i12 - this.f21339r) / this.f21333l);
            }
            r(byteBuffer, this.f21335n, this.f21338q);
            this.f21338q = 0;
            this.f21337p = 2;
        }
        byteBuffer.limit(iLimit);
    }

    public final void o(ByteBuffer byteBuffer) {
        int iLimit = byteBuffer.limit();
        byteBuffer.limit(Math.min(iLimit, byteBuffer.position() + this.f21335n.length));
        int i10 = i(byteBuffer);
        if (i10 == byteBuffer.position()) {
            this.f21337p = 1;
        } else {
            byteBuffer.limit(i10);
            l(byteBuffer);
        }
        byteBuffer.limit(iLimit);
    }

    public final void p(ByteBuffer byteBuffer) {
        int iLimit = byteBuffer.limit();
        int iJ = j(byteBuffer);
        byteBuffer.limit(iJ);
        this.f21341t += (long) (byteBuffer.remaining() / this.f21333l);
        r(byteBuffer, this.f21336o, this.f21339r);
        if (iJ < iLimit) {
            m(this.f21336o, this.f21339r);
            this.f21337p = 0;
            byteBuffer.limit(iLimit);
        }
    }

    public void q(boolean z10) {
        this.f21334m = z10;
    }

    @Override // com.google.android.exoplayer2.audio.AudioProcessor
    public void queueInput(ByteBuffer byteBuffer) {
        while (byteBuffer.hasRemaining() && !b()) {
            int i10 = this.f21337p;
            if (i10 == 0) {
                o(byteBuffer);
            } else if (i10 == 1) {
                n(byteBuffer);
            } else {
                if (i10 != 2) {
                    throw new IllegalStateException();
                }
                p(byteBuffer);
            }
        }
    }

    public final void r(ByteBuffer byteBuffer, byte[] bArr, int i10) {
        int iMin = Math.min(byteBuffer.remaining(), this.f21339r);
        int i11 = this.f21339r - iMin;
        System.arraycopy(bArr, i10 - i11, this.f21336o, 0, i11);
        byteBuffer.position(byteBuffer.limit() - iMin);
        byteBuffer.get(this.f21336o, i11, iMin);
    }
}
