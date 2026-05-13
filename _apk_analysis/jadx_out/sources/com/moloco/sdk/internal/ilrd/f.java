package com.moloco.sdk.internal.ilrd;

import androidx.compose.runtime.internal.StabilityInferred;
import com.moloco.sdk.k0;
import com.moloco.sdk.m0;
import go.u;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import tn.p;

/* JADX INFO: loaded from: classes10.dex */
public interface f {

    public interface a {

        /* JADX INFO: renamed from: com.moloco.sdk.internal.ilrd.f$a$a, reason: collision with other inner class name */
        @StabilityInferred(parameters = 1)
        public static final class C0563a implements a {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            @NotNull
            public final k0 f46200a;

            @NotNull
            public final k0 a() {
                return this.f46200a;
            }

            public boolean equals(@Nullable Object obj) {
                if (this == obj) {
                    return true;
                }
                return (obj instanceof C0563a) && p.f(this.f46200a, ((C0563a) obj).f46200a);
            }

            public int hashCode() {
                return this.f46200a.hashCode();
            }

            @NotNull
            public String toString() {
                return "LevelPlay(impression=" + this.f46200a + ')';
            }
        }

        @StabilityInferred(parameters = 1)
        public static final class b implements a {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            @NotNull
            public final m0 f46201a;

            public b(@NotNull m0 m0Var) {
                p.k(m0Var, "impression");
                this.f46201a = m0Var;
            }

            @NotNull
            public final m0 a() {
                return this.f46201a;
            }

            public boolean equals(@Nullable Object obj) {
                if (this == obj) {
                    return true;
                }
                return (obj instanceof b) && p.f(this.f46201a, ((b) obj).f46201a);
            }

            public int hashCode() {
                return this.f46201a.hashCode();
            }

            @NotNull
            public String toString() {
                return "Max(impression=" + this.f46201a + ')';
            }
        }
    }

    @NotNull
    com.moloco.sdk.internal.ilrd.model.a a();

    @NotNull
    Object b();

    @NotNull
    go.p<a> c();

    @NotNull
    u<i> getState();
}
