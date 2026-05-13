package com.inmobi.media;

import android.os.Handler;
import android.view.View;
import com.inmobi.media.Sn;
import com.mbridge.msdk.MBridgeConstans;
import io.bidmachine.iab.utils.VisibilityTracker;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.Map;
import java.util.WeakHashMap;
import java.util.concurrent.atomic.AtomicBoolean;

/* JADX INFO: loaded from: classes10.dex */
public abstract class Sn {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final WeakHashMap f26328a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Handler f26329b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final byte f26330c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final InterfaceC3580m9 f26331d;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public long f26333f;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public Pn f26335h;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public boolean f26338k;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final ArrayList f26332e = new ArrayList(50);

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final AtomicBoolean f26334g = new AtomicBoolean(true);

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final bn.g f26336i = kotlin.b.b(new sn.a() { // from class: n9.g4
        @Override // sn.a
        public final Object invoke() {
            return Sn.a(this.f75384b);
        }
    });

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final bn.g f26337j = kotlin.b.b(new sn.a() { // from class: n9.h4
        @Override // sn.a
        public final Object invoke() {
            return Sn.b(this.f75398b);
        }
    });

    public Sn(WeakHashMap weakHashMap, Handler handler, byte b10, InterfaceC3580m9 interfaceC3580m9) {
        this.f26328a = weakHashMap;
        this.f26329b = handler;
        this.f26330c = b10;
        this.f26331d = interfaceC3580m9;
    }

    public static final On a(Sn sn2) {
        return new On(sn2, sn2.f26334g);
    }

    public static final Runnable b(final Sn sn2) {
        return new Runnable() { // from class: n9.f4
            @Override // java.lang.Runnable
            public final void run() {
                Sn.c(this.f75364b);
            }
        };
    }

    public static final void c(Sn sn2) {
        sn2.f26329b.post((On) sn2.f26336i.getValue());
    }

    public final void a() {
        InterfaceC3580m9 interfaceC3580m9 = this.f26331d;
        if (interfaceC3580m9 != null) {
            ((C3605n9) interfaceC3580m9).c(VisibilityTracker.TAG, "clear " + this);
        }
        this.f26328a.clear();
        this.f26329b.removeMessages(0);
        this.f26338k = false;
    }

    public final void a(View view) {
        tn.p.k(view, MBridgeConstans.DYNAMIC_VIEW_KEY_VIEW);
        InterfaceC3580m9 interfaceC3580m9 = this.f26331d;
        if (interfaceC3580m9 != null) {
            ((C3605n9) interfaceC3580m9).c(VisibilityTracker.TAG, "removed view from tracker " + this);
        }
        if (((Qn) this.f26328a.remove(view)) != null) {
            this.f26333f--;
            if (this.f26328a.isEmpty()) {
                d();
            }
        }
    }

    public final void a(View view, View view2, View view3, int i10) {
        tn.p.k(view, "rootView");
        tn.p.k(view2, MBridgeConstans.DYNAMIC_VIEW_KEY_VIEW);
        InterfaceC3580m9 interfaceC3580m9 = this.f26331d;
        if (interfaceC3580m9 != null) {
            ((C3605n9) interfaceC3580m9).c(VisibilityTracker.TAG, "add view to tracker - minPercent - " + i10 + "  " + this);
        }
        Qn qn2 = (Qn) this.f26328a.get(view2);
        if (qn2 == null) {
            qn2 = new Qn();
            this.f26328a.put(view2, qn2);
            this.f26333f++;
        }
        qn2.f26212a = i10;
        long j10 = this.f26333f;
        qn2.f26213b = j10;
        qn2.f26214c = view;
        long j11 = 50;
        if (j10 % j11 == 0) {
            long j12 = j10 - j11;
            for (Map.Entry entry : this.f26328a.entrySet()) {
                View view4 = (View) entry.getKey();
                if (((Qn) entry.getValue()).f26213b < j12) {
                    this.f26332e.add(view4);
                }
            }
            Iterator it = this.f26332e.iterator();
            tn.p.j(it, "iterator(...)");
            while (it.hasNext()) {
                a((View) it.next());
            }
            this.f26332e.clear();
        }
        if (this.f26328a.size() == 1) {
            e();
        }
    }

    public final void b() {
        InterfaceC3580m9 interfaceC3580m9 = this.f26331d;
        if (interfaceC3580m9 != null) {
            ((C3605n9) interfaceC3580m9).c(VisibilityTracker.TAG, "destroy " + this);
        }
        a();
        this.f26335h = null;
        this.f26334g.set(true);
    }

    public abstract int c();

    public final void d() {
        InterfaceC3580m9 interfaceC3580m9 = this.f26331d;
        if (interfaceC3580m9 != null) {
            ((C3605n9) interfaceC3580m9).c(VisibilityTracker.TAG, "pause " + this);
        }
        ((On) this.f26336i.getValue()).run();
        this.f26329b.removeCallbacksAndMessages(null);
        this.f26338k = false;
        this.f26334g.set(true);
    }

    public final void e() {
        InterfaceC3580m9 interfaceC3580m9 = this.f26331d;
        if (interfaceC3580m9 != null) {
            ((C3605n9) interfaceC3580m9).c(VisibilityTracker.TAG, "resume " + this);
        }
        this.f26334g.set(false);
        if (this.f26338k || this.f26334g.get()) {
            return;
        }
        this.f26338k = true;
        p000do.i.d(A9.f25148d, null, null, new Rn(this, null), 3, null);
    }
}
