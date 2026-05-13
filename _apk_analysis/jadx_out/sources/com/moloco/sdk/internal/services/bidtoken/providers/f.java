package com.moloco.sdk.internal.services.bidtoken.providers;

import androidx.compose.runtime.internal.StabilityInferred;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes4.dex */
@StabilityInferred(parameters = 1)
public final class f {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @Nullable
    public final com.moloco.sdk.internal.services.z f47211a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @Nullable
    public final Integer f47212b;

    /* JADX WARN: Multi-variable type inference failed */
    public f() {
        this(null, 0 == true ? 1 : 0, 3, 0 == true ? 1 : 0);
    }

    public f(@Nullable com.moloco.sdk.internal.services.z zVar, @Nullable Integer num) {
        this.f47211a = zVar;
        this.f47212b = num;
    }

    public /* synthetic */ f(com.moloco.sdk.internal.services.z zVar, Integer num, int i10, tn.i iVar) {
        this((i10 & 1) != 0 ? null : zVar, (i10 & 2) != 0 ? null : num);
    }

    @Nullable
    public final Integer a() {
        return this.f47212b;
    }

    @Nullable
    public final com.moloco.sdk.internal.services.z b() {
        return this.f47211a;
    }

    public boolean equals(@Nullable Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof f)) {
            return false;
        }
        f fVar = (f) obj;
        return this.f47211a == fVar.f47211a && tn.p.f(this.f47212b, fVar.f47212b);
    }

    public int hashCode() {
        com.moloco.sdk.internal.services.z zVar = this.f47211a;
        int iHashCode = (zVar == null ? 0 : zVar.hashCode()) * 31;
        Integer num = this.f47212b;
        return iHashCode + (num != null ? num.hashCode() : 0);
    }

    @NotNull
    public String toString() {
        return "AudioSignal(muteSwitchState=" + this.f47211a + ", mediaVolume=" + this.f47212b + ')';
    }
}
