package io.appmetrica.analytics.coreutils.internal.services.frequency;

import com.ironsource.C3978d4;
import io.appmetrica.analytics.coreutils.internal.time.SystemTimeProvider;
import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(bv = {}, d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\t\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\u0018\u00002\u00020\u0001B\u001f\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\u0006\u0010\t\u001a\u00020\b\u0012\u0006\u0010\r\u001a\u00020\f¢\u0006\u0004\b\u000e\u0010\u000fJ\u000e\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002J\u0016\u0010\u000b\u001a\u00020\n2\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\t\u001a\u00020\b¨\u0006\u0010"}, d2 = {"Lio/appmetrica/analytics/coreutils/internal/services/frequency/EventFrequencyOverWindowLimitDetector;", "", "", "key", "", "detect", "", "window", "", "limitPerWindow", "Lbn/r;", "updateParameters", "Lio/appmetrica/analytics/coreutils/internal/services/frequency/EventFrequencyStorage;", C3978d4.a.f31215k, "<init>", "(JILio/appmetrica/analytics/coreutils/internal/services/frequency/EventFrequencyStorage;)V", "core-utils_release"}, k = 1, mv = {1, 6, 0})
public final class EventFrequencyOverWindowLimitDetector {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private long f64781a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private int f64782b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final EventFrequencyStorage f64783c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final SystemTimeProvider f64784d = new SystemTimeProvider();

    public EventFrequencyOverWindowLimitDetector(long j10, int i10, @NotNull EventFrequencyStorage eventFrequencyStorage) {
        this.f64781a = j10;
        this.f64782b = i10;
        this.f64783c = eventFrequencyStorage;
    }

    public final boolean detect(@NotNull String key) {
        long jLongValue;
        long jUptimeMillis = this.f64784d.uptimeMillis();
        EventFrequencyStorage eventFrequencyStorage = this.f64783c;
        Long windowStart = eventFrequencyStorage.getWindowStart(key);
        if (windowStart == null) {
            eventFrequencyStorage.putWindowStart(key, jUptimeMillis);
            jLongValue = jUptimeMillis;
        } else {
            jLongValue = windowStart.longValue();
        }
        long j10 = jUptimeMillis - jLongValue;
        if (j10 < 0 || j10 > this.f64781a) {
            this.f64783c.putWindowStart(key, jUptimeMillis);
            this.f64783c.putWindowOccurrencesCount(key, 1);
            return false;
        }
        Integer windowOccurrencesCount = this.f64783c.getWindowOccurrencesCount(key);
        int iIntValue = (windowOccurrencesCount != null ? windowOccurrencesCount.intValue() : 0) + 1;
        this.f64783c.putWindowOccurrencesCount(key, iIntValue);
        return iIntValue > this.f64782b;
    }

    public final synchronized void updateParameters(long j10, int i10) {
        this.f64781a = j10;
        this.f64782b = i10;
    }
}
