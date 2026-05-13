package com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.templates.renderer.errors;

import androidx.compose.runtime.internal.StabilityInferred;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes8.dex */
@StabilityInferred(parameters = 1)
public abstract class m extends h {

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    @NotNull
    public final String f48780h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final boolean f48781i;

    @StabilityInferred(parameters = 1)
    public static final class a extends m {

        /* JADX INFO: renamed from: j, reason: collision with root package name */
        @NotNull
        public static final a f48782j = new a();

        public a() {
            super("net::ERR_BLOCKED_BY_ORTB", false, 2, null);
        }

        public boolean equals(@Nullable Object obj) {
            return this == obj || (obj instanceof a);
        }

        public int hashCode() {
            return 2086682310;
        }

        @NotNull
        public String toString() {
            return "ERR_BLOCKED_BY_ORTB";
        }
    }

    @StabilityInferred(parameters = 1)
    public static final class b extends m {

        /* JADX INFO: renamed from: j, reason: collision with root package name */
        @NotNull
        public static final b f48783j = new b();

        public b() {
            super("net::ERR_CLEARTEXT_NOT_PERMITTED", false, 2, null);
        }

        public boolean equals(@Nullable Object obj) {
            return this == obj || (obj instanceof b);
        }

        public int hashCode() {
            return -1499225977;
        }

        @NotNull
        public String toString() {
            return "ERR_CLEARTEXT_NOT_PERMITTED";
        }
    }

    @StabilityInferred(parameters = 1)
    public static final class c extends m {

        /* JADX INFO: renamed from: j, reason: collision with root package name */
        @NotNull
        public static final c f48784j = new c();

        public c() {
            super("net::ERR_FAILED", true, null);
        }

        public boolean equals(@Nullable Object obj) {
            return this == obj || (obj instanceof c);
        }

        public int hashCode() {
            return 1678282877;
        }

        @NotNull
        public String toString() {
            return "ERR_FAILED";
        }
    }

    @StabilityInferred(parameters = 1)
    public static final class d extends m {

        /* JADX INFO: renamed from: j, reason: collision with root package name */
        @NotNull
        public static final d f48785j = new d();

        public d() {
            super("net::ERR_HTTP2_PING_FAILED", false, 2, null);
        }

        public boolean equals(@Nullable Object obj) {
            return this == obj || (obj instanceof d);
        }

        public int hashCode() {
            return 505018197;
        }

        @NotNull
        public String toString() {
            return "ERR_HTTP2_PING_FAILED";
        }
    }

    @StabilityInferred(parameters = 1)
    public static final class e extends m {

        /* JADX INFO: renamed from: j, reason: collision with root package name */
        @NotNull
        public static final e f48786j = new e();

        public e() {
            super("net::ERR_HTTP2_PROTOCOL_ERROR", false, 2, null);
        }

        public boolean equals(@Nullable Object obj) {
            return this == obj || (obj instanceof e);
        }

        public int hashCode() {
            return 1437709814;
        }

        @NotNull
        public String toString() {
            return "ERR_HTTP2_PROTOCOL_ERROR";
        }
    }

    @StabilityInferred(parameters = 1)
    public static final class f extends m {

        /* JADX INFO: renamed from: j, reason: collision with root package name */
        @NotNull
        public static final f f48787j = new f();

        public f() {
            super("net::ERR_NETWORK_CHANGED", false, 2, null);
        }

        public boolean equals(@Nullable Object obj) {
            return this == obj || (obj instanceof f);
        }

        public int hashCode() {
            return -1485714141;
        }

        @NotNull
        public String toString() {
            return "ERR_NETWORK_CHANGED";
        }
    }

    @StabilityInferred(parameters = 1)
    public static final class g extends m {

        /* JADX INFO: renamed from: j, reason: collision with root package name */
        @NotNull
        public static final g f48788j = new g();

        public g() {
            super("net::ERR_QUIC_PROTOCOL_ERROR", false, 2, null);
        }

        public boolean equals(@Nullable Object obj) {
            return this == obj || (obj instanceof g);
        }

        public int hashCode() {
            return -1472226974;
        }

        @NotNull
        public String toString() {
            return "ERR_QUIC_PROTOCOL_ERROR";
        }
    }

    public m(String str, boolean z10) {
        super(-1, str, true, false, z10, null);
        this.f48780h = str;
        this.f48781i = z10;
    }

    public /* synthetic */ m(String str, boolean z10, int i10, tn.i iVar) {
        this(str, (i10 & 2) != 0 ? false : z10, null);
    }

    public /* synthetic */ m(String str, boolean z10, tn.i iVar) {
        this(str, z10);
    }

    @Override // com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.templates.renderer.errors.h
    @NotNull
    public String c() {
        return this.f48780h;
    }

    @Override // com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.templates.renderer.errors.h
    public boolean d() {
        return this.f48781i;
    }
}
