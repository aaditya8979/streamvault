package dq;

import hq.k;
import java.io.IOException;
import org.eclipse.jetty.io.Buffers;

/* JADX INFO: compiled from: AsyncHttpConnection.java */
/* JADX INFO: loaded from: classes2.dex */
public class c extends a implements jq.a {

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public static final vq.c f59938t = vq.b.a(c.class);

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public boolean f59939q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public hq.d f59940r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public final hq.c f59941s;

    public c(Buffers buffers, Buffers buffers2, k kVar) {
        super(buffers, buffers2, kVar);
        this.f59941s = (hq.c) kVar;
    }

    @Override // jq.a
    public void c() throws IOException {
        if (this.f59921f.p()) {
            this.f63589c.p();
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:136:0x0226, code lost:
    
        r7.h("finally {} on {} progress={} {}", r8, r16, java.lang.Boolean.valueOf(r13), r16.f63589c);
        r16.f59921f.d(false);
        q();
     */
    /* JADX WARN: Code restructure failed: missing block: B:137:0x0243, code lost:
    
        monitor-enter(r16);
     */
    /* JADX WARN: Code restructure failed: missing block: B:138:0x0244, code lost:
    
        r0 = r16.f59927l;
        r16.f59927l = null;
     */
    /* JADX WARN: Code restructure failed: missing block: B:139:0x0248, code lost:
    
        if (r0 == null) goto L141;
     */
    /* JADX WARN: Code restructure failed: missing block: B:140:0x024a, code lost:
    
        r0.f(r16.f59920e.h());
     */
    /* JADX WARN: Code restructure failed: missing block: B:142:0x0255, code lost:
    
        if (r16.f59924i != 101) goto L149;
     */
    /* JADX WARN: Code restructure failed: missing block: B:143:0x0257, code lost:
    
        r0 = r0.J(r16.f63589c);
     */
    /* JADX WARN: Code restructure failed: missing block: B:144:0x025d, code lost:
    
        if (r0 == null) goto L149;
     */
    /* JADX WARN: Code restructure failed: missing block: B:145:0x025f, code lost:
    
        r4 = r16.f59928m;
     */
    /* JADX WARN: Code restructure failed: missing block: B:146:0x0261, code lost:
    
        if (r4 == null) goto L148;
     */
    /* JADX WARN: Code restructure failed: missing block: B:147:0x0263, code lost:
    
        r16.f59920e.v(r4);
     */
    /* JADX WARN: Code restructure failed: missing block: B:148:0x0268, code lost:
    
        r16.f59928m = null;
        r4 = r0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:149:0x026b, code lost:
    
        r0 = r16.f59928m;
     */
    /* JADX WARN: Code restructure failed: missing block: B:150:0x026d, code lost:
    
        if (r0 == null) goto L152;
     */
    /* JADX WARN: Code restructure failed: missing block: B:151:0x026f, code lost:
    
        r16.f59920e.v(r0);
        r16.f59928m = null;
     */
    /* JADX WARN: Code restructure failed: missing block: B:153:0x0278, code lost:
    
        if (r16.f59927l != null) goto L157;
     */
    /* JADX WARN: Code restructure failed: missing block: B:155:0x027e, code lost:
    
        if (o() != false) goto L157;
     */
    /* JADX WARN: Code restructure failed: missing block: B:156:0x0280, code lost:
    
        r16.f59920e.s(r16, true);
     */
    /* JADX WARN: Removed duplicated region for block: B:125:0x01fe  */
    /* JADX WARN: Type inference fix 'apply assigned field type' failed
    java.lang.UnsupportedOperationException: ArgType.getObject(), call class: class jadx.core.dex.instructions.args.ArgType$ArrayArg
    	at jadx.core.dex.instructions.args.ArgType.getObject(ArgType.java:593)
    	at jadx.core.dex.attributes.nodes.ClassTypeVarsAttr.getTypeVarsMapFor(ClassTypeVarsAttr.java:35)
    	at jadx.core.dex.nodes.utils.TypeUtils.replaceClassGenerics(TypeUtils.java:177)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.insertExplicitUseCast(FixTypesVisitor.java:397)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryFieldTypeWithNewCasts(FixTypesVisitor.java:359)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.applyFieldType(FixTypesVisitor.java:309)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.visit(FixTypesVisitor.java:94)
     */
    @Override // hq.j
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public hq.j e() throws java.io.IOException {
        /*
            Method dump skipped, instruction units count: 923
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: dq.c.e():hq.j");
    }

    @Override // dq.a
    public void q() throws IOException {
        this.f59939q = false;
        super.q();
    }

    @Override // dq.a
    public boolean r(i iVar) throws IOException {
        boolean zR = super.r(iVar);
        if (zR) {
            this.f59941s.y();
        }
        return zR;
    }
}
