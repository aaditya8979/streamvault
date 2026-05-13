package com.yandex.div.core.view2;

import bn.r;
import com.yandex.div.internal.viewpool.ViewPreCreationProfile;
import com.yandex.div.internal.viewpool.optimization.ViewPreCreationProfileRepository;
import hn.c;
import in.a;
import jn.d;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p000do.l0;
import sn.p;

/* JADX INFO: compiled from: DivViewCreator.kt */
/* JADX INFO: loaded from: classes7.dex */
@d(c = "com.yandex.div.core.view2.DivViewCreator$viewPreCreationProfile$1$1", f = "DivViewCreator.kt", l = {54}, m = "invokeSuspend")
public final class DivViewCreator$viewPreCreationProfile$1$1 extends SuspendLambda implements p<l0, c<? super ViewPreCreationProfile>, Object> {
    public final /* synthetic */ String $it;
    public final /* synthetic */ ViewPreCreationProfileRepository $repository;
    public int label;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public DivViewCreator$viewPreCreationProfile$1$1(ViewPreCreationProfileRepository viewPreCreationProfileRepository, String str, c<? super DivViewCreator$viewPreCreationProfile$1$1> cVar) {
        super(2, cVar);
        this.$repository = viewPreCreationProfileRepository;
        this.$it = str;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @NotNull
    public final c<r> create(@Nullable Object obj, @NotNull c<?> cVar) {
        return new DivViewCreator$viewPreCreationProfile$1$1(this.$repository, this.$it, cVar);
    }

    @Override // sn.p
    @Nullable
    /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method and merged with bridge method [inline-methods] */
    public final Object mo2invoke(@NotNull l0 l0Var, @Nullable c<? super ViewPreCreationProfile> cVar) {
        return ((DivViewCreator$viewPreCreationProfile$1$1) create(l0Var, cVar)).invokeSuspend(r.f5635a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @Nullable
    public final Object invokeSuspend(@NotNull Object obj) {
        Object objG = a.g();
        int i10 = this.label;
        if (i10 == 0) {
            kotlin.c.b(obj);
            ViewPreCreationProfileRepository viewPreCreationProfileRepository = this.$repository;
            String str = this.$it;
            this.label = 1;
            obj = viewPreCreationProfileRepository.get(str, this);
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
