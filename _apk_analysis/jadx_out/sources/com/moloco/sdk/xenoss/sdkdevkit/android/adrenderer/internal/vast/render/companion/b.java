package com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.render.companion;

import androidx.compose.runtime.internal.StabilityInferred;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import tn.p;

/* JADX INFO: loaded from: classes5.dex */
@StabilityInferred(parameters = 1)
public abstract class b {

    @StabilityInferred(parameters = 1)
    public static final class a extends b {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        @NotNull
        public static final a f50085a = new a();

        public a() {
            super(null);
        }
    }

    /* JADX INFO: renamed from: com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.render.companion.b$b, reason: collision with other inner class name */
    @StabilityInferred(parameters = 1)
    public static final class C0666b extends b {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        @NotNull
        public static final C0666b f50086a = new C0666b();

        public C0666b() {
            super(null);
        }
    }

    @StabilityInferred(parameters = 1)
    public static final class c extends b {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        @NotNull
        public static final c f50087a = new c();

        public c() {
            super(null);
        }
    }

    @StabilityInferred(parameters = 0)
    public static final class d extends b {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        @NotNull
        public final com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.errors.c f50088a;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public d(@NotNull com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.errors.c cVar) {
            super(null);
            p.k(cVar, "error");
            this.f50088a = cVar;
        }

        @NotNull
        public final com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.errors.c a() {
            return this.f50088a;
        }

        public boolean equals(@Nullable Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof d) && p.f(this.f50088a, ((d) obj).f50088a);
        }

        public int hashCode() {
            return this.f50088a.hashCode();
        }

        @NotNull
        public String toString() {
            return "Error(error=" + this.f50088a + ')';
        }
    }

    public b() {
    }

    public /* synthetic */ b(tn.i iVar) {
        this();
    }
}
