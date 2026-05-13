package com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal;

import androidx.compose.runtime.internal.StabilityInferred;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes2.dex */
@StabilityInferred(parameters = 0)
public final class p0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @Nullable
    public final Integer f48507a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @Nullable
    public final String f48508b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @Nullable
    public final q0 f48509c;

    public p0(@Nullable Integer num, @Nullable String str, @Nullable q0 q0Var) {
        this.f48507a = num;
        this.f48508b = str;
        this.f48509c = q0Var;
    }

    @Nullable
    public final String a() {
        return this.f48508b;
    }

    @Nullable
    public final q0 b() {
        return this.f48509c;
    }

    @Nullable
    public final Integer c() {
        return this.f48507a;
    }

    public boolean equals(@Nullable Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof p0)) {
            return false;
        }
        p0 p0Var = (p0) obj;
        return tn.p.f(this.f48507a, p0Var.f48507a) && tn.p.f(this.f48508b, p0Var.f48508b) && tn.p.f(this.f48509c, p0Var.f48509c);
    }

    public int hashCode() {
        Integer num = this.f48507a;
        int iHashCode = (num == null ? 0 : num.hashCode()) * 31;
        String str = this.f48508b;
        int iHashCode2 = (iHashCode + (str == null ? 0 : str.hashCode())) * 31;
        q0 q0Var = this.f48509c;
        return iHashCode2 + (q0Var != null ? q0Var.hashCode() : 0);
    }

    @NotNull
    public String toString() {
        return "DECAppIcon(size=" + this.f48507a + ", appIconUri=" + this.f48508b + ", border=" + this.f48509c + ')';
    }
}
