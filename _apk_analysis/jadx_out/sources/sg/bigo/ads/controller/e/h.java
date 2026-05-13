package sg.bigo.ads.controller.e;

import android.os.SystemClock;
import androidx.annotation.NonNull;
import org.json.JSONException;
import org.json.JSONObject;
import sg.bigo.ads.api.a.n;
import sg.bigo.ads.common.f.a;

/* JADX INFO: loaded from: classes6.dex */
public final class h implements a.InterfaceC1013a {

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private static final h f83355f = new h();

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private boolean f83362h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private long f83363i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private long f83364j;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public boolean f83356a = false;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public long f83357b = 5000;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private long f83361g = 21600000;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public long f83358c = 0;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public long f83359d = 0;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    @NonNull
    public final a f83360e = new a();

    public class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final long f83365a = System.currentTimeMillis();

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public long f83366b = System.currentTimeMillis();

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public long f83367c = System.currentTimeMillis();

        public a() {
        }

        public final String a(String str) {
            JSONObject jSONObject = new JSONObject();
            try {
                jSONObject.putOpt("start_ts", Long.valueOf(this.f83367c));
                h hVar = h.this;
                jSONObject.putOpt("total_duration", Long.valueOf(hVar.f83358c + hVar.b()));
                h hVar2 = h.this;
                long jB = hVar2.b();
                if (jB > hVar2.f83357b) {
                    hVar2.f83359d = jB;
                } else {
                    jB = hVar2.f83359d;
                }
                jSONObject.putOpt("close_duration", Long.valueOf(jB));
                jSONObject.putOpt("front_total_req_times", Long.valueOf(g.this.f83350c ? r2.f83351a.getAndAdd(1) : r2.f83351a.get()));
                jSONObject.putOpt("back_total_req_times", Long.valueOf(!g.this.f83350c ? r2.f83352b.getAndAdd(1) : r2.f83352b.get()));
                jSONObject.putOpt("close_front_req_times", Long.valueOf(g.this.f83350c ? r8.f83353c.getAndAdd(1) : r8.f83353c.get()));
                jSONObject.putOpt("req_status", Long.valueOf(h.a(h.this)));
            } catch (JSONException unused) {
            }
            return jSONObject.toString();
        }
    }

    private h() {
        sg.bigo.ads.common.f.a.a().f82004d = this;
    }

    public static /* synthetic */ int a(h hVar) {
        return hVar.f83362h ? 1 : 2;
    }

    public static h a() {
        return f83355f;
    }

    @Override // sg.bigo.ads.common.f.a.InterfaceC1013a
    public final void a(long j10, long j11) {
        this.f83362h = true;
        this.f83363i = j10;
        a aVar = this.f83360e;
        aVar.f83366b = j11;
        long j12 = this.f83361g;
        if (j12 > 0) {
            long j13 = this.f83364j;
            if (j13 > 0 && j10 - j13 >= j12) {
                this.f83358c = 0L;
                this.f83359d = 0L;
                aVar.f83367c = System.currentTimeMillis();
                g.a().f83349a.clear();
            }
        }
        a aVar2 = this.f83360e;
        if (aVar2.f83367c == 0) {
            aVar2.f83367c = System.currentTimeMillis();
        }
        g.a().a(true);
    }

    public final void a(n nVar) {
        this.f83356a = nVar.a();
        this.f83357b = nVar.b();
        this.f83361g = nVar.c();
    }

    @Override // sg.bigo.ads.common.f.a.InterfaceC1013a
    public final void a(boolean z10, long j10, long j11, long j12) {
        this.f83362h = false;
        this.f83364j = j11;
        this.f83363i = 0L;
        long j13 = j11 - j10;
        if (j13 > 0 && j13 > this.f83357b) {
            this.f83358c += j13;
            this.f83359d = j13;
            if (this.f83356a) {
                sg.bigo.ads.core.d.b.a(z10 ? 1 : 2, j12, j13);
            }
        }
        g.a().a(false);
    }

    public final long b() {
        long j10 = this.f83363i;
        if (j10 <= 0) {
            return 0L;
        }
        long jElapsedRealtime = SystemClock.elapsedRealtime() - j10;
        if (jElapsedRealtime <= 0 || jElapsedRealtime <= this.f83357b) {
            return 0L;
        }
        return jElapsedRealtime;
    }
}
