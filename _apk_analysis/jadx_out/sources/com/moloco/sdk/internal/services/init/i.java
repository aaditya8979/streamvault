package com.moloco.sdk.internal.services.init;

import androidx.compose.runtime.internal.StabilityInferred;
import org.jetbrains.annotations.NotNull;
import tn.p;

/* JADX INFO: loaded from: classes9.dex */
@StabilityInferred(parameters = 1)
public abstract class i {

    @StabilityInferred(parameters = 1)
    public static final class a extends i {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        @NotNull
        public final com.moloco.sdk.internal.services.init.b f47490a;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(@NotNull com.moloco.sdk.internal.services.init.b bVar) {
            super(null);
            p.k(bVar, "type");
            this.f47490a = bVar;
        }

        @NotNull
        public final com.moloco.sdk.internal.services.init.b a() {
            return this.f47490a;
        }
    }

    @StabilityInferred(parameters = 1)
    public static final class b extends i {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final int f47491a;

        public b(int i10) {
            super(null);
            this.f47491a = i10;
        }

        public final int a() {
            return this.f47491a;
        }
    }

    public i() {
    }

    public /* synthetic */ i(tn.i iVar) {
        this();
    }
}
