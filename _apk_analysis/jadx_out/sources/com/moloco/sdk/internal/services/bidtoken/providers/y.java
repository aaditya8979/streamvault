package com.moloco.sdk.internal.services.bidtoken.providers;

import androidx.compose.runtime.internal.StabilityInferred;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes4.dex */
@StabilityInferred(parameters = 1)
public final class y {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @Nullable
    public final String f47281a;

    public y(@Nullable String str) {
        this.f47281a = str;
    }

    @Nullable
    public final String a() {
        return this.f47281a;
    }

    public boolean equals(@Nullable Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof y) && tn.p.f(this.f47281a, ((y) obj).f47281a);
    }

    public int hashCode() {
        String str = this.f47281a;
        if (str == null) {
            return 0;
        }
        return str.hashCode();
    }

    @NotNull
    public String toString() {
        return "TestConfigSignal(configJson=" + this.f47281a + ')';
    }
}
