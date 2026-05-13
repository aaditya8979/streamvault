package com.google.android.exoplayer2.drm;

import android.annotation.SuppressLint;
import android.media.NotProvisionedException;
import android.os.Handler;
import android.os.HandlerThread;
import android.os.Looper;
import android.os.Message;
import android.os.SystemClock;
import android.util.Pair;
import androidx.annotation.GuardedBy;
import androidx.annotation.Nullable;
import androidx.annotation.RequiresApi;
import com.google.android.exoplayer2.drm.DrmInitData;
import com.google.android.exoplayer2.drm.DrmSession;
import com.google.android.exoplayer2.drm.b;
import com.google.android.exoplayer2.drm.g;
import com.google.android.exoplayer2.upstream.b;
import e6.s1;
import e7.n;
import e7.o;
import h6.u;
import java.io.IOException;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.UUID;
import s7.m0;
import s7.q;

/* JADX INFO: loaded from: classes11.dex */
@RequiresApi(18)
public class DefaultDrmSession implements DrmSession {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @Nullable
    public final List<DrmInitData.SchemeData> f21436a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final g f21437b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final a f21438c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final b f21439d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final int f21440e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final boolean f21441f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final boolean f21442g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final HashMap<String, String> f21443h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final s7.i<b.a> f21444i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final com.google.android.exoplayer2.upstream.b f21445j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public final s1 f21446k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public final j f21447l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public final UUID f21448m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public final e f21449n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public int f21450o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public int f21451p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    @Nullable
    public HandlerThread f21452q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    @Nullable
    public c f21453r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    @Nullable
    public g6.b f21454s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    @Nullable
    public DrmSession.DrmSessionException f21455t;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    @Nullable
    public byte[] f21456u;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public byte[] f21457v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    @Nullable
    public g.a f21458w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    @Nullable
    public g.d f21459x;

    public static final class UnexpectedDrmSessionException extends IOException {
        public UnexpectedDrmSessionException(@Nullable Throwable th2) {
            super(th2);
        }
    }

    public interface a {
        void a(DefaultDrmSession defaultDrmSession);

        void onProvisionCompleted();

        void onProvisionError(Exception exc, boolean z10);
    }

    public interface b {
        void a(DefaultDrmSession defaultDrmSession, int i10);

        void b(DefaultDrmSession defaultDrmSession, int i10);
    }

    @SuppressLint({"HandlerLeak"})
    public class c extends Handler {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        @GuardedBy("this")
        public boolean f21460a;

        public c(Looper looper) {
            super(looper);
        }

        public final boolean a(Message message, MediaDrmCallbackException mediaDrmCallbackException) {
            d dVar = (d) message.obj;
            if (!dVar.f21463b) {
                return false;
            }
            int i10 = dVar.f21466e + 1;
            dVar.f21466e = i10;
            if (i10 > DefaultDrmSession.this.f21445j.getMinimumLoadableRetryCount(3)) {
                return false;
            }
            long jA = DefaultDrmSession.this.f21445j.a(new b.a(new n(dVar.f21462a, mediaDrmCallbackException.dataSpec, mediaDrmCallbackException.uriAfterRedirects, mediaDrmCallbackException.responseHeaders, SystemClock.elapsedRealtime(), SystemClock.elapsedRealtime() - dVar.f21464c, mediaDrmCallbackException.bytesLoaded), new o(3), mediaDrmCallbackException.getCause() instanceof IOException ? (IOException) mediaDrmCallbackException.getCause() : new UnexpectedDrmSessionException(mediaDrmCallbackException.getCause()), dVar.f21466e));
            if (jA == -9223372036854775807L) {
                return false;
            }
            synchronized (this) {
                if (this.f21460a) {
                    return false;
                }
                sendMessageDelayed(Message.obtain(message), jA);
                return true;
            }
        }

        public void b(int i10, Object obj, boolean z10) {
            obtainMessage(i10, new d(n.a(), z10, SystemClock.elapsedRealtime(), obj)).sendToTarget();
        }

        public synchronized void c() {
            removeCallbacksAndMessages(null);
            this.f21460a = true;
        }

        @Override // android.os.Handler
        public void handleMessage(Message message) {
            Object objB;
            d dVar = (d) message.obj;
            try {
                int i10 = message.what;
                if (i10 == 0) {
                    DefaultDrmSession defaultDrmSession = DefaultDrmSession.this;
                    objB = defaultDrmSession.f21447l.b(defaultDrmSession.f21448m, (g.d) dVar.f21465d);
                } else {
                    if (i10 != 1) {
                        throw new RuntimeException();
                    }
                    DefaultDrmSession defaultDrmSession2 = DefaultDrmSession.this;
                    objB = defaultDrmSession2.f21447l.a(defaultDrmSession2.f21448m, (g.a) dVar.f21465d);
                }
            } catch (MediaDrmCallbackException e10) {
                boolean zA = a(message, e10);
                objB = e10;
                if (zA) {
                    return;
                }
            } catch (Exception e11) {
                q.j("DefaultDrmSession", "Key/provisioning request produced an unexpected exception. Not retrying.", e11);
                objB = e11;
            }
            DefaultDrmSession.this.f21445j.onLoadTaskConcluded(dVar.f21462a);
            synchronized (this) {
                if (!this.f21460a) {
                    DefaultDrmSession.this.f21449n.obtainMessage(message.what, Pair.create(dVar.f21465d, objB)).sendToTarget();
                }
            }
        }
    }

    public static final class d {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final long f21462a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final boolean f21463b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final long f21464c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public final Object f21465d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public int f21466e;

        public d(long j10, boolean z10, long j11, Object obj) {
            this.f21462a = j10;
            this.f21463b = z10;
            this.f21464c = j11;
            this.f21465d = obj;
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
                DefaultDrmSession.this.w(obj, obj2);
            } else {
                if (i10 != 1) {
                    return;
                }
                DefaultDrmSession.this.q(obj, obj2);
            }
        }
    }

    public DefaultDrmSession(UUID uuid, g gVar, a aVar, b bVar, @Nullable List<DrmInitData.SchemeData> list, int i10, boolean z10, boolean z11, @Nullable byte[] bArr, HashMap<String, String> map, j jVar, Looper looper, com.google.android.exoplayer2.upstream.b bVar2, s1 s1Var) {
        if (i10 == 1 || i10 == 3) {
            s7.a.e(bArr);
        }
        this.f21448m = uuid;
        this.f21438c = aVar;
        this.f21439d = bVar;
        this.f21437b = gVar;
        this.f21440e = i10;
        this.f21441f = z10;
        this.f21442g = z11;
        if (bArr != null) {
            this.f21457v = bArr;
            this.f21436a = null;
        } else {
            this.f21436a = Collections.unmodifiableList((List) s7.a.e(list));
        }
        this.f21443h = map;
        this.f21447l = jVar;
        this.f21444i = new s7.i<>();
        this.f21445j = bVar2;
        this.f21446k = s1Var;
        this.f21450o = 2;
        this.f21449n = new e(looper);
    }

    public final boolean A() {
        try {
            this.f21437b.restoreKeys(this.f21456u, this.f21457v);
            return true;
        } catch (Exception e10) {
            p(e10, 1);
            return false;
        }
    }

    @Override // com.google.android.exoplayer2.drm.DrmSession
    public void a(@Nullable b.a aVar) {
        int i10 = this.f21451p;
        if (i10 <= 0) {
            q.c("DefaultDrmSession", "release() called on a session that's already fully released.");
            return;
        }
        int i11 = i10 - 1;
        this.f21451p = i11;
        if (i11 == 0) {
            this.f21450o = 0;
            ((e) m0.j(this.f21449n)).removeCallbacksAndMessages(null);
            ((c) m0.j(this.f21453r)).c();
            this.f21453r = null;
            ((HandlerThread) m0.j(this.f21452q)).quit();
            this.f21452q = null;
            this.f21454s = null;
            this.f21455t = null;
            this.f21458w = null;
            this.f21459x = null;
            byte[] bArr = this.f21456u;
            if (bArr != null) {
                this.f21437b.closeSession(bArr);
                this.f21456u = null;
            }
        }
        if (aVar != null) {
            this.f21444i.e(aVar);
            if (this.f21444i.count(aVar) == 0) {
                aVar.m();
            }
        }
        this.f21439d.a(this, this.f21451p);
    }

    @Override // com.google.android.exoplayer2.drm.DrmSession
    public void c(@Nullable b.a aVar) {
        if (this.f21451p < 0) {
            q.c("DefaultDrmSession", "Session reference count less than zero: " + this.f21451p);
            this.f21451p = 0;
        }
        if (aVar != null) {
            this.f21444i.a(aVar);
        }
        int i10 = this.f21451p + 1;
        this.f21451p = i10;
        if (i10 == 1) {
            s7.a.g(this.f21450o == 2);
            HandlerThread handlerThread = new HandlerThread("ExoPlayer:DrmRequestHandler");
            this.f21452q = handlerThread;
            handlerThread.start();
            this.f21453r = new c(this.f21452q.getLooper());
            if (x()) {
                j(true);
            }
        } else if (aVar != null && m() && this.f21444i.count(aVar) == 1) {
            aVar.k(this.f21450o);
        }
        this.f21439d.b(this, this.f21451p);
    }

    @Override // com.google.android.exoplayer2.drm.DrmSession
    @Nullable
    public final g6.b getCryptoConfig() {
        return this.f21454s;
    }

    @Override // com.google.android.exoplayer2.drm.DrmSession
    @Nullable
    public final DrmSession.DrmSessionException getError() {
        if (this.f21450o == 1) {
            return this.f21455t;
        }
        return null;
    }

    @Override // com.google.android.exoplayer2.drm.DrmSession
    public final UUID getSchemeUuid() {
        return this.f21448m;
    }

    @Override // com.google.android.exoplayer2.drm.DrmSession
    public final int getState() {
        return this.f21450o;
    }

    public final void i(s7.h<b.a> hVar) {
        Iterator<b.a> it = this.f21444i.elementSet().iterator();
        while (it.hasNext()) {
            hVar.accept(it.next());
        }
    }

    public final void j(boolean z10) {
        if (this.f21442g) {
            return;
        }
        byte[] bArr = (byte[]) m0.j(this.f21456u);
        int i10 = this.f21440e;
        if (i10 != 0 && i10 != 1) {
            if (i10 == 2) {
                if (this.f21457v == null || A()) {
                    y(bArr, 2, z10);
                    return;
                }
                return;
            }
            if (i10 != 3) {
                return;
            }
            s7.a.e(this.f21457v);
            s7.a.e(this.f21456u);
            y(this.f21457v, 3, z10);
            return;
        }
        if (this.f21457v == null) {
            y(bArr, 1, z10);
            return;
        }
        if (this.f21450o == 4 || A()) {
            long jK = k();
            if (this.f21440e != 0 || jK > 60) {
                if (jK <= 0) {
                    p(new KeysExpiredException(), 2);
                    return;
                } else {
                    this.f21450o = 4;
                    i(new s7.h() { // from class: h6.f
                        @Override // s7.h
                        public final void accept(Object obj) {
                            ((b.a) obj).j();
                        }
                    });
                    return;
                }
            }
            q.b("DefaultDrmSession", "Offline license has expired or will expire soon. Remaining seconds: " + jK);
            y(bArr, 2, z10);
        }
    }

    public final long k() {
        if (!d6.c.f59584d.equals(this.f21448m)) {
            return Long.MAX_VALUE;
        }
        Pair pair = (Pair) s7.a.e(u.b(this));
        return Math.min(((Long) pair.first).longValue(), ((Long) pair.second).longValue());
    }

    public boolean l(byte[] bArr) {
        return Arrays.equals(this.f21456u, bArr);
    }

    public final boolean m() {
        int i10 = this.f21450o;
        return i10 == 3 || i10 == 4;
    }

    public final void p(final Exception exc, int i10) {
        this.f21455t = new DrmSession.DrmSessionException(exc, com.google.android.exoplayer2.drm.d.a(exc, i10));
        q.d("DefaultDrmSession", "DRM session error", exc);
        i(new s7.h() { // from class: h6.e
            @Override // s7.h
            public final void accept(Object obj) {
                ((b.a) obj).l(exc);
            }
        });
        if (this.f21450o != 4) {
            this.f21450o = 1;
        }
    }

    @Override // com.google.android.exoplayer2.drm.DrmSession
    public boolean playClearSamplesWithoutKeys() {
        return this.f21441f;
    }

    public final void q(Object obj, Object obj2) {
        if (obj == this.f21458w && m()) {
            this.f21458w = null;
            if (obj2 instanceof Exception) {
                r((Exception) obj2, false);
                return;
            }
            try {
                byte[] bArr = (byte[]) obj2;
                if (this.f21440e == 3) {
                    this.f21437b.provideKeyResponse((byte[]) m0.j(this.f21457v), bArr);
                    i(new s7.h() { // from class: h6.b
                        @Override // s7.h
                        public final void accept(Object obj3) {
                            ((b.a) obj3).i();
                        }
                    });
                    return;
                }
                byte[] bArrProvideKeyResponse = this.f21437b.provideKeyResponse(this.f21456u, bArr);
                int i10 = this.f21440e;
                if ((i10 == 2 || (i10 == 0 && this.f21457v != null)) && bArrProvideKeyResponse != null && bArrProvideKeyResponse.length != 0) {
                    this.f21457v = bArrProvideKeyResponse;
                }
                this.f21450o = 4;
                i(new s7.h() { // from class: h6.c
                    @Override // s7.h
                    public final void accept(Object obj3) {
                        ((b.a) obj3).h();
                    }
                });
            } catch (Exception e10) {
                r(e10, true);
            }
        }
    }

    @Override // com.google.android.exoplayer2.drm.DrmSession
    @Nullable
    public Map<String, String> queryKeyStatus() {
        byte[] bArr = this.f21456u;
        if (bArr == null) {
            return null;
        }
        return this.f21437b.queryKeyStatus(bArr);
    }

    public final void r(Exception exc, boolean z10) {
        if (exc instanceof NotProvisionedException) {
            this.f21438c.a(this);
        } else {
            p(exc, z10 ? 1 : 2);
        }
    }

    @Override // com.google.android.exoplayer2.drm.DrmSession
    public boolean requiresSecureDecoder(String str) {
        return this.f21437b.requiresSecureDecoder((byte[]) s7.a.i(this.f21456u), str);
    }

    public final void s() {
        if (this.f21440e == 0 && this.f21450o == 4) {
            m0.j(this.f21456u);
            j(false);
        }
    }

    public void t(int i10) {
        if (i10 != 2) {
            return;
        }
        s();
    }

    public void u() {
        if (x()) {
            j(true);
        }
    }

    public void v(Exception exc, boolean z10) {
        p(exc, z10 ? 1 : 3);
    }

    public final void w(Object obj, Object obj2) {
        if (obj == this.f21459x) {
            if (this.f21450o == 2 || m()) {
                this.f21459x = null;
                if (obj2 instanceof Exception) {
                    this.f21438c.onProvisionError((Exception) obj2, false);
                    return;
                }
                try {
                    this.f21437b.provideProvisionResponse((byte[]) obj2);
                    this.f21438c.onProvisionCompleted();
                } catch (Exception e10) {
                    this.f21438c.onProvisionError(e10, true);
                }
            }
        }
    }

    public final boolean x() {
        if (m()) {
            return true;
        }
        try {
            byte[] bArrOpenSession = this.f21437b.openSession();
            this.f21456u = bArrOpenSession;
            this.f21437b.b(bArrOpenSession, this.f21446k);
            this.f21454s = this.f21437b.createCryptoConfig(this.f21456u);
            final int i10 = 3;
            this.f21450o = 3;
            i(new s7.h() { // from class: h6.d
                @Override // s7.h
                public final void accept(Object obj) {
                    ((b.a) obj).k(i10);
                }
            });
            s7.a.e(this.f21456u);
            return true;
        } catch (NotProvisionedException unused) {
            this.f21438c.a(this);
            return false;
        } catch (Exception e10) {
            p(e10, 1);
            return false;
        }
    }

    public final void y(byte[] bArr, int i10, boolean z10) {
        try {
            this.f21458w = this.f21437b.getKeyRequest(bArr, this.f21436a, i10, this.f21443h);
            ((c) m0.j(this.f21453r)).b(1, s7.a.e(this.f21458w), z10);
        } catch (Exception e10) {
            r(e10, true);
        }
    }

    public void z() {
        this.f21459x = this.f21437b.getProvisionRequest();
        ((c) m0.j(this.f21453r)).b(0, s7.a.e(this.f21459x), true);
    }
}
