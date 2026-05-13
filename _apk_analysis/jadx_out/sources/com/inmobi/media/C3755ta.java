package com.inmobi.media;

import androidx.core.graphics.drawable.IconCompat;
import com.inmobi.media.videoPlayer.model.HtmlVideoPlaybackState;
import java.util.concurrent.CountDownLatch;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.internal.Ref$ObjectRef;

/* JADX INFO: renamed from: com.inmobi.media.ta, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes12.dex */
public final class C3755ta extends SuspendLambda implements sn.p {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ C3805va f28174a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Ref$ObjectRef f28175b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ CountDownLatch f28176c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C3755ta(C3805va c3805va, Ref$ObjectRef ref$ObjectRef, CountDownLatch countDownLatch, hn.c cVar) {
        super(2, cVar);
        this.f28174a = c3805va;
        this.f28175b = ref$ObjectRef;
        this.f28176c = countDownLatch;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final hn.c create(Object obj, hn.c cVar) {
        return new C3755ta(this.f28174a, this.f28175b, this.f28176c, cVar);
    }

    @Override // sn.p
    /* JADX INFO: renamed from: invoke */
    public final Object mo2invoke(Object obj, Object obj2) {
        return ((C3755ta) create((p000do.l0) obj, (hn.c) obj2)).invokeSuspend(bn.r.f5635a);
    }

    /* JADX WARN: Type inference failed for: r3v6, types: [T, org.json.JSONObject] */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        in.a.g();
        kotlin.c.b(obj);
        try {
            HtmlVideoPlaybackState playbackState = this.f28174a.f28354a.getPlaybackState();
            if (playbackState == null) {
                playbackState = new HtmlVideoPlaybackState();
            }
            Ref$ObjectRef ref$ObjectRef = this.f28175b;
            tn.p.k(playbackState, IconCompat.EXTRA_OBJ);
            ref$ObjectRef.element = AbstractC3581ma.a(playbackState, HtmlVideoPlaybackState.class);
            this.f28176c.countDown();
            return bn.r.f5635a;
        } catch (Throwable th2) {
            this.f28176c.countDown();
            throw th2;
        }
    }
}
