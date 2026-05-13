package sg.bigo.ads.controller.a.a;

import android.os.Parcel;
import android.text.TextUtils;
import androidx.annotation.CallSuper;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import org.json.JSONArray;
import org.json.JSONObject;
import sg.bigo.ads.common.f;
import sg.bigo.ads.common.n;
import sg.bigo.ads.common.utils.k;
import sg.bigo.ads.controller.a.j;

/* JADX INFO: loaded from: classes8.dex */
public class b implements sg.bigo.ads.common.f {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public C1034b f82831a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public C1034b f82832b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public int f82833c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final String f82834d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final String f82835e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private Map<a, C1034b> f82836f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private Map<a, List<C1034b>> f82837g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private int f82838h = 3;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private Map<a, C1034b> f82839i = b();

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private Map<a, List<C1034b>> f82840j;

    public static class a implements sg.bigo.ads.common.f {

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private static final f.a<a> f82842c = new f.a<a>() { // from class: sg.bigo.ads.controller.a.a.b.a.1
            @Override // sg.bigo.ads.common.f.a
            public final /* synthetic */ sg.bigo.ads.common.f a() {
                return new a("", 0);
            }
        };

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public String f82843a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public int f82844b;

        public a(String str, int i10) {
            this.f82843a = TextUtils.isEmpty(str) ? "all" : str.toLowerCase();
            this.f82844b = i10;
        }

        @Override // sg.bigo.ads.common.f
        public final void a(@NonNull Parcel parcel) {
            parcel.writeString(this.f82843a);
            parcel.writeInt(this.f82844b);
        }

        @Override // sg.bigo.ads.common.f
        public final void b(@NonNull Parcel parcel) {
            this.f82843a = n.a(parcel, "");
            this.f82844b = n.a(parcel, 0);
        }

        public final boolean equals(@Nullable Object obj) {
            if (obj == this) {
                return true;
            }
            if (obj instanceof a) {
                a aVar = (a) obj;
                if (TextUtils.equals(this.f82843a, aVar.f82843a) && this.f82844b == aVar.f82844b) {
                    return true;
                }
            }
            return false;
        }

        public final int hashCode() {
            return (this.f82843a + "_" + this.f82844b).hashCode();
        }

        @NonNull
        public final String toString() {
            return super.toString();
        }
    }

    /* JADX INFO: renamed from: sg.bigo.ads.controller.a.a.b$b, reason: collision with other inner class name */
    public static class C1034b extends j implements sg.bigo.ads.common.f {

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        private static final f.a<C1034b> f82845e = new f.a<C1034b>() { // from class: sg.bigo.ads.controller.a.a.b.b.1
            @Override // sg.bigo.ads.common.f.a
            public final /* synthetic */ sg.bigo.ads.common.f a() {
                return new C1034b("", "", 0);
            }
        };

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public boolean f82846d;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        private int f82847f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        private long f82848g;

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        private int f82849h;

        public C1034b(String str, String str2, int i10) {
            super(str, str2, i10);
            this.f82846d = true;
            this.f82847f = 0;
            this.f82848g = 0L;
            this.f82849h = 0;
        }

        public static /* synthetic */ int c(C1034b c1034b) {
            c1034b.f82849h = 0;
            return 0;
        }

        public static /* synthetic */ int e(C1034b c1034b) {
            int i10 = c1034b.f82847f;
            c1034b.f82847f = i10 + 1;
            return i10;
        }

        public static /* synthetic */ int f(C1034b c1034b) {
            c1034b.f82847f = 0;
            return 0;
        }

        public static /* synthetic */ int g(C1034b c1034b) {
            int i10 = c1034b.f82849h;
            c1034b.f82849h = i10 + 1;
            return i10;
        }

        @Override // sg.bigo.ads.common.f
        public final void a(@NonNull Parcel parcel) {
            parcel.writeString(this.f82986a);
            parcel.writeInt(this.f82988c);
            n.a(parcel, this.f82846d);
            parcel.writeString(this.f82987b);
            parcel.writeInt(this.f82847f);
            parcel.writeLong(this.f82848g);
            parcel.writeInt(this.f82849h);
        }

        public final void a(String str) {
            this.f82987b = str;
        }

        @Override // sg.bigo.ads.common.f
        public final void b(@NonNull Parcel parcel) {
            this.f82986a = n.a(parcel, "");
            this.f82988c = n.a(parcel, 1);
            this.f82846d = n.b(parcel, true);
            this.f82987b = n.a(parcel, "");
            this.f82847f = n.a(parcel, 0);
            this.f82848g = n.a(parcel, 0L);
            this.f82849h = n.a(parcel, 0);
        }

        public final boolean equals(@Nullable Object obj) {
            if (obj == this) {
                return true;
            }
            if (obj instanceof j) {
                return TextUtils.equals(this.f82986a, ((j) obj).a());
            }
            return false;
        }

        public final int hashCode() {
            String str = this.f82986a;
            if (str != null) {
                return str.hashCode();
            }
            return 0;
        }
    }

    public b(@NonNull String str, @Nullable String str2) {
        this.f82834d = str;
        this.f82835e = str2;
    }

    @NonNull
    private static List<a> a(@NonNull a aVar) {
        ArrayList arrayList = new ArrayList();
        a aVar2 = new a("all", 0);
        if (aVar2.equals(aVar)) {
            arrayList.add(0, aVar);
            return arrayList;
        }
        arrayList.add(0, aVar2);
        a aVar3 = new a("all", aVar.f82844b);
        if (aVar3.equals(aVar)) {
            arrayList.add(0, aVar);
            return arrayList;
        }
        arrayList.add(0, aVar3);
        a aVar4 = new a(aVar.f82843a, 0);
        if (aVar4.equals(aVar)) {
            arrayList.add(0, aVar);
            return arrayList;
        }
        arrayList.add(0, aVar4);
        arrayList.add(0, aVar);
        return arrayList;
    }

    @Nullable
    private static C1034b a(Map<a, C1034b> map, a aVar) {
        if (!k.a(map) && aVar != null) {
            Iterator<a> it = a(aVar).iterator();
            while (it.hasNext()) {
                C1034b c1034b = map.get(it.next());
                if (a(c1034b)) {
                    return c1034b;
                }
            }
        }
        return null;
    }

    /* JADX WARN: Removed duplicated region for block: B:12:0x0034 A[PHI: r0
      0x0034: PHI (r0v2 sg.bigo.ads.controller.a.a.b$b) = 
      (r0v1 sg.bigo.ads.controller.a.a.b$b)
      (r0v5 sg.bigo.ads.controller.a.a.b$b)
      (r0v7 sg.bigo.ads.controller.a.a.b$b)
      (r0v9 sg.bigo.ads.controller.a.a.b$b)
     binds: [B:3:0x000b, B:5:0x0017, B:7:0x0023, B:9:0x002f] A[DONT_GENERATE, DONT_INLINE]] */
    @androidx.annotation.Nullable
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private sg.bigo.ads.controller.a.a.b.C1034b a(sg.bigo.ads.controller.a.a.b.a r6, boolean r7) {
        /*
            r5 = this;
            java.util.Map<sg.bigo.ads.controller.a.a.b$a, sg.bigo.ads.controller.a.a.b$b> r0 = r5.f82836f
            sg.bigo.ads.controller.a.a.b$b r0 = a(r0, r6)
            boolean r1 = a(r0)
            r2 = 0
            if (r1 != 0) goto L34
            java.util.Map<sg.bigo.ads.controller.a.a.b$a, java.util.List<sg.bigo.ads.controller.a.a.b$b>> r0 = r5.f82837g
            sg.bigo.ads.controller.a.a.b$b r0 = r5.b(r0, r6)
            boolean r1 = a(r0)
            if (r1 != 0) goto L34
            java.util.Map<sg.bigo.ads.controller.a.a.b$a, sg.bigo.ads.controller.a.a.b$b> r0 = r5.f82839i
            sg.bigo.ads.controller.a.a.b$b r0 = a(r0, r6)
            boolean r1 = a(r0)
            if (r1 != 0) goto L34
            java.util.Map<sg.bigo.ads.controller.a.a.b$a, java.util.List<sg.bigo.ads.controller.a.a.b$b>> r0 = r5.f82840j
            sg.bigo.ads.controller.a.a.b$b r0 = r5.b(r0, r6)
            boolean r1 = a(r0)
            if (r1 == 0) goto L32
            goto L34
        L32:
            r1 = r2
            goto L35
        L34:
            r1 = 1
        L35:
            java.lang.StringBuilder r3 = new java.lang.StringBuilder
            java.lang.String r4 = "getBestHost "
            r3.<init>(r4)
            if (r1 == 0) goto L41
            java.lang.String r1 = "success"
            goto L43
        L41:
            java.lang.String r1 = "fail"
        L43:
            r3.append(r1)
            if (r7 == 0) goto L4b
            java.lang.String r7 = " after reset"
            goto L4d
        L4b:
            java.lang.String r7 = ""
        L4d:
            r3.append(r7)
            java.lang.String r7 = ", countryKey="
            r3.append(r7)
            r3.append(r6)
            java.lang.String r6 = ", currentHost="
            r3.append(r6)
            sg.bigo.ads.controller.a.a.b$b r6 = r5.f82832b
            r3.append(r6)
            java.lang.String r6 = r3.toString()
            r7 = 3
            java.lang.String r1 = "AntiBanHost"
            sg.bigo.ads.common.t.a.a(r2, r7, r1, r6)
            boolean r6 = a(r0)
            if (r6 == 0) goto L73
            return r0
        L73:
            r6 = 0
            return r6
        */
        throw new UnsupportedOperationException("Method not decompiled: sg.bigo.ads.controller.a.a.b.a(sg.bigo.ads.controller.a.a.b$a, boolean):sg.bigo.ads.controller.a.a.b$b");
    }

    private void a(Map<a, C1034b> map, Map<a, List<C1034b>> map2, String str, int i10) {
        C1034b value;
        C1034b c1034b;
        synchronized (this) {
            if (!k.a(this.f82836f) && !k.a(map)) {
                for (Map.Entry<a, C1034b> entry : this.f82836f.entrySet()) {
                    a key = entry.getKey();
                    if (key != null && (value = entry.getValue()) != null && (c1034b = map.get(key)) != null && value.equals(c1034b)) {
                        value.a(c1034b.b());
                    }
                }
            }
            if (!k.a(this.f82837g) && !k.a(map2)) {
                for (Map.Entry<a, List<C1034b>> entry2 : this.f82837g.entrySet()) {
                    a key2 = entry2.getKey();
                    if (key2 != null) {
                        List<C1034b> value2 = entry2.getValue();
                        if (!k.a((Collection) value2)) {
                            List<C1034b> list = map2.get(key2);
                            if (!k.a((Collection) list)) {
                                for (C1034b c1034b2 : value2) {
                                    if (c1034b2 != null) {
                                        Iterator<C1034b> it = list.iterator();
                                        while (true) {
                                            if (it.hasNext()) {
                                                C1034b next = it.next();
                                                if (c1034b2.equals(next)) {
                                                    c1034b2.a(next.b());
                                                    break;
                                                }
                                            }
                                        }
                                    }
                                }
                            }
                        }
                    }
                }
            }
            C1034b c1034b3 = this.f82832b;
            if (c1034b3 != null) {
                if (c1034b3.d() == 1) {
                    C1034b c1034b4 = this.f82836f.get(new a(str, i10));
                    if (this.f82832b.equals(c1034b4)) {
                        this.f82832b.a(c1034b4.b());
                    }
                } else if (this.f82832b.d() == 2) {
                    List<C1034b> list2 = this.f82837g.get(new a(str, i10));
                    if (!k.a((Collection) list2)) {
                        Iterator<C1034b> it2 = list2.iterator();
                        while (true) {
                            if (!it2.hasNext()) {
                                break;
                            }
                            C1034b next2 = it2.next();
                            if (this.f82832b.equals(next2)) {
                                this.f82832b.a(next2.b());
                                break;
                            }
                        }
                    }
                }
            }
        }
    }

    private static boolean a(C1034b c1034b) {
        return c1034b != null && c1034b.f82846d;
    }

    @NonNull
    private Map<a, C1034b> b() {
        HashMap map = new HashMap();
        if (!TextUtils.isEmpty(this.f82834d)) {
            map.put(new a("all", 0), new C1034b(this.f82834d, "", 0));
        }
        if (!TextUtils.isEmpty(this.f82835e)) {
            map.put(new a("ru", 0), new C1034b(this.f82835e, "", 0));
        }
        return map;
    }

    @Nullable
    private C1034b b(Map<a, List<C1034b>> map, a aVar) {
        if (!k.a(map) && aVar != null) {
            Iterator<a> it = a(aVar).iterator();
            while (it.hasNext()) {
                C1034b c1034b = (C1034b) k.a(k.a(map.get(it.next()), new Comparable<C1034b>() { // from class: sg.bigo.ads.controller.a.a.b.1
                    @Override // java.lang.Comparable
                    public final /* bridge */ /* synthetic */ int compareTo(C1034b c1034b2) {
                        C1034b c1034b3 = c1034b2;
                        return (c1034b3 == null || !c1034b3.f82846d) ? 0 : 1;
                    }
                }));
                if (a(c1034b)) {
                    return c1034b;
                }
            }
        }
        return null;
    }

    /* JADX WARN: Removed duplicated region for block: B:26:0x0081  */
    /* JADX WARN: Removed duplicated region for block: B:39:0x0084 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:42:0x001e A[SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final android.util.Pair<java.lang.String, java.lang.Integer> a(sg.bigo.ads.api.a.h r10) {
        /*
            r9 = this;
            monitor-enter(r9)
            java.util.Map<sg.bigo.ads.controller.a.a.b$a, sg.bigo.ads.controller.a.a.b$b> r0 = r9.f82836f     // Catch: java.lang.Throwable -> L9f
            boolean r0 = sg.bigo.ads.common.utils.k.a(r0)     // Catch: java.lang.Throwable -> L9f
            r1 = 0
            if (r0 == 0) goto Lc
            monitor-exit(r9)     // Catch: java.lang.Throwable -> L9f
            return r1
        Lc:
            if (r10 != 0) goto L10
            monitor-exit(r9)     // Catch: java.lang.Throwable -> L9f
            return r1
        L10:
            long r2 = java.lang.System.currentTimeMillis()     // Catch: java.lang.Throwable -> L9f
            java.util.Map<sg.bigo.ads.controller.a.a.b$a, sg.bigo.ads.controller.a.a.b$b> r0 = r9.f82836f     // Catch: java.lang.Throwable -> L9f
            java.util.Set r0 = r0.entrySet()     // Catch: java.lang.Throwable -> L9f
            java.util.Iterator r0 = r0.iterator()     // Catch: java.lang.Throwable -> L9f
        L1e:
            boolean r4 = r0.hasNext()     // Catch: java.lang.Throwable -> L9f
            if (r4 == 0) goto L9d
            java.lang.Object r4 = r0.next()     // Catch: java.lang.Throwable -> L9f
            java.util.Map$Entry r4 = (java.util.Map.Entry) r4     // Catch: java.lang.Throwable -> L9f
            java.lang.Object r4 = r4.getValue()     // Catch: java.lang.Throwable -> L9f
            sg.bigo.ads.controller.a.a.b$b r4 = (sg.bigo.ads.controller.a.a.b.C1034b) r4     // Catch: java.lang.Throwable -> L9f
            boolean r5 = r4.f82846d     // Catch: java.lang.Throwable -> L9f
            if (r5 != 0) goto L1e
            int r5 = sg.bigo.ads.controller.a.a.b.C1034b.b(r4)     // Catch: java.lang.Throwable -> L9f
            int r6 = r10.y()     // Catch: java.lang.Throwable -> L9f
            int r5 = r5 % r6
            if (r5 != 0) goto L67
            sg.bigo.ads.controller.a.a.b.C1034b.c(r4)     // Catch: java.lang.Throwable -> L9f
            long r5 = sg.bigo.ads.controller.a.a.b.C1034b.d(r4)     // Catch: java.lang.Throwable -> L9f
            r7 = 0
            int r5 = (r5 > r7 ? 1 : (r5 == r7 ? 0 : -1))
            if (r5 != 0) goto L4d
            goto L82
        L4d:
            long r5 = sg.bigo.ads.controller.a.a.b.C1034b.d(r4)     // Catch: java.lang.Throwable -> L9f
            long r5 = r2 - r5
            long r5 = java.lang.Math.abs(r5)     // Catch: java.lang.Throwable -> L9f
            float r5 = (float) r5     // Catch: java.lang.Throwable -> L9f
            r6 = 1285868416(0x4ca4cb80, float:8.64E7)
            float r5 = r5 / r6
            int r5 = java.lang.Math.round(r5)     // Catch: java.lang.Throwable -> L9f
            int r6 = r10.A()     // Catch: java.lang.Throwable -> L9f
            if (r5 <= r6) goto L81
            goto L82
        L67:
            long r5 = sg.bigo.ads.controller.a.a.b.C1034b.d(r4)     // Catch: java.lang.Throwable -> L9f
            long r5 = r2 - r5
            long r5 = java.lang.Math.abs(r5)     // Catch: java.lang.Throwable -> L9f
            float r5 = (float) r5     // Catch: java.lang.Throwable -> L9f
            r6 = 1198153728(0x476a6000, float:60000.0)
            float r5 = r5 / r6
            int r5 = java.lang.Math.round(r5)     // Catch: java.lang.Throwable -> L9f
            int r6 = r10.z()     // Catch: java.lang.Throwable -> L9f
            if (r5 <= r6) goto L81
            goto L82
        L81:
            r4 = r1
        L82:
            if (r4 == 0) goto L1e
            sg.bigo.ads.controller.a.a.b.C1034b.a(r4, r2)     // Catch: java.lang.Throwable -> L9f
            sg.bigo.ads.controller.a.a.b.C1034b.e(r4)     // Catch: java.lang.Throwable -> L9f
            android.util.Pair r10 = new android.util.Pair     // Catch: java.lang.Throwable -> L9f
            java.lang.String r0 = r4.a()     // Catch: java.lang.Throwable -> L9f
            int r1 = sg.bigo.ads.controller.a.a.b.C1034b.b(r4)     // Catch: java.lang.Throwable -> L9f
            java.lang.Integer r1 = java.lang.Integer.valueOf(r1)     // Catch: java.lang.Throwable -> L9f
            r10.<init>(r0, r1)     // Catch: java.lang.Throwable -> L9f
            monitor-exit(r9)     // Catch: java.lang.Throwable -> L9f
            return r10
        L9d:
            monitor-exit(r9)     // Catch: java.lang.Throwable -> L9f
            return r1
        L9f:
            r10 = move-exception
            monitor-exit(r9)     // Catch: java.lang.Throwable -> L9f
            throw r10
        */
        throw new UnsupportedOperationException("Method not decompiled: sg.bigo.ads.controller.a.a.b.a(sg.bigo.ads.api.a.h):android.util.Pair");
    }

    @NonNull
    public final sg.bigo.ads.controller.a.e a(String str, int i10) {
        boolean z10;
        synchronized (this) {
            C1034b c1034b = this.f82832b;
            if (c1034b != null && this.f82833c < this.f82838h) {
                return new sg.bigo.ads.controller.a.e(c1034b, false, false);
            }
            a aVar = new a(str, i10);
            C1034b c1034bA = a(aVar, false);
            if (a(c1034bA)) {
                z10 = false;
            } else {
                a();
                c1034bA = a(aVar, true);
                z10 = true;
            }
            if (a(c1034bA)) {
                c1034bA.f82846d = false;
                this.f82831a = this.f82832b;
                this.f82832b = new C1034b(c1034bA.a(), c1034bA.b(), c1034bA.d());
                this.f82833c = 0;
            }
            if (this.f82832b == null) {
                this.f82832b = new C1034b(this.f82834d, "", 0);
            }
            return new sg.bigo.ads.controller.a.e(this.f82832b, z10, true);
        }
    }

    public final void a() {
        Map<a, C1034b> map = this.f82836f;
        if (map != null) {
            Iterator<Map.Entry<a, C1034b>> it = map.entrySet().iterator();
            while (it.hasNext()) {
                C1034b value = it.next().getValue();
                if (value != null) {
                    value.f82846d = true;
                }
            }
        }
        Map<a, List<C1034b>> map2 = this.f82837g;
        if (map2 != null) {
            Iterator<Map.Entry<a, List<C1034b>>> it2 = map2.entrySet().iterator();
            while (it2.hasNext()) {
                List<C1034b> value2 = it2.next().getValue();
                if (!k.a((Collection) value2)) {
                    Iterator<C1034b> it3 = value2.iterator();
                    while (it3.hasNext()) {
                        it3.next().f82846d = true;
                    }
                }
            }
        }
        Map<a, List<C1034b>> map3 = this.f82840j;
        if (map3 != null) {
            Iterator<Map.Entry<a, List<C1034b>>> it4 = map3.entrySet().iterator();
            while (it4.hasNext()) {
                List<C1034b> value3 = it4.next().getValue();
                if (!k.a((Collection) value3)) {
                    Iterator<C1034b> it5 = value3.iterator();
                    while (it5.hasNext()) {
                        it5.next().f82846d = true;
                    }
                }
            }
        }
        Map<a, C1034b> map4 = this.f82839i;
        if (map4 != null) {
            Iterator<Map.Entry<a, C1034b>> it6 = map4.entrySet().iterator();
            while (it6.hasNext()) {
                C1034b value4 = it6.next().getValue();
                if (value4 != null) {
                    value4.f82846d = true;
                }
            }
        }
        this.f82831a = this.f82832b;
        this.f82832b = null;
        this.f82833c = 0;
    }

    @Override // sg.bigo.ads.common.f
    @CallSuper
    public void a(@NonNull Parcel parcel) {
        synchronized (this) {
            n.a(parcel, this.f82836f);
            n.b(parcel, this.f82837g);
            parcel.writeInt(this.f82838h);
            n.a(parcel, this.f82839i);
            n.b(parcel, this.f82840j);
            n.a(parcel, this.f82831a);
            n.a(parcel, this.f82832b);
            parcel.writeInt(this.f82833c);
        }
    }

    public void a(@NonNull JSONObject jSONObject, boolean z10, String str, int i10) {
        synchronized (this) {
            HashMap map = new HashMap();
            JSONArray jSONArrayOptJSONArray = jSONObject.optJSONArray("country_hosts");
            if (jSONArrayOptJSONArray != null) {
                for (int i11 = 0; i11 < jSONArrayOptJSONArray.length(); i11++) {
                    JSONObject jSONObjectOptJSONObject = jSONArrayOptJSONArray.optJSONObject(i11);
                    if (jSONObjectOptJSONObject != null) {
                        String strOptString = jSONObjectOptJSONObject.optString("host", "");
                        if (sg.bigo.ads.controller.a.d.a(strOptString)) {
                            map.put(new a(jSONObjectOptJSONObject.optString("country", "all"), jSONObjectOptJSONObject.optInt("app_flag", 0)), new C1034b(strOptString, jSONObjectOptJSONObject.optString("domain_front", ""), 1));
                        }
                    }
                }
            }
            HashMap map2 = new HashMap();
            JSONArray jSONArrayOptJSONArray2 = jSONObject.optJSONArray("backup_hosts");
            if (jSONArrayOptJSONArray2 != null) {
                for (int i12 = 0; i12 < jSONArrayOptJSONArray2.length(); i12++) {
                    JSONObject jSONObjectOptJSONObject2 = jSONArrayOptJSONArray2.optJSONObject(i12);
                    if (jSONObjectOptJSONObject2 != null) {
                        a aVar = new a(jSONObjectOptJSONObject2.optString("country", "all"), jSONObjectOptJSONObject2.optInt("app_flag", 0));
                        List<C1034b> arrayList = map2.get(aVar);
                        if (arrayList == null) {
                            arrayList = new ArrayList<>();
                            map2.put(aVar, arrayList);
                        }
                        String strOptString2 = jSONObjectOptJSONObject2.optString("domain_front", "");
                        JSONArray jSONArrayOptJSONArray3 = jSONObjectOptJSONObject2.optJSONArray("hosts");
                        if (jSONArrayOptJSONArray3 != null) {
                            for (int i13 = 0; i13 < jSONArrayOptJSONArray3.length(); i13++) {
                                String strOptString3 = jSONArrayOptJSONArray3.optString(i13, "");
                                if (sg.bigo.ads.controller.a.d.a(strOptString3)) {
                                    C1034b c1034b = new C1034b(strOptString3, strOptString2, 2);
                                    if (!arrayList.contains(c1034b)) {
                                        arrayList.add(c1034b);
                                    }
                                }
                            }
                        }
                    }
                }
            }
            if (z10) {
                a(map, map2, str, i10);
            } else {
                int iOptInt = jSONObject.optInt("threshold", 3);
                this.f82836f = map;
                this.f82837g = map2;
                this.f82838h = iOptInt;
                this.f82840j = new HashMap();
                this.f82839i = b();
                this.f82831a = this.f82832b;
                this.f82832b = null;
                this.f82833c = 0;
            }
        }
    }

    public final boolean a(String str, String str2) {
        synchronized (this) {
            if (!sg.bigo.ads.controller.a.d.a(str2)) {
                return false;
            }
            a aVar = new a(str, 0);
            if (this.f82840j == null) {
                this.f82840j = new HashMap();
            }
            List<C1034b> arrayList = this.f82840j.get(aVar);
            if (arrayList == null) {
                arrayList = new ArrayList<>();
                this.f82840j.put(aVar, arrayList);
            }
            C1034b c1034b = new C1034b(str2, "", 3);
            if (arrayList.contains(c1034b)) {
                return false;
            }
            arrayList.add(c1034b);
            return true;
        }
    }

    public final boolean a(String str, String str2, int i10, sg.bigo.ads.api.a.h hVar, boolean z10) {
        Map<a, C1034b> map;
        Map<a, List<C1034b>> map2;
        boolean z11;
        synchronized (this) {
            if (!TextUtils.isEmpty(str) && (map = this.f82836f) != null && hVar != null) {
                C1034b c1034b = null;
                Iterator<Map.Entry<a, C1034b>> it = map.entrySet().iterator();
                while (true) {
                    if (!it.hasNext()) {
                        break;
                    }
                    C1034b value = it.next().getValue();
                    if (!TextUtils.equals(value.a(), str)) {
                        z11 = false;
                    } else {
                        if (z10) {
                            C1034b.c(value);
                            C1034b.f(value);
                            break;
                        }
                        C1034b.g(value);
                        z11 = true;
                    }
                    if (z11 && value.f82849h != 0 && value.f82849h % hVar.y() == 0) {
                        c1034b = value;
                        break;
                    }
                }
                if (c1034b == null) {
                    return false;
                }
                C1034b.c(c1034b);
                C1034b.f(c1034b);
                C1034b c1034bA = a(this.f82836f, new a(str2, i10));
                if (c1034bA != null) {
                    c1034b = c1034bA;
                }
                C1034b c1034b2 = this.f82832b;
                if (c1034b2 != null) {
                    synchronized (this) {
                        ArrayList arrayList = new ArrayList();
                        int iD = c1034b2.d();
                        if (iD == 0) {
                            Map<a, C1034b> map3 = this.f82839i;
                            if (map3 != null) {
                                for (C1034b c1034b3 : map3.values()) {
                                    if (c1034b3 != null && TextUtils.equals(c1034b3.a(), c1034b2.a())) {
                                        arrayList.add(c1034b3);
                                    }
                                }
                            }
                        } else if (iD == 1) {
                            Map<a, C1034b> map4 = this.f82836f;
                            if (map4 != null) {
                                for (C1034b c1034b4 : map4.values()) {
                                    if (c1034b4 != null && TextUtils.equals(c1034b4.a(), c1034b2.a())) {
                                        arrayList.add(c1034b4);
                                    }
                                }
                            }
                        } else if (iD == 2) {
                            Map<a, List<C1034b>> map5 = this.f82837g;
                            if (map5 != null) {
                                Iterator<List<C1034b>> it2 = map5.values().iterator();
                                while (it2.hasNext()) {
                                    for (C1034b c1034b5 : it2.next()) {
                                        if (c1034b5 != null && TextUtils.equals(c1034b5.a(), c1034b2.a())) {
                                            arrayList.add(c1034b5);
                                        }
                                    }
                                }
                            }
                        } else if (iD == 3 && (map2 = this.f82840j) != null) {
                            Iterator<List<C1034b>> it3 = map2.values().iterator();
                            while (it3.hasNext()) {
                                for (C1034b c1034b6 : it3.next()) {
                                    if (c1034b6 != null && TextUtils.equals(c1034b6.a(), c1034b2.a())) {
                                        arrayList.add(c1034b6);
                                    }
                                }
                            }
                        }
                        if (!arrayList.isEmpty()) {
                            Iterator it4 = arrayList.iterator();
                            while (it4.hasNext()) {
                                ((C1034b) it4.next()).f82846d = true;
                            }
                        }
                    }
                }
                this.f82831a = this.f82832b;
                this.f82832b = c1034b;
                this.f82833c = 0;
                return true;
            }
            return false;
        }
    }

    @Override // sg.bigo.ads.common.f
    @CallSuper
    public void b(@NonNull Parcel parcel) {
        synchronized (this) {
            this.f82836f = n.a(parcel, a.f82842c, C1034b.f82845e);
            this.f82837g = n.b(parcel, a.f82842c, C1034b.f82845e);
            this.f82838h = n.a(parcel, 3);
            Map mapA = n.a(parcel, a.f82842c, C1034b.f82845e);
            this.f82840j = n.b(parcel, a.f82842c, C1034b.f82845e);
            this.f82831a = (C1034b) n.b(parcel, C1034b.f82845e);
            this.f82832b = (C1034b) n.b(parcel, C1034b.f82845e);
            this.f82833c = n.a(parcel, 0);
            this.f82839i = b();
            HashSet hashSet = new HashSet();
            for (C1034b c1034b : this.f82839i.values()) {
                hashSet.add(c1034b.a());
                if (!k.a(mapA)) {
                    for (C1034b c1034b2 : mapA.values()) {
                        if (TextUtils.equals(c1034b.a(), c1034b2.a())) {
                            c1034b.f82846d = c1034b2.f82846d;
                        }
                    }
                }
            }
            C1034b c1034b3 = this.f82832b;
            if (c1034b3 != null && c1034b3.d() == 0 && !hashSet.contains(this.f82832b.a())) {
                this.f82831a = this.f82832b;
                this.f82832b = null;
                this.f82833c = 0;
            }
        }
    }

    @NonNull
    public String toString() {
        return super.toString();
    }
}
