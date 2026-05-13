package com.unity3d.ads.core.domain;

import com.unity3d.ads.core.data.repository.SessionRepository;
import com.unity3d.ads.gatewayclient.RequestPolicy;
import org.jetbrains.annotations.NotNull;
import tn.p;

/* JADX INFO: compiled from: GetOperativeEventRequestPolicy.kt */
/* JADX INFO: loaded from: classes10.dex */
public final class GetOperativeEventRequestPolicy implements GetRequestPolicy {

    @NotNull
    private final SessionRepository sessionRepository;

    public GetOperativeEventRequestPolicy(@NotNull SessionRepository sessionRepository) {
        p.k(sessionRepository, "sessionRepository");
        this.sessionRepository = sessionRepository;
    }

    @Override // com.unity3d.ads.core.domain.GetRequestPolicy
    @NotNull
    public RequestPolicy invoke() {
        return new RequestPolicy(this.sessionRepository.getNativeConfiguration().getOperativeEventPolicy().getRetryPolicy().getMaxDuration(), this.sessionRepository.getNativeConfiguration().getOperativeEventPolicy().getRetryPolicy().getRetryMaxInterval(), this.sessionRepository.getNativeConfiguration().getOperativeEventPolicy().getRetryPolicy().getRetryWaitBase(), this.sessionRepository.getNativeConfiguration().getOperativeEventPolicy().getRetryPolicy().getRetryJitterPct(), this.sessionRepository.getNativeConfiguration().getOperativeEventPolicy().getRetryPolicy().getRetryScalingFactor(), this.sessionRepository.getNativeConfiguration().getOperativeEventPolicy().getTimeoutPolicy().getConnectTimeoutMs(), this.sessionRepository.getNativeConfiguration().getOperativeEventPolicy().getTimeoutPolicy().getReadTimeoutMs(), this.sessionRepository.getNativeConfiguration().getOperativeEventPolicy().getTimeoutPolicy().getWriteTimeoutMs(), this.sessionRepository.getNativeConfiguration().getOperativeEventPolicy().getTimeoutPolicy().getOverallTimeoutMs(), this.sessionRepository.getNativeConfiguration().getOperativeEventPolicy().getRetryPolicy().getShouldStoreLocally());
    }
}
