package yads;

import com.vungle.ads.internal.signals.SignalManager;
import java.util.ArrayList;
import java.util.Iterator;

/* JADX INFO: loaded from: classes3.dex */
public final class ki2 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final long f91603a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final int f91604b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final zp0 f91605c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final aq0 f91606d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final ArrayList f91607e;

    public /* synthetic */ ki2() {
        this(SignalManager.TWENTY_FOUR_HOURS_MILLIS, 5, new zp0(), new aq0());
    }

    public ki2(long j10, int i10, zp0 zp0Var, aq0 aq0Var) {
        this.f91603a = j10;
        this.f91604b = i10;
        this.f91605c = zp0Var;
        this.f91606d = aq0Var;
        this.f91607e = new ArrayList();
    }

    public final synchronized Object a(ny0 ny0Var) {
        Object obj;
        Object next;
        Object obj2;
        a();
        Iterator it = this.f91607e.iterator();
        while (true) {
            obj = null;
            if (!it.hasNext()) {
                next = null;
                break;
            }
            next = it.next();
            if (tn.p.f(((ji2) next).f91233a, ny0Var)) {
                break;
            }
        }
        ji2 ji2Var = (ji2) next;
        if (ji2Var != null && (obj2 = ji2Var.f91234b) != null) {
            this.f91607e.remove(ji2Var);
            obj = obj2;
        }
        return obj;
    }

    public final void a() {
        ArrayList arrayList = this.f91607e;
        zp0 zp0Var = this.f91605c;
        ArrayList arrayList2 = new ArrayList();
        for (Object obj : arrayList) {
            zp0Var.getClass();
            if (System.currentTimeMillis() > ((ji2) ((yp0) obj)).f91235c) {
                arrayList2.add(obj);
            }
        }
        Iterator it = arrayList2.iterator();
        while (it.hasNext()) {
            this.f91607e.remove((ji2) it.next());
        }
    }

    public final synchronized void a(ny0 ny0Var, Object obj) {
        a();
        if (this.f91607e.size() < this.f91604b) {
            ArrayList arrayList = this.f91607e;
            aq0 aq0Var = this.f91606d;
            long j10 = this.f91603a;
            aq0Var.getClass();
            arrayList.add(new ji2(ny0Var, obj, System.currentTimeMillis() + j10));
        }
    }

    public final synchronized boolean b() {
        a();
        return this.f91607e.size() < this.f91604b;
    }
}
