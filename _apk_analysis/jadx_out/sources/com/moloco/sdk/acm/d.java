package com.moloco.sdk.acm;

import android.content.Context;
import io.bidmachine.ads.networks.gam_dynamic.GAMConfig;
import java.util.Map;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import tn.p;

/* JADX INFO: loaded from: classes12.dex */
public final class d {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NotNull
    public final String f45739a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @NotNull
    public final String f45740b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @NotNull
    public final Context f45741c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final long f45742d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    @NotNull
    public final Map<String, String> f45743e;

    public d(@NotNull String str, @NotNull String str2, @NotNull Context context, long j10, @NotNull Map<String, String> map) {
        p.k(str, "appId");
        p.k(str2, "postAnalyticsUrl");
        p.k(context, GAMConfig.KEY_CONTEXT);
        p.k(map, "clientOptions");
        this.f45739a = str;
        this.f45740b = str2;
        this.f45741c = context;
        this.f45742d = j10;
        this.f45743e = map;
    }

    @NotNull
    public final String a() {
        return this.f45739a;
    }

    @NotNull
    public final Map<String, String> b() {
        return this.f45743e;
    }

    @NotNull
    public final String c() {
        return this.f45740b;
    }

    public final long d() {
        return this.f45742d;
    }

    public boolean equals(@Nullable Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof d)) {
            return false;
        }
        d dVar = (d) obj;
        return p.f(this.f45739a, dVar.f45739a) && p.f(this.f45740b, dVar.f45740b) && p.f(this.f45741c, dVar.f45741c) && this.f45742d == dVar.f45742d && p.f(this.f45743e, dVar.f45743e);
    }

    @NotNull
    public final Context getContext() {
        return this.f45741c;
    }

    public int hashCode() {
        return (((((((this.f45739a.hashCode() * 31) + this.f45740b.hashCode()) * 31) + this.f45741c.hashCode()) * 31) + Long.hashCode(this.f45742d)) * 31) + this.f45743e.hashCode();
    }

    @NotNull
    public String toString() {
        return "InitConfig(appId=" + this.f45739a + ", postAnalyticsUrl=" + this.f45740b + ", context=" + this.f45741c + ", requestPeriodSeconds=" + this.f45742d + ", clientOptions=" + this.f45743e + ')';
    }
}
