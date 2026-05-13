package com.unity3d.ads.core.domain;

import bn.r;
import com.unity3d.ads.UnityAds;
import com.unity3d.services.core.properties.SdkProperties;
import hn.c;
import jn.d;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p000do.h0;
import p000do.i;
import p000do.l0;
import sn.p;

/* JADX INFO: compiled from: TriggerInitializeListener.kt */
/* JADX INFO: loaded from: classes10.dex */
public final class TriggerInitializeListener {

    @NotNull
    private final h0 coroutineDispatcher;

    /* JADX INFO: renamed from: com.unity3d.ads.core.domain.TriggerInitializeListener$error$1, reason: invalid class name */
    /* JADX INFO: compiled from: TriggerInitializeListener.kt */
    @d(c = "com.unity3d.ads.core.domain.TriggerInitializeListener$error$1", f = "TriggerInitializeListener.kt", l = {}, m = "invokeSuspend")
    public static final class AnonymousClass1 extends SuspendLambda implements p<l0, c<? super r>, Object> {
        public final /* synthetic */ String $errorMsg;
        public final /* synthetic */ UnityAds.UnityAdsInitializationError $unityAdsInitializationError;
        public int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass1(UnityAds.UnityAdsInitializationError unityAdsInitializationError, String str, c<? super AnonymousClass1> cVar) {
            super(2, cVar);
            this.$unityAdsInitializationError = unityAdsInitializationError;
            this.$errorMsg = str;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @NotNull
        public final c<r> create(@Nullable Object obj, @NotNull c<?> cVar) {
            return new AnonymousClass1(this.$unityAdsInitializationError, this.$errorMsg, cVar);
        }

        @Override // sn.p
        @Nullable
        /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method and merged with bridge method [inline-methods] */
        public final Object mo2invoke(@NotNull l0 l0Var, @Nullable c<? super r> cVar) {
            return ((AnonymousClass1) create(l0Var, cVar)).invokeSuspend(r.f5635a);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Nullable
        public final Object invokeSuspend(@NotNull Object obj) {
            in.a.g();
            if (this.label != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            kotlin.c.b(obj);
            SdkProperties.notifyInitializationFailed(this.$unityAdsInitializationError, this.$errorMsg);
            return r.f5635a;
        }
    }

    /* JADX INFO: renamed from: com.unity3d.ads.core.domain.TriggerInitializeListener$success$1, reason: invalid class name and case insensitive filesystem */
    /* JADX INFO: compiled from: TriggerInitializeListener.kt */
    @d(c = "com.unity3d.ads.core.domain.TriggerInitializeListener$success$1", f = "TriggerInitializeListener.kt", l = {}, m = "invokeSuspend")
    public static final class C44821 extends SuspendLambda implements p<l0, c<? super r>, Object> {
        public int label;

        public C44821(c<? super C44821> cVar) {
            super(2, cVar);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @NotNull
        public final c<r> create(@Nullable Object obj, @NotNull c<?> cVar) {
            return new C44821(cVar);
        }

        @Override // sn.p
        @Nullable
        /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method and merged with bridge method [inline-methods] */
        public final Object mo2invoke(@NotNull l0 l0Var, @Nullable c<? super r> cVar) {
            return ((C44821) create(l0Var, cVar)).invokeSuspend(r.f5635a);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Nullable
        public final Object invokeSuspend(@NotNull Object obj) {
            in.a.g();
            if (this.label != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            kotlin.c.b(obj);
            SdkProperties.notifyInitializationComplete();
            return r.f5635a;
        }
    }

    public TriggerInitializeListener(@NotNull h0 h0Var) {
        tn.p.k(h0Var, "coroutineDispatcher");
        this.coroutineDispatcher = h0Var;
    }

    public final void error(@NotNull UnityAds.UnityAdsInitializationError unityAdsInitializationError, @NotNull String str) {
        tn.p.k(unityAdsInitializationError, "unityAdsInitializationError");
        tn.p.k(str, "errorMsg");
        i.d(kotlinx.coroutines.d.a(this.coroutineDispatcher), null, null, new AnonymousClass1(unityAdsInitializationError, str, null), 3, null);
    }

    public final void success() {
        i.d(kotlinx.coroutines.d.a(this.coroutineDispatcher), null, null, new C44821(null), 3, null);
    }
}
