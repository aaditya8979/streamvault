package kotlinx.coroutines.flow.internal;

import bn.r;
import go.e;
import hn.c;
import kotlin.jvm.internal.FunctionReferenceImpl;
import sn.q;

/* JADX INFO: compiled from: SafeCollector.kt */
/* JADX INFO: loaded from: classes6.dex */
public /* synthetic */ class SafeCollectorKt$emitFun$1 extends FunctionReferenceImpl implements q<e<? super Object>, Object, c<? super r>, Object> {
    public static final SafeCollectorKt$emitFun$1 INSTANCE = new SafeCollectorKt$emitFun$1();

    public SafeCollectorKt$emitFun$1() {
        super(3, e.class, "emit", "emit(Ljava/lang/Object;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", 0);
    }

    /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
    public final Object invoke2(e<Object> eVar, Object obj, c<? super r> cVar) {
        return eVar.emit(obj, cVar);
    }

    @Override // sn.q
    public /* bridge */ /* synthetic */ Object invoke(e<? super Object> eVar, Object obj, c<? super r> cVar) {
        return invoke2((e<Object>) eVar, obj, cVar);
    }
}
