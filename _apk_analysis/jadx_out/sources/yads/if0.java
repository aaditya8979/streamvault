package yads;

import android.content.Context;
import android.text.TextUtils;
import android.util.Pair;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashMap;
import java.util.List;
import java.util.RandomAccess;
import yads.ef0;
import yads.h73;
import yads.hf0;
import yads.if0;
import yads.mx0;
import yads.xe0;

/* JADX INFO: loaded from: classes9.dex */
public final class if0 extends mi1 {

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public static final sa2 f90794i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public static final sa2 f90795j;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final Object f90796c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final np0 f90797d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final boolean f90798e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final af0 f90799f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final df0 f90800g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public pk f90801h;

    static {
        Comparator comparator = new Comparator() { // from class: bt.u2
            @Override // java.util.Comparator
            public final int compare(Object obj, Object obj2) {
                return if0.a((Integer) obj, (Integer) obj2);
            }
        };
        f90794i = comparator instanceof sa2 ? (sa2) comparator : new ey(comparator);
        Comparator comparator2 = new Comparator() { // from class: bt.v2
            @Override // java.util.Comparator
            public final int compare(Object obj, Object obj2) {
                return if0.b((Integer) obj, (Integer) obj2);
            }
        };
        f90795j = comparator2 instanceof sa2 ? (sa2) comparator2 : new ey(comparator2);
    }

    public if0(Context context, af0 af0Var, dc dcVar) {
        this(af0Var, dcVar, context);
    }

    public if0(af0 af0Var, dc dcVar, Context context) {
        this.f90796c = new Object();
        if (context != null) {
            context.getApplicationContext();
        }
        this.f90797d = dcVar;
        this.f90799f = af0Var;
        this.f90801h = pk.f93612h;
        boolean z10 = context != null && ib3.d(context);
        this.f90798e = z10;
        if (!z10 && context != null && ib3.f90737a >= 32) {
            this.f90800g = df0.a(context);
        }
        if (af0Var.L && context == null) {
            ih1.d("DefaultTrackSelector", "Audio channel count constraints cannot be applied without reference to Context. Build the track selector instance with one of the non-deprecated constructors that take a Context argument.");
        }
    }

    public static int a(int i10, int i11) {
        if (i10 == 0 || i10 != i11) {
            return Integer.bitCount(i10 & i11);
        }
        return Integer.MAX_VALUE;
    }

    public static /* synthetic */ int a(Integer num, Integer num2) {
        if (num.intValue() == -1) {
            return num2.intValue() == -1 ? 0 : -1;
        }
        if (num2.intValue() == -1) {
            return 1;
        }
        return num.intValue() - num2.intValue();
    }

    public static int a(String str) {
        if (str == null) {
            return 0;
        }
        switch (str) {
        }
        return 0;
    }

    public static int a(mx0 mx0Var, String str, boolean z10) {
        if (!TextUtils.isEmpty(str) && str.equals(mx0Var.f92601d)) {
            return 4;
        }
        String strB = b(str);
        String strB2 = b(mx0Var.f92601d);
        if (strB2 == null || strB == null) {
            return (z10 && strB2 == null) ? 1 : 0;
        }
        if (strB2.startsWith(strB) || strB.startsWith(strB2)) {
            return 3;
        }
        int i10 = ib3.f90737a;
        return strB2.split("-", 2)[0].equals(strB.split("-", 2)[0]) ? 2 : 0;
    }

    public static Pair a(int i10, li1 li1Var, int[][][] iArr, ff0 ff0Var, Comparator comparator) {
        int i11;
        RandomAccess randomAccessA;
        li1 li1Var2 = li1Var;
        ArrayList arrayList = new ArrayList();
        int i12 = li1Var2.f91977a;
        int i13 = 0;
        int i14 = 0;
        while (i14 < i12) {
            if (i10 == li1Var2.f91978b[i14]) {
                i73 i73Var = li1Var2.f91979c[i14];
                int i15 = i13;
                while (i15 < i73Var.f90695b) {
                    h73 h73VarA = i73Var.a(i15);
                    List listA = ff0Var.a(i14, h73VarA, iArr[i14][i15]);
                    boolean[] zArr = new boolean[h73VarA.f90268b];
                    int i16 = i13;
                    while (i16 < h73VarA.f90268b) {
                        gf0 gf0Var = (gf0) listA.get(i16);
                        int iA = gf0Var.a();
                        if (zArr[i16] || iA == 0) {
                            i11 = i12;
                        } else {
                            if (iA == 1) {
                                Object[] objArr = new Object[1];
                                objArr[i13] = gf0Var;
                                randomAccessA = p51.a(objArr);
                                i11 = i12;
                            } else {
                                ArrayList arrayList2 = new ArrayList();
                                arrayList2.add(gf0Var);
                                int i17 = i16 + 1;
                                while (i17 < h73VarA.f90268b) {
                                    gf0 gf0Var2 = (gf0) listA.get(i17);
                                    int i18 = i12;
                                    if (gf0Var2.a() == 2 && gf0Var.a(gf0Var2)) {
                                        arrayList2.add(gf0Var2);
                                        zArr[i17] = true;
                                    }
                                    i17++;
                                    i12 = i18;
                                }
                                i11 = i12;
                                randomAccessA = arrayList2;
                            }
                            arrayList.add(randomAccessA);
                        }
                        i16++;
                        i12 = i11;
                        i13 = 0;
                    }
                    i15++;
                    i13 = 0;
                }
            }
            i14++;
            li1Var2 = li1Var;
            i12 = i12;
            i13 = 0;
        }
        if (arrayList.isEmpty()) {
            return null;
        }
        List list = (List) Collections.max(arrayList, comparator);
        int[] iArr2 = new int[list.size()];
        for (int i19 = 0; i19 < list.size(); i19++) {
            iArr2[i19] = ((gf0) list.get(i19)).f89976d;
        }
        gf0 gf0Var3 = (gf0) list.get(0);
        return Pair.create(new mp0(0, gf0Var3.f89975c, iArr2), Integer.valueOf(gf0Var3.f89974b));
    }

    public static Pair a(li1 li1Var, int[][][] iArr, final af0 af0Var, final String str) {
        return a(3, li1Var, iArr, new ff0() { // from class: bt.y2
            @Override // yads.ff0
            public final List a(int i10, h73 h73Var, int[] iArr2) {
                return if0.a(af0Var, str, i10, h73Var, iArr2);
            }
        }, new Comparator() { // from class: bt.z2
            @Override // java.util.Comparator
            public final int compare(Object obj, Object obj2) {
                return ef0.a((List) obj, (List) obj2);
            }
        });
    }

    public static Pair a(li1 li1Var, int[][][] iArr, final int[] iArr2, final af0 af0Var) {
        return a(2, li1Var, iArr, new ff0() { // from class: bt.a3
            @Override // yads.ff0
            public final List a(int i10, h73 h73Var, int[] iArr3) {
                return if0.a(af0Var, iArr2, i10, h73Var, iArr3);
            }
        }, new Comparator() { // from class: bt.b3
            @Override // java.util.Comparator
            public final int compare(Object obj, Object obj2) {
                return hf0.a((List) obj, (List) obj2);
            }
        });
    }

    public static List a(af0 af0Var, String str, int i10, h73 h73Var, int[] iArr) {
        m51 m51Var = p51.f93439c;
        kx.a(4, "initialCapacity");
        Object[] objArrCopyOf = new Object[4];
        int i11 = 0;
        int i12 = 0;
        while (i11 < h73Var.f90268b) {
            ef0 ef0Var = new ef0(i10, h73Var, i11, af0Var, iArr[i11], str);
            int i13 = i12 + 1;
            if (objArrCopyOf.length < i13) {
                objArrCopyOf = Arrays.copyOf(objArrCopyOf, i51.a(objArrCopyOf.length, i13));
            }
            objArrCopyOf[i12] = ef0Var;
            i11++;
            i12 = i13;
        }
        return p51.b(i12, objArrCopyOf);
    }

    /* JADX WARN: Removed duplicated region for block: B:22:0x0039  */
    /* JADX WARN: Removed duplicated region for block: B:25:0x0041  */
    /* JADX WARN: Removed duplicated region for block: B:26:0x004c  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static java.util.List a(yads.af0 r19, int[] r20, int r21, yads.h73 r22, int[] r23) {
        /*
            Method dump skipped, instruction units count: 210
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: yads.if0.a(yads.af0, int[], int, yads.h73, int[]):java.util.List");
    }

    public static void a(i73 i73Var, af0 af0Var, HashMap map) {
        o73 o73Var;
        for (int i10 = 0; i10 < i73Var.f90695b; i10++) {
            o73 o73Var2 = (o73) af0Var.f93947z.get(i73Var.a(i10));
            if (o73Var2 != null && ((o73Var = (o73) map.get(Integer.valueOf(o73Var2.f93139b.f90270d))) == null || (o73Var.f93140c.isEmpty() && !o73Var2.f93140c.isEmpty()))) {
                map.put(Integer.valueOf(o73Var2.f93139b.f90270d), o73Var2);
            }
        }
    }

    public static boolean a(boolean z10, int i10) {
        int i11 = i10 & 7;
        return i11 == 4 || (z10 && i11 == 3);
    }

    public static /* synthetic */ int b(Integer num, Integer num2) {
        return 0;
    }

    public static String b(String str) {
        if (TextUtils.isEmpty(str) || TextUtils.equals(str, "und")) {
            return null;
        }
        return str;
    }

    public final Pair a(li1 li1Var, int[][][] iArr, final af0 af0Var) {
        final boolean z10 = false;
        int i10 = 0;
        while (true) {
            if (i10 < li1Var.f91977a) {
                if (2 == li1Var.f91978b[i10] && li1Var.f91979c[i10].f90695b > 0) {
                    z10 = true;
                    break;
                }
                i10++;
            } else {
                break;
            }
        }
        return a(1, li1Var, iArr, new ff0() { // from class: bt.w2
            @Override // yads.ff0
            public final List a(int i11, h73 h73Var, int[] iArr2) {
                return this.f6362a.a(af0Var, z10, i11, h73Var, iArr2);
            }
        }, new Comparator() { // from class: bt.x2
            @Override // java.util.Comparator
            public final int compare(Object obj, Object obj2) {
                return xe0.a((List) obj, (List) obj2);
            }
        });
    }

    public final List a(af0 af0Var, boolean z10, int i10, h73 h73Var, int[] iArr) {
        og2 og2Var = new og2() { // from class: bt.c3
            @Override // yads.og2
            public final boolean apply(Object obj) {
                return this.f5967b.a((mx0) obj);
            }
        };
        m51 m51Var = p51.f93439c;
        kx.a(4, "initialCapacity");
        Object[] objArrCopyOf = new Object[4];
        int i11 = 0;
        int i12 = 0;
        while (i11 < h73Var.f90268b) {
            xe0 xe0Var = new xe0(i10, h73Var, i11, af0Var, iArr[i11], z10, og2Var);
            int i13 = i12 + 1;
            if (objArrCopyOf.length < i13) {
                objArrCopyOf = Arrays.copyOf(objArrCopyOf, i51.a(objArrCopyOf.length, i13));
            }
            objArrCopyOf[i12] = xe0Var;
            i11++;
            i12 = i13;
        }
        return p51.b(i12, objArrCopyOf);
    }

    @Override // yads.s73
    public final void a() {
        df0 df0Var;
        synchronized (this.f90796c) {
            if (ib3.f90737a >= 32 && (df0Var = this.f90800g) != null) {
                df0Var.c();
            }
        }
        this.f94729a = null;
        this.f94730b = null;
    }

    @Override // yads.s73
    public final void a(pk pkVar) {
        boolean z10;
        synchronized (this.f90796c) {
            z10 = !this.f90801h.equals(pkVar);
            this.f90801h = pkVar;
        }
        if (z10) {
            b();
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:40:0x005e A[Catch: all -> 0x0085, FALL_THROUGH, TryCatch #0 {, blocks: (B:4:0x0003, B:6:0x000b, B:8:0x000f, B:10:0x0014, B:34:0x0052, B:36:0x0056, B:38:0x005a, B:40:0x005e, B:42:0x0062, B:44:0x0066, B:46:0x006a, B:48:0x0070, B:50:0x0078, B:53:0x0083), top: B:58:0x0003 }] */
    /* JADX WARN: Removed duplicated region for block: B:52:0x0082  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final boolean a(yads.mx0 r9) {
        /*
            r8 = this;
            java.lang.Object r0 = r8.f90796c
            monitor-enter(r0)
            yads.af0 r1 = r8.f90799f     // Catch: java.lang.Throwable -> L85
            boolean r1 = r1.L     // Catch: java.lang.Throwable -> L85
            r2 = 0
            r3 = 1
            if (r1 == 0) goto L82
            boolean r1 = r8.f90798e     // Catch: java.lang.Throwable -> L85
            if (r1 != 0) goto L82
            int r1 = r9.f92623z     // Catch: java.lang.Throwable -> L85
            r4 = 2
            if (r1 <= r4) goto L82
            java.lang.String r1 = r9.f92610m     // Catch: java.lang.Throwable -> L85
            r5 = 32
            if (r1 != 0) goto L1b
            goto L5e
        L1b:
            r6 = -1
            int r7 = r1.hashCode()
            switch(r7) {
                case -2123537834: goto L44;
                case 187078296: goto L39;
                case 187078297: goto L30;
                case 1504578661: goto L25;
                default: goto L23;
            }
        L23:
            r4 = r6
            goto L4e
        L25:
            java.lang.String r4 = "audio/eac3"
            boolean r1 = r1.equals(r4)
            if (r1 != 0) goto L2e
            goto L23
        L2e:
            r4 = 3
            goto L4e
        L30:
            java.lang.String r7 = "audio/ac4"
            boolean r1 = r1.equals(r7)
            if (r1 != 0) goto L4e
            goto L23
        L39:
            java.lang.String r4 = "audio/ac3"
            boolean r1 = r1.equals(r4)
            if (r1 != 0) goto L42
            goto L23
        L42:
            r4 = r3
            goto L4e
        L44:
            java.lang.String r4 = "audio/eac3-joc"
            boolean r1 = r1.equals(r4)
            if (r1 != 0) goto L4d
            goto L23
        L4d:
            r4 = r2
        L4e:
            switch(r4) {
                case 0: goto L52;
                case 1: goto L52;
                case 2: goto L52;
                case 3: goto L52;
                default: goto L51;
            }
        L51:
            goto L5e
        L52:
            int r1 = yads.ib3.f90737a     // Catch: java.lang.Throwable -> L85
            if (r1 < r5) goto L82
            yads.df0 r1 = r8.f90800g     // Catch: java.lang.Throwable -> L85
            if (r1 == 0) goto L82
            boolean r1 = r1.f88842b     // Catch: java.lang.Throwable -> L85
            if (r1 == 0) goto L82
        L5e:
            int r1 = yads.ib3.f90737a     // Catch: java.lang.Throwable -> L85
            if (r1 < r5) goto L83
            yads.df0 r1 = r8.f90800g     // Catch: java.lang.Throwable -> L85
            if (r1 == 0) goto L83
            boolean r4 = r1.f88842b     // Catch: java.lang.Throwable -> L85
            if (r4 == 0) goto L83
            boolean r1 = r1.a()     // Catch: java.lang.Throwable -> L85
            if (r1 == 0) goto L83
            yads.df0 r1 = r8.f90800g     // Catch: java.lang.Throwable -> L85
            boolean r1 = r1.b()     // Catch: java.lang.Throwable -> L85
            if (r1 == 0) goto L83
            yads.df0 r1 = r8.f90800g     // Catch: java.lang.Throwable -> L85
            yads.pk r4 = r8.f90801h     // Catch: java.lang.Throwable -> L85
            boolean r9 = r1.a(r9, r4)     // Catch: java.lang.Throwable -> L85
            if (r9 == 0) goto L83
        L82:
            r2 = r3
        L83:
            monitor-exit(r0)     // Catch: java.lang.Throwable -> L85
            return r2
        L85:
            r9 = move-exception
            monitor-exit(r0)     // Catch: java.lang.Throwable -> L85
            throw r9
        */
        throw new UnsupportedOperationException("Method not decompiled: yads.if0.a(yads.mx0):boolean");
    }

    public final void b() {
        boolean z10;
        r73 r73Var;
        df0 df0Var;
        synchronized (this.f90796c) {
            z10 = this.f90799f.L && !this.f90798e && ib3.f90737a >= 32 && (df0Var = this.f90800g) != null && df0Var.f88842b;
        }
        if (!z10 || (r73Var = this.f94729a) == null) {
            return;
        }
        ((go0) r73Var).f90061i.f90680a.sendEmptyMessage(10);
    }
}
