package com.inmobi.media;

import android.view.View;
import android.view.ViewGroup;
import java.util.List;
import kotlin.Pair;
import org.json.JSONArray;

/* JADX INFO: loaded from: classes9.dex */
public abstract class Wc {
    public static final List a(Sg sg2) {
        tn.p.k(sg2, "<this>");
        return cn.w.p(bn.h.a(sg2.f26320b, (short) 0), bn.h.a(sg2.f26319a.getTitleView$media_release(), (short) 3), bn.h.a(sg2.f26319a.getDescriptionView$media_release(), (short) 4), bn.h.a(sg2.f26319a.getIconView$media_release(), (short) 5), bn.h.a(sg2.f26319a.getCtaView$media_release(), (short) 6), bn.h.a(sg2.f26321c, (short) 7), bn.h.a(sg2.f26319a.getRatingView$media_release(), (short) 8), bn.h.a(sg2.f26319a.getAdvertiserView$media_release(), (short) 9));
    }

    public static final void a(Sg sg2, InterfaceC3580m9 interfaceC3580m9) {
        tn.p.k(sg2, "<this>");
        tn.p.k("NativeRenderedState", "tag");
        if (interfaceC3580m9 == null) {
            return;
        }
        List<Pair> listA = a(sg2);
        ViewGroup parentView$media_release = sg2.f26319a.getParentView$media_release();
        JSONArray jSONArray = new JSONArray();
        for (Pair pair : listA) {
            View view = (View) pair.component1();
            short sShortValue = ((Number) pair.component2()).shortValue();
            if (view != null) {
                boolean z10 = view.getVisibility() == 0;
                jSONArray.put(((int) sShortValue) + " - " + z10 + com.ironsource.Z7.f30794r + AbstractC3818vn.a(view, parentView$media_release));
            }
        }
        String string = jSONArray.toString();
        tn.p.j(string, "toString(...)");
        ((C3605n9) interfaceC3580m9).a("NativeRenderedState", string);
    }
}
