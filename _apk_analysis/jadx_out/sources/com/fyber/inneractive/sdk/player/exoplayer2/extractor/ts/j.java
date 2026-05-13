package com.fyber.inneractive.sdk.player.exoplayer2.extractor.ts;

/* JADX INFO: loaded from: classes10.dex */
public final class j implements h {

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public static final double[] f18136n = {23.976023976023978d, 24.0d, 25.0d, 29.97002997002997d, 30.0d, 50.0d, 59.94005994005994d, 60.0d};

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public String f18137a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public com.fyber.inneractive.sdk.player.exoplayer2.extractor.r f18138b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public boolean f18139c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public long f18140d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final boolean[] f18141e = new boolean[4];

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final i f18142f = new i();

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public boolean f18143g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public long f18144h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public long f18145i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public boolean f18146j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public boolean f18147k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public long f18148l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public long f18149m;

    @Override // com.fyber.inneractive.sdk.player.exoplayer2.extractor.ts.h
    public final void a() {
        com.fyber.inneractive.sdk.player.exoplayer2.util.l.a(this.f18141e);
        i iVar = this.f18142f;
        iVar.f18132a = false;
        iVar.f18133b = 0;
        iVar.f18134c = 0;
        this.f18146j = false;
        this.f18143g = false;
        this.f18144h = 0L;
    }

    @Override // com.fyber.inneractive.sdk.player.exoplayer2.extractor.ts.h
    public final void a(com.fyber.inneractive.sdk.player.exoplayer2.extractor.j jVar, e0 e0Var) {
        e0Var.a();
        e0Var.b();
        this.f18137a = e0Var.f18114e;
        e0Var.b();
        this.f18138b = jVar.a(e0Var.f18113d, 2);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:48:0x0109  */
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
    @Override // com.fyber.inneractive.sdk.player.exoplayer2.extractor.ts.h
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void a(com.fyber.inneractive.sdk.player.exoplayer2.util.n r27) {
        /*
            Method dump skipped, instruction units count: 417
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.fyber.inneractive.sdk.player.exoplayer2.extractor.ts.j.a(com.fyber.inneractive.sdk.player.exoplayer2.util.n):void");
    }

    @Override // com.fyber.inneractive.sdk.player.exoplayer2.extractor.ts.h
    public final void a(boolean z10, long j10) {
        boolean z11 = j10 != -9223372036854775807L;
        this.f18146j = z11;
        if (z11) {
            this.f18145i = j10;
        }
    }

    @Override // com.fyber.inneractive.sdk.player.exoplayer2.extractor.ts.h
    public final void b() {
    }
}
