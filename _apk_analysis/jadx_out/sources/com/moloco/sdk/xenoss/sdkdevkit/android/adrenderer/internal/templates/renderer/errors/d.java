package com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.templates.renderer.errors;

import androidx.compose.runtime.internal.StabilityInferred;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes8.dex */
@StabilityInferred(parameters = 1)
public abstract class d extends h {

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    @NotNull
    public final String f48750h;

    @StabilityInferred(parameters = 1)
    public static final class a extends d {

        /* JADX INFO: renamed from: i, reason: collision with root package name */
        @NotNull
        public static final a f48751i = new a();

        public a() {
            super("net::ERR_PROXY_CONNECTION_FAILED", null);
        }

        public boolean equals(@Nullable Object obj) {
            return this == obj || (obj instanceof a);
        }

        public int hashCode() {
            return 120626217;
        }

        @NotNull
        public String toString() {
            return "ERR_PROXY_CONNECTION_FAILED";
        }
    }

    public d(String str) {
        super(-5, str, false, true, false, 16, null);
        this.f48750h = str;
    }

    public /* synthetic */ d(String str, tn.i iVar) {
        this(str);
    }

    @Override // com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.templates.renderer.errors.h
    @NotNull
    public String c() {
        return this.f48750h;
    }
}
