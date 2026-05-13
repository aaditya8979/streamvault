package io.appmetrica.analytics.impl;

/* JADX INFO: loaded from: classes4.dex */
public final class Dm {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int f65166a;

    public Dm(int i10) {
        this.f65166a = i10;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof Dm) && this.f65166a == ((Dm) obj).f65166a;
    }

    public final int hashCode() {
        return Integer.hashCode(this.f65166a);
    }

    public final String toString() {
        return "StartupUpdateConfig(intervalSeconds=" + this.f65166a + ')';
    }
}
