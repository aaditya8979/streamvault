package com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.templates.renderer.errors;

import androidx.compose.runtime.internal.StabilityInferred;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes7.dex */
@StabilityInferred(parameters = 1)
public abstract class a extends h {

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    @NotNull
    public final String f48738h;

    /* JADX INFO: renamed from: com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.templates.renderer.errors.a$a, reason: collision with other inner class name */
    @StabilityInferred(parameters = 1)
    public static final class C0633a extends a {

        /* JADX INFO: renamed from: i, reason: collision with root package name */
        @NotNull
        public static final C0633a f48739i = new C0633a();

        public C0633a() {
            super("net::ERR_CERT_AUTHORITY_INVALID", null);
        }

        public boolean equals(@Nullable Object obj) {
            return this == obj || (obj instanceof C0633a);
        }

        public int hashCode() {
            return -932810174;
        }

        @NotNull
        public String toString() {
            return "ERR_CERT_AUTHORITY_INVALID";
        }
    }

    public a(String str) {
        super(0, str, false, true, false, 16, null);
        this.f48738h = str;
    }

    public /* synthetic */ a(String str, tn.i iVar) {
        this(str);
    }

    @Override // com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.templates.renderer.errors.h
    @NotNull
    public String c() {
        return this.f48738h;
    }
}
