package com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.render;

import androidx.compose.runtime.internal.StabilityInferred;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes.dex */
public interface d {

    @StabilityInferred(parameters = 1)
    public static abstract class a {

        /* JADX INFO: renamed from: com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.render.d$a$a, reason: collision with other inner class name */
        @StabilityInferred(parameters = 1)
        public static final class C0683a extends a {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            @NotNull
            public static final C0683a f50484a = new C0683a();

            public C0683a() {
                super(null);
            }
        }

        @StabilityInferred(parameters = 1)
        public static final class b extends a {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public final int f50485a;

            public b(int i10) {
                super(null);
                this.f50485a = i10;
            }

            public /* synthetic */ b(int i10, tn.i iVar) {
                this(i10);
            }

            public final int a() {
                return this.f50485a;
            }

            public boolean equals(@Nullable Object obj) {
                if (this == obj) {
                    return true;
                }
                return (obj instanceof b) && this.f50485a == ((b) obj).f50485a;
            }

            public int hashCode() {
                return bn.k.d(this.f50485a);
            }

            @NotNull
            public String toString() {
                return "Countdown(seconds=" + ((Object) bn.k.e(this.f50485a)) + ')';
            }
        }

        @StabilityInferred(parameters = 1)
        public static final class c extends a {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            @NotNull
            public static final c f50486a = new c();

            public c() {
                super(null);
            }
        }

        public a() {
        }

        public /* synthetic */ a(tn.i iVar) {
            this();
        }
    }

    @NotNull
    go.u<a> l();
}
