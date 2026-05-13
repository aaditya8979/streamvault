package u6;

import android.media.MediaCodec;
import android.media.MediaFormat;
import android.os.Handler;
import android.os.HandlerThread;
import androidx.annotation.GuardedBy;
import androidx.annotation.Nullable;
import androidx.annotation.RequiresApi;
import java.util.ArrayDeque;
import s7.m0;

/* JADX INFO: compiled from: AsynchronousMediaCodecCallback.java */
/* JADX INFO: loaded from: classes12.dex */
@RequiresApi(23)
public final class f extends MediaCodec.Callback {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final HandlerThread f85517b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public Handler f85518c;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    @Nullable
    @GuardedBy("lock")
    public MediaFormat f85523h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    @Nullable
    @GuardedBy("lock")
    public MediaFormat f85524i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    @Nullable
    @GuardedBy("lock")
    public MediaCodec.CodecException f85525j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    @GuardedBy("lock")
    public long f85526k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    @GuardedBy("lock")
    public boolean f85527l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    @Nullable
    @GuardedBy("lock")
    public IllegalStateException f85528m;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Object f85516a = new Object();

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    @GuardedBy("lock")
    public final i f85519d = new i();

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    @GuardedBy("lock")
    public final i f85520e = new i();

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    @GuardedBy("lock")
    public final ArrayDeque<MediaCodec.BufferInfo> f85521f = new ArrayDeque<>();

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    @GuardedBy("lock")
    public final ArrayDeque<MediaFormat> f85522g = new ArrayDeque<>();

    public f(HandlerThread handlerThread) {
        this.f85517b = handlerThread;
    }

    @GuardedBy("lock")
    public final void b(MediaFormat mediaFormat) {
        this.f85520e.a(-2);
        this.f85522g.add(mediaFormat);
    }

    public int c() {
        synchronized (this.f85516a) {
            int iE = -1;
            if (i()) {
                return -1;
            }
            j();
            if (!this.f85519d.d()) {
                iE = this.f85519d.e();
            }
            return iE;
        }
    }

    public int d(MediaCodec.BufferInfo bufferInfo) {
        synchronized (this.f85516a) {
            if (i()) {
                return -1;
            }
            j();
            if (this.f85520e.d()) {
                return -1;
            }
            int iE = this.f85520e.e();
            if (iE >= 0) {
                s7.a.i(this.f85523h);
                MediaCodec.BufferInfo bufferInfoRemove = this.f85521f.remove();
                bufferInfo.set(bufferInfoRemove.offset, bufferInfoRemove.size, bufferInfoRemove.presentationTimeUs, bufferInfoRemove.flags);
            } else if (iE == -2) {
                this.f85523h = this.f85522g.remove();
            }
            return iE;
        }
    }

    public void e() {
        synchronized (this.f85516a) {
            this.f85526k++;
            ((Handler) m0.j(this.f85518c)).post(new Runnable() { // from class: u6.e
                @Override // java.lang.Runnable
                public final void run() {
                    this.f85515b.m();
                }
            });
        }
    }

    @GuardedBy("lock")
    public final void f() {
        if (!this.f85522g.isEmpty()) {
            this.f85524i = this.f85522g.getLast();
        }
        this.f85519d.b();
        this.f85520e.b();
        this.f85521f.clear();
        this.f85522g.clear();
        this.f85525j = null;
    }

    public MediaFormat g() {
        MediaFormat mediaFormat;
        synchronized (this.f85516a) {
            mediaFormat = this.f85523h;
            if (mediaFormat == null) {
                throw new IllegalStateException();
            }
        }
        return mediaFormat;
    }

    public void h(MediaCodec mediaCodec) {
        s7.a.g(this.f85518c == null);
        this.f85517b.start();
        Handler handler = new Handler(this.f85517b.getLooper());
        mediaCodec.setCallback(this, handler);
        this.f85518c = handler;
    }

    @GuardedBy("lock")
    public final boolean i() {
        return this.f85526k > 0 || this.f85527l;
    }

    @GuardedBy("lock")
    public final void j() {
        k();
        l();
    }

    @GuardedBy("lock")
    public final void k() {
        IllegalStateException illegalStateException = this.f85528m;
        if (illegalStateException == null) {
            return;
        }
        this.f85528m = null;
        throw illegalStateException;
    }

    @GuardedBy("lock")
    public final void l() {
        MediaCodec.CodecException codecException = this.f85525j;
        if (codecException == null) {
            return;
        }
        this.f85525j = null;
        throw codecException;
    }

    public final void m() {
        synchronized (this.f85516a) {
            if (this.f85527l) {
                return;
            }
            long j10 = this.f85526k - 1;
            this.f85526k = j10;
            if (j10 > 0) {
                return;
            }
            if (j10 < 0) {
                n(new IllegalStateException());
            } else {
                f();
            }
        }
    }

    public final void n(IllegalStateException illegalStateException) {
        synchronized (this.f85516a) {
            this.f85528m = illegalStateException;
        }
    }

    public void o() {
        synchronized (this.f85516a) {
            this.f85527l = true;
            this.f85517b.quit();
            f();
        }
    }

    @Override // android.media.MediaCodec.Callback
    public void onError(MediaCodec mediaCodec, MediaCodec.CodecException codecException) {
        synchronized (this.f85516a) {
            this.f85525j = codecException;
        }
    }

    @Override // android.media.MediaCodec.Callback
    public void onInputBufferAvailable(MediaCodec mediaCodec, int i10) {
        synchronized (this.f85516a) {
            this.f85519d.a(i10);
        }
    }

    @Override // android.media.MediaCodec.Callback
    public void onOutputBufferAvailable(MediaCodec mediaCodec, int i10, MediaCodec.BufferInfo bufferInfo) {
        synchronized (this.f85516a) {
            MediaFormat mediaFormat = this.f85524i;
            if (mediaFormat != null) {
                b(mediaFormat);
                this.f85524i = null;
            }
            this.f85520e.a(i10);
            this.f85521f.add(bufferInfo);
        }
    }

    @Override // android.media.MediaCodec.Callback
    public void onOutputFormatChanged(MediaCodec mediaCodec, MediaFormat mediaFormat) {
        synchronized (this.f85516a) {
            b(mediaFormat);
            this.f85524i = null;
        }
    }
}
