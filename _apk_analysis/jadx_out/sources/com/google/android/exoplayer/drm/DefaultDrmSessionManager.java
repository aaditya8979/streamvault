package com.google.android.exoplayer.drm;

import a6.g;
import a6.k0;
import android.annotation.SuppressLint;
import android.annotation.TargetApi;
import android.os.Handler;
import android.os.Looper;
import android.os.Message;
import androidx.annotation.Nullable;
import com.google.android.exoplayer.drm.DefaultDrmSession;
import com.google.android.exoplayer.drm.DrmInitData;
import com.google.android.exoplayer.drm.DrmSession;
import com.google.android.exoplayer.drm.c;
import e4.k;
import j4.f;
import j4.i;
import j4.j;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.UUID;
import y5.m;

/* JADX INFO: loaded from: classes8.dex */
@TargetApi(18)
public class DefaultDrmSessionManager<T extends i> implements com.google.android.exoplayer.drm.a<T> {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final UUID f20104b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final c.InterfaceC0285c<T> f20105c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final d f20106d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final HashMap<String, String> f20107e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final g<f> f20108f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final boolean f20109g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final int[] f20110h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final boolean f20111i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final m f20112j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public final List<DefaultDrmSession<T>> f20113k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public final List<DefaultDrmSession<T>> f20114l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public int f20115m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    @Nullable
    public com.google.android.exoplayer.drm.c<T> f20116n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    @Nullable
    public DefaultDrmSession<T> f20117o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    @Nullable
    public DefaultDrmSession<T> f20118p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    @Nullable
    public Looper f20119q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public int f20120r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    @Nullable
    public byte[] f20121s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    @Nullable
    public volatile DefaultDrmSessionManager<T>.c f20122t;

    public static final class MissingSchemeDataException extends Exception {
        public MissingSchemeDataException(UUID uuid) {
            super("Media does not support uuid: " + uuid);
        }
    }

    public class b implements c.b<T> {
        public b() {
        }
    }

    @SuppressLint({"HandlerLeak"})
    public class c extends Handler {
        public c(Looper looper) {
            super(looper);
        }

        @Override // android.os.Handler
        public void handleMessage(Message message) {
            byte[] bArr = (byte[]) message.obj;
            if (bArr == null) {
                return;
            }
            for (DefaultDrmSession defaultDrmSession : DefaultDrmSessionManager.this.f20113k) {
                if (defaultDrmSession.h(bArr)) {
                    defaultDrmSession.o(message.what);
                    return;
                }
            }
        }
    }

    public static List<DrmInitData.SchemeData> l(DrmInitData drmInitData, UUID uuid, boolean z10) {
        ArrayList arrayList = new ArrayList(drmInitData.f20128e);
        for (int i10 = 0; i10 < drmInitData.f20128e; i10++) {
            DrmInitData.SchemeData schemeDataF = drmInitData.f(i10);
            if ((schemeDataF.f(uuid) || (k.f60169c.equals(uuid) && schemeDataF.f(k.f60168b))) && (schemeDataF.f20133f != null || z10)) {
                arrayList.add(schemeDataF);
            }
        }
        return arrayList;
    }

    @Override // com.google.android.exoplayer.drm.a
    public boolean b(DrmInitData drmInitData) {
        if (this.f20121s != null) {
            return true;
        }
        if (l(drmInitData, this.f20104b, true).isEmpty()) {
            if (drmInitData.f20128e != 1 || !drmInitData.f(0).f(k.f60168b)) {
                return false;
            }
            a6.m.h("DefaultDrmSessionMgr", "DrmInitData only contains common PSSH SchemeData. Assuming support for: " + this.f20104b);
        }
        String str = drmInitData.f20127d;
        if (str == null || "cenc".equals(str)) {
            return true;
        }
        return !("cbc1".equals(str) || "cbcs".equals(str) || "cens".equals(str)) || k0.f3574a >= 25;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r1v0, types: [com.google.android.exoplayer.drm.DefaultDrmSessionManager$a] */
    /* JADX WARN: Type inference failed for: r1v1 */
    /* JADX WARN: Type inference failed for: r1v3, types: [com.google.android.exoplayer.drm.DefaultDrmSession, com.google.android.exoplayer.drm.DrmSession<T extends j4.i>] */
    /* JADX WARN: Type inference failed for: r1v5, types: [com.google.android.exoplayer.drm.DefaultDrmSession<T extends j4.i>] */
    /* JADX WARN: Type inference incomplete: some casts might be missing */
    @Override // com.google.android.exoplayer.drm.a
    public DrmSession<T> c(Looper looper, DrmInitData drmInitData) {
        List<DrmInitData.SchemeData> listL;
        j(looper);
        n(looper);
        DefaultDrmSession<T> defaultDrmSessionK = (DefaultDrmSession<T>) null;
        if (this.f20121s == null) {
            listL = l(drmInitData, this.f20104b, false);
            if (listL.isEmpty()) {
                final MissingSchemeDataException missingSchemeDataException = new MissingSchemeDataException(this.f20104b);
                this.f20108f.b(new g.a() { // from class: j4.h
                    @Override // a6.g.a
                    public final void a(Object obj) {
                        ((f) obj).onDrmSessionManagerError(missingSchemeDataException);
                    }
                });
                return new com.google.android.exoplayer.drm.b(new DrmSession.DrmSessionException(missingSchemeDataException));
            }
        } else {
            listL = null;
        }
        if (this.f20109g) {
            Iterator<DefaultDrmSession<T>> it = this.f20113k.iterator();
            while (true) {
                if (!it.hasNext()) {
                    break;
                }
                DefaultDrmSession<T> next = it.next();
                if (k0.c(next.f20075a, listL)) {
                    defaultDrmSessionK = next;
                    break;
                }
            }
        } else {
            defaultDrmSessionK = this.f20118p;
        }
        if (defaultDrmSessionK == 0) {
            defaultDrmSessionK = k(listL, false);
            if (!this.f20109g) {
                this.f20118p = defaultDrmSessionK;
            }
            this.f20113k.add(defaultDrmSessionK);
        }
        ((DefaultDrmSession) defaultDrmSessionK).acquire();
        return (DrmSession<T>) defaultDrmSessionK;
    }

    @Override // com.google.android.exoplayer.drm.a
    @Nullable
    public DrmSession<T> d(Looper looper, int i10) {
        j(looper);
        com.google.android.exoplayer.drm.c cVar = (com.google.android.exoplayer.drm.c) a6.a.e(this.f20116n);
        if ((j.class.equals(cVar.a()) && j.f72186d) || k0.k0(this.f20110h, i10) == -1 || cVar.a() == null) {
            return null;
        }
        n(looper);
        if (this.f20117o == null) {
            DefaultDrmSession<T> defaultDrmSessionK = k(Collections.emptyList(), true);
            this.f20113k.add(defaultDrmSessionK);
            this.f20117o = defaultDrmSessionK;
        }
        this.f20117o.acquire();
        return this.f20117o;
    }

    @Override // com.google.android.exoplayer.drm.a
    @Nullable
    public Class<T> e(DrmInitData drmInitData) {
        if (b(drmInitData)) {
            return ((com.google.android.exoplayer.drm.c) a6.a.e(this.f20116n)).a();
        }
        return null;
    }

    public final void i(Handler handler, f fVar) {
        this.f20108f.a(handler, fVar);
    }

    public final void j(Looper looper) {
        Looper looper2 = this.f20119q;
        a6.a.f(looper2 == null || looper2 == looper);
        this.f20119q = looper;
    }

    public final DefaultDrmSession<T> k(@Nullable List<DrmInitData.SchemeData> list, boolean z10) {
        a6.a.e(this.f20116n);
        return new DefaultDrmSession<>(this.f20104b, this.f20116n, null, new DefaultDrmSession.b() { // from class: j4.g
            @Override // com.google.android.exoplayer.drm.DefaultDrmSession.b
            public final void a(DefaultDrmSession defaultDrmSession) {
                this.f72184a.o(defaultDrmSession);
            }
        }, list, this.f20120r, this.f20111i | z10, z10, this.f20121s, this.f20107e, this.f20106d, (Looper) a6.a.e(this.f20119q), this.f20108f, this.f20112j);
    }

    public final void n(Looper looper) {
        if (this.f20122t == null) {
            this.f20122t = new c(looper);
        }
    }

    public final void o(DefaultDrmSession<T> defaultDrmSession) {
        this.f20113k.remove(defaultDrmSession);
        if (this.f20117o == defaultDrmSession) {
            this.f20117o = null;
        }
        if (this.f20118p == defaultDrmSession) {
            this.f20118p = null;
        }
        if (this.f20114l.size() > 1 && this.f20114l.get(0) == defaultDrmSession) {
            this.f20114l.get(1).s();
        }
        this.f20114l.remove(defaultDrmSession);
    }

    @Override // com.google.android.exoplayer.drm.a
    public final void prepare() {
        int i10 = this.f20115m;
        this.f20115m = i10 + 1;
        if (i10 == 0) {
            a6.a.f(this.f20116n == null);
            com.google.android.exoplayer.drm.c<T> cVarAcquireExoMediaDrm = this.f20105c.acquireExoMediaDrm(this.f20104b);
            this.f20116n = cVarAcquireExoMediaDrm;
            cVarAcquireExoMediaDrm.b(new b());
        }
    }

    @Override // com.google.android.exoplayer.drm.a
    public final void release() {
        int i10 = this.f20115m - 1;
        this.f20115m = i10;
        if (i10 == 0) {
            ((com.google.android.exoplayer.drm.c) a6.a.e(this.f20116n)).release();
            this.f20116n = null;
        }
    }
}
