package com.moloco.sdk.internal.ilrd;

import androidx.compose.runtime.internal.StabilityInferred;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import tn.p;

/* JADX INFO: loaded from: classes9.dex */
@StabilityInferred(parameters = 1)
public abstract class i {

    @StabilityInferred(parameters = 1)
    public static final class a extends i {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        @NotNull
        public final String f46205a;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(@NotNull String str) {
            super(null);
            p.k(str, "reason");
            this.f46205a = str;
        }

        @NotNull
        public final String a() {
            return this.f46205a;
        }

        public boolean equals(@Nullable Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof a) && p.f(this.f46205a, ((a) obj).f46205a);
        }

        public int hashCode() {
            return this.f46205a.hashCode();
        }

        @NotNull
        public String toString() {
            return "Error(reason=" + this.f46205a + ')';
        }
    }

    @StabilityInferred(parameters = 1)
    public static final class b extends i {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        @NotNull
        public static final b f46206a = new b();

        public b() {
            super(null);
        }
    }

    @StabilityInferred(parameters = 1)
    public static final class c extends i {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        @NotNull
        public static final c f46207a = new c();

        public c() {
            super(null);
        }
    }

    public i() {
    }

    public /* synthetic */ i(tn.i iVar) {
        this();
    }
}
