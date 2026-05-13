package com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.templates.renderer.errors;

import androidx.compose.runtime.internal.StabilityInferred;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes8.dex */
@StabilityInferred(parameters = 1)
public abstract class f extends h {

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    @NotNull
    public final String f48754h;

    @StabilityInferred(parameters = 1)
    public static final class a extends f {

        /* JADX INFO: renamed from: i, reason: collision with root package name */
        @NotNull
        public static final a f48755i = new a();

        public a() {
            super("net::ERR_SSL_BAD_RECORD_MAC_ALERT", null);
        }

        public boolean equals(@Nullable Object obj) {
            return this == obj || (obj instanceof a);
        }

        public int hashCode() {
            return 1157822157;
        }

        @NotNull
        public String toString() {
            return "ERR_SSL_BAD_RECORD_MAC_ALERT";
        }
    }

    @StabilityInferred(parameters = 1)
    public static final class b extends f {

        /* JADX INFO: renamed from: i, reason: collision with root package name */
        @NotNull
        public static final b f48756i = new b();

        public b() {
            super("net::ERR_SSL_PROTOCOL_ERROR", null);
        }

        public boolean equals(@Nullable Object obj) {
            return this == obj || (obj instanceof b);
        }

        public int hashCode() {
            return -715617482;
        }

        @NotNull
        public String toString() {
            return "ERR_SSL_PROTOCOL_ERROR";
        }
    }

    @StabilityInferred(parameters = 1)
    public static final class c extends f {

        /* JADX INFO: renamed from: i, reason: collision with root package name */
        @NotNull
        public static final c f48757i = new c();

        public c() {
            super("net::ERR_SSL_VERSION_OR_CIPHER_MISMATCH", null);
        }

        public boolean equals(@Nullable Object obj) {
            return this == obj || (obj instanceof c);
        }

        public int hashCode() {
            return 516103234;
        }

        @NotNull
        public String toString() {
            return "ERR_SSL_VERSION_OR_CIPHER_MISMATCH";
        }
    }

    public f(String str) {
        super(-11, str, false, true, false, 16, null);
        this.f48754h = str;
    }

    public /* synthetic */ f(String str, tn.i iVar) {
        this(str);
    }

    @Override // com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.templates.renderer.errors.h
    @NotNull
    public String c() {
        return this.f48754h;
    }
}
