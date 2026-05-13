package com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.render.ad;

import androidx.compose.runtime.internal.StabilityInferred;
import com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.mraid.a0;
import com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.ui.r;
import com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.render.linear.m;
import go.u;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import tn.p;

/* JADX INFO: loaded from: classes2.dex */
public interface i extends com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.render.d, r {

    @StabilityInferred(parameters = 1)
    public static abstract class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final boolean f50066a;

        /* JADX INFO: renamed from: com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.render.ad.i$a$a, reason: collision with other inner class name */
        @StabilityInferred(parameters = 0)
        public static final class C0665a extends a {

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            @NotNull
            public final com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.render.companion.j f50067b;

            /* JADX INFO: renamed from: c, reason: collision with root package name */
            public final boolean f50068c;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public C0665a(@NotNull com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.render.companion.j jVar, boolean z10) {
                super(z10, null);
                p.k(jVar, "viewModel");
                this.f50067b = jVar;
                this.f50068c = z10;
            }

            @Override // com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.render.ad.i.a
            public boolean a() {
                return this.f50068c;
            }

            @NotNull
            public final com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.render.companion.j b() {
                return this.f50067b;
            }

            public boolean equals(@Nullable Object obj) {
                if (this == obj) {
                    return true;
                }
                if (!(obj instanceof C0665a)) {
                    return false;
                }
                C0665a c0665a = (C0665a) obj;
                return p.f(this.f50067b, c0665a.f50067b) && this.f50068c == c0665a.f50068c;
            }

            public int hashCode() {
                return (this.f50067b.hashCode() * 31) + Boolean.hashCode(this.f50068c);
            }

            @NotNull
            public String toString() {
                return "Companion(viewModel=" + this.f50067b + ", isLastAdPart=" + this.f50068c + ')';
            }
        }

        @StabilityInferred(parameters = 0)
        public static final class b extends a {

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            @NotNull
            public final com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.render.dec.e f50069b;

            /* JADX INFO: renamed from: c, reason: collision with root package name */
            public final boolean f50070c;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public b(@NotNull com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.render.dec.e eVar, boolean z10) {
                super(z10, null);
                p.k(eVar, "viewModel");
                this.f50069b = eVar;
                this.f50070c = z10;
            }

            @Override // com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.render.ad.i.a
            public boolean a() {
                return this.f50070c;
            }

            @NotNull
            public final com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.render.dec.e b() {
                return this.f50069b;
            }

            public boolean equals(@Nullable Object obj) {
                if (this == obj) {
                    return true;
                }
                if (!(obj instanceof b)) {
                    return false;
                }
                b bVar = (b) obj;
                return p.f(this.f50069b, bVar.f50069b) && this.f50070c == bVar.f50070c;
            }

            public int hashCode() {
                return (this.f50069b.hashCode() * 31) + Boolean.hashCode(this.f50070c);
            }

            @NotNull
            public String toString() {
                return "DEC(viewModel=" + this.f50069b + ", isLastAdPart=" + this.f50070c + ')';
            }
        }

        @StabilityInferred(parameters = 0)
        public static final class c extends a {

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            @NotNull
            public final m f50071b;

            /* JADX INFO: renamed from: c, reason: collision with root package name */
            public final boolean f50072c;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public c(@NotNull m mVar, boolean z10) {
                super(z10, null);
                p.k(mVar, "viewModel");
                this.f50071b = mVar;
                this.f50072c = z10;
            }

            @Override // com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.render.ad.i.a
            public boolean a() {
                return this.f50072c;
            }

            @NotNull
            public final m b() {
                return this.f50071b;
            }

            public boolean equals(@Nullable Object obj) {
                if (this == obj) {
                    return true;
                }
                if (!(obj instanceof c)) {
                    return false;
                }
                c cVar = (c) obj;
                return p.f(this.f50071b, cVar.f50071b) && this.f50072c == cVar.f50072c;
            }

            public int hashCode() {
                return (this.f50071b.hashCode() * 31) + Boolean.hashCode(this.f50072c);
            }

            @NotNull
            public String toString() {
                return "Linear(viewModel=" + this.f50071b + ", isLastAdPart=" + this.f50072c + ')';
            }
        }

        @StabilityInferred(parameters = 0)
        public static final class d extends a {

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            @NotNull
            public final a0 f50073b;

            /* JADX INFO: renamed from: c, reason: collision with root package name */
            public final boolean f50074c;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public d(@NotNull a0 a0Var, boolean z10) {
                super(z10, null);
                p.k(a0Var, "viewModel");
                this.f50073b = a0Var;
                this.f50074c = z10;
            }

            @Override // com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.render.ad.i.a
            public boolean a() {
                return this.f50074c;
            }

            public boolean equals(@Nullable Object obj) {
                if (this == obj) {
                    return true;
                }
                if (!(obj instanceof d)) {
                    return false;
                }
                d dVar = (d) obj;
                return p.f(this.f50073b, dVar.f50073b) && this.f50074c == dVar.f50074c;
            }

            public int hashCode() {
                return (this.f50073b.hashCode() * 31) + Boolean.hashCode(this.f50074c);
            }

            @NotNull
            public String toString() {
                return "Mraid(viewModel=" + this.f50073b + ", isLastAdPart=" + this.f50074c + ')';
            }
        }

        public a(boolean z10) {
            this.f50066a = z10;
        }

        public /* synthetic */ a(boolean z10, tn.i iVar) {
            this(z10);
        }

        public boolean a() {
            return this.f50066a;
        }
    }

    void A();

    @NotNull
    u<a> k();

    @NotNull
    u<Boolean> n();

    void x();

    void z();
}
