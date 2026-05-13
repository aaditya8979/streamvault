package com.moloco.sdk.internal.services.init;

import androidx.compose.runtime.internal.StabilityInferred;
import cn.w;
import java.util.List;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import tn.p;

/* JADX INFO: loaded from: classes10.dex */
@StabilityInferred(parameters = 1)
public final class a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NotNull
    public final String f47435a;

    public a(@NotNull String str) {
        p.k(str, "appKey");
        this.f47435a = str;
    }

    @NotNull
    public final String a() {
        return this.f47435a;
    }

    @NotNull
    public final String b() {
        return this.f47435a + "___v1";
    }

    @NotNull
    public final List<String> c() {
        return w.m();
    }

    public boolean equals(@Nullable Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof a) && p.f(this.f47435a, ((a) obj).f47435a);
    }

    public int hashCode() {
        return this.f47435a.hashCode();
    }

    @NotNull
    public String toString() {
        return "CacheKey(appKey=" + this.f47435a + ')';
    }
}
