package io.appmetrica.analytics.network.internal;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import io.appmetrica.analytics.network.impl.c;
import io.appmetrica.analytics.network.impl.d;
import javax.net.ssl.SSLSocketFactory;

/* JADX INFO: loaded from: classes3.dex */
public class NetworkClient {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final Integer f68230a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final Integer f68231b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final SSLSocketFactory f68232c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final Boolean f68233d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final Boolean f68234e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private final int f68235f;

    public static class Builder {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private Integer f68236a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private Integer f68237b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private SSLSocketFactory f68238c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        private Boolean f68239d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        private Boolean f68240e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        private Integer f68241f;

        @NonNull
        public NetworkClient build() {
            return new NetworkClient(this.f68236a, this.f68237b, this.f68238c, this.f68239d, this.f68240e, this.f68241f, 0);
        }

        @NonNull
        public Builder withConnectTimeout(int i10) {
            this.f68236a = Integer.valueOf(i10);
            return this;
        }

        @NonNull
        public Builder withInstanceFollowRedirects(boolean z10) {
            this.f68240e = Boolean.valueOf(z10);
            return this;
        }

        @NonNull
        public Builder withMaxResponseSize(int i10) {
            this.f68241f = Integer.valueOf(i10);
            return this;
        }

        @NonNull
        public Builder withReadTimeout(int i10) {
            this.f68237b = Integer.valueOf(i10);
            return this;
        }

        @NonNull
        public Builder withSslSocketFactory(@Nullable SSLSocketFactory sSLSocketFactory) {
            this.f68238c = sSLSocketFactory;
            return this;
        }

        @NonNull
        public Builder withUseCaches(boolean z10) {
            this.f68239d = Boolean.valueOf(z10);
            return this;
        }
    }

    private NetworkClient(Integer num, Integer num2, SSLSocketFactory sSLSocketFactory, Boolean bool, Boolean bool2, Integer num3) {
        this.f68230a = num;
        this.f68231b = num2;
        this.f68232c = sSLSocketFactory;
        this.f68233d = bool;
        this.f68234e = bool2;
        this.f68235f = num3 == null ? Integer.MAX_VALUE : num3.intValue();
    }

    public /* synthetic */ NetworkClient(Integer num, Integer num2, SSLSocketFactory sSLSocketFactory, Boolean bool, Boolean bool2, Integer num3, int i10) {
        this(num, num2, sSLSocketFactory, bool, bool2, num3);
    }

    @Nullable
    public Integer getConnectTimeout() {
        return this.f68230a;
    }

    @Nullable
    public Boolean getInstanceFollowRedirects() {
        return this.f68234e;
    }

    public int getMaxResponseSize() {
        return this.f68235f;
    }

    @Nullable
    public Integer getReadTimeout() {
        return this.f68231b;
    }

    @Nullable
    public SSLSocketFactory getSslSocketFactory() {
        return this.f68232c;
    }

    @Nullable
    public Boolean getUseCaches() {
        return this.f68233d;
    }

    @NonNull
    public Call newCall(@NonNull Request request) {
        return new c(this, request, new d());
    }

    public String toString() {
        return "NetworkClient{connectTimeout=" + this.f68230a + ", readTimeout=" + this.f68231b + ", sslSocketFactory=" + this.f68232c + ", useCaches=" + this.f68233d + ", instanceFollowRedirects=" + this.f68234e + ", maxResponseSize=" + this.f68235f + '}';
    }
}
