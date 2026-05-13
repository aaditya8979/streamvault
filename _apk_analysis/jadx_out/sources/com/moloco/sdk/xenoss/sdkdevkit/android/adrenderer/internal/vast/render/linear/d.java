package com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.render.linear;

import androidx.compose.runtime.internal.StabilityInferred;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import tn.p;

/* JADX INFO: loaded from: classes5.dex */
@StabilityInferred(parameters = 1)
public abstract class d {

    @StabilityInferred(parameters = 1)
    public static final class a extends d {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        @NotNull
        public static final a f50585a = new a();

        public a() {
            super(null);
        }
    }

    @StabilityInferred(parameters = 1)
    public static final class b extends d {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        @NotNull
        public static final b f50586a = new b();

        public b() {
            super(null);
        }
    }

    @StabilityInferred(parameters = 1)
    public static final class c extends d {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        @NotNull
        public static final c f50587a = new c();

        public c() {
            super(null);
        }
    }

    /* JADX INFO: renamed from: com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.render.linear.d$d, reason: collision with other inner class name */
    @StabilityInferred(parameters = 1)
    public static final class C0684d extends d {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        @NotNull
        public final com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.errors.l f50588a;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C0684d(@NotNull com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.errors.l lVar) {
            super(null);
            p.k(lVar, "error");
            this.f50588a = lVar;
        }

        @NotNull
        public final com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.errors.l a() {
            return this.f50588a;
        }

        public boolean equals(@Nullable Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof C0684d) && this.f50588a == ((C0684d) obj).f50588a;
        }

        public int hashCode() {
            return this.f50588a.hashCode();
        }

        @NotNull
        public String toString() {
            return "Error(error=" + this.f50588a + ')';
        }
    }

    @StabilityInferred(parameters = 1)
    public static final class e extends d {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        @NotNull
        public static final e f50589a = new e();

        public e() {
            super(null);
        }
    }

    public d() {
    }

    public /* synthetic */ d(tn.i iVar) {
        this();
    }
}
