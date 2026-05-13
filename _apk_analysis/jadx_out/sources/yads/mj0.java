package yads;

import android.content.Context;
import android.os.Handler;
import android.os.HandlerThread;
import android.os.Message;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.CopyOnWriteArraySet;
import kotlin.reflect.KProperty;
import yads.qp2;

/* JADX INFO: loaded from: classes3.dex */
public final class mj0 {

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public static final mp2 f92367h = new mp2(1);

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final jj0 f92368a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final CopyOnWriteArraySet f92369b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public int f92370c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public boolean f92371d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public int f92372e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public boolean f92373f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public List f92374g;

    public mj0(Context context, rc0 rc0Var, sc0 sc0Var) {
        context.getApplicationContext();
        this.f92371d = true;
        this.f92374g = Collections.emptyList();
        this.f92369b = new CopyOnWriteArraySet();
        Handler handlerB = ib3.b(new Handler.Callback() { // from class: bt.j6
            @Override // android.os.Handler.Callback
            public final boolean handleMessage(Message message) {
                return this.f6101b.a(message);
            }
        });
        HandlerThread handlerThread = new HandlerThread("ExoPlayer:DownloadManager");
        handlerThread.start();
        jj0 jj0Var = new jj0(handlerThread, rc0Var, sc0Var, handlerB, this.f92371d);
        this.f92368a = jj0Var;
        int iC = new qp2(context, new op2() { // from class: bt.k6
            @Override // yads.op2
            public final void a(qp2 qp2Var, int i10) {
                this.f6118a.a(qp2Var, i10);
            }
        }).c();
        this.f92372e = iC;
        this.f92370c = 1;
        jj0Var.obtainMessage(0, iC, 0).sendToTarget();
    }

    public final void a(qp2 qp2Var, int i10) {
        mp2 mp2Var = qp2Var.f94105c;
        if (this.f92372e != i10) {
            this.f92372e = i10;
            this.f92370c++;
            this.f92368a.obtainMessage(2, i10, 0).sendToTarget();
        }
        boolean zA = a();
        Iterator it = this.f92369b.iterator();
        while (it.hasNext()) {
            ((kj0) it.next()).getClass();
        }
        if (zA) {
            Iterator it2 = this.f92369b.iterator();
            while (it2.hasNext()) {
                ((kj0) it2.next()).getClass();
            }
        }
    }

    public final boolean a() {
        boolean z10;
        if (this.f92371d || this.f92372e == 0) {
            z10 = false;
        } else {
            for (int i10 = 0; i10 < this.f92374g.size(); i10++) {
                if (((gj0) this.f92374g.get(i10)).f89998b == 0) {
                    z10 = true;
                    break;
                }
            }
            z10 = false;
        }
        boolean z11 = this.f92373f != z10;
        this.f92373f = z10;
        return z11;
    }

    public final boolean a(Message message) {
        int i10 = message.what;
        if (i10 == 0) {
            this.f92374g = Collections.unmodifiableList((List) message.obj);
            boolean zA = a();
            Iterator it = this.f92369b.iterator();
            while (it.hasNext()) {
                ((kj0) it.next()).getClass();
            }
            if (zA) {
                Iterator it2 = this.f92369b.iterator();
                while (it2.hasNext()) {
                    ((kj0) it2.next()).getClass();
                }
            }
        } else if (i10 == 1) {
            int i11 = message.arg1;
            int i12 = message.arg2;
            int i13 = this.f92370c - i11;
            this.f92370c = i13;
            if (i12 == 0 && i13 == 0) {
                Iterator it3 = this.f92369b.iterator();
                while (it3.hasNext()) {
                    ((kj0) it3.next()).getClass();
                }
            }
        } else {
            if (i10 != 2) {
                throw new IllegalStateException();
            }
            ij0 ij0Var = (ij0) message.obj;
            this.f92374g = Collections.unmodifiableList(ij0Var.f90858c);
            gj0 gj0Var = ij0Var.f90856a;
            boolean zA2 = a();
            if (ij0Var.f90857b) {
                Iterator it4 = this.f92369b.iterator();
                while (it4.hasNext()) {
                    ((kj0) it4.next()).getClass();
                }
            } else {
                Iterator it5 = this.f92369b.iterator();
                while (it5.hasNext()) {
                    rn3 rn3Var = (rn3) ((kj0) it5.next());
                    rn3Var.getClass();
                    if (tn.p.f(gj0Var.f89997a.f93603b, rn3Var.f94533a)) {
                        if (rn3.f94530d.contains(Integer.valueOf(gj0Var.f89998b))) {
                            lm2 lm2Var = rn3Var.f94534b;
                            KProperty kProperty = rn3.f94529c[0];
                            zg3 zg3Var = (zg3) lm2Var.f92035a.get();
                            if (zg3Var != null) {
                                zg3Var.a();
                            }
                        }
                        if (rn3.f94531e.contains(Integer.valueOf(gj0Var.f89998b))) {
                            lm2 lm2Var2 = rn3Var.f94534b;
                            KProperty kProperty2 = rn3.f94529c[0];
                            zg3 zg3Var2 = (zg3) lm2Var2.f92035a.get();
                            if (zg3Var2 != null) {
                                zg3Var2.c();
                            }
                        }
                        if (rn3.f94532f.contains(Integer.valueOf(gj0Var.f89998b))) {
                            this.f92369b.remove(rn3Var);
                        }
                    }
                }
            }
            if (zA2) {
                Iterator it6 = this.f92369b.iterator();
                while (it6.hasNext()) {
                    ((kj0) it6.next()).getClass();
                }
            }
        }
        return true;
    }
}
