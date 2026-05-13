package com.unity3d.ads.core.data.model;

import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import tn.i;
import tn.p;

/* JADX INFO: compiled from: CacheResult.kt */
/* JADX INFO: loaded from: classes9.dex */
public abstract class CacheResult {

    /* JADX INFO: compiled from: CacheResult.kt */
    public static final class Failure extends CacheResult {

        @NotNull
        private final CacheError error;

        @Nullable
        private final Throwable reason;

        @NotNull
        private final CacheSource source;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public Failure(@NotNull CacheError cacheError, @NotNull CacheSource cacheSource, @Nullable Throwable th2) {
            super(null);
            p.k(cacheError, "error");
            p.k(cacheSource, "source");
            this.error = cacheError;
            this.source = cacheSource;
            this.reason = th2;
        }

        public /* synthetic */ Failure(CacheError cacheError, CacheSource cacheSource, Throwable th2, int i10, i iVar) {
            this(cacheError, (i10 & 2) != 0 ? CacheSource.LOCAL : cacheSource, (i10 & 4) != 0 ? null : th2);
        }

        public static /* synthetic */ Failure copy$default(Failure failure, CacheError cacheError, CacheSource cacheSource, Throwable th2, int i10, Object obj) {
            if ((i10 & 1) != 0) {
                cacheError = failure.error;
            }
            if ((i10 & 2) != 0) {
                cacheSource = failure.source;
            }
            if ((i10 & 4) != 0) {
                th2 = failure.reason;
            }
            return failure.copy(cacheError, cacheSource, th2);
        }

        @NotNull
        public final CacheError component1() {
            return this.error;
        }

        @NotNull
        public final CacheSource component2() {
            return this.source;
        }

        @Nullable
        public final Throwable component3() {
            return this.reason;
        }

        @NotNull
        public final Failure copy(@NotNull CacheError cacheError, @NotNull CacheSource cacheSource, @Nullable Throwable th2) {
            p.k(cacheError, "error");
            p.k(cacheSource, "source");
            return new Failure(cacheError, cacheSource, th2);
        }

        public boolean equals(@Nullable Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof Failure)) {
                return false;
            }
            Failure failure = (Failure) obj;
            return this.error == failure.error && this.source == failure.source && p.f(this.reason, failure.reason);
        }

        @NotNull
        public final CacheError getError() {
            return this.error;
        }

        @Nullable
        public final Throwable getReason() {
            return this.reason;
        }

        @NotNull
        public final CacheSource getSource() {
            return this.source;
        }

        public int hashCode() {
            int iHashCode = ((this.error.hashCode() * 31) + this.source.hashCode()) * 31;
            Throwable th2 = this.reason;
            return iHashCode + (th2 == null ? 0 : th2.hashCode());
        }

        @NotNull
        public String toString() {
            return "Failure(error=" + this.error + ", source=" + this.source + ", reason=" + this.reason + ')';
        }
    }

    /* JADX INFO: compiled from: CacheResult.kt */
    public static final class Success extends CacheResult {

        @NotNull
        private final CachedFile cachedFile;

        @NotNull
        private final CacheSource source;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public Success(@NotNull CachedFile cachedFile, @NotNull CacheSource cacheSource) {
            super(null);
            p.k(cachedFile, "cachedFile");
            p.k(cacheSource, "source");
            this.cachedFile = cachedFile;
            this.source = cacheSource;
        }

        public static /* synthetic */ Success copy$default(Success success, CachedFile cachedFile, CacheSource cacheSource, int i10, Object obj) {
            if ((i10 & 1) != 0) {
                cachedFile = success.cachedFile;
            }
            if ((i10 & 2) != 0) {
                cacheSource = success.source;
            }
            return success.copy(cachedFile, cacheSource);
        }

        @NotNull
        public final CachedFile component1() {
            return this.cachedFile;
        }

        @NotNull
        public final CacheSource component2() {
            return this.source;
        }

        @NotNull
        public final Success copy(@NotNull CachedFile cachedFile, @NotNull CacheSource cacheSource) {
            p.k(cachedFile, "cachedFile");
            p.k(cacheSource, "source");
            return new Success(cachedFile, cacheSource);
        }

        public boolean equals(@Nullable Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof Success)) {
                return false;
            }
            Success success = (Success) obj;
            return p.f(this.cachedFile, success.cachedFile) && this.source == success.source;
        }

        @NotNull
        public final CachedFile getCachedFile() {
            return this.cachedFile;
        }

        @NotNull
        public final CacheSource getSource() {
            return this.source;
        }

        public int hashCode() {
            return (this.cachedFile.hashCode() * 31) + this.source.hashCode();
        }

        @NotNull
        public String toString() {
            return "Success(cachedFile=" + this.cachedFile + ", source=" + this.source + ')';
        }
    }

    private CacheResult() {
    }

    public /* synthetic */ CacheResult(i iVar) {
        this();
    }
}
