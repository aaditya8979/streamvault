package com.moloco.sdk.internal.utils;

import bn.r;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p000do.g;
import p000do.l0;
import sn.l;
import sn.p;

/* JADX INFO: loaded from: classes8.dex */
public final class a {

    /* JADX INFO: Add missing generic type declarations: [T] */
    /* JADX INFO: renamed from: com.moloco.sdk.internal.utils.a$a, reason: collision with other inner class name */
    @jn.d(c = "com.moloco.sdk.internal.utils.CoroutineUtilsKt$withReentrantLock$2", f = "CoroutineUtils.kt", l = {54, 37}, m = "invokeSuspend")
    public static final class C0585a<T> extends SuspendLambda implements p<l0, hn.c<? super T>, Object> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public Object f47610a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public Object f47611b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public int f47612c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public final /* synthetic */ mo.a f47613d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public final /* synthetic */ l<hn.c<? super T>, Object> f47614e;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        public C0585a(mo.a aVar, l<? super hn.c<? super T>, ? extends Object> lVar, hn.c<? super C0585a> cVar) {
            super(2, cVar);
            this.f47613d = aVar;
            this.f47614e = lVar;
        }

        @Override // sn.p
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final Object mo2invoke(l0 l0Var, hn.c<? super T> cVar) {
            return ((C0585a) create(l0Var, cVar)).invokeSuspend(r.f5635a);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final hn.c<r> create(Object obj, hn.c<?> cVar) {
            return new C0585a(this.f47613d, this.f47614e, cVar);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) throws Throwable {
            mo.a aVar;
            l<hn.c<? super T>, Object> lVar;
            mo.a aVar2;
            Throwable th2;
            Object objG = in.a.g();
            int i10 = this.f47612c;
            try {
                if (i10 == 0) {
                    kotlin.c.b(obj);
                    aVar = this.f47613d;
                    lVar = this.f47614e;
                    this.f47610a = aVar;
                    this.f47611b = lVar;
                    this.f47612c = 1;
                    if (aVar.c(null, this) == objG) {
                        return objG;
                    }
                } else {
                    if (i10 != 1) {
                        if (i10 != 2) {
                            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                        }
                        aVar2 = (mo.a) this.f47610a;
                        try {
                            kotlin.c.b(obj);
                            aVar2.d(null);
                            return obj;
                        } catch (Throwable th3) {
                            th2 = th3;
                            aVar2.d(null);
                            throw th2;
                        }
                    }
                    lVar = (l) this.f47611b;
                    mo.a aVar3 = (mo.a) this.f47610a;
                    kotlin.c.b(obj);
                    aVar = aVar3;
                }
                this.f47610a = aVar;
                this.f47611b = null;
                this.f47612c = 2;
                Object objInvoke = lVar.invoke(this);
                if (objInvoke == objG) {
                    return objG;
                }
                aVar2 = aVar;
                obj = objInvoke;
                aVar2.d(null);
                return obj;
            } catch (Throwable th4) {
                aVar2 = aVar;
                th2 = th4;
                aVar2.d(null);
                throw th2;
            }
        }
    }

    @Nullable
    public static final <T> Object a(@NotNull mo.a aVar, @NotNull l<? super hn.c<? super T>, ? extends Object> lVar, @NotNull hn.c<? super T> cVar) {
        f fVar = new f(aVar);
        return cVar.getContext().get(fVar) != null ? lVar.invoke(cVar) : g.g(new e(fVar), new C0585a(aVar, lVar, null), cVar);
    }
}
