package com.inmobi.media;

import androidx.core.graphics.drawable.IconCompat;
import com.inmobi.media.videoPlayer.model.VideoViewPosition;
import kotlin.coroutines.jvm.internal.SuspendLambda;

/* JADX INFO: renamed from: com.inmobi.media.ua, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes12.dex */
public final class C3780ua extends SuspendLambda implements sn.p {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ C3805va f28246a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ VideoViewPosition f28247b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ String f28248c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C3780ua(C3805va c3805va, VideoViewPosition videoViewPosition, String str, hn.c cVar) {
        super(2, cVar);
        this.f28246a = c3805va;
        this.f28247b = videoViewPosition;
        this.f28248c = str;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final hn.c create(Object obj, hn.c cVar) {
        return new C3780ua(this.f28246a, this.f28247b, this.f28248c, cVar);
    }

    @Override // sn.p
    /* JADX INFO: renamed from: invoke */
    public final Object mo2invoke(Object obj, Object obj2) {
        return ((C3780ua) create((p000do.l0) obj, (hn.c) obj2)).invokeSuspend(bn.r.f5635a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        in.a.g();
        kotlin.c.b(obj);
        GestureDetectorOnGestureListenerC3337ci gestureDetectorOnGestureListenerC3337ci = this.f28246a.f28354a;
        VideoViewPosition videoViewPosition = this.f28247b;
        String str = this.f28248c;
        gestureDetectorOnGestureListenerC3337ci.getClass();
        tn.p.k(videoViewPosition, "videoViewPosition");
        C3803v8 c3803v8 = gestureDetectorOnGestureListenerC3337ci.Y0;
        if (c3803v8 != null) {
            tn.p.k(videoViewPosition, "newVideoViewPosition");
            if (!c3803v8.f28341g.get()) {
                EnumC3728s8[] enumC3728s8Arr = {EnumC3728s8.f28099c, EnumC3728s8.f28101e, EnumC3728s8.f28102f, EnumC3728s8.f28103g};
                EnumC3275a8[] enumC3275a8Arr = EnumC3275a8.f26763a;
                if (C3803v8.a(c3803v8, enumC3728s8Arr, "updateVideoPlayerPosition", "updateVideoPosition", null, 8)) {
                    c3803v8.f28345k.a(videoViewPosition);
                }
            }
            gestureDetectorOnGestureListenerC3337ci.a(EnumC3654p8.f27849j, str);
        } else {
            EnumC3654p8 enumC3654p8 = EnumC3654p8.f27844e;
            EnumC3275a8[] enumC3275a8Arr2 = EnumC3275a8.f26763a;
            X7 x72 = new X7((Object) str);
            tn.p.k(x72, IconCompat.EXTRA_OBJ);
            gestureDetectorOnGestureListenerC3337ci.a(enumC3654p8, AbstractC3581ma.a(x72, X7.class));
        }
        return bn.r.f5635a;
    }
}
