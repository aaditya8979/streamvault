package yads;

import android.os.Handler;
import android.os.Looper;
import android.os.Message;
import android.os.SystemClock;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* JADX INFO: loaded from: classes7.dex */
public final class k73 extends Handler {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final c92 f91506a;

    public k73(c92 c92Var, Looper looper) {
        super(looper);
        this.f91506a = c92Var;
    }

    public final void a(c83 c83Var, tw1 tw1Var, rb3 rb3Var) {
        long jElapsedRealtime;
        Long l10 = c83Var.f88394e;
        if (l10 != null) {
            jElapsedRealtime = l10.longValue();
        } else {
            jElapsedRealtime = SystemClock.elapsedRealtime();
            c83Var.f88394e = Long.valueOf(jElapsedRealtime);
        }
        if (SystemClock.elapsedRealtime() - jElapsedRealtime >= c83Var.f88391b) {
            sendMessage(Message.obtain(this, 1, new j73(new WeakReference(tw1Var), c83Var, rb3Var)));
        }
        if (!tw1Var.f95407k) {
            tw1Var.f95407k = true;
            d61 d61Var = tw1Var.f95406j;
            if (d61Var != null) {
                d61Var.c();
            }
        }
        this.f91506a.a(c83Var.f88393d, rb3Var);
    }

    public final void a(f92 f92Var) {
        sendMessage(Message.obtain(this, 2, new WeakReference(f92Var)));
    }

    public final boolean a() {
        return hasMessages(2);
    }

    public final void b() {
        removeMessages(2);
        removeMessages(1);
    }

    @Override // android.os.Handler
    public final void handleMessage(Message message) {
        int i10 = message.what;
        if (i10 == 1) {
            Object obj = message.obj;
            tn.p.i(obj, "null cannot be cast to non-null type com.monetization.ads.base.impression.tracking.handler.TrackHandler.TrackNoticeObject");
            j73 j73Var = (j73) obj;
            tw1 tw1Var = (tw1) j73Var.f91111a.get();
            if (tw1Var != null) {
                boolean z10 = ad1.f87661a;
                c83 c83Var = j73Var.f91112b;
                za.a(tw1Var.f95402f, c83Var.f88390a, k83.f91517h);
                tw1Var.f95409m.remove(c83Var);
                if (!tw1Var.f95408l && tw1Var.f95409m.isEmpty()) {
                    tw1Var.f95408l = true;
                    d61 d61Var = tw1Var.f95406j;
                    if (d61Var != null) {
                        d61Var.g();
                    }
                }
                c92 c92Var = this.f91506a;
                qy2 qy2Var = j73Var.f91112b.f88393d;
                List listG1 = cn.f0.g1(tw1Var.f95409m);
                ArrayList arrayList = new ArrayList(cn.x.x(listG1, 10));
                Iterator it = listG1.iterator();
                while (it.hasNext()) {
                    arrayList.add(((c83) it.next()).f88393d);
                }
                c92Var.a(qy2Var, arrayList, j73Var.f91113c);
                return;
            }
            return;
        }
        if (i10 != 2) {
            return;
        }
        Object obj2 = message.obj;
        tn.p.i(obj2, "null cannot be cast to non-null type java.lang.ref.WeakReference<com.monetization.ads.base.impression.tracking.MrcNoticeTrackingManager?>");
        tw1 tw1Var2 = (tw1) ((WeakReference) obj2).get();
        if (tw1Var2 != null) {
            List<c83> listG12 = cn.f0.g1(tw1Var2.f95409m);
            listG12.size();
            boolean z11 = ad1.f87661a;
            int i11 = Integer.MIN_VALUE;
            for (c83 c83Var2 : listG12) {
                if (c83Var2.f88392c > i11) {
                    tb3 tb3VarB = tw1Var2.b(c83Var2);
                    if (tb3VarB instanceof rb3) {
                        i11 = c83Var2.f88392c;
                        a(c83Var2, tw1Var2, (rb3) tb3VarB);
                    } else if (tb3VarB instanceof qb3) {
                        c83Var2.f88394e = null;
                        this.f91506a.a(c83Var2.f88393d, (qb3) tb3VarB);
                    }
                } else {
                    a(c83Var2, tw1Var2, new rb3(cn.w.m()));
                }
            }
            if (!listG12.isEmpty()) {
                sendMessageDelayed(Message.obtain(this, 2, new WeakReference(tw1Var2)), 200L);
            }
        }
    }
}
