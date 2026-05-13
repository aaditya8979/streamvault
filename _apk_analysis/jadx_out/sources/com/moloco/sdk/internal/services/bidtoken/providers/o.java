package com.moloco.sdk.internal.services.bidtoken.providers;

import androidx.compose.runtime.internal.StabilityInferred;
import com.moloco.sdk.internal.services.H;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes4.dex */
@StabilityInferred(parameters = 1)
public final class o {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @Nullable
    public final H f47241a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @Nullable
    public final String f47242b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @Nullable
    public final String f47243c;

    public o() {
        this(null, null, null, 7, null);
    }

    public o(@Nullable H h10, @Nullable String str, @Nullable String str2) {
        this.f47241a = h10;
        this.f47242b = str;
        this.f47243c = str2;
    }

    public /* synthetic */ o(H h10, String str, String str2, int i10, tn.i iVar) {
        this((i10 & 1) != 0 ? null : h10, (i10 & 2) != 0 ? null : str, (i10 & 4) != 0 ? null : str2);
    }

    @Nullable
    public final String a() {
        return this.f47243c;
    }

    @Nullable
    public final String b() {
        return this.f47242b;
    }

    @Nullable
    public final H c() {
        return this.f47241a;
    }

    public boolean equals(@Nullable Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof o)) {
            return false;
        }
        o oVar = (o) obj;
        return this.f47241a == oVar.f47241a && tn.p.f(this.f47242b, oVar.f47242b) && tn.p.f(this.f47243c, oVar.f47243c);
    }

    public int hashCode() {
        H h10 = this.f47241a;
        int iHashCode = (h10 == null ? 0 : h10.hashCode()) * 31;
        String str = this.f47242b;
        int iHashCode2 = (iHashCode + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.f47243c;
        return iHashCode2 + (str2 != null ? str2.hashCode() : 0);
    }

    @NotNull
    public String toString() {
        return "DeviceSignalInfo(orientation=" + this.f47241a + ", locale=" + this.f47242b + ", keyboardLocale=" + this.f47243c + ')';
    }
}
