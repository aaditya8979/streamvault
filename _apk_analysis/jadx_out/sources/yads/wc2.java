package yads;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.os.Build;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Objects;
import java.util.WeakHashMap;
import java.util.concurrent.Executor;
import yads.wc2;

/* JADX INFO: loaded from: classes.dex */
public final class wc2 extends BroadcastReceiver {

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public static final uc2 f96340h = new uc2();

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public static volatile wc2 f96341i;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Context f96342a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final dw2 f96343b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final tc2 f96344c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final sc2 f96345d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final WeakHashMap f96346e = new WeakHashMap();

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final Object f96347f = new Object();

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public rc2 f96348g = rc2.f94374d;

    public wc2(Context context, Executor executor, dw2 dw2Var, tc2 tc2Var, sc2 sc2Var) {
        this.f96342a = context;
        this.f96343b = dw2Var;
        this.f96344c = tc2Var;
        this.f96345d = sc2Var;
        executor.execute(new Runnable() { // from class: bt.rb
            @Override // java.lang.Runnable
            public final void run() {
                wc2.a(this.f6267b);
            }
        });
    }

    public static final void a(wc2 wc2Var) {
        rc2 rc2VarA = wc2Var.f96344c.a();
        wc2Var.f96348g = rc2VarA;
        Objects.toString(rc2VarA);
        boolean z10 = ad1.f87661a;
        try {
            wc2Var.f96345d.getClass();
            IntentFilter intentFilter = new IntentFilter();
            intentFilter.addAction("android.intent.action.SCREEN_ON");
            intentFilter.addAction("android.intent.action.SCREEN_OFF");
            intentFilter.addAction("android.intent.action.USER_PRESENT");
            if (Build.VERSION.SDK_INT >= 33) {
                wc2Var.f96342a.registerReceiver(wc2Var, intentFilter, 2);
            } else {
                wc2Var.f96342a.registerReceiver(wc2Var, intentFilter);
            }
        } catch (Exception unused) {
            boolean z11 = ad1.f87661a;
        }
    }

    public final void a(vc2 vc2Var) {
        synchronized (this.f96347f) {
            this.f96346e.put(vc2Var, null);
            bn.r rVar = bn.r.f5635a;
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:13:0x001d A[Catch: all -> 0x0027, TRY_LEAVE, TryCatch #0 {, blocks: (B:6:0x000e, B:8:0x0012, B:10:0x0018, B:13:0x001d), top: B:22:0x000e }] */
    /* JADX WARN: Removed duplicated region for block: B:16:0x0024  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final boolean a() {
        /*
            r4 = this;
            yads.dw2 r0 = r4.f96343b
            android.content.Context r1 = r4.f96342a
            yads.nt2 r0 = r0.a(r1)
            java.lang.Object r1 = r4.f96347f
            monitor-enter(r1)
            r2 = 1
            if (r0 == 0) goto L1d
            boolean r0 = r0.f92950h     // Catch: java.lang.Throwable -> L27
            if (r0 != r2) goto L1d
            yads.rc2 r0 = r4.f96348g     // Catch: java.lang.Throwable -> L27
            yads.rc2 r3 = yads.rc2.f94372b     // Catch: java.lang.Throwable -> L27
            if (r0 == r3) goto L25
            yads.rc2 r3 = yads.rc2.f94374d     // Catch: java.lang.Throwable -> L27
            if (r0 != r3) goto L24
            goto L25
        L1d:
            yads.rc2 r0 = r4.f96348g     // Catch: java.lang.Throwable -> L27
            yads.rc2 r3 = yads.rc2.f94374d     // Catch: java.lang.Throwable -> L27
            if (r0 != r3) goto L24
            goto L25
        L24:
            r2 = 0
        L25:
            monitor-exit(r1)
            return r2
        L27:
            r0 = move-exception
            monitor-exit(r1)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: yads.wc2.a():boolean");
    }

    public final void b(vc2 vc2Var) {
        synchronized (this.f96347f) {
            this.f96346e.remove(vc2Var);
        }
    }

    @Override // android.content.BroadcastReceiver
    public final void onReceive(Context context, Intent intent) {
        rc2 rc2Var;
        HashSet hashSet;
        synchronized (this.f96347f) {
            rc2 rc2Var2 = this.f96348g;
            String action = intent.getAction();
            rc2 rc2Var3 = tn.p.f(action, "android.intent.action.SCREEN_OFF") ? rc2.f94373c : tn.p.f(action, "android.intent.action.USER_PRESENT") ? rc2.f94374d : (this.f96348g == rc2.f94374d || !tn.p.f(action, "android.intent.action.SCREEN_ON")) ? this.f96348g : rc2.f94372b;
            this.f96348g = rc2Var3;
            if (rc2Var2 != rc2Var3) {
                Objects.toString(rc2Var3);
                boolean z10 = ad1.f87661a;
            }
            rc2Var = this.f96348g;
            hashSet = new HashSet(this.f96346e.keySet());
            bn.r rVar = bn.r.f5635a;
        }
        Iterator it = hashSet.iterator();
        while (it.hasNext()) {
            ((vc2) it.next()).a(rc2Var);
        }
    }
}
