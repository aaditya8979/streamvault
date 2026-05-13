package qm;

import dm.q;

/* JADX INFO: compiled from: AppendOnlyLinkedArrayList.java */
/* JADX INFO: loaded from: classes8.dex */
public class a<T> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int f78353a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Object[] f78354b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public Object[] f78355c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public int f78356d;

    /* JADX INFO: renamed from: qm.a$a, reason: collision with other inner class name */
    /* JADX INFO: compiled from: AppendOnlyLinkedArrayList.java */
    public interface InterfaceC0938a<T> extends q<T> {
        @Override // dm.q
        boolean test(T t10);
    }

    public a(int i10) {
        this.f78353a = i10;
        Object[] objArr = new Object[i10 + 1];
        this.f78354b = objArr;
        this.f78355c = objArr;
    }

    /* JADX WARN: Code restructure failed: missing block: B:19:0x0019, code lost:
    
        continue;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public <U> boolean a(ms.b<? super U> r5) {
        /*
            r4 = this;
            java.lang.Object[] r0 = r4.f78354b
            int r1 = r4.f78353a
        L4:
            r2 = 0
            if (r0 == 0) goto L1e
        L7:
            if (r2 >= r1) goto L19
            r3 = r0[r2]
            if (r3 != 0) goto Le
            goto L19
        Le:
            boolean r3 = io.reactivex.internal.util.NotificationLite.acceptFull(r3, r5)
            if (r3 == 0) goto L16
            r5 = 1
            return r5
        L16:
            int r2 = r2 + 1
            goto L7
        L19:
            r0 = r0[r1]
            java.lang.Object[] r0 = (java.lang.Object[]) r0
            goto L4
        L1e:
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: qm.a.a(ms.b):boolean");
    }

    /* JADX WARN: Code restructure failed: missing block: B:19:0x0019, code lost:
    
        continue;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public <U> boolean b(xl.r<? super U> r5) {
        /*
            r4 = this;
            java.lang.Object[] r0 = r4.f78354b
            int r1 = r4.f78353a
        L4:
            r2 = 0
            if (r0 == 0) goto L1e
        L7:
            if (r2 >= r1) goto L19
            r3 = r0[r2]
            if (r3 != 0) goto Le
            goto L19
        Le:
            boolean r3 = io.reactivex.internal.util.NotificationLite.acceptFull(r3, r5)
            if (r3 == 0) goto L16
            r5 = 1
            return r5
        L16:
            int r2 = r2 + 1
            goto L7
        L19:
            r0 = r0[r1]
            java.lang.Object[] r0 = (java.lang.Object[]) r0
            goto L4
        L1e:
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: qm.a.b(xl.r):boolean");
    }

    public void c(T t10) {
        int i10 = this.f78353a;
        int i11 = this.f78356d;
        if (i11 == i10) {
            Object[] objArr = new Object[i10 + 1];
            this.f78355c[i10] = objArr;
            this.f78355c = objArr;
            i11 = 0;
        }
        this.f78355c[i11] = t10;
        this.f78356d = i11 + 1;
    }

    /* JADX WARN: Code restructure failed: missing block: B:18:0x0018, code lost:
    
        continue;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public void d(qm.a.InterfaceC0938a<? super T> r5) {
        /*
            r4 = this;
            java.lang.Object[] r0 = r4.f78354b
            int r1 = r4.f78353a
        L4:
            if (r0 == 0) goto L1d
            r2 = 0
        L7:
            if (r2 >= r1) goto L18
            r3 = r0[r2]
            if (r3 != 0) goto Le
            goto L18
        Le:
            boolean r3 = r5.test(r3)
            if (r3 == 0) goto L15
            return
        L15:
            int r2 = r2 + 1
            goto L7
        L18:
            r0 = r0[r1]
            java.lang.Object[] r0 = (java.lang.Object[]) r0
            goto L4
        L1d:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: qm.a.d(qm.a$a):void");
    }

    public void e(T t10) {
        this.f78354b[0] = t10;
    }
}
