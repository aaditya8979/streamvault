package com.fyber.inneractive.sdk.network;

/* JADX INFO: loaded from: classes4.dex */
public class k1 extends Exception {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int f16987a;

    public k1(String str, int i10) {
        super(str);
        this.f16987a = i10;
    }

    @Override // java.lang.Throwable
    public final String toString() {
        return String.valueOf(this.f16987a);
    }
}
