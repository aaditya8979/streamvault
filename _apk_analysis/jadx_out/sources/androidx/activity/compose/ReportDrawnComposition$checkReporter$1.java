package androidx.activity.compose;

import bn.r;
import kotlin.jvm.internal.FunctionReferenceImpl;
import org.jetbrains.annotations.NotNull;
import sn.l;

/* JADX INFO: compiled from: ReportDrawn.kt */
/* JADX INFO: loaded from: classes10.dex */
public /* synthetic */ class ReportDrawnComposition$checkReporter$1 extends FunctionReferenceImpl implements l<sn.a<? extends Boolean>, r> {
    public ReportDrawnComposition$checkReporter$1(Object obj) {
        super(1, obj, ReportDrawnComposition.class, "observeReporter", "observeReporter(Lkotlin/jvm/functions/Function0;)V", 0);
    }

    @Override // sn.l
    public /* bridge */ /* synthetic */ r invoke(sn.a<? extends Boolean> aVar) {
        invoke2((sn.a<Boolean>) aVar);
        return r.f5635a;
    }

    /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
    public final void invoke2(@NotNull sn.a<Boolean> aVar) {
        ((ReportDrawnComposition) this.receiver).observeReporter(aVar);
    }
}
