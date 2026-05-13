package androidx.compose.runtime;

import bn.r;
import com.ironsource.mediationsdk.logger.IronSourceError;
import go.e;
import go.f;
import go.u;
import hn.c;
import in.a;
import io.bidmachine.ads.networks.gam_dynamic.GAMConfig;
import java.util.Iterator;
import java.util.Set;
import jn.d;
import kotlin.Metadata;
import kotlin.coroutines.EmptyCoroutineContext;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p000do.g;
import p000do.l0;
import sn.p;

/* JADX INFO: compiled from: SnapshotFlow.kt */
/* JADX INFO: loaded from: classes7.dex */
@Metadata(bv = {}, d1 = {"\u00002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\"\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0004\u001a/\u0010\u0005\u001a\b\u0012\u0004\u0012\u00028\u00000\u0004\"\u0004\b\u0000\u0010\u0000*\b\u0012\u0004\u0012\u00028\u00000\u00012\b\b\u0002\u0010\u0003\u001a\u00020\u0002H\u0007¢\u0006\u0004\b\u0005\u0010\u0006\u001aA\u0010\u0005\u001a\b\u0012\u0004\u0012\u00028\u00010\u0004\"\b\b\u0000\u0010\u0000*\u00028\u0001\"\u0004\b\u0001\u0010\u0007*\b\u0012\u0004\u0012\u00028\u00000\b2\u0006\u0010\t\u001a\u00028\u00012\b\b\u0002\u0010\u0003\u001a\u00020\u0002H\u0007¢\u0006\u0004\b\u0005\u0010\n\u001a \u0010\r\u001a\b\u0012\u0004\u0012\u00028\u00000\b\"\u0004\b\u0000\u0010\u00002\f\u0010\f\u001a\b\u0012\u0004\u0012\u00028\u00000\u000b\u001a-\u0010\u0013\u001a\u00020\u0010\"\u0004\b\u0000\u0010\u0000*\b\u0012\u0004\u0012\u00028\u00000\u000e2\f\u0010\u000f\u001a\b\u0012\u0004\u0012\u00028\u00000\u000eH\u0002¢\u0006\u0004\b\u0011\u0010\u0012¨\u0006\u0014"}, d2 = {"T", "Lgo/u;", "Lkotlin/coroutines/d;", GAMConfig.KEY_CONTEXT, "Landroidx/compose/runtime/State;", "collectAsState", "(Lgo/u;Lkotlin/coroutines/d;Landroidx/compose/runtime/Composer;II)Landroidx/compose/runtime/State;", "R", "Lgo/d;", "initial", "(Lgo/d;Ljava/lang/Object;Lkotlin/coroutines/d;Landroidx/compose/runtime/Composer;II)Landroidx/compose/runtime/State;", "Lkotlin/Function0;", "block", "snapshotFlow", "", "other", "", "intersects$SnapshotStateKt__SnapshotFlowKt", "(Ljava/util/Set;Ljava/util/Set;)Z", "intersects", "runtime_release"}, k = 5, mv = {1, 6, 0}, xs = "androidx/compose/runtime/SnapshotStateKt")
final /* synthetic */ class SnapshotStateKt__SnapshotFlowKt {

    /* JADX INFO: Add missing generic type declarations: [R] */
    /* JADX INFO: renamed from: androidx.compose.runtime.SnapshotStateKt__SnapshotFlowKt$collectAsState$1, reason: invalid class name */
    /* JADX INFO: compiled from: SnapshotFlow.kt */
    @Metadata(k = 3, mv = {1, 6, 0}, xi = 48)
    @d(c = "androidx.compose.runtime.SnapshotStateKt__SnapshotFlowKt$collectAsState$1", f = "SnapshotFlow.kt", l = {65, 66}, m = "invokeSuspend")
    public static final class AnonymousClass1<R> extends SuspendLambda implements p<ProduceStateScope<R>, c<? super r>, Object> {
        public final /* synthetic */ kotlin.coroutines.d $context;
        public final /* synthetic */ go.d<T> $this_collectAsState;
        private /* synthetic */ Object L$0;
        public int label;

        /* JADX INFO: renamed from: androidx.compose.runtime.SnapshotStateKt__SnapshotFlowKt$collectAsState$1$2, reason: invalid class name */
        /* JADX INFO: compiled from: SnapshotFlow.kt */
        @Metadata(k = 3, mv = {1, 6, 0}, xi = 48)
        @d(c = "androidx.compose.runtime.SnapshotStateKt__SnapshotFlowKt$collectAsState$1$2", f = "SnapshotFlow.kt", l = {67}, m = "invokeSuspend")
        public static final class AnonymousClass2 extends SuspendLambda implements p<l0, c<? super r>, Object> {
            public final /* synthetic */ ProduceStateScope<R> $$this$produceState;
            public final /* synthetic */ go.d<T> $this_collectAsState;
            public int label;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            /* JADX WARN: Multi-variable type inference failed */
            public AnonymousClass2(go.d<? extends T> dVar, ProduceStateScope<R> produceStateScope, c<? super AnonymousClass2> cVar) {
                super(2, cVar);
                this.$this_collectAsState = dVar;
                this.$$this$produceState = produceStateScope;
            }

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            @NotNull
            public final c<r> create(@Nullable Object obj, @NotNull c<?> cVar) {
                return new AnonymousClass2(this.$this_collectAsState, this.$$this$produceState, cVar);
            }

            @Override // sn.p
            @Nullable
            /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method and merged with bridge method [inline-methods] */
            public final Object mo2invoke(@NotNull l0 l0Var, @Nullable c<? super r> cVar) {
                return ((AnonymousClass2) create(l0Var, cVar)).invokeSuspend(r.f5635a);
            }

            /* JADX WARN: Type inference fix 'apply assigned field type' failed
            java.lang.UnsupportedOperationException: ArgType.getObject(), call class: class jadx.core.dex.instructions.args.ArgType$UnknownArg
            	at jadx.core.dex.instructions.args.ArgType.getObject(ArgType.java:593)
            	at jadx.core.dex.attributes.nodes.ClassTypeVarsAttr.getTypeVarsMapFor(ClassTypeVarsAttr.java:35)
            	at jadx.core.dex.nodes.utils.TypeUtils.replaceClassGenerics(TypeUtils.java:177)
            	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.insertExplicitUseCast(FixTypesVisitor.java:397)
            	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryFieldTypeWithNewCasts(FixTypesVisitor.java:359)
            	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.applyFieldType(FixTypesVisitor.java:309)
            	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.visit(FixTypesVisitor.java:94)
             */
            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            @Nullable
            public final Object invokeSuspend(@NotNull Object obj) {
                Object objG = a.g();
                int i10 = this.label;
                if (i10 == 0) {
                    kotlin.c.b(obj);
                    go.d<T> dVar = this.$this_collectAsState;
                    final ProduceStateScope<R> produceStateScope = this.$$this$produceState;
                    Object obj2 = new e<T>() { // from class: androidx.compose.runtime.SnapshotStateKt__SnapshotFlowKt.collectAsState.1.2.1
                        @Override // go.e
                        @Nullable
                        public final Object emit(T t10, @NotNull c<? super r> cVar) {
                            produceStateScope.setValue(t10);
                            return r.f5635a;
                        }
                    };
                    this.label = 1;
                    if (dVar.collect(obj2, this) == objG) {
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

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        public AnonymousClass1(kotlin.coroutines.d dVar, go.d<? extends T> dVar2, c<? super AnonymousClass1> cVar) {
            super(2, cVar);
            this.$context = dVar;
            this.$this_collectAsState = dVar2;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @NotNull
        public final c<r> create(@Nullable Object obj, @NotNull c<?> cVar) {
            AnonymousClass1 anonymousClass1 = new AnonymousClass1(this.$context, this.$this_collectAsState, cVar);
            anonymousClass1.L$0 = obj;
            return anonymousClass1;
        }

        @Override // sn.p
        @Nullable
        /* JADX INFO: renamed from: invoke, reason: merged with bridge method [inline-methods] */
        public final Object mo2invoke(@NotNull ProduceStateScope<R> produceStateScope, @Nullable c<? super r> cVar) {
            return ((AnonymousClass1) create(produceStateScope, cVar)).invokeSuspend(r.f5635a);
        }

        /* JADX WARN: Type inference fix 'apply assigned field type' failed
        java.lang.UnsupportedOperationException: ArgType.getObject(), call class: class jadx.core.dex.instructions.args.ArgType$UnknownArg
        	at jadx.core.dex.instructions.args.ArgType.getObject(ArgType.java:593)
        	at jadx.core.dex.attributes.nodes.ClassTypeVarsAttr.getTypeVarsMapFor(ClassTypeVarsAttr.java:35)
        	at jadx.core.dex.nodes.utils.TypeUtils.replaceClassGenerics(TypeUtils.java:177)
        	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.insertExplicitUseCast(FixTypesVisitor.java:397)
        	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryFieldTypeWithNewCasts(FixTypesVisitor.java:359)
        	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.applyFieldType(FixTypesVisitor.java:309)
        	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.visit(FixTypesVisitor.java:94)
         */
        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Nullable
        public final Object invokeSuspend(@NotNull Object obj) {
            Object objG = a.g();
            int i10 = this.label;
            if (i10 == 0) {
                kotlin.c.b(obj);
                final ProduceStateScope produceStateScope = (ProduceStateScope) this.L$0;
                if (tn.p.f(this.$context, EmptyCoroutineContext.INSTANCE)) {
                    go.d<T> dVar = this.$this_collectAsState;
                    Object obj2 = new e<T>() { // from class: androidx.compose.runtime.SnapshotStateKt__SnapshotFlowKt.collectAsState.1.1
                        @Override // go.e
                        @Nullable
                        public final Object emit(T t10, @NotNull c<? super r> cVar) {
                            produceStateScope.setValue(t10);
                            return r.f5635a;
                        }
                    };
                    this.label = 1;
                    if (dVar.collect(obj2, this) == objG) {
                        return objG;
                    }
                } else {
                    kotlin.coroutines.d dVar2 = this.$context;
                    AnonymousClass2 anonymousClass2 = new AnonymousClass2(this.$this_collectAsState, produceStateScope, null);
                    this.label = 2;
                    if (g.g(dVar2, anonymousClass2, this) == objG) {
                        return objG;
                    }
                }
            } else {
                if (i10 != 1 && i10 != 2) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                kotlin.c.b(obj);
            }
            return r.f5635a;
        }
    }

    /* JADX INFO: Add missing generic type declarations: [T] */
    /* JADX INFO: renamed from: androidx.compose.runtime.SnapshotStateKt__SnapshotFlowKt$snapshotFlow$1, reason: invalid class name and case insensitive filesystem */
    /* JADX INFO: compiled from: SnapshotFlow.kt */
    @Metadata(bv = {}, d1 = {"\u0000\f\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0010\u0003\u001a\u00020\u0002\"\u0004\b\u0000\u0010\u0000*\b\u0012\u0004\u0012\u00028\u00000\u0001H\u008a@"}, d2 = {"T", "Lgo/e;", "Lbn/r;", "<anonymous>"}, k = 3, mv = {1, 6, 0})
    @d(c = "androidx.compose.runtime.SnapshotStateKt__SnapshotFlowKt$snapshotFlow$1", f = "SnapshotFlow.kt", l = {134, 138, 160}, m = "invokeSuspend")
    public static final class C13401<T> extends SuspendLambda implements p<e<? super T>, c<? super r>, Object> {
        public final /* synthetic */ sn.a<T> $block;
        public int I$0;
        private /* synthetic */ Object L$0;
        public Object L$1;
        public Object L$2;
        public Object L$3;
        public Object L$4;
        public Object L$5;
        public int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        public C13401(sn.a<? extends T> aVar, c<? super C13401> cVar) {
            super(2, cVar);
            this.$block = aVar;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @NotNull
        public final c<r> create(@Nullable Object obj, @NotNull c<?> cVar) {
            C13401 c13401 = new C13401(this.$block, cVar);
            c13401.L$0 = obj;
            return c13401;
        }

        @Override // sn.p
        @Nullable
        /* JADX INFO: renamed from: invoke, reason: merged with bridge method [inline-methods] */
        public final Object mo2invoke(@NotNull e<? super T> eVar, @Nullable c<? super r> cVar) {
            return ((C13401) create(eVar, cVar)).invokeSuspend(r.f5635a);
        }

        /* JADX WARN: Path cross not found for [B:36:0x00e8, B:40:0x00f1], limit reached: 83 */
        /* JADX WARN: Path cross not found for [B:44:0x0100, B:61:0x0146], limit reached: 83 */
        /* JADX WARN: Path cross not found for [B:61:0x0146, B:44:0x0100], limit reached: 83 */
        /* JADX WARN: Removed duplicated region for block: B:32:0x00db A[RETURN] */
        /* JADX WARN: Removed duplicated region for block: B:33:0x00dc  */
        /* JADX WARN: Removed duplicated region for block: B:44:0x0100 A[Catch: all -> 0x0053, TRY_LEAVE, TryCatch #2 {all -> 0x0053, blocks: (B:34:0x00e4, B:36:0x00e8, B:41:0x00f2, B:44:0x0100, B:48:0x0116, B:50:0x011f, B:59:0x0142, B:60:0x0145, B:11:0x004b, B:45:0x010b, B:47:0x0113, B:56:0x013d, B:57:0x0140, B:46:0x010f), top: B:75:0x004b, inners: #0 }] */
        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @org.jetbrains.annotations.Nullable
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public final java.lang.Object invokeSuspend(@org.jetbrains.annotations.NotNull java.lang.Object r17) throws java.lang.Throwable {
            /*
                Method dump skipped, instruction units count: 350
                To view this dump add '--comments-level debug' option
            */
            throw new UnsupportedOperationException("Method not decompiled: androidx.compose.runtime.SnapshotStateKt__SnapshotFlowKt.C13401.invokeSuspend(java.lang.Object):java.lang.Object");
        }
    }

    @Composable
    @NotNull
    public static final <T extends R, R> State<R> collectAsState(@NotNull go.d<? extends T> dVar, R r10, @Nullable kotlin.coroutines.d dVar2, @Nullable Composer composer, int i10, int i11) {
        tn.p.k(dVar, "<this>");
        composer.startReplaceableGroup(-606625098);
        if ((i11 & 2) != 0) {
            dVar2 = EmptyCoroutineContext.INSTANCE;
        }
        kotlin.coroutines.d dVar3 = dVar2;
        int i12 = i10 >> 3;
        State<R> stateProduceState = SnapshotStateKt.produceState(r10, dVar, dVar3, new AnonymousClass1(dVar3, dVar, null), composer, (i12 & 8) | 576 | (i12 & 14));
        composer.endReplaceableGroup();
        return stateProduceState;
    }

    @Composable
    @NotNull
    public static final <T> State<T> collectAsState(@NotNull u<? extends T> uVar, @Nullable kotlin.coroutines.d dVar, @Nullable Composer composer, int i10, int i11) {
        tn.p.k(uVar, "<this>");
        composer.startReplaceableGroup(-1439883919);
        if ((i11 & 1) != 0) {
            dVar = EmptyCoroutineContext.INSTANCE;
        }
        State<T> stateCollectAsState = SnapshotStateKt.collectAsState(uVar, uVar.getValue(), dVar, composer, IronSourceError.ERROR_NO_INTERNET_CONNECTION, 0);
        composer.endReplaceableGroup();
        return stateCollectAsState;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final <T> boolean intersects$SnapshotStateKt__SnapshotFlowKt(Set<? extends T> set, Set<? extends T> set2) {
        if (set.size() < set2.size()) {
            if (!set.isEmpty()) {
                Iterator<T> it = set.iterator();
                while (it.hasNext()) {
                    if (set2.contains(it.next())) {
                        return true;
                    }
                }
            }
        } else if (!set2.isEmpty()) {
            Iterator<T> it2 = set2.iterator();
            while (it2.hasNext()) {
                if (set.contains(it2.next())) {
                    return true;
                }
            }
        }
        return false;
    }

    @NotNull
    public static final <T> go.d<T> snapshotFlow(@NotNull sn.a<? extends T> aVar) {
        tn.p.k(aVar, "block");
        return f.z(new C13401(aVar, null));
    }
}
