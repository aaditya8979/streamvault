package com.fyber.inneractive.sdk.player.exoplayer2.extractor.ts;

/* JADX INFO: loaded from: classes10.dex */
public final class o implements h {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final x f18211a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public String f18212b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public com.fyber.inneractive.sdk.player.exoplayer2.extractor.r f18213c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public n f18214d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public boolean f18215e;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public long f18222l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public long f18223m;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final boolean[] f18216f = new boolean[3];

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final r f18217g = new r(32);

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final r f18218h = new r(33);

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final r f18219i = new r(34);

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final r f18220j = new r(39);

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public final r f18221k = new r(40);

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public final com.fyber.inneractive.sdk.player.exoplayer2.util.n f18224n = new com.fyber.inneractive.sdk.player.exoplayer2.util.n();

    public o(x xVar) {
        this.f18211a = xVar;
    }

    @Override // com.fyber.inneractive.sdk.player.exoplayer2.extractor.ts.h
    public final void a() {
        com.fyber.inneractive.sdk.player.exoplayer2.util.l.a(this.f18216f);
        r rVar = this.f18217g;
        rVar.f18244b = false;
        rVar.f18245c = false;
        r rVar2 = this.f18218h;
        rVar2.f18244b = false;
        rVar2.f18245c = false;
        r rVar3 = this.f18219i;
        rVar3.f18244b = false;
        rVar3.f18245c = false;
        r rVar4 = this.f18220j;
        rVar4.f18244b = false;
        rVar4.f18245c = false;
        r rVar5 = this.f18221k;
        rVar5.f18244b = false;
        rVar5.f18245c = false;
        n nVar = this.f18214d;
        nVar.f18203f = false;
        nVar.f18204g = false;
        nVar.f18205h = false;
        nVar.f18206i = false;
        nVar.f18207j = false;
        this.f18222l = 0L;
    }

    @Override // com.fyber.inneractive.sdk.player.exoplayer2.extractor.ts.h
    public final void a(com.fyber.inneractive.sdk.player.exoplayer2.extractor.j jVar, e0 e0Var) {
        e0Var.a();
        e0Var.b();
        this.f18212b = e0Var.f18114e;
        e0Var.b();
        com.fyber.inneractive.sdk.player.exoplayer2.extractor.g gVarA = jVar.a(e0Var.f18113d, 2);
        this.f18213c = gVarA;
        this.f18214d = new n(gVarA);
        this.f18211a.a(jVar, e0Var);
    }

    /* JADX WARN: Removed duplicated region for block: B:150:0x030c  */
    /* JADX WARN: Removed duplicated region for block: B:153:0x0338  */
    /* JADX WARN: Removed duplicated region for block: B:156:0x0362  */
    /* JADX WARN: Removed duplicated region for block: B:173:0x03ad  */
    /* JADX WARN: Removed duplicated region for block: B:180:0x03b9  */
    /* JADX WARN: Removed duplicated region for block: B:182:0x03bd  */
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
    public final void a(com.fyber.inneractive.sdk.player.exoplayer2.util.n r38) {
        /*
            Method dump skipped, instruction units count: 995
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.fyber.inneractive.sdk.player.exoplayer2.extractor.ts.o.a(com.fyber.inneractive.sdk.player.exoplayer2.util.n):void");
    }

    @Override // com.fyber.inneractive.sdk.player.exoplayer2.extractor.ts.h
    public final void a(boolean z10, long j10) {
        this.f18223m = j10;
    }

    public final void a(byte[] bArr, int i10, int i11) {
        if (this.f18215e) {
            n nVar = this.f18214d;
            if (nVar.f18203f) {
                int i12 = nVar.f18201d;
                int i13 = (i10 + 2) - i12;
                if (i13 < i11) {
                    nVar.f18204g = (bArr[i13] & 128) != 0;
                    nVar.f18203f = false;
                } else {
                    nVar.f18201d = (i11 - i10) + i12;
                }
            }
        } else {
            this.f18217g.a(bArr, i10, i11);
            this.f18218h.a(bArr, i10, i11);
            this.f18219i.a(bArr, i10, i11);
        }
        this.f18220j.a(bArr, i10, i11);
        this.f18221k.a(bArr, i10, i11);
    }

    @Override // com.fyber.inneractive.sdk.player.exoplayer2.extractor.ts.h
    public final void b() {
    }
}
