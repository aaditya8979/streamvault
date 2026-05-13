package com.ironsource;

import com.ironsource.InterfaceC4265t7;
import java.util.LinkedHashMap;
import java.util.Map;
import kotlin.Result;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: renamed from: com.ironsource.of, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes8.dex */
public final class C4188of implements InterfaceC4265t7, InterfaceC4265t7.a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NotNull
    private final InterfaceC4262t4 f33158a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @NotNull
    private final T8 f33159b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @NotNull
    private final Map<String, C4132lf> f33160c;

    /* JADX INFO: renamed from: com.ironsource.of$a */
    public static final class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private int f33161a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private long f33162b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        @Nullable
        private Long f33163c;

        public a(int i10, long j10, @Nullable Long l10) {
            this.f33161a = i10;
            this.f33162b = j10;
            this.f33163c = l10;
        }

        public static /* synthetic */ a a(a aVar, int i10, long j10, Long l10, int i11, Object obj) {
            if ((i11 & 1) != 0) {
                i10 = aVar.f33161a;
            }
            if ((i11 & 2) != 0) {
                j10 = aVar.f33162b;
            }
            if ((i11 & 4) != 0) {
                l10 = aVar.f33163c;
            }
            return aVar.a(i10, j10, l10);
        }

        public final int a() {
            return this.f33161a;
        }

        @NotNull
        public final a a(int i10, long j10, @Nullable Long l10) {
            return new a(i10, j10, l10);
        }

        public final void a(int i10) {
            this.f33161a = i10;
        }

        public final void a(long j10) {
            this.f33162b = j10;
        }

        public final void a(@Nullable Long l10) {
            this.f33163c = l10;
        }

        public final long b() {
            return this.f33162b;
        }

        @Nullable
        public final Long c() {
            return this.f33163c;
        }

        public final int d() {
            return this.f33161a;
        }

        public final long e() {
            return this.f33162b;
        }

        public boolean equals(@Nullable Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof a)) {
                return false;
            }
            a aVar = (a) obj;
            return this.f33161a == aVar.f33161a && this.f33162b == aVar.f33162b && tn.p.f(this.f33163c, aVar.f33163c);
        }

        @Nullable
        public final Long f() {
            return this.f33163c;
        }

        public int hashCode() {
            int iHashCode = ((Integer.hashCode(this.f33161a) * 31) + Long.hashCode(this.f33162b)) * 31;
            Long l10 = this.f33163c;
            return iHashCode + (l10 == null ? 0 : l10.hashCode());
        }

        @NotNull
        public String toString() {
            return "ShowCountCappingInfo(currentNumberOfShows=" + this.f33161a + ", currentTime=" + this.f33162b + ", currentTimeThreshold=" + this.f33163c + ")";
        }
    }

    public C4188of(@NotNull InterfaceC4262t4 interfaceC4262t4, @NotNull T8 t82) {
        tn.p.k(interfaceC4262t4, "currentTimeProvider");
        tn.p.k(t82, "serviceDataRepository");
        this.f33158a = interfaceC4262t4;
        this.f33159b = t82;
        this.f33160c = new LinkedHashMap();
    }

    private final boolean a(C4132lf c4132lf, String str) {
        a aVarC = c(str);
        Long lF = aVarC.f();
        if (lF != null) {
            return aVarC.d() >= c4132lf.a() && this.f33158a.a() < lF.longValue();
        }
        return false;
    }

    private final a c(String str) {
        return new a(this.f33159b.a(str), this.f33158a.a(), this.f33159b.b(str));
    }

    @Override // com.ironsource.InterfaceC4265t7
    @NotNull
    public M3 a(@NotNull String str) {
        tn.p.k(str, "identifier");
        C4132lf c4132lf = this.f33160c.get(str);
        if (c4132lf != null && a(c4132lf, str)) {
            return new M3(true, O3.ShowCount);
        }
        return new M3(false, null, 2, null);
    }

    @Override // com.ironsource.InterfaceC4265t7.a
    @NotNull
    public Object a(@NotNull String str, @NotNull O3 o32, @NotNull InterfaceC4231r7 interfaceC4231r7) {
        tn.p.k(str, "identifier");
        tn.p.k(o32, "cappingType");
        tn.p.k(interfaceC4231r7, "cappingConfig");
        Object objC = interfaceC4231r7.c();
        if (!Result.m7540isSuccessimpl(objC)) {
            Throwable thM7537exceptionOrNullimpl = Result.m7537exceptionOrNullimpl(objC);
            return thM7537exceptionOrNullimpl != null ? Result.m7534constructorimpl(kotlin.c.a(thM7537exceptionOrNullimpl)) : Result.m7534constructorimpl(bn.r.f5635a);
        }
        C4132lf c4132lf = (C4132lf) objC;
        if (c4132lf != null) {
            this.f33160c.put(str, c4132lf);
        }
        return Result.m7534constructorimpl(bn.r.f5635a);
    }

    @NotNull
    public final Map<String, C4132lf> a() {
        return this.f33160c;
    }

    /* JADX WARN: Removed duplicated region for block: B:13:0x0030  */
    @Override // com.ironsource.InterfaceC4265t7.a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public void b(@org.jetbrains.annotations.NotNull java.lang.String r9) {
        /*
            r8 = this;
            java.lang.String r0 = "identifier"
            tn.p.k(r9, r0)
            java.util.Map<java.lang.String, com.ironsource.lf> r0 = r8.f33160c
            java.lang.Object r0 = r0.get(r9)
            com.ironsource.lf r0 = (com.ironsource.C4132lf) r0
            if (r0 != 0) goto L10
            return
        L10:
            com.ironsource.of$a r1 = r8.c(r9)
            int r2 = r1.d()
            r3 = 1
            if (r2 == 0) goto L30
            long r4 = r1.e()
            java.lang.Long r2 = r1.f()
            if (r2 == 0) goto L2a
            long r6 = r2.longValue()
            goto L2c
        L2a:
            r6 = 0
        L2c:
            int r2 = (r4 > r6 ? 1 : (r4 == r6 ? 0 : -1))
            if (r2 < 0) goto L47
        L30:
            long r4 = r1.e()
            com.ironsource.N3 r0 = r0.b()
            r2 = 0
            long r6 = com.ironsource.N3.a(r0, r2, r3, r2)
            long r4 = r4 + r6
            com.ironsource.T8 r0 = r8.f33159b
            r0.a(r4, r9)
            r0 = 0
            r1.a(r0)
        L47:
            int r0 = r1.d()
            int r0 = r0 + r3
            r1.a(r0)
            com.ironsource.T8 r0 = r8.f33159b
            int r1 = r1.d()
            r0.a(r1, r9)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ironsource.C4188of.b(java.lang.String):void");
    }
}
