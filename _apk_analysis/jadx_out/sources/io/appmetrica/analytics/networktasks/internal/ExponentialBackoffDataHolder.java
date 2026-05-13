package io.appmetrica.analytics.networktasks.internal;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import io.appmetrica.analytics.coreutils.internal.time.SystemTimeProvider;
import io.appmetrica.analytics.coreutils.internal.time.TimePassedChecker;
import io.appmetrica.analytics.coreutils.internal.time.TimeProvider;

/* JADX INFO: loaded from: classes10.dex */
public class ExponentialBackoffDataHolder {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final TimePassedChecker f68276a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final TimeProvider f68277b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final HostRetryInfoProvider f68278c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private long f68279d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private int f68280e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private final String f68281f;

    public ExponentialBackoffDataHolder(HostRetryInfoProvider hostRetryInfoProvider, SystemTimeProvider systemTimeProvider, TimePassedChecker timePassedChecker, String str) {
        this.f68278c = hostRetryInfoProvider;
        this.f68277b = systemTimeProvider;
        this.f68276a = timePassedChecker;
        this.f68279d = hostRetryInfoProvider.getLastAttemptTimeSeconds();
        this.f68280e = hostRetryInfoProvider.getNextSendAttemptNumber();
        this.f68281f = String.format("[ExponentialBackoffDataHolder-%s]", str);
    }

    public ExponentialBackoffDataHolder(@NonNull HostRetryInfoProvider hostRetryInfoProvider, @NonNull String str) {
        this(hostRetryInfoProvider, new SystemTimeProvider(), new TimePassedChecker(), str);
    }

    public void reset() {
        this.f68280e = 1;
        this.f68279d = 0L;
        this.f68278c.saveNextSendAttemptNumber(1);
        this.f68278c.saveLastAttemptTimeSeconds(this.f68279d);
    }

    public void updateLastAttemptInfo() {
        long jCurrentTimeSeconds = this.f68277b.currentTimeSeconds();
        this.f68279d = jCurrentTimeSeconds;
        this.f68280e++;
        this.f68278c.saveLastAttemptTimeSeconds(jCurrentTimeSeconds);
        this.f68278c.saveNextSendAttemptNumber(this.f68280e);
    }

    public boolean wasLastAttemptLongAgoEnough(@Nullable RetryPolicyConfig retryPolicyConfig) {
        if (retryPolicyConfig != null) {
            long j10 = this.f68279d;
            if (j10 != 0) {
                TimePassedChecker timePassedChecker = this.f68276a;
                int i10 = ((1 << (this.f68280e - 1)) - 1) * retryPolicyConfig.exponentialMultiplier;
                int i11 = retryPolicyConfig.maxIntervalSeconds;
                if (i10 > i11) {
                    i10 = i11;
                }
                return timePassedChecker.didTimePassSeconds(j10, i10, this.f68281f);
            }
        }
        return true;
    }
}
