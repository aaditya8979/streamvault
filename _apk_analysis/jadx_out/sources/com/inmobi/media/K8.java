package com.inmobi.media;

import android.app.Activity;

/* JADX INFO: loaded from: classes8.dex */
public final class K8 implements S5 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ M8 f25802a;

    public K8(M8 m82) {
        this.f25802a = m82;
    }

    public final void a(String str, R5 r52, float f10, boolean z10, long j10, Ya ya2) {
        String adType;
        String creativeId;
        String impressionId;
        Q5 q52;
        tn.p.k(str, "expandInput");
        tn.p.k(r52, "inputType");
        M8 m82 = this.f25802a;
        Activity activity = (Activity) m82.f25937a.get();
        if (activity == null) {
            return;
        }
        if (m82.f25941e == null) {
            Q5 q53 = new Q5(activity);
            InterfaceC3580m9 interfaceC3580m9 = m82.f25944h;
            if (interfaceC3580m9 != null) {
                q53.setLogger(interfaceC3580m9);
            }
            q53.setId(65518);
            q53.setEmbeddedBrowserUpdateListener(m82.f25945i);
            m82.f25941e = q53;
        }
        C c10 = m82.f25938b;
        if ((c10 instanceof GestureDetectorOnGestureListenerC3337ci) && (q52 = m82.f25941e) != null) {
            q52.setUserLeftApplicationListener(((GestureDetectorOnGestureListenerC3337ci) c10).getListener());
        }
        Q5 q54 = m82.f25941e;
        if (q54 != null) {
            C c11 = m82.f25938b;
            if (c11 == null || (adType = ((GestureDetectorOnGestureListenerC3337ci) c11).getAdType()) == null) {
                adType = "banner";
            }
            String str2 = adType;
            C c12 = m82.f25938b;
            String str3 = (c12 == null || (impressionId = ((GestureDetectorOnGestureListenerC3337ci) c12).getImpressionId()) == null) ? "" : impressionId;
            C c13 = m82.f25938b;
            q54.a(str, r52, z10, j10, str2, str3, (c13 == null || (creativeId = ((GestureDetectorOnGestureListenerC3337ci) c13).getCreativeId()) == null) ? "" : creativeId, ya2);
        }
        float f11 = 1 - f10;
        m82.f25943g = f11;
        C3702r7 c3702r7 = m82.f25939c;
        if (c3702r7 != null) {
            c3702r7.f28038c = f11;
            c3702r7.c();
        }
        m82.b();
    }
}
