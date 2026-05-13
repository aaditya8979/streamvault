package yads;

import android.os.Handler;
import android.os.Message;
import java.util.Map;
import java.util.TreeMap;

/* JADX INFO: loaded from: classes4.dex */
public final class ue2 implements Handler.Callback {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final qe f95625b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final se2 f95626c;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public c30 f95630g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public boolean f95631h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public boolean f95632i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public boolean f95633j;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final TreeMap f95629f = new TreeMap();

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final Handler f95628e = ib3.a((Handler.Callback) this);

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final xm0 f95627d = new xm0();

    public ue2(c30 c30Var, com.monetization.ads.exo.source.dash.c cVar, qe qeVar) {
        this.f95630g = c30Var;
        this.f95626c = cVar;
        this.f95625b = qeVar;
    }

    public final boolean a(long j10) {
        boolean z10;
        c30 c30Var = this.f95630g;
        if (!c30Var.f88309d) {
            return false;
        }
        if (this.f95632i) {
            return true;
        }
        Map.Entry entryCeilingEntry = this.f95629f.ceilingEntry(Long.valueOf(c30Var.f88313h));
        if (entryCeilingEntry == null || ((Long) entryCeilingEntry.getValue()).longValue() >= j10) {
            z10 = false;
        } else {
            long jLongValue = ((Long) entryCeilingEntry.getKey()).longValue();
            com.monetization.ads.exo.source.dash.i iVar = ((com.monetization.ads.exo.source.dash.c) this.f95626c).f51031a;
            long j11 = iVar.N;
            if (j11 == -9223372036854775807L || j11 < jLongValue) {
                iVar.N = jLongValue;
            }
            z10 = true;
        }
        if (z10 && this.f95631h) {
            this.f95632i = true;
            this.f95631h = false;
            com.monetization.ads.exo.source.dash.i iVar2 = ((com.monetization.ads.exo.source.dash.c) this.f95626c).f51031a;
            iVar2.D.removeCallbacks(iVar2.f51051w);
            iVar2.h();
        }
        return z10;
    }

    @Override // android.os.Handler.Callback
    public final boolean handleMessage(Message message) {
        if (this.f95633j) {
            return true;
        }
        if (message.what != 1) {
            return false;
        }
        re2 re2Var = (re2) message.obj;
        long j10 = re2Var.f94427a;
        long j11 = re2Var.f94428b;
        Long l10 = (Long) this.f95629f.get(Long.valueOf(j11));
        if (l10 == null || l10.longValue() > j10) {
            this.f95629f.put(Long.valueOf(j11), Long.valueOf(j10));
        }
        return true;
    }
}
