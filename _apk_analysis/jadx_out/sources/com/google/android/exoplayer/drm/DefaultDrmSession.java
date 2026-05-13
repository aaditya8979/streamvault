package com.google.android.exoplayer.drm;

import a6.g;
import a6.k0;
import android.annotation.SuppressLint;
import android.annotation.TargetApi;
import android.media.NotProvisionedException;
import android.os.Handler;
import android.os.HandlerThread;
import android.os.Looper;
import android.os.Message;
import android.os.SystemClock;
import android.util.Pair;
import androidx.annotation.Nullable;
import com.google.android.exoplayer.drm.DrmInitData;
import com.google.android.exoplayer.drm.DrmSession;
import com.google.android.exoplayer.drm.c;
import e4.k;
import j4.f;
import j4.i;
import java.io.IOException;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.UUID;
import y5.m;

/* JADX INFO: loaded from: classes3.dex */
@TargetApi(18)
public class DefaultDrmSession<T extends i> implements DrmSession<T> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @Nullable
    public final List<DrmInitData.SchemeData> f20075a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final com.google.android.exoplayer.drm.c<T> f20076b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final a<T> f20077c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final b<T> f20078d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final int f20079e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final boolean f20080f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final boolean f20081g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final HashMap<String, String> f20082h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final g<f> f20083i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final m f20084j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public final com.google.android.exoplayer.drm.d f20085k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public final UUID f20086l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public final DefaultDrmSession<T>.e f20087m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public int f20088n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public int f20089o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    @Nullable
    public HandlerThread f20090p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    @Nullable
    public DefaultDrmSession<T>.c f20091q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    @Nullable
    public T f20092r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    @Nullable
    public DrmSession.DrmSessionException f20093s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    @Nullable
    public byte[] f20094t;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    public byte[] f20095u;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    @Nullable
    public c.a f20096v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    @Nullable
    public c.d f20097w;

    public static final class UnexpectedDrmSessionException extends IOException {
        public UnexpectedDrmSessionException(Throwable th2) {
            super("Unexpected " + th2.getClass().getSimpleName() + ": " + th2.getMessage(), th2);
        }
    }

    public interface a<T extends i> {
        void a(DefaultDrmSession<T> defaultDrmSession);

        void onProvisionCompleted();

        void onProvisionError(Exception exc);
    }

    public interface b<T extends i> {
        void a(DefaultDrmSession<T> defaultDrmSession);
    }

    @SuppressLint({"HandlerLeak"})
    public class c extends Handler {
        public c(Looper looper) {
            super(looper);
        }

        public final boolean a(Message message, Exception exc) {
            d dVar = (d) message.obj;
            if (!dVar.f20099a) {
                return false;
            }
            int i10 = dVar.f20102d + 1;
            dVar.f20102d = i10;
            if (i10 > DefaultDrmSession.this.f20084j.getMinimumLoadableRetryCount(3)) {
                return false;
            }
            long jB = DefaultDrmSession.this.f20084j.b(3, SystemClock.elapsedRealtime() - dVar.f20100b, exc instanceof IOException ? (IOException) exc : new UnexpectedDrmSessionException(exc), dVar.f20102d);
            if (jB == -9223372036854775807L) {
                return false;
            }
            sendMessageDelayed(Message.obtain(message), jB);
            return true;
        }

        public void b(int i10, Object obj, boolean z10) {
            obtainMessage(i10, new d(z10, SystemClock.elapsedRealtime(), obj)).sendToTarget();
        }

        @Override // android.os.Handler
        public void handleMessage(Message message) {
            Object objA;
            d dVar = (d) message.obj;
            try {
                int i10 = message.what;
                if (i10 == 0) {
                    DefaultDrmSession defaultDrmSession = DefaultDrmSession.this;
                    objA = defaultDrmSession.f20085k.a(defaultDrmSession.f20086l, (c.d) dVar.f20101c);
                } else {
                    if (i10 != 1) {
                        throw new RuntimeException();
                    }
                    DefaultDrmSession defaultDrmSession2 = DefaultDrmSession.this;
                    objA = defaultDrmSession2.f20085k.b(defaultDrmSession2.f20086l, (c.a) dVar.f20101c);
                }
            } catch (Exception e10) {
                boolean zA = a(message, e10);
                objA = e10;
                if (zA) {
                    return;
                }
            }
            DefaultDrmSession.this.f20087m.obtainMessage(message.what, Pair.create(dVar.f20101c, objA)).sendToTarget();
        }
    }

    public static final class d {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final boolean f20099a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final long f20100b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final Object f20101c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public int f20102d;

        public d(boolean z10, long j10, Object obj) {
            this.f20099a = z10;
            this.f20100b = j10;
            this.f20101c = obj;
        }
    }

    @SuppressLint({"HandlerLeak"})
    public class e extends Handler {
        public e(Looper looper) {
            super(looper);
        }

        @Override // android.os.Handler
        public void handleMessage(Message message) {
            Pair pair = (Pair) message.obj;
            Object obj = pair.first;
            Object obj2 = pair.second;
            int i10 = message.what;
            if (i10 == 0) {
                DefaultDrmSession.this.p(obj, obj2);
            } else {
                if (i10 != 1) {
                    return;
                }
                DefaultDrmSession.this.l(obj, obj2);
            }
        }
    }

    public DefaultDrmSession(UUID uuid, com.google.android.exoplayer.drm.c<T> cVar, a<T> aVar, b<T> bVar, @Nullable List<DrmInitData.SchemeData> list, int i10, boolean z10, boolean z11, @Nullable byte[] bArr, HashMap<String, String> map, com.google.android.exoplayer.drm.d dVar, Looper looper, g<f> gVar, m mVar) {
        if (i10 == 1 || i10 == 3) {
            a6.a.e(bArr);
        }
        this.f20086l = uuid;
        this.f20077c = aVar;
        this.f20078d = bVar;
        this.f20076b = cVar;
        this.f20079e = i10;
        this.f20080f = z10;
        this.f20081g = z11;
        if (bArr != null) {
            this.f20095u = bArr;
            this.f20075a = null;
        } else {
            this.f20075a = Collections.unmodifiableList((List) a6.a.e(list));
        }
        this.f20082h = map;
        this.f20085k = dVar;
        this.f20083i = gVar;
        this.f20084j = mVar;
        this.f20088n = 2;
        this.f20087m = new e(looper);
    }

    @Override // com.google.android.exoplayer.drm.DrmSession
    public void acquire() {
        a6.a.f(this.f20089o >= 0);
        int i10 = this.f20089o + 1;
        this.f20089o = i10;
        if (i10 == 1) {
            a6.a.f(this.f20088n == 2);
            HandlerThread handlerThread = new HandlerThread("DrmRequestHandler");
            this.f20090p = handlerThread;
            handlerThread.start();
            this.f20091q = new c(this.f20090p.getLooper());
            if (q(true)) {
                f(true);
            }
        }
    }

    public final void f(boolean z10) {
        if (this.f20081g) {
            return;
        }
        byte[] bArr = (byte[]) k0.i(this.f20094t);
        int i10 = this.f20079e;
        if (i10 != 0 && i10 != 1) {
            if (i10 == 2) {
                if (this.f20095u == null || t()) {
                    r(bArr, 2, z10);
                    return;
                }
                return;
            }
            if (i10 != 3) {
                return;
            }
            a6.a.e(this.f20095u);
            a6.a.e(this.f20094t);
            if (t()) {
                r(this.f20095u, 3, z10);
                return;
            }
            return;
        }
        if (this.f20095u == null) {
            r(bArr, 1, z10);
            return;
        }
        if (this.f20088n == 4 || t()) {
            long jG = g();
            if (this.f20079e != 0 || jG > 60) {
                if (jG <= 0) {
                    k(new KeysExpiredException());
                    return;
                } else {
                    this.f20088n = 4;
                    this.f20083i.b(new j4.b());
                    return;
                }
            }
            a6.m.b("DefaultDrmSession", "Offline license has expired or will expire soon. Remaining seconds: " + jG);
            r(bArr, 2, z10);
        }
    }

    public final long g() {
        if (!k.f60170d.equals(this.f20086l)) {
            return Long.MAX_VALUE;
        }
        Pair pair = (Pair) a6.a.e(j4.k.b(this));
        return Math.min(((Long) pair.first).longValue(), ((Long) pair.second).longValue());
    }

    @Override // com.google.android.exoplayer.drm.DrmSession
    @Nullable
    public final DrmSession.DrmSessionException getError() {
        if (this.f20088n == 1) {
            return this.f20093s;
        }
        return null;
    }

    @Override // com.google.android.exoplayer.drm.DrmSession
    @Nullable
    public final T getMediaCrypto() {
        return this.f20092r;
    }

    @Override // com.google.android.exoplayer.drm.DrmSession
    public final int getState() {
        return this.f20088n;
    }

    public boolean h(byte[] bArr) {
        return Arrays.equals(this.f20094t, bArr);
    }

    public final boolean i() {
        int i10 = this.f20088n;
        return i10 == 3 || i10 == 4;
    }

    public final void k(final Exception exc) {
        this.f20093s = new DrmSession.DrmSessionException(exc);
        this.f20083i.b(new g.a() { // from class: j4.d
            @Override // a6.g.a
            public final void a(Object obj) {
                ((f) obj).onDrmSessionManagerError(exc);
            }
        });
        if (this.f20088n != 4) {
            this.f20088n = 1;
        }
    }

    public final void l(Object obj, Object obj2) {
        if (obj == this.f20096v && i()) {
            this.f20096v = null;
            if (obj2 instanceof Exception) {
                m((Exception) obj2);
                return;
            }
            try {
                byte[] bArr = (byte[]) obj2;
                if (this.f20079e == 3) {
                    this.f20076b.provideKeyResponse((byte[]) k0.i(this.f20095u), bArr);
                    this.f20083i.b(new j4.b());
                    return;
                }
                byte[] bArrProvideKeyResponse = this.f20076b.provideKeyResponse(this.f20094t, bArr);
                int i10 = this.f20079e;
                if ((i10 == 2 || (i10 == 0 && this.f20095u != null)) && bArrProvideKeyResponse != null && bArrProvideKeyResponse.length != 0) {
                    this.f20095u = bArrProvideKeyResponse;
                }
                this.f20088n = 4;
                this.f20083i.b(new g.a() { // from class: j4.e
                    @Override // a6.g.a
                    public final void a(Object obj3) {
                        ((f) obj3).onDrmKeysLoaded();
                    }
                });
            } catch (Exception e10) {
                m(e10);
            }
        }
    }

    public final void m(Exception exc) {
        if (exc instanceof NotProvisionedException) {
            this.f20077c.a(this);
        } else {
            k(exc);
        }
    }

    public final void n() {
        if (this.f20079e == 0 && this.f20088n == 4) {
            k0.i(this.f20094t);
            f(false);
        }
    }

    public void o(int i10) {
        if (i10 != 2) {
            return;
        }
        n();
    }

    public final void p(Object obj, Object obj2) {
        if (obj == this.f20097w) {
            if (this.f20088n == 2 || i()) {
                this.f20097w = null;
                if (obj2 instanceof Exception) {
                    this.f20077c.onProvisionError((Exception) obj2);
                    return;
                }
                try {
                    this.f20076b.provideProvisionResponse((byte[]) obj2);
                    this.f20077c.onProvisionCompleted();
                } catch (Exception e10) {
                    this.f20077c.onProvisionError(e10);
                }
            }
        }
    }

    @Override // com.google.android.exoplayer.drm.DrmSession
    public boolean playClearSamplesWithoutKeys() {
        return this.f20080f;
    }

    public final boolean q(boolean z10) {
        if (i()) {
            return true;
        }
        try {
            byte[] bArrOpenSession = this.f20076b.openSession();
            this.f20094t = bArrOpenSession;
            this.f20092r = (T) this.f20076b.createMediaCrypto(bArrOpenSession);
            this.f20083i.b(new g.a() { // from class: j4.c
                @Override // a6.g.a
                public final void a(Object obj) {
                    ((f) obj).h();
                }
            });
            this.f20088n = 3;
            a6.a.e(this.f20094t);
            return true;
        } catch (NotProvisionedException e10) {
            if (z10) {
                this.f20077c.a(this);
                return false;
            }
            k(e10);
            return false;
        } catch (Exception e11) {
            k(e11);
            return false;
        }
    }

    @Override // com.google.android.exoplayer.drm.DrmSession
    @Nullable
    public Map<String, String> queryKeyStatus() {
        byte[] bArr = this.f20094t;
        if (bArr == null) {
            return null;
        }
        return this.f20076b.queryKeyStatus(bArr);
    }

    public final void r(byte[] bArr, int i10, boolean z10) {
        try {
            this.f20096v = this.f20076b.getKeyRequest(bArr, this.f20075a, i10, this.f20082h);
            ((c) k0.i(this.f20091q)).b(1, a6.a.e(this.f20096v), z10);
        } catch (Exception e10) {
            m(e10);
        }
    }

    @Override // com.google.android.exoplayer.drm.DrmSession
    public void release() {
        int i10 = this.f20089o - 1;
        this.f20089o = i10;
        if (i10 == 0) {
            this.f20088n = 0;
            ((e) k0.i(this.f20087m)).removeCallbacksAndMessages(null);
            ((c) k0.i(this.f20091q)).removeCallbacksAndMessages(null);
            this.f20091q = null;
            ((HandlerThread) k0.i(this.f20090p)).quit();
            this.f20090p = null;
            this.f20092r = null;
            this.f20093s = null;
            this.f20096v = null;
            this.f20097w = null;
            byte[] bArr = this.f20094t;
            if (bArr != null) {
                this.f20076b.closeSession(bArr);
                this.f20094t = null;
                this.f20083i.b(new g.a() { // from class: j4.a
                    @Override // a6.g.a
                    public final void a(Object obj) {
                        ((f) obj).m();
                    }
                });
            }
            this.f20078d.a(this);
        }
    }

    public void s() {
        this.f20097w = this.f20076b.getProvisionRequest();
        ((c) k0.i(this.f20091q)).b(0, a6.a.e(this.f20097w), true);
    }

    public final boolean t() {
        try {
            this.f20076b.restoreKeys(this.f20094t, this.f20095u);
            return true;
        } catch (Exception e10) {
            a6.m.d("DefaultDrmSession", "Error trying to restore keys.", e10);
            k(e10);
            return false;
        }
    }
}
