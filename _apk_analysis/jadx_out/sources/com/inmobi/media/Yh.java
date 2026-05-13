package com.inmobi.media;

import androidx.core.app.NotificationCompat;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes10.dex */
public final class Yh implements InterfaceC3309bg {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ GestureDetectorOnGestureListenerC3337ci f26651a;

    public Yh(GestureDetectorOnGestureListenerC3337ci gestureDetectorOnGestureListenerC3337ci) {
        this.f26651a = gestureDetectorOnGestureListenerC3337ci;
    }

    public final void a(String str, int i10, String str2, long j10, int i11) {
        tn.p.k(str, "id");
        tn.p.j(GestureDetectorOnGestureListenerC3337ci.f26937g1, "access$getTAG$cp(...)");
        JSONObject jSONObjectA = Xh.a("code", i10);
        if (str2 != null) {
            jSONObjectA.put(NotificationCompat.CATEGORY_MESSAGE, str2);
        }
        jSONObjectA.put("retryCount", i11);
        String string = jSONObjectA.toString();
        tn.p.j(string, "toString(...)");
        this.f26651a.g("window.imraidview.broadcastEvent('onPingComplete', '" + str + "', " + j10 + ", '" + string + "');");
    }
}
