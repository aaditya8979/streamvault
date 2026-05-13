package com.fyber.inneractive.sdk.player.exoplayer2.upstream;

import java.util.Arrays;

/* JADX INFO: loaded from: classes11.dex */
public final class l implements b {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public int f18703b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public int f18704c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public int f18705d = 0;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public a[] f18706e = new a[100];

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final a[] f18702a = new a[1];

    public final synchronized void a() {
        int i10 = this.f18703b;
        int i11 = com.fyber.inneractive.sdk.player.exoplayer2.util.z.f18822a;
        int iMax = Math.max(0, ((i10 + 65535) / 65536) - this.f18704c);
        int i12 = this.f18705d;
        if (iMax >= i12) {
            return;
        }
        Arrays.fill(this.f18706e, iMax, i12, (Object) null);
        this.f18705d = iMax;
    }

    public final synchronized void a(int i10) {
        boolean z10 = i10 < this.f18703b;
        this.f18703b = i10;
        if (z10) {
            a();
        }
    }

    public final synchronized void a(a[] aVarArr) {
        int i10 = this.f18705d;
        int length = aVarArr.length + i10;
        a[] aVarArr2 = this.f18706e;
        if (length >= aVarArr2.length) {
            this.f18706e = (a[]) Arrays.copyOf(aVarArr2, Math.max(aVarArr2.length * 2, i10 + aVarArr.length));
        }
        for (a aVar : aVarArr) {
            byte[] bArr = aVar.f18601a;
            if (bArr != null && bArr.length != 65536) {
                throw new IllegalArgumentException();
            }
            a[] aVarArr3 = this.f18706e;
            int i11 = this.f18705d;
            this.f18705d = i11 + 1;
            aVarArr3[i11] = aVar;
        }
        this.f18704c -= aVarArr.length;
        notifyAll();
    }
}
