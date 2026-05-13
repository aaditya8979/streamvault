package com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.templates.renderer.errors;

import androidx.compose.runtime.internal.StabilityInferred;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes8.dex */
@StabilityInferred(parameters = 1)
public abstract class k extends h {

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    @NotNull
    public final String f48769h;

    @StabilityInferred(parameters = 1)
    public static final class a extends k {

        /* JADX INFO: renamed from: i, reason: collision with root package name */
        @NotNull
        public static final a f48770i = new a();

        public a() {
            super("net::ERR_UNKNOWN_URL_SCHEME", null);
        }

        public boolean equals(@Nullable Object obj) {
            return this == obj || (obj instanceof a);
        }

        public int hashCode() {
            return 284504500;
        }

        @NotNull
        public String toString() {
            return "ERR_UNKNOWN_URL_SCHEME";
        }
    }

    public k(String str) {
        super(-10, str, false, true, false, 16, null);
        this.f48769h = str;
    }

    public /* synthetic */ k(String str, tn.i iVar) {
        this(str);
    }

    @Override // com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.templates.renderer.errors.h
    @NotNull
    public String c() {
        return this.f48769h;
    }
}
