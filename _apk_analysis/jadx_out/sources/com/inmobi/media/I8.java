package com.inmobi.media;

import android.os.SystemClock;
import android.view.View;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.Map;
import java.util.Objects;

/* JADX INFO: loaded from: classes8.dex */
public final class I8 implements Runnable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f25645a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final ArrayList f25646b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final WeakReference f25647c;

    public I8(J8 j82) {
        tn.p.k(j82, "impressionTracker");
        this.f25645a = I8.class.getSimpleName();
        this.f25646b = new ArrayList();
        this.f25647c = new WeakReference(j82);
    }

    @Override // java.lang.Runnable
    public final void run() {
        tn.p.j(this.f25645a, "TAG");
        J8 j82 = (J8) this.f25647c.get();
        if (j82 != null) {
            for (Map.Entry entry : j82.f25701b.entrySet()) {
                View view = (View) entry.getKey();
                H8 h82 = (H8) entry.getValue();
                tn.p.j(this.f25645a, "TAG");
                Objects.toString(h82);
                if (SystemClock.uptimeMillis() - h82.f25587d >= h82.f25586c) {
                    tn.p.j(this.f25645a, "TAG");
                    C3628o7 c3628o7 = j82.f25707h;
                    c3628o7.getClass();
                    if (view instanceof GestureDetectorOnGestureListenerC3337ci) {
                        InterfaceC3580m9 interfaceC3580m9 = c3628o7.f27758a.f27947f;
                        if (interfaceC3580m9 != null) {
                            ((C3605n9) interfaceC3580m9).a("HtmlAdTracker", "fireImpression");
                        }
                        ((GestureDetectorOnGestureListenerC3337ci) view).u();
                    }
                    this.f25646b.add(view);
                }
            }
            Iterator it = this.f25646b.iterator();
            while (it.hasNext()) {
                j82.a((View) it.next());
            }
            this.f25646b.clear();
            if (j82.f25701b.isEmpty() || j82.f25704e.hasMessages(0)) {
                return;
            }
            j82.f25704e.postDelayed(j82.f25705f, j82.f25706g);
        }
    }
}
