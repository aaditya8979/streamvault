package com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.model;

import androidx.compose.runtime.internal.StabilityInferred;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes10.dex */
@StabilityInferred(parameters = 1)
public abstract class d {

    @StabilityInferred(parameters = 0)
    public static final class a extends d {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        @NotNull
        public final q f49870a;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(@NotNull q qVar) {
            super(null);
            tn.p.k(qVar, "inline");
            this.f49870a = qVar;
        }

        @NotNull
        public final q a() {
            return this.f49870a;
        }
    }

    @StabilityInferred(parameters = 0)
    public static final class b extends d {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        @NotNull
        public final com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.model.b f49871a;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public b(@NotNull com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.model.b bVar) {
            super(null);
            tn.p.k(bVar, "wrapper");
            this.f49871a = bVar;
        }

        @NotNull
        public final com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.model.b a() {
            return this.f49871a;
        }
    }

    public d() {
    }

    public /* synthetic */ d(tn.i iVar) {
        this();
    }
}
