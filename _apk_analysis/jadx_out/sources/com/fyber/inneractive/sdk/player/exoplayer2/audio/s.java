package com.fyber.inneractive.sdk.player.exoplayer2.audio;

import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.util.Arrays;

/* JADX INFO: loaded from: classes8.dex */
public final class s implements c {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public int f17310b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public int f17311c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public int[] f17312d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public boolean f17313e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public int[] f17314f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public ByteBuffer f17315g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public ByteBuffer f17316h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public boolean f17317i;

    public s() {
        ByteBuffer byteBuffer = c.f17246a;
        this.f17315g = byteBuffer;
        this.f17316h = byteBuffer;
        this.f17310b = -1;
        this.f17311c = -1;
    }

    @Override // com.fyber.inneractive.sdk.player.exoplayer2.audio.c
    public final ByteBuffer a() {
        ByteBuffer byteBuffer = this.f17316h;
        this.f17316h = c.f17246a;
        return byteBuffer;
    }

    @Override // com.fyber.inneractive.sdk.player.exoplayer2.audio.c
    public final void a(ByteBuffer byteBuffer) {
        int iPosition = byteBuffer.position();
        int iLimit = byteBuffer.limit();
        int length = ((iLimit - iPosition) / (this.f17310b * 2)) * this.f17314f.length * 2;
        if (this.f17315g.capacity() < length) {
            this.f17315g = ByteBuffer.allocateDirect(length).order(ByteOrder.nativeOrder());
        } else {
            this.f17315g.clear();
        }
        while (iPosition < iLimit) {
            for (int i10 : this.f17314f) {
                this.f17315g.putShort(byteBuffer.getShort((i10 * 2) + iPosition));
            }
            iPosition += this.f17310b * 2;
        }
        byteBuffer.position(iLimit);
        this.f17315g.flip();
        this.f17316h = this.f17315g;
    }

    @Override // com.fyber.inneractive.sdk.player.exoplayer2.audio.c
    public final boolean a(int i10, int i11, int i12) throws b {
        boolean z10 = !Arrays.equals(this.f17312d, this.f17314f);
        int[] iArr = this.f17312d;
        this.f17314f = iArr;
        if (iArr == null) {
            this.f17313e = false;
            return z10;
        }
        if (i12 != 2) {
            throw new b(i10, i11, i12);
        }
        if (!z10 && this.f17311c == i10 && this.f17310b == i11) {
            return false;
        }
        this.f17311c = i10;
        this.f17310b = i11;
        this.f17313e = i11 != iArr.length;
        int i13 = 0;
        while (true) {
            int[] iArr2 = this.f17314f;
            if (i13 >= iArr2.length) {
                return true;
            }
            int i14 = iArr2[i13];
            if (i14 >= i11) {
                throw new b(i10, i11, i12);
            }
            this.f17313e = (i14 != i13) | this.f17313e;
            i13++;
        }
    }

    @Override // com.fyber.inneractive.sdk.player.exoplayer2.audio.c
    public final void b() {
        this.f17317i = true;
    }

    @Override // com.fyber.inneractive.sdk.player.exoplayer2.audio.c
    public final boolean c() {
        return this.f17317i && this.f17316h == c.f17246a;
    }

    @Override // com.fyber.inneractive.sdk.player.exoplayer2.audio.c
    public final boolean d() {
        return this.f17313e;
    }

    @Override // com.fyber.inneractive.sdk.player.exoplayer2.audio.c
    public final int e() {
        int[] iArr = this.f17314f;
        return iArr == null ? this.f17310b : iArr.length;
    }

    @Override // com.fyber.inneractive.sdk.player.exoplayer2.audio.c
    public final void f() {
        ByteBuffer byteBuffer = c.f17246a;
        this.f17316h = byteBuffer;
        this.f17317i = false;
        this.f17315g = byteBuffer;
        this.f17310b = -1;
        this.f17311c = -1;
        this.f17314f = null;
        this.f17313e = false;
    }

    @Override // com.fyber.inneractive.sdk.player.exoplayer2.audio.c
    public final void flush() {
        this.f17316h = c.f17246a;
        this.f17317i = false;
    }
}
