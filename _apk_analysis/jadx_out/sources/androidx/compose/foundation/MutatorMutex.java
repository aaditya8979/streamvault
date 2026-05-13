package androidx.compose.foundation;

import androidx.compose.runtime.Stable;
import bn.r;
import com.bytedance.sdk.openadsdk.TTAdConstant;
import com.unity3d.ads.core.domain.HandleInvocationsFromAdViewer;
import java.util.concurrent.CancellationException;
import java.util.concurrent.atomic.AtomicReference;
import kotlin.Metadata;
import kotlin.coroutines.d;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlinx.coroutines.g;
import mo.g;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p000do.l0;
import sn.l;
import tn.p;

/* JADX INFO: compiled from: MutatorMutex.kt */
/* JADX INFO: loaded from: classes10.dex */
@Stable
@Metadata(bv = {}, d1 = {"\u0000D\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0007\u0018\u00002\u00020\u0001:\u0001\u001cB\u0007¢\u0006\u0004\b\u001a\u0010\u001bJ\u0010\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0002JA\u0010\f\u001a\u00028\u0000\"\u0004\b\u0000\u0010\u00062\b\b\u0002\u0010\b\u001a\u00020\u00072\u001c\u0010\u000b\u001a\u0018\b\u0001\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00000\n\u0012\u0006\u0012\u0004\u0018\u00010\u00010\tH\u0086@ø\u0001\u0000¢\u0006\u0004\b\f\u0010\rJU\u0010\u0011\u001a\u00028\u0001\"\u0004\b\u0000\u0010\u000e\"\u0004\b\u0001\u0010\u00062\u0006\u0010\u000f\u001a\u00028\u00002\b\b\u0002\u0010\b\u001a\u00020\u00072\"\u0010\u000b\u001a\u001e\b\u0001\u0012\u0004\u0012\u00028\u0000\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00010\n\u0012\u0006\u0012\u0004\u0018\u00010\u00010\u0010H\u0086@ø\u0001\u0000¢\u0006\u0004\b\u0011\u0010\u0012R(\u0010\u0015\u001a\u0016\u0012\u0006\u0012\u0004\u0018\u00010\u00020\u0013j\n\u0012\u0006\u0012\u0004\u0018\u00010\u0002`\u00148\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0015\u0010\u0016R\u0014\u0010\u0018\u001a\u00020\u00178\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0018\u0010\u0019\u0082\u0002\u0004\n\u0002\b\u0019¨\u0006\u001d"}, d2 = {"Landroidx/compose/foundation/MutatorMutex;", "", "Landroidx/compose/foundation/MutatorMutex$Mutator;", "mutator", "Lbn/r;", "tryMutateOrCancel", "R", "Landroidx/compose/foundation/MutatePriority;", HandleInvocationsFromAdViewer.KEY_DOWNLOAD_PRIORITY, "Lkotlin/Function1;", "Lhn/c;", "block", "mutate", "(Landroidx/compose/foundation/MutatePriority;Lsn/l;Lhn/c;)Ljava/lang/Object;", "T", "receiver", "Lkotlin/Function2;", "mutateWith", "(Ljava/lang/Object;Landroidx/compose/foundation/MutatePriority;Lsn/p;Lhn/c;)Ljava/lang/Object;", "Ljava/util/concurrent/atomic/AtomicReference;", "Landroidx/compose/foundation/AtomicReference;", "currentMutator", "Ljava/util/concurrent/atomic/AtomicReference;", "Lmo/a;", "mutex", "Lmo/a;", "<init>", "()V", "Mutator", "foundation_release"}, k = 1, mv = {1, 6, 0})
public final class MutatorMutex {

    @NotNull
    private final AtomicReference<Mutator> currentMutator = new AtomicReference<>(null);

    @NotNull
    private final mo.a mutex = g.b(false, 1, null);

    /* JADX INFO: compiled from: MutatorMutex.kt */
    @Metadata(bv = {}, d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0007\b\u0002\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\b\u001a\u00020\u0007\u0012\u0006\u0010\r\u001a\u00020\f¢\u0006\u0004\b\u0011\u0010\u0012J\u000e\u0010\u0004\u001a\u00020\u00032\u0006\u0010\u0002\u001a\u00020\u0000J\u0006\u0010\u0006\u001a\u00020\u0005R\u0017\u0010\b\u001a\u00020\u00078\u0006¢\u0006\f\n\u0004\b\b\u0010\t\u001a\u0004\b\n\u0010\u000bR\u0017\u0010\r\u001a\u00020\f8\u0006¢\u0006\f\n\u0004\b\r\u0010\u000e\u001a\u0004\b\u000f\u0010\u0010¨\u0006\u0013"}, d2 = {"Landroidx/compose/foundation/MutatorMutex$Mutator;", "", "other", "", "canInterrupt", "Lbn/r;", "cancel", "Landroidx/compose/foundation/MutatePriority;", HandleInvocationsFromAdViewer.KEY_DOWNLOAD_PRIORITY, "Landroidx/compose/foundation/MutatePriority;", "getPriority", "()Landroidx/compose/foundation/MutatePriority;", "Lkotlinx/coroutines/g;", "job", "Lkotlinx/coroutines/g;", "getJob", "()Lkotlinx/coroutines/g;", "<init>", "(Landroidx/compose/foundation/MutatePriority;Lkotlinx/coroutines/g;)V", "foundation_release"}, k = 1, mv = {1, 6, 0})
    public static final class Mutator {

        @NotNull
        private final kotlinx.coroutines.g job;

        @NotNull
        private final MutatePriority priority;

        public Mutator(@NotNull MutatePriority mutatePriority, @NotNull kotlinx.coroutines.g gVar) {
            p.k(mutatePriority, HandleInvocationsFromAdViewer.KEY_DOWNLOAD_PRIORITY);
            p.k(gVar, "job");
            this.priority = mutatePriority;
            this.job = gVar;
        }

        public final boolean canInterrupt(@NotNull Mutator other) {
            p.k(other, "other");
            return this.priority.compareTo(other.priority) >= 0;
        }

        public final void cancel() {
            g.a.a(this.job, null, 1, null);
        }

        @NotNull
        public final kotlinx.coroutines.g getJob() {
            return this.job;
        }

        @NotNull
        public final MutatePriority getPriority() {
            return this.priority;
        }
    }

    /* JADX INFO: Add missing generic type declarations: [R] */
    /* JADX INFO: renamed from: androidx.compose.foundation.MutatorMutex$mutate$2, reason: invalid class name */
    /* JADX INFO: compiled from: MutatorMutex.kt */
    @Metadata(bv = {}, d1 = {"\u0000\b\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0002\u001a\u00028\u0000\"\u0004\b\u0000\u0010\u0000*\u00020\u0001H\u008a@"}, d2 = {"R", "Ldo/l0;", "<anonymous>"}, k = 3, mv = {1, 6, 0})
    @jn.d(c = "androidx.compose.foundation.MutatorMutex$mutate$2", f = "MutatorMutex.kt", l = {TTAdConstant.IMAGE_MODE_VERTICAL_IMG_173, 119}, m = "invokeSuspend")
    public static final class AnonymousClass2<R> extends SuspendLambda implements sn.p<l0, hn.c<? super R>, Object> {
        public final /* synthetic */ l<hn.c<? super R>, Object> $block;
        public final /* synthetic */ MutatePriority $priority;
        private /* synthetic */ Object L$0;
        public Object L$1;
        public Object L$2;
        public Object L$3;
        public int label;
        public final /* synthetic */ MutatorMutex this$0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        public AnonymousClass2(MutatePriority mutatePriority, MutatorMutex mutatorMutex, l<? super hn.c<? super R>, ? extends Object> lVar, hn.c<? super AnonymousClass2> cVar) {
            super(2, cVar);
            this.$priority = mutatePriority;
            this.this$0 = mutatorMutex;
            this.$block = lVar;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @NotNull
        public final hn.c<r> create(@Nullable Object obj, @NotNull hn.c<?> cVar) {
            AnonymousClass2 anonymousClass2 = new AnonymousClass2(this.$priority, this.this$0, this.$block, cVar);
            anonymousClass2.L$0 = obj;
            return anonymousClass2;
        }

        @Override // sn.p
        @Nullable
        /* JADX INFO: renamed from: invoke, reason: merged with bridge method [inline-methods] */
        public final Object mo2invoke(@NotNull l0 l0Var, @Nullable hn.c<? super R> cVar) {
            return ((AnonymousClass2) create(l0Var, cVar)).invokeSuspend(r.f5635a);
        }

        /* JADX WARN: Type inference failed for: r1v0, types: [int, mo.a] */
        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Nullable
        public final Object invokeSuspend(@NotNull Object obj) {
            mo.a aVar;
            l<hn.c<? super R>, Object> lVar;
            Mutator mutator;
            MutatorMutex mutatorMutex;
            Mutator mutator2;
            Throwable th2;
            MutatorMutex mutatorMutex2;
            mo.a aVar2;
            Object objG = in.a.g();
            ?? r12 = this.label;
            try {
                try {
                    if (r12 == 0) {
                        kotlin.c.b(obj);
                        l0 l0Var = (l0) this.L$0;
                        MutatePriority mutatePriority = this.$priority;
                        d.b bVar = l0Var.getCoroutineContext().get(kotlinx.coroutines.g.H8);
                        p.h(bVar);
                        Mutator mutator3 = new Mutator(mutatePriority, (kotlinx.coroutines.g) bVar);
                        this.this$0.tryMutateOrCancel(mutator3);
                        aVar = this.this$0.mutex;
                        l<hn.c<? super R>, Object> lVar2 = this.$block;
                        MutatorMutex mutatorMutex3 = this.this$0;
                        this.L$0 = mutator3;
                        this.L$1 = aVar;
                        this.L$2 = lVar2;
                        this.L$3 = mutatorMutex3;
                        this.label = 1;
                        if (aVar.c(null, this) == objG) {
                            return objG;
                        }
                        lVar = lVar2;
                        mutator = mutator3;
                        mutatorMutex = mutatorMutex3;
                    } else {
                        if (r12 != 1) {
                            if (r12 != 2) {
                                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                            }
                            mutatorMutex2 = (MutatorMutex) this.L$2;
                            aVar2 = (mo.a) this.L$1;
                            mutator2 = (Mutator) this.L$0;
                            try {
                                kotlin.c.b(obj);
                                androidx.compose.animation.core.a.a(mutatorMutex2.currentMutator, mutator2, null);
                                aVar2.d(null);
                                return obj;
                            } catch (Throwable th3) {
                                th2 = th3;
                                androidx.compose.animation.core.a.a(mutatorMutex2.currentMutator, mutator2, null);
                                throw th2;
                            }
                        }
                        mutatorMutex = (MutatorMutex) this.L$3;
                        lVar = (l) this.L$2;
                        mo.a aVar3 = (mo.a) this.L$1;
                        mutator = (Mutator) this.L$0;
                        kotlin.c.b(obj);
                        aVar = aVar3;
                    }
                    this.L$0 = mutator;
                    this.L$1 = aVar;
                    this.L$2 = mutatorMutex;
                    this.L$3 = null;
                    this.label = 2;
                    Object objInvoke = lVar.invoke(this);
                    if (objInvoke == objG) {
                        return objG;
                    }
                    mutatorMutex2 = mutatorMutex;
                    aVar2 = aVar;
                    obj = objInvoke;
                    mutator2 = mutator;
                    androidx.compose.animation.core.a.a(mutatorMutex2.currentMutator, mutator2, null);
                    aVar2.d(null);
                    return obj;
                } catch (Throwable th4) {
                    mutator2 = mutator;
                    th2 = th4;
                    mutatorMutex2 = mutatorMutex;
                    androidx.compose.animation.core.a.a(mutatorMutex2.currentMutator, mutator2, null);
                    throw th2;
                }
            } catch (Throwable th5) {
                r12.d(null);
                throw th5;
            }
        }
    }

    /* JADX INFO: Add missing generic type declarations: [R] */
    /* JADX INFO: renamed from: androidx.compose.foundation.MutatorMutex$mutateWith$2, reason: invalid class name and case insensitive filesystem */
    /* JADX INFO: compiled from: MutatorMutex.kt */
    @Metadata(bv = {}, d1 = {"\u0000\n\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\u0010\u0003\u001a\u00028\u0001\"\u0004\b\u0000\u0010\u0000\"\u0004\b\u0001\u0010\u0001*\u00020\u0002H\u008a@"}, d2 = {"T", "R", "Ldo/l0;", "<anonymous>"}, k = 3, mv = {1, 6, 0})
    @jn.d(c = "androidx.compose.foundation.MutatorMutex$mutateWith$2", f = "MutatorMutex.kt", l = {TTAdConstant.IMAGE_MODE_VERTICAL_IMG_173, 160}, m = "invokeSuspend")
    public static final class C11762<R> extends SuspendLambda implements sn.p<l0, hn.c<? super R>, Object> {
        public final /* synthetic */ sn.p<T, hn.c<? super R>, Object> $block;
        public final /* synthetic */ MutatePriority $priority;
        public final /* synthetic */ T $receiver;
        private /* synthetic */ Object L$0;
        public Object L$1;
        public Object L$2;
        public Object L$3;
        public Object L$4;
        public int label;
        public final /* synthetic */ MutatorMutex this$0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        public C11762(MutatePriority mutatePriority, MutatorMutex mutatorMutex, sn.p<? super T, ? super hn.c<? super R>, ? extends Object> pVar, T t10, hn.c<? super C11762> cVar) {
            super(2, cVar);
            this.$priority = mutatePriority;
            this.this$0 = mutatorMutex;
            this.$block = pVar;
            this.$receiver = t10;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @NotNull
        public final hn.c<r> create(@Nullable Object obj, @NotNull hn.c<?> cVar) {
            C11762 c11762 = new C11762(this.$priority, this.this$0, this.$block, this.$receiver, cVar);
            c11762.L$0 = obj;
            return c11762;
        }

        @Override // sn.p
        @Nullable
        /* JADX INFO: renamed from: invoke, reason: merged with bridge method [inline-methods] */
        public final Object mo2invoke(@NotNull l0 l0Var, @Nullable hn.c<? super R> cVar) {
            return ((C11762) create(l0Var, cVar)).invokeSuspend(r.f5635a);
        }

        /* JADX WARN: Type inference failed for: r1v0, types: [int, mo.a] */
        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Nullable
        public final Object invokeSuspend(@NotNull Object obj) {
            mo.a aVar;
            sn.p pVar;
            Object obj2;
            Mutator mutator;
            MutatorMutex mutatorMutex;
            Mutator mutator2;
            Throwable th2;
            MutatorMutex mutatorMutex2;
            mo.a aVar2;
            Object objG = in.a.g();
            ?? r12 = this.label;
            try {
                try {
                    if (r12 == 0) {
                        kotlin.c.b(obj);
                        l0 l0Var = (l0) this.L$0;
                        MutatePriority mutatePriority = this.$priority;
                        d.b bVar = l0Var.getCoroutineContext().get(kotlinx.coroutines.g.H8);
                        p.h(bVar);
                        Mutator mutator3 = new Mutator(mutatePriority, (kotlinx.coroutines.g) bVar);
                        this.this$0.tryMutateOrCancel(mutator3);
                        aVar = this.this$0.mutex;
                        pVar = this.$block;
                        Object obj3 = this.$receiver;
                        MutatorMutex mutatorMutex3 = this.this$0;
                        this.L$0 = mutator3;
                        this.L$1 = aVar;
                        this.L$2 = pVar;
                        this.L$3 = obj3;
                        this.L$4 = mutatorMutex3;
                        this.label = 1;
                        if (aVar.c(null, this) == objG) {
                            return objG;
                        }
                        obj2 = obj3;
                        mutator = mutator3;
                        mutatorMutex = mutatorMutex3;
                    } else {
                        if (r12 != 1) {
                            if (r12 != 2) {
                                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                            }
                            mutatorMutex2 = (MutatorMutex) this.L$2;
                            aVar2 = (mo.a) this.L$1;
                            mutator2 = (Mutator) this.L$0;
                            try {
                                kotlin.c.b(obj);
                                androidx.compose.animation.core.a.a(mutatorMutex2.currentMutator, mutator2, null);
                                aVar2.d(null);
                                return obj;
                            } catch (Throwable th3) {
                                th2 = th3;
                                androidx.compose.animation.core.a.a(mutatorMutex2.currentMutator, mutator2, null);
                                throw th2;
                            }
                        }
                        mutatorMutex = (MutatorMutex) this.L$4;
                        obj2 = this.L$3;
                        pVar = (sn.p) this.L$2;
                        mo.a aVar3 = (mo.a) this.L$1;
                        mutator = (Mutator) this.L$0;
                        kotlin.c.b(obj);
                        aVar = aVar3;
                    }
                    this.L$0 = mutator;
                    this.L$1 = aVar;
                    this.L$2 = mutatorMutex;
                    this.L$3 = null;
                    this.L$4 = null;
                    this.label = 2;
                    Object objMo2invoke = pVar.mo2invoke(obj2, this);
                    if (objMo2invoke == objG) {
                        return objG;
                    }
                    mutatorMutex2 = mutatorMutex;
                    aVar2 = aVar;
                    obj = objMo2invoke;
                    mutator2 = mutator;
                    androidx.compose.animation.core.a.a(mutatorMutex2.currentMutator, mutator2, null);
                    aVar2.d(null);
                    return obj;
                } catch (Throwable th4) {
                    mutator2 = mutator;
                    th2 = th4;
                    mutatorMutex2 = mutatorMutex;
                    androidx.compose.animation.core.a.a(mutatorMutex2.currentMutator, mutator2, null);
                    throw th2;
                }
            } catch (Throwable th5) {
                r12.d(null);
                throw th5;
            }
        }
    }

    public static /* synthetic */ Object mutate$default(MutatorMutex mutatorMutex, MutatePriority mutatePriority, l lVar, hn.c cVar, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            mutatePriority = MutatePriority.Default;
        }
        return mutatorMutex.mutate(mutatePriority, lVar, cVar);
    }

    public static /* synthetic */ Object mutateWith$default(MutatorMutex mutatorMutex, Object obj, MutatePriority mutatePriority, sn.p pVar, hn.c cVar, int i10, Object obj2) {
        if ((i10 & 2) != 0) {
            mutatePriority = MutatePriority.Default;
        }
        return mutatorMutex.mutateWith(obj, mutatePriority, pVar, cVar);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void tryMutateOrCancel(Mutator mutator) {
        Mutator mutator2;
        do {
            mutator2 = this.currentMutator.get();
            if (mutator2 != null && !mutator.canInterrupt(mutator2)) {
                throw new CancellationException("Current mutation had a higher priority");
            }
        } while (!androidx.compose.animation.core.a.a(this.currentMutator, mutator2, mutator));
        if (mutator2 != null) {
            mutator2.cancel();
        }
    }

    @Nullable
    public final <R> Object mutate(@NotNull MutatePriority mutatePriority, @NotNull l<? super hn.c<? super R>, ? extends Object> lVar, @NotNull hn.c<? super R> cVar) {
        return kotlinx.coroutines.d.f(new AnonymousClass2(mutatePriority, this, lVar, null), cVar);
    }

    @Nullable
    public final <T, R> Object mutateWith(T t10, @NotNull MutatePriority mutatePriority, @NotNull sn.p<? super T, ? super hn.c<? super R>, ? extends Object> pVar, @NotNull hn.c<? super R> cVar) {
        return kotlinx.coroutines.d.f(new C11762(mutatePriority, this, pVar, t10, null), cVar);
    }
}
