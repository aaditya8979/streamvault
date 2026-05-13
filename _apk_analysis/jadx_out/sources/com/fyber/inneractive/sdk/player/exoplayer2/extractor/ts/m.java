package com.fyber.inneractive.sdk.player.exoplayer2.extractor.ts;

/* JADX INFO: loaded from: classes10.dex */
public final class m implements h {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final x f18184a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final boolean f18185b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final boolean f18186c;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public long f18190g;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public String f18192i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public com.fyber.inneractive.sdk.player.exoplayer2.extractor.r f18193j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public l f18194k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public boolean f18195l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public long f18196m;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final boolean[] f18191h = new boolean[3];

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final r f18187d = new r(7);

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final r f18188e = new r(8);

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final r f18189f = new r(6);

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public final com.fyber.inneractive.sdk.player.exoplayer2.util.n f18197n = new com.fyber.inneractive.sdk.player.exoplayer2.util.n();

    public m(x xVar, boolean z10, boolean z11) {
        this.f18184a = xVar;
        this.f18185b = z10;
        this.f18186c = z11;
    }

    @Override // com.fyber.inneractive.sdk.player.exoplayer2.extractor.ts.h
    public final void a() {
        com.fyber.inneractive.sdk.player.exoplayer2.util.l.a(this.f18191h);
        r rVar = this.f18187d;
        rVar.f18244b = false;
        rVar.f18245c = false;
        r rVar2 = this.f18188e;
        rVar2.f18244b = false;
        rVar2.f18245c = false;
        r rVar3 = this.f18189f;
        rVar3.f18244b = false;
        rVar3.f18245c = false;
        l lVar = this.f18194k;
        lVar.f18176k = false;
        lVar.f18180o = false;
        k kVar = lVar.f18179n;
        kVar.f18151b = false;
        kVar.f18150a = false;
        this.f18190g = 0L;
    }

    @Override // com.fyber.inneractive.sdk.player.exoplayer2.extractor.ts.h
    public final void a(com.fyber.inneractive.sdk.player.exoplayer2.extractor.j jVar, e0 e0Var) {
        e0Var.a();
        e0Var.b();
        this.f18192i = e0Var.f18114e;
        e0Var.b();
        com.fyber.inneractive.sdk.player.exoplayer2.extractor.g gVarA = jVar.a(e0Var.f18113d, 2);
        this.f18193j = gVarA;
        this.f18194k = new l(gVarA, this.f18185b, this.f18186c);
        this.f18184a.a(jVar, e0Var);
    }

    /* JADX WARN: Removed duplicated region for block: B:110:0x0293  */
    /* JADX WARN: Removed duplicated region for block: B:129:0x02d3  */
    /* JADX WARN: Removed duplicated region for block: B:29:0x007e  */
    /* JADX WARN: Removed duplicated region for block: B:94:0x024d  */
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
    public final void a(com.fyber.inneractive.sdk.player.exoplayer2.util.n r33) {
        /*
            Method dump skipped, instruction units count: 749
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.fyber.inneractive.sdk.player.exoplayer2.extractor.ts.m.a(com.fyber.inneractive.sdk.player.exoplayer2.util.n):void");
    }

    @Override // com.fyber.inneractive.sdk.player.exoplayer2.extractor.ts.h
    public final void a(boolean z10, long j10) {
        this.f18196m = j10;
    }

    @Override // com.fyber.inneractive.sdk.player.exoplayer2.extractor.ts.h
    public final void b() {
    }
}
