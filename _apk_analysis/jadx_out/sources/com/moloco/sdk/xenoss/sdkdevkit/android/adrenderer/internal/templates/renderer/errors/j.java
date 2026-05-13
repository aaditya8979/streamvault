package com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.templates.renderer.errors;

import androidx.compose.runtime.internal.StabilityInferred;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes8.dex */
@StabilityInferred(parameters = 1)
public abstract class j extends h {

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    @NotNull
    public final String f48766h;

    @StabilityInferred(parameters = 1)
    public static final class a extends j {

        /* JADX INFO: renamed from: i, reason: collision with root package name */
        @NotNull
        public static final a f48767i = new a();

        public a() {
            super("net::ERR_CONNECTION_TIMED_OUT", null);
        }

        public boolean equals(@Nullable Object obj) {
            return this == obj || (obj instanceof a);
        }

        public int hashCode() {
            return -56384004;
        }

        @NotNull
        public String toString() {
            return "ERR_CONNECTION_TIMED_OUT";
        }
    }

    @StabilityInferred(parameters = 1)
    public static final class b extends j {

        /* JADX INFO: renamed from: i, reason: collision with root package name */
        @NotNull
        public static final b f48768i = new b();

        public b() {
            super("net::ERR_TIMED_OUT", null);
        }

        public boolean equals(@Nullable Object obj) {
            return this == obj || (obj instanceof b);
        }

        public int hashCode() {
            return 389383759;
        }

        @NotNull
        public String toString() {
            return "ERR_TIMED_OUT";
        }
    }

    public j(String str) {
        super(-8, str, true, false, false, 16, null);
        this.f48766h = str;
    }

    public /* synthetic */ j(String str, tn.i iVar) {
        this(str);
    }

    @Override // com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.templates.renderer.errors.h
    @NotNull
    public String c() {
        return this.f48766h;
    }
}
