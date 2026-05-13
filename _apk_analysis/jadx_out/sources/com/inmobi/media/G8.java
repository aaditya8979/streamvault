package com.inmobi.media;

import android.os.SystemClock;
import android.view.View;
import java.util.ArrayList;
import java.util.Iterator;

/* JADX INFO: loaded from: classes7.dex */
public final class G8 implements Pn {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ J8 f25517a;

    public G8(J8 j82) {
        this.f25517a = j82;
    }

    @Override // com.inmobi.media.Pn
    public final void a(ArrayList arrayList, ArrayList arrayList2) {
        tn.p.k(arrayList, "visibleViews");
        tn.p.k(arrayList2, "invisibleViews");
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            View view = (View) it.next();
            H8 h82 = (H8) this.f25517a.f25700a.get(view);
            if (h82 == null) {
                this.f25517a.a(view);
            } else {
                H8 h83 = (H8) this.f25517a.f25701b.get(view);
                if (!tn.p.f(h82.f25584a, h83 != null ? h83.f25584a : null)) {
                    h82.f25587d = SystemClock.uptimeMillis();
                    this.f25517a.f25701b.put(view, h82);
                }
            }
        }
        Iterator it2 = arrayList2.iterator();
        while (it2.hasNext()) {
            this.f25517a.f25701b.remove((View) it2.next());
        }
        J8 j82 = this.f25517a;
        if (j82.f25704e.hasMessages(0)) {
            return;
        }
        j82.f25704e.postDelayed(j82.f25705f, j82.f25706g);
    }
}
