package com.inmobi.media;

import org.json.JSONObject;

/* JADX INFO: loaded from: classes9.dex */
public final class Rh {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ GestureDetectorOnGestureListenerC3337ci f26262a;

    public Rh(GestureDetectorOnGestureListenerC3337ci gestureDetectorOnGestureListenerC3337ci) {
        this.f26262a = gestureDetectorOnGestureListenerC3337ci;
    }

    public final void a(JSONObject jSONObject) {
        tn.p.k(jSONObject, "jsonObject");
        InterfaceC3580m9 interfaceC3580m9 = this.f26262a.f26958i;
        if (interfaceC3580m9 != null) {
            String str = GestureDetectorOnGestureListenerC3337ci.f26937g1;
            tn.p.j(str, "access$getTAG$cp(...)");
            ((C3605n9) interfaceC3580m9).a(str, "onCCTLifeCycleEvent");
        }
        this.f26262a.c(jSONObject);
    }
}
