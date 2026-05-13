package com.google.android.exoplayer2.audio;

import androidx.annotation.Nullable;
import com.google.android.exoplayer2.audio.AudioProcessor;
import f6.w;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.nio.ShortBuffer;
import s7.m0;

/* JADX INFO: compiled from: SonicAudioProcessor.java */
/* JADX INFO: loaded from: classes4.dex */
public final class k implements AudioProcessor {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public int f21342b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public float f21343c = 1.0f;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public float f21344d = 1.0f;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public AudioProcessor.a f21345e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public AudioProcessor.a f21346f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public AudioProcessor.a f21347g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public AudioProcessor.a f21348h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public boolean f21349i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    @Nullable
    public w f21350j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public ByteBuffer f21351k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public ShortBuffer f21352l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public ByteBuffer f21353m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public long f21354n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public long f21355o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public boolean f21356p;

    public k() {
        AudioProcessor.a aVar = AudioProcessor.a.f21192e;
        this.f21345e = aVar;
        this.f21346f = aVar;
        this.f21347g = aVar;
        this.f21348h = aVar;
        ByteBuffer byteBuffer = AudioProcessor.f21191a;
        this.f21351k = byteBuffer;
        this.f21352l = byteBuffer.asShortBuffer();
        this.f21353m = byteBuffer;
        this.f21342b = -1;
    }

    @Override // com.google.android.exoplayer2.audio.AudioProcessor
    public AudioProcessor.a a(AudioProcessor.a aVar) throws AudioProcessor.UnhandledAudioFormatException {
        if (aVar.f21195c != 2) {
            throw new AudioProcessor.UnhandledAudioFormatException(aVar);
        }
        int i10 = this.f21342b;
        if (i10 == -1) {
            i10 = aVar.f21193a;
        }
        this.f21345e = aVar;
        AudioProcessor.a aVar2 = new AudioProcessor.a(i10, aVar.f21194b, 2);
        this.f21346f = aVar2;
        this.f21349i = true;
        return aVar2;
    }

    public long b(long j10) {
        if (this.f21355o < 1024) {
            return (long) (((double) this.f21343c) * j10);
        }
        long jL = this.f21354n - ((long) ((w) s7.a.e(this.f21350j)).l());
        int i10 = this.f21348h.f21193a;
        int i11 = this.f21347g.f21193a;
        return i10 == i11 ? m0.F0(j10, jL, this.f21355o) : m0.F0(j10, jL * ((long) i10), this.f21355o * ((long) i11));
    }

    public void c(float f10) {
        if (this.f21344d != f10) {
            this.f21344d = f10;
            this.f21349i = true;
        }
    }

    public void d(float f10) {
        if (this.f21343c != f10) {
            this.f21343c = f10;
            this.f21349i = true;
        }
    }

    @Override // com.google.android.exoplayer2.audio.AudioProcessor
    public void flush() {
        if (isActive()) {
            AudioProcessor.a aVar = this.f21345e;
            this.f21347g = aVar;
            AudioProcessor.a aVar2 = this.f21346f;
            this.f21348h = aVar2;
            if (this.f21349i) {
                this.f21350j = new w(aVar.f21193a, aVar.f21194b, this.f21343c, this.f21344d, aVar2.f21193a);
            } else {
                w wVar = this.f21350j;
                if (wVar != null) {
                    wVar.i();
                }
            }
        }
        this.f21353m = AudioProcessor.f21191a;
        this.f21354n = 0L;
        this.f21355o = 0L;
        this.f21356p = false;
    }

    @Override // com.google.android.exoplayer2.audio.AudioProcessor
    public ByteBuffer getOutput() {
        int iK;
        w wVar = this.f21350j;
        if (wVar != null && (iK = wVar.k()) > 0) {
            if (this.f21351k.capacity() < iK) {
                ByteBuffer byteBufferOrder = ByteBuffer.allocateDirect(iK).order(ByteOrder.nativeOrder());
                this.f21351k = byteBufferOrder;
                this.f21352l = byteBufferOrder.asShortBuffer();
            } else {
                this.f21351k.clear();
                this.f21352l.clear();
            }
            wVar.j(this.f21352l);
            this.f21355o += (long) iK;
            this.f21351k.limit(iK);
            this.f21353m = this.f21351k;
        }
        ByteBuffer byteBuffer = this.f21353m;
        this.f21353m = AudioProcessor.f21191a;
        return byteBuffer;
    }

    @Override // com.google.android.exoplayer2.audio.AudioProcessor
    public boolean isActive() {
        return this.f21346f.f21193a != -1 && (Math.abs(this.f21343c - 1.0f) >= 1.0E-4f || Math.abs(this.f21344d - 1.0f) >= 1.0E-4f || this.f21346f.f21193a != this.f21345e.f21193a);
    }

    @Override // com.google.android.exoplayer2.audio.AudioProcessor
    public boolean isEnded() {
        w wVar;
        return this.f21356p && ((wVar = this.f21350j) == null || wVar.k() == 0);
    }

    @Override // com.google.android.exoplayer2.audio.AudioProcessor
    public void queueEndOfStream() {
        w wVar = this.f21350j;
        if (wVar != null) {
            wVar.s();
        }
        this.f21356p = true;
    }

    @Override // com.google.android.exoplayer2.audio.AudioProcessor
    public void queueInput(ByteBuffer byteBuffer) {
        if (byteBuffer.hasRemaining()) {
            w wVar = (w) s7.a.e(this.f21350j);
            ShortBuffer shortBufferAsShortBuffer = byteBuffer.asShortBuffer();
            int iRemaining = byteBuffer.remaining();
            this.f21354n += (long) iRemaining;
            wVar.t(shortBufferAsShortBuffer);
            byteBuffer.position(byteBuffer.position() + iRemaining);
        }
    }

    @Override // com.google.android.exoplayer2.audio.AudioProcessor
    public void reset() {
        this.f21343c = 1.0f;
        this.f21344d = 1.0f;
        AudioProcessor.a aVar = AudioProcessor.a.f21192e;
        this.f21345e = aVar;
        this.f21346f = aVar;
        this.f21347g = aVar;
        this.f21348h = aVar;
        ByteBuffer byteBuffer = AudioProcessor.f21191a;
        this.f21351k = byteBuffer;
        this.f21352l = byteBuffer.asShortBuffer();
        this.f21353m = byteBuffer;
        this.f21342b = -1;
        this.f21349i = false;
        this.f21350j = null;
        this.f21354n = 0L;
        this.f21355o = 0L;
        this.f21356p = false;
    }
}
