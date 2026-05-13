package yads;

/* JADX INFO: loaded from: classes11.dex */
public final class l51 extends h51 {
    public final l51 a(Object obj) {
        obj.getClass();
        a(this.f90252b + 1);
        Object[] objArr = this.f90251a;
        int i10 = this.f90252b;
        this.f90252b = i10 + 1;
        objArr[i10] = obj;
        return this;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:7:0x001f  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final yads.l51 a(java.util.List r3) {
        /*
            r2 = this;
            boolean r0 = r3 instanceof java.util.Collection
            if (r0 == 0) goto L1f
            int r0 = r2.f90252b
            int r1 = r3.size()
            int r1 = r1 + r0
            r2.a(r1)
            boolean r0 = r3 instanceof yads.j51
            if (r0 == 0) goto L1f
            yads.j51 r3 = (yads.j51) r3
            java.lang.Object[] r0 = r2.f90251a
            int r1 = r2.f90252b
            int r3 = r3.a(r1, r0)
            r2.f90252b = r3
            goto L31
        L1f:
            java.util.Iterator r3 = r3.iterator()
        L23:
            boolean r0 = r3.hasNext()
            if (r0 == 0) goto L31
            java.lang.Object r0 = r3.next()
            r2.a(r0)
            goto L23
        L31:
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: yads.l51.a(java.util.List):yads.l51");
    }

    public final sm2 a() {
        this.f90253c = true;
        return p51.b(this.f90252b, this.f90251a);
    }
}
