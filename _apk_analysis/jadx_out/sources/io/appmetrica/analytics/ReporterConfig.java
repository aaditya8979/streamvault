package io.appmetrica.analytics;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import io.appmetrica.analytics.coreutils.internal.collection.CollectionUtils;
import io.appmetrica.analytics.impl.C4821h0;
import io.appmetrica.analytics.impl.C5004o5;
import io.appmetrica.analytics.impl.Fn;
import java.util.HashMap;
import java.util.Map;

/* JADX INFO: loaded from: classes2.dex */
public class ReporterConfig {

    @NonNull
    public final Map<String, Object> additionalConfig;

    @NonNull
    public final String apiKey;
    public final Map<String, String> appEnvironment;

    @Nullable
    public final Boolean dataSendingEnabled;

    @Nullable
    public final Integer dispatchPeriodSeconds;

    @Nullable
    public final Boolean logs;

    @Nullable
    public final Integer maxReportsCount;

    @Nullable
    public final Integer maxReportsInDatabaseCount;

    @Nullable
    public final Integer sessionTimeout;

    @Nullable
    public final String userProfileID;

    public static class Builder {

        /* JADX INFO: renamed from: l, reason: collision with root package name */
        private static final Fn f64394l = new Fn(new C4821h0());

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final C5004o5 f64395a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private final String f64396b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private Integer f64397c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        private Boolean f64398d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        private Boolean f64399e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        private Integer f64400f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        private String f64401g;

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        private Integer f64402h;

        /* JADX INFO: renamed from: i, reason: collision with root package name */
        private Integer f64403i;

        /* JADX INFO: renamed from: j, reason: collision with root package name */
        private final HashMap f64404j;

        /* JADX INFO: renamed from: k, reason: collision with root package name */
        private final HashMap f64405k;

        private Builder(String str) {
            this.f64404j = new HashMap();
            this.f64405k = new HashMap();
            f64394l.a(str);
            this.f64395a = new C5004o5(str);
            this.f64396b = str;
        }

        public /* synthetic */ Builder(String str, int i10) {
            this(str);
        }

        @NonNull
        public ReporterConfig build() {
            return new ReporterConfig(this, 0);
        }

        @NonNull
        public Builder withAdditionalConfig(@NonNull String str, @Nullable Object obj) {
            this.f64405k.put(str, obj);
            return this;
        }

        @NonNull
        public Builder withAppEnvironmentValue(String str, String str2) {
            this.f64404j.put(str, str2);
            return this;
        }

        @NonNull
        public Builder withDataSendingEnabled(boolean z10) {
            this.f64399e = Boolean.valueOf(z10);
            return this;
        }

        @NonNull
        public Builder withDispatchPeriodSeconds(int i10) {
            this.f64402h = Integer.valueOf(i10);
            return this;
        }

        @NonNull
        public Builder withLogs() {
            this.f64398d = Boolean.TRUE;
            return this;
        }

        @NonNull
        public Builder withMaxReportsCount(int i10) {
            this.f64403i = Integer.valueOf(i10);
            return this;
        }

        @NonNull
        public Builder withMaxReportsInDatabaseCount(int i10) {
            this.f64400f = Integer.valueOf(this.f64395a.a(i10));
            return this;
        }

        @NonNull
        public Builder withSessionTimeout(int i10) {
            this.f64397c = Integer.valueOf(i10);
            return this;
        }

        @NonNull
        public Builder withUserProfileID(@Nullable String str) {
            this.f64401g = str;
            return this;
        }
    }

    private ReporterConfig(Builder builder) {
        this.apiKey = builder.f64396b;
        this.sessionTimeout = builder.f64397c;
        this.logs = builder.f64398d;
        this.dataSendingEnabled = builder.f64399e;
        this.maxReportsInDatabaseCount = builder.f64400f;
        this.userProfileID = builder.f64401g;
        this.dispatchPeriodSeconds = builder.f64402h;
        this.maxReportsCount = builder.f64403i;
        this.appEnvironment = CollectionUtils.unmodifiableSameOrderMapCopy(builder.f64404j);
        this.additionalConfig = CollectionUtils.unmodifiableSameOrderMapCopy(builder.f64405k);
    }

    public /* synthetic */ ReporterConfig(Builder builder, int i10) {
        this(builder);
    }

    @NonNull
    public static Builder newConfigBuilder(@NonNull String str) {
        return new Builder(str, 0);
    }
}
