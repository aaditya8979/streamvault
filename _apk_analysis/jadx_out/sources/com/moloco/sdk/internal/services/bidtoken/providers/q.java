package com.moloco.sdk.internal.services.bidtoken.providers;

import androidx.compose.runtime.internal.StabilityInferred;
import com.unity3d.services.core.device.reader.JsonStorageKeyNames;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes4.dex */
@StabilityInferred(parameters = 1)
public final class q {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NotNull
    public final String f47249a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final long f47250b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final long f47251c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final int f47252d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final int f47253e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final int f47254f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final int f47255g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final int f47256h;

    public q(@NotNull String str, long j10, long j11, int i10, int i11, int i12, int i13, int i14) {
        tn.p.k(str, JsonStorageKeyNames.SESSION_ID_KEY);
        this.f47249a = str;
        this.f47250b = j10;
        this.f47251c = j11;
        this.f47252d = i10;
        this.f47253e = i11;
        this.f47254f = i12;
        this.f47255g = i13;
        this.f47256h = i14;
    }

    public final int a() {
        return this.f47252d;
    }

    public final int b() {
        return this.f47255g;
    }

    public final long c() {
        return this.f47251c;
    }

    public final int d() {
        return this.f47253e;
    }

    public final int e() {
        return this.f47254f;
    }

    public boolean equals(@Nullable Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof q)) {
            return false;
        }
        q qVar = (q) obj;
        return tn.p.f(this.f47249a, qVar.f47249a) && this.f47250b == qVar.f47250b && this.f47251c == qVar.f47251c && this.f47252d == qVar.f47252d && this.f47253e == qVar.f47253e && this.f47254f == qVar.f47254f && this.f47255g == qVar.f47255g && this.f47256h == qVar.f47256h;
    }

    public final int f() {
        return this.f47256h;
    }

    @NotNull
    public final String g() {
        return this.f47249a;
    }

    public final long h() {
        return this.f47250b;
    }

    public int hashCode() {
        return (((((((((((((this.f47249a.hashCode() * 31) + Long.hashCode(this.f47250b)) * 31) + Long.hashCode(this.f47251c)) * 31) + Integer.hashCode(this.f47252d)) * 31) + Integer.hashCode(this.f47253e)) * 31) + Integer.hashCode(this.f47254f)) * 31) + Integer.hashCode(this.f47255g)) * 31) + Integer.hashCode(this.f47256h);
    }

    public final boolean i() {
        return this.f47249a.length() > 0;
    }

    @NotNull
    public String toString() {
        return "IlrdSignal(sessionId=" + this.f47249a + ", sessionStartTs=" + this.f47250b + ", lastImpressionTs=" + this.f47251c + ", bannerImpressionCount=" + this.f47252d + ", mrecImpressionCount=" + this.f47253e + ", nativeImpressionCount=" + this.f47254f + ", interstitialImpressionCount=" + this.f47255g + ", rewardedImpressionCount=" + this.f47256h + ')';
    }
}
