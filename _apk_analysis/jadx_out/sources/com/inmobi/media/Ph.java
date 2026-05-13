package com.inmobi.media;

/* JADX INFO: loaded from: classes9.dex */
public final class Ph implements InterfaceC3495j {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ GestureDetectorOnGestureListenerC3337ci f26137a;

    public Ph(GestureDetectorOnGestureListenerC3337ci gestureDetectorOnGestureListenerC3337ci) {
        this.f26137a = gestureDetectorOnGestureListenerC3337ci;
    }

    public final void a(Float f10) {
        this.f26137a.g("window.mraidview.broadcastEvent('audioVolumeChange', " + f10 + ");");
    }
}
