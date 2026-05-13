package com.inmobi.media;

import android.media.MediaPlayer;
import kotlin.coroutines.jvm.internal.SuspendLambda;

/* JADX INFO: loaded from: classes10.dex */
public final class Zd extends SuspendLambda implements sn.p {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ C3281ae f26705a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public Zd(C3281ae c3281ae, hn.c cVar) {
        super(2, cVar);
        this.f26705a = c3281ae;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final hn.c create(Object obj, hn.c cVar) {
        return new Zd(this.f26705a, cVar);
    }

    @Override // sn.p
    /* JADX INFO: renamed from: invoke */
    public final Object mo2invoke(Object obj, Object obj2) {
        return new Zd(this.f26705a, (hn.c) obj2).invokeSuspend(bn.r.f5635a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        in.a.g();
        kotlin.c.b(obj);
        if (this.f26705a.f26793f.d()) {
            C3281ae c3281ae = this.f26705a;
            MediaPlayer mediaPlayer = c3281ae.f26790c;
            tn.p.k(mediaPlayer, "<this>");
            try {
                mediaPlayer.setVolume(1.0f, 1.0f);
            } catch (IllegalStateException unused) {
            }
            c3281ae.a(c3281ae.f26798k, c3281ae.f26797j);
            P4.a(c3281ae.f26792e, c3281ae.f26789b, new S1(1.0f, false));
            c3281ae.f26796i = false;
        } else {
            this.f26705a.a();
        }
        return bn.r.f5635a;
    }
}
