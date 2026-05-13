package yads;

import android.view.View;
import java.util.LinkedHashMap;

/* JADX INFO: loaded from: classes11.dex */
public final class of3 implements Runnable {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ pf3 f93211b;

    public of3(pf3 pf3Var) {
        this.f93211b = pf3Var;
    }

    @Override // java.lang.Runnable
    public final void run() {
        pf3 pf3Var = this.f93211b;
        if (!pf3Var.f93585d) {
            if (pf3Var.f93582a.f91224a.contains(hg3.f90403d)) {
                yf3 yf3Var = (yf3) this.f93211b.f93583b;
                bg3 bg3Var = yf3Var.f97124f;
                ii3 ii3Var = yf3Var.f97125g;
                ii3Var.getClass();
                LinkedHashMap linkedHashMap = new LinkedHashMap();
                if (!tn.y.m(linkedHashMap)) {
                    linkedHashMap = null;
                }
                if (linkedHashMap == null) {
                    linkedHashMap = new LinkedHashMap();
                }
                View view = ii3Var.f90850b.getView();
                Integer numValueOf = view != null ? Integer.valueOf(view.getHeight()) : null;
                Integer numValueOf2 = view != null ? Integer.valueOf(view.getWidth()) : null;
                kl1 kl1Var = ii3Var.f90849a.f91196c;
                if (numValueOf == null || numValueOf.intValue() <= 0) {
                    numValueOf = null;
                }
                if (numValueOf == null) {
                    linkedHashMap.put("view_container_height", "undefined");
                } else {
                    linkedHashMap.put("view_container_height", numValueOf);
                }
                if (numValueOf2 == null || numValueOf2.intValue() <= 0) {
                    numValueOf2 = null;
                }
                if (numValueOf2 == null) {
                    linkedHashMap.put("view_container_width", "undefined");
                } else {
                    linkedHashMap.put("view_container_width", numValueOf2);
                }
                int i10 = kl1Var.f91644g;
                Integer numValueOf3 = i10 > 0 ? Integer.valueOf(i10) : null;
                if (numValueOf3 == null) {
                    linkedHashMap.put("video_height", "undefined");
                } else {
                    linkedHashMap.put("video_height", numValueOf3);
                }
                int i11 = kl1Var.f91645h;
                Integer numValueOf4 = i11 > 0 ? Integer.valueOf(i11) : null;
                if (numValueOf4 == null) {
                    linkedHashMap.put("video_width", "undefined");
                } else {
                    linkedHashMap.put("video_width", numValueOf4);
                }
                String str = kl1Var.f91642e;
                if (str == null) {
                    linkedHashMap.put("video_codec", "undefined");
                } else {
                    linkedHashMap.put("video_codec", str);
                }
                String str2 = kl1Var.f91641d;
                if (str2 == null) {
                    linkedHashMap.put("video_mime_type", "undefined");
                } else {
                    linkedHashMap.put("video_mime_type", str2);
                }
                Float f10 = kl1Var.f91643f;
                if (f10 == null) {
                    linkedHashMap.put("video_vmaf", "undefined");
                } else {
                    linkedHashMap.put("video_vmaf", f10);
                }
                bg3Var.f88001f = cn.p0.g(bn.h.a("video_playback_info", linkedHashMap));
                yf3Var.f97119a.a(v5.f95942u);
                if (!yf3Var.f97126h) {
                    yf3Var.f97126h = true;
                    bg3 bg3Var2 = yf3Var.f97124f;
                    bg3Var2.getClass();
                    bg3Var2.a(kotlin.collections.a.o(bn.h.a("status", "success"), bn.h.a("durations", bg3Var2.f87998c.a())));
                }
                pf3 pf3Var2 = this.f93211b;
                pf3Var2.f93585d = true;
                pf3Var2.f93584c.removeCallbacksAndMessages(null);
                pf3Var2.f93586e = false;
                return;
            }
        }
        this.f93211b.f93584c.postDelayed(this, 200L);
    }
}
