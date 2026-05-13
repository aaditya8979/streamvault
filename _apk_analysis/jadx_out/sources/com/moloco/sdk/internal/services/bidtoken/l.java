package com.moloco.sdk.internal.services.bidtoken;

import androidx.compose.runtime.internal.StabilityInferred;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes3.dex */
@StabilityInferred(parameters = 1)
public final class l {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final long f47176a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final int f47177b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final long f47178c;

    public l(long j10, int i10, long j11) {
        this.f47176a = j10;
        this.f47177b = i10;
        this.f47178c = j11;
    }

    public final long a() {
        return this.f47178c;
    }

    public final int b() {
        return this.f47177b;
    }

    public final long c() {
        return this.f47176a;
    }

    public boolean equals(@Nullable Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof l)) {
            return false;
        }
        l lVar = (l) obj;
        return this.f47176a == lVar.f47176a && this.f47177b == lVar.f47177b && this.f47178c == lVar.f47178c;
    }

    public int hashCode() {
        return (((Long.hashCode(this.f47176a) * 31) + Integer.hashCode(this.f47177b)) * 31) + Long.hashCode(this.f47178c);
    }

    @NotNull
    public String toString() {
        return "BidTokenHttpRequestInfo(requestTimeoutMillis=" + this.f47176a + ", fetchRetryMax=" + this.f47177b + ", fetchRetryDelayMillis=" + this.f47178c + ')';
    }
}
