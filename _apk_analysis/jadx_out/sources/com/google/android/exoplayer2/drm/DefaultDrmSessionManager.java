package com.google.android.exoplayer2.drm;

import android.annotation.SuppressLint;
import android.media.ResourceBusyException;
import android.os.Handler;
import android.os.Looper;
import android.os.Message;
import android.os.SystemClock;
import androidx.annotation.Nullable;
import androidx.annotation.RequiresApi;
import com.google.android.exoplayer2.drm.DefaultDrmSession;
import com.google.android.exoplayer2.drm.DrmInitData;
import com.google.android.exoplayer2.drm.DrmSession;
import com.google.android.exoplayer2.drm.b;
import com.google.android.exoplayer2.drm.c;
import com.google.android.exoplayer2.drm.g;
import com.google.android.exoplayer2.m;
import com.google.common.collect.ImmutableList;
import com.google.common.collect.ImmutableSet;
import com.google.common.collect.Sets;
import com.google.common.collect.r2;
import e6.s1;
import h6.r;
import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Set;
import java.util.UUID;
import s7.m0;
import s7.q;
import s7.u;

/* JADX INFO: loaded from: classes2.dex */
@RequiresApi(18)
public class DefaultDrmSessionManager implements com.google.android.exoplayer2.drm.c {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final UUID f21468c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final g.c f21469d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final j f21470e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final HashMap<String, String> f21471f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final boolean f21472g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final int[] f21473h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final boolean f21474i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final f f21475j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public final com.google.android.exoplayer2.upstream.b f21476k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public final g f21477l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public final long f21478m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public final List<DefaultDrmSession> f21479n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public final Set<e> f21480o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public final Set<DefaultDrmSession> f21481p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public int f21482q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    @Nullable
    public com.google.android.exoplayer2.drm.g f21483r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    @Nullable
    public DefaultDrmSession f21484s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    @Nullable
    public DefaultDrmSession f21485t;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    public Looper f21486u;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public Handler f21487v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public int f21488w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    @Nullable
    public byte[] f21489x;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public s1 f21490y;

    /* JADX INFO: renamed from: z, reason: collision with root package name */
    @Nullable
    public volatile d f21491z;

    public static final class MissingSchemeDataException extends Exception {
        public MissingSchemeDataException(UUID uuid) {
            super("Media does not support uuid: " + uuid);
        }
    }

    public static final class b {

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public boolean f21495d;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        public boolean f21497f;

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final HashMap<String, String> f21492a = new HashMap<>();

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public UUID f21493b = d6.c.f59584d;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public g.c f21494c = h.f21537d;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        public com.google.android.exoplayer2.upstream.b f21498g = new com.google.android.exoplayer2.upstream.a();

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public int[] f21496e = new int[0];

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        public long f21499h = 300000;

        public DefaultDrmSessionManager a(j jVar) {
            return new DefaultDrmSessionManager(this.f21493b, this.f21494c, jVar, this.f21492a, this.f21495d, this.f21496e, this.f21497f, this.f21498g, this.f21499h);
        }

        public b b(boolean z10) {
            this.f21495d = z10;
            return this;
        }

        public b c(boolean z10) {
            this.f21497f = z10;
            return this;
        }

        public b d(int... iArr) {
            for (int i10 : iArr) {
                boolean z10 = true;
                if (i10 != 2 && i10 != 1) {
                    z10 = false;
                }
                s7.a.a(z10);
            }
            this.f21496e = (int[]) iArr.clone();
            return this;
        }

        public b e(UUID uuid, g.c cVar) {
            this.f21493b = (UUID) s7.a.e(uuid);
            this.f21494c = (g.c) s7.a.e(cVar);
            return this;
        }
    }

    public class c implements g.b {
        public c() {
        }

        @Override // com.google.android.exoplayer2.drm.g.b
        public void a(com.google.android.exoplayer2.drm.g gVar, @Nullable byte[] bArr, int i10, int i11, @Nullable byte[] bArr2) {
            ((d) s7.a.e(DefaultDrmSessionManager.this.f21491z)).obtainMessage(i10, bArr).sendToTarget();
        }
    }

    @SuppressLint({"HandlerLeak"})
    public class d extends Handler {
        public d(Looper looper) {
            super(looper);
        }

        @Override // android.os.Handler
        public void handleMessage(Message message) {
            byte[] bArr = (byte[]) message.obj;
            if (bArr == null) {
                return;
            }
            for (DefaultDrmSession defaultDrmSession : DefaultDrmSessionManager.this.f21479n) {
                if (defaultDrmSession.l(bArr)) {
                    defaultDrmSession.t(message.what);
                    return;
                }
            }
        }
    }

    public class e implements c.b {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        @Nullable
        public final b.a f21502b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        @Nullable
        public DrmSession f21503c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public boolean f21504d;

        public e(@Nullable b.a aVar) {
            this.f21502b = aVar;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public /* synthetic */ void e(m mVar) {
            if (DefaultDrmSessionManager.this.f21482q == 0 || this.f21504d) {
                return;
            }
            DefaultDrmSessionManager defaultDrmSessionManager = DefaultDrmSessionManager.this;
            this.f21503c = defaultDrmSessionManager.s((Looper) s7.a.e(defaultDrmSessionManager.f21486u), this.f21502b, mVar, false);
            DefaultDrmSessionManager.this.f21480o.add(this);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public /* synthetic */ void f() {
            if (this.f21504d) {
                return;
            }
            DrmSession drmSession = this.f21503c;
            if (drmSession != null) {
                drmSession.a(this.f21502b);
            }
            DefaultDrmSessionManager.this.f21480o.remove(this);
            this.f21504d = true;
        }

        public void d(final m mVar) {
            ((Handler) s7.a.e(DefaultDrmSessionManager.this.f21487v)).post(new Runnable() { // from class: h6.h
                @Override // java.lang.Runnable
                public final void run() {
                    this.f62988b.e(mVar);
                }
            });
        }

        @Override // com.google.android.exoplayer2.drm.c.b
        public void release() {
            m0.C0((Handler) s7.a.e(DefaultDrmSessionManager.this.f21487v), new Runnable() { // from class: h6.g
                @Override // java.lang.Runnable
                public final void run() {
                    this.f62987b.f();
                }
            });
        }
    }

    public class f implements DefaultDrmSession.a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final Set<DefaultDrmSession> f21506a = new HashSet();

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        @Nullable
        public DefaultDrmSession f21507b;

        public f(DefaultDrmSessionManager defaultDrmSessionManager) {
        }

        @Override // com.google.android.exoplayer2.drm.DefaultDrmSession.a
        public void a(DefaultDrmSession defaultDrmSession) {
            this.f21506a.add(defaultDrmSession);
            if (this.f21507b != null) {
                return;
            }
            this.f21507b = defaultDrmSession;
            defaultDrmSession.z();
        }

        public void b(DefaultDrmSession defaultDrmSession) {
            this.f21506a.remove(defaultDrmSession);
            if (this.f21507b == defaultDrmSession) {
                this.f21507b = null;
                if (this.f21506a.isEmpty()) {
                    return;
                }
                DefaultDrmSession next = this.f21506a.iterator().next();
                this.f21507b = next;
                next.z();
            }
        }

        /* JADX WARN: Multi-variable type inference failed */
        @Override // com.google.android.exoplayer2.drm.DefaultDrmSession.a
        public void onProvisionCompleted() {
            this.f21507b = null;
            ImmutableList immutableListCopyOf = ImmutableList.copyOf((Collection) this.f21506a);
            this.f21506a.clear();
            r2 it = immutableListCopyOf.iterator();
            while (it.hasNext()) {
                ((DefaultDrmSession) it.next()).u();
            }
        }

        /* JADX WARN: Multi-variable type inference failed */
        @Override // com.google.android.exoplayer2.drm.DefaultDrmSession.a
        public void onProvisionError(Exception exc, boolean z10) {
            this.f21507b = null;
            ImmutableList immutableListCopyOf = ImmutableList.copyOf((Collection) this.f21506a);
            this.f21506a.clear();
            r2 it = immutableListCopyOf.iterator();
            while (it.hasNext()) {
                ((DefaultDrmSession) it.next()).v(exc, z10);
            }
        }
    }

    public class g implements DefaultDrmSession.b {
        public g() {
        }

        @Override // com.google.android.exoplayer2.drm.DefaultDrmSession.b
        public void a(final DefaultDrmSession defaultDrmSession, int i10) {
            if (i10 == 1 && DefaultDrmSessionManager.this.f21482q > 0 && DefaultDrmSessionManager.this.f21478m != -9223372036854775807L) {
                DefaultDrmSessionManager.this.f21481p.add(defaultDrmSession);
                ((Handler) s7.a.e(DefaultDrmSessionManager.this.f21487v)).postAtTime(new Runnable() { // from class: h6.i
                    @Override // java.lang.Runnable
                    public final void run() {
                        defaultDrmSession.a(null);
                    }
                }, defaultDrmSession, SystemClock.uptimeMillis() + DefaultDrmSessionManager.this.f21478m);
            } else if (i10 == 0) {
                DefaultDrmSessionManager.this.f21479n.remove(defaultDrmSession);
                if (DefaultDrmSessionManager.this.f21484s == defaultDrmSession) {
                    DefaultDrmSessionManager.this.f21484s = null;
                }
                if (DefaultDrmSessionManager.this.f21485t == defaultDrmSession) {
                    DefaultDrmSessionManager.this.f21485t = null;
                }
                DefaultDrmSessionManager.this.f21475j.b(defaultDrmSession);
                if (DefaultDrmSessionManager.this.f21478m != -9223372036854775807L) {
                    ((Handler) s7.a.e(DefaultDrmSessionManager.this.f21487v)).removeCallbacksAndMessages(defaultDrmSession);
                    DefaultDrmSessionManager.this.f21481p.remove(defaultDrmSession);
                }
            }
            DefaultDrmSessionManager.this.B();
        }

        @Override // com.google.android.exoplayer2.drm.DefaultDrmSession.b
        public void b(DefaultDrmSession defaultDrmSession, int i10) {
            if (DefaultDrmSessionManager.this.f21478m != -9223372036854775807L) {
                DefaultDrmSessionManager.this.f21481p.remove(defaultDrmSession);
                ((Handler) s7.a.e(DefaultDrmSessionManager.this.f21487v)).removeCallbacksAndMessages(defaultDrmSession);
            }
        }
    }

    public DefaultDrmSessionManager(UUID uuid, g.c cVar, j jVar, HashMap<String, String> map, boolean z10, int[] iArr, boolean z11, com.google.android.exoplayer2.upstream.b bVar, long j10) {
        s7.a.e(uuid);
        s7.a.b(!d6.c.f59582b.equals(uuid), "Use C.CLEARKEY_UUID instead");
        this.f21468c = uuid;
        this.f21469d = cVar;
        this.f21470e = jVar;
        this.f21471f = map;
        this.f21472g = z10;
        this.f21473h = iArr;
        this.f21474i = z11;
        this.f21476k = bVar;
        this.f21475j = new f(this);
        this.f21477l = new g();
        this.f21488w = 0;
        this.f21479n = new ArrayList();
        this.f21480o = Sets.h();
        this.f21481p = Sets.h();
        this.f21478m = j10;
    }

    public static boolean t(DrmSession drmSession) {
        return drmSession.getState() == 1 && (m0.f79487a < 19 || (((DrmSession.DrmSessionException) s7.a.e(drmSession.getError())).getCause() instanceof ResourceBusyException));
    }

    public static List<DrmInitData.SchemeData> x(DrmInitData drmInitData, UUID uuid, boolean z10) {
        ArrayList arrayList = new ArrayList(drmInitData.f21512e);
        for (int i10 = 0; i10 < drmInitData.f21512e; i10++) {
            DrmInitData.SchemeData schemeDataD = drmInitData.d(i10);
            if ((schemeDataD.c(uuid) || (d6.c.f59583c.equals(uuid) && schemeDataD.c(d6.c.f59582b))) && (schemeDataD.f21517f != null || z10)) {
                arrayList.add(schemeDataD);
            }
        }
        return arrayList;
    }

    public final void A(Looper looper) {
        if (this.f21491z == null) {
            this.f21491z = new d(looper);
        }
    }

    public final void B() {
        if (this.f21483r != null && this.f21482q == 0 && this.f21479n.isEmpty() && this.f21480o.isEmpty()) {
            ((com.google.android.exoplayer2.drm.g) s7.a.e(this.f21483r)).release();
            this.f21483r = null;
        }
    }

    public final void C() {
        r2 it = ImmutableSet.copyOf((Collection) this.f21481p).iterator();
        while (it.hasNext()) {
            ((DrmSession) it.next()).a(null);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final void D() {
        r2 it = ImmutableSet.copyOf((Collection) this.f21480o).iterator();
        while (it.hasNext()) {
            ((e) it.next()).release();
        }
    }

    public void E(int i10, @Nullable byte[] bArr) {
        s7.a.g(this.f21479n.isEmpty());
        if (i10 == 1 || i10 == 3) {
            s7.a.e(bArr);
        }
        this.f21488w = i10;
        this.f21489x = bArr;
    }

    public final void F(DrmSession drmSession, @Nullable b.a aVar) {
        drmSession.a(aVar);
        if (this.f21478m != -9223372036854775807L) {
            drmSession.a(null);
        }
    }

    @Override // com.google.android.exoplayer2.drm.c
    public void a(Looper looper, s1 s1Var) {
        y(looper);
        this.f21490y = s1Var;
    }

    @Override // com.google.android.exoplayer2.drm.c
    @Nullable
    public DrmSession b(@Nullable b.a aVar, m mVar) {
        s7.a.g(this.f21482q > 0);
        s7.a.i(this.f21486u);
        return s(this.f21486u, aVar, mVar, true);
    }

    @Override // com.google.android.exoplayer2.drm.c
    public c.b c(@Nullable b.a aVar, m mVar) {
        s7.a.g(this.f21482q > 0);
        s7.a.i(this.f21486u);
        e eVar = new e(aVar);
        eVar.d(mVar);
        return eVar;
    }

    @Override // com.google.android.exoplayer2.drm.c
    public int d(m mVar) {
        int cryptoType = ((com.google.android.exoplayer2.drm.g) s7.a.e(this.f21483r)).getCryptoType();
        DrmInitData drmInitData = mVar.f21754p;
        if (drmInitData != null) {
            if (u(drmInitData)) {
                return cryptoType;
            }
            return 1;
        }
        if (m0.t0(this.f21473h, u.i(mVar.f21751m)) != -1) {
            return cryptoType;
        }
        return 0;
    }

    @Override // com.google.android.exoplayer2.drm.c
    public final void prepare() {
        int i10 = this.f21482q;
        this.f21482q = i10 + 1;
        if (i10 != 0) {
            return;
        }
        if (this.f21483r == null) {
            com.google.android.exoplayer2.drm.g gVarAcquireExoMediaDrm = this.f21469d.acquireExoMediaDrm(this.f21468c);
            this.f21483r = gVarAcquireExoMediaDrm;
            gVarAcquireExoMediaDrm.a(new c());
        } else if (this.f21478m != -9223372036854775807L) {
            for (int i11 = 0; i11 < this.f21479n.size(); i11++) {
                this.f21479n.get(i11).c(null);
            }
        }
    }

    @Override // com.google.android.exoplayer2.drm.c
    public final void release() {
        int i10 = this.f21482q - 1;
        this.f21482q = i10;
        if (i10 != 0) {
            return;
        }
        if (this.f21478m != -9223372036854775807L) {
            ArrayList arrayList = new ArrayList(this.f21479n);
            for (int i11 = 0; i11 < arrayList.size(); i11++) {
                ((DefaultDrmSession) arrayList.get(i11)).a(null);
            }
        }
        D();
        B();
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference incomplete: some casts might be missing */
    @Nullable
    public final DrmSession s(Looper looper, @Nullable b.a aVar, m mVar, boolean z10) {
        List<DrmInitData.SchemeData> listX;
        A(looper);
        DrmInitData drmInitData = mVar.f21754p;
        if (drmInitData == null) {
            return z(u.i(mVar.f21751m), z10);
        }
        DefaultDrmSession defaultDrmSessionW = null;
        Object[] objArr = 0;
        if (this.f21489x == null) {
            listX = x((DrmInitData) s7.a.e(drmInitData), this.f21468c, false);
            if (listX.isEmpty()) {
                MissingSchemeDataException missingSchemeDataException = new MissingSchemeDataException(this.f21468c);
                q.d("DefaultDrmSessionMgr", "DRM error", missingSchemeDataException);
                if (aVar != null) {
                    aVar.l(missingSchemeDataException);
                }
                return new com.google.android.exoplayer2.drm.f(new DrmSession.DrmSessionException(missingSchemeDataException, 6003));
            }
        } else {
            listX = null;
        }
        if (this.f21472g) {
            Iterator<DefaultDrmSession> it = this.f21479n.iterator();
            while (true) {
                if (!it.hasNext()) {
                    break;
                }
                DefaultDrmSession next = it.next();
                if (m0.c(next.f21436a, listX)) {
                    defaultDrmSessionW = next;
                    break;
                }
            }
        } else {
            defaultDrmSessionW = this.f21485t;
        }
        if (defaultDrmSessionW == null) {
            defaultDrmSessionW = w(listX, false, aVar, z10);
            if (!this.f21472g) {
                this.f21485t = defaultDrmSessionW;
            }
            this.f21479n.add(defaultDrmSessionW);
        } else {
            defaultDrmSessionW.c(aVar);
        }
        return defaultDrmSessionW;
    }

    public final boolean u(DrmInitData drmInitData) {
        if (this.f21489x != null) {
            return true;
        }
        if (x(drmInitData, this.f21468c, true).isEmpty()) {
            if (drmInitData.f21512e != 1 || !drmInitData.d(0).c(d6.c.f59582b)) {
                return false;
            }
            q.i("DefaultDrmSessionMgr", "DrmInitData only contains common PSSH SchemeData. Assuming support for: " + this.f21468c);
        }
        String str = drmInitData.f21511d;
        if (str == null || "cenc".equals(str)) {
            return true;
        }
        return "cbcs".equals(str) ? m0.f79487a >= 25 : ("cbc1".equals(str) || "cens".equals(str)) ? false : true;
    }

    public final DefaultDrmSession v(@Nullable List<DrmInitData.SchemeData> list, boolean z10, @Nullable b.a aVar) {
        s7.a.e(this.f21483r);
        DefaultDrmSession defaultDrmSession = new DefaultDrmSession(this.f21468c, this.f21483r, this.f21475j, this.f21477l, list, this.f21488w, this.f21474i | z10, z10, this.f21489x, this.f21471f, this.f21470e, (Looper) s7.a.e(this.f21486u), this.f21476k, (s1) s7.a.e(this.f21490y));
        defaultDrmSession.c(aVar);
        if (this.f21478m != -9223372036854775807L) {
            defaultDrmSession.c(null);
        }
        return defaultDrmSession;
    }

    public final DefaultDrmSession w(@Nullable List<DrmInitData.SchemeData> list, boolean z10, @Nullable b.a aVar, boolean z11) {
        DefaultDrmSession defaultDrmSessionV = v(list, z10, aVar);
        if (t(defaultDrmSessionV) && !this.f21481p.isEmpty()) {
            C();
            F(defaultDrmSessionV, aVar);
            defaultDrmSessionV = v(list, z10, aVar);
        }
        if (!t(defaultDrmSessionV) || !z11 || this.f21480o.isEmpty()) {
            return defaultDrmSessionV;
        }
        D();
        if (!this.f21481p.isEmpty()) {
            C();
        }
        F(defaultDrmSessionV, aVar);
        return v(list, z10, aVar);
    }

    public final synchronized void y(Looper looper) {
        Looper looper2 = this.f21486u;
        if (looper2 == null) {
            this.f21486u = looper;
            this.f21487v = new Handler(looper);
        } else {
            s7.a.g(looper2 == looper);
            s7.a.e(this.f21487v);
        }
    }

    @Nullable
    public final DrmSession z(int i10, boolean z10) {
        com.google.android.exoplayer2.drm.g gVar = (com.google.android.exoplayer2.drm.g) s7.a.e(this.f21483r);
        if ((gVar.getCryptoType() == 2 && r.f63005d) || m0.t0(this.f21473h, i10) == -1 || gVar.getCryptoType() == 1) {
            return null;
        }
        DefaultDrmSession defaultDrmSession = this.f21484s;
        if (defaultDrmSession == null) {
            DefaultDrmSession defaultDrmSessionW = w(ImmutableList.of(), true, null, z10);
            this.f21479n.add(defaultDrmSessionW);
            this.f21484s = defaultDrmSessionW;
        } else {
            defaultDrmSession.c(null);
        }
        return this.f21484s;
    }
}
