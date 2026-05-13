package com.fyber.inneractive.sdk.player.exoplayer2.util;

import java.util.Arrays;

/* JADX INFO: loaded from: classes4.dex */
public final class g {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public int f18772a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public long[] f18773b = new long[32];

    public final void a(long j10) {
        int i10 = this.f18772a;
        long[] jArr = this.f18773b;
        if (i10 == jArr.length) {
            this.f18773b = Arrays.copyOf(jArr, i10 * 2);
        }
        long[] jArr2 = this.f18773b;
        int i11 = this.f18772a;
        this.f18772a = i11 + 1;
        jArr2[i11] = j10;
    }
}
