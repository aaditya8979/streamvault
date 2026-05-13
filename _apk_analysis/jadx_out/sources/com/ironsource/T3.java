package com.ironsource;

import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes7.dex */
public final class T3 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @Nullable
    private final Zd f30452a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @Nullable
    private final H9 f30453b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @Nullable
    private final U2 f30454c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    @Nullable
    private final Qb f30455d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    @Nullable
    private final A1 f30456e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    @Nullable
    private final Of f30457f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    @Nullable
    private final com.ironsource.mediationsdk.adquality.a f30458g;

    public static final class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        @Nullable
        private Zd f30459a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        @Nullable
        private H9 f30460b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        @Nullable
        private U2 f30461c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        @Nullable
        private Qb f30462d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        @Nullable
        private A1 f30463e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        @Nullable
        private Of f30464f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        @Nullable
        private com.ironsource.mediationsdk.adquality.a f30465g;

        public a() {
            this(null, null, null, null, null, null, null, 127, null);
        }

        public a(@Nullable Zd zd2, @Nullable H9 h92, @Nullable U2 u22, @Nullable Qb qb2, @Nullable A1 a12, @Nullable Of of2, @Nullable com.ironsource.mediationsdk.adquality.a aVar) {
            this.f30459a = zd2;
            this.f30460b = h92;
            this.f30461c = u22;
            this.f30462d = qb2;
            this.f30463e = a12;
            this.f30464f = of2;
            this.f30465g = aVar;
        }

        public /* synthetic */ a(Zd zd2, H9 h92, U2 u22, Qb qb2, A1 a12, Of of2, com.ironsource.mediationsdk.adquality.a aVar, int i10, tn.i iVar) {
            this((i10 & 1) != 0 ? null : zd2, (i10 & 2) != 0 ? null : h92, (i10 & 4) != 0 ? null : u22, (i10 & 8) != 0 ? null : qb2, (i10 & 16) != 0 ? null : a12, (i10 & 32) != 0 ? null : of2, (i10 & 64) != 0 ? null : aVar);
        }

        public static /* synthetic */ a a(a aVar, Zd zd2, H9 h92, U2 u22, Qb qb2, A1 a12, Of of2, com.ironsource.mediationsdk.adquality.a aVar2, int i10, Object obj) {
            if ((i10 & 1) != 0) {
                zd2 = aVar.f30459a;
            }
            if ((i10 & 2) != 0) {
                h92 = aVar.f30460b;
            }
            H9 h93 = h92;
            if ((i10 & 4) != 0) {
                u22 = aVar.f30461c;
            }
            U2 u23 = u22;
            if ((i10 & 8) != 0) {
                qb2 = aVar.f30462d;
            }
            Qb qb3 = qb2;
            if ((i10 & 16) != 0) {
                a12 = aVar.f30463e;
            }
            A1 a13 = a12;
            if ((i10 & 32) != 0) {
                of2 = aVar.f30464f;
            }
            Of of3 = of2;
            if ((i10 & 64) != 0) {
                aVar2 = aVar.f30465g;
            }
            return aVar.a(zd2, h93, u23, qb3, a13, of3, aVar2);
        }

        @NotNull
        public final a a(@Nullable A1 a12) {
            this.f30463e = a12;
            return this;
        }

        @NotNull
        public final a a(@Nullable H9 h92) {
            this.f30460b = h92;
            return this;
        }

        @NotNull
        public final a a(@Nullable Qb qb2) {
            this.f30462d = qb2;
            return this;
        }

        @NotNull
        public final a a(@Nullable U2 u22) {
            this.f30461c = u22;
            return this;
        }

        @NotNull
        public final a a(@Nullable Zd zd2) {
            this.f30459a = zd2;
            return this;
        }

        @NotNull
        public final a a(@Nullable Zd zd2, @Nullable H9 h92, @Nullable U2 u22, @Nullable Qb qb2, @Nullable A1 a12, @Nullable Of of2, @Nullable com.ironsource.mediationsdk.adquality.a aVar) {
            return new a(zd2, h92, u22, qb2, a12, of2, aVar);
        }

        @NotNull
        public final a a(@Nullable com.ironsource.mediationsdk.adquality.a aVar) {
            this.f30465g = aVar;
            return this;
        }

        @NotNull
        public final T3 a() {
            return new T3(this.f30459a, this.f30460b, this.f30461c, this.f30462d, this.f30463e, this.f30464f, this.f30465g, null);
        }

        public final void a(@Nullable Of of2) {
            this.f30464f = of2;
        }

        @NotNull
        public final a b(@Nullable Of of2) {
            this.f30464f = of2;
            return this;
        }

        @Nullable
        public final Zd b() {
            return this.f30459a;
        }

        public final void b(@Nullable A1 a12) {
            this.f30463e = a12;
        }

        public final void b(@Nullable H9 h92) {
            this.f30460b = h92;
        }

        public final void b(@Nullable Qb qb2) {
            this.f30462d = qb2;
        }

        public final void b(@Nullable U2 u22) {
            this.f30461c = u22;
        }

        public final void b(@Nullable Zd zd2) {
            this.f30459a = zd2;
        }

        public final void b(@Nullable com.ironsource.mediationsdk.adquality.a aVar) {
            this.f30465g = aVar;
        }

        @Nullable
        public final H9 c() {
            return this.f30460b;
        }

        @Nullable
        public final U2 d() {
            return this.f30461c;
        }

        @Nullable
        public final Qb e() {
            return this.f30462d;
        }

        public boolean equals(@Nullable Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof a)) {
                return false;
            }
            a aVar = (a) obj;
            return tn.p.f(this.f30459a, aVar.f30459a) && tn.p.f(this.f30460b, aVar.f30460b) && tn.p.f(this.f30461c, aVar.f30461c) && tn.p.f(this.f30462d, aVar.f30462d) && tn.p.f(this.f30463e, aVar.f30463e) && tn.p.f(this.f30464f, aVar.f30464f) && tn.p.f(this.f30465g, aVar.f30465g);
        }

        @Nullable
        public final A1 f() {
            return this.f30463e;
        }

        @Nullable
        public final Of g() {
            return this.f30464f;
        }

        @Nullable
        public final com.ironsource.mediationsdk.adquality.a h() {
            return this.f30465g;
        }

        public int hashCode() {
            Zd zd2 = this.f30459a;
            int iHashCode = (zd2 == null ? 0 : zd2.hashCode()) * 31;
            H9 h92 = this.f30460b;
            int iHashCode2 = (iHashCode + (h92 == null ? 0 : h92.hashCode())) * 31;
            U2 u22 = this.f30461c;
            int iHashCode3 = (iHashCode2 + (u22 == null ? 0 : u22.hashCode())) * 31;
            Qb qb2 = this.f30462d;
            int iHashCode4 = (iHashCode3 + (qb2 == null ? 0 : qb2.hashCode())) * 31;
            A1 a12 = this.f30463e;
            int iHashCode5 = (iHashCode4 + (a12 == null ? 0 : a12.hashCode())) * 31;
            Of of2 = this.f30464f;
            int iHashCode6 = (iHashCode5 + (of2 == null ? 0 : of2.hashCode())) * 31;
            com.ironsource.mediationsdk.adquality.a aVar = this.f30465g;
            return iHashCode6 + (aVar != null ? aVar.hashCode() : 0);
        }

        @Nullable
        public final com.ironsource.mediationsdk.adquality.a i() {
            return this.f30465g;
        }

        @Nullable
        public final A1 j() {
            return this.f30463e;
        }

        @Nullable
        public final U2 k() {
            return this.f30461c;
        }

        @Nullable
        public final H9 l() {
            return this.f30460b;
        }

        @Nullable
        public final Qb m() {
            return this.f30462d;
        }

        @Nullable
        public final Zd n() {
            return this.f30459a;
        }

        @Nullable
        public final Of o() {
            return this.f30464f;
        }

        @NotNull
        public String toString() {
            return "Builder(rewardedVideoConfigurations=" + this.f30459a + ", interstitialConfigurations=" + this.f30460b + ", bannerConfigurations=" + this.f30461c + ", nativeAdConfigurations=" + this.f30462d + ", applicationConfigurations=" + this.f30463e + ", testSuiteSettings=" + this.f30464f + ", adQualityConfigurations=" + this.f30465g + ")";
        }
    }

    private T3(Zd zd2, H9 h92, U2 u22, Qb qb2, A1 a12, Of of2, com.ironsource.mediationsdk.adquality.a aVar) {
        this.f30452a = zd2;
        this.f30453b = h92;
        this.f30454c = u22;
        this.f30455d = qb2;
        this.f30456e = a12;
        this.f30457f = of2;
        this.f30458g = aVar;
    }

    public /* synthetic */ T3(Zd zd2, H9 h92, U2 u22, Qb qb2, A1 a12, Of of2, com.ironsource.mediationsdk.adquality.a aVar, tn.i iVar) {
        this(zd2, h92, u22, qb2, a12, of2, aVar);
    }

    @Nullable
    public final com.ironsource.mediationsdk.adquality.a a() {
        return this.f30458g;
    }

    @Nullable
    public final A1 b() {
        return this.f30456e;
    }

    @Nullable
    public final U2 c() {
        return this.f30454c;
    }

    @Nullable
    public final H9 d() {
        return this.f30453b;
    }

    @Nullable
    public final Qb e() {
        return this.f30455d;
    }

    @Nullable
    public final Zd f() {
        return this.f30452a;
    }

    @Nullable
    public final Of g() {
        return this.f30457f;
    }

    @NotNull
    public String toString() {
        return "configurations(\n" + this.f30452a + "\n" + this.f30453b + "\n" + this.f30454c + "\n" + this.f30455d + ")";
    }
}
