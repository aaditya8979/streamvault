package com.inmobi.media;

import androidx.core.graphics.drawable.IconCompat;

/* JADX INFO: loaded from: classes9.dex */
public final class Uh {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ GestureDetectorOnGestureListenerC3337ci f26446a;

    public Uh(GestureDetectorOnGestureListenerC3337ci gestureDetectorOnGestureListenerC3337ci) {
        this.f26446a = gestureDetectorOnGestureListenerC3337ci;
    }

    public final void a(C3301b8 c3301b8) {
        tn.p.k(c3301b8, "error");
        InterfaceC3580m9 interfaceC3580m9 = this.f26446a.f26958i;
        if (interfaceC3580m9 != null) {
            ((C3605n9) interfaceC3580m9).b("HtmlVideoPlayer", "onVideoLoadFailed " + ((int) c3301b8.f26843b));
        }
        GestureDetectorOnGestureListenerC3337ci gestureDetectorOnGestureListenerC3337ci = this.f26446a;
        EnumC3654p8 enumC3654p8 = EnumC3654p8.f27843d;
        tn.p.k(c3301b8, IconCompat.EXTRA_OBJ);
        gestureDetectorOnGestureListenerC3337ci.a(enumC3654p8, AbstractC3581ma.a(c3301b8, c3301b8.getClass()));
    }
}
