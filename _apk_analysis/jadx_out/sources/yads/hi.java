package yads;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.concurrent.atomic.AtomicBoolean;

/* JADX INFO: loaded from: classes3.dex */
public final class hi {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final wf f90419a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final p000do.l0 f90420b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final ei f90421c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final fi f90422d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final kf f90423e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final y10 f90424f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final mf f90425g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final AtomicBoolean f90426h = new AtomicBoolean(false);

    public hi(wf wfVar, p000do.l0 l0Var, ei eiVar, fi fiVar, kf kfVar, io2 io2Var) {
        this.f90419a = wfVar;
        this.f90420b = l0Var;
        this.f90421c = eiVar;
        this.f90422d = fiVar;
        this.f90423e = kfVar;
        this.f90424f = new y10(io2Var);
        this.f90425g = new mf(wfVar.a());
    }

    public static final void a(hi hiVar, ArrayList arrayList) {
        Long l10;
        hiVar.getClass();
        Iterator it = arrayList.iterator();
        if (it.hasNext()) {
            Long lValueOf = Long.valueOf(((nb2) it.next()).f92800a.f91946a);
            while (it.hasNext()) {
                Long lValueOf2 = Long.valueOf(((nb2) it.next()).f92800a.f91946a);
                if (lValueOf.compareTo(lValueOf2) < 0) {
                    lValueOf = lValueOf2;
                }
            }
            l10 = lValueOf;
        } else {
            l10 = null;
        }
        if (l10 != null) {
            long jLongValue = l10.longValue();
            long jB = ((tg1) hiVar.f90423e.f91585a).b("ExitInfoAnrLastReportedTimestamp");
            kf kfVar = hiVar.f90423e;
            ((tg1) kfVar.f91585a).a("ExitInfoAnrLastReportedTimestamp", Math.max(jB, jLongValue));
        }
    }
}
