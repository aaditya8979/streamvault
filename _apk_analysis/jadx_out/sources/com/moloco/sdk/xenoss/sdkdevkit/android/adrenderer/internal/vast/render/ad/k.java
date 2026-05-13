package com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.render.ad;

import androidx.compose.runtime.internal.StabilityInferred;
import com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.mraid.b0;
import com.safedk.android.analytics.brandsafety.ImpressionLog;
import org.jetbrains.annotations.NotNull;
import tn.p;

/* JADX INFO: loaded from: classes2.dex */
@StabilityInferred(parameters = 1)
public abstract class k {

    @StabilityInferred(parameters = 0)
    public static final class a extends k {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        @NotNull
        public final com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.render.companion.a f50075a;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(@NotNull com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.render.companion.a aVar) {
            super(null);
            p.k(aVar, "companion");
            this.f50075a = aVar;
        }

        @NotNull
        public final com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.render.companion.a a() {
            return this.f50075a;
        }
    }

    @StabilityInferred(parameters = 0)
    public static final class b extends k {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        @NotNull
        public final com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.render.dec.a f50076a;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public b(@NotNull com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.render.dec.a aVar) {
            super(null);
            p.k(aVar, ImpressionLog.L);
            this.f50076a = aVar;
        }

        @NotNull
        public final com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.render.dec.a a() {
            return this.f50076a;
        }
    }

    @StabilityInferred(parameters = 0)
    public static final class c extends k {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        @NotNull
        public final com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.render.linear.c f50077a;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public c(@NotNull com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.render.linear.c cVar) {
            super(null);
            p.k(cVar, "linear");
            this.f50077a = cVar;
        }

        @NotNull
        public final com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.render.linear.c a() {
            return this.f50077a;
        }
    }

    @StabilityInferred(parameters = 0)
    public static final class d extends k {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        @NotNull
        public final b0 f50078a;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public d(@NotNull b0 b0Var) {
            super(null);
            p.k(b0Var, "mraid");
            this.f50078a = b0Var;
        }

        @NotNull
        public final b0 a() {
            return this.f50078a;
        }
    }

    public k() {
    }

    public /* synthetic */ k(tn.i iVar) {
        this();
    }
}
