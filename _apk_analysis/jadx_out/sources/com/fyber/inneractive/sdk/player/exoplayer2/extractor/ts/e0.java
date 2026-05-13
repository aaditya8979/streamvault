package com.fyber.inneractive.sdk.player.exoplayer2.extractor.ts;

/* JADX INFO: loaded from: classes3.dex */
public final class e0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f18110a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final int f18111b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final int f18112c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public int f18113d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public String f18114e;

    public e0(int i10, int i11, int i12) {
        String str;
        if (i10 != Integer.MIN_VALUE) {
            str = i10 + "/";
        } else {
            str = "";
        }
        this.f18110a = str;
        this.f18111b = i11;
        this.f18112c = i12;
        this.f18113d = Integer.MIN_VALUE;
    }

    public final void a() {
        int i10 = this.f18113d;
        this.f18113d = i10 == Integer.MIN_VALUE ? this.f18111b : i10 + this.f18112c;
        this.f18114e = this.f18110a + this.f18113d;
    }

    public final void b() {
        if (this.f18113d == Integer.MIN_VALUE) {
            throw new IllegalStateException("generateNewId() must be called before retrieving ids.");
        }
    }
}
