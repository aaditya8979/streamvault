package yads;

import android.media.MediaCodec;
import android.os.HandlerThread;
import java.util.ArrayDeque;
import java.util.Arrays;
import java.util.concurrent.atomic.AtomicReference;

/* JADX INFO: loaded from: classes2.dex */
public final class tj {

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public static final ArrayDeque f95244g = new ArrayDeque();

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public static final Object f95245h = new Object();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final MediaCodec f95246a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final HandlerThread f95247b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public rj f95248c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final AtomicReference f95249d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final vy f95250e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public boolean f95251f;

    public tj(MediaCodec mediaCodec, HandlerThread handlerThread) {
        this(mediaCodec, handlerThread, new vy());
    }

    public tj(MediaCodec mediaCodec, HandlerThread handlerThread, vy vyVar) {
        this.f95246a = mediaCodec;
        this.f95247b = handlerThread;
        this.f95250e = vyVar;
        this.f95249d = new AtomicReference();
    }

    public static void a(sj sjVar) {
        ArrayDeque arrayDeque = f95244g;
        synchronized (arrayDeque) {
            arrayDeque.add(sjVar);
        }
    }

    public static sj b() {
        ArrayDeque arrayDeque = f95244g;
        synchronized (arrayDeque) {
            if (arrayDeque.isEmpty()) {
                return new sj();
            }
            return (sj) arrayDeque.removeFirst();
        }
    }

    public final void a() {
        if (this.f95251f) {
            try {
                rj rjVar = this.f95248c;
                rjVar.getClass();
                rjVar.removeCallbacksAndMessages(null);
                vy vyVar = this.f95250e;
                synchronized (vyVar) {
                    vyVar.f96222a = false;
                }
                rj rjVar2 = this.f95248c;
                rjVar2.getClass();
                rjVar2.obtainMessage(2).sendToTarget();
                this.f95250e.a();
            } catch (InterruptedException e10) {
                Thread.currentThread().interrupt();
                throw new IllegalStateException(e10);
            }
        }
    }

    public final void a(int i10, m20 m20Var, long j10) {
        RuntimeException runtimeException = (RuntimeException) this.f95249d.getAndSet(null);
        if (runtimeException != null) {
            throw runtimeException;
        }
        sj sjVarB = b();
        sjVarB.f94843a = i10;
        sjVarB.f94844b = 0;
        sjVarB.f94845c = 0;
        sjVarB.f94847e = j10;
        sjVarB.f94848f = 0;
        MediaCodec.CryptoInfo cryptoInfo = sjVarB.f94846d;
        cryptoInfo.numSubSamples = m20Var.f92219f;
        int[] iArr = m20Var.f92217d;
        int[] iArrCopyOf = cryptoInfo.numBytesOfClearData;
        if (iArr != null) {
            if (iArrCopyOf == null || iArrCopyOf.length < iArr.length) {
                iArrCopyOf = Arrays.copyOf(iArr, iArr.length);
            } else {
                System.arraycopy(iArr, 0, iArrCopyOf, 0, iArr.length);
            }
        }
        cryptoInfo.numBytesOfClearData = iArrCopyOf;
        int[] iArr2 = m20Var.f92218e;
        int[] iArrCopyOf2 = cryptoInfo.numBytesOfEncryptedData;
        if (iArr2 != null) {
            if (iArrCopyOf2 == null || iArrCopyOf2.length < iArr2.length) {
                iArrCopyOf2 = Arrays.copyOf(iArr2, iArr2.length);
            } else {
                System.arraycopy(iArr2, 0, iArrCopyOf2, 0, iArr2.length);
            }
        }
        cryptoInfo.numBytesOfEncryptedData = iArrCopyOf2;
        byte[] bArr = m20Var.f92215b;
        byte[] bArrCopyOf = cryptoInfo.key;
        if (bArr != null) {
            if (bArrCopyOf == null || bArrCopyOf.length < bArr.length) {
                bArrCopyOf = Arrays.copyOf(bArr, bArr.length);
            } else {
                System.arraycopy(bArr, 0, bArrCopyOf, 0, bArr.length);
            }
        }
        bArrCopyOf.getClass();
        cryptoInfo.key = bArrCopyOf;
        byte[] bArr2 = m20Var.f92214a;
        byte[] bArrCopyOf2 = cryptoInfo.iv;
        if (bArr2 != null) {
            if (bArrCopyOf2 == null || bArrCopyOf2.length < bArr2.length) {
                bArrCopyOf2 = Arrays.copyOf(bArr2, bArr2.length);
            } else {
                System.arraycopy(bArr2, 0, bArrCopyOf2, 0, bArr2.length);
            }
        }
        bArrCopyOf2.getClass();
        cryptoInfo.iv = bArrCopyOf2;
        cryptoInfo.mode = m20Var.f92216c;
        if (ib3.f90737a >= 24) {
            cryptoInfo.setPattern(new MediaCodec.CryptoInfo.Pattern(m20Var.f92220g, m20Var.f92221h));
        }
        this.f95248c.obtainMessage(1, sjVarB).sendToTarget();
    }

    /* JADX WARN: Removed duplicated region for block: B:28:0x0061  */
    /* JADX WARN: Removed duplicated region for block: B:35:? A[RETURN, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void a(android.os.Message r10) {
        /*
            r9 = this;
            int r0 = r10.what
            r1 = 0
            if (r0 == 0) goto L44
            r2 = 1
            if (r0 == r2) goto L22
            r2 = 2
            if (r0 == r2) goto L1c
            java.util.concurrent.atomic.AtomicReference r0 = r9.f95249d
            java.lang.IllegalStateException r2 = new java.lang.IllegalStateException
            int r10 = r10.what
            java.lang.String r10 = java.lang.String.valueOf(r10)
            r2.<init>(r10)
            androidx.compose.animation.core.a.a(r0, r1, r2)
            goto L5f
        L1c:
            yads.vy r10 = r9.f95250e
            r10.d()
            goto L5f
        L22:
            java.lang.Object r10 = r10.obj
            yads.sj r10 = (yads.sj) r10
            int r3 = r10.f94843a
            int r4 = r10.f94844b
            android.media.MediaCodec$CryptoInfo r5 = r10.f94846d
            long r6 = r10.f94847e
            int r8 = r10.f94848f
            java.lang.Object r0 = yads.tj.f95245h     // Catch: java.lang.RuntimeException -> L3d
            monitor-enter(r0)     // Catch: java.lang.RuntimeException -> L3d
            android.media.MediaCodec r2 = r9.f95246a     // Catch: java.lang.Throwable -> L3a
            r2.queueSecureInputBuffer(r3, r4, r5, r6, r8)     // Catch: java.lang.Throwable -> L3a
            monitor-exit(r0)     // Catch: java.lang.Throwable -> L3a
            goto L5e
        L3a:
            r2 = move-exception
            monitor-exit(r0)     // Catch: java.lang.Throwable -> L3a
            throw r2     // Catch: java.lang.RuntimeException -> L3d
        L3d:
            r0 = move-exception
            java.util.concurrent.atomic.AtomicReference r2 = r9.f95249d
            androidx.compose.animation.core.a.a(r2, r1, r0)
            goto L5e
        L44:
            java.lang.Object r10 = r10.obj
            yads.sj r10 = (yads.sj) r10
            int r3 = r10.f94843a
            int r4 = r10.f94844b
            int r5 = r10.f94845c
            long r6 = r10.f94847e
            int r8 = r10.f94848f
            android.media.MediaCodec r2 = r9.f95246a     // Catch: java.lang.RuntimeException -> L58
            r2.queueInputBuffer(r3, r4, r5, r6, r8)     // Catch: java.lang.RuntimeException -> L58
            goto L5e
        L58:
            r0 = move-exception
            java.util.concurrent.atomic.AtomicReference r2 = r9.f95249d
            androidx.compose.animation.core.a.a(r2, r1, r0)
        L5e:
            r1 = r10
        L5f:
            if (r1 == 0) goto L64
            a(r1)
        L64:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: yads.tj.a(android.os.Message):void");
    }
}
