package yads;

/* JADX INFO: loaded from: classes2.dex */
public final class i01 implements ul0 {

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public static final float[] f90602l = {1.0f, 1.0f, 1.0909091f, 0.90909094f, 1.4545455f, 1.2121212f, 1.0f};

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final gb3 f90603a;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public h01 f90608f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public long f90609g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public String f90610h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public m73 f90611i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public boolean f90612j;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final boolean[] f90605c = new boolean[4];

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final g01 f90606d = new g01();

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public long f90613k = -9223372036854775807L;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final zx1 f90607e = new zx1(178);

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final jb2 f90604b = new jb2();

    public i01(gb3 gb3Var) {
        this.f90603a = gb3Var;
    }

    @Override // yads.ul0
    public final void a() {
        dy1.a(this.f90605c);
        g01 g01Var = this.f90606d;
        g01Var.f89756a = false;
        g01Var.f89758c = 0;
        g01Var.f89757b = 0;
        h01 h01Var = this.f90608f;
        if (h01Var != null) {
            h01Var.f90179b = false;
            h01Var.f90180c = false;
            h01Var.f90181d = false;
            h01Var.f90182e = -1;
        }
        zx1 zx1Var = this.f90607e;
        if (zx1Var != null) {
            zx1Var.f97823b = false;
            zx1Var.f97824c = false;
        }
        this.f90609g = 0L;
        this.f90613k = -9223372036854775807L;
    }

    @Override // yads.ul0
    public final void a(int i10, long j10) {
        if (j10 != -9223372036854775807L) {
            this.f90613k = j10;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:129:0x0298  */
    /* JADX WARN: Removed duplicated region for block: B:63:0x0104  */
    /* JADX WARN: Removed duplicated region for block: B:68:0x013f  */
    /* JADX WARN: Removed duplicated region for block: B:71:0x0156  */
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
    public final void a(yads.jb2 r26) {
        /*
            Method dump skipped, instruction units count: 779
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: yads.i01.a(yads.jb2):void");
    }

    @Override // yads.ul0
    public final void a(pq0 pq0Var, l93 l93Var) {
        l93Var.a();
        l93Var.b();
        this.f90610h = l93Var.f91915e;
        l93Var.b();
        m73 m73VarA = pq0Var.a(l93Var.f91914d, 2);
        this.f90611i = m73VarA;
        this.f90608f = new h01(m73VarA);
        gb3 gb3Var = this.f90603a;
        if (gb3Var != null) {
            gb3Var.a(pq0Var, l93Var);
        }
    }

    @Override // yads.ul0
    public final void b() {
    }
}
