package com.moloco.sdk.internal.services.bidtoken.providers;

import androidx.compose.runtime.internal.StabilityInferred;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes4.dex */
@StabilityInferred(parameters = 1)
public final class d {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @Nullable
    public final Long f47206a;

    public d(@Nullable Long l10) {
        this.f47206a = l10;
    }

    @Nullable
    public final Long a() {
        return this.f47206a;
    }

    public boolean equals(@Nullable Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof d) && tn.p.f(this.f47206a, ((d) obj).f47206a);
    }

    public int hashCode() {
        Long l10 = this.f47206a;
        if (l10 == null) {
            return 0;
        }
        return l10.hashCode();
    }

    @NotNull
    public String toString() {
        return "AppDirInfo(appDirSize=" + this.f47206a + ')';
    }
}
