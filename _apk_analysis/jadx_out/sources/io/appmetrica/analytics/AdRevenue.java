package io.appmetrica.analytics;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import io.appmetrica.analytics.coreutils.internal.collection.CollectionUtils;
import io.appmetrica.analytics.impl.mo;
import java.math.BigDecimal;
import java.util.Currency;
import java.util.Map;

/* JADX INFO: loaded from: classes8.dex */
public class AdRevenue {

    @Nullable
    public final String adNetwork;

    @Nullable
    public final String adPlacementId;

    @Nullable
    public final String adPlacementName;

    @NonNull
    public final BigDecimal adRevenue;

    @Nullable
    public final AdType adType;

    @Nullable
    public final String adUnitId;

    @Nullable
    public final String adUnitName;

    @NonNull
    public final Currency currency;

    @Nullable
    public final Map<String, String> payload;

    @Nullable
    public final String precision;

    public static class Builder {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final BigDecimal f64328a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private final Currency f64329b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private AdType f64330c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        private String f64331d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        private String f64332e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        private String f64333f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        private String f64334g;

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        private String f64335h;

        /* JADX INFO: renamed from: i, reason: collision with root package name */
        private String f64336i;

        /* JADX INFO: renamed from: j, reason: collision with root package name */
        private Map f64337j;

        private Builder(BigDecimal bigDecimal, Currency currency) {
            this.f64328a = bigDecimal;
            this.f64329b = currency;
        }

        public /* synthetic */ Builder(BigDecimal bigDecimal, Currency currency, int i10) {
            this(bigDecimal, currency);
        }

        public AdRevenue build() {
            return new AdRevenue(this.f64328a, this.f64329b, this.f64330c, this.f64331d, this.f64332e, this.f64333f, this.f64334g, this.f64335h, this.f64336i, this.f64337j, 0);
        }

        public Builder withAdNetwork(@Nullable String str) {
            this.f64331d = str;
            return this;
        }

        public Builder withAdPlacementId(@Nullable String str) {
            this.f64334g = str;
            return this;
        }

        public Builder withAdPlacementName(@Nullable String str) {
            this.f64335h = str;
            return this;
        }

        public Builder withAdType(@Nullable AdType adType) {
            this.f64330c = adType;
            return this;
        }

        public Builder withAdUnitId(@Nullable String str) {
            this.f64332e = str;
            return this;
        }

        public Builder withAdUnitName(@Nullable String str) {
            this.f64333f = str;
            return this;
        }

        public Builder withPayload(@Nullable Map<String, String> map) {
            this.f64337j = map == null ? null : CollectionUtils.copyOf(map);
            return this;
        }

        public Builder withPrecision(@Nullable String str) {
            this.f64336i = str;
            return this;
        }
    }

    private AdRevenue(BigDecimal bigDecimal, Currency currency, AdType adType, String str, String str2, String str3, String str4, String str5, String str6, Map map) {
        this.adRevenue = bigDecimal;
        this.currency = currency;
        this.adType = adType;
        this.adNetwork = str;
        this.adUnitId = str2;
        this.adUnitName = str3;
        this.adPlacementId = str4;
        this.adPlacementName = str5;
        this.precision = str6;
        this.payload = map == null ? null : CollectionUtils.unmodifiableMapCopy(map);
    }

    public /* synthetic */ AdRevenue(BigDecimal bigDecimal, Currency currency, AdType adType, String str, String str2, String str3, String str4, String str5, String str6, Map map, int i10) {
        this(bigDecimal, currency, adType, str, str2, str3, str4, str5, str6, map);
    }

    public static Builder newBuilder(double d10, @NonNull Currency currency) {
        return new Builder(new BigDecimal(mo.a(d10)), currency, 0);
    }

    public static Builder newBuilder(long j10, @NonNull Currency currency) {
        return new Builder(mo.a(j10), currency, 0);
    }

    public static Builder newBuilder(@NonNull BigDecimal bigDecimal, @NonNull Currency currency) {
        return new Builder(bigDecimal, currency, 0);
    }
}
