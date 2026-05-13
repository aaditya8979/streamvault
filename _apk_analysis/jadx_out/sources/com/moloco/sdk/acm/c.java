package com.moloco.sdk.acm;

import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import tn.p;

/* JADX INFO: loaded from: classes12.dex */
public final class c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NotNull
    public final String f45737a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @NotNull
    public final String f45738b;

    public c(@NotNull String str, @NotNull String str2) {
        p.k(str, "key");
        p.k(str2, "value");
        this.f45737a = str;
        this.f45738b = str2;
    }

    @NotNull
    public final String a() {
        return this.f45737a;
    }

    @NotNull
    public final String b() {
        return this.f45738b;
    }

    public boolean equals(@Nullable Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof c)) {
            return false;
        }
        c cVar = (c) obj;
        return p.f(this.f45737a, cVar.f45737a) && p.f(this.f45738b, cVar.f45738b);
    }

    public int hashCode() {
        return (this.f45737a.hashCode() * 31) + this.f45738b.hashCode();
    }

    @NotNull
    public String toString() {
        return "EventTag(key=" + this.f45737a + ", value=" + this.f45738b + ')';
    }
}
