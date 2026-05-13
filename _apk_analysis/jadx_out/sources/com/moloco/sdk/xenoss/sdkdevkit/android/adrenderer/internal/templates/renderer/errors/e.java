package com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.templates.renderer.errors;

import androidx.compose.runtime.internal.StabilityInferred;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes8.dex */
@StabilityInferred(parameters = 1)
public abstract class e extends h {

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    @NotNull
    public final String f48752h;

    @StabilityInferred(parameters = 1)
    public static final class a extends e {

        /* JADX INFO: renamed from: i, reason: collision with root package name */
        @NotNull
        public static final a f48753i = new a();

        public a() {
            super("net::ERR_TOO_MANY_REDIRECTS", null);
        }

        public boolean equals(@Nullable Object obj) {
            return this == obj || (obj instanceof a);
        }

        public int hashCode() {
            return -1800342769;
        }

        @NotNull
        public String toString() {
            return "ERR_TOO_MANY_REDIRECTS";
        }
    }

    public e(String str) {
        super(-9, str, true, true, false, 16, null);
        this.f48752h = str;
    }

    public /* synthetic */ e(String str, tn.i iVar) {
        this(str);
    }

    @Override // com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.templates.renderer.errors.h
    @NotNull
    public String c() {
        return this.f48752h;
    }
}
