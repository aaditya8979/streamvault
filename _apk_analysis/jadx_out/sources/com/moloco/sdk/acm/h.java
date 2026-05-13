package com.moloco.sdk.acm;

import java.util.Map;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import tn.p;

/* JADX INFO: loaded from: classes12.dex */
public final class h {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NotNull
    public final String f45848a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @NotNull
    public String f45849b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public long f45850c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    @NotNull
    public final Map<String, String> f45851d;

    public h(@NotNull String str, @NotNull String str2, long j10, @NotNull Map<String, String> map) {
        p.k(str, "appId");
        p.k(str2, "postAnalyticsUrl");
        p.k(map, "clientOptions");
        this.f45848a = str;
        this.f45849b = str2;
        this.f45850c = j10;
        this.f45851d = map;
    }

    public final void a(long j10) {
        this.f45850c = j10;
    }

    public final void b(@NotNull String str) {
        p.k(str, "<set-?>");
        this.f45849b = str;
    }

    @NotNull
    public final Map<String, String> c() {
        return this.f45851d;
    }

    @NotNull
    public final String d() {
        return this.f45849b;
    }

    public final long e() {
        return this.f45850c;
    }

    public boolean equals(@Nullable Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof h)) {
            return false;
        }
        h hVar = (h) obj;
        return p.f(this.f45848a, hVar.f45848a) && p.f(this.f45849b, hVar.f45849b) && this.f45850c == hVar.f45850c && p.f(this.f45851d, hVar.f45851d);
    }

    public int hashCode() {
        return (((((this.f45848a.hashCode() * 31) + this.f45849b.hashCode()) * 31) + Long.hashCode(this.f45850c)) * 31) + this.f45851d.hashCode();
    }

    @NotNull
    public String toString() {
        return "ACMConfig(appId=" + this.f45848a + ", postAnalyticsUrl=" + this.f45849b + ", requestPeriodSeconds=" + this.f45850c + ", clientOptions=" + this.f45851d + ')';
    }
}
