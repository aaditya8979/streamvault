package coil;

import bn.r;
import hn.c;
import in.a;
import j0.f;
import j0.g;
import jn.d;
import kotlin.Metadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import l0.b;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p000do.i;
import p000do.l0;
import p000do.p0;
import p000do.w0;
import sn.p;

/* JADX INFO: compiled from: RealImageLoader.kt */
/* JADX INFO: loaded from: classes7.dex */
@Metadata(bv = {}, d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u008a@"}, d2 = {"Ldo/l0;", "Lj0/g;", "<anonymous>"}, k = 3, mv = {1, 7, 1})
@d(c = "coil.RealImageLoader$execute$2", f = "RealImageLoader.kt", l = {146}, m = "invokeSuspend")
public final class RealImageLoader$execute$2 extends SuspendLambda implements p<l0, c<? super g>, Object> {
    public final /* synthetic */ f $request;
    private /* synthetic */ Object L$0;
    public int label;
    public final /* synthetic */ RealImageLoader this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public RealImageLoader$execute$2(f fVar, RealImageLoader realImageLoader, c<? super RealImageLoader$execute$2> cVar) {
        super(2, cVar);
        this.$request = fVar;
        this.this$0 = realImageLoader;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @NotNull
    public final c<r> create(@Nullable Object obj, @NotNull c<?> cVar) {
        RealImageLoader$execute$2 realImageLoader$execute$2 = new RealImageLoader$execute$2(this.$request, this.this$0, cVar);
        realImageLoader$execute$2.L$0 = obj;
        return realImageLoader$execute$2;
    }

    @Override // sn.p
    @Nullable
    /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method and merged with bridge method [inline-methods] */
    public final Object mo2invoke(@NotNull l0 l0Var, @Nullable c<? super g> cVar) {
        return ((RealImageLoader$execute$2) create(l0Var, cVar)).invokeSuspend(r.f5635a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @Nullable
    public final Object invokeSuspend(@NotNull Object obj) {
        Object objG = a.g();
        int i10 = this.label;
        if (i10 == 0) {
            kotlin.c.b(obj);
            p0<? extends g> p0VarB = i.b((l0) this.L$0, w0.c().M(), null, new RealImageLoader$execute$2$job$1(this.this$0, this.$request, null), 2, null);
            if (this.$request.getAndroidx.constraintlayout.core.motion.utils.TypedValues.AttributesType.S_TARGET java.lang.String() instanceof b) {
                o0.i.m(((b) this.$request.getAndroidx.constraintlayout.core.motion.utils.TypedValues.AttributesType.S_TARGET java.lang.String()).getView()).b(p0VarB);
            }
            this.label = 1;
            obj = p0VarB.N(this);
            if (obj == objG) {
                return objG;
            }
        } else {
            if (i10 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            kotlin.c.b(obj);
        }
        return obj;
    }
}
