package com.fyber.inneractive.sdk.player.exoplayer2.extractor;

import com.fyber.inneractive.sdk.player.exoplayer2.util.z;

/* JADX INFO: loaded from: classes3.dex */
public final class a implements q {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final long[] f17395a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final long[] f17396b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final long f17397c;

    public a(int[] iArr, long[] jArr, long[] jArr2, long[] jArr3) {
        this.f17395a = jArr;
        this.f17396b = jArr3;
        int length = iArr.length;
        if (length <= 0) {
            this.f17397c = 0L;
        } else {
            int i10 = length - 1;
            this.f17397c = jArr2[i10] + jArr3[i10];
        }
    }

    @Override // com.fyber.inneractive.sdk.player.exoplayer2.extractor.q
    public final long a(long j10) {
        return this.f17395a[z.a(this.f17396b, j10, true)];
    }

    @Override // com.fyber.inneractive.sdk.player.exoplayer2.extractor.q
    public final boolean a() {
        return true;
    }

    @Override // com.fyber.inneractive.sdk.player.exoplayer2.extractor.q
    public final long c() {
        return this.f17397c;
    }
}
