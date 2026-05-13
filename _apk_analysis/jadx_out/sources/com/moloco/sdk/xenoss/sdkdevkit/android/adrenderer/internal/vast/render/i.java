package com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.render;

import androidx.compose.runtime.internal.StabilityInferred;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes10.dex */
@StabilityInferred(parameters = 1)
public abstract class i {

    @StabilityInferred(parameters = 1)
    public static final class a extends i {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final long f50544a;

        public a(long j10) {
            super(null);
            this.f50544a = j10;
        }

        public final long a() {
            return this.f50544a;
        }
    }

    @StabilityInferred(parameters = 1)
    public static final class b extends i {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        @NotNull
        public static final b f50545a = new b();

        public b() {
            super(null);
        }
    }

    @StabilityInferred(parameters = 1)
    public static final class c extends i {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final long f50546a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final long f50547b;

        public c(long j10, long j11) {
            super(null);
            this.f50546a = j10;
            this.f50547b = j11;
        }

        public final long a() {
            return this.f50546a;
        }

        public final long b() {
            return this.f50547b;
        }

        public boolean equals(@Nullable Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof c)) {
                return false;
            }
            c cVar = (c) obj;
            return this.f50546a == cVar.f50546a && this.f50547b == cVar.f50547b;
        }

        public int hashCode() {
            return (Long.hashCode(this.f50546a) * 31) + Long.hashCode(this.f50547b);
        }

        @NotNull
        public String toString() {
            return "Position(currentPositionMillis=" + this.f50546a + ", totalDurationMillis=" + this.f50547b + ')';
        }
    }

    @StabilityInferred(parameters = 1)
    public static final class d extends i {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final long f50548a;

        public d(long j10) {
            super(null);
            this.f50548a = j10;
        }

        public final long a() {
            return this.f50548a;
        }

        public boolean equals(@Nullable Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof d) && this.f50548a == ((d) obj).f50548a;
        }

        public int hashCode() {
            return Long.hashCode(this.f50548a);
        }

        @NotNull
        public String toString() {
            return "Preparing(totalDurationMillis=" + this.f50548a + ')';
        }
    }

    public i() {
    }

    public /* synthetic */ i(tn.i iVar) {
        this();
    }
}
