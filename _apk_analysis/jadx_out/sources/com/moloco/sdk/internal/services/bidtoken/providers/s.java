package com.moloco.sdk.internal.services.bidtoken.providers;

import androidx.compose.runtime.internal.StabilityInferred;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes4.dex */
@StabilityInferred(parameters = 1)
public final class s {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @Nullable
    public final Boolean f47261a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @Nullable
    public final Long f47262b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @Nullable
    public final Long f47263c;

    public s() {
        this(null, null, null, 7, null);
    }

    public s(@Nullable Boolean bool, @Nullable Long l10, @Nullable Long l11) {
        this.f47261a = bool;
        this.f47262b = l10;
        this.f47263c = l11;
    }

    public /* synthetic */ s(Boolean bool, Long l10, Long l11, int i10, tn.i iVar) {
        this((i10 & 1) != 0 ? null : bool, (i10 & 2) != 0 ? null : l10, (i10 & 4) != 0 ? null : l11);
    }

    @Nullable
    public final Boolean a() {
        return this.f47261a;
    }

    @Nullable
    public final Long b() {
        return this.f47262b;
    }

    @Nullable
    public final Long c() {
        return this.f47263c;
    }

    public boolean equals(@Nullable Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof s)) {
            return false;
        }
        s sVar = (s) obj;
        return tn.p.f(this.f47261a, sVar.f47261a) && tn.p.f(this.f47262b, sVar.f47262b) && tn.p.f(this.f47263c, sVar.f47263c);
    }

    public int hashCode() {
        Boolean bool = this.f47261a;
        int iHashCode = (bool == null ? 0 : bool.hashCode()) * 31;
        Long l10 = this.f47262b;
        int iHashCode2 = (iHashCode + (l10 == null ? 0 : l10.hashCode())) * 31;
        Long l11 = this.f47263c;
        return iHashCode2 + (l11 != null ? l11.hashCode() : 0);
    }

    @NotNull
    public String toString() {
        return "MemoryInfoSignal(lowMemory=" + this.f47261a + ", threshold=" + this.f47262b + ", totalMem=" + this.f47263c + ')';
    }
}
