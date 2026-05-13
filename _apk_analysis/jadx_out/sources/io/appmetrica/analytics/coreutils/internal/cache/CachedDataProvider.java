package io.appmetrica.analytics.coreutils.internal.cache;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.annotation.VisibleForTesting;

/* JADX INFO: loaded from: classes10.dex */
public interface CachedDataProvider {

    public static class CachedData<T> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final String f64729a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private volatile long f64730b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private volatile long f64731c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        private long f64732d = 0;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        private Object f64733e = null;

        public CachedData(long j10, long j11, @NonNull String str) {
            this.f64729a = String.format("[CachedData-%s]", str);
            this.f64730b = j10;
            this.f64731c = j11;
        }

        @Nullable
        public T getData() {
            return (T) this.f64733e;
        }

        @VisibleForTesting
        public long getExpiryTime() {
            return this.f64731c;
        }

        @VisibleForTesting
        public long getRefreshTime() {
            return this.f64730b;
        }

        public final boolean isEmpty() {
            return this.f64733e == null;
        }

        public void setData(@Nullable T t10) {
            this.f64733e = t10;
            this.f64732d = System.currentTimeMillis();
        }

        public void setExpirationPolicy(long j10, long j11) {
            this.f64730b = j10;
            this.f64731c = j11;
        }

        public final boolean shouldClearData() {
            if (this.f64732d == 0) {
                return false;
            }
            long jCurrentTimeMillis = System.currentTimeMillis() - this.f64732d;
            return jCurrentTimeMillis > this.f64731c || jCurrentTimeMillis < 0;
        }

        public final boolean shouldUpdateData() {
            long jCurrentTimeMillis = System.currentTimeMillis() - this.f64732d;
            return jCurrentTimeMillis > this.f64730b || jCurrentTimeMillis < 0;
        }

        @NonNull
        public String toString() {
            return "CachedData{tag='" + this.f64729a + "', refreshTime=" + this.f64730b + ", expiryTime=" + this.f64731c + ", mCachedTime=" + this.f64732d + ", mCachedData=" + this.f64733e + '}';
        }
    }
}
