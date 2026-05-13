package yads;

import android.util.Pair;
import android.util.SparseArray;
import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.UUID;
import yads.e73;
import yads.mq0;
import yads.sx0;

/* JADX INFO: loaded from: classes10.dex */
public final class sx0 implements mq0 {
    public static final byte[] G;
    public static final mx0 H;
    public int A;
    public boolean B;
    public pq0 C;
    public m73[] D;
    public m73[] E;
    public boolean F;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int f94980a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final List f94981b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final SparseArray f94982c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final jb2 f94983d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final jb2 f94984e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final jb2 f94985f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final byte[] f94986g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final jb2 f94987h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final ym0 f94988i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final jb2 f94989j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public final ArrayDeque f94990k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public final ArrayDeque f94991l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public final m73 f94992m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public int f94993n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public int f94994o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public long f94995p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public int f94996q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public jb2 f94997r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public long f94998s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public int f94999t;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    public long f95000u;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public long f95001v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public long f95002w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public rx0 f95003x;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public int f95004y;

    /* JADX INFO: renamed from: z, reason: collision with root package name */
    public int f95005z;

    static {
        new rq0() { // from class: bt.aa
            @Override // yads.rq0
            public final mq0[] createExtractors() {
                return sx0.a();
            }
        };
        G = new byte[]{-94, 57, 79, 82, 90, -101, 79, 20, -94, 68, 108, 66, 124, 100, -115, -12};
        lx0 lx0Var = new lx0();
        lx0Var.f92148k = "application/x-emsg";
        H = new mx0(lx0Var);
    }

    public sx0() {
        this(0);
    }

    public sx0(int i10) {
        this(Collections.emptyList());
    }

    public sx0(int i10, List list, m73 m73Var) {
        this.f94980a = i10;
        this.f94981b = Collections.unmodifiableList(list);
        this.f94992m = m73Var;
        this.f94988i = new ym0();
        this.f94989j = new jb2(16);
        this.f94983d = new jb2(dy1.f89024a);
        this.f94984e = new jb2(5);
        this.f94985f = new jb2();
        byte[] bArr = new byte[16];
        this.f94986g = bArr;
        this.f94987h = new jb2(bArr);
        this.f94990k = new ArrayDeque();
        this.f94991l = new ArrayDeque();
        this.f94982c = new SparseArray();
        this.f95001v = -9223372036854775807L;
        this.f95000u = -9223372036854775807L;
        this.f95002w = -9223372036854775807L;
        this.C = pq0.f93718a;
        this.D = new m73[0];
        this.E = new m73[0];
    }

    public sx0(List list) {
        this(0, list, null);
    }

    public static kk0 a(ArrayList arrayList) {
        int size = arrayList.size();
        ArrayList arrayList2 = null;
        for (int i10 = 0; i10 < size; i10++) {
            wj wjVar = (wj) arrayList.get(i10);
            if (wjVar.f96784a == 1886614376) {
                if (arrayList2 == null) {
                    arrayList2 = new ArrayList();
                }
                byte[] bArr = wjVar.f96399b.f91147a;
                dl2 dl2VarA = el2.a(bArr);
                UUID uuid = dl2VarA == null ? null : dl2VarA.f88902a;
                if (uuid == null) {
                    ih1.d("FragmentedMp4Extractor", "Skipped pssh atom (failed to extract uuid)");
                } else {
                    arrayList2.add(new jk0(uuid, null, "video/mp4", bArr));
                }
            }
        }
        if (arrayList2 == null) {
            return null;
        }
        return new kk0(null, false, (jk0[]) arrayList2.toArray(new jk0[0]));
    }

    public static void a(jb2 jb2Var, int i10, g73 g73Var) throws ob2 {
        jb2Var.e(i10 + 8);
        int iB = jb2Var.b();
        if ((iB & 1) != 0) {
            throw ob2.b("Overriding TrackEncryptionBox parameters is unsupported.");
        }
        boolean z10 = (iB & 2) != 0;
        int iP = jb2Var.p();
        if (iP == 0) {
            Arrays.fill(g73Var.f89859l, 0, g73Var.f89852e, false);
            return;
        }
        if (iP != g73Var.f89852e) {
            throw new ob2("Senc sample count " + iP + " is different from fragment sample count" + g73Var.f89852e, null, true, 1);
        }
        Arrays.fill(g73Var.f89859l, 0, iP, z10);
        g73Var.f89861n.c(jb2Var.f91149c - jb2Var.f91148b);
        g73Var.f89858k = true;
        g73Var.f89862o = true;
        jb2 jb2Var2 = g73Var.f89861n;
        jb2Var.a(jb2Var2.f91147a, 0, jb2Var2.f91149c);
        g73Var.f89861n.e(0);
        g73Var.f89862o = false;
    }

    public static mq0[] a() {
        return new mq0[]{new sx0(0)};
    }

    /* JADX WARN: Code restructure failed: missing block: B:100:0x0205, code lost:
    
        r9 = true;
     */
    /* JADX WARN: Code restructure failed: missing block: B:101:0x0207, code lost:
    
        r9 = false;
     */
    /* JADX WARN: Code restructure failed: missing block: B:102:0x0208, code lost:
    
        r34.B = r9;
        r34.f95005z += 5;
        r34.f95004y += r3;
     */
    /* JADX WARN: Code restructure failed: missing block: B:104:0x021d, code lost:
    
        throw new yads.ob2("Invalid NAL length", r6, true, 1);
     */
    /* JADX WARN: Code restructure failed: missing block: B:106:0x0220, code lost:
    
        if (r34.B == false) goto L108;
     */
    /* JADX WARN: Code restructure failed: missing block: B:107:0x0222, code lost:
    
        r34.f94985f.c(r14);
        ((yads.ld0) r35).a(r34.f94985f.f91147a, 0, r34.A, false);
        r7.a(r34.A, r34.f94985f);
        r4 = r34.A;
        r6 = r34.f94985f;
        r6 = yads.dy1.a(r6.f91149c, r6.f91147a);
        r34.f94985f.e("video/hevc".equals(r5.f89145f.f92610m) ? 1 : 0);
        r34.f94985f.d(r6);
        yads.rt.a(r10, r34.f94985f, r34.E);
     */
    /* JADX WARN: Code restructure failed: missing block: B:108:0x0261, code lost:
    
        r4 = r7.a(r35, r14, false);
     */
    /* JADX WARN: Code restructure failed: missing block: B:109:0x0267, code lost:
    
        r34.f95005z += r4;
        r34.A -= r4;
        r4 = 6;
        r6 = null;
     */
    /* JADX WARN: Code restructure failed: missing block: B:110:0x0273, code lost:
    
        r9 = 0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:111:0x0276, code lost:
    
        r3 = r34.f95005z;
        r4 = r34.f95004y;
     */
    /* JADX WARN: Code restructure failed: missing block: B:112:0x027a, code lost:
    
        if (r3 >= r4) goto L431;
     */
    /* JADX WARN: Code restructure failed: missing block: B:113:0x027c, code lost:
    
        r34.f95005z += r7.a(r35, r4 - r3, false);
     */
    /* JADX WARN: Code restructure failed: missing block: B:115:0x028a, code lost:
    
        if (r2.f94642l != false) goto L117;
     */
    /* JADX WARN: Code restructure failed: missing block: B:116:0x028c, code lost:
    
        r1 = r2.f94634d.f92770g[r2.f94636f];
     */
    /* JADX WARN: Code restructure failed: missing block: B:118:0x029d, code lost:
    
        if (r2.f94632b.f89857j[r2.f94636f] == false) goto L120;
     */
    /* JADX WARN: Code restructure failed: missing block: B:119:0x029f, code lost:
    
        r1 = 1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:120:0x02a1, code lost:
    
        r1 = 0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:122:0x02a6, code lost:
    
        if (r2.a() == null) goto L124;
     */
    /* JADX WARN: Code restructure failed: missing block: B:123:0x02a8, code lost:
    
        r1 = r1 | 1073741824;
     */
    /* JADX WARN: Code restructure failed: missing block: B:124:0x02ab, code lost:
    
        r22 = r1;
        r1 = r2.a();
     */
    /* JADX WARN: Code restructure failed: missing block: B:125:0x02b1, code lost:
    
        if (r1 == null) goto L127;
     */
    /* JADX WARN: Code restructure failed: missing block: B:126:0x02b3, code lost:
    
        r25 = r1.f89503c;
     */
    /* JADX WARN: Code restructure failed: missing block: B:127:0x02b8, code lost:
    
        r25 = null;
     */
    /* JADX WARN: Code restructure failed: missing block: B:128:0x02ba, code lost:
    
        r7.a(r10, r22, r34.f95004y, 0, r25);
     */
    /* JADX WARN: Code restructure failed: missing block: B:130:0x02cd, code lost:
    
        if (r34.f94991l.isEmpty() != false) goto L427;
     */
    /* JADX WARN: Code restructure failed: missing block: B:131:0x02cf, code lost:
    
        r1 = (yads.qx0) r34.f94991l.removeFirst();
        r34.f94999t -= r1.f94202c;
        r3 = r1.f94200a;
     */
    /* JADX WARN: Code restructure failed: missing block: B:132:0x02e2, code lost:
    
        if (r1.f94201b == false) goto L134;
     */
    /* JADX WARN: Code restructure failed: missing block: B:133:0x02e4, code lost:
    
        r3 = r3 + r10;
     */
    /* JADX WARN: Code restructure failed: missing block: B:134:0x02e5, code lost:
    
        r5 = r34.D;
        r6 = r5.length;
        r7 = 0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:135:0x02e9, code lost:
    
        if (r7 >= r6) goto L430;
     */
    /* JADX WARN: Code restructure failed: missing block: B:136:0x02eb, code lost:
    
        r5[r7].a(r3, 1, r1.f94202c, r34.f94999t, null);
        r7 = r7 + 1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:137:0x0301, code lost:
    
        r2.f94636f++;
     */
    /* JADX WARN: Code restructure failed: missing block: B:138:0x0308, code lost:
    
        if (r2.f94642l != false) goto L141;
     */
    /* JADX WARN: Code restructure failed: missing block: B:139:0x030a, code lost:
    
        r1 = 0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:141:0x030d, code lost:
    
        r1 = r2.f94637g + 1;
        r2.f94637g = r1;
        r3 = r2.f94632b.f89854g;
        r4 = r2.f94638h;
     */
    /* JADX WARN: Code restructure failed: missing block: B:142:0x031a, code lost:
    
        if (r1 != r3[r4]) goto L145;
     */
    /* JADX WARN: Code restructure failed: missing block: B:143:0x031c, code lost:
    
        r2.f94638h = r4 + 1;
        r1 = 0;
        r2.f94637g = 0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:144:0x0323, code lost:
    
        r34.f95003x = null;
     */
    /* JADX WARN: Code restructure failed: missing block: B:145:0x0326, code lost:
    
        r1 = 0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:146:0x0327, code lost:
    
        r34.f94993n = 3;
     */
    /* JADX WARN: Code restructure failed: missing block: B:147:0x032a, code lost:
    
        return r1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:42:0x00af, code lost:
    
        r4 = 6;
     */
    /* JADX WARN: Code restructure failed: missing block: B:432:?, code lost:
    
        return 0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:43:0x00b3, code lost:
    
        if (r34.f94993n != 3) goto L77;
     */
    /* JADX WARN: Code restructure failed: missing block: B:45:0x00b7, code lost:
    
        if (r2.f94642l != false) goto L47;
     */
    /* JADX WARN: Code restructure failed: missing block: B:46:0x00b9, code lost:
    
        r3 = r2.f94634d.f92767d[r2.f94636f];
     */
    /* JADX WARN: Code restructure failed: missing block: B:47:0x00c2, code lost:
    
        r3 = r2.f94632b.f89855h[r2.f94636f];
     */
    /* JADX WARN: Code restructure failed: missing block: B:48:0x00ca, code lost:
    
        r34.f95004y = r3;
     */
    /* JADX WARN: Code restructure failed: missing block: B:49:0x00d0, code lost:
    
        if (r2.f94636f >= r2.f94639i) goto L69;
     */
    /* JADX WARN: Code restructure failed: missing block: B:50:0x00d2, code lost:
    
        ((yads.ld0) r35).a(r3);
        r1 = r2.a();
     */
    /* JADX WARN: Code restructure failed: missing block: B:51:0x00db, code lost:
    
        if (r1 != null) goto L53;
     */
    /* JADX WARN: Code restructure failed: missing block: B:53:0x00de, code lost:
    
        r3 = r2.f94632b.f89861n;
        r1 = r1.f89504d;
     */
    /* JADX WARN: Code restructure failed: missing block: B:54:0x00e4, code lost:
    
        if (r1 == 0) goto L56;
     */
    /* JADX WARN: Code restructure failed: missing block: B:55:0x00e6, code lost:
    
        r3.e(r3.f91148b + r1);
     */
    /* JADX WARN: Code restructure failed: missing block: B:56:0x00ec, code lost:
    
        r1 = r2.f94632b;
        r5 = r2.f94636f;
     */
    /* JADX WARN: Code restructure failed: missing block: B:57:0x00f2, code lost:
    
        if (r1.f89858k == false) goto L61;
     */
    /* JADX WARN: Code restructure failed: missing block: B:59:0x00f8, code lost:
    
        if (r1.f89859l[r5] == false) goto L61;
     */
    /* JADX WARN: Code restructure failed: missing block: B:60:0x00fa, code lost:
    
        r3.e(r3.f91148b + (r3.r() * 6));
     */
    /* JADX WARN: Code restructure failed: missing block: B:61:0x0105, code lost:
    
        r2.f94636f++;
     */
    /* JADX WARN: Code restructure failed: missing block: B:62:0x010c, code lost:
    
        if (r2.f94642l != false) goto L64;
     */
    /* JADX WARN: Code restructure failed: missing block: B:64:0x010f, code lost:
    
        r1 = r2.f94637g + 1;
        r2.f94637g = r1;
        r3 = r2.f94632b.f89854g;
        r4 = r2.f94638h;
     */
    /* JADX WARN: Code restructure failed: missing block: B:65:0x011c, code lost:
    
        if (r1 != r3[r4]) goto L68;
     */
    /* JADX WARN: Code restructure failed: missing block: B:66:0x011e, code lost:
    
        r2.f94638h = r4 + 1;
        r2.f94637g = 0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:67:0x0123, code lost:
    
        r34.f95003x = null;
     */
    /* JADX WARN: Code restructure failed: missing block: B:68:0x0125, code lost:
    
        r34.f94993n = 3;
     */
    /* JADX WARN: Code restructure failed: missing block: B:70:0x0131, code lost:
    
        if (r2.f94634d.f92764a.f89146g != 1) goto L72;
     */
    /* JADX WARN: Code restructure failed: missing block: B:71:0x0133, code lost:
    
        r34.f95004y = r3 - 8;
        ((yads.ld0) r35).a(8);
     */
    /* JADX WARN: Code restructure failed: missing block: B:73:0x014c, code lost:
    
        if ("audio/ac4".equals(r2.f94634d.f92764a.f89145f.f92610m) == false) goto L75;
     */
    /* JADX WARN: Code restructure failed: missing block: B:74:0x014e, code lost:
    
        r34.f95005z = r2.a(r34.f95004y, 7);
        yads.l0.a(r34.f95004y, r34.f94987h);
        r2.f94631a.a(7, r34.f94987h);
        r34.f95005z += 7;
     */
    /* JADX WARN: Code restructure failed: missing block: B:75:0x016b, code lost:
    
        r34.f95005z = r2.a(r34.f95004y, 0);
     */
    /* JADX WARN: Code restructure failed: missing block: B:76:0x0173, code lost:
    
        r34.f95004y += r34.f95005z;
        r34.f94993n = 4;
        r34.A = 0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:77:0x017f, code lost:
    
        r3 = r2.f94634d;
        r5 = r3.f92764a;
        r7 = r2.f94631a;
     */
    /* JADX WARN: Code restructure failed: missing block: B:78:0x0187, code lost:
    
        if (r2.f94642l != false) goto L80;
     */
    /* JADX WARN: Code restructure failed: missing block: B:79:0x0189, code lost:
    
        r10 = r3.f92769f[r2.f94636f];
     */
    /* JADX WARN: Code restructure failed: missing block: B:80:0x0190, code lost:
    
        r10 = r2.f94632b.f89856i[r2.f94636f];
     */
    /* JADX WARN: Code restructure failed: missing block: B:81:0x0198, code lost:
    
        r3 = r5.f89149j;
     */
    /* JADX WARN: Code restructure failed: missing block: B:82:0x019a, code lost:
    
        if (r3 == 0) goto L111;
     */
    /* JADX WARN: Code restructure failed: missing block: B:83:0x019c, code lost:
    
        r12 = r34.f94984e.f91147a;
        r12[0] = 0;
        r12[1] = 0;
        r12[2] = 0;
        r13 = r3 + 1;
        r3 = 4 - r3;
     */
    /* JADX WARN: Code restructure failed: missing block: B:85:0x01b0, code lost:
    
        if (r34.f95005z >= r34.f95004y) goto L423;
     */
    /* JADX WARN: Code restructure failed: missing block: B:86:0x01b2, code lost:
    
        r14 = r34.A;
     */
    /* JADX WARN: Code restructure failed: missing block: B:87:0x01b6, code lost:
    
        if (r14 != 0) goto L105;
     */
    /* JADX WARN: Code restructure failed: missing block: B:88:0x01b8, code lost:
    
        ((yads.ld0) r35).a(r12, r3, r13, r9);
        r34.f94984e.e(r9);
        r14 = r34.f94984e.b();
     */
    /* JADX WARN: Code restructure failed: missing block: B:89:0x01c9, code lost:
    
        if (r14 < 1) goto L424;
     */
    /* JADX WARN: Code restructure failed: missing block: B:90:0x01cb, code lost:
    
        r34.A = r14 - 1;
        r34.f94983d.e(r9);
        r7.a(4, r34.f94983d);
        r7.a(1, r34.f94984e);
     */
    /* JADX WARN: Code restructure failed: missing block: B:91:0x01e2, code lost:
    
        if (r34.E.length <= 0) goto L101;
     */
    /* JADX WARN: Code restructure failed: missing block: B:92:0x01e4, code lost:
    
        r14 = r5.f89145f.f92610m;
        r17 = r12[4];
        r9 = yads.dy1.f89024a;
     */
    /* JADX WARN: Code restructure failed: missing block: B:93:0x01f2, code lost:
    
        if ("video/avc".equals(r14) == false) goto L96;
     */
    /* JADX WARN: Code restructure failed: missing block: B:95:0x01f6, code lost:
    
        if ((r17 & 31) == r4) goto L100;
     */
    /* JADX WARN: Code restructure failed: missing block: B:97:0x01fc, code lost:
    
        if ("video/hevc".equals(r14) == false) goto L101;
     */
    /* JADX WARN: Code restructure failed: missing block: B:99:0x0203, code lost:
    
        if (((r17 & 126) >> 1) != 39) goto L101;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r9v0 */
    /* JADX WARN: Type inference failed for: r9v11 */
    /* JADX WARN: Type inference failed for: r9v2, types: [boolean, int] */
    /* JADX WARN: Type inference fix 'apply assigned field type' failed
    java.lang.UnsupportedOperationException: ArgType.getObject(), call class: class jadx.core.dex.instructions.args.ArgType$UnknownArg
    	at jadx.core.dex.instructions.args.ArgType.getObject(ArgType.java:593)
    	at jadx.core.dex.attributes.nodes.ClassTypeVarsAttr.getTypeVarsMapFor(ClassTypeVarsAttr.java:35)
    	at jadx.core.dex.nodes.utils.TypeUtils.replaceClassGenerics(TypeUtils.java:177)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.insertExplicitUseCast(FixTypesVisitor.java:397)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryFieldTypeWithNewCasts(FixTypesVisitor.java:359)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.applyFieldType(FixTypesVisitor.java:309)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.visit(FixTypesVisitor.java:94)
     */
    @Override // yads.mq0
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final int a(yads.nq0 r35, yads.gg2 r36) throws yads.ob2, java.io.EOFException, java.io.InterruptedIOException {
        /*
            Method dump skipped, instruction units count: 1975
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: yads.sx0.a(yads.nq0, yads.gg2):int");
    }

    public final e73 a(e73 e73Var) {
        return e73Var;
    }

    /* JADX WARN: Removed duplicated region for block: B:179:0x03bd  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void a(long r49) throws yads.ob2 {
        /*
            Method dump skipped, instruction units count: 1594
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: yads.sx0.a(long):void");
    }

    @Override // yads.mq0
    public final void a(pq0 pq0Var) {
        int i10;
        this.C = pq0Var;
        int i11 = 0;
        this.f94993n = 0;
        this.f94996q = 0;
        m73[] m73VarArr = new m73[2];
        this.D = m73VarArr;
        m73 m73Var = this.f94992m;
        if (m73Var != null) {
            m73VarArr[0] = m73Var;
            i10 = 1;
        } else {
            i10 = 0;
        }
        int i12 = 100;
        if ((this.f94980a & 4) != 0) {
            m73VarArr[i10] = pq0Var.a(100, 5);
            i10++;
            i12 = 101;
        }
        m73[] m73VarArr2 = (m73[]) ib3.a(i10, this.D);
        this.D = m73VarArr2;
        for (m73 m73Var2 : m73VarArr2) {
            m73Var2.a(H);
        }
        this.E = new m73[this.f94981b.size()];
        while (i11 < this.E.length) {
            m73 m73VarA = this.C.a(i12, 3);
            m73VarA.a((mx0) this.f94981b.get(i11));
            this.E[i11] = m73VarA;
            i11++;
            i12++;
        }
    }

    public final void a(vj vjVar) {
        re0 re0Var;
        re0 re0Var2;
        kk0 kk0VarA = a(vjVar.f96119c);
        vj vjVarB = vjVar.b(1836475768);
        vjVarB.getClass();
        SparseArray sparseArray = new SparseArray();
        int size = vjVarB.f96119c.size();
        long jN = -9223372036854775807L;
        for (int i10 = 0; i10 < size; i10++) {
            wj wjVar = (wj) vjVarB.f96119c.get(i10);
            int i11 = wjVar.f96784a;
            if (i11 == 1953654136) {
                jb2 jb2Var = wjVar.f96399b;
                jb2Var.e(12);
                Pair pairCreate = Pair.create(Integer.valueOf(jb2Var.b()), new re0(jb2Var.b() - 1, jb2Var.b(), jb2Var.b(), jb2Var.b()));
                sparseArray.put(((Integer) pairCreate.first).intValue(), (re0) pairCreate.second);
            } else if (i11 == 1835362404) {
                jb2 jb2Var2 = wjVar.f96399b;
                jb2Var2.e(8);
                jN = ((jb2Var2.b() >> 24) & 255) == 0 ? jb2Var2.n() : jb2Var2.q();
            }
        }
        ArrayList arrayListA = ek.a(vjVar, new zy0(), jN, kk0VarA, (this.f94980a & 16) != 0, false, new wy0() { // from class: bt.z9
            @Override // yads.wy0
            public final Object apply(Object obj) {
                return this.f6447a.a((e73) obj);
            }
        });
        int size2 = arrayListA.size();
        if (this.f94982c.size() == 0) {
            for (int i12 = 0; i12 < size2; i12++) {
                n73 n73Var = (n73) arrayListA.get(i12);
                e73 e73Var = n73Var.f92764a;
                m73 m73VarA = this.C.a(i12, e73Var.f89141b);
                int i13 = e73Var.f89140a;
                if (sparseArray.size() == 1) {
                    re0Var2 = (re0) sparseArray.valueAt(0);
                } else {
                    re0Var2 = (re0) sparseArray.get(i13);
                    re0Var2.getClass();
                }
                this.f94982c.put(e73Var.f89140a, new rx0(m73VarA, n73Var, re0Var2));
                this.f95001v = Math.max(this.f95001v, e73Var.f89144e);
            }
            this.C.a();
            return;
        }
        if (this.f94982c.size() != size2) {
            throw new IllegalStateException();
        }
        for (int i14 = 0; i14 < size2; i14++) {
            n73 n73Var2 = (n73) arrayListA.get(i14);
            e73 e73Var2 = n73Var2.f92764a;
            rx0 rx0Var = (rx0) this.f94982c.get(e73Var2.f89140a);
            int i15 = e73Var2.f89140a;
            if (sparseArray.size() == 1) {
                re0Var = (re0) sparseArray.valueAt(0);
            } else {
                re0Var = (re0) sparseArray.get(i15);
                re0Var.getClass();
            }
            rx0Var.a(n73Var2, re0Var);
        }
    }

    @Override // yads.mq0
    public final boolean a(nq0 nq0Var) {
        return s13.a(nq0Var, true, false);
    }

    @Override // yads.mq0
    public final void release() {
    }

    @Override // yads.mq0
    public final void seek(long j10, long j11) {
        int size = this.f94982c.size();
        for (int i10 = 0; i10 < size; i10++) {
            ((rx0) this.f94982c.valueAt(i10)).b();
        }
        this.f94991l.clear();
        this.f94999t = 0;
        this.f95000u = j11;
        this.f94990k.clear();
        this.f94993n = 0;
        this.f94996q = 0;
    }
}
