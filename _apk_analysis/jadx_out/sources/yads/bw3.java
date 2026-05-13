package yads;

import android.view.View;
import android.webkit.WebView;
import java.util.Collections;
import java.util.Iterator;

/* JADX INFO: loaded from: classes2.dex */
public final class bw3 extends rw3 {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final bw3 f88180d = new bw3();

    /* JADX WARN: Multi-variable type inference failed */
    @Override // yads.rw3
    public final void a(boolean z10) {
        Iterator it = Collections.unmodifiableCollection(nw3.f93027c.f93028a).iterator();
        while (it.hasNext()) {
            ka kaVar = ((wv3) it.next()).f96536e;
            if (kaVar.f91524b.get() != 0) {
                ix3.f91031a.a((WebView) kaVar.f91524b.get(), "setState", z10 ? "foregrounded" : "backgrounded", kaVar.f91523a);
            }
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // yads.rw3
    public final boolean a() {
        Iterator it = Collections.unmodifiableCollection(nw3.f93027c.f93029b).iterator();
        while (it.hasNext()) {
            View view = (View) ((wv3) it.next()).f96535d.get();
            if (view != null && view.hasWindowFocus()) {
                return true;
            }
        }
        return false;
    }
}
