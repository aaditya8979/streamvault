package com.moloco.sdk.internal.services.bidtoken.providers;

import androidx.compose.runtime.internal.StabilityInferred;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes4.dex */
@StabilityInferred(parameters = 1)
public final class h {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @Nullable
    public final Integer f47217a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @Nullable
    public final Integer f47218b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @Nullable
    public final Boolean f47219c;

    public h() {
        this(null, null, null, 7, null);
    }

    public h(@Nullable Integer num, @Nullable Integer num2, @Nullable Boolean bool) {
        this.f47217a = num;
        this.f47218b = num2;
        this.f47219c = bool;
    }

    public /* synthetic */ h(Integer num, Integer num2, Boolean bool, int i10, tn.i iVar) {
        this((i10 & 1) != 0 ? null : num, (i10 & 2) != 0 ? null : num2, (i10 & 4) != 0 ? null : bool);
    }

    @Nullable
    public final Integer a() {
        return this.f47218b;
    }

    @Nullable
    public final Integer b() {
        return this.f47217a;
    }

    @Nullable
    public final Boolean c() {
        return this.f47219c;
    }

    public boolean equals(@Nullable Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof h)) {
            return false;
        }
        h hVar = (h) obj;
        return tn.p.f(this.f47217a, hVar.f47217a) && tn.p.f(this.f47218b, hVar.f47218b) && tn.p.f(this.f47219c, hVar.f47219c);
    }

    public int hashCode() {
        Integer num = this.f47217a;
        int iHashCode = (num == null ? 0 : num.hashCode()) * 31;
        Integer num2 = this.f47218b;
        int iHashCode2 = (iHashCode + (num2 == null ? 0 : num2.hashCode())) * 31;
        Boolean bool = this.f47219c;
        return iHashCode2 + (bool != null ? bool.hashCode() : 0);
    }

    @NotNull
    public String toString() {
        return "BatteryInfoSignal(maxBatteryLevel=" + this.f47217a + ", batteryStatus=" + this.f47218b + ", isPowerSaveMode=" + this.f47219c + ')';
    }
}
