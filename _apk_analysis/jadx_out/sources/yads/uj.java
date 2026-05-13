package yads;

import android.media.MediaCodec;
import android.media.MediaFormat;
import android.os.Handler;
import android.os.HandlerThread;
import java.util.ArrayDeque;
import java.util.NoSuchElementException;

/* JADX INFO: loaded from: classes2.dex */
public final class uj extends MediaCodec.Callback {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final HandlerThread f95673b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public Handler f95674c;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public MediaFormat f95679h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public MediaFormat f95680i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public MediaCodec.CodecException f95681j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public long f95682k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public boolean f95683l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public IllegalStateException f95684m;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Object f95672a = new Object();

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final sb1 f95675d = new sb1();

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final sb1 f95676e = new sb1();

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final ArrayDeque f95677f = new ArrayDeque();

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final ArrayDeque f95678g = new ArrayDeque();

    public uj(HandlerThread handlerThread) {
        this.f95673b = handlerThread;
    }

    public final int a(MediaCodec.BufferInfo bufferInfo) {
        synchronized (this.f95672a) {
            if (this.f95682k <= 0 && !this.f95683l) {
                IllegalStateException illegalStateException = this.f95684m;
                if (illegalStateException != null) {
                    this.f95684m = null;
                    throw illegalStateException;
                }
                MediaCodec.CodecException codecException = this.f95681j;
                if (codecException != null) {
                    this.f95681j = null;
                    throw codecException;
                }
                sb1 sb1Var = this.f95676e;
                int i10 = sb1Var.f94761c;
                if (i10 == 0) {
                    return -1;
                }
                if (i10 == 0) {
                    throw new NoSuchElementException();
                }
                int[] iArr = sb1Var.f94762d;
                int i11 = sb1Var.f94759a;
                int i12 = iArr[i11];
                sb1Var.f94759a = (i11 + 1) & sb1Var.f94763e;
                sb1Var.f94761c = i10 - 1;
                if (i12 >= 0) {
                    if (this.f95679h == null) {
                        throw new IllegalStateException();
                    }
                    MediaCodec.BufferInfo bufferInfo2 = (MediaCodec.BufferInfo) this.f95677f.remove();
                    bufferInfo.set(bufferInfo2.offset, bufferInfo2.size, bufferInfo2.presentationTimeUs, bufferInfo2.flags);
                } else if (i12 == -2) {
                    this.f95679h = (MediaFormat) this.f95678g.remove();
                }
                return i12;
            }
            return -1;
        }
    }

    public final void a() {
        synchronized (this.f95672a) {
            this.f95682k++;
            Handler handler = this.f95674c;
            int i10 = ib3.f90737a;
            handler.post(new Runnable() { // from class: bt.wa
                @Override // java.lang.Runnable
                public final void run() {
                    this.f6377b.b();
                }
            });
        }
    }

    public final void a(MediaCodec mediaCodec) {
        if (this.f95674c != null) {
            throw new IllegalStateException();
        }
        this.f95673b.start();
        Handler handler = new Handler(this.f95673b.getLooper());
        mediaCodec.setCallback(this, handler);
        this.f95674c = handler;
    }

    public final void a(IllegalStateException illegalStateException) {
        synchronized (this.f95672a) {
            this.f95684m = illegalStateException;
        }
    }

    public final void b() {
        synchronized (this.f95672a) {
            if (this.f95683l) {
                return;
            }
            long j10 = this.f95682k - 1;
            this.f95682k = j10;
            if (j10 > 0) {
                return;
            }
            if (j10 < 0) {
                a(new IllegalStateException());
                return;
            }
            if (!this.f95678g.isEmpty()) {
                this.f95680i = (MediaFormat) this.f95678g.getLast();
            }
            sb1 sb1Var = this.f95675d;
            sb1Var.f94759a = 0;
            sb1Var.f94760b = -1;
            sb1Var.f94761c = 0;
            sb1 sb1Var2 = this.f95676e;
            sb1Var2.f94759a = 0;
            sb1Var2.f94760b = -1;
            sb1Var2.f94761c = 0;
            this.f95677f.clear();
            this.f95678g.clear();
            this.f95681j = null;
        }
    }

    @Override // android.media.MediaCodec.Callback
    public final void onError(MediaCodec mediaCodec, MediaCodec.CodecException codecException) {
        synchronized (this.f95672a) {
            this.f95681j = codecException;
        }
    }

    @Override // android.media.MediaCodec.Callback
    public final void onInputBufferAvailable(MediaCodec mediaCodec, int i10) {
        synchronized (this.f95672a) {
            this.f95675d.a(i10);
        }
    }

    @Override // android.media.MediaCodec.Callback
    public final void onOutputBufferAvailable(MediaCodec mediaCodec, int i10, MediaCodec.BufferInfo bufferInfo) {
        synchronized (this.f95672a) {
            MediaFormat mediaFormat = this.f95680i;
            if (mediaFormat != null) {
                this.f95676e.a(-2);
                this.f95678g.add(mediaFormat);
                this.f95680i = null;
            }
            this.f95676e.a(i10);
            this.f95677f.add(bufferInfo);
        }
    }

    @Override // android.media.MediaCodec.Callback
    public final void onOutputFormatChanged(MediaCodec mediaCodec, MediaFormat mediaFormat) {
        synchronized (this.f95672a) {
            this.f95676e.a(-2);
            this.f95678g.add(mediaFormat);
            this.f95680i = null;
        }
    }
}
