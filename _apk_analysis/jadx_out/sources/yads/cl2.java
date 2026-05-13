package yads;

import android.util.SparseArray;
import java.io.EOFException;
import java.io.InterruptedIOException;
import yads.cl2;
import yads.mq0;

/* JADX INFO: loaded from: classes12.dex */
public final class cl2 implements mq0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final y63 f88488a;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public boolean f88492e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public boolean f88493f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public boolean f88494g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public long f88495h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public zk2 f88496i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public pq0 f88497j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public boolean f88498k;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final jb2 f88490c = new jb2(4096);

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final SparseArray f88489b = new SparseArray();

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final al2 f88491d = new al2();

    static {
        new rq0() { // from class: bt.p0
            @Override // yads.rq0
            public final mq0[] createExtractors() {
                return cl2.a();
            }
        };
    }

    public cl2(y63 y63Var) {
        this.f88488a = y63Var;
    }

    public static mq0[] a() {
        return new mq0[]{new cl2(new y63(0L))};
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:106:0x029a  */
    /* JADX WARN: Type inference failed for: r15v1 */
    /* JADX WARN: Type inference failed for: r15v2, types: [boolean, int] */
    /* JADX WARN: Type inference failed for: r15v3 */
    /* JADX WARN: Type inference failed for: r15v4 */
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
    public final int a(yads.nq0 r23, yads.gg2 r24) throws java.io.EOFException, java.io.InterruptedIOException {
        /*
            Method dump skipped, instruction units count: 987
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: yads.cl2.a(yads.nq0, yads.gg2):int");
    }

    @Override // yads.mq0
    public final void a(pq0 pq0Var) {
        this.f88497j = pq0Var;
    }

    @Override // yads.mq0
    public final boolean a(nq0 nq0Var) throws EOFException, InterruptedIOException {
        byte[] bArr = new byte[14];
        ld0 ld0Var = (ld0) nq0Var;
        ld0Var.b(bArr, 0, 14, false);
        if (442 != (((bArr[0] & 255) << 24) | ((bArr[1] & 255) << 16) | ((bArr[2] & 255) << 8) | (bArr[3] & 255)) || (bArr[4] & 196) != 68 || (bArr[6] & 4) != 4 || (bArr[8] & 4) != 4 || (bArr[9] & 1) != 1 || (bArr[12] & 3) != 3) {
            return false;
        }
        ld0Var.a(false, bArr[13] & 7);
        ld0Var.b(bArr, 0, 3, false);
        return 1 == ((((bArr[0] & 255) << 16) | ((bArr[1] & 255) << 8)) | (bArr[2] & 255));
    }

    @Override // yads.mq0
    public final void release() {
    }

    /* JADX WARN: Removed duplicated region for block: B:19:0x002c  */
    @Override // yads.mq0
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void seek(long r5, long r7) {
        /*
            r4 = this;
            yads.y63 r5 = r4.f88488a
            monitor-enter(r5)
            long r0 = r5.f97015b     // Catch: java.lang.Throwable -> L54
            monitor-exit(r5)
            r5 = -9223372036854775807(0x8000000000000001, double:-4.9E-324)
            int r0 = (r0 > r5 ? 1 : (r0 == r5 ? 0 : -1))
            r1 = 0
            if (r0 != 0) goto L12
            r0 = 1
            goto L13
        L12:
            r0 = r1
        L13:
            if (r0 != 0) goto L2a
            yads.y63 r0 = r4.f88488a
            long r2 = r0.a()
            int r5 = (r2 > r5 ? 1 : (r2 == r5 ? 0 : -1))
            if (r5 == 0) goto L31
            r5 = 0
            int r5 = (r2 > r5 ? 1 : (r2 == r5 ? 0 : -1))
            if (r5 == 0) goto L31
            int r5 = (r2 > r7 ? 1 : (r2 == r7 ? 0 : -1))
            if (r5 == 0) goto L31
            goto L2c
        L2a:
            if (r0 == 0) goto L31
        L2c:
            yads.y63 r5 = r4.f88488a
            r5.c(r7)
        L31:
            yads.zk2 r5 = r4.f88496i
            if (r5 == 0) goto L38
            r5.a(r7)
        L38:
            r5 = r1
        L39:
            android.util.SparseArray r6 = r4.f88489b
            int r6 = r6.size()
            if (r5 >= r6) goto L53
            android.util.SparseArray r6 = r4.f88489b
            java.lang.Object r6 = r6.valueAt(r5)
            yads.bl2 r6 = (yads.bl2) r6
            r6.f88064f = r1
            yads.ul0 r6 = r6.f88059a
            r6.a()
            int r5 = r5 + 1
            goto L39
        L53:
            return
        L54:
            r6 = move-exception
            monitor-exit(r5)
            throw r6
        */
        throw new UnsupportedOperationException("Method not decompiled: yads.cl2.seek(long, long):void");
    }
}
