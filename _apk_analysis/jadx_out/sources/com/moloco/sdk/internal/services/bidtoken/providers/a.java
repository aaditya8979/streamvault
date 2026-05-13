package com.moloco.sdk.internal.services.bidtoken.providers;

import androidx.compose.runtime.internal.StabilityInferred;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes4.dex */
@StabilityInferred(parameters = 1)
public final class a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @Nullable
    public final Boolean f47194a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @Nullable
    public final Boolean f47195b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @Nullable
    public final Boolean f47196c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    @Nullable
    public final Float f47197d;

    public a() {
        this(null, null, null, null, 15, null);
    }

    public a(@Nullable Boolean bool, @Nullable Boolean bool2, @Nullable Boolean bool3, @Nullable Float f10) {
        this.f47194a = bool;
        this.f47195b = bool2;
        this.f47196c = bool3;
        this.f47197d = f10;
    }

    public /* synthetic */ a(Boolean bool, Boolean bool2, Boolean bool3, Float f10, int i10, tn.i iVar) {
        this((i10 & 1) != 0 ? null : bool, (i10 & 2) != 0 ? null : bool2, (i10 & 4) != 0 ? null : bool3, (i10 & 8) != 0 ? null : f10);
    }

    @Nullable
    public final Boolean a() {
        return this.f47194a;
    }

    @Nullable
    public final Boolean b() {
        return this.f47195b;
    }

    @Nullable
    public final Float c() {
        return this.f47197d;
    }

    @Nullable
    public final Boolean d() {
        return this.f47196c;
    }

    public boolean equals(@Nullable Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof a)) {
            return false;
        }
        a aVar = (a) obj;
        return tn.p.f(this.f47194a, aVar.f47194a) && tn.p.f(this.f47195b, aVar.f47195b) && tn.p.f(this.f47196c, aVar.f47196c) && tn.p.f(this.f47197d, aVar.f47197d);
    }

    public int hashCode() {
        Boolean bool = this.f47194a;
        int iHashCode = (bool == null ? 0 : bool.hashCode()) * 31;
        Boolean bool2 = this.f47195b;
        int iHashCode2 = (iHashCode + (bool2 == null ? 0 : bool2.hashCode())) * 31;
        Boolean bool3 = this.f47196c;
        int iHashCode3 = (iHashCode2 + (bool3 == null ? 0 : bool3.hashCode())) * 31;
        Float f10 = this.f47197d;
        return iHashCode3 + (f10 != null ? f10.hashCode() : 0);
    }

    @NotNull
    public String toString() {
        return "AccessibilitySignal(accessibilityCaptioningEnabled=" + this.f47194a + ", accessibilityLargePointerIcon=" + this.f47195b + ", reduceBrightColorsActivated=" + this.f47196c + ", fontScale=" + this.f47197d + ')';
    }
}
