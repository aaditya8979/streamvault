package com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.ui.inlineInstall;

import androidx.compose.runtime.internal.StabilityInferred;
import com.inmobi.unification.sdk.InitializationStatus;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes10.dex */
@StabilityInferred(parameters = 1)
public abstract class n {

    @StabilityInferred(parameters = 1)
    public static final class a extends n {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        @NotNull
        public static final a f49020a = new a();

        public a() {
            super(null);
        }

        public boolean equals(@Nullable Object obj) {
            return this == obj || (obj instanceof a);
        }

        public int hashCode() {
            return 1425206400;
        }

        @NotNull
        public String toString() {
            return "Backgrounded";
        }
    }

    @StabilityInferred(parameters = 1)
    public static final class b extends n {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        @NotNull
        public static final b f49021a = new b();

        public b() {
            super(null);
        }

        public boolean equals(@Nullable Object obj) {
            return this == obj || (obj instanceof b);
        }

        public int hashCode() {
            return -296757611;
        }

        @NotNull
        public String toString() {
            return "Fallback";
        }
    }

    @StabilityInferred(parameters = 1)
    public static final class c extends n {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        @NotNull
        public static final c f49022a = new c();

        public c() {
            super(null);
        }

        public boolean equals(@Nullable Object obj) {
            return this == obj || (obj instanceof c);
        }

        public int hashCode() {
            return -1208562192;
        }

        @NotNull
        public String toString() {
            return InitializationStatus.SUCCESS;
        }
    }

    public n() {
    }

    public /* synthetic */ n(tn.i iVar) {
        this();
    }
}
