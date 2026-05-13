package u6;

import android.media.MediaCodec;
import android.os.Handler;
import android.os.HandlerThread;
import android.os.Looper;
import android.os.Message;
import androidx.annotation.GuardedBy;
import androidx.annotation.Nullable;
import androidx.annotation.RequiresApi;
import androidx.annotation.VisibleForTesting;
import java.util.ArrayDeque;
import java.util.Arrays;
import java.util.concurrent.atomic.AtomicReference;
import s7.m0;

/* JADX INFO: compiled from: AsynchronousMediaCodecBufferEnqueuer.java */
/* JADX INFO: loaded from: classes5.dex */
@RequiresApi(23)
public class d {

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    @GuardedBy("MESSAGE_PARAMS_INSTANCE_POOL")
    public static final ArrayDeque<b> f85500g = new ArrayDeque<>();

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public static final Object f85501h = new Object();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final MediaCodec f85502a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final HandlerThread f85503b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public Handler f85504c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final AtomicReference<RuntimeException> f85505d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final s7.g f85506e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public boolean f85507f;

    /* JADX INFO: compiled from: AsynchronousMediaCodecBufferEnqueuer.java */
    public class a extends Handler {
        public a(Looper looper) {
            super(looper);
        }

        @Override // android.os.Handler
        public void handleMessage(Message message) {
            d.this.f(message);
        }
    }

    /* JADX INFO: compiled from: AsynchronousMediaCodecBufferEnqueuer.java */
    public static class b {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public int f85509a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public int f85510b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public int f85511c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public final MediaCodec.CryptoInfo f85512d = new MediaCodec.CryptoInfo();

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public long f85513e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        public int f85514f;

        public void a(int i10, int i11, int i12, long j10, int i13) {
            this.f85509a = i10;
            this.f85510b = i11;
            this.f85511c = i12;
            this.f85513e = j10;
            this.f85514f = i13;
        }
    }

    public d(MediaCodec mediaCodec, HandlerThread handlerThread) {
        this(mediaCodec, handlerThread, new s7.g());
    }

    @VisibleForTesting
    public d(MediaCodec mediaCodec, HandlerThread handlerThread, s7.g gVar) {
        this.f85502a = mediaCodec;
        this.f85503b = handlerThread;
        this.f85506e = gVar;
        this.f85505d = new AtomicReference<>();
    }

    public static void c(g6.c cVar, MediaCodec.CryptoInfo cryptoInfo) {
        cryptoInfo.numSubSamples = cVar.f62089f;
        cryptoInfo.numBytesOfClearData = e(cVar.f62087d, cryptoInfo.numBytesOfClearData);
        cryptoInfo.numBytesOfEncryptedData = e(cVar.f62088e, cryptoInfo.numBytesOfEncryptedData);
        cryptoInfo.key = (byte[]) s7.a.e(d(cVar.f62085b, cryptoInfo.key));
        cryptoInfo.iv = (byte[]) s7.a.e(d(cVar.f62084a, cryptoInfo.iv));
        cryptoInfo.mode = cVar.f62086c;
        if (m0.f79487a >= 24) {
            cryptoInfo.setPattern(new MediaCodec.CryptoInfo.Pattern(cVar.f62090g, cVar.f62091h));
        }
    }

    @Nullable
    public static byte[] d(@Nullable byte[] bArr, @Nullable byte[] bArr2) {
        if (bArr == null) {
            return bArr2;
        }
        if (bArr2 == null || bArr2.length < bArr.length) {
            return Arrays.copyOf(bArr, bArr.length);
        }
        System.arraycopy(bArr, 0, bArr2, 0, bArr.length);
        return bArr2;
    }

    @Nullable
    public static int[] e(@Nullable int[] iArr, @Nullable int[] iArr2) {
        if (iArr == null) {
            return iArr2;
        }
        if (iArr2 == null || iArr2.length < iArr.length) {
            return Arrays.copyOf(iArr, iArr.length);
        }
        System.arraycopy(iArr, 0, iArr2, 0, iArr.length);
        return iArr2;
    }

    public static b k() {
        ArrayDeque<b> arrayDeque = f85500g;
        synchronized (arrayDeque) {
            if (arrayDeque.isEmpty()) {
                return new b();
            }
            return arrayDeque.removeFirst();
        }
    }

    public static void o(b bVar) {
        ArrayDeque<b> arrayDeque = f85500g;
        synchronized (arrayDeque) {
            arrayDeque.add(bVar);
        }
    }

    public final void b() throws InterruptedException {
        this.f85506e.c();
        ((Handler) s7.a.e(this.f85504c)).obtainMessage(2).sendToTarget();
        this.f85506e.a();
    }

    public final void f(Message message) {
        int i10 = message.what;
        b bVar = null;
        if (i10 == 0) {
            bVar = (b) message.obj;
            g(bVar.f85509a, bVar.f85510b, bVar.f85511c, bVar.f85513e, bVar.f85514f);
        } else if (i10 == 1) {
            bVar = (b) message.obj;
            h(bVar.f85509a, bVar.f85510b, bVar.f85512d, bVar.f85513e, bVar.f85514f);
        } else if (i10 != 2) {
            androidx.compose.animation.core.a.a(this.f85505d, null, new IllegalStateException(String.valueOf(message.what)));
        } else {
            this.f85506e.e();
        }
        if (bVar != null) {
            o(bVar);
        }
    }

    public final void g(int i10, int i11, int i12, long j10, int i13) {
        try {
            this.f85502a.queueInputBuffer(i10, i11, i12, j10, i13);
        } catch (RuntimeException e10) {
            androidx.compose.animation.core.a.a(this.f85505d, null, e10);
        }
    }

    public final void h(int i10, int i11, MediaCodec.CryptoInfo cryptoInfo, long j10, int i12) {
        try {
            synchronized (f85501h) {
                this.f85502a.queueSecureInputBuffer(i10, i11, cryptoInfo, j10, i12);
            }
        } catch (RuntimeException e10) {
            androidx.compose.animation.core.a.a(this.f85505d, null, e10);
        }
    }

    public void i() {
        if (this.f85507f) {
            try {
                j();
            } catch (InterruptedException e10) {
                Thread.currentThread().interrupt();
                throw new IllegalStateException(e10);
            }
        }
    }

    public final void j() throws InterruptedException {
        ((Handler) s7.a.e(this.f85504c)).removeCallbacksAndMessages(null);
        b();
    }

    public final void l() {
        RuntimeException andSet = this.f85505d.getAndSet(null);
        if (andSet != null) {
            throw andSet;
        }
    }

    public void m(int i10, int i11, int i12, long j10, int i13) {
        l();
        b bVarK = k();
        bVarK.a(i10, i11, i12, j10, i13);
        ((Handler) m0.j(this.f85504c)).obtainMessage(0, bVarK).sendToTarget();
    }

    public void n(int i10, int i11, g6.c cVar, long j10, int i12) {
        l();
        b bVarK = k();
        bVarK.a(i10, i11, 0, j10, i12);
        c(cVar, bVarK.f85512d);
        ((Handler) m0.j(this.f85504c)).obtainMessage(1, bVarK).sendToTarget();
    }

    public void p() {
        if (this.f85507f) {
            i();
            this.f85503b.quit();
        }
        this.f85507f = false;
    }

    public void q() {
        if (this.f85507f) {
            return;
        }
        this.f85503b.start();
        this.f85504c = new a(this.f85503b.getLooper());
        this.f85507f = true;
    }

    public void r() throws InterruptedException {
        b();
    }
}
