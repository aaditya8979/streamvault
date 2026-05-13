package com.moloco.sdk.internal.services;

import androidx.compose.runtime.internal.StabilityInferred;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes11.dex */
@StabilityInferred(parameters = 1)
public abstract class o {

    @StabilityInferred(parameters = 1)
    public static final class a extends o {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        @NotNull
        public final String f47534a;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(@NotNull String str) {
            super(null);
            tn.p.k(str, "id");
            this.f47534a = str;
        }

        @NotNull
        public final String a() {
            return this.f47534a;
        }

        public boolean equals(@Nullable Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof a) && tn.p.f(this.f47534a, ((a) obj).f47534a);
        }

        public int hashCode() {
            return this.f47534a.hashCode();
        }

        @NotNull
        public String toString() {
            return "Available(id=" + this.f47534a + ')';
        }
    }

    @StabilityInferred(parameters = 1)
    public static final class b extends o {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        @NotNull
        public static final b f47535a = new b();

        public b() {
            super(null);
        }
    }

    public o() {
    }

    public /* synthetic */ o(tn.i iVar) {
        this();
    }
}
