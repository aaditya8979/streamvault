package com.fyber.inneractive.sdk.player.exoplayer2.extractor.ogg;

/* JADX INFO: loaded from: classes2.dex */
public final class m {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final byte[] f18023a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final int f18024b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public int f18025c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public int f18026d;

    public m(byte[] bArr) {
        this.f18023a = bArr;
        this.f18024b = bArr.length;
    }

    public final int a(int i10) {
        int i11 = this.f18025c;
        int iMin = Math.min(i10, 8 - this.f18026d);
        int i12 = i11 + 1;
        int i13 = ((this.f18023a[i11] & 255) >> this.f18026d) & (255 >> (8 - iMin));
        while (iMin < i10) {
            i13 |= (this.f18023a[i12] & 255) << iMin;
            iMin += 8;
            i12++;
        }
        int i14 = i13 & ((-1) >>> (32 - i10));
        b(i10);
        return i14;
    }

    public final boolean a() {
        boolean z10 = (((this.f18023a[this.f18025c] & 255) >> this.f18026d) & 1) == 1;
        b(1);
        return z10;
    }

    public final void b(int i10) {
        int i11 = i10 / 8;
        int i12 = this.f18025c + i11;
        this.f18025c = i12;
        int i13 = (i10 - (i11 * 8)) + this.f18026d;
        this.f18026d = i13;
        if (i13 > 7) {
            this.f18025c = i12 + 1;
            this.f18026d = i13 - 8;
        }
        int i14 = this.f18025c;
        if (i14 >= 0) {
            int i15 = this.f18024b;
            if (i14 < i15) {
                return;
            }
            if (i14 == i15 && this.f18026d == 0) {
                return;
            }
        }
        throw new IllegalStateException();
    }
}
