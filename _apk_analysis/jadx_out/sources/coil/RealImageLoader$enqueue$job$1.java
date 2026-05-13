package coil;

import bn.r;
import hn.c;
import in.a;
import j0.f;
import j0.g;
import jn.d;
import kotlin.Metadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import o0.q;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p000do.l0;
import sn.p;

/* JADX INFO: compiled from: RealImageLoader.kt */
/* JADX INFO: loaded from: classes7.dex */
@Metadata(bv = {}, d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u008a@"}, d2 = {"Ldo/l0;", "Lj0/g;", "<anonymous>"}, k = 3, mv = {1, 7, 1})
@d(c = "coil.RealImageLoader$enqueue$job$1", f = "RealImageLoader.kt", l = {123}, m = "invokeSuspend")
public final class RealImageLoader$enqueue$job$1 extends SuspendLambda implements p<l0, c<? super g>, Object> {
    public final /* synthetic */ f $request;
    public int label;
    public final /* synthetic */ RealImageLoader this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public RealImageLoader$enqueue$job$1(RealImageLoader realImageLoader, f fVar, c<? super RealImageLoader$enqueue$job$1> cVar) {
        super(2, cVar);
        this.this$0 = realImageLoader;
        this.$request = fVar;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @NotNull
    public final c<r> create(@Nullable Object obj, @NotNull c<?> cVar) {
        return new RealImageLoader$enqueue$job$1(this.this$0, this.$request, cVar);
    }

    @Override // sn.p
    @Nullable
    /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method and merged with bridge method [inline-methods] */
    public final Object mo2invoke(@NotNull l0 l0Var, @Nullable c<? super g> cVar) {
        return ((RealImageLoader$enqueue$job$1) create(l0Var, cVar)).invokeSuspend(r.f5635a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @Nullable
    public final Object invokeSuspend(@NotNull Object obj) {
        q logger;
        Object objG = a.g();
        int i10 = this.label;
        if (i10 == 0) {
            kotlin.c.b(obj);
            RealImageLoader realImageLoader = this.this$0;
            f fVar = this.$request;
            this.label = 1;
            obj = realImageLoader.h(fVar, 0, this);
            if (obj == objG) {
                return objG;
            }
        } else {
            if (i10 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            kotlin.c.b(obj);
        }
        RealImageLoader realImageLoader2 = this.this$0;
        g gVar = (g) obj;
        if ((gVar instanceof j0.d) && (logger = realImageLoader2.getLogger()) != null) {
            o0.g.a(logger, "RealImageLoader", ((j0.d) gVar).getThrowable());
        }
        return obj;
    }
}
