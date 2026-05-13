package com.ironsource;

import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: renamed from: com.ironsource.j0, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes12.dex */
public interface InterfaceC4081j0 {

    /* JADX INFO: renamed from: com.ironsource.j0$a */
    public static final class a implements InterfaceC4081j0 {

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        @NotNull
        public static final C0389a f31975c = new C0389a(null);

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        @Nullable
        private final String f31976a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private final boolean f31977b;

        /* JADX INFO: renamed from: com.ironsource.j0$a$a, reason: collision with other inner class name */
        public static final class C0389a {
            private C0389a() {
            }

            public /* synthetic */ C0389a(tn.i iVar) {
                this();
            }

            @NotNull
            public final a a(@Nullable String str) {
                return new a(str);
            }
        }

        /* JADX WARN: Multi-variable type inference failed */
        public a() {
            this(null, 1, 0 == true ? 1 : 0);
        }

        public a(@Nullable String str) {
            this.f31976a = str;
        }

        public /* synthetic */ a(String str, int i10, tn.i iVar) {
            this((i10 & 1) != 0 ? null : str);
        }

        public static /* synthetic */ a a(a aVar, String str, int i10, Object obj) {
            if ((i10 & 1) != 0) {
                str = aVar.f31976a;
            }
            return aVar.a(str);
        }

        @NotNull
        public final a a(@Nullable String str) {
            return new a(str);
        }

        @Override // com.ironsource.InterfaceC4081j0
        public boolean a() {
            return this.f31977b;
        }

        @Nullable
        public final String b() {
            return this.f31976a;
        }

        @Nullable
        public final String c() {
            return this.f31976a;
        }

        public boolean equals(@Nullable Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof a) && tn.p.f(this.f31976a, ((a) obj).f31976a);
        }

        public int hashCode() {
            String str = this.f31976a;
            if (str == null) {
                return 0;
            }
            return str.hashCode();
        }

        @NotNull
        public String toString() {
            return "NotReady(reason=" + this.f31976a + ")";
        }
    }

    /* JADX INFO: renamed from: com.ironsource.j0$b */
    public static final class b implements InterfaceC4081j0 {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        @NotNull
        public static final b f31978a = new b();

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private static final boolean f31979b = true;

        private b() {
        }

        @Override // com.ironsource.InterfaceC4081j0
        public boolean a() {
            return f31979b;
        }
    }

    boolean a();
}
