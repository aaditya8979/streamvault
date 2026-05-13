package com.inmobi.media;

import android.view.View;
import com.mbridge.msdk.MBridgeConstans;
import java.util.ArrayList;
import java.util.Iterator;

/* JADX INFO: renamed from: com.inmobi.media.p7, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes11.dex */
public final class C3653p7 implements Pn {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ C3678q7 f27840a;

    public C3653p7(C3678q7 c3678q7) {
        this.f27840a = c3678q7;
    }

    @Override // com.inmobi.media.Pn
    public final void a(ArrayList arrayList, ArrayList arrayList2) {
        tn.p.k(arrayList, "visibleViews");
        tn.p.k(arrayList2, "invisibleViews");
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            View view = (View) it.next();
            Ln ln2 = (Ln) this.f27840a.f27950i.get(view);
            if (ln2 != null) {
                Oh oh2 = (Oh) ln2;
                tn.p.k(view, MBridgeConstans.DYNAMIC_VIEW_KEY_VIEW);
                if (view instanceof GestureDetectorOnGestureListenerC3337ci) {
                    if (oh2.f26093a.hasWindowFocus()) {
                        oh2.f26093a.d(true);
                    } else {
                        oh2.f26093a.d(false);
                    }
                }
            }
        }
        Iterator it2 = arrayList2.iterator();
        while (it2.hasNext()) {
            View view2 = (View) it2.next();
            Ln ln3 = (Ln) this.f27840a.f27950i.get(view2);
            if (ln3 != null) {
                Oh oh3 = (Oh) ln3;
                tn.p.k(view2, MBridgeConstans.DYNAMIC_VIEW_KEY_VIEW);
                if (view2 instanceof GestureDetectorOnGestureListenerC3337ci) {
                    if (oh3.f26093a.hasWindowFocus()) {
                        oh3.f26093a.d(false);
                    } else {
                        oh3.f26093a.d(false);
                    }
                }
            }
        }
    }
}
