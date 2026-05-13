package com.inmobi.media;

import com.inmobi.ads.InMobiAdRequestStatus;

/* JADX INFO: loaded from: classes9.dex */
public class Y extends RuntimeException {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final InMobiAdRequestStatus f26607a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final V f26608b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public Y(InMobiAdRequestStatus inMobiAdRequestStatus, V v10) {
        super(inMobiAdRequestStatus.getMessage());
        tn.p.k(inMobiAdRequestStatus, "status");
        tn.p.k(v10, "adFetchError");
        this.f26607a = inMobiAdRequestStatus;
        this.f26608b = v10;
    }

    @Override // java.lang.Throwable
    public final String toString() {
        return "AdFetchFailureException(statusCode=" + this.f26607a.getStatusCode() + ", statusMessage=" + this.f26607a.getMessage() + ", adFetchError=" + this.f26608b + ")";
    }
}
