package yads;

import android.util.Pair;
import android.util.SparseArray;
import android.util.SparseIntArray;
import io.appmetrica.analytics.coreutils.internal.StringUtils;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.IdentityHashMap;
import java.util.List;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/* JADX INFO: loaded from: classes11.dex */
public final class h30 implements pm1, qx2, ku {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final int f90207b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final a30 f90208c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final r83 f90209d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final sk0 f90210e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final ae0 f90211f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final vo f90212g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final long f90213h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final gg1 f90214i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final qe f90215j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public final i73 f90216k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public final g30[] f90217l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public final hc0 f90218m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public final ue2 f90219n;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public final bn1 f90221p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public final ok0 f90222q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public final ye2 f90223r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public om1 f90224s;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public sy f90227v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public c30 f90228w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public int f90229x;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public List f90230y;

    /* JADX INFO: renamed from: z, reason: collision with root package name */
    public static final Pattern f90206z = Pattern.compile("CC([1-4])=(.+)");
    public static final Pattern A = Pattern.compile("([1-4])=lang:(\\w+)(,.+)?");

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public lu[] f90225t = a();

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    public zm0[] f90226u = new zm0[0];

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public final IdentityHashMap f90220o = new IdentityHashMap();

    public h30(int i10, c30 c30Var, vo voVar, int i11, a30 a30Var, r83 r83Var, sk0 sk0Var, ok0 ok0Var, ae0 ae0Var, bn1 bn1Var, long j10, gg1 gg1Var, qe qeVar, hc0 hc0Var, com.monetization.ads.exo.source.dash.c cVar, ye2 ye2Var) {
        this.f90207b = i10;
        this.f90228w = c30Var;
        this.f90212g = voVar;
        this.f90229x = i11;
        this.f90208c = a30Var;
        this.f90209d = r83Var;
        this.f90210e = sk0Var;
        this.f90222q = ok0Var;
        this.f90211f = ae0Var;
        this.f90221p = bn1Var;
        this.f90213h = j10;
        this.f90214i = gg1Var;
        this.f90215j = qeVar;
        this.f90218m = hc0Var;
        this.f90223r = ye2Var;
        this.f90219n = new ue2(c30Var, cVar, qeVar);
        lu[] luVarArr = this.f90225t;
        hc0Var.getClass();
        this.f90227v = hc0.a(luVarArr);
        fc2 fc2VarA = c30Var.a(i11);
        List list = fc2VarA.f89533d;
        this.f90230y = list;
        Pair pairA = a(sk0Var, fc2VarA.f89532c, list);
        this.f90216k = (i73) pairA.first;
        this.f90217l = (g30[]) pairA.second;
    }

    public static Pair a(sk0 sk0Var, List list, List list2) {
        int i10;
        int i11;
        int i12;
        mx0[] mx0VarArrA;
        int iMin;
        wf0 wf0VarA;
        List list3 = list;
        int size = list.size();
        SparseIntArray sparseIntArray = new SparseIntArray(size);
        ArrayList arrayList = new ArrayList(size);
        SparseArray sparseArray = new SparseArray(size);
        for (int i13 = 0; i13 < size; i13++) {
            sparseIntArray.put(((zb) list3.get(i13)).f97446a, i13);
            ArrayList arrayList2 = new ArrayList();
            arrayList2.add(Integer.valueOf(i13));
            arrayList.add(arrayList2);
            sparseArray.put(i13, arrayList2);
        }
        for (int i14 = 0; i14 < size; i14++) {
            zb zbVar = (zb) list3.get(i14);
            wf0 wf0VarA2 = a("http://dashif.org/guidelines/trickmode", zbVar.f97450e);
            if (wf0VarA2 == null) {
                wf0VarA2 = a("http://dashif.org/guidelines/trickmode", zbVar.f97451f);
            }
            if (wf0VarA2 == null || (iMin = sparseIntArray.get(Integer.parseInt(wf0VarA2.f96365b), -1)) == -1) {
                iMin = i14;
            }
            if (iMin == i14 && (wf0VarA = a("urn:mpeg:dash:adaptation-set-switching:2016", zbVar.f97451f)) != null) {
                String str = wf0VarA.f96365b;
                int i15 = ib3.f90737a;
                for (String str2 : str.split(StringUtils.COMMA, -1)) {
                    int i16 = sparseIntArray.get(Integer.parseInt(str2), -1);
                    if (i16 != -1) {
                        iMin = Math.min(iMin, i16);
                    }
                }
            }
            if (iMin != i14) {
                List list4 = (List) sparseArray.get(i14);
                List list5 = (List) sparseArray.get(iMin);
                list5.addAll(list4);
                sparseArray.put(i14, list5);
                arrayList.remove(list4);
            }
        }
        int size2 = arrayList.size();
        int[][] iArr = new int[size2][];
        for (int i17 = 0; i17 < size2; i17++) {
            int[] iArrA = td1.a((Collection) arrayList.get(i17));
            iArr[i17] = iArrA;
            Arrays.sort(iArrA);
        }
        boolean[] zArr = new boolean[size2];
        mx0[][] mx0VarArr = new mx0[size2][];
        int i18 = 0;
        for (int i19 = 0; i19 < size2; i19++) {
            int[] iArr2 = iArr[i19];
            int length = iArr2.length;
            int i20 = 0;
            while (true) {
                if (i20 >= length) {
                    break;
                }
                List list6 = ((zb) list3.get(iArr2[i20])).f97448c;
                for (int i21 = 0; i21 < list6.size(); i21++) {
                    if (!((lo2) list6.get(i21)).f92052d.isEmpty()) {
                        zArr[i19] = true;
                        i18++;
                        break;
                    }
                }
                i20++;
            }
            int[] iArr3 = iArr[i19];
            int length2 = iArr3.length;
            int i22 = 0;
            while (true) {
                if (i22 >= length2) {
                    mx0VarArrA = new mx0[0];
                    break;
                }
                int i23 = iArr3[i22];
                zb zbVar2 = (zb) list3.get(i23);
                List list7 = ((zb) list3.get(i23)).f97449d;
                for (int i24 = 0; i24 < list7.size(); i24++) {
                    wf0 wf0Var = (wf0) list7.get(i24);
                    if ("urn:scte:dash:cc:cea-608:2015".equals(wf0Var.f96364a)) {
                        lx0 lx0Var = new lx0();
                        lx0Var.f92148k = "application/cea-608";
                        lx0Var.f92138a = zbVar2.f97446a + ":cea608";
                        mx0VarArrA = a(wf0Var, f90206z, new mx0(lx0Var));
                        break;
                    }
                    if ("urn:scte:dash:cc:cea-708:2015".equals(wf0Var.f96364a)) {
                        lx0 lx0Var2 = new lx0();
                        lx0Var2.f92148k = "application/cea-708";
                        lx0Var2.f92138a = zbVar2.f97446a + ":cea708";
                        mx0VarArrA = a(wf0Var, A, new mx0(lx0Var2));
                        break;
                    }
                }
                i22++;
            }
            mx0VarArr[i19] = mx0VarArrA;
            if (mx0VarArrA.length != 0) {
                i18++;
            }
        }
        int size3 = list2.size() + i18 + size2;
        h73[] h73VarArr = new h73[size3];
        g30[] g30VarArr = new g30[size3];
        int i25 = 0;
        int i26 = 0;
        while (i25 < size2) {
            int[] iArr4 = iArr[i25];
            ArrayList arrayList3 = new ArrayList();
            for (int i27 : iArr4) {
                arrayList3.addAll(((zb) list3.get(i27)).f97448c);
            }
            int size4 = arrayList3.size();
            mx0[] mx0VarArr2 = new mx0[size4];
            int i28 = 0;
            while (i28 < size4) {
                mx0 mx0Var = ((lo2) arrayList3.get(i28)).f92049a;
                int i29 = size2;
                int[][] iArr5 = iArr;
                int iA = sk0Var.a(mx0Var);
                lx0 lx0Var3 = new lx0(mx0Var);
                lx0Var3.D = iA;
                mx0VarArr2[i28] = new mx0(lx0Var3);
                i28++;
                size2 = i29;
                iArr = iArr5;
            }
            int i30 = size2;
            int[][] iArr6 = iArr;
            zb zbVar3 = (zb) list3.get(iArr4[0]);
            int i31 = zbVar3.f97446a;
            String string = i31 != -1 ? Integer.toString(i31) : mg2.a("unset:", i25);
            int i32 = i26 + 1;
            if (zArr[i25]) {
                i10 = i26 + 2;
            } else {
                i10 = i32;
                i32 = -1;
            }
            if (mx0VarArr[i25].length != 0) {
                i11 = i10 + 1;
            } else {
                i11 = i10;
                i10 = -1;
            }
            h73VarArr[i26] = new h73(string, mx0VarArr2);
            g30VarArr[i26] = new g30(zbVar3.f97447b, 0, iArr4, i26, i32, i10, -1);
            if (i32 != -1) {
                String str3 = string + ":emsg";
                lx0 lx0Var4 = new lx0();
                lx0Var4.f92138a = str3;
                lx0Var4.f92148k = "application/x-emsg";
                h73VarArr[i32] = new h73(str3, new mx0(lx0Var4));
                g30VarArr[i32] = new g30(5, 1, iArr4, i26, -1, -1, -1);
                i12 = -1;
            } else {
                i12 = -1;
            }
            if (i10 != i12) {
                h73VarArr[i10] = new h73(string + ":cc", mx0VarArr[i25]);
                g30VarArr[i10] = new g30(3, 1, iArr4, i26, -1, -1, -1);
            }
            i25++;
            list3 = list;
            i26 = i11;
            size2 = i30;
            iArr = iArr6;
        }
        int i33 = 0;
        while (i33 < list2.size()) {
            an0 an0Var = (an0) list2.get(i33);
            lx0 lx0Var5 = new lx0();
            lx0Var5.f92138a = an0Var.f87754c + "/" + an0Var.f87755d;
            lx0Var5.f92148k = "application/x-emsg";
            mx0 mx0Var2 = new mx0(lx0Var5);
            StringBuilder sb2 = new StringBuilder();
            sb2.append(an0Var.f87754c + "/" + an0Var.f87755d);
            sb2.append(StringUtils.PROCESS_POSTFIX_DELIMITER);
            sb2.append(i33);
            h73VarArr[i26] = new h73(sb2.toString(), mx0Var2);
            g30VarArr[i26] = new g30(5, 2, new int[0], -1, -1, -1, i33);
            i33++;
            i26++;
        }
        return Pair.create(new i73(h73VarArr), g30VarArr);
    }

    public static wf0 a(String str, List list) {
        for (int i10 = 0; i10 < list.size(); i10++) {
            wf0 wf0Var = (wf0) list.get(i10);
            if (str.equals(wf0Var.f96364a)) {
                return wf0Var;
            }
        }
        return null;
    }

    public static lu[] a() {
        return new lu[0];
    }

    public static mx0[] a(wf0 wf0Var, Pattern pattern, mx0 mx0Var) {
        String str = wf0Var.f96365b;
        if (str == null) {
            return new mx0[]{mx0Var};
        }
        int i10 = ib3.f90737a;
        String[] strArrSplit = str.split(";", -1);
        mx0[] mx0VarArr = new mx0[strArrSplit.length];
        for (int i11 = 0; i11 < strArrSplit.length; i11++) {
            Matcher matcher = pattern.matcher(strArrSplit[i11]);
            if (!matcher.matches()) {
                return new mx0[]{mx0Var};
            }
            int i12 = Integer.parseInt(matcher.group(1));
            lx0 lx0Var = new lx0(mx0Var);
            lx0Var.f92138a = mx0Var.f92599b + StringUtils.PROCESS_POSTFIX_DELIMITER + i12;
            lx0Var.C = i12;
            lx0Var.f92140c = matcher.group(2);
            mx0VarArr[i11] = new mx0(lx0Var);
        }
        return mx0VarArr;
    }

    /* JADX WARN: Removed duplicated region for block: B:19:0x0064  */
    @Override // yads.pm1
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final long a(long r17, yads.ww2 r19) {
        /*
            r16 = this;
            r1 = r17
            r7 = r16
            yads.lu[] r0 = r7.f90225t
            int r3 = r0.length
            r4 = 0
            r5 = r4
        L9:
            if (r5 >= r3) goto L77
            r6 = r0[r5]
            int r8 = r6.f92092b
            r9 = 2
            if (r8 != r9) goto L74
            yads.b30 r0 = r6.f92096f
            yads.nc0 r0 = (yads.nc0) r0
            yads.lc0[] r0 = r0.f92810h
            int r3 = r0.length
        L19:
            if (r4 >= r3) goto L72
            r5 = r0[r4]
            yads.i30 r6 = r5.f91927d
            if (r6 == 0) goto L6f
            long r3 = r5.f91928e
            long r3 = r6.a(r1, r3)
            long r8 = r5.f91929f
            long r3 = r3 + r8
            yads.i30 r0 = r5.f91927d
            long r8 = r3 - r8
            long r8 = r0.a(r8)
            yads.i30 r0 = r5.f91927d
            long r10 = r5.f91928e
            long r10 = r0.c(r10)
            int r0 = (r8 > r1 ? 1 : (r8 == r1 ? 0 : -1))
            if (r0 >= 0) goto L64
            r12 = -1
            int r0 = (r10 > r12 ? 1 : (r10 == r12 ? 0 : -1))
            if (r0 == 0) goto L56
            yads.i30 r0 = r5.f91927d
            long r14 = r0.b()
            long r12 = r5.f91929f
            long r14 = r14 + r12
            long r14 = r14 + r10
            r10 = 1
            long r14 = r14 - r10
            int r0 = (r3 > r14 ? 1 : (r3 == r14 ? 0 : -1))
            if (r0 >= 0) goto L64
            goto L58
        L56:
            r10 = 1
        L58:
            long r3 = r3 + r10
            yads.i30 r0 = r5.f91927d
            long r5 = r5.f91929f
            long r3 = r3 - r5
            long r3 = r0.a(r3)
            r5 = r3
            goto L65
        L64:
            r5 = r8
        L65:
            r0 = r19
            r1 = r17
            r3 = r8
            long r0 = r0.a(r1, r3, r5)
            goto L73
        L6f:
            int r4 = r4 + 1
            goto L19
        L72:
            r0 = r1
        L73:
            return r0
        L74:
            int r5 = r5 + 1
            goto L9
        L77:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: yads.h30.a(long, yads.ww2):long");
    }

    /* JADX WARN: Removed duplicated region for block: B:55:0x00b6  */
    /* JADX WARN: Removed duplicated region for block: B:58:0x00bd  */
    /* JADX WARN: Removed duplicated region for block: B:63:0x00cc  */
    @Override // yads.pm1
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final long a(yads.op0[] r41, boolean[] r42, yads.ns2[] r43, boolean[] r44, long r45) {
        /*
            Method dump skipped, instruction units count: 829
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: yads.h30.a(yads.op0[], boolean[], yads.ns2[], boolean[], long):long");
    }

    @Override // yads.pm1
    public final void a(om1 om1Var, long j10) {
        this.f90224s = om1Var;
        om1Var.a((pm1) this);
    }

    @Override // yads.qx2
    public final void a(rx2 rx2Var) {
        this.f90224s.a((rx2) this);
    }

    @Override // yads.rx2
    public final boolean continueLoading(long j10) {
        return this.f90227v.continueLoading(j10);
    }

    @Override // yads.pm1
    public final void discardBuffer(long j10, boolean z10) {
        long j11;
        for (lu luVar : this.f90225t) {
            if (!luVar.c()) {
                ms2 ms2Var = luVar.f92104n;
                int i10 = ms2Var.f92547q;
                ms2Var.a(j10, z10, true);
                ms2 ms2Var2 = luVar.f92104n;
                int i11 = ms2Var2.f92547q;
                if (i11 > i10) {
                    synchronized (ms2Var2) {
                        j11 = ms2Var2.f92546p == 0 ? Long.MIN_VALUE : ms2Var2.f92544n[ms2Var2.f92548r];
                    }
                    int i12 = 0;
                    while (true) {
                        ms2[] ms2VarArr = luVar.f92105o;
                        if (i12 >= ms2VarArr.length) {
                            break;
                        }
                        ms2VarArr[i12].a(j11, z10, luVar.f92095e[i12]);
                        i12++;
                    }
                }
                int iMin = Math.min(luVar.a(i11, 0), luVar.f92112v);
                if (iMin > 0) {
                    ArrayList arrayList = luVar.f92102l;
                    int i13 = ib3.f90737a;
                    if (iMin > arrayList.size() || iMin < 0) {
                        throw new IllegalArgumentException();
                    }
                    if (iMin != 0) {
                        arrayList.subList(0, iMin).clear();
                    }
                    luVar.f92112v -= iMin;
                } else {
                    continue;
                }
            }
        }
    }

    @Override // yads.rx2
    public final long getBufferedPositionUs() {
        return this.f90227v.getBufferedPositionUs();
    }

    @Override // yads.rx2
    public final long getNextLoadPositionUs() {
        return this.f90227v.getNextLoadPositionUs();
    }

    @Override // yads.pm1
    public final i73 getTrackGroups() {
        return this.f90216k;
    }

    @Override // yads.rx2
    public final boolean isLoading() {
        return this.f90227v.isLoading();
    }

    @Override // yads.pm1
    public final void maybeThrowPrepareError() {
        this.f90214i.a();
    }

    @Override // yads.pm1
    public final long readDiscontinuity() {
        return -9223372036854775807L;
    }

    @Override // yads.rx2
    public final void reevaluateBuffer(long j10) {
        this.f90227v.reevaluateBuffer(j10);
    }

    /* JADX WARN: Code restructure failed: missing block: B:21:0x004c, code lost:
    
        r12 = null;
     */
    /* JADX WARN: Code restructure failed: missing block: B:43:0x0083, code lost:
    
        if (r10.f92104n.b(r18, r18 < r10.getNextLoadPositionUs()) != false) goto L44;
     */
    @Override // yads.pm1
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final long seekToUs(long r18) {
        /*
            Method dump skipped, instruction units count: 281
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: yads.h30.seekToUs(long):long");
    }
}
