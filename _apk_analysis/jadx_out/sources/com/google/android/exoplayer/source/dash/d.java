package com.google.android.exoplayer.source.dash;

import a6.k0;
import a6.t;
import android.os.Handler;
import android.os.Message;
import androidx.annotation.Nullable;
import androidx.exifinterface.media.ExifInterface;
import com.google.android.exoplayer.Format;
import com.google.android.exoplayer.ParserException;
import com.google.android.exoplayer.metadata.emsg.EventMessage;
import e4.f0;
import e5.h0;
import java.io.IOException;
import java.util.Iterator;
import java.util.Map;
import java.util.TreeMap;
import k4.h;
import k4.u;

/* JADX INFO: compiled from: PlayerEmsgHandler.java */
/* JADX INFO: loaded from: classes3.dex */
public final class d implements Handler.Callback {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final y5.b f20494b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final b f20495c;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public i5.b f20499g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public long f20500h;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public boolean f20503k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public boolean f20504l;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final TreeMap<Long, Long> f20498f = new TreeMap<>();

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final Handler f20497e = k0.v(this);

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final x4.a f20496d = new x4.a();

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public long f20501i = -9223372036854775807L;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public long f20502j = -9223372036854775807L;

    /* JADX INFO: compiled from: PlayerEmsgHandler.java */
    public static final class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final long f20505a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final long f20506b;

        public a(long j10, long j11) {
            this.f20505a = j10;
            this.f20506b = j11;
        }
    }

    /* JADX INFO: compiled from: PlayerEmsgHandler.java */
    public interface b {
        void onDashManifestPublishTimeExpired(long j10);

        void onDashManifestRefreshRequested();
    }

    /* JADX INFO: compiled from: PlayerEmsgHandler.java */
    public final class c implements u {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final h0 f20507a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final f0 f20508b = new f0();

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final w4.c f20509c = new w4.c();

        public c(y5.b bVar) {
            this.f20507a = new h0(bVar, d.this.f20497e.getLooper(), com.google.android.exoplayer.drm.a.a());
        }

        @Override // k4.u
        public void a(t tVar, int i10) {
            this.f20507a.a(tVar, i10);
        }

        @Override // k4.u
        public int b(h hVar, int i10, boolean z10) throws InterruptedException, IOException {
            return this.f20507a.b(hVar, i10, z10);
        }

        @Override // k4.u
        public void c(long j10, int i10, int i11, int i12, @Nullable u.a aVar) {
            this.f20507a.c(j10, i10, i11, i12, aVar);
            j();
        }

        @Override // k4.u
        public void d(Format format) {
            this.f20507a.d(format);
        }

        @Nullable
        public final w4.c e() {
            this.f20509c.clear();
            if (this.f20507a.K(this.f20508b, this.f20509c, false, false, 0L) != -4) {
                return null;
            }
            this.f20509c.c();
            return this.f20509c;
        }

        public boolean f(long j10) {
            return d.this.i(j10);
        }

        public boolean g(g5.d dVar) {
            return d.this.j(dVar);
        }

        public void h(g5.d dVar) {
            d.this.m(dVar);
        }

        public final void i(long j10, long j11) {
            d.this.f20497e.sendMessage(d.this.f20497e.obtainMessage(1, new a(j10, j11)));
        }

        public final void j() {
            while (this.f20507a.E(false)) {
                w4.c cVarE = e();
                if (cVarE != null) {
                    long j10 = cVarE.f63713e;
                    EventMessage eventMessage = (EventMessage) d.this.f20496d.a(cVarE).d(0);
                    if (d.g(eventMessage.f20231b, eventMessage.f20232c)) {
                        k(j10, eventMessage);
                    }
                }
            }
            this.f20507a.o();
        }

        public final void k(long j10, EventMessage eventMessage) {
            long jE = d.e(eventMessage);
            if (jE == -9223372036854775807L) {
                return;
            }
            i(j10, jE);
        }

        public void l() {
            this.f20507a.M();
        }
    }

    public d(i5.b bVar, b bVar2, y5.b bVar3) {
        this.f20499g = bVar;
        this.f20495c = bVar2;
        this.f20494b = bVar3;
    }

    public static long e(EventMessage eventMessage) {
        try {
            return k0.s0(k0.z(eventMessage.f20235f));
        } catch (ParserException unused) {
            return -9223372036854775807L;
        }
    }

    public static boolean g(String str, String str2) {
        return "urn:mpeg:dash:event:2012".equals(str) && ("1".equals(str2) || "2".equals(str2) || ExifInterface.GPS_MEASUREMENT_3D.equals(str2));
    }

    @Nullable
    public final Map.Entry<Long, Long> d(long j10) {
        return this.f20498f.ceilingEntry(Long.valueOf(j10));
    }

    public final void f(long j10, long j11) {
        Long l10 = this.f20498f.get(Long.valueOf(j11));
        if (l10 == null) {
            this.f20498f.put(Long.valueOf(j11), Long.valueOf(j10));
        } else if (l10.longValue() > j10) {
            this.f20498f.put(Long.valueOf(j11), Long.valueOf(j10));
        }
    }

    public final void h() {
        long j10 = this.f20502j;
        if (j10 == -9223372036854775807L || j10 != this.f20501i) {
            this.f20503k = true;
            this.f20502j = this.f20501i;
            this.f20495c.onDashManifestRefreshRequested();
        }
    }

    @Override // android.os.Handler.Callback
    public boolean handleMessage(Message message) {
        if (this.f20504l) {
            return true;
        }
        if (message.what != 1) {
            return false;
        }
        a aVar = (a) message.obj;
        f(aVar.f20505a, aVar.f20506b);
        return true;
    }

    public boolean i(long j10) {
        i5.b bVar = this.f20499g;
        boolean z10 = false;
        if (!bVar.f63739d) {
            return false;
        }
        if (this.f20503k) {
            return true;
        }
        Map.Entry<Long, Long> entryD = d(bVar.f63743h);
        if (entryD != null && entryD.getValue().longValue() < j10) {
            this.f20500h = entryD.getKey().longValue();
            l();
            z10 = true;
        }
        if (z10) {
            h();
        }
        return z10;
    }

    public boolean j(g5.d dVar) {
        if (!this.f20499g.f63739d) {
            return false;
        }
        if (this.f20503k) {
            return true;
        }
        long j10 = this.f20501i;
        if (!(j10 != -9223372036854775807L && j10 < dVar.f62015f)) {
            return false;
        }
        h();
        return true;
    }

    public c k() {
        return new c(this.f20494b);
    }

    public final void l() {
        this.f20495c.onDashManifestPublishTimeExpired(this.f20500h);
    }

    public void m(g5.d dVar) {
        long j10 = this.f20501i;
        if (j10 != -9223372036854775807L || dVar.f62016g > j10) {
            this.f20501i = dVar.f62016g;
        }
    }

    public void n() {
        this.f20504l = true;
        this.f20497e.removeCallbacksAndMessages(null);
    }

    public final void o() {
        Iterator<Map.Entry<Long, Long>> it = this.f20498f.entrySet().iterator();
        while (it.hasNext()) {
            if (it.next().getKey().longValue() < this.f20499g.f63743h) {
                it.remove();
            }
        }
    }

    public void p(i5.b bVar) {
        this.f20503k = false;
        this.f20500h = -9223372036854775807L;
        this.f20499g = bVar;
        o();
    }
}
