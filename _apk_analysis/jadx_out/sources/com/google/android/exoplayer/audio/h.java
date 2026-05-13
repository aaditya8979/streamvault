package com.google.android.exoplayer.audio;

import a6.k0;
import com.google.android.exoplayer.audio.AudioProcessor;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;

/* JADX INFO: compiled from: SilenceSkippingAudioProcessor.java */
/* JADX INFO: loaded from: classes2.dex */
public final class h extends c {

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final long f20041i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final long f20042j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public final short f20043k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public int f20044l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public boolean f20045m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public byte[] f20046n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public byte[] f20047o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public int f20048p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public int f20049q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public int f20050r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public boolean f20051s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public long f20052t;

    public h() {
        this(150000L, 20000L, (short) 1024);
    }

    public h(long j10, long j11, short s10) {
        a6.a.a(j11 <= j10);
        this.f20041i = j10;
        this.f20042j = j11;
        this.f20043k = s10;
        byte[] bArr = k0.f3579f;
        this.f20046n = bArr;
        this.f20047o = bArr;
    }

    @Override // com.google.android.exoplayer.audio.c
    public AudioProcessor.a c(AudioProcessor.a aVar) throws AudioProcessor.UnhandledAudioFormatException {
        if (aVar.f19948c == 2) {
            return this.f20045m ? aVar : AudioProcessor.a.f19945e;
        }
        throw new AudioProcessor.UnhandledAudioFormatException(aVar);
    }

    @Override // com.google.android.exoplayer.audio.c
    public void d() {
        if (this.f20045m) {
            this.f20044l = this.f20026b.f19949d;
            int iH = h(this.f20041i) * this.f20044l;
            if (this.f20046n.length != iH) {
                this.f20046n = new byte[iH];
            }
            int iH2 = h(this.f20042j) * this.f20044l;
            this.f20050r = iH2;
            if (this.f20047o.length != iH2) {
                this.f20047o = new byte[iH2];
            }
        }
        this.f20048p = 0;
        this.f20052t = 0L;
        this.f20049q = 0;
        this.f20051s = false;
    }

    @Override // com.google.android.exoplayer.audio.c
    public void e() {
        int i10 = this.f20049q;
        if (i10 > 0) {
            m(this.f20046n, i10);
        }
        if (this.f20051s) {
            return;
        }
        this.f20052t += (long) (this.f20050r / this.f20044l);
    }

    @Override // com.google.android.exoplayer.audio.c
    public void f() {
        this.f20045m = false;
        this.f20050r = 0;
        byte[] bArr = k0.f3579f;
        this.f20046n = bArr;
        this.f20047o = bArr;
    }

    public final int h(long j10) {
        return (int) ((j10 * ((long) this.f20026b.f19946a)) / 1000000);
    }

    public final int i(ByteBuffer byteBuffer) {
        a6.a.a(byteBuffer.order() == ByteOrder.LITTLE_ENDIAN);
        int iLimit = byteBuffer.limit();
        do {
            iLimit -= 2;
            if (iLimit < byteBuffer.position()) {
                return byteBuffer.position();
            }
        } while (Math.abs((int) byteBuffer.getShort(iLimit)) <= this.f20043k);
        int i10 = this.f20044l;
        return ((iLimit / i10) * i10) + i10;
    }

    @Override // com.google.android.exoplayer.audio.c, com.google.android.exoplayer.audio.AudioProcessor
    public boolean isActive() {
        return this.f20045m;
    }

    public final int j(ByteBuffer byteBuffer) {
        a6.a.a(byteBuffer.order() == ByteOrder.LITTLE_ENDIAN);
        for (int iPosition = byteBuffer.position(); iPosition < byteBuffer.limit(); iPosition += 2) {
            if (Math.abs((int) byteBuffer.getShort(iPosition)) > this.f20043k) {
                int i10 = this.f20044l;
                return i10 * (iPosition / i10);
            }
        }
        return byteBuffer.limit();
    }

    public long k() {
        return this.f20052t;
    }

    public final void l(ByteBuffer byteBuffer) {
        int iRemaining = byteBuffer.remaining();
        g(iRemaining).put(byteBuffer).flip();
        if (iRemaining > 0) {
            this.f20051s = true;
        }
    }

    public final void m(byte[] bArr, int i10) {
        g(i10).put(bArr, 0, i10).flip();
        if (i10 > 0) {
            this.f20051s = true;
        }
    }

    public final void n(ByteBuffer byteBuffer) {
        int iLimit = byteBuffer.limit();
        int iJ = j(byteBuffer);
        int iPosition = iJ - byteBuffer.position();
        byte[] bArr = this.f20046n;
        int length = bArr.length;
        int i10 = this.f20049q;
        int i11 = length - i10;
        if (iJ < iLimit && iPosition < i11) {
            m(bArr, i10);
            this.f20049q = 0;
            this.f20048p = 0;
            return;
        }
        int iMin = Math.min(iPosition, i11);
        byteBuffer.limit(byteBuffer.position() + iMin);
        byteBuffer.get(this.f20046n, this.f20049q, iMin);
        int i12 = this.f20049q + iMin;
        this.f20049q = i12;
        byte[] bArr2 = this.f20046n;
        if (i12 == bArr2.length) {
            if (this.f20051s) {
                m(bArr2, this.f20050r);
                this.f20052t += (long) ((this.f20049q - (this.f20050r * 2)) / this.f20044l);
            } else {
                this.f20052t += (long) ((i12 - this.f20050r) / this.f20044l);
            }
            r(byteBuffer, this.f20046n, this.f20049q);
            this.f20049q = 0;
            this.f20048p = 2;
        }
        byteBuffer.limit(iLimit);
    }

    public final void o(ByteBuffer byteBuffer) {
        int iLimit = byteBuffer.limit();
        byteBuffer.limit(Math.min(iLimit, byteBuffer.position() + this.f20046n.length));
        int i10 = i(byteBuffer);
        if (i10 == byteBuffer.position()) {
            this.f20048p = 1;
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
        this.f20052t += (long) (byteBuffer.remaining() / this.f20044l);
        r(byteBuffer, this.f20047o, this.f20050r);
        if (iJ < iLimit) {
            m(this.f20047o, this.f20050r);
            this.f20048p = 0;
            byteBuffer.limit(iLimit);
        }
    }

    public void q(boolean z10) {
        this.f20045m = z10;
    }

    @Override // com.google.android.exoplayer.audio.AudioProcessor
    public void queueInput(ByteBuffer byteBuffer) {
        while (byteBuffer.hasRemaining() && !b()) {
            int i10 = this.f20048p;
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
        int iMin = Math.min(byteBuffer.remaining(), this.f20050r);
        int i11 = this.f20050r - iMin;
        System.arraycopy(bArr, i10 - i11, this.f20047o, 0, i11);
        byteBuffer.position(byteBuffer.limit() - iMin);
        byteBuffer.get(this.f20047o, i11, iMin);
    }
}
