package com.moloco.sdk.acm.services;

import androidx.lifecycle.DefaultLifecycleObserver;
import androidx.lifecycle.LifecycleOwner;
import bn.r;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import org.jetbrains.annotations.NotNull;
import p000do.i;
import p000do.l0;
import sn.p;

/* JADX INFO: loaded from: classes9.dex */
public final class ApplicationLifecycleObserver implements DefaultLifecycleObserver {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @NotNull
    public final com.moloco.sdk.acm.eventprocessing.b f45879b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @NotNull
    public final l0 f45880c;

    @jn.d(c = "com.moloco.sdk.acm.services.ApplicationLifecycleObserver$onStop$1", f = "ApplicationLifecycleTracker.kt", l = {}, m = "invokeSuspend")
    public static final class a extends SuspendLambda implements p<l0, hn.c<? super r>, Object> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public int f45881a;

        public a(hn.c<? super a> cVar) {
            super(2, cVar);
        }

        @Override // sn.p
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final Object mo2invoke(l0 l0Var, hn.c<? super r> cVar) {
            return ((a) create(l0Var, cVar)).invokeSuspend(r.f5635a);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final hn.c<r> create(Object obj, hn.c<?> cVar) {
            return ApplicationLifecycleObserver.this.new a(cVar);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            in.a.g();
            if (this.f45881a != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            kotlin.c.b(obj);
            ApplicationLifecycleObserver.this.f45879b.a();
            return r.f5635a;
        }
    }

    public ApplicationLifecycleObserver(@NotNull com.moloco.sdk.acm.eventprocessing.b bVar, @NotNull l0 l0Var) {
        tn.p.k(bVar, "dbWorkRequest");
        tn.p.k(l0Var, "scope");
        this.f45879b = bVar;
        this.f45880c = l0Var;
    }

    @Override // androidx.lifecycle.DefaultLifecycleObserver
    public void onStop(@NotNull LifecycleOwner lifecycleOwner) {
        tn.p.k(lifecycleOwner, "owner");
        super.onStop(lifecycleOwner);
        e.f(e.f45892a, "ApplicationLifecycleObserver", "Application onStop", false, 4, null);
        i.d(this.f45880c, null, null, new a(null), 3, null);
    }
}
