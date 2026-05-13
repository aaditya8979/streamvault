package com.inmobi.media;

import android.view.Surface;
import com.inmobi.media.videoPlayer.model.HtmlVideoPlaybackState;
import com.ironsource.C3978d4;
import kotlin.coroutines.jvm.internal.SuspendLambda;

/* JADX INFO: renamed from: com.inmobi.media.z7, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes12.dex */
public final class C3902z7 extends SuspendLambda implements sn.p {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ N7 f28626a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ C3404f8 f28627b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C3902z7(hn.c cVar, N7 n72, C3404f8 c3404f8) {
        super(2, cVar);
        this.f28626a = n72;
        this.f28627b = c3404f8;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final hn.c create(Object obj, hn.c cVar) {
        return new C3902z7(cVar, this.f28626a, this.f28627b);
    }

    @Override // sn.p
    /* JADX INFO: renamed from: invoke */
    public final Object mo2invoke(Object obj, Object obj2) {
        return new C3902z7((hn.c) obj2, this.f28626a, this.f28627b).invokeSuspend(bn.r.f5635a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        Surface surface;
        in.a.g();
        kotlin.c.b(obj);
        this.f28626a.f26003l.set(EnumC3736sg.f28124c);
        this.f28626a.f26007p.seekTo(0L);
        C3629o8 c3629o8 = this.f28626a.f26017z;
        if (!c3629o8.f27765g && (surface = c3629o8.f27763e) != null) {
            c3629o8.f27765g = true;
            c3629o8.f27760b.setVideoSurface(surface);
        }
        N7 n72 = this.f28626a;
        HtmlVideoPlaybackState htmlVideoPlaybackState = new HtmlVideoPlaybackState();
        htmlVideoPlaybackState.setDuration(this.f28627b.f27152b / 1000.0f);
        htmlVideoPlaybackState.setVideoUrl(this.f28627b.f27151a);
        htmlVideoPlaybackState.setLatency(jn.a.e(System.currentTimeMillis() - this.f28626a.f26012u));
        htmlVideoPlaybackState.setMuted(this.f28626a.f26016y.f26289e);
        EnumC3504j8[] enumC3504j8Arr = EnumC3504j8.f27392a;
        htmlVideoPlaybackState.setState(C3978d4.i.f31361s);
        htmlVideoPlaybackState.setTime(this.f28626a.f26007p.getCurrentPosition() / 1000.0f);
        n72.a(new C3430g8(htmlVideoPlaybackState, this.f28627b.f27153c));
        return bn.r.f5635a;
    }
}
