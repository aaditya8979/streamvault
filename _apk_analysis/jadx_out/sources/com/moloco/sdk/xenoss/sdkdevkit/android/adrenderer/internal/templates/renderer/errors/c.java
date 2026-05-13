package com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.templates.renderer.errors;

import androidx.compose.runtime.internal.StabilityInferred;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes8.dex */
@StabilityInferred(parameters = 1)
public abstract class c extends h {

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    @NotNull
    public final String f48746h;

    @StabilityInferred(parameters = 1)
    public static final class a extends c {

        /* JADX INFO: renamed from: i, reason: collision with root package name */
        @NotNull
        public static final a f48747i = new a();

        public a() {
            super("net::ERR_ADDRESS_UNREACHABLE", null);
        }

        public boolean equals(@Nullable Object obj) {
            return this == obj || (obj instanceof a);
        }

        public int hashCode() {
            return -557181147;
        }

        @NotNull
        public String toString() {
            return "ERR_ADDRESS_UNREACHABLE";
        }
    }

    @StabilityInferred(parameters = 1)
    public static final class b extends c {

        /* JADX INFO: renamed from: i, reason: collision with root package name */
        @NotNull
        public static final b f48748i = new b();

        public b() {
            super("net::ERR_INTERNET_DISCONNECTED", null);
        }

        public boolean equals(@Nullable Object obj) {
            return this == obj || (obj instanceof b);
        }

        public int hashCode() {
            return 909214677;
        }

        @NotNull
        public String toString() {
            return "ERR_INTERNET_DISCONNECTED";
        }
    }

    /* JADX INFO: renamed from: com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.templates.renderer.errors.c$c, reason: collision with other inner class name */
    @StabilityInferred(parameters = 1)
    public static final class C0635c extends c {

        /* JADX INFO: renamed from: i, reason: collision with root package name */
        @NotNull
        public static final C0635c f48749i = new C0635c();

        public C0635c() {
            super("net::ERR_NAME_NOT_RESOLVED", null);
        }

        public boolean equals(@Nullable Object obj) {
            return this == obj || (obj instanceof C0635c);
        }

        public int hashCode() {
            return -1297026924;
        }

        @NotNull
        public String toString() {
            return "ERR_NAME_NOT_RESOLVED";
        }
    }

    public c(String str) {
        super(-2, str, true, false, false, 16, null);
        this.f48746h = str;
    }

    public /* synthetic */ c(String str, tn.i iVar) {
        this(str);
    }

    @Override // com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.templates.renderer.errors.h
    @NotNull
    public String c() {
        return this.f48746h;
    }
}
