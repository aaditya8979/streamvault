package com.google.android.exoplayer.audio;

import a6.k0;
import androidx.annotation.Nullable;
import com.google.android.exoplayer.audio.AudioProcessor;
import g4.o;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.nio.ShortBuffer;

/* JADX INFO: compiled from: SonicAudioProcessor.java */
/* JADX INFO: loaded from: classes2.dex */
public final class i implements AudioProcessor {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public int f20053b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public float f20054c = 1.0f;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public float f20055d = 1.0f;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public AudioProcessor.a f20056e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public AudioProcessor.a f20057f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public AudioProcessor.a f20058g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public AudioProcessor.a f20059h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public boolean f20060i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    @Nullable
    public o f20061j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public ByteBuffer f20062k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public ShortBuffer f20063l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public ByteBuffer f20064m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public long f20065n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public long f20066o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public boolean f20067p;

    public i() {
        AudioProcessor.a aVar = AudioProcessor.a.f19945e;
        this.f20056e = aVar;
        this.f20057f = aVar;
        this.f20058g = aVar;
        this.f20059h = aVar;
        ByteBuffer byteBuffer = AudioProcessor.f19944a;
        this.f20062k = byteBuffer;
        this.f20063l = byteBuffer.asShortBuffer();
        this.f20064m = byteBuffer;
        this.f20053b = -1;
    }

    @Override // com.google.android.exoplayer.audio.AudioProcessor
    public AudioProcessor.a a(AudioProcessor.a aVar) throws AudioProcessor.UnhandledAudioFormatException {
        if (aVar.f19948c != 2) {
            throw new AudioProcessor.UnhandledAudioFormatException(aVar);
        }
        int i10 = this.f20053b;
        if (i10 == -1) {
            i10 = aVar.f19946a;
        }
        this.f20056e = aVar;
        AudioProcessor.a aVar2 = new AudioProcessor.a(i10, aVar.f19947b, 2);
        this.f20057f = aVar2;
        this.f20060i = true;
        return aVar2;
    }

    public long b(long j10) {
        long j11 = this.f20066o;
        if (j11 < 1024) {
            return (long) (((double) this.f20054c) * j10);
        }
        int i10 = this.f20059h.f19946a;
        int i11 = this.f20058g.f19946a;
        return i10 == i11 ? k0.y0(j10, this.f20065n, j11) : k0.y0(j10, this.f20065n * ((long) i10), j11 * ((long) i11));
    }

    public float c(float f10) {
        float fP = k0.p(f10, 0.1f, 8.0f);
        if (this.f20055d != fP) {
            this.f20055d = fP;
            this.f20060i = true;
        }
        return fP;
    }

    public float d(float f10) {
        float fP = k0.p(f10, 0.1f, 8.0f);
        if (this.f20054c != fP) {
            this.f20054c = fP;
            this.f20060i = true;
        }
        return fP;
    }

    @Override // com.google.android.exoplayer.audio.AudioProcessor
    public void flush() {
        if (isActive()) {
            AudioProcessor.a aVar = this.f20056e;
            this.f20058g = aVar;
            AudioProcessor.a aVar2 = this.f20057f;
            this.f20059h = aVar2;
            if (this.f20060i) {
                this.f20061j = new o(aVar.f19946a, aVar.f19947b, this.f20054c, this.f20055d, aVar2.f19946a);
            } else {
                o oVar = this.f20061j;
                if (oVar != null) {
                    oVar.i();
                }
            }
        }
        this.f20064m = AudioProcessor.f19944a;
        this.f20065n = 0L;
        this.f20066o = 0L;
        this.f20067p = false;
    }

    @Override // com.google.android.exoplayer.audio.AudioProcessor
    public ByteBuffer getOutput() {
        ByteBuffer byteBuffer = this.f20064m;
        this.f20064m = AudioProcessor.f19944a;
        return byteBuffer;
    }

    @Override // com.google.android.exoplayer.audio.AudioProcessor
    public boolean isActive() {
        return this.f20057f.f19946a != -1 && (Math.abs(this.f20054c - 1.0f) >= 0.01f || Math.abs(this.f20055d - 1.0f) >= 0.01f || this.f20057f.f19946a != this.f20056e.f19946a);
    }

    @Override // com.google.android.exoplayer.audio.AudioProcessor
    public boolean isEnded() {
        o oVar;
        return this.f20067p && ((oVar = this.f20061j) == null || oVar.k() == 0);
    }

    @Override // com.google.android.exoplayer.audio.AudioProcessor
    public void queueEndOfStream() {
        o oVar = this.f20061j;
        if (oVar != null) {
            oVar.r();
        }
        this.f20067p = true;
    }

    @Override // com.google.android.exoplayer.audio.AudioProcessor
    public void queueInput(ByteBuffer byteBuffer) {
        o oVar = (o) a6.a.e(this.f20061j);
        if (byteBuffer.hasRemaining()) {
            ShortBuffer shortBufferAsShortBuffer = byteBuffer.asShortBuffer();
            int iRemaining = byteBuffer.remaining();
            this.f20065n += (long) iRemaining;
            oVar.s(shortBufferAsShortBuffer);
            byteBuffer.position(byteBuffer.position() + iRemaining);
        }
        int iK = oVar.k();
        if (iK > 0) {
            if (this.f20062k.capacity() < iK) {
                ByteBuffer byteBufferOrder = ByteBuffer.allocateDirect(iK).order(ByteOrder.nativeOrder());
                this.f20062k = byteBufferOrder;
                this.f20063l = byteBufferOrder.asShortBuffer();
            } else {
                this.f20062k.clear();
                this.f20063l.clear();
            }
            oVar.j(this.f20063l);
            this.f20066o += (long) iK;
            this.f20062k.limit(iK);
            this.f20064m = this.f20062k;
        }
    }

    @Override // com.google.android.exoplayer.audio.AudioProcessor
    public void reset() {
        this.f20054c = 1.0f;
        this.f20055d = 1.0f;
        AudioProcessor.a aVar = AudioProcessor.a.f19945e;
        this.f20056e = aVar;
        this.f20057f = aVar;
        this.f20058g = aVar;
        this.f20059h = aVar;
        ByteBuffer byteBuffer = AudioProcessor.f19944a;
        this.f20062k = byteBuffer;
        this.f20063l = byteBuffer.asShortBuffer();
        this.f20064m = byteBuffer;
        this.f20053b = -1;
        this.f20060i = false;
        this.f20061j = null;
        this.f20065n = 0L;
        this.f20066o = 0L;
        this.f20067p = false;
    }
}
