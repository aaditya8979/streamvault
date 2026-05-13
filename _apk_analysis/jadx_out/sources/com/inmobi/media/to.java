package com.inmobi.media;

import android.view.View;
import android.view.WindowInsets;
import com.inmobi.media.to;
import com.mbridge.msdk.MBridgeConstans;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.Iterator;

/* JADX INFO: loaded from: classes12.dex */
public final class to {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final ArrayList f28212a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final WeakReference f28213b;

    public to(View view) {
        tn.p.k(view, MBridgeConstans.DYNAMIC_VIEW_KEY_VIEW);
        this.f28212a = new ArrayList();
        this.f28213b = new WeakReference(view);
        C3850x5.f28483a.getClass();
        if (C3850x5.u()) {
            view.setOnApplyWindowInsetsListener(new View.OnApplyWindowInsetsListener() { // from class: n9.ma
                @Override // android.view.View.OnApplyWindowInsetsListener
                public final WindowInsets onApplyWindowInsets(View view2, WindowInsets windowInsets) {
                    return to.a(this.f75505a, view2, windowInsets);
                }
            });
        }
    }

    public static final WindowInsets a(to toVar, View view, WindowInsets windowInsets) {
        tn.p.k(view, "<unused var>");
        tn.p.k(windowInsets, "windowInsets");
        if (!toVar.f28212a.isEmpty()) {
            Iterator it = toVar.f28212a.iterator();
            while (it.hasNext()) {
                xo xoVar = (xo) ((so) it.next());
                xoVar.getClass();
                tn.p.k(windowInsets, "windowInsets");
                xoVar.f28544a.a(windowInsets);
                xoVar.a(windowInsets);
            }
        }
        return windowInsets;
    }

    public final void a() {
        View view;
        this.f28212a.clear();
        C3850x5.f28483a.getClass();
        if (!C3850x5.u() || (view = (View) this.f28213b.get()) == null) {
            return;
        }
        view.setOnApplyWindowInsetsListener(null);
    }
}
