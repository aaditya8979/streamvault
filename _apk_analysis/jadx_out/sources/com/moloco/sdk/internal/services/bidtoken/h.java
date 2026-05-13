package com.moloco.sdk.internal.services.bidtoken;

import androidx.compose.runtime.internal.StabilityInferred;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes3.dex */
@StabilityInferred(parameters = 1)
public final class h {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final boolean f47159a;

    public h(boolean z10) {
        this.f47159a = z10;
    }

    public final boolean a() {
        return this.f47159a;
    }

    public boolean equals(@Nullable Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof h) && this.f47159a == ((h) obj).f47159a;
    }

    public int hashCode() {
        return Boolean.hashCode(this.f47159a);
    }

    @NotNull
    public String toString() {
        return "BidTokenConfig(dbtEnabled=" + this.f47159a + ')';
    }
}
