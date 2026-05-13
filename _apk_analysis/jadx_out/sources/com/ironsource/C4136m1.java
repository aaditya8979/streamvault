package com.ironsource;

import com.ironsource.mediationsdk.IronSource;
import com.ironsource.mediationsdk.utils.IronSourceConstants;
import com.unity3d.ironsourceads.AdSize;
import java.util.Map;
import me.goldze.mvvmhabit.base.ContainerActivity;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import org.json.JSONObject;

/* JADX INFO: renamed from: com.ironsource.m1, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C4136m1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NotNull
    public static final C4136m1 f32255a = new C4136m1();

    /* JADX INFO: renamed from: com.ironsource.m1$a */
    public static final class a implements InterfaceC4156n1 {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        @NotNull
        private final IronSource.a f32256a;

        public a(@NotNull IronSource.a aVar) {
            tn.p.k(aVar, "value");
            this.f32256a = aVar;
        }

        public static /* synthetic */ a a(a aVar, IronSource.a aVar2, int i10, Object obj) {
            if ((i10 & 1) != 0) {
                aVar2 = aVar.f32256a;
            }
            return aVar.a(aVar2);
        }

        private final IronSource.a a() {
            return this.f32256a;
        }

        @NotNull
        public final a a(@NotNull IronSource.a aVar) {
            tn.p.k(aVar, "value");
            return new a(aVar);
        }

        @Override // com.ironsource.InterfaceC4156n1
        public void a(@NotNull Map<String, Object> map) {
            tn.p.k(map, ContainerActivity.BUNDLE);
            map.put("adUnit", Integer.valueOf(C4324wf.c(this.f32256a)));
        }

        public boolean equals(@Nullable Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof a) && this.f32256a == ((a) obj).f32256a;
        }

        public int hashCode() {
            return this.f32256a.hashCode();
        }

        @NotNull
        public String toString() {
            return "AdFormatEntity(value=" + this.f32256a + ")";
        }
    }

    /* JADX INFO: renamed from: com.ironsource.m1$b */
    public static final class b implements InterfaceC4156n1 {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        @NotNull
        private final String f32257a;

        public b(@NotNull String str) {
            tn.p.k(str, "value");
            this.f32257a = str;
        }

        public static /* synthetic */ b a(b bVar, String str, int i10, Object obj) {
            if ((i10 & 1) != 0) {
                str = bVar.f32257a;
            }
            return bVar.a(str);
        }

        private final String a() {
            return this.f32257a;
        }

        @NotNull
        public final b a(@NotNull String str) {
            tn.p.k(str, "value");
            return new b(str);
        }

        @Override // com.ironsource.InterfaceC4156n1
        public void a(@NotNull Map<String, Object> map) {
            tn.p.k(map, ContainerActivity.BUNDLE);
            map.put(IronSourceConstants.EVENTS_IRONSOURCE_AD_OBJECT_ID, this.f32257a);
        }

        public boolean equals(@Nullable Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof b) && tn.p.f(this.f32257a, ((b) obj).f32257a);
        }

        public int hashCode() {
            return this.f32257a.hashCode();
        }

        @NotNull
        public String toString() {
            return "AdIdentifier(value=" + this.f32257a + ")";
        }
    }

    /* JADX INFO: renamed from: com.ironsource.m1$c */
    public static final class c implements InterfaceC4156n1 {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        @NotNull
        private final AdSize f32258a;

        public c(@NotNull AdSize adSize) {
            tn.p.k(adSize, "size");
            this.f32258a = adSize;
        }

        /* JADX WARN: Removed duplicated region for block: B:25:0x004d  */
        @Override // com.ironsource.InterfaceC4156n1
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public void a(@org.jetbrains.annotations.NotNull java.util.Map<java.lang.String, java.lang.Object> r4) {
            /*
                r3 = this;
                java.lang.String r0 = "bundle"
                tn.p.k(r4, r0)
                com.unity3d.ironsourceads.AdSize r0 = r3.f32258a
                java.lang.String r0 = r0.getSizeDescription()
                int r1 = r0.hashCode()
                r2 = -96588539(0xfffffffffa3e2d05, float:-2.4686238E35)
                if (r1 == r2) goto L45
                r2 = 72205083(0x44dc31b, float:2.4187222E-36)
                if (r1 == r2) goto L3a
                r2 = 446888797(0x1aa2fb5d, float:6.740773E-23)
                if (r1 == r2) goto L2f
                r2 = 1951953708(0x7458732c, float:6.859571E31)
                if (r1 == r2) goto L24
                goto L4d
            L24:
                java.lang.String r1 = "BANNER"
                boolean r0 = r0.equals(r1)
                if (r0 != 0) goto L2d
                goto L4d
            L2d:
                r0 = 1
                goto L50
            L2f:
                java.lang.String r1 = "LEADERBOARD"
                boolean r0 = r0.equals(r1)
                if (r0 != 0) goto L38
                goto L4d
            L38:
                r0 = 4
                goto L50
            L3a:
                java.lang.String r1 = "LARGE"
                boolean r0 = r0.equals(r1)
                if (r0 != 0) goto L43
                goto L4d
            L43:
                r0 = 2
                goto L50
            L45:
                java.lang.String r1 = "MEDIUM_RECTANGLE"
                boolean r0 = r0.equals(r1)
                if (r0 != 0) goto L4f
            L4d:
                r0 = 0
                goto L50
            L4f:
                r0 = 3
            L50:
                java.lang.Integer r0 = java.lang.Integer.valueOf(r0)
                java.lang.String r1 = "bannerAdSize"
                r4.put(r1, r0)
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: com.ironsource.C4136m1.c.a(java.util.Map):void");
        }
    }

    /* JADX INFO: renamed from: com.ironsource.m1$d */
    public static final class d implements InterfaceC4156n1 {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        @NotNull
        private final String f32259a;

        public d(@NotNull String str) {
            tn.p.k(str, "auctionId");
            this.f32259a = str;
        }

        public static /* synthetic */ d a(d dVar, String str, int i10, Object obj) {
            if ((i10 & 1) != 0) {
                str = dVar.f32259a;
            }
            return dVar.a(str);
        }

        private final String a() {
            return this.f32259a;
        }

        @NotNull
        public final d a(@NotNull String str) {
            tn.p.k(str, "auctionId");
            return new d(str);
        }

        @Override // com.ironsource.InterfaceC4156n1
        public void a(@NotNull Map<String, Object> map) {
            tn.p.k(map, ContainerActivity.BUNDLE);
            map.put("auctionId", this.f32259a);
        }

        public boolean equals(@Nullable Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof d) && tn.p.f(this.f32259a, ((d) obj).f32259a);
        }

        public int hashCode() {
            return this.f32259a.hashCode();
        }

        @NotNull
        public String toString() {
            return "AuctionId(auctionId=" + this.f32259a + ")";
        }
    }

    /* JADX INFO: renamed from: com.ironsource.m1$e */
    public static final class e implements InterfaceC4156n1 {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final int f32260a;

        public e(int i10) {
            this.f32260a = i10;
        }

        private final int a() {
            return this.f32260a;
        }

        public static /* synthetic */ e a(e eVar, int i10, int i11, Object obj) {
            if ((i11 & 1) != 0) {
                i10 = eVar.f32260a;
            }
            return eVar.a(i10);
        }

        @NotNull
        public final e a(int i10) {
            return new e(i10);
        }

        @Override // com.ironsource.InterfaceC4156n1
        public void a(@NotNull Map<String, Object> map) {
            tn.p.k(map, ContainerActivity.BUNDLE);
            map.put(IronSourceConstants.EVENTS_DEMAND_ONLY, Integer.valueOf(this.f32260a));
        }

        public boolean equals(@Nullable Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof e) && this.f32260a == ((e) obj).f32260a;
        }

        public int hashCode() {
            return Integer.hashCode(this.f32260a);
        }

        @NotNull
        public String toString() {
            return "DemandOnly(value=" + this.f32260a + ")";
        }
    }

    /* JADX INFO: renamed from: com.ironsource.m1$f */
    public static final class f implements InterfaceC4156n1 {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final long f32261a;

        public f(long j10) {
            this.f32261a = j10;
        }

        private final long a() {
            return this.f32261a;
        }

        public static /* synthetic */ f a(f fVar, long j10, int i10, Object obj) {
            if ((i10 & 1) != 0) {
                j10 = fVar.f32261a;
            }
            return fVar.a(j10);
        }

        @NotNull
        public final f a(long j10) {
            return new f(j10);
        }

        @Override // com.ironsource.InterfaceC4156n1
        public void a(@NotNull Map<String, Object> map) {
            tn.p.k(map, ContainerActivity.BUNDLE);
            map.put("duration", Long.valueOf(this.f32261a));
        }

        public boolean equals(@Nullable Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof f) && this.f32261a == ((f) obj).f32261a;
        }

        public int hashCode() {
            return Long.hashCode(this.f32261a);
        }

        @NotNull
        public String toString() {
            return "Duration(duration=" + this.f32261a + ")";
        }
    }

    /* JADX INFO: renamed from: com.ironsource.m1$g */
    public static final class g implements InterfaceC4156n1 {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        @NotNull
        private final String f32262a;

        public g(@NotNull String str) {
            tn.p.k(str, "dynamicSourceId");
            this.f32262a = str;
        }

        public static /* synthetic */ g a(g gVar, String str, int i10, Object obj) {
            if ((i10 & 1) != 0) {
                str = gVar.f32262a;
            }
            return gVar.a(str);
        }

        private final String a() {
            return this.f32262a;
        }

        @NotNull
        public final g a(@NotNull String str) {
            tn.p.k(str, "dynamicSourceId");
            return new g(str);
        }

        @Override // com.ironsource.InterfaceC4156n1
        public void a(@NotNull Map<String, Object> map) {
            tn.p.k(map, ContainerActivity.BUNDLE);
            map.put("dynamicDemandSource", this.f32262a);
        }

        public boolean equals(@Nullable Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof g) && tn.p.f(this.f32262a, ((g) obj).f32262a);
        }

        public int hashCode() {
            return this.f32262a.hashCode();
        }

        @NotNull
        public String toString() {
            return "DynamicDemandSourceId(dynamicSourceId=" + this.f32262a + ")";
        }
    }

    /* JADX INFO: renamed from: com.ironsource.m1$h */
    public static final class h implements InterfaceC4156n1 {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        @NotNull
        private final String f32263a;

        public h(@NotNull String str) {
            tn.p.k(str, "sourceId");
            this.f32263a = str;
        }

        public static /* synthetic */ h a(h hVar, String str, int i10, Object obj) {
            if ((i10 & 1) != 0) {
                str = hVar.f32263a;
            }
            return hVar.a(str);
        }

        private final String a() {
            return this.f32263a;
        }

        @NotNull
        public final h a(@NotNull String str) {
            tn.p.k(str, "sourceId");
            return new h(str);
        }

        @Override // com.ironsource.InterfaceC4156n1
        public void a(@NotNull Map<String, Object> map) {
            tn.p.k(map, ContainerActivity.BUNDLE);
            map.put("dynamicDemandSource", this.f32263a);
        }

        public boolean equals(@Nullable Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof h) && tn.p.f(this.f32263a, ((h) obj).f32263a);
        }

        public int hashCode() {
            return this.f32263a.hashCode();
        }

        @NotNull
        public String toString() {
            return "DynamicSourceId(sourceId=" + this.f32263a + ")";
        }
    }

    /* JADX INFO: renamed from: com.ironsource.m1$i */
    public static final class i implements InterfaceC4156n1 {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        @NotNull
        public static final i f32264a = new i();

        private i() {
        }

        @Override // com.ironsource.InterfaceC4156n1
        public void a(@NotNull Map<String, Object> map) {
            tn.p.k(map, ContainerActivity.BUNDLE);
        }
    }

    /* JADX INFO: renamed from: com.ironsource.m1$j */
    public static final class j implements InterfaceC4156n1 {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final int f32265a;

        public j(int i10) {
            this.f32265a = i10;
        }

        private final int a() {
            return this.f32265a;
        }

        public static /* synthetic */ j a(j jVar, int i10, int i11, Object obj) {
            if ((i11 & 1) != 0) {
                i10 = jVar.f32265a;
            }
            return jVar.a(i10);
        }

        @NotNull
        public final j a(int i10) {
            return new j(i10);
        }

        @Override // com.ironsource.InterfaceC4156n1
        public void a(@NotNull Map<String, Object> map) {
            tn.p.k(map, ContainerActivity.BUNDLE);
            map.put(IronSourceConstants.EVENTS_ERROR_CODE, Integer.valueOf(this.f32265a));
        }

        public boolean equals(@Nullable Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof j) && this.f32265a == ((j) obj).f32265a;
        }

        public int hashCode() {
            return Integer.hashCode(this.f32265a);
        }

        @NotNull
        public String toString() {
            return "ErrorCode(code=" + this.f32265a + ")";
        }
    }

    /* JADX INFO: renamed from: com.ironsource.m1$k */
    public static final class k implements InterfaceC4156n1 {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        @Nullable
        private final String f32266a;

        public k(@Nullable String str) {
            this.f32266a = str;
        }

        public static /* synthetic */ k a(k kVar, String str, int i10, Object obj) {
            if ((i10 & 1) != 0) {
                str = kVar.f32266a;
            }
            return kVar.a(str);
        }

        private final String a() {
            return this.f32266a;
        }

        @NotNull
        public final k a(@Nullable String str) {
            return new k(str);
        }

        @Override // com.ironsource.InterfaceC4156n1
        public void a(@NotNull Map<String, Object> map) {
            tn.p.k(map, ContainerActivity.BUNDLE);
            String str = this.f32266a;
            if (str == null || str.length() == 0) {
                return;
            }
            map.put("reason", this.f32266a);
        }

        public boolean equals(@Nullable Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof k) && tn.p.f(this.f32266a, ((k) obj).f32266a);
        }

        public int hashCode() {
            String str = this.f32266a;
            if (str == null) {
                return 0;
            }
            return str.hashCode();
        }

        @NotNull
        public String toString() {
            return "ErrorReason(reason=" + this.f32266a + ")";
        }
    }

    /* JADX INFO: renamed from: com.ironsource.m1$l */
    public static final class l implements InterfaceC4156n1 {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        @NotNull
        private final String f32267a;

        public l(@NotNull String str) {
            tn.p.k(str, "value");
            this.f32267a = str;
        }

        public static /* synthetic */ l a(l lVar, String str, int i10, Object obj) {
            if ((i10 & 1) != 0) {
                str = lVar.f32267a;
            }
            return lVar.a(str);
        }

        private final String a() {
            return this.f32267a;
        }

        @NotNull
        public final l a(@NotNull String str) {
            tn.p.k(str, "value");
            return new l(str);
        }

        @Override // com.ironsource.InterfaceC4156n1
        public void a(@NotNull Map<String, Object> map) {
            tn.p.k(map, ContainerActivity.BUNDLE);
            map.put(IronSourceConstants.EVENTS_EXT1, this.f32267a);
        }

        public boolean equals(@Nullable Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof l) && tn.p.f(this.f32267a, ((l) obj).f32267a);
        }

        public int hashCode() {
            return this.f32267a.hashCode();
        }

        @NotNull
        public String toString() {
            return "Ext1(value=" + this.f32267a + ")";
        }
    }

    /* JADX INFO: renamed from: com.ironsource.m1$m */
    public static final class m implements InterfaceC4156n1 {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        @Nullable
        private final JSONObject f32268a;

        public m(@Nullable JSONObject jSONObject) {
            this.f32268a = jSONObject;
        }

        public static /* synthetic */ m a(m mVar, JSONObject jSONObject, int i10, Object obj) {
            if ((i10 & 1) != 0) {
                jSONObject = mVar.f32268a;
            }
            return mVar.a(jSONObject);
        }

        private final JSONObject a() {
            return this.f32268a;
        }

        @NotNull
        public final m a(@Nullable JSONObject jSONObject) {
            return new m(jSONObject);
        }

        @Override // com.ironsource.InterfaceC4156n1
        public void a(@NotNull Map<String, Object> map) {
            tn.p.k(map, ContainerActivity.BUNDLE);
            JSONObject jSONObject = this.f32268a;
            if (jSONObject == null) {
                return;
            }
            map.put("genericParams", jSONObject);
        }

        public boolean equals(@Nullable Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof m) && tn.p.f(this.f32268a, ((m) obj).f32268a);
        }

        public int hashCode() {
            JSONObject jSONObject = this.f32268a;
            if (jSONObject == null) {
                return 0;
            }
            return jSONObject.hashCode();
        }

        @NotNull
        public String toString() {
            return "GenericParams(genericParams=" + this.f32268a + ")";
        }
    }

    /* JADX INFO: renamed from: com.ironsource.m1$n */
    public static final class n implements InterfaceC4156n1 {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final int f32269a;

        public n(int i10) {
            this.f32269a = i10;
        }

        private final int a() {
            return this.f32269a;
        }

        public static /* synthetic */ n a(n nVar, int i10, int i11, Object obj) {
            if ((i11 & 1) != 0) {
                i10 = nVar.f32269a;
            }
            return nVar.a(i10);
        }

        @NotNull
        public final n a(int i10) {
            return new n(i10);
        }

        @Override // com.ironsource.InterfaceC4156n1
        public void a(@NotNull Map<String, Object> map) {
            tn.p.k(map, ContainerActivity.BUNDLE);
            map.put("instanceType", Integer.valueOf(this.f32269a));
        }

        public boolean equals(@Nullable Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof n) && this.f32269a == ((n) obj).f32269a;
        }

        public int hashCode() {
            return Integer.hashCode(this.f32269a);
        }

        @NotNull
        public String toString() {
            return "InstanceType(instanceType=" + this.f32269a + ")";
        }
    }

    /* JADX INFO: renamed from: com.ironsource.m1$o */
    public static final class o implements InterfaceC4156n1 {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final int f32270a;

        public o(int i10) {
            this.f32270a = i10;
        }

        private final int a() {
            return this.f32270a;
        }

        public static /* synthetic */ o a(o oVar, int i10, int i11, Object obj) {
            if ((i11 & 1) != 0) {
                i10 = oVar.f32270a;
            }
            return oVar.a(i10);
        }

        @NotNull
        public final o a(int i10) {
            return new o(i10);
        }

        @Override // com.ironsource.InterfaceC4156n1
        public void a(@NotNull Map<String, Object> map) {
            tn.p.k(map, ContainerActivity.BUNDLE);
            map.put("isMultipleAdObjects", Integer.valueOf(this.f32270a));
        }

        public boolean equals(@Nullable Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof o) && this.f32270a == ((o) obj).f32270a;
        }

        public int hashCode() {
            return Integer.hashCode(this.f32270a);
        }

        @NotNull
        public String toString() {
            return "MultipleAdObjects(value=" + this.f32270a + ")";
        }
    }

    /* JADX INFO: renamed from: com.ironsource.m1$p */
    public static final class p implements InterfaceC4156n1 {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final int f32271a;

        public p(int i10) {
            this.f32271a = i10;
        }

        private final int a() {
            return this.f32271a;
        }

        public static /* synthetic */ p a(p pVar, int i10, int i11, Object obj) {
            if ((i11 & 1) != 0) {
                i10 = pVar.f32271a;
            }
            return pVar.a(i10);
        }

        @NotNull
        public final p a(int i10) {
            return new p(i10);
        }

        @Override // com.ironsource.InterfaceC4156n1
        public void a(@NotNull Map<String, Object> map) {
            tn.p.k(map, ContainerActivity.BUNDLE);
            map.put("isOneFlow", Integer.valueOf(this.f32271a));
        }

        public boolean equals(@Nullable Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof p) && this.f32271a == ((p) obj).f32271a;
        }

        public int hashCode() {
            return Integer.hashCode(this.f32271a);
        }

        @NotNull
        public String toString() {
            return "OneFlow(value=" + this.f32271a + ")";
        }
    }

    /* JADX INFO: renamed from: com.ironsource.m1$q */
    public static final class q implements InterfaceC4156n1 {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        @NotNull
        private final String f32272a;

        public q(@NotNull String str) {
            tn.p.k(str, "value");
            this.f32272a = str;
        }

        public static /* synthetic */ q a(q qVar, String str, int i10, Object obj) {
            if ((i10 & 1) != 0) {
                str = qVar.f32272a;
            }
            return qVar.a(str);
        }

        private final String a() {
            return this.f32272a;
        }

        @NotNull
        public final q a(@NotNull String str) {
            tn.p.k(str, "value");
            return new q(str);
        }

        @Override // com.ironsource.InterfaceC4156n1
        public void a(@NotNull Map<String, Object> map) {
            tn.p.k(map, ContainerActivity.BUNDLE);
            map.put("placement", this.f32272a);
        }

        public boolean equals(@Nullable Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof q) && tn.p.f(this.f32272a, ((q) obj).f32272a);
        }

        public int hashCode() {
            return this.f32272a.hashCode();
        }

        @NotNull
        public String toString() {
            return "Placement(value=" + this.f32272a + ")";
        }
    }

    /* JADX INFO: renamed from: com.ironsource.m1$r */
    public static final class r implements InterfaceC4156n1 {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final int f32273a;

        public r(int i10) {
            this.f32273a = i10;
        }

        private final int a() {
            return this.f32273a;
        }

        public static /* synthetic */ r a(r rVar, int i10, int i11, Object obj) {
            if ((i11 & 1) != 0) {
                i10 = rVar.f32273a;
            }
            return rVar.a(i10);
        }

        @NotNull
        public final r a(int i10) {
            return new r(i10);
        }

        @Override // com.ironsource.InterfaceC4156n1
        public void a(@NotNull Map<String, Object> map) {
            tn.p.k(map, ContainerActivity.BUNDLE);
            map.put(IronSourceConstants.EVENTS_PROGRAMMATIC, Integer.valueOf(this.f32273a));
        }

        public boolean equals(@Nullable Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof r) && this.f32273a == ((r) obj).f32273a;
        }

        public int hashCode() {
            return Integer.hashCode(this.f32273a);
        }

        @NotNull
        public String toString() {
            return "Programmatic(programmatic=" + this.f32273a + ")";
        }
    }

    /* JADX INFO: renamed from: com.ironsource.m1$s */
    public static final class s implements InterfaceC4156n1 {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        @NotNull
        private final String f32274a;

        public s(@NotNull String str) {
            tn.p.k(str, "sourceName");
            this.f32274a = str;
        }

        public static /* synthetic */ s a(s sVar, String str, int i10, Object obj) {
            if ((i10 & 1) != 0) {
                str = sVar.f32274a;
            }
            return sVar.a(str);
        }

        private final String a() {
            return this.f32274a;
        }

        @NotNull
        public final s a(@NotNull String str) {
            tn.p.k(str, "sourceName");
            return new s(str);
        }

        @Override // com.ironsource.InterfaceC4156n1
        public void a(@NotNull Map<String, Object> map) {
            tn.p.k(map, ContainerActivity.BUNDLE);
            map.put(IronSourceConstants.EVENTS_PROVIDER, this.f32274a);
        }

        public boolean equals(@Nullable Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof s) && tn.p.f(this.f32274a, ((s) obj).f32274a);
        }

        public int hashCode() {
            return this.f32274a.hashCode();
        }

        @NotNull
        public String toString() {
            return "Provider(sourceName=" + this.f32274a + ")";
        }
    }

    /* JADX INFO: renamed from: com.ironsource.m1$t */
    public static final class t implements InterfaceC4156n1 {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final int f32275a;

        public t(int i10) {
            this.f32275a = i10;
        }

        private final int a() {
            return this.f32275a;
        }

        public static /* synthetic */ t a(t tVar, int i10, int i11, Object obj) {
            if ((i11 & 1) != 0) {
                i10 = tVar.f32275a;
            }
            return tVar.a(i10);
        }

        @NotNull
        public final t a(int i10) {
            return new t(i10);
        }

        @Override // com.ironsource.InterfaceC4156n1
        public void a(@NotNull Map<String, Object> map) {
            tn.p.k(map, ContainerActivity.BUNDLE);
            map.put(IronSourceConstants.EVENTS_REWARD_AMOUNT, Integer.valueOf(this.f32275a));
        }

        public boolean equals(@Nullable Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof t) && this.f32275a == ((t) obj).f32275a;
        }

        public int hashCode() {
            return Integer.hashCode(this.f32275a);
        }

        @NotNull
        public String toString() {
            return "RewardAmount(value=" + this.f32275a + ")";
        }
    }

    /* JADX INFO: renamed from: com.ironsource.m1$u */
    public static final class u implements InterfaceC4156n1 {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        @NotNull
        private final String f32276a;

        public u(@NotNull String str) {
            tn.p.k(str, "value");
            this.f32276a = str;
        }

        public static /* synthetic */ u a(u uVar, String str, int i10, Object obj) {
            if ((i10 & 1) != 0) {
                str = uVar.f32276a;
            }
            return uVar.a(str);
        }

        private final String a() {
            return this.f32276a;
        }

        @NotNull
        public final u a(@NotNull String str) {
            tn.p.k(str, "value");
            return new u(str);
        }

        @Override // com.ironsource.InterfaceC4156n1
        public void a(@NotNull Map<String, Object> map) {
            tn.p.k(map, ContainerActivity.BUNDLE);
            map.put(IronSourceConstants.EVENTS_REWARD_NAME, this.f32276a);
        }

        public boolean equals(@Nullable Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof u) && tn.p.f(this.f32276a, ((u) obj).f32276a);
        }

        public int hashCode() {
            return this.f32276a.hashCode();
        }

        @NotNull
        public String toString() {
            return "RewardName(value=" + this.f32276a + ")";
        }
    }

    /* JADX INFO: renamed from: com.ironsource.m1$v */
    public static final class v implements InterfaceC4156n1 {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        @NotNull
        private final String f32277a;

        public v(@NotNull String str) {
            tn.p.k(str, "version");
            this.f32277a = str;
        }

        public static /* synthetic */ v a(v vVar, String str, int i10, Object obj) {
            if ((i10 & 1) != 0) {
                str = vVar.f32277a;
            }
            return vVar.a(str);
        }

        private final String a() {
            return this.f32277a;
        }

        @NotNull
        public final v a(@NotNull String str) {
            tn.p.k(str, "version");
            return new v(str);
        }

        @Override // com.ironsource.InterfaceC4156n1
        public void a(@NotNull Map<String, Object> map) {
            tn.p.k(map, ContainerActivity.BUNDLE);
            map.put(IronSourceConstants.EVENTS_PROVIDER_SDK_VERSION, this.f32277a);
        }

        public boolean equals(@Nullable Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof v) && tn.p.f(this.f32277a, ((v) obj).f32277a);
        }

        public int hashCode() {
            return this.f32277a.hashCode();
        }

        @NotNull
        public String toString() {
            return "SdkVersion(version=" + this.f32277a + ")";
        }
    }

    /* JADX INFO: renamed from: com.ironsource.m1$w */
    public static final class w implements InterfaceC4156n1 {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final int f32278a;

        public w(int i10) {
            this.f32278a = i10;
        }

        private final int a() {
            return this.f32278a;
        }

        public static /* synthetic */ w a(w wVar, int i10, int i11, Object obj) {
            if ((i11 & 1) != 0) {
                i10 = wVar.f32278a;
            }
            return wVar.a(i10);
        }

        @NotNull
        public final w a(int i10) {
            return new w(i10);
        }

        @Override // com.ironsource.InterfaceC4156n1
        public void a(@NotNull Map<String, Object> map) {
            tn.p.k(map, ContainerActivity.BUNDLE);
            map.put("sessionDepth", Integer.valueOf(this.f32278a));
        }

        public boolean equals(@Nullable Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof w) && this.f32278a == ((w) obj).f32278a;
        }

        public int hashCode() {
            return Integer.hashCode(this.f32278a);
        }

        @NotNull
        public String toString() {
            return "SessionDepth(sessionDepth=" + this.f32278a + ")";
        }
    }

    /* JADX INFO: renamed from: com.ironsource.m1$x */
    public static final class x implements InterfaceC4156n1 {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        @NotNull
        private final String f32279a;

        public x(@NotNull String str) {
            tn.p.k(str, "subProviderId");
            this.f32279a = str;
        }

        public static /* synthetic */ x a(x xVar, String str, int i10, Object obj) {
            if ((i10 & 1) != 0) {
                str = xVar.f32279a;
            }
            return xVar.a(str);
        }

        private final String a() {
            return this.f32279a;
        }

        @NotNull
        public final x a(@NotNull String str) {
            tn.p.k(str, "subProviderId");
            return new x(str);
        }

        @Override // com.ironsource.InterfaceC4156n1
        public void a(@NotNull Map<String, Object> map) {
            tn.p.k(map, ContainerActivity.BUNDLE);
            map.put("spId", this.f32279a);
        }

        public boolean equals(@Nullable Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof x) && tn.p.f(this.f32279a, ((x) obj).f32279a);
        }

        public int hashCode() {
            return this.f32279a.hashCode();
        }

        @NotNull
        public String toString() {
            return "SubProviderId(subProviderId=" + this.f32279a + ")";
        }
    }

    /* JADX INFO: renamed from: com.ironsource.m1$y */
    public static final class y implements InterfaceC4156n1 {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        @NotNull
        private final String f32280a;

        public y(@NotNull String str) {
            tn.p.k(str, "value");
            this.f32280a = str;
        }

        public static /* synthetic */ y a(y yVar, String str, int i10, Object obj) {
            if ((i10 & 1) != 0) {
                str = yVar.f32280a;
            }
            return yVar.a(str);
        }

        private final String a() {
            return this.f32280a;
        }

        @NotNull
        public final y a(@NotNull String str) {
            tn.p.k(str, "value");
            return new y(str);
        }

        @Override // com.ironsource.InterfaceC4156n1
        public void a(@NotNull Map<String, Object> map) {
            tn.p.k(map, ContainerActivity.BUNDLE);
            map.put(IronSourceConstants.EVENTS_TRANS_ID, this.f32280a);
        }

        public boolean equals(@Nullable Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof y) && tn.p.f(this.f32280a, ((y) obj).f32280a);
        }

        public int hashCode() {
            return this.f32280a.hashCode();
        }

        @NotNull
        public String toString() {
            return "TransId(value=" + this.f32280a + ")";
        }
    }

    private C4136m1() {
    }
}
