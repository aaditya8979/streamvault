package com.moloco.sdk.acm;

import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import tn.p;

/* JADX INFO: loaded from: classes12.dex */
public final class g {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @Nullable
    public final String f45846a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @Nullable
    public final Long f45847b;

    /* JADX WARN: Multi-variable type inference failed */
    public g() {
        this(null, 0 == true ? 1 : 0, 3, 0 == true ? 1 : 0);
    }

    public g(@Nullable String str, @Nullable Long l10) {
        this.f45846a = str;
        this.f45847b = l10;
    }

    public /* synthetic */ g(String str, Long l10, int i10, tn.i iVar) {
        this((i10 & 1) != 0 ? null : str, (i10 & 2) != 0 ? null : l10);
    }

    @Nullable
    public final String a() {
        return this.f45846a;
    }

    @Nullable
    public final Long b() {
        return this.f45847b;
    }

    public boolean equals(@Nullable Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof g)) {
            return false;
        }
        g gVar = (g) obj;
        return p.f(this.f45846a, gVar.f45846a) && p.f(this.f45847b, gVar.f45847b);
    }

    public int hashCode() {
        String str = this.f45846a;
        int iHashCode = (str == null ? 0 : str.hashCode()) * 31;
        Long l10 = this.f45847b;
        return iHashCode + (l10 != null ? l10.hashCode() : 0);
    }

    @NotNull
    public String toString() {
        return "UpdateConfig(postAnalyticsUrl=" + this.f45846a + ", requestPeriodSeconds=" + this.f45847b + ')';
    }
}
