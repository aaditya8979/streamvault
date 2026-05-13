package com.unity3d.services.core.extensions;

import bn.r;
import hn.c;
import java.util.Collection;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.CancellationException;
import jn.d;
import kotlin.Result;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import mo.a;
import mo.g;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p000do.i;
import p000do.l0;
import p000do.p0;
import sn.l;
import tn.n;
import tn.p;

/* JADX INFO: compiled from: CoroutineExtensions.kt */
/* JADX INFO: loaded from: classes5.dex */
public final class CoroutineExtensionsKt {

    @NotNull
    private static final LinkedHashMap<Object, p0<?>> deferreds = new LinkedHashMap<Object, p0<?>>() { // from class: com.unity3d.services.core.extensions.CoroutineExtensionsKt$deferreds$1
        public /* bridge */ boolean containsValue(p0<?> p0Var) {
            return super.containsValue((Object) p0Var);
        }

        @Override // java.util.LinkedHashMap, java.util.HashMap, java.util.AbstractMap, java.util.Map
        public final /* bridge */ boolean containsValue(Object obj) {
            if (obj instanceof p0) {
                return containsValue((p0<?>) obj);
            }
            return false;
        }

        @Override // java.util.LinkedHashMap, java.util.HashMap, java.util.AbstractMap, java.util.Map
        public final /* bridge */ Set<Map.Entry<Object, p0<?>>> entrySet() {
            return getEntries();
        }

        public /* bridge */ Set<Map.Entry<Object, p0<?>>> getEntries() {
            return super.entrySet();
        }

        public /* bridge */ Set<Object> getKeys() {
            return super.keySet();
        }

        public /* bridge */ int getSize() {
            return super.size();
        }

        public /* bridge */ Collection<p0<?>> getValues() {
            return super.values();
        }

        @Override // java.util.LinkedHashMap, java.util.HashMap, java.util.AbstractMap, java.util.Map
        public final /* bridge */ Set<Object> keySet() {
            return getKeys();
        }

        public /* bridge */ boolean remove(Object obj, p0<?> p0Var) {
            return super.remove(obj, (Object) p0Var);
        }

        @Override // java.util.HashMap, java.util.Map
        public final /* bridge */ boolean remove(Object obj, Object obj2) {
            if (obj != null && (obj2 instanceof p0)) {
                return remove(obj, (p0<?>) obj2);
            }
            return false;
        }

        @Override // java.util.LinkedHashMap
        public boolean removeEldestEntry(@NotNull Map.Entry<Object, p0<?>> entry) {
            p.k(entry, "eldest");
            return size() > 100;
        }

        @Override // java.util.HashMap, java.util.AbstractMap, java.util.Map
        public final /* bridge */ int size() {
            return getSize();
        }

        @Override // java.util.LinkedHashMap, java.util.HashMap, java.util.AbstractMap, java.util.Map
        public final /* bridge */ Collection<p0<?>> values() {
            return getValues();
        }
    };

    @NotNull
    private static final a mutex = g.b(false, 1, null);

    /* JADX INFO: Add missing generic type declarations: [T] */
    /* JADX INFO: renamed from: com.unity3d.services.core.extensions.CoroutineExtensionsKt$memoize$2, reason: invalid class name */
    /* JADX INFO: compiled from: CoroutineExtensions.kt */
    @d(c = "com.unity3d.services.core.extensions.CoroutineExtensionsKt$memoize$2", f = "CoroutineExtensions.kt", l = {53, 45}, m = "invokeSuspend")
    public static final class AnonymousClass2<T> extends SuspendLambda implements sn.p<l0, c<? super T>, Object> {
        public final /* synthetic */ l<c<? super T>, Object> $action;
        public final /* synthetic */ Object $key;
        private /* synthetic */ Object L$0;
        public Object L$1;
        public Object L$2;
        public Object L$3;
        public int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        public AnonymousClass2(Object obj, l<? super c<? super T>, ? extends Object> lVar, c<? super AnonymousClass2> cVar) {
            super(2, cVar);
            this.$key = obj;
            this.$action = lVar;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @NotNull
        public final c<r> create(@Nullable Object obj, @NotNull c<?> cVar) {
            AnonymousClass2 anonymousClass2 = new AnonymousClass2(this.$key, this.$action, cVar);
            anonymousClass2.L$0 = obj;
            return anonymousClass2;
        }

        @Override // sn.p
        @Nullable
        /* JADX INFO: renamed from: invoke, reason: merged with bridge method [inline-methods] */
        public final Object mo2invoke(@NotNull l0 l0Var, @Nullable c<? super T> cVar) {
            return ((AnonymousClass2) create(l0Var, cVar)).invokeSuspend(r.f5635a);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Nullable
        public final Object invokeSuspend(@NotNull Object obj) {
            l0 l0Var;
            a mutex;
            l<c<? super T>, Object> lVar;
            Object obj2;
            Object objG = in.a.g();
            int i10 = this.label;
            try {
                if (i10 == 0) {
                    kotlin.c.b(obj);
                    l0Var = (l0) this.L$0;
                    mutex = CoroutineExtensionsKt.getMutex();
                    Object obj3 = this.$key;
                    lVar = this.$action;
                    this.L$0 = l0Var;
                    this.L$1 = mutex;
                    this.L$2 = obj3;
                    this.L$3 = lVar;
                    this.label = 1;
                    if (mutex.c(null, this) == objG) {
                        return objG;
                    }
                    obj2 = obj3;
                } else {
                    if (i10 != 1) {
                        if (i10 == 2) {
                            kotlin.c.b(obj);
                        }
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    lVar = (l) this.L$3;
                    obj2 = this.L$2;
                    mutex = (a) this.L$1;
                    l0Var = (l0) this.L$0;
                    kotlin.c.b(obj);
                }
                LinkedHashMap<Object, p0<?>> deferreds = CoroutineExtensionsKt.getDeferreds();
                p0<?> p0VarB = deferreds.get(obj2);
                if (p0VarB == null) {
                    p0VarB = i.b(l0Var, null, null, new CoroutineExtensionsKt$memoize$2$deferred$1$1$1(lVar, null), 3, null);
                    deferreds.put(obj2, p0VarB);
                }
                p0<?> p0Var = p0VarB;
                mutex.d(null);
                this.L$0 = null;
                this.L$1 = null;
                this.L$2 = null;
                this.L$3 = null;
                this.label = 2;
                obj = p0Var.N(this);
                return obj == objG ? objG : obj;
            } catch (Throwable th2) {
                mutex.d(null);
                throw th2;
            }
        }

        @Nullable
        public final Object invokeSuspend$$forInline(@NotNull Object obj) {
            l0 l0Var = (l0) this.L$0;
            a mutex = CoroutineExtensionsKt.getMutex();
            Object obj2 = this.$key;
            l<c<? super T>, Object> lVar = this.$action;
            n.c(0);
            mutex.c(null, this);
            n.c(1);
            try {
                LinkedHashMap<Object, p0<?>> deferreds = CoroutineExtensionsKt.getDeferreds();
                p0<?> p0VarB = deferreds.get(obj2);
                if (p0VarB == null) {
                    p0VarB = i.b(l0Var, null, null, new CoroutineExtensionsKt$memoize$2$deferred$1$1$1(lVar, null), 3, null);
                    deferreds.put(obj2, p0VarB);
                }
                p0<?> p0Var = p0VarB;
                mutex.d(null);
                n.c(0);
                Object objN = p0Var.N(this);
                n.c(1);
                return objN;
            } catch (Throwable th2) {
                mutex.d(null);
                throw th2;
            }
        }
    }

    @NotNull
    public static final LinkedHashMap<Object, p0<?>> getDeferreds() {
        return deferreds;
    }

    @NotNull
    public static final a getMutex() {
        return mutex;
    }

    @Nullable
    public static final <T> Object memoize(@NotNull Object obj, @NotNull l<? super c<? super T>, ? extends Object> lVar, @NotNull c<? super T> cVar) {
        return kotlinx.coroutines.d.f(new AnonymousClass2(obj, lVar, null), cVar);
    }

    private static final <T> Object memoize$$forInline(Object obj, l<? super c<? super T>, ? extends Object> lVar, c<? super T> cVar) {
        AnonymousClass2 anonymousClass2 = new AnonymousClass2(obj, lVar, null);
        n.c(0);
        Object objF = kotlinx.coroutines.d.f(anonymousClass2, cVar);
        n.c(1);
        return objF;
    }

    @NotNull
    public static final <R> Object runReturnSuspendCatching(@NotNull sn.a<? extends R> aVar) {
        Object objM7534constructorimpl;
        p.k(aVar, "block");
        try {
            Result.a aVar2 = Result.Companion;
            objM7534constructorimpl = Result.m7534constructorimpl(aVar.invoke());
        } catch (CancellationException e10) {
            throw e10;
        } catch (Throwable th2) {
            Result.a aVar3 = Result.Companion;
            objM7534constructorimpl = Result.m7534constructorimpl(kotlin.c.a(th2));
        }
        if (Result.m7540isSuccessimpl(objM7534constructorimpl)) {
            return Result.m7534constructorimpl(objM7534constructorimpl);
        }
        Throwable thM7537exceptionOrNullimpl = Result.m7537exceptionOrNullimpl(objM7534constructorimpl);
        return thM7537exceptionOrNullimpl != null ? Result.m7534constructorimpl(kotlin.c.a(thM7537exceptionOrNullimpl)) : objM7534constructorimpl;
    }

    @NotNull
    public static final <R> Object runSuspendCatching(@NotNull sn.a<? extends R> aVar) {
        p.k(aVar, "block");
        try {
            Result.a aVar2 = Result.Companion;
            return Result.m7534constructorimpl(aVar.invoke());
        } catch (CancellationException e10) {
            throw e10;
        } catch (Throwable th2) {
            Result.a aVar3 = Result.Companion;
            return Result.m7534constructorimpl(kotlin.c.a(th2));
        }
    }
}
