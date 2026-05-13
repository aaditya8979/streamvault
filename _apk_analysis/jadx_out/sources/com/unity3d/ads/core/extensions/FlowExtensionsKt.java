package com.unity3d.ads.core.extensions;

import bn.r;
import fo.m;
import fo.p;
import go.e;
import go.f;
import hn.c;
import jn.d;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.internal.AdaptedFunctionReference;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p000do.i;
import p000do.l0;
import p000do.s0;
import sn.a;
import sn.p;

/* JADX INFO: compiled from: FlowExtensions.kt */
/* JADX INFO: loaded from: classes8.dex */
public final class FlowExtensionsKt {

    /* JADX INFO: Add missing generic type declarations: [T] */
    /* JADX INFO: renamed from: com.unity3d.ads.core.extensions.FlowExtensionsKt$timeoutAfter$1, reason: invalid class name */
    /* JADX INFO: compiled from: FlowExtensions.kt */
    @d(c = "com.unity3d.ads.core.extensions.FlowExtensionsKt$timeoutAfter$1", f = "FlowExtensions.kt", l = {15, 17}, m = "invokeSuspend")
    public static final class AnonymousClass1<T> extends SuspendLambda implements p<m<? super T>, c<? super r>, Object> {
        public final /* synthetic */ boolean $active;
        public final /* synthetic */ p<a<r>, c<? super r>, Object> $block;
        public final /* synthetic */ go.d<T> $this_timeoutAfter;
        public final /* synthetic */ long $timeoutMillis;
        private /* synthetic */ Object L$0;
        public int label;

        /* JADX INFO: renamed from: com.unity3d.ads.core.extensions.FlowExtensionsKt$timeoutAfter$1$1, reason: invalid class name and collision with other inner class name */
        /* JADX INFO: compiled from: FlowExtensions.kt */
        @d(c = "com.unity3d.ads.core.extensions.FlowExtensionsKt$timeoutAfter$1$1", f = "FlowExtensions.kt", l = {10}, m = "invokeSuspend")
        public static final class C07091 extends SuspendLambda implements p<l0, c<? super r>, Object> {
            public final /* synthetic */ m<T> $$this$channelFlow;
            public final /* synthetic */ go.d<T> $this_timeoutAfter;
            public int label;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            /* JADX WARN: Multi-variable type inference failed */
            public C07091(go.d<? extends T> dVar, m<? super T> mVar, c<? super C07091> cVar) {
                super(2, cVar);
                this.$this_timeoutAfter = dVar;
                this.$$this$channelFlow = mVar;
            }

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            @NotNull
            public final c<r> create(@Nullable Object obj, @NotNull c<?> cVar) {
                return new C07091(this.$this_timeoutAfter, this.$$this$channelFlow, cVar);
            }

            @Override // sn.p
            @Nullable
            /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method and merged with bridge method [inline-methods] */
            public final Object mo2invoke(@NotNull l0 l0Var, @Nullable c<? super r> cVar) {
                return ((C07091) create(l0Var, cVar)).invokeSuspend(r.f5635a);
            }

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            @Nullable
            public final Object invokeSuspend(@NotNull Object obj) {
                Object objG = in.a.g();
                int i10 = this.label;
                if (i10 == 0) {
                    kotlin.c.b(obj);
                    go.d<T> dVar = this.$this_timeoutAfter;
                    final m<T> mVar = this.$$this$channelFlow;
                    e<? super T> eVar = new e() { // from class: com.unity3d.ads.core.extensions.FlowExtensionsKt.timeoutAfter.1.1.1
                        @Override // go.e
                        @Nullable
                        public final Object emit(T t10, @NotNull c<? super r> cVar) {
                            Object objI = mVar.I(t10, cVar);
                            return objI == in.a.g() ? objI : r.f5635a;
                        }
                    };
                    this.label = 1;
                    if (dVar.collect(eVar, this) == objG) {
                        return objG;
                    }
                } else {
                    if (i10 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    kotlin.c.b(obj);
                }
                p.a.a(this.$$this$channelFlow, null, 1, null);
                return r.f5635a;
            }
        }

        /* JADX INFO: renamed from: com.unity3d.ads.core.extensions.FlowExtensionsKt$timeoutAfter$1$2, reason: invalid class name */
        /* JADX INFO: compiled from: FlowExtensions.kt */
        public /* synthetic */ class AnonymousClass2 extends AdaptedFunctionReference implements a<r> {
            public AnonymousClass2(Object obj) {
                super(0, obj, m.class, "close", "close(Ljava/lang/Throwable;)Z", 8);
            }

            @Override // sn.a
            public /* bridge */ /* synthetic */ r invoke() {
                invoke2();
                return r.f5635a;
            }

            /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
            public final void invoke2() {
                p.a.a((m) this.receiver, null, 1, null);
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        public AnonymousClass1(long j10, boolean z10, sn.p<? super a<r>, ? super c<? super r>, ? extends Object> pVar, go.d<? extends T> dVar, c<? super AnonymousClass1> cVar) {
            super(2, cVar);
            this.$timeoutMillis = j10;
            this.$active = z10;
            this.$block = pVar;
            this.$this_timeoutAfter = dVar;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @NotNull
        public final c<r> create(@Nullable Object obj, @NotNull c<?> cVar) {
            AnonymousClass1 anonymousClass1 = new AnonymousClass1(this.$timeoutMillis, this.$active, this.$block, this.$this_timeoutAfter, cVar);
            anonymousClass1.L$0 = obj;
            return anonymousClass1;
        }

        @Override // sn.p
        @Nullable
        /* JADX INFO: renamed from: invoke, reason: merged with bridge method [inline-methods] */
        public final Object mo2invoke(@NotNull m<? super T> mVar, @Nullable c<? super r> cVar) {
            return ((AnonymousClass1) create(mVar, cVar)).invokeSuspend(r.f5635a);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Nullable
        public final Object invokeSuspend(@NotNull Object obj) {
            m mVar;
            Object objG = in.a.g();
            int i10 = this.label;
            if (i10 == 0) {
                kotlin.c.b(obj);
                mVar = (m) this.L$0;
                i.d(mVar, null, null, new C07091(this.$this_timeoutAfter, mVar, null), 3, null);
                long j10 = this.$timeoutMillis;
                this.L$0 = mVar;
                this.label = 1;
                if (s0.a(j10, this) == objG) {
                    return objG;
                }
            } else {
                if (i10 != 1) {
                    if (i10 != 2) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    kotlin.c.b(obj);
                    return r.f5635a;
                }
                mVar = (m) this.L$0;
                kotlin.c.b(obj);
            }
            if (this.$active) {
                sn.p<a<r>, c<? super r>, Object> pVar = this.$block;
                AnonymousClass2 anonymousClass2 = new AnonymousClass2(mVar);
                this.L$0 = null;
                this.label = 2;
                if (pVar.mo2invoke(anonymousClass2, this) == objG) {
                    return objG;
                }
            }
            return r.f5635a;
        }
    }

    @NotNull
    public static final <T> go.d<T> timeoutAfter(@NotNull go.d<? extends T> dVar, long j10, boolean z10, @NotNull sn.p<? super a<r>, ? super c<? super r>, ? extends Object> pVar) {
        tn.p.k(dVar, "<this>");
        tn.p.k(pVar, "block");
        return f.j(new AnonymousClass1(j10, z10, pVar, dVar, null));
    }

    public static /* synthetic */ go.d timeoutAfter$default(go.d dVar, long j10, boolean z10, sn.p pVar, int i10, Object obj) {
        if ((i10 & 2) != 0) {
            z10 = true;
        }
        return timeoutAfter(dVar, j10, z10, pVar);
    }
}
