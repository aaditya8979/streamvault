package yads;

/* JADX INFO: loaded from: classes3.dex */
public final class f01 implements ul0 {

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public static final double[] f89420q = {23.976023976023978d, 24.0d, 25.0d, 29.97002997002997d, 30.0d, 50.0d, 59.94005994005994d, 60.0d};

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public String f89421a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public m73 f89422b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final gb3 f89423c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final jb2 f89424d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final zx1 f89425e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final boolean[] f89426f = new boolean[4];

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final e01 f89427g = new e01();

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public long f89428h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public boolean f89429i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public boolean f89430j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public long f89431k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public long f89432l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public long f89433m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public long f89434n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public boolean f89435o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public boolean f89436p;

    public f01(gb3 gb3Var) {
        this.f89423c = gb3Var;
        if (gb3Var != null) {
            this.f89425e = new zx1(178);
            this.f89424d = new jb2();
        } else {
            this.f89425e = null;
            this.f89424d = null;
        }
        this.f89432l = -9223372036854775807L;
        this.f89434n = -9223372036854775807L;
    }

    @Override // yads.ul0
    public final void a() {
        dy1.a(this.f89426f);
        e01 e01Var = this.f89427g;
        e01Var.f89051a = false;
        e01Var.f89052b = 0;
        e01Var.f89053c = 0;
        zx1 zx1Var = this.f89425e;
        if (zx1Var != null) {
            zx1Var.f97823b = false;
            zx1Var.f97824c = false;
        }
        this.f89428h = 0L;
        this.f89429i = false;
        this.f89432l = -9223372036854775807L;
        this.f89434n = -9223372036854775807L;
    }

    @Override // yads.ul0
    public final void a(int i10, long j10) {
        this.f89432l = j10;
    }

    /* JADX WARN: Removed duplicated region for block: B:40:0x00dc  */
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
    public final void a(yads.jb2 r22) {
        /*
            Method dump skipped, instruction units count: 540
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: yads.f01.a(yads.jb2):void");
    }

    @Override // yads.ul0
    public final void a(pq0 pq0Var, l93 l93Var) {
        l93Var.a();
        l93Var.b();
        this.f89421a = l93Var.f91915e;
        l93Var.b();
        this.f89422b = pq0Var.a(l93Var.f91914d, 2);
        gb3 gb3Var = this.f89423c;
        if (gb3Var != null) {
            gb3Var.a(pq0Var, l93Var);
        }
    }

    @Override // yads.ul0
    public final void b() {
    }
}
