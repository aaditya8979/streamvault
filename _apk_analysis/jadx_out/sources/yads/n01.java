package yads;

/* JADX INFO: loaded from: classes4.dex */
public final class n01 implements ul0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final nx2 f92672a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public String f92673b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public m73 f92674c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public m01 f92675d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public boolean f92676e;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public long f92683l;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final boolean[] f92677f = new boolean[3];

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final zx1 f92678g = new zx1(32);

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final zx1 f92679h = new zx1(33);

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final zx1 f92680i = new zx1(34);

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final zx1 f92681j = new zx1(39);

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public final zx1 f92682k = new zx1(40);

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public long f92684m = -9223372036854775807L;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public final jb2 f92685n = new jb2();

    public n01(nx2 nx2Var) {
        this.f92672a = nx2Var;
    }

    @Override // yads.ul0
    public final void a() {
        this.f92683l = 0L;
        this.f92684m = -9223372036854775807L;
        dy1.a(this.f92677f);
        zx1 zx1Var = this.f92678g;
        zx1Var.f97823b = false;
        zx1Var.f97824c = false;
        zx1 zx1Var2 = this.f92679h;
        zx1Var2.f97823b = false;
        zx1Var2.f97824c = false;
        zx1 zx1Var3 = this.f92680i;
        zx1Var3.f97823b = false;
        zx1Var3.f97824c = false;
        zx1 zx1Var4 = this.f92681j;
        zx1Var4.f97823b = false;
        zx1Var4.f97824c = false;
        zx1 zx1Var5 = this.f92682k;
        zx1Var5.f97823b = false;
        zx1Var5.f97824c = false;
        m01 m01Var = this.f92675d;
        if (m01Var != null) {
            m01Var.f92192f = false;
            m01Var.f92193g = false;
            m01Var.f92194h = false;
            m01Var.f92195i = false;
            m01Var.f92196j = false;
        }
    }

    @Override // yads.ul0
    public final void a(int i10, long j10) {
        if (j10 != -9223372036854775807L) {
            this.f92684m = j10;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:173:0x0375  */
    /* JADX WARN: Removed duplicated region for block: B:176:0x0383  */
    /* JADX WARN: Removed duplicated region for block: B:179:0x03af  */
    /* JADX WARN: Removed duplicated region for block: B:180:0x03d4  */
    /* JADX WARN: Removed duplicated region for block: B:183:0x03ed  */
    /* JADX WARN: Removed duplicated region for block: B:203:0x042c  */
    /* JADX WARN: Removed duplicated region for block: B:209:0x0437  */
    /* JADX WARN: Removed duplicated region for block: B:216:0x0443  */
    /* JADX WARN: Removed duplicated region for block: B:219:0x044a  */
    /* JADX WARN: Removed duplicated region for block: B:229:0x0459 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:42:0x00c2  */
    /* JADX WARN: Type inference failed for: r1v16 */
    /* JADX WARN: Type inference failed for: r1v17, types: [boolean, int] */
    /* JADX WARN: Type inference failed for: r1v28 */
    /* JADX WARN: Type inference fix 'apply assigned field type' failed
    java.lang.UnsupportedOperationException: ArgType.getObject(), call class: class jadx.core.dex.instructions.args.ArgType$PrimitiveArg
    	at jadx.core.dex.instructions.args.ArgType.getObject(ArgType.java:593)
    	at jadx.core.dex.attributes.nodes.ClassTypeVarsAttr.getTypeVarsMapFor(ClassTypeVarsAttr.java:35)
    	at jadx.core.dex.nodes.utils.TypeUtils.replaceClassGenerics(TypeUtils.java:177)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.insertExplicitUseCast(FixTypesVisitor.java:397)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryFieldTypeWithNewCasts(FixTypesVisitor.java:359)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.applyFieldType(FixTypesVisitor.java:309)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.visit(FixTypesVisitor.java:94)
     */
    @Override // yads.ul0
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void a(yads.jb2 r42) {
        /*
            Method dump skipped, instruction units count: 1144
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: yads.n01.a(yads.jb2):void");
    }

    @Override // yads.ul0
    public final void a(pq0 pq0Var, l93 l93Var) {
        l93Var.a();
        l93Var.b();
        this.f92673b = l93Var.f91915e;
        l93Var.b();
        m73 m73VarA = pq0Var.a(l93Var.f91914d, 2);
        this.f92674c = m73VarA;
        this.f92675d = new m01(m73VarA);
        this.f92672a.a(pq0Var, l93Var);
    }

    public final void a(byte[] bArr, int i10, int i11) {
        m01 m01Var = this.f92675d;
        if (m01Var.f92192f) {
            int i12 = m01Var.f92190d;
            int i13 = (i10 + 2) - i12;
            if (i13 < i11) {
                m01Var.f92193g = (bArr[i13] & 128) != 0;
                m01Var.f92192f = false;
            } else {
                m01Var.f92190d = (i11 - i10) + i12;
            }
        }
        if (!this.f92676e) {
            this.f92678g.a(bArr, i10, i11);
            this.f92679h.a(bArr, i10, i11);
            this.f92680i.a(bArr, i10, i11);
        }
        this.f92681j.a(bArr, i10, i11);
        this.f92682k.a(bArr, i10, i11);
    }

    @Override // yads.ul0
    public final void b() {
    }
}
