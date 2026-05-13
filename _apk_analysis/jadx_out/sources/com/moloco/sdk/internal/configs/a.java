package com.moloco.sdk.internal.configs;

import androidx.compose.runtime.internal.StabilityInferred;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import tn.p;

/* JADX INFO: loaded from: classes3.dex */
@StabilityInferred(parameters = 1)
public final class a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NotNull
    public final String f46003a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final int f46004b;

    public a(@NotNull String str, int i10) {
        p.k(str, "reportingUrl");
        this.f46003a = str;
        this.f46004b = i10;
    }

    public final int a() {
        return this.f46004b;
    }

    @NotNull
    public final String b() {
        return this.f46003a;
    }

    public boolean equals(@Nullable Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof a)) {
            return false;
        }
        a aVar = (a) obj;
        return p.f(this.f46003a, aVar.f46003a) && this.f46004b == aVar.f46004b;
    }

    public int hashCode() {
        return (this.f46003a.hashCode() * 31) + Integer.hashCode(this.f46004b);
    }

    @NotNull
    public String toString() {
        return "OperationalMetricsConfig(reportingUrl=" + this.f46003a + ", pollingIntervalSeconds=" + this.f46004b + ')';
    }
}
