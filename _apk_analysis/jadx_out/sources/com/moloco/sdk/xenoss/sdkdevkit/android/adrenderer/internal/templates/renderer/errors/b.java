package com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.templates.renderer.errors;

import androidx.compose.runtime.internal.StabilityInferred;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes8.dex */
@StabilityInferred(parameters = 1)
public abstract class b extends h {

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    @NotNull
    public final String f48740h;

    @StabilityInferred(parameters = 1)
    public static final class a extends b {

        /* JADX INFO: renamed from: i, reason: collision with root package name */
        @NotNull
        public static final a f48741i = new a();

        public a() {
            super("net::ERR_CONNECTION_ABORTED", null);
        }

        public boolean equals(@Nullable Object obj) {
            return this == obj || (obj instanceof a);
        }

        public int hashCode() {
            return -262105110;
        }

        @NotNull
        public String toString() {
            return "ERR_CONNECTION_ABORTED";
        }
    }

    /* JADX INFO: renamed from: com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.templates.renderer.errors.b$b, reason: collision with other inner class name */
    @StabilityInferred(parameters = 1)
    public static final class C0634b extends b {

        /* JADX INFO: renamed from: i, reason: collision with root package name */
        @NotNull
        public static final C0634b f48742i = new C0634b();

        public C0634b() {
            super("net::ERR_CONNECTION_CLOSED", null);
        }

        public boolean equals(@Nullable Object obj) {
            return this == obj || (obj instanceof C0634b);
        }

        public int hashCode() {
            return -219055663;
        }

        @NotNull
        public String toString() {
            return "ERR_CONNECTION_CLOSED";
        }
    }

    @StabilityInferred(parameters = 1)
    public static final class c extends b {

        /* JADX INFO: renamed from: i, reason: collision with root package name */
        @NotNull
        public static final c f48743i = new c();

        public c() {
            super("net::ERR_CONNECTION_REFUSED", null);
        }

        public boolean equals(@Nullable Object obj) {
            return this == obj || (obj instanceof c);
        }

        public int hashCode() {
            return 2018219755;
        }

        @NotNull
        public String toString() {
            return "ERR_CONNECTION_REFUSED";
        }
    }

    @StabilityInferred(parameters = 1)
    public static final class d extends b {

        /* JADX INFO: renamed from: i, reason: collision with root package name */
        @NotNull
        public static final d f48744i = new d();

        public d() {
            super("net::ERR_CONNECTION_RESET", null);
        }

        public boolean equals(@Nullable Object obj) {
            return this == obj || (obj instanceof d);
        }

        public int hashCode() {
            return 976412714;
        }

        @NotNull
        public String toString() {
            return "ERR_CONNECTION_RESET";
        }
    }

    @StabilityInferred(parameters = 1)
    public static final class e extends b {

        /* JADX INFO: renamed from: i, reason: collision with root package name */
        @NotNull
        public static final e f48745i = new e();

        public e() {
            super("net::ERR_SOCKET_NOT_CONNECTED", null);
        }

        public boolean equals(@Nullable Object obj) {
            return this == obj || (obj instanceof e);
        }

        public int hashCode() {
            return 1961158189;
        }

        @NotNull
        public String toString() {
            return "ERR_SOCKET_NOT_CONNECTED";
        }
    }

    public b(String str) {
        super(-6, str, true, false, false, 16, null);
        this.f48740h = str;
    }

    public /* synthetic */ b(String str, tn.i iVar) {
        this(str);
    }

    @Override // com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.templates.renderer.errors.h
    @NotNull
    public String c() {
        return this.f48740h;
    }
}
