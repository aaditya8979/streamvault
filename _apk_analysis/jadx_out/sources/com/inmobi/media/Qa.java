package com.inmobi.media;

/* JADX INFO: loaded from: classes9.dex */
public final class Qa extends Sa {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int f26176a;

    public Qa(int i10) {
        this.f26176a = i10;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof Qa) && this.f26176a == ((Qa) obj).f26176a;
    }

    public final int hashCode() {
        return Integer.hashCode(this.f26176a);
    }

    public final String toString() {
        return "InValid(errorCode=" + this.f26176a + ")";
    }
}
