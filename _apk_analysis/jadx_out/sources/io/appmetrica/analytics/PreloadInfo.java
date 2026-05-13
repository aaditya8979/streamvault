package io.appmetrica.analytics;

import io.appmetrica.analytics.coreutils.internal.collection.CollectionUtils;
import java.util.HashMap;
import java.util.Map;

/* JADX INFO: loaded from: classes5.dex */
public class PreloadInfo {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final String f64390a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final Map f64391b;

    public static class Builder {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final String f64392a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private final HashMap f64393b;

        private Builder(String str) {
            this.f64392a = str;
            this.f64393b = new HashMap();
        }

        public /* synthetic */ Builder(String str, int i10) {
            this(str);
        }

        public PreloadInfo build() {
            return new PreloadInfo(this, 0);
        }

        public Builder setAdditionalParams(String str, String str2) {
            if (str != null && str2 != null) {
                this.f64393b.put(str, str2);
            }
            return this;
        }
    }

    private PreloadInfo(Builder builder) {
        this.f64390a = builder.f64392a;
        this.f64391b = CollectionUtils.unmodifiableMapCopy(builder.f64393b);
    }

    public /* synthetic */ PreloadInfo(Builder builder, int i10) {
        this(builder);
    }

    public static Builder newBuilder(String str) {
        return new Builder(str, 0);
    }

    public Map<String, String> getAdditionalParams() {
        return this.f64391b;
    }

    public String getTrackingId() {
        return this.f64390a;
    }
}
