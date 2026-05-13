package yads;

import android.os.SystemClock;
import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.Map;

/* JADX INFO: loaded from: classes2.dex */
public final class w5 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Object f96286a = new Object();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final mc2 f96287b = new mc2();

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final LinkedHashMap f96288c = new LinkedHashMap();

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final ArrayList f96289d = new ArrayList();

    public final void a() {
        synchronized (this.f96286a) {
            this.f96288c.clear();
            this.f96289d.clear();
            bn.r rVar = bn.r.f5635a;
        }
    }

    public final void a(v5 v5Var) {
        a(v5Var, this.f96287b, null);
    }

    public final void a(v5 v5Var, nc2 nc2Var, qc3 qc3Var) {
        Long l10;
        synchronized (this.f96286a) {
            Map map = (Map) this.f96288c.get(v5Var);
            Long lValueOf = (map == null || (l10 = (Long) map.get(qc3Var)) == null) ? null : Long.valueOf(SystemClock.elapsedRealtime() - l10.longValue());
            if (lValueOf != null) {
                this.f96289d.add(new u5(v5Var, nc2Var.a(lValueOf.longValue())));
            }
            Map map2 = (Map) this.f96288c.get(v5Var);
            if (map2 != null) {
            }
            bn.r rVar = bn.r.f5635a;
        }
    }

    public final void a(v5 v5Var, qc3 qc3Var) {
        synchronized (this.f96286a) {
            Map linkedHashMap = (Map) this.f96288c.get(v5Var);
            if (linkedHashMap == null) {
                linkedHashMap = new LinkedHashMap();
            }
            this.f96288c.put(v5Var, linkedHashMap);
            linkedHashMap.put(qc3Var, Long.valueOf(SystemClock.elapsedRealtime()));
            bn.r rVar = bn.r.f5635a;
        }
    }

    public final void b(v5 v5Var) {
        a(v5Var, null);
    }
}
