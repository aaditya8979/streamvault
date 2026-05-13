package com.moloco.sdk.internal.services.events;

import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import tn.p;

/* JADX INFO: loaded from: classes7.dex */
public final class e {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final boolean f47407a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final boolean f47408b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @NotNull
    public final String f47409c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    @NotNull
    public final String f47410d;

    public e(boolean z10, boolean z11, @NotNull String str, @NotNull String str2) {
        p.k(str, "appForegroundUrl");
        p.k(str2, "appBackgroundUrl");
        this.f47407a = z10;
        this.f47408b = z11;
        this.f47409c = str;
        this.f47410d = str2;
    }

    @NotNull
    public final String a() {
        return this.f47410d;
    }

    @NotNull
    public final String b() {
        return this.f47409c;
    }

    public final boolean c() {
        return this.f47407a;
    }

    public final boolean d() {
        return this.f47408b;
    }

    public boolean equals(@Nullable Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof e)) {
            return false;
        }
        e eVar = (e) obj;
        return this.f47407a == eVar.f47407a && this.f47408b == eVar.f47408b && p.f(this.f47409c, eVar.f47409c) && p.f(this.f47410d, eVar.f47410d);
    }

    public int hashCode() {
        return (((((Boolean.hashCode(this.f47407a) * 31) + Boolean.hashCode(this.f47408b)) * 31) + this.f47409c.hashCode()) * 31) + this.f47410d.hashCode();
    }

    @NotNull
    public String toString() {
        return "UserEventConfig(eventReportingEnabled=" + this.f47407a + ", userTrackingEnabled=" + this.f47408b + ", appForegroundUrl=" + this.f47409c + ", appBackgroundUrl=" + this.f47410d + ')';
    }
}
