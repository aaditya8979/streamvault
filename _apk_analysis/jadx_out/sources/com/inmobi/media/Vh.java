package com.inmobi.media;

/* JADX INFO: loaded from: classes9.dex */
public final class Vh implements B {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ GestureDetectorOnGestureListenerC3337ci f26505a;

    public Vh(GestureDetectorOnGestureListenerC3337ci gestureDetectorOnGestureListenerC3337ci) {
        this.f26505a = gestureDetectorOnGestureListenerC3337ci;
    }

    public final void a() {
        InterfaceC3580m9 interfaceC3580m9 = this.f26505a.f26958i;
        if (interfaceC3580m9 != null) {
            String str = GestureDetectorOnGestureListenerC3337ci.f26937g1;
            tn.p.j(str, "access$getTAG$cp(...)");
            ((C3605n9) interfaceC3580m9).a(str, "onAdScreenDisplayFailed");
        }
        this.f26505a.getListener().c();
    }

    public final void b() {
        InterfaceC3580m9 interfaceC3580m9 = this.f26505a.f26958i;
        if (interfaceC3580m9 != null) {
            String str = GestureDetectorOnGestureListenerC3337ci.f26937g1;
            tn.p.j(str, "access$getTAG$cp(...)");
            ((C3605n9) interfaceC3580m9).a(str, "onAdScreenDisplayed");
        }
        GestureDetectorOnGestureListenerC3337ci gestureDetectorOnGestureListenerC3337ci = this.f26505a;
        if (gestureDetectorOnGestureListenerC3337ci.f26941b == 0) {
            gestureDetectorOnGestureListenerC3337ci.P = false;
        }
        gestureDetectorOnGestureListenerC3337ci.getListener().f(this.f26505a);
    }
}
