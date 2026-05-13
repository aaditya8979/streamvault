package yads;

/* JADX INFO: loaded from: classes11.dex */
public final class l01 implements ul0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final nx2 f91817a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final boolean f91818b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final boolean f91819c;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public long f91823g;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public String f91825i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public m73 f91826j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public k01 f91827k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public boolean f91828l;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public boolean f91830n;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final boolean[] f91824h = new boolean[3];

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final zx1 f91820d = new zx1(7);

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final zx1 f91821e = new zx1(8);

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final zx1 f91822f = new zx1(6);

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public long f91829m = -9223372036854775807L;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public final jb2 f91831o = new jb2();

    public l01(nx2 nx2Var, boolean z10, boolean z11) {
        this.f91817a = nx2Var;
        this.f91818b = z10;
        this.f91819c = z11;
    }

    @Override // yads.ul0
    public final void a() {
        this.f91823g = 0L;
        this.f91830n = false;
        this.f91829m = -9223372036854775807L;
        dy1.a(this.f91824h);
        zx1 zx1Var = this.f91820d;
        zx1Var.f97823b = false;
        zx1Var.f97824c = false;
        zx1 zx1Var2 = this.f91821e;
        zx1Var2.f97823b = false;
        zx1Var2.f97824c = false;
        zx1 zx1Var3 = this.f91822f;
        zx1Var3.f97823b = false;
        zx1Var3.f97824c = false;
        k01 k01Var = this.f91827k;
        if (k01Var != null) {
            k01Var.a();
        }
    }

    @Override // yads.ul0
    public final void a(int i10, long j10) {
        if (j10 != -9223372036854775807L) {
            this.f91829m = j10;
        }
        this.f91830n = ((i10 & 2) != 0) | this.f91830n;
    }

    /* JADX WARN: Removed duplicated region for block: B:104:0x0279  */
    /* JADX WARN: Removed duplicated region for block: B:150:0x0319  */
    /* JADX WARN: Removed duplicated region for block: B:31:0x0083  */
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
    public final void a(yads.jb2 r28) {
        /*
            Method dump skipped, instruction units count: 825
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: yads.l01.a(yads.jb2):void");
    }

    @Override // yads.ul0
    public final void a(pq0 pq0Var, l93 l93Var) {
        l93Var.a();
        l93Var.b();
        this.f91825i = l93Var.f91915e;
        l93Var.b();
        m73 m73VarA = pq0Var.a(l93Var.f91914d, 2);
        this.f91826j = m73VarA;
        this.f91827k = new k01(m73VarA, this.f91818b, this.f91819c);
        this.f91817a.a(pq0Var, l93Var);
    }

    @Override // yads.ul0
    public final void b() {
    }
}
