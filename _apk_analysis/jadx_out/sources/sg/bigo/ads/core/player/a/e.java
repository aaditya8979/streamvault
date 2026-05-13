package sg.bigo.ads.core.player.a;

import android.os.SystemClock;
import com.ironsource.C3978d4;
import java.util.HashMap;
import java.util.concurrent.atomic.AtomicInteger;
import sg.bigo.ads.common.m;

/* JADX INFO: loaded from: classes3.dex */
final class e {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public volatile c f84260b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public volatile sg.bigo.ads.common.h.a f84261c;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private final String f84265g;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final AtomicInteger f84259a = new AtomicInteger(0);

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public volatile long f84262d = 0;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public volatile long f84263e = SystemClock.elapsedRealtime();

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final AtomicInteger f84264f = new AtomicInteger(0);

    public e(String str) {
        this.f84265g = (String) m.a(str);
    }

    public final synchronized boolean a() {
        c cVar;
        if (this.f84260b == null) {
            String str = this.f84265g;
            HashMap map = new HashMap();
            for (String str2 : str.substring(str.indexOf("?") + 1).split(C3978d4.j.f31381c)) {
                String[] strArrSplit = str2.split("=");
                if (strArrSplit.length == 2) {
                    map.put(strArrSplit[0], strArrSplit[1]);
                }
            }
            this.f84261c = sg.bigo.ads.core.player.b.a().f84289g.a((String) map.get("path"), (String) map.get("name"));
            if (this.f84261c == null) {
                sg.bigo.ads.common.t.a.a(0, "ProxyCache", "downloadInfo = null");
                cVar = null;
            } else {
                cVar = new c(this.f84261c);
            }
        } else {
            cVar = this.f84260b;
        }
        this.f84260b = cVar;
        return this.f84260b != null;
    }

    public final synchronized void b() {
        if (this.f84259a.decrementAndGet() <= 0) {
            c cVar = this.f84260b;
            synchronized (cVar.f84280c) {
                sg.bigo.ads.common.t.a.a(0, 3, "ProxyCache", "Shutdown proxy for ");
                cVar.f84281d = true;
                cVar.f84279b.b();
            }
            this.f84260b = null;
        }
    }
}
