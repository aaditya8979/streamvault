package com.inmobi.media;

import android.media.MediaPlayer;
import com.safedk.android.internal.partials.InMobiVideoBridge;
import kotlin.coroutines.jvm.internal.SuspendLambda;

/* JADX INFO: loaded from: classes9.dex */
public final class Pd extends SuspendLambda implements sn.p {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ Sd f26129a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public Pd(Sd sd2, hn.c cVar) {
        super(2, cVar);
        this.f26129a = sd2;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final hn.c create(Object obj, hn.c cVar) {
        return new Pd(this.f26129a, cVar);
    }

    @Override // sn.p
    /* JADX INFO: renamed from: invoke */
    public final Object mo2invoke(Object obj, Object obj2) {
        return new Pd(this.f26129a, (hn.c) obj2).invokeSuspend(bn.r.f5635a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        in.a.g();
        kotlin.c.b(obj);
        Sd sd2 = this.f26129a;
        if (sd2.f26302b.f26208b) {
            C3419fn c3419fn = sd2.f26310j;
            c3419fn.c();
            c3419fn.f27192g = -1;
            c3419fn.b();
            MediaPlayer mediaPlayer = this.f26129a.f26308h;
            tn.p.k(mediaPlayer, "<this>");
            try {
                mediaPlayer.seekTo(0);
            } catch (IllegalStateException unused) {
            }
            MediaPlayer mediaPlayer2 = this.f26129a.f26308h;
            tn.p.k(mediaPlayer2, "<this>");
            try {
                InMobiVideoBridge.MediaPlayerStart(mediaPlayer2);
            } catch (IllegalStateException unused2) {
            }
        } else {
            sd2.f26310j.c();
            C3836wg c3836wg = (C3836wg) this.f26129a.f26311k.f27908i.f26566d.getValue();
            c3836wg.f28447f.set(true);
            H6.a(c3836wg.f28446e);
            c3836wg.f28446e = null;
            this.f26129a.f26305e = EnumC3736sg.f28127f;
        }
        return bn.r.f5635a;
    }
}
