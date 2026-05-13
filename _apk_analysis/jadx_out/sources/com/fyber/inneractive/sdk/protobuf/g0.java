package com.fyber.inneractive.sdk.protobuf;

/* JADX INFO: loaded from: classes5.dex */
public final class g0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Object f19135a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final int f19136b;

    public g0(int i10, Object obj) {
        this.f19135a = obj;
        this.f19136b = i10;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof g0)) {
            return false;
        }
        g0 g0Var = (g0) obj;
        return this.f19135a == g0Var.f19135a && this.f19136b == g0Var.f19136b;
    }

    public final int hashCode() {
        return (System.identityHashCode(this.f19135a) * 65535) + this.f19136b;
    }
}
