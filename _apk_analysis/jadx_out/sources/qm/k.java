package qm;

import io.reactivex.internal.queue.SpscArrayQueue;
import xl.r;

/* JADX INFO: compiled from: QueueDrainHelper.java */
/* JADX INFO: loaded from: classes9.dex */
public final class k {
    public static <T, U> boolean a(boolean z10, boolean z11, r<?> rVar, boolean z12, gm.h<?> hVar, bm.b bVar, h<T, U> hVar2) {
        if (hVar2.f()) {
            hVar.clear();
            bVar.dispose();
            return true;
        }
        if (!z10) {
            return false;
        }
        if (z12) {
            if (!z11) {
                return false;
            }
            if (bVar != null) {
                bVar.dispose();
            }
            Throwable thA = hVar2.a();
            if (thA != null) {
                rVar.onError(thA);
            } else {
                rVar.onComplete();
            }
            return true;
        }
        Throwable thA2 = hVar2.a();
        if (thA2 != null) {
            hVar.clear();
            if (bVar != null) {
                bVar.dispose();
            }
            rVar.onError(thA2);
            return true;
        }
        if (!z11) {
            return false;
        }
        if (bVar != null) {
            bVar.dispose();
        }
        rVar.onComplete();
        return true;
    }

    public static <T> gm.h<T> b(int i10) {
        return i10 < 0 ? new om.a(-i10) : new SpscArrayQueue(i10);
    }

    /* JADX WARN: Code restructure failed: missing block: B:14:0x0033, code lost:
    
        r1 = r15.c(-r1);
     */
    /* JADX WARN: Code restructure failed: missing block: B:15:0x0038, code lost:
    
        if (r1 != 0) goto L21;
     */
    /* JADX WARN: Code restructure failed: missing block: B:16:0x003a, code lost:
    
        return;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static <T, U> void c(gm.g<T> r11, xl.r<? super U> r12, boolean r13, bm.b r14, qm.h<T, U> r15) {
        /*
            r0 = 1
            r1 = r0
        L2:
            boolean r2 = r15.d()
            boolean r3 = r11.isEmpty()
            r4 = r12
            r5 = r13
            r6 = r11
            r7 = r14
            r8 = r15
            boolean r2 = a(r2, r3, r4, r5, r6, r7, r8)
            if (r2 == 0) goto L16
            return
        L16:
            boolean r3 = r15.d()
            java.lang.Object r2 = r11.poll()
            if (r2 != 0) goto L22
            r10 = r0
            goto L24
        L22:
            r4 = 0
            r10 = r4
        L24:
            r4 = r10
            r5 = r12
            r6 = r13
            r7 = r11
            r8 = r14
            r9 = r15
            boolean r3 = a(r3, r4, r5, r6, r7, r8, r9)
            if (r3 == 0) goto L31
            return
        L31:
            if (r10 == 0) goto L3b
            int r1 = -r1
            int r1 = r15.c(r1)
            if (r1 != 0) goto L2
            return
        L3b:
            r15.b(r12, r2)
            goto L16
        */
        throw new UnsupportedOperationException("Method not decompiled: qm.k.c(gm.g, xl.r, boolean, bm.b, qm.h):void");
    }
}
