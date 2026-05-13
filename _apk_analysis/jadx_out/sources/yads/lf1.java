package yads;

/* JADX INFO: loaded from: classes12.dex */
public final class lf1 implements vl {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final p51 f91956a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final int f91957b;

    public lf1(int i10, sm2 sm2Var) {
        this.f91957b = i10;
        this.f91956a = sm2Var;
    }

    /* JADX WARN: Removed duplicated region for block: B:65:0x01a9  */
    /* JADX WARN: Removed duplicated region for block: B:86:0x01f7 A[SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static yads.lf1 a(int r21, yads.jb2 r22) {
        /*
            Method dump skipped, instruction units count: 584
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: yads.lf1.a(int, yads.jb2):yads.lf1");
    }

    public final vl a(Class cls) {
        m51 m51VarListIterator = this.f91956a.listIterator(0);
        while (m51VarListIterator.hasNext()) {
            vl vlVar = (vl) m51VarListIterator.next();
            if (vlVar.getClass() == cls) {
                return vlVar;
            }
        }
        return null;
    }

    @Override // yads.vl
    public final int getType() {
        return this.f91957b;
    }
}
