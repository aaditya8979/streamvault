package com.fyber.inneractive.sdk.external;

import com.fyber.inneractive.sdk.flow.i;
import com.fyber.inneractive.sdk.network.t;
import java.util.ArrayList;

/* JADX INFO: loaded from: classes3.dex */
public class InneractiveInfrastructureError extends InneractiveError {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final InneractiveErrorCode f16249a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final i f16250b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final Throwable f16251c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public Exception f16252d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final ArrayList f16253e;

    public InneractiveInfrastructureError(InneractiveErrorCode inneractiveErrorCode, i iVar) {
        this(inneractiveErrorCode, iVar, null);
    }

    public InneractiveInfrastructureError(InneractiveErrorCode inneractiveErrorCode, i iVar, Throwable th2) {
        this.f16253e = new ArrayList();
        this.f16249a = inneractiveErrorCode;
        this.f16250b = iVar;
        this.f16251c = th2;
    }

    public void addReportedError(t tVar) {
        this.f16253e.add(tVar);
    }

    @Override // com.fyber.inneractive.sdk.external.InneractiveError
    public String description() {
        StringBuilder sb2 = new StringBuilder();
        sb2.append(this.f16249a);
        if (this.f16251c != null) {
            sb2.append(" : ");
            sb2.append(this.f16251c);
        }
        return sb2.toString();
    }

    public Throwable getCause() {
        Exception exc = this.f16252d;
        return exc == null ? this.f16251c : exc;
    }

    public InneractiveErrorCode getErrorCode() {
        return this.f16249a;
    }

    public i getFyberMarketplaceAdLoadFailureReason() {
        return this.f16250b;
    }

    public boolean isErrorAlreadyReported(t tVar) {
        return this.f16253e.contains(tVar);
    }

    public void setCause(Exception exc) {
        this.f16252d = exc;
    }
}
