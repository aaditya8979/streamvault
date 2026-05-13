package io.ktor.util;

import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import tn.i;

/* JADX INFO: compiled from: PlatformUtils.kt */
/* JADX INFO: loaded from: classes8.dex */
public abstract class Platform {

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    /* JADX INFO: compiled from: PlatformUtils.kt */
    public static final class JsPlatform {
        public static final JsPlatform Browser = new JsPlatform("Browser", 0);
        public static final JsPlatform Node = new JsPlatform("Node", 1);

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public static final /* synthetic */ JsPlatform[] f71207b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public static final /* synthetic */ kn.a f71208c;

        static {
            JsPlatform[] jsPlatformArrD = d();
            f71207b = jsPlatformArrD;
            f71208c = kotlin.enums.a.a(jsPlatformArrD);
        }

        public JsPlatform(String str, int i10) {
        }

        public static final /* synthetic */ JsPlatform[] d() {
            return new JsPlatform[]{Browser, Node};
        }

        @NotNull
        public static kn.a<JsPlatform> getEntries() {
            return f71208c;
        }

        public static JsPlatform valueOf(String str) {
            return (JsPlatform) Enum.valueOf(JsPlatform.class, str);
        }

        public static JsPlatform[] values() {
            return (JsPlatform[]) f71207b.clone();
        }
    }

    /* JADX INFO: compiled from: PlatformUtils.kt */
    public static final class a extends Platform {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        @NotNull
        public final JsPlatform f71209a;

        @NotNull
        public final JsPlatform a() {
            return this.f71209a;
        }

        public boolean equals(@Nullable Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof a) && this.f71209a == ((a) obj).f71209a;
        }

        public int hashCode() {
            return this.f71209a.hashCode();
        }

        @NotNull
        public String toString() {
            return "Js(jsPlatform=" + this.f71209a + ')';
        }
    }

    /* JADX INFO: compiled from: PlatformUtils.kt */
    public static final class b extends Platform {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        @NotNull
        public static final b f71210a = new b();

        public b() {
            super(null);
        }

        public boolean equals(@Nullable Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof b)) {
                return false;
            }
            return true;
        }

        public int hashCode() {
            return 1051825272;
        }

        @NotNull
        public String toString() {
            return "Jvm";
        }
    }

    /* JADX INFO: compiled from: PlatformUtils.kt */
    public static final class c extends Platform {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        @NotNull
        public static final c f71211a = new c();

        public c() {
            super(null);
        }

        public boolean equals(@Nullable Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof c)) {
                return false;
            }
            return true;
        }

        public int hashCode() {
            return -1059277600;
        }

        @NotNull
        public String toString() {
            return "Native";
        }
    }

    /* JADX INFO: compiled from: PlatformUtils.kt */
    public static final class d extends Platform {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        @NotNull
        public final JsPlatform f71212a;

        @NotNull
        public final JsPlatform a() {
            return this.f71212a;
        }

        public boolean equals(@Nullable Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof d) && this.f71212a == ((d) obj).f71212a;
        }

        public int hashCode() {
            return this.f71212a.hashCode();
        }

        @NotNull
        public String toString() {
            return "WasmJs(jsPlatform=" + this.f71212a + ')';
        }
    }

    public Platform() {
    }

    public /* synthetic */ Platform(i iVar) {
        this();
    }
}
