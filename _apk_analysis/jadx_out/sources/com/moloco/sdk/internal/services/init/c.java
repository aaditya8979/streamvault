package com.moloco.sdk.internal.services.init;

import androidx.compose.runtime.internal.StabilityInferred;
import com.moloco.sdk.Init$SDKInitResponse;
import com.moloco.sdk.internal.g0;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import tn.p;

/* JADX INFO: loaded from: classes10.dex */
@StabilityInferred(parameters = 1)
public final class c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NotNull
    public final g0<Init$SDKInitResponse, i> f47444a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @NotNull
    public final String f47445b;

    public c(@NotNull g0<Init$SDKInitResponse, i> g0Var, @NotNull String str) {
        p.k(g0Var, "sdkInitResult");
        p.k(str, "fetchType");
        this.f47444a = g0Var;
        this.f47445b = str;
    }

    @NotNull
    public final String a() {
        return this.f47445b;
    }

    @NotNull
    public final g0<Init$SDKInitResponse, i> b() {
        return this.f47444a;
    }

    public boolean equals(@Nullable Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof c)) {
            return false;
        }
        c cVar = (c) obj;
        return p.f(this.f47444a, cVar.f47444a) && p.f(this.f47445b, cVar.f47445b);
    }

    public int hashCode() {
        return (this.f47444a.hashCode() * 31) + this.f47445b.hashCode();
    }

    @NotNull
    public String toString() {
        return "FetchState(sdkInitResult=" + this.f47444a + ", fetchType=" + this.f47445b + ')';
    }
}
