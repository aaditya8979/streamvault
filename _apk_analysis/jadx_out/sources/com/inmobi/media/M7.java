package com.inmobi.media;

import android.transition.TransitionManager;
import android.widget.RelativeLayout;
import com.inmobi.media.videoPlayer.model.VideoViewPosition;
import kotlin.coroutines.jvm.internal.SuspendLambda;

/* JADX INFO: loaded from: classes8.dex */
public final class M7 extends SuspendLambda implements sn.p {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ N7 f25935a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ VideoViewPosition f25936b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public M7(hn.c cVar, N7 n72, VideoViewPosition videoViewPosition) {
        super(2, cVar);
        this.f25935a = n72;
        this.f25936b = videoViewPosition;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final hn.c create(Object obj, hn.c cVar) {
        return new M7(cVar, this.f25935a, this.f25936b);
    }

    @Override // sn.p
    /* JADX INFO: renamed from: invoke */
    public final Object mo2invoke(Object obj, Object obj2) {
        return new M7((hn.c) obj2, this.f25935a, this.f25936b).invokeSuspend(bn.r.f5635a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        in.a.g();
        kotlin.c.b(obj);
        TransitionManager.beginDelayedTransition(this.f25935a.f26005n);
        this.f25935a.f25996e.setVideoViewPosition(this.f25936b);
        int iB = (int) (J5.b() * this.f25936b.getWidth());
        int iB2 = (int) (J5.b() * this.f25936b.getHeight());
        G1 g12 = this.f25935a.f26005n;
        RelativeLayout.LayoutParams layoutParams = new RelativeLayout.LayoutParams(iB, iB2);
        if (this.f25935a.f25996e.getVideoViewPosition() != null) {
            layoutParams.setMargins(this.f25936b.getX(), this.f25936b.getY(), 0, 0);
        }
        g12.setLayoutParams(layoutParams);
        if (this.f25935a.f26000i > 0 && this.f25935a.f26001j > 0) {
            N7 n72 = this.f25935a;
            G1 g13 = n72.f26005n;
            int i10 = n72.f26000i;
            int i11 = this.f25935a.f26001j;
            g13.getClass();
            if (i10 > 0 && i11 > 0) {
                g13.f25505a = i10 / i11;
                g13.requestLayout();
            }
        }
        this.f25935a.f26005n.requestLayout();
        return bn.r.f5635a;
    }
}
