package coil.intercept;

import bn.r;
import coil.intercept.EngineInterceptor;
import d0.h;
import d0.l;
import hn.c;
import in.a;
import j0.f;
import j0.j;
import jn.d;
import kotlin.Metadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.internal.Ref$ObjectRef;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p000do.l0;
import sn.p;
import y.b;

/* JADX INFO: compiled from: EngineInterceptor.kt */
/* JADX INFO: loaded from: classes10.dex */
@Metadata(bv = {}, d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u008a@"}, d2 = {"Ldo/l0;", "Lcoil/intercept/EngineInterceptor$b;", "<anonymous>"}, k = 3, mv = {1, 7, 1})
@d(c = "coil.intercept.EngineInterceptor$execute$executeResult$1", f = "EngineInterceptor.kt", l = {127}, m = "invokeSuspend")
public final class EngineInterceptor$execute$executeResult$1 extends SuspendLambda implements p<l0, c<? super EngineInterceptor.b>, Object> {
    public final /* synthetic */ Ref$ObjectRef<b> $components;
    public final /* synthetic */ y.c $eventListener;
    public final /* synthetic */ Ref$ObjectRef<h> $fetchResult;
    public final /* synthetic */ Object $mappedData;
    public final /* synthetic */ Ref$ObjectRef<j> $options;
    public final /* synthetic */ f $request;
    public int label;
    public final /* synthetic */ EngineInterceptor this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public EngineInterceptor$execute$executeResult$1(EngineInterceptor engineInterceptor, Ref$ObjectRef<h> ref$ObjectRef, Ref$ObjectRef<b> ref$ObjectRef2, f fVar, Object obj, Ref$ObjectRef<j> ref$ObjectRef3, y.c cVar, c<? super EngineInterceptor$execute$executeResult$1> cVar2) {
        super(2, cVar2);
        this.this$0 = engineInterceptor;
        this.$fetchResult = ref$ObjectRef;
        this.$components = ref$ObjectRef2;
        this.$request = fVar;
        this.$mappedData = obj;
        this.$options = ref$ObjectRef3;
        this.$eventListener = cVar;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @NotNull
    public final c<r> create(@Nullable Object obj, @NotNull c<?> cVar) {
        return new EngineInterceptor$execute$executeResult$1(this.this$0, this.$fetchResult, this.$components, this.$request, this.$mappedData, this.$options, this.$eventListener, cVar);
    }

    @Override // sn.p
    @Nullable
    /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method and merged with bridge method [inline-methods] */
    public final Object mo2invoke(@NotNull l0 l0Var, @Nullable c<? super EngineInterceptor.b> cVar) {
        return ((EngineInterceptor$execute$executeResult$1) create(l0Var, cVar)).invokeSuspend(r.f5635a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @Nullable
    public final Object invokeSuspend(@NotNull Object obj) {
        Object objG = a.g();
        int i10 = this.label;
        if (i10 == 0) {
            kotlin.c.b(obj);
            EngineInterceptor engineInterceptor = this.this$0;
            l lVar = (l) this.$fetchResult.element;
            b bVar = this.$components.element;
            f fVar = this.$request;
            Object obj2 = this.$mappedData;
            j jVar = this.$options.element;
            y.c cVar = this.$eventListener;
            this.label = 1;
            obj = engineInterceptor.h(lVar, bVar, fVar, obj2, jVar, cVar, this);
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
