package androidx.compose.runtime;

import androidx.exifinterface.media.ExifInterface;
import bn.r;
import cn.b0;
import hn.c;
import in.a;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import jn.d;
import kotlin.Metadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p000do.i;
import p000do.l0;
import sn.p;
import sn.q;

/* JADX INFO: compiled from: Recomposer.kt */
/* JADX INFO: loaded from: classes6.dex */
@Metadata(bv = {}, d1 = {"\u00006\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0005\n\u0002\u0010%\n\u0002\u0010!\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0010\b\n\u0002\b\u0006\u001aC\u0010\u0007\u001a\u00028\u0000\"\u0004\b\u0000\u0010\u00002(\u0010\u0006\u001a$\b\u0001\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u0003\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00000\u0004\u0012\u0006\u0012\u0004\u0018\u00010\u00050\u0001H\u0086@ø\u0001\u0000¢\u0006\u0004\b\u0007\u0010\b\u001aA\u0010\u0010\u001a\u00020\u000f\"\u0004\b\u0000\u0010\t\"\u0004\b\u0001\u0010\n*\u0014\u0012\u0004\u0012\u00028\u0000\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00010\f0\u000b2\u0006\u0010\r\u001a\u00028\u00002\u0006\u0010\u000e\u001a\u00028\u0001H\u0000¢\u0006\u0004\b\u0010\u0010\u0011\u001a;\u0010\u0012\u001a\u0004\u0018\u00018\u0001\"\u0004\b\u0000\u0010\t\"\u0004\b\u0001\u0010\n*\u0014\u0012\u0004\u0012\u00028\u0000\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00010\f0\u000b2\u0006\u0010\r\u001a\u00028\u0000H\u0000¢\u0006\u0004\b\u0012\u0010\u0013\"\u0014\u0010\u0015\u001a\u00020\u00148\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0015\u0010\u0016\"\u0014\u0010\u0017\u001a\u00020\u00058\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0017\u0010\u0018\"\u0014\u0010\u0019\u001a\u00020\u00058\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0019\u0010\u0018\u0082\u0002\u0004\n\u0002\b\u0019¨\u0006\u001a"}, d2 = {"R", "Lkotlin/Function3;", "Ldo/l0;", "Landroidx/compose/runtime/Recomposer;", "Lhn/c;", "", "block", "withRunningRecomposer", "(Lsn/q;Lhn/c;)Ljava/lang/Object;", "K", ExifInterface.GPS_MEASUREMENT_INTERRUPTED, "", "", "key", "value", "", "addMultiValue", "(Ljava/util/Map;Ljava/lang/Object;Ljava/lang/Object;)Z", "removeLastMultiValue", "(Ljava/util/Map;Ljava/lang/Object;)Ljava/lang/Object;", "", "RecomposerCompoundHashKey", "I", "ProduceAnotherFrame", "Ljava/lang/Object;", "FramePending", "runtime_release"}, k = 2, mv = {1, 6, 0})
public final class RecomposerKt {
    private static final int RecomposerCompoundHashKey = 1000;

    @NotNull
    private static final Object ProduceAnotherFrame = new Object();

    @NotNull
    private static final Object FramePending = new Object();

    /* JADX INFO: Add missing generic type declarations: [R] */
    /* JADX INFO: renamed from: androidx.compose.runtime.RecomposerKt$withRunningRecomposer$2, reason: invalid class name */
    /* JADX INFO: compiled from: Recomposer.kt */
    @Metadata(bv = {}, d1 = {"\u0000\b\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0002\u001a\u00028\u0000\"\u0004\b\u0000\u0010\u0000*\u00020\u0001H\u008a@"}, d2 = {"R", "Ldo/l0;", "<anonymous>"}, k = 3, mv = {1, 6, 0})
    @d(c = "androidx.compose.runtime.RecomposerKt$withRunningRecomposer$2", f = "Recomposer.kt", l = {69, 71}, m = "invokeSuspend")
    public static final class AnonymousClass2<R> extends SuspendLambda implements p<l0, c<? super R>, Object> {
        public final /* synthetic */ q<l0, Recomposer, c<? super R>, Object> $block;
        private /* synthetic */ Object L$0;
        public int label;

        /* JADX INFO: renamed from: androidx.compose.runtime.RecomposerKt$withRunningRecomposer$2$1, reason: invalid class name */
        /* JADX INFO: compiled from: Recomposer.kt */
        @Metadata(bv = {}, d1 = {"\u0000\f\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0010\u0003\u001a\u00020\u0002\"\u0004\b\u0000\u0010\u0000*\u00020\u0001H\u008a@"}, d2 = {"R", "Ldo/l0;", "Lbn/r;", "<anonymous>"}, k = 3, mv = {1, 6, 0})
        @d(c = "androidx.compose.runtime.RecomposerKt$withRunningRecomposer$2$1", f = "Recomposer.kt", l = {68}, m = "invokeSuspend")
        public static final class AnonymousClass1 extends SuspendLambda implements p<l0, c<? super r>, Object> {
            public final /* synthetic */ Recomposer $recomposer;
            public int label;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public AnonymousClass1(Recomposer recomposer, c<? super AnonymousClass1> cVar) {
                super(2, cVar);
                this.$recomposer = recomposer;
            }

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            @NotNull
            public final c<r> create(@Nullable Object obj, @NotNull c<?> cVar) {
                return new AnonymousClass1(this.$recomposer, cVar);
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
                Object objG = a.g();
                int i10 = this.label;
                if (i10 == 0) {
                    kotlin.c.b(obj);
                    Recomposer recomposer = this.$recomposer;
                    this.label = 1;
                    if (recomposer.runRecomposeAndApplyChanges(this) == objG) {
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
        public AnonymousClass2(q<? super l0, ? super Recomposer, ? super c<? super R>, ? extends Object> qVar, c<? super AnonymousClass2> cVar) {
            super(2, cVar);
            this.$block = qVar;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @NotNull
        public final c<r> create(@Nullable Object obj, @NotNull c<?> cVar) {
            AnonymousClass2 anonymousClass2 = new AnonymousClass2(this.$block, cVar);
            anonymousClass2.L$0 = obj;
            return anonymousClass2;
        }

        @Override // sn.p
        @Nullable
        /* JADX INFO: renamed from: invoke, reason: merged with bridge method [inline-methods] */
        public final Object mo2invoke(@NotNull l0 l0Var, @Nullable c<? super R> cVar) {
            return ((AnonymousClass2) create(l0Var, cVar)).invokeSuspend(r.f5635a);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Nullable
        public final Object invokeSuspend(@NotNull Object obj) {
            Recomposer recomposer;
            Object objG = a.g();
            int i10 = this.label;
            if (i10 == 0) {
                kotlin.c.b(obj);
                l0 l0Var = (l0) this.L$0;
                recomposer = new Recomposer(l0Var.getCoroutineContext());
                i.d(l0Var, null, null, new AnonymousClass1(recomposer, null), 3, null);
                q<l0, Recomposer, c<? super R>, Object> qVar = this.$block;
                this.L$0 = recomposer;
                this.label = 1;
                obj = qVar.invoke(l0Var, recomposer, this);
                if (obj == objG) {
                    return objG;
                }
            } else {
                if (i10 != 1) {
                    if (i10 != 2) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    Object obj2 = this.L$0;
                    kotlin.c.b(obj);
                    return obj2;
                }
                recomposer = (Recomposer) this.L$0;
                kotlin.c.b(obj);
            }
            recomposer.close();
            this.L$0 = obj;
            this.label = 2;
            return recomposer.join(this) == objG ? objG : obj;
        }
    }

    public static final <K, V> boolean addMultiValue(@NotNull Map<K, List<V>> map, K k10, V v10) {
        tn.p.k(map, "<this>");
        List<V> arrayList = map.get(k10);
        if (arrayList == null) {
            arrayList = new ArrayList<>();
            map.put(k10, arrayList);
        }
        return arrayList.add(v10);
    }

    @Nullable
    public static final <K, V> V removeLastMultiValue(@NotNull Map<K, List<V>> map, K k10) {
        tn.p.k(map, "<this>");
        List<V> list = map.get(k10);
        if (list == null) {
            return null;
        }
        V v10 = (V) b0.P(list);
        if (!list.isEmpty()) {
            return v10;
        }
        map.remove(k10);
        return v10;
    }

    @Nullable
    public static final <R> Object withRunningRecomposer(@NotNull q<? super l0, ? super Recomposer, ? super c<? super R>, ? extends Object> qVar, @NotNull c<? super R> cVar) {
        return kotlinx.coroutines.d.f(new AnonymousClass2(qVar, null), cVar);
    }
}
