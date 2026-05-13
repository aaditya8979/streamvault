package com.inmobi.media;

import android.media.MediaPlayer;
import kotlin.coroutines.jvm.internal.SuspendLambda;

/* JADX INFO: loaded from: classes9.dex */
public final class Xd extends SuspendLambda implements sn.p {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ C3281ae f26591a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public Xd(C3281ae c3281ae, hn.c cVar) {
        super(2, cVar);
        this.f26591a = c3281ae;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final hn.c create(Object obj, hn.c cVar) {
        return new Xd(this.f26591a, cVar);
    }

    @Override // sn.p
    /* JADX INFO: renamed from: invoke */
    public final Object mo2invoke(Object obj, Object obj2) {
        return new Xd(this.f26591a, (hn.c) obj2).invokeSuspend(bn.r.f5635a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        in.a.g();
        kotlin.c.b(obj);
        this.f26591a.f26794g.setActivated(false);
        this.f26591a.f26794g.setFocusable(false);
        MediaPlayer mediaPlayer = this.f26591a.f26790c;
        tn.p.k(mediaPlayer, "<this>");
        try {
            mediaPlayer.setVolume(0.0f, 0.0f);
        } catch (IllegalStateException unused) {
        }
        this.f26591a.f26793f.a();
        return bn.r.f5635a;
    }
}
