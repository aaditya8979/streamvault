package com.unity3d.services;

import bn.g;
import bn.r;
import com.unity3d.ads.core.domain.GetHeaderBiddingToken;
import com.unity3d.ads.core.domain.TokenNumberProvider;
import hn.c;
import in.a;
import jn.d;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p000do.l0;
import sn.p;

/* JADX INFO: compiled from: UnityAdsSDK.kt */
/* JADX INFO: loaded from: classes5.dex */
@d(c = "com.unity3d.services.UnityAdsSDK$fetchToken$token$1", f = "UnityAdsSDK.kt", l = {193}, m = "invokeSuspend")
public final class UnityAdsSDK$fetchToken$token$1 extends SuspendLambda implements p<l0, c<? super String>, Object> {
    public final /* synthetic */ g<GetHeaderBiddingToken> $getHeaderBiddingToken$delegate;
    public final /* synthetic */ g<TokenNumberProvider> $tokenNumberProvider$delegate;
    public int label;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public UnityAdsSDK$fetchToken$token$1(g<? extends GetHeaderBiddingToken> gVar, g<? extends TokenNumberProvider> gVar2, c<? super UnityAdsSDK$fetchToken$token$1> cVar) {
        super(2, cVar);
        this.$getHeaderBiddingToken$delegate = gVar;
        this.$tokenNumberProvider$delegate = gVar2;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @NotNull
    public final c<r> create(@Nullable Object obj, @NotNull c<?> cVar) {
        return new UnityAdsSDK$fetchToken$token$1(this.$getHeaderBiddingToken$delegate, this.$tokenNumberProvider$delegate, cVar);
    }

    @Override // sn.p
    @Nullable
    /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method and merged with bridge method [inline-methods] */
    public final Object mo2invoke(@NotNull l0 l0Var, @Nullable c<? super String> cVar) {
        return ((UnityAdsSDK$fetchToken$token$1) create(l0Var, cVar)).invokeSuspend(r.f5635a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @Nullable
    public final Object invokeSuspend(@NotNull Object obj) {
        Object objG = a.g();
        int i10 = this.label;
        if (i10 == 0) {
            kotlin.c.b(obj);
            GetHeaderBiddingToken getHeaderBiddingTokenFetchToken$lambda$11 = UnityAdsSDK.fetchToken$lambda$11(this.$getHeaderBiddingToken$delegate);
            int iInvoke = UnityAdsSDK.fetchToken$lambda$10(this.$tokenNumberProvider$delegate).invoke();
            this.label = 1;
            obj = GetHeaderBiddingToken.DefaultImpls.invoke$default(getHeaderBiddingTokenFetchToken$lambda$11, iInvoke, null, this, 2, null);
            if (obj == objG) {
                return objG;
            }
        } else {
            if (i10 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            kotlin.c.b(obj);
        }
        return obj;
    }
}
