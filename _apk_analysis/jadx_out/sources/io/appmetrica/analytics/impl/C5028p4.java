package io.appmetrica.analytics.impl;

import android.location.Location;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import io.appmetrica.analytics.coreutils.internal.WrapUtils;
import io.appmetrica.analytics.coreutils.internal.collection.CollectionUtils;
import io.appmetrica.analytics.internal.CounterConfiguration;
import io.appmetrica.analytics.networktasks.internal.ArgumentsMerger;
import java.util.HashSet;
import java.util.Map;
import java.util.Objects;
import java.util.Set;

/* JADX INFO: renamed from: io.appmetrica.analytics.impl.p4, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes11.dex */
public final class C5028p4 implements ArgumentsMerger {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @Nullable
    public final String f67490a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @Nullable
    public final Boolean f67491b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @Nullable
    public final Location f67492c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    @Nullable
    public final Boolean f67493d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    @Nullable
    public final Integer f67494e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    @Nullable
    public final Integer f67495f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    @Nullable
    public final Integer f67496g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    @Nullable
    public final Boolean f67497h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    @Nullable
    public final Boolean f67498i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    @Nullable
    public final Map<String, String> f67499j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    @Nullable
    public final Integer f67500k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    @Nullable
    public final Boolean f67501l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    @Nullable
    public final Boolean f67502m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    @Nullable
    public final Boolean f67503n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    @NonNull
    public final Set<String> f67504o;

    public C5028p4() {
        this(null, null, null, null, null, null, null, null, null, null, null, null, null, null, new HashSet());
    }

    public C5028p4(@NonNull CounterConfiguration counterConfiguration, @Nullable Map<String, String> map) {
        this(counterConfiguration.getApiKey(), counterConfiguration.isLocationTrackingEnabled(), counterConfiguration.getManualLocation(), counterConfiguration.isFirstActivationAsUpdate(), counterConfiguration.getSessionTimeout(), counterConfiguration.getMaxReportsCount(), counterConfiguration.getDispatchPeriod(), counterConfiguration.isLogEnabled(), counterConfiguration.getDataSendingEnabled(), map, counterConfiguration.getMaxReportsInDbCount(), counterConfiguration.getReportNativeCrashesEnabled(), counterConfiguration.isRevenueAutoTrackingEnabled(), counterConfiguration.isAdvIdentifiersTrackingEnabled(), new HashSet(counterConfiguration.getAutoCollectedDataSubscribers()));
    }

    public C5028p4(String str, Boolean bool, Location location, Boolean bool2, Integer num, Integer num2, Integer num3, Boolean bool3, Boolean bool4, Map map, Integer num4, Boolean bool5, Boolean bool6, Boolean bool7, Set set) {
        this.f67490a = str;
        this.f67491b = bool;
        this.f67492c = location;
        this.f67493d = bool2;
        this.f67494e = num;
        this.f67495f = num2;
        this.f67496g = num3;
        this.f67497h = bool3;
        this.f67498i = bool4;
        this.f67499j = map;
        this.f67500k = num4;
        this.f67501l = bool5;
        this.f67502m = bool6;
        this.f67503n = bool7;
        this.f67504o = set;
    }

    public final boolean a(@NonNull C5028p4 c5028p4) {
        return equals(c5028p4);
    }

    @Override // io.appmetrica.analytics.networktasks.internal.ArgumentsMerger
    @NonNull
    /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
    public final C5028p4 mergeFrom(@NonNull C5028p4 c5028p4) {
        return new C5028p4((String) WrapUtils.getOrDefaultNullable(this.f67490a, c5028p4.f67490a), (Boolean) WrapUtils.getOrDefaultNullable(this.f67491b, c5028p4.f67491b), (Location) WrapUtils.getOrDefaultNullable(this.f67492c, c5028p4.f67492c), (Boolean) WrapUtils.getOrDefaultNullable(this.f67493d, c5028p4.f67493d), (Integer) WrapUtils.getOrDefaultNullable(this.f67494e, c5028p4.f67494e), (Integer) WrapUtils.getOrDefaultNullable(this.f67495f, c5028p4.f67495f), (Integer) WrapUtils.getOrDefaultNullable(this.f67496g, c5028p4.f67496g), (Boolean) WrapUtils.getOrDefaultNullable(this.f67497h, c5028p4.f67497h), (Boolean) WrapUtils.getOrDefaultNullable(this.f67498i, c5028p4.f67498i), (Map) WrapUtils.getOrDefaultNullable(this.f67499j, c5028p4.f67499j), (Integer) WrapUtils.getOrDefaultNullable(this.f67500k, c5028p4.f67500k), (Boolean) WrapUtils.getOrDefaultNullable(this.f67501l, c5028p4.f67501l), (Boolean) WrapUtils.getOrDefaultNullable(this.f67502m, c5028p4.f67502m), (Boolean) WrapUtils.getOrDefaultNullable(this.f67503n, c5028p4.f67503n), CollectionUtils.merge(this.f67504o, c5028p4.f67504o));
    }

    @Override // io.appmetrica.analytics.networktasks.internal.ArgumentsMerger
    public final boolean compareWithOtherArguments(@NonNull Object obj) {
        return equals((C5028p4) obj);
    }

    public final boolean equals(Object obj) {
        if (obj == null || C5028p4.class != obj.getClass()) {
            return false;
        }
        C5028p4 c5028p4 = (C5028p4) obj;
        return Objects.equals(this.f67490a, c5028p4.f67490a) && Objects.equals(this.f67491b, c5028p4.f67491b) && Objects.equals(this.f67492c, c5028p4.f67492c) && Objects.equals(this.f67493d, c5028p4.f67493d) && Objects.equals(this.f67494e, c5028p4.f67494e) && Objects.equals(this.f67495f, c5028p4.f67495f) && Objects.equals(this.f67496g, c5028p4.f67496g) && Objects.equals(this.f67497h, c5028p4.f67497h) && Objects.equals(this.f67498i, c5028p4.f67498i) && Objects.equals(this.f67499j, c5028p4.f67499j) && Objects.equals(this.f67500k, c5028p4.f67500k) && Objects.equals(this.f67501l, c5028p4.f67501l) && Objects.equals(this.f67502m, c5028p4.f67502m) && Objects.equals(this.f67503n, c5028p4.f67503n) && Objects.equals(this.f67504o, c5028p4.f67504o);
    }

    public final int hashCode() {
        return Objects.hash(this.f67490a, this.f67491b, this.f67492c, this.f67493d, this.f67494e, this.f67495f, this.f67496g, this.f67497h, this.f67498i, this.f67499j, this.f67500k, this.f67501l, this.f67502m, this.f67503n, this.f67504o);
    }

    public final String toString() {
        return "ReporterArguments{apiKey='" + this.f67490a + "', locationTracking=" + this.f67491b + ", manualLocation=" + this.f67492c + ", firstActivationAsUpdate=" + this.f67493d + ", sessionTimeout=" + this.f67494e + ", maxReportsCount=" + this.f67495f + ", dispatchPeriod=" + this.f67496g + ", logEnabled=" + this.f67497h + ", dataSendingEnabled=" + this.f67498i + ", clidsFromClient=" + this.f67499j + ", maxReportsInDbCount=" + this.f67500k + ", nativeCrashesEnabled=" + this.f67501l + ", revenueAutoTrackingEnabled=" + this.f67502m + ", advIdentifiersTrackingEnabled=" + this.f67503n + ", autoCollectedDataSubscribers=" + this.f67504o + '}';
    }
}
