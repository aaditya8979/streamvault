package com.inmobi.media;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import org.json.JSONArray;

/* JADX INFO: loaded from: classes9.dex */
public final class Sh implements N {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ GestureDetectorOnGestureListenerC3337ci f26322a;

    public Sh(GestureDetectorOnGestureListenerC3337ci gestureDetectorOnGestureListenerC3337ci) {
        this.f26322a = gestureDetectorOnGestureListenerC3337ci;
    }

    public final void a(E6 e62) {
        tn.p.k(e62, "metrics");
        GestureDetectorOnGestureListenerC3337ci gestureDetectorOnGestureListenerC3337ci = this.f26322a;
        float f10 = e62.f25366a;
        F6 f62 = e62.f25367b;
        Object jSONArray = "null";
        String strA = f62 != null ? G6.a(f62) : "null";
        ArrayList arrayList = e62.f25368c;
        if (arrayList != null) {
            ArrayList arrayList2 = new ArrayList(cn.x.x(arrayList, 10));
            Iterator it = arrayList.iterator();
            while (it.hasNext()) {
                arrayList2.add(G6.a((F6) it.next()));
            }
            jSONArray = new JSONArray((Collection) arrayList2);
        }
        gestureDetectorOnGestureListenerC3337ci.g("window.mraidview.broadcastEvent('exposureChange', " + f10 + ", " + strA + ", " + jSONArray + ");");
    }
}
