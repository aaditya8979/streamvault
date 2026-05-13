package yads;

import java.util.Arrays;

/* JADX INFO: loaded from: classes12.dex */
public final class qc implements ul0 {

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public static final byte[] f93982v = {73, 68, 51};

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final boolean f93983a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final ib2 f93984b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final jb2 f93985c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final String f93986d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public String f93987e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public m73 f93988f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public m73 f93989g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public int f93990h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public int f93991i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public int f93992j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public boolean f93993k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public boolean f93994l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public int f93995m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public int f93996n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public int f93997o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public boolean f93998p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public long f93999q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public int f94000r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public long f94001s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public m73 f94002t;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    public long f94003u;

    public qc() {
        this(null, true);
    }

    public qc(String str, boolean z10) {
        this.f93984b = new ib2(new byte[7]);
        this.f93985c = new jb2(Arrays.copyOf(f93982v, 10));
        c();
        this.f93995m = -1;
        this.f93996n = -1;
        this.f93999q = -9223372036854775807L;
        this.f94001s = -9223372036854775807L;
        this.f93983a = z10;
        this.f93986d = str;
    }

    @Override // yads.ul0
    public final void a() {
        this.f94001s = -9223372036854775807L;
        this.f93994l = false;
        c();
    }

    @Override // yads.ul0
    public final void a(int i10, long j10) {
        if (j10 != -9223372036854775807L) {
            this.f94001s = j10;
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:107:0x028b, code lost:
    
        r18.f93997o = (r14 & 8) >> 3;
     */
    /* JADX WARN: Code restructure failed: missing block: B:108:0x0293, code lost:
    
        if ((r14 & 1) != 0) goto L110;
     */
    /* JADX WARN: Code restructure failed: missing block: B:109:0x0295, code lost:
    
        r2 = true;
     */
    /* JADX WARN: Code restructure failed: missing block: B:110:0x0297, code lost:
    
        r2 = false;
     */
    /* JADX WARN: Code restructure failed: missing block: B:111:0x0298, code lost:
    
        r18.f93993k = r2;
     */
    /* JADX WARN: Code restructure failed: missing block: B:112:0x029c, code lost:
    
        if (r18.f93994l != false) goto L114;
     */
    /* JADX WARN: Code restructure failed: missing block: B:113:0x029e, code lost:
    
        r18.f93990h = 1;
        r18.f93991i = 0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:114:0x02a3, code lost:
    
        r18.f93990h = 3;
        r18.f93991i = 0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:115:0x02a8, code lost:
    
        r19.e(r5);
     */
    /* JADX WARN: Removed duplicated region for block: B:116:0x02ad  */
    /* JADX WARN: Removed duplicated region for block: B:119:0x02b6  */
    /* JADX WARN: Removed duplicated region for block: B:156:0x028b A[EDGE_INSN: B:156:0x028b->B:107:0x028b BREAK  A[LOOP:1: B:51:0x01b1->B:182:0x01b1], SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:177:0x02f4 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:77:0x0231  */
    @Override // yads.ul0
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void a(yads.jb2 r19) throws yads.ob2 {
        /*
            Method dump skipped, instruction units count: 778
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: yads.qc.a(yads.jb2):void");
    }

    @Override // yads.ul0
    public final void a(pq0 pq0Var, l93 l93Var) {
        l93Var.a();
        l93Var.b();
        this.f93987e = l93Var.f91915e;
        l93Var.b();
        m73 m73VarA = pq0Var.a(l93Var.f91914d, 1);
        this.f93988f = m73VarA;
        this.f94002t = m73VarA;
        if (!this.f93983a) {
            this.f93989g = new al0();
            return;
        }
        l93Var.a();
        l93Var.b();
        m73 m73VarA2 = pq0Var.a(l93Var.f91914d, 5);
        this.f93989g = m73VarA2;
        lx0 lx0Var = new lx0();
        l93Var.b();
        lx0Var.f92138a = l93Var.f91915e;
        lx0Var.f92148k = "application/id3";
        m73VarA2.a(new mx0(lx0Var));
    }

    @Override // yads.ul0
    public final void b() {
    }

    public final void c() {
        this.f93990h = 0;
        this.f93991i = 0;
        this.f93992j = 256;
    }
}
