package com.unity3d.ads.core.domain;

import android.app.Activity;
import android.app.Application;
import android.content.Context;
import android.os.Bundle;
import androidx.appcompat.widget.ActivityChooserModel;
import bn.r;
import fo.m;
import go.f;
import hn.c;
import jn.d;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlinx.coroutines.channels.ProduceKt;
import me.goldze.mvvmhabit.base.ContainerActivity;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p000do.i;
import sn.p;

/* JADX INFO: compiled from: AndroidGetLifecycleFlow.kt */
/* JADX INFO: loaded from: classes5.dex */
public final class AndroidGetLifecycleFlow {

    @NotNull
    private final Context applicationContext;

    /* JADX INFO: renamed from: com.unity3d.ads.core.domain.AndroidGetLifecycleFlow$invoke$2, reason: invalid class name */
    /* JADX INFO: compiled from: AndroidGetLifecycleFlow.kt */
    @d(c = "com.unity3d.ads.core.domain.AndroidGetLifecycleFlow$invoke$2", f = "AndroidGetLifecycleFlow.kt", l = {64}, m = "invokeSuspend")
    public static final class AnonymousClass2 extends SuspendLambda implements p<m<? super LifecycleEvent>, c<? super r>, Object> {
        private /* synthetic */ Object L$0;
        public int label;

        public AnonymousClass2(c<? super AnonymousClass2> cVar) {
            super(2, cVar);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @NotNull
        public final c<r> create(@Nullable Object obj, @NotNull c<?> cVar) {
            AnonymousClass2 anonymousClass2 = AndroidGetLifecycleFlow.this.new AnonymousClass2(cVar);
            anonymousClass2.L$0 = obj;
            return anonymousClass2;
        }

        @Override // sn.p
        @Nullable
        /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method and merged with bridge method [inline-methods] */
        public final Object mo2invoke(@NotNull m<? super LifecycleEvent> mVar, @Nullable c<? super r> cVar) {
            return ((AnonymousClass2) create(mVar, cVar)).invokeSuspend(r.f5635a);
        }

        /* JADX WARN: Multi-variable type inference failed */
        /* JADX WARN: Type inference failed for: r1v1, types: [android.app.Application$ActivityLifecycleCallbacks, com.unity3d.ads.core.domain.AndroidGetLifecycleFlow$invoke$2$listener$1] */
        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Nullable
        public final Object invokeSuspend(@NotNull Object obj) {
            Object objG = in.a.g();
            int i10 = this.label;
            if (i10 == 0) {
                kotlin.c.b(obj);
                final m mVar = (m) this.L$0;
                final ?? r12 = new Application.ActivityLifecycleCallbacks() { // from class: com.unity3d.ads.core.domain.AndroidGetLifecycleFlow$invoke$2$listener$1
                    @Override // android.app.Application.ActivityLifecycleCallbacks
                    public void onActivityCreated(@NotNull Activity activity, @Nullable Bundle bundle) {
                        tn.p.k(activity, ActivityChooserModel.ATTRIBUTE_ACTIVITY);
                        m<LifecycleEvent> mVar2 = mVar;
                        i.d(mVar2, null, null, new AndroidGetLifecycleFlow$invoke$2$listener$1$onActivityCreated$1(mVar2, activity, bundle, null), 3, null);
                    }

                    @Override // android.app.Application.ActivityLifecycleCallbacks
                    public void onActivityDestroyed(@NotNull Activity activity) {
                        tn.p.k(activity, ActivityChooserModel.ATTRIBUTE_ACTIVITY);
                        m<LifecycleEvent> mVar2 = mVar;
                        i.d(mVar2, null, null, new AndroidGetLifecycleFlow$invoke$2$listener$1$onActivityDestroyed$1(mVar2, activity, null), 3, null);
                    }

                    @Override // android.app.Application.ActivityLifecycleCallbacks
                    public void onActivityPaused(@NotNull Activity activity) {
                        tn.p.k(activity, ActivityChooserModel.ATTRIBUTE_ACTIVITY);
                        m<LifecycleEvent> mVar2 = mVar;
                        i.d(mVar2, null, null, new AndroidGetLifecycleFlow$invoke$2$listener$1$onActivityPaused$1(mVar2, activity, null), 3, null);
                    }

                    @Override // android.app.Application.ActivityLifecycleCallbacks
                    public void onActivityResumed(@NotNull Activity activity) {
                        tn.p.k(activity, ActivityChooserModel.ATTRIBUTE_ACTIVITY);
                        m<LifecycleEvent> mVar2 = mVar;
                        i.d(mVar2, null, null, new AndroidGetLifecycleFlow$invoke$2$listener$1$onActivityResumed$1(mVar2, activity, null), 3, null);
                    }

                    @Override // android.app.Application.ActivityLifecycleCallbacks
                    public void onActivitySaveInstanceState(@NotNull Activity activity, @NotNull Bundle bundle) {
                        tn.p.k(activity, ActivityChooserModel.ATTRIBUTE_ACTIVITY);
                        tn.p.k(bundle, ContainerActivity.BUNDLE);
                        m<LifecycleEvent> mVar2 = mVar;
                        i.d(mVar2, null, null, new AndroidGetLifecycleFlow$invoke$2$listener$1$onActivitySaveInstanceState$1(mVar2, activity, bundle, null), 3, null);
                    }

                    @Override // android.app.Application.ActivityLifecycleCallbacks
                    public void onActivityStarted(@NotNull Activity activity) {
                        tn.p.k(activity, ActivityChooserModel.ATTRIBUTE_ACTIVITY);
                        m<LifecycleEvent> mVar2 = mVar;
                        i.d(mVar2, null, null, new AndroidGetLifecycleFlow$invoke$2$listener$1$onActivityStarted$1(mVar2, activity, null), 3, null);
                    }

                    @Override // android.app.Application.ActivityLifecycleCallbacks
                    public void onActivityStopped(@NotNull Activity activity) {
                        tn.p.k(activity, ActivityChooserModel.ATTRIBUTE_ACTIVITY);
                        m<LifecycleEvent> mVar2 = mVar;
                        i.d(mVar2, null, null, new AndroidGetLifecycleFlow$invoke$2$listener$1$onActivityStopped$1(mVar2, activity, null), 3, null);
                    }
                };
                ((Application) AndroidGetLifecycleFlow.this.applicationContext).registerActivityLifecycleCallbacks(r12);
                final AndroidGetLifecycleFlow androidGetLifecycleFlow = AndroidGetLifecycleFlow.this;
                sn.a<r> aVar = new sn.a<r>() { // from class: com.unity3d.ads.core.domain.AndroidGetLifecycleFlow.invoke.2.1
                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                    {
                        super(0);
                    }

                    @Override // sn.a
                    public /* bridge */ /* synthetic */ r invoke() {
                        invoke2();
                        return r.f5635a;
                    }

                    /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
                    public final void invoke2() {
                        ((Application) androidGetLifecycleFlow.applicationContext).unregisterActivityLifecycleCallbacks(r12);
                    }
                };
                this.label = 1;
                if (ProduceKt.b(mVar, aVar, this) == objG) {
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

    public AndroidGetLifecycleFlow(@NotNull Context context) {
        tn.p.k(context, "applicationContext");
        this.applicationContext = context;
    }

    @NotNull
    public final go.d<LifecycleEvent> invoke() {
        if (this.applicationContext instanceof Application) {
            return f.j(new AnonymousClass2(null));
        }
        throw new IllegalArgumentException("Application context is required".toString());
    }
}
