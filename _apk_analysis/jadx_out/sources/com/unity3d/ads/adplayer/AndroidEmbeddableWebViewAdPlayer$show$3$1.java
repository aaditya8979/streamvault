package com.unity3d.ads.adplayer;

import bn.r;
import go.e;
import go.u;
import java.util.Map;
import jn.d;
import kotlin.KotlinNothingValueException;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p000do.l0;
import sn.p;

/* JADX INFO: compiled from: AndroidEmbeddableWebViewAdPlayer.kt */
/* JADX INFO: loaded from: classes5.dex */
@d(c = "com.unity3d.ads.adplayer.AndroidEmbeddableWebViewAdPlayer$show$3$1", f = "AndroidEmbeddableWebViewAdPlayer.kt", l = {97, 98}, m = "invokeSuspend")
public final class AndroidEmbeddableWebViewAdPlayer$show$3$1 extends SuspendLambda implements p<l0, hn.c<? super r>, Object> {
    public final /* synthetic */ ShowOptions $showOptions;
    public int label;
    public final /* synthetic */ AndroidEmbeddableWebViewAdPlayer this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AndroidEmbeddableWebViewAdPlayer$show$3$1(AndroidEmbeddableWebViewAdPlayer androidEmbeddableWebViewAdPlayer, ShowOptions showOptions, hn.c<? super AndroidEmbeddableWebViewAdPlayer$show$3$1> cVar) {
        super(2, cVar);
        this.this$0 = androidEmbeddableWebViewAdPlayer;
        this.$showOptions = showOptions;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @NotNull
    public final hn.c<r> create(@Nullable Object obj, @NotNull hn.c<?> cVar) {
        return new AndroidEmbeddableWebViewAdPlayer$show$3$1(this.this$0, this.$showOptions, cVar);
    }

    @Override // sn.p
    @Nullable
    /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method and merged with bridge method [inline-methods] */
    public final Object mo2invoke(@NotNull l0 l0Var, @Nullable hn.c<? super r> cVar) {
        return ((AndroidEmbeddableWebViewAdPlayer$show$3$1) create(l0Var, cVar)).invokeSuspend(r.f5635a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @Nullable
    public final Object invokeSuspend(@NotNull Object obj) {
        Object objG = in.a.g();
        int i10 = this.label;
        if (i10 == 0) {
            kotlin.c.b(obj);
            WebViewAdPlayer webViewAdPlayer = this.this$0.webViewAdPlayer;
            Map<String, Object> unityAdsShowOptions = ((AndroidShowOptions) this.$showOptions).getUnityAdsShowOptions();
            this.label = 1;
            if (webViewAdPlayer.requestShow(unityAdsShowOptions, this) == objG) {
                return objG;
            }
        } else {
            if (i10 != 1) {
                if (i10 != 2) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                kotlin.c.b(obj);
                throw new KotlinNothingValueException();
            }
            kotlin.c.b(obj);
        }
        u<Boolean> appActive = this.this$0.lifecycleDataSource.getAppActive();
        final AndroidEmbeddableWebViewAdPlayer androidEmbeddableWebViewAdPlayer = this.this$0;
        e<? super Boolean> eVar = new e() { // from class: com.unity3d.ads.adplayer.AndroidEmbeddableWebViewAdPlayer$show$3$1.1
            @Override // go.e
            public /* bridge */ /* synthetic */ Object emit(Object obj2, hn.c cVar) {
                return emit(((Boolean) obj2).booleanValue(), (hn.c<? super r>) cVar);
            }

            @Nullable
            public final Object emit(boolean z10, @NotNull hn.c<? super r> cVar) {
                Object objSendFocusChange = androidEmbeddableWebViewAdPlayer.webViewAdPlayer.sendFocusChange(z10, cVar);
                return objSendFocusChange == in.a.g() ? objSendFocusChange : r.f5635a;
            }
        };
        this.label = 2;
        if (appActive.collect(eVar, this) == objG) {
            return objG;
        }
        throw new KotlinNothingValueException();
    }
}
