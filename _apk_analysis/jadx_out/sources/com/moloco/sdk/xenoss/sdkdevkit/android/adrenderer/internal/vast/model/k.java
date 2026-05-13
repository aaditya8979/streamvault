package com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.model;

import androidx.compose.runtime.internal.StabilityInferred;
import java.util.List;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes11.dex */
@StabilityInferred(parameters = 1)
public abstract class k {

    @StabilityInferred(parameters = 0)
    public static final class a extends k {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        @NotNull
        public final List<g> f49896a;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(@NotNull List<g> list) {
            super(null);
            tn.p.k(list, "companions");
            this.f49896a = list;
        }

        @NotNull
        public final List<g> a() {
            return this.f49896a;
        }
    }

    @StabilityInferred(parameters = 0)
    public static final class b extends k {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        @NotNull
        public final r f49897a;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public b(@NotNull r rVar) {
            super(null);
            tn.p.k(rVar, "linear");
            this.f49897a = rVar;
        }

        @NotNull
        public final r a() {
            return this.f49897a;
        }
    }

    public k() {
    }

    public /* synthetic */ k(tn.i iVar) {
        this();
    }
}
