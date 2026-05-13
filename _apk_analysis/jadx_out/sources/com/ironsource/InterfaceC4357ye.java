package com.ironsource;

import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: renamed from: com.ironsource.ye, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes10.dex */
public interface InterfaceC4357ye {

    /* JADX INFO: renamed from: com.ironsource.ye$a */
    public static final class a implements InterfaceC4357ye {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        @NotNull
        private final C4169ne f34465a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        @Nullable
        private final String f34466b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        @Nullable
        private final String f34467c;

        public a(@NotNull C4169ne c4169ne, @Nullable String str, @Nullable String str2) {
            tn.p.k(c4169ne, "error");
            this.f34465a = c4169ne;
            this.f34466b = str;
            this.f34467c = str2;
        }

        public /* synthetic */ a(C4169ne c4169ne, String str, String str2, int i10, tn.i iVar) {
            this(c4169ne, (i10 & 2) != 0 ? null : str, (i10 & 4) != 0 ? null : str2);
        }

        public static /* synthetic */ a a(a aVar, C4169ne c4169ne, String str, String str2, int i10, Object obj) {
            if ((i10 & 1) != 0) {
                c4169ne = aVar.f34465a;
            }
            if ((i10 & 2) != 0) {
                str = aVar.f34466b;
            }
            if ((i10 & 4) != 0) {
                str2 = aVar.f34467c;
            }
            return aVar.a(c4169ne, str, str2);
        }

        @NotNull
        public final C4169ne a() {
            return this.f34465a;
        }

        @NotNull
        public final a a(@NotNull C4169ne c4169ne, @Nullable String str, @Nullable String str2) {
            tn.p.k(c4169ne, "error");
            return new a(c4169ne, str, str2);
        }

        @Nullable
        public final String b() {
            return this.f34466b;
        }

        @Nullable
        public final String c() {
            return this.f34467c;
        }

        @NotNull
        public final C4169ne d() {
            return this.f34465a;
        }

        @Nullable
        public final String e() {
            return this.f34467c;
        }

        public boolean equals(@Nullable Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof a)) {
                return false;
            }
            a aVar = (a) obj;
            return tn.p.f(this.f34465a, aVar.f34465a) && tn.p.f(this.f34466b, aVar.f34466b) && tn.p.f(this.f34467c, aVar.f34467c);
        }

        @Nullable
        public final String f() {
            return this.f34466b;
        }

        public int hashCode() {
            int iHashCode = this.f34465a.hashCode() * 31;
            String str = this.f34466b;
            int iHashCode2 = (iHashCode + (str == null ? 0 : str.hashCode())) * 31;
            String str2 = this.f34467c;
            return iHashCode2 + (str2 != null ? str2.hashCode() : 0);
        }

        @NotNull
        public String toString() {
            return "Failure(error=" + this.f34465a + ", url=" + this.f34466b + ", json=" + this.f34467c + ")";
        }
    }

    /* JADX INFO: renamed from: com.ironsource.ye$b */
    public static final class b implements InterfaceC4357ye {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        @NotNull
        private final C4289ue f34468a;

        public b(@NotNull C4289ue c4289ue) {
            tn.p.k(c4289ue, "sdkInitResponse");
            this.f34468a = c4289ue;
        }

        public static /* synthetic */ b a(b bVar, C4289ue c4289ue, int i10, Object obj) {
            if ((i10 & 1) != 0) {
                c4289ue = bVar.f34468a;
            }
            return bVar.a(c4289ue);
        }

        @NotNull
        public final C4289ue a() {
            return this.f34468a;
        }

        @NotNull
        public final b a(@NotNull C4289ue c4289ue) {
            tn.p.k(c4289ue, "sdkInitResponse");
            return new b(c4289ue);
        }

        @NotNull
        public final C4289ue b() {
            return this.f34468a;
        }

        public boolean equals(@Nullable Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof b) && tn.p.f(this.f34468a, ((b) obj).f34468a);
        }

        public int hashCode() {
            return this.f34468a.hashCode();
        }

        @NotNull
        public String toString() {
            return "Success(sdkInitResponse=" + this.f34468a + ")";
        }
    }
}
