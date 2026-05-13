package coil;

import android.graphics.Bitmap;
import bn.r;
import coil.intercept.RealInterceptorChain;
import hn.c;
import in.a;
import j0.f;
import j0.g;
import jn.d;
import k0.Size;
import kotlin.Metadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p000do.l0;
import sn.p;

/* JADX INFO: compiled from: RealImageLoader.kt */
/* JADX INFO: loaded from: classes7.dex */
@Metadata(bv = {}, d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u008a@"}, d2 = {"Ldo/l0;", "Lj0/g;", "<anonymous>"}, k = 3, mv = {1, 7, 1})
@d(c = "coil.RealImageLoader$executeMain$result$1", f = "RealImageLoader.kt", l = {193}, m = "invokeSuspend")
public final class RealImageLoader$executeMain$result$1 extends SuspendLambda implements p<l0, c<? super g>, Object> {
    public final /* synthetic */ y.c $eventListener;
    public final /* synthetic */ Bitmap $placeholderBitmap;
    public final /* synthetic */ f $request;
    public final /* synthetic */ Size $size;
    public int label;
    public final /* synthetic */ RealImageLoader this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public RealImageLoader$executeMain$result$1(f fVar, RealImageLoader realImageLoader, Size size, y.c cVar, Bitmap bitmap, c<? super RealImageLoader$executeMain$result$1> cVar2) {
        super(2, cVar2);
        this.$request = fVar;
        this.this$0 = realImageLoader;
        this.$size = size;
        this.$eventListener = cVar;
        this.$placeholderBitmap = bitmap;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @NotNull
    public final c<r> create(@Nullable Object obj, @NotNull c<?> cVar) {
        return new RealImageLoader$executeMain$result$1(this.$request, this.this$0, this.$size, this.$eventListener, this.$placeholderBitmap, cVar);
    }

    @Override // sn.p
    @Nullable
    /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method and merged with bridge method [inline-methods] */
    public final Object mo2invoke(@NotNull l0 l0Var, @Nullable c<? super g> cVar) {
        return ((RealImageLoader$executeMain$result$1) create(l0Var, cVar)).invokeSuspend(r.f5635a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @Nullable
    public final Object invokeSuspend(@NotNull Object obj) {
        Object objG = a.g();
        int i10 = this.label;
        if (i10 == 0) {
            kotlin.c.b(obj);
            RealInterceptorChain realInterceptorChain = new RealInterceptorChain(this.$request, this.this$0.interceptors, 0, this.$request, this.$size, this.$eventListener, this.$placeholderBitmap != null);
            f fVar = this.$request;
            this.label = 1;
            obj = realInterceptorChain.f(fVar, this);
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
