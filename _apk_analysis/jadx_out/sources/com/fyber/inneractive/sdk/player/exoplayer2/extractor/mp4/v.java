package com.fyber.inneractive.sdk.player.exoplayer2.extractor.mp4;

/* JADX INFO: loaded from: classes2.dex */
public final class v {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int f17950a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final long[] f17951b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final int[] f17952c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final int f17953d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final long[] f17954e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final int[] f17955f;

    public v(long[] jArr, int[] iArr, int i10, long[] jArr2, int[] iArr2) {
        if (iArr.length != jArr2.length) {
            throw new IllegalArgumentException();
        }
        if (jArr.length != jArr2.length) {
            throw new IllegalArgumentException();
        }
        if (iArr2.length != jArr2.length) {
            throw new IllegalArgumentException();
        }
        this.f17951b = jArr;
        this.f17952c = iArr;
        this.f17953d = i10;
        this.f17954e = jArr2;
        this.f17955f = iArr2;
        this.f17950a = jArr.length;
    }
}
