package coil.intercept;

import bn.r;
import coil.intercept.EngineInterceptor;
import coil.memory.MemoryCache;
import e0.a;
import hn.c;
import j0.f;
import j0.j;
import j0.m;
import jn.d;
import kotlin.Metadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import o0.i;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p000do.l0;
import sn.p;

/* JADX INFO: compiled from: EngineInterceptor.kt */
/* JADX INFO: loaded from: classes10.dex */
@Metadata(bv = {}, d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u008a@"}, d2 = {"Ldo/l0;", "Lj0/m;", "<anonymous>"}, k = 3, mv = {1, 7, 1})
@d(c = "coil.intercept.EngineInterceptor$intercept$2", f = "EngineInterceptor.kt", l = {75}, m = "invokeSuspend")
public final class EngineInterceptor$intercept$2 extends SuspendLambda implements p<l0, c<? super m>, Object> {
    public final /* synthetic */ MemoryCache.Key $cacheKey;
    public final /* synthetic */ a.InterfaceC0737a $chain;
    public final /* synthetic */ y.c $eventListener;
    public final /* synthetic */ Object $mappedData;
    public final /* synthetic */ j $options;
    public final /* synthetic */ f $request;
    public int label;
    public final /* synthetic */ EngineInterceptor this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public EngineInterceptor$intercept$2(EngineInterceptor engineInterceptor, f fVar, Object obj, j jVar, y.c cVar, MemoryCache.Key key, a.InterfaceC0737a interfaceC0737a, c<? super EngineInterceptor$intercept$2> cVar2) {
        super(2, cVar2);
        this.this$0 = engineInterceptor;
        this.$request = fVar;
        this.$mappedData = obj;
        this.$options = jVar;
        this.$eventListener = cVar;
        this.$cacheKey = key;
        this.$chain = interfaceC0737a;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @NotNull
    public final c<r> create(@Nullable Object obj, @NotNull c<?> cVar) {
        return new EngineInterceptor$intercept$2(this.this$0, this.$request, this.$mappedData, this.$options, this.$eventListener, this.$cacheKey, this.$chain, cVar);
    }

    @Override // sn.p
    @Nullable
    /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method and merged with bridge method [inline-methods] */
    public final Object mo2invoke(@NotNull l0 l0Var, @Nullable c<? super m> cVar) {
        return ((EngineInterceptor$intercept$2) create(l0Var, cVar)).invokeSuspend(r.f5635a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @Nullable
    public final Object invokeSuspend(@NotNull Object obj) throws Throwable {
        Object objG = in.a.g();
        int i10 = this.label;
        if (i10 == 0) {
            kotlin.c.b(obj);
            EngineInterceptor engineInterceptor = this.this$0;
            f fVar = this.$request;
            Object obj2 = this.$mappedData;
            j jVar = this.$options;
            y.c cVar = this.$eventListener;
            this.label = 1;
            obj = engineInterceptor.i(fVar, obj2, jVar, cVar, this);
            if (obj == objG) {
                return objG;
            }
        } else {
            if (i10 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            kotlin.c.b(obj);
        }
        EngineInterceptor.b bVar = (EngineInterceptor.b) obj;
        return new m(bVar.getDrawable(), this.$request, bVar.getDataSource(), this.this$0.memoryCacheService.h(this.$cacheKey, this.$request, bVar) ? this.$cacheKey : null, bVar.getDiskCacheKey(), bVar.getIsSampled(), i.u(this.$chain));
    }
}
