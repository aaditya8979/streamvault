package com.ironsource;

import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: renamed from: com.ironsource.k7, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes10.dex */
public interface InterfaceC4106k7 {

    /* JADX INFO: renamed from: com.ironsource.k7$a */
    public interface a extends InterfaceC4106k7 {

        /* JADX INFO: renamed from: com.ironsource.k7$a$a, reason: collision with other inner class name */
        public static final class C0392a implements a {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            @NotNull
            private final Exception f32136a;

            public C0392a(@NotNull Exception exc) {
                tn.p.k(exc, "exception");
                this.f32136a = exc;
            }

            public static /* synthetic */ C0392a a(C0392a c0392a, Exception exc, int i10, Object obj) {
                if ((i10 & 1) != 0) {
                    exc = c0392a.f32136a;
                }
                return c0392a.a(exc);
            }

            @NotNull
            public final C0392a a(@NotNull Exception exc) {
                tn.p.k(exc, "exception");
                return new C0392a(exc);
            }

            @Override // com.ironsource.InterfaceC4106k7.a
            @NotNull
            public String a() {
                String message = this.f32136a.getMessage();
                if (message == null) {
                    message = "No message";
                }
                return "Exception - " + message;
            }

            @Override // com.ironsource.InterfaceC4106k7.a
            public boolean b() {
                return true;
            }

            @NotNull
            public final Exception c() {
                return this.f32136a;
            }

            @NotNull
            public final Exception d() {
                return this.f32136a;
            }

            public boolean equals(@Nullable Object obj) {
                if (this == obj) {
                    return true;
                }
                return (obj instanceof C0392a) && tn.p.f(this.f32136a, ((C0392a) obj).f32136a);
            }

            public int hashCode() {
                return this.f32136a.hashCode();
            }

            @NotNull
            public String toString() {
                return "Exception(exception=" + this.f32136a + ")";
            }
        }

        /* JADX INFO: renamed from: com.ironsource.k7$a$b */
        public static final class b implements a {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            private final int f32137a;

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            @Nullable
            private final String f32138b;

            public b(int i10, @Nullable String str) {
                this.f32137a = i10;
                this.f32138b = str;
            }

            public static /* synthetic */ b a(b bVar, int i10, String str, int i11, Object obj) {
                if ((i11 & 1) != 0) {
                    i10 = bVar.f32137a;
                }
                if ((i11 & 2) != 0) {
                    str = bVar.f32138b;
                }
                return bVar.a(i10, str);
            }

            @NotNull
            public final b a(int i10, @Nullable String str) {
                return new b(i10, str);
            }

            @Override // com.ironsource.InterfaceC4106k7.a
            @NotNull
            public String a() {
                int i10 = this.f32137a;
                String str = this.f32138b;
                if (str == null) {
                    str = "Unknown";
                }
                return "HTTP Error - Code: " + i10 + ", Message: " + str;
            }

            @Override // com.ironsource.InterfaceC4106k7.a
            public boolean b() {
                return this.f32137a != 400;
            }

            public final int c() {
                return this.f32137a;
            }

            @Nullable
            public final String d() {
                return this.f32138b;
            }

            public final int e() {
                return this.f32137a;
            }

            public boolean equals(@Nullable Object obj) {
                if (this == obj) {
                    return true;
                }
                if (!(obj instanceof b)) {
                    return false;
                }
                b bVar = (b) obj;
                return this.f32137a == bVar.f32137a && tn.p.f(this.f32138b, bVar.f32138b);
            }

            @Nullable
            public final String f() {
                return this.f32138b;
            }

            public int hashCode() {
                int iHashCode = Integer.hashCode(this.f32137a) * 31;
                String str = this.f32138b;
                return iHashCode + (str == null ? 0 : str.hashCode());
            }

            @NotNull
            public String toString() {
                return "HttpError(errorCode=" + this.f32137a + ", errorMessage=" + this.f32138b + ")";
            }
        }

        /* JADX INFO: renamed from: com.ironsource.k7$a$c */
        public static final class c implements a {
            @Override // com.ironsource.InterfaceC4106k7.a
            @NotNull
            public String a() {
                return "Parse Error - Unable to parse the response";
            }

            @Override // com.ironsource.InterfaceC4106k7.a
            public boolean b() {
                return true;
            }
        }

        @NotNull
        String a();

        boolean b();
    }

    /* JADX INFO: renamed from: com.ironsource.k7$b */
    public static final class b implements InterfaceC4106k7 {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        @NotNull
        private final String f32139a;

        public b(@NotNull String str) {
            tn.p.k(str, "response");
            this.f32139a = str;
        }

        public static /* synthetic */ b a(b bVar, String str, int i10, Object obj) {
            if ((i10 & 1) != 0) {
                str = bVar.f32139a;
            }
            return bVar.a(str);
        }

        @NotNull
        public final b a(@NotNull String str) {
            tn.p.k(str, "response");
            return new b(str);
        }

        @NotNull
        public final String c() {
            return this.f32139a;
        }

        @NotNull
        public final String d() {
            return this.f32139a;
        }

        public boolean equals(@Nullable Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof b) && tn.p.f(this.f32139a, ((b) obj).f32139a);
        }

        public int hashCode() {
            return this.f32139a.hashCode();
        }

        @NotNull
        public String toString() {
            return "Success(response=" + this.f32139a + ")";
        }
    }
}
