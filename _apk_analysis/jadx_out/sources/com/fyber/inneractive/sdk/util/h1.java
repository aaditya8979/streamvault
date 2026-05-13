package com.fyber.inneractive.sdk.util;

/* JADX INFO: loaded from: classes5.dex */
public final class h1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public int f19532a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public int f19533b;

    public h1(int i10, int i11) {
        this.f19532a = i10;
        this.f19533b = i11;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || h1.class != obj.getClass()) {
            return false;
        }
        h1 h1Var = (h1) obj;
        return this.f19532a == h1Var.f19532a && this.f19533b == h1Var.f19533b;
    }

    public final int hashCode() {
        return (this.f19532a * 31) + this.f19533b;
    }
}
