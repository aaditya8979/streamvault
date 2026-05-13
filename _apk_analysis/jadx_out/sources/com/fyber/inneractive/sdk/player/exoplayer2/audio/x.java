package com.fyber.inneractive.sdk.player.exoplayer2.audio;

import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.nio.ShortBuffer;

/* JADX INFO: loaded from: classes8.dex */
public final class x implements c {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public w f17354d;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public ByteBuffer f17357g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public ShortBuffer f17358h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public ByteBuffer f17359i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public long f17360j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public long f17361k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public boolean f17362l;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public float f17355e = 1.0f;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public float f17356f = 1.0f;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public int f17352b = -1;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public int f17353c = -1;

    public x() {
        ByteBuffer byteBuffer = c.f17246a;
        this.f17357g = byteBuffer;
        this.f17358h = byteBuffer.asShortBuffer();
        this.f17359i = byteBuffer;
    }

    @Override // com.fyber.inneractive.sdk.player.exoplayer2.audio.c
    public final ByteBuffer a() {
        ByteBuffer byteBuffer = this.f17359i;
        this.f17359i = c.f17246a;
        return byteBuffer;
    }

    @Override // com.fyber.inneractive.sdk.player.exoplayer2.audio.c
    public final void a(ByteBuffer byteBuffer) {
        if (byteBuffer.hasRemaining()) {
            ShortBuffer shortBufferAsShortBuffer = byteBuffer.asShortBuffer();
            int iRemaining = byteBuffer.remaining();
            this.f17360j += (long) iRemaining;
            w wVar = this.f17354d;
            wVar.getClass();
            int iRemaining2 = shortBufferAsShortBuffer.remaining();
            int i10 = wVar.f17329b;
            int i11 = iRemaining2 / i10;
            wVar.a(i11);
            shortBufferAsShortBuffer.get(wVar.f17335h, wVar.f17344q * wVar.f17329b, ((i10 * i11) * 2) / 2);
            wVar.f17344q += i11;
            wVar.a();
            byteBuffer.position(byteBuffer.position() + iRemaining);
        }
        int i12 = this.f17354d.f17345r * this.f17352b * 2;
        if (i12 > 0) {
            if (this.f17357g.capacity() < i12) {
                ByteBuffer byteBufferOrder = ByteBuffer.allocateDirect(i12).order(ByteOrder.nativeOrder());
                this.f17357g = byteBufferOrder;
                this.f17358h = byteBufferOrder.asShortBuffer();
            } else {
                this.f17357g.clear();
                this.f17358h.clear();
            }
            w wVar2 = this.f17354d;
            ShortBuffer shortBuffer = this.f17358h;
            wVar2.getClass();
            int iMin = Math.min(shortBuffer.remaining() / wVar2.f17329b, wVar2.f17345r);
            shortBuffer.put(wVar2.f17337j, 0, wVar2.f17329b * iMin);
            int i13 = wVar2.f17345r - iMin;
            wVar2.f17345r = i13;
            short[] sArr = wVar2.f17337j;
            int i14 = wVar2.f17329b;
            System.arraycopy(sArr, iMin * i14, sArr, 0, i13 * i14);
            this.f17361k += (long) i12;
            this.f17357g.limit(i12);
            this.f17359i = this.f17357g;
        }
    }

    @Override // com.fyber.inneractive.sdk.player.exoplayer2.audio.c
    public final boolean a(int i10, int i11, int i12) throws b {
        if (i12 != 2) {
            throw new b(i10, i11, i12);
        }
        if (this.f17353c == i10 && this.f17352b == i11) {
            return false;
        }
        this.f17353c = i10;
        this.f17352b = i11;
        return true;
    }

    @Override // com.fyber.inneractive.sdk.player.exoplayer2.audio.c
    public final void b() {
        int i10;
        w wVar = this.f17354d;
        int i11 = wVar.f17344q;
        float f10 = wVar.f17342o;
        float f11 = wVar.f17343p;
        int i12 = wVar.f17345r + ((int) ((((i11 / (f10 / f11)) + wVar.f17346s) / f11) + 0.5f));
        wVar.a((wVar.f17332e * 2) + i11);
        int i13 = 0;
        while (true) {
            i10 = wVar.f17332e * 2;
            int i14 = wVar.f17329b;
            if (i13 >= i10 * i14) {
                break;
            }
            wVar.f17335h[(i14 * i11) + i13] = 0;
            i13++;
        }
        wVar.f17344q = i10 + wVar.f17344q;
        wVar.a();
        if (wVar.f17345r > i12) {
            wVar.f17345r = i12;
        }
        wVar.f17344q = 0;
        wVar.f17347t = 0;
        wVar.f17346s = 0;
        this.f17362l = true;
    }

    @Override // com.fyber.inneractive.sdk.player.exoplayer2.audio.c
    public final boolean c() {
        w wVar;
        return this.f17362l && ((wVar = this.f17354d) == null || wVar.f17345r == 0);
    }

    @Override // com.fyber.inneractive.sdk.player.exoplayer2.audio.c
    public final boolean d() {
        return Math.abs(this.f17355e - 1.0f) >= 0.01f || Math.abs(this.f17356f - 1.0f) >= 0.01f;
    }

    @Override // com.fyber.inneractive.sdk.player.exoplayer2.audio.c
    public final int e() {
        return this.f17352b;
    }

    @Override // com.fyber.inneractive.sdk.player.exoplayer2.audio.c
    public final void f() {
        this.f17354d = null;
        ByteBuffer byteBuffer = c.f17246a;
        this.f17357g = byteBuffer;
        this.f17358h = byteBuffer.asShortBuffer();
        this.f17359i = byteBuffer;
        this.f17352b = -1;
        this.f17353c = -1;
        this.f17360j = 0L;
        this.f17361k = 0L;
        this.f17362l = false;
    }

    @Override // com.fyber.inneractive.sdk.player.exoplayer2.audio.c
    public final void flush() {
        w wVar = new w(this.f17353c, this.f17352b);
        this.f17354d = wVar;
        wVar.f17342o = this.f17355e;
        wVar.f17343p = this.f17356f;
        this.f17359i = c.f17246a;
        this.f17360j = 0L;
        this.f17361k = 0L;
        this.f17362l = false;
    }
}
