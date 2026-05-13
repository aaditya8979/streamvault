package com.mbridge.msdk.thrid.okhttp.internal.http2;

import java.util.Arrays;

/* JADX INFO: compiled from: Settings.java */
/* JADX INFO: loaded from: classes9.dex */
public final class m {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private int f40622a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final int[] f40623b = new int[10];

    public int a(int i10) {
        return this.f40623b[i10];
    }

    public m a(int i10, int i11) {
        if (i10 >= 0) {
            int[] iArr = this.f40623b;
            if (i10 < iArr.length) {
                this.f40622a = (1 << i10) | this.f40622a;
                iArr[i10] = i11;
            }
        }
        return this;
    }

    public void a() {
        this.f40622a = 0;
        Arrays.fill(this.f40623b, 0);
    }

    public void a(m mVar) {
        for (int i10 = 0; i10 < 10; i10++) {
            if (mVar.d(i10)) {
                a(i10, mVar.a(i10));
            }
        }
    }

    public int b() {
        if ((this.f40622a & 2) != 0) {
            return this.f40623b[1];
        }
        return -1;
    }

    public int b(int i10) {
        return (this.f40622a & 16) != 0 ? this.f40623b[4] : i10;
    }

    public int c() {
        if ((this.f40622a & 128) != 0) {
            return this.f40623b[7];
        }
        return 65535;
    }

    public int c(int i10) {
        return (this.f40622a & 32) != 0 ? this.f40623b[5] : i10;
    }

    public int d() {
        return Integer.bitCount(this.f40622a);
    }

    public boolean d(int i10) {
        return ((1 << i10) & this.f40622a) != 0;
    }
}
