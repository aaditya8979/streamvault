package com.unity3d.ads.core.domain;

import android.app.Activity;
import bn.r;
import com.unity3d.ads.core.domain.LifecycleEvent;
import fo.m;
import hn.c;
import java.lang.ref.WeakReference;
import jn.d;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p000do.l0;
import sn.p;

/* JADX INFO: compiled from: AndroidGetLifecycleFlow.kt */
/* JADX INFO: loaded from: classes5.dex */
@d(c = "com.unity3d.ads.core.domain.AndroidGetLifecycleFlow$invoke$2$listener$1$onActivityDestroyed$1", f = "AndroidGetLifecycleFlow.kt", l = {58}, m = "invokeSuspend")
public final class AndroidGetLifecycleFlow$invoke$2$listener$1$onActivityDestroyed$1 extends SuspendLambda implements p<l0, c<? super r>, Object> {
    public final /* synthetic */ m<LifecycleEvent> $$this$channelFlow;
    public final /* synthetic */ Activity $activity;
    public int label;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public AndroidGetLifecycleFlow$invoke$2$listener$1$onActivityDestroyed$1(m<? super LifecycleEvent> mVar, Activity activity, c<? super AndroidGetLifecycleFlow$invoke$2$listener$1$onActivityDestroyed$1> cVar) {
        super(2, cVar);
        this.$$this$channelFlow = mVar;
        this.$activity = activity;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @NotNull
    public final c<r> create(@Nullable Object obj, @NotNull c<?> cVar) {
        return new AndroidGetLifecycleFlow$invoke$2$listener$1$onActivityDestroyed$1(this.$$this$channelFlow, this.$activity, cVar);
    }

    @Override // sn.p
    @Nullable
    /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method and merged with bridge method [inline-methods] */
    public final Object mo2invoke(@NotNull l0 l0Var, @Nullable c<? super r> cVar) {
        return ((AndroidGetLifecycleFlow$invoke$2$listener$1$onActivityDestroyed$1) create(l0Var, cVar)).invokeSuspend(r.f5635a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @Nullable
    public final Object invokeSuspend(@NotNull Object obj) {
        Object objG = in.a.g();
        int i10 = this.label;
        if (i10 == 0) {
            kotlin.c.b(obj);
            m<LifecycleEvent> mVar = this.$$this$channelFlow;
            LifecycleEvent.Destroyed destroyed = new LifecycleEvent.Destroyed(new WeakReference(this.$activity));
            this.label = 1;
            if (mVar.I(destroyed, this) == objG) {
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
