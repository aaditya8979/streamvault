package com.unity3d.ads.adplayer;

import bn.r;
import jn.d;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p000do.l0;
import sn.p;

/* JADX INFO: compiled from: AndroidEmbeddableWebViewAdPlayer.kt */
/* JADX INFO: loaded from: classes5.dex */
@d(c = "com.unity3d.ads.adplayer.AndroidEmbeddableWebViewAdPlayer$show$3$2$1", f = "AndroidEmbeddableWebViewAdPlayer.kt", l = {106}, m = "invokeSuspend")
public final class AndroidEmbeddableWebViewAdPlayer$show$3$2$1 extends SuspendLambda implements p<l0, hn.c<? super r>, Object> {
    public int label;
    public final /* synthetic */ AndroidEmbeddableWebViewAdPlayer this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AndroidEmbeddableWebViewAdPlayer$show$3$2$1(AndroidEmbeddableWebViewAdPlayer androidEmbeddableWebViewAdPlayer, hn.c<? super AndroidEmbeddableWebViewAdPlayer$show$3$2$1> cVar) {
        super(2, cVar);
        this.this$0 = androidEmbeddableWebViewAdPlayer;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @NotNull
    public final hn.c<r> create(@Nullable Object obj, @NotNull hn.c<?> cVar) {
        return new AndroidEmbeddableWebViewAdPlayer$show$3$2$1(this.this$0, cVar);
    }

    @Override // sn.p
    @Nullable
    /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method and merged with bridge method [inline-methods] */
    public final Object mo2invoke(@NotNull l0 l0Var, @Nullable hn.c<? super r> cVar) {
        return ((AndroidEmbeddableWebViewAdPlayer$show$3$2$1) create(l0Var, cVar)).invokeSuspend(r.f5635a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @Nullable
    public final Object invokeSuspend(@NotNull Object obj) {
        Object objG = in.a.g();
        int i10 = this.label;
        if (i10 == 0) {
            kotlin.c.b(obj);
            AndroidEmbeddableWebViewAdPlayer androidEmbeddableWebViewAdPlayer = this.this$0;
            this.label = 1;
            if (androidEmbeddableWebViewAdPlayer.destroy(this) == objG) {
                return objG;
            }
        } else {
            if (i10 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            kotlin.c.b(obj);
        }
        return r.f5635a;
    }
}
