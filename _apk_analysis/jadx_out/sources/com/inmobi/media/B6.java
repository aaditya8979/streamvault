package com.inmobi.media;

/* JADX INFO: loaded from: classes7.dex */
public final class B6 extends C6 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final C3542kl f25202a;

    public B6() {
        this.f25202a = null;
    }

    public B6(C3542kl c3542kl) {
        this.f25202a = c3542kl;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof B6) && tn.p.f(this.f25202a, ((B6) obj).f25202a);
    }

    public final int hashCode() {
        C3542kl c3542kl = this.f25202a;
        if (c3542kl == null) {
            return 0;
        }
        return c3542kl.hashCode();
    }

    public final String toString() {
        return "UnAvailable(vastBeaconData=" + this.f25202a + ")";
    }
}
