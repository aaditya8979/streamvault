package androidx.activity.compose;

import androidx.activity.BackEventCompat;
import bn.r;
import go.e;
import go.f;
import hn.c;
import jn.d;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.internal.Ref$BooleanRef;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p000do.l0;
import sn.p;
import sn.q;

/* JADX INFO: compiled from: PredictiveBackHandler.kt */
/* JADX INFO: loaded from: classes8.dex */
@d(c = "androidx.activity.compose.OnBackInstance$job$1", f = "PredictiveBackHandler.kt", l = {160}, m = "invokeSuspend")
public final class OnBackInstance$job$1 extends SuspendLambda implements p<l0, c<? super r>, Object> {
    public final /* synthetic */ p<go.d<BackEventCompat>, c<? super r>, Object> $onBack;
    public Object L$0;
    public int label;
    public final /* synthetic */ OnBackInstance this$0;

    /* JADX INFO: renamed from: androidx.activity.compose.OnBackInstance$job$1$1, reason: invalid class name */
    /* JADX INFO: compiled from: PredictiveBackHandler.kt */
    @d(c = "androidx.activity.compose.OnBackInstance$job$1$1", f = "PredictiveBackHandler.kt", l = {}, m = "invokeSuspend")
    public static final class AnonymousClass1 extends SuspendLambda implements q<e<? super BackEventCompat>, Throwable, c<? super r>, Object> {
        public final /* synthetic */ Ref$BooleanRef $completed;
        public int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass1(Ref$BooleanRef ref$BooleanRef, c<? super AnonymousClass1> cVar) {
            super(3, cVar);
            this.$completed = ref$BooleanRef;
        }

        @Override // sn.q
        @Nullable
        public final Object invoke(@NotNull e<? super BackEventCompat> eVar, @Nullable Throwable th2, @Nullable c<? super r> cVar) {
            return new AnonymousClass1(this.$completed, cVar).invokeSuspend(r.f5635a);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Nullable
        public final Object invokeSuspend(@NotNull Object obj) {
            in.a.g();
            if (this.label != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            kotlin.c.b(obj);
            this.$completed.element = true;
            return r.f5635a;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public OnBackInstance$job$1(p<? super go.d<BackEventCompat>, ? super c<? super r>, ? extends Object> pVar, OnBackInstance onBackInstance, c<? super OnBackInstance$job$1> cVar) {
        super(2, cVar);
        this.$onBack = pVar;
        this.this$0 = onBackInstance;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @NotNull
    public final c<r> create(@Nullable Object obj, @NotNull c<?> cVar) {
        return new OnBackInstance$job$1(this.$onBack, this.this$0, cVar);
    }

    @Override // sn.p
    @Nullable
    /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method and merged with bridge method [inline-methods] */
    public final Object mo2invoke(@NotNull l0 l0Var, @Nullable c<? super r> cVar) {
        return ((OnBackInstance$job$1) create(l0Var, cVar)).invokeSuspend(r.f5635a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @Nullable
    public final Object invokeSuspend(@NotNull Object obj) {
        Ref$BooleanRef ref$BooleanRef;
        Object objG = in.a.g();
        int i10 = this.label;
        if (i10 == 0) {
            kotlin.c.b(obj);
            Ref$BooleanRef ref$BooleanRef2 = new Ref$BooleanRef();
            p<go.d<BackEventCompat>, c<? super r>, Object> pVar = this.$onBack;
            go.d<BackEventCompat> dVarF = f.F(f.o(this.this$0.getChannel()), new AnonymousClass1(ref$BooleanRef2, null));
            this.L$0 = ref$BooleanRef2;
            this.label = 1;
            if (pVar.mo2invoke(dVarF, this) == objG) {
                return objG;
            }
            ref$BooleanRef = ref$BooleanRef2;
        } else {
            if (i10 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ref$BooleanRef = (Ref$BooleanRef) this.L$0;
            kotlin.c.b(obj);
        }
        if (ref$BooleanRef.element) {
            return r.f5635a;
        }
        throw new IllegalStateException("You must collect the progress flow".toString());
    }
}
