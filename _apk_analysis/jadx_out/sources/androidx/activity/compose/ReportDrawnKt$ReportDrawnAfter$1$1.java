package androidx.activity.compose;

import androidx.activity.FullyDrawnReporter;
import bn.r;
import hn.c;
import jn.d;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p000do.l0;
import sn.l;
import sn.p;

/* JADX INFO: compiled from: ReportDrawn.kt */
/* JADX INFO: loaded from: classes9.dex */
@d(c = "androidx.activity.compose.ReportDrawnKt$ReportDrawnAfter$1$1", f = "ReportDrawn.kt", l = {182}, m = "invokeSuspend")
public final class ReportDrawnKt$ReportDrawnAfter$1$1 extends SuspendLambda implements p<l0, c<? super r>, Object> {
    public final /* synthetic */ l<c<? super r>, Object> $block;
    public final /* synthetic */ FullyDrawnReporter $fullyDrawnReporter;
    public Object L$0;
    public int label;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public ReportDrawnKt$ReportDrawnAfter$1$1(FullyDrawnReporter fullyDrawnReporter, l<? super c<? super r>, ? extends Object> lVar, c<? super ReportDrawnKt$ReportDrawnAfter$1$1> cVar) {
        super(2, cVar);
        this.$fullyDrawnReporter = fullyDrawnReporter;
        this.$block = lVar;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @NotNull
    public final c<r> create(@Nullable Object obj, @NotNull c<?> cVar) {
        return new ReportDrawnKt$ReportDrawnAfter$1$1(this.$fullyDrawnReporter, this.$block, cVar);
    }

    @Override // sn.p
    @Nullable
    /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method and merged with bridge method [inline-methods] */
    public final Object mo2invoke(@NotNull l0 l0Var, @Nullable c<? super r> cVar) {
        return ((ReportDrawnKt$ReportDrawnAfter$1$1) create(l0Var, cVar)).invokeSuspend(r.f5635a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @Nullable
    public final Object invokeSuspend(@NotNull Object obj) throws Throwable {
        FullyDrawnReporter fullyDrawnReporter;
        Throwable th2;
        Object objG = in.a.g();
        int i10 = this.label;
        if (i10 == 0) {
            kotlin.c.b(obj);
            FullyDrawnReporter fullyDrawnReporter2 = this.$fullyDrawnReporter;
            l<c<? super r>, Object> lVar = this.$block;
            fullyDrawnReporter2.addReporter();
            if (!fullyDrawnReporter2.isFullyDrawnReported()) {
                try {
                    this.L$0 = fullyDrawnReporter2;
                    this.label = 1;
                    if (lVar.invoke(this) == objG) {
                        return objG;
                    }
                    fullyDrawnReporter = fullyDrawnReporter2;
                    fullyDrawnReporter.removeReporter();
                } catch (Throwable th3) {
                    fullyDrawnReporter = fullyDrawnReporter2;
                    th2 = th3;
                    fullyDrawnReporter.removeReporter();
                    throw th2;
                }
            }
        } else {
            if (i10 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            fullyDrawnReporter = (FullyDrawnReporter) this.L$0;
            try {
                kotlin.c.b(obj);
                fullyDrawnReporter.removeReporter();
            } catch (Throwable th4) {
                th2 = th4;
                fullyDrawnReporter.removeReporter();
                throw th2;
            }
        }
        return r.f5635a;
    }
}
