package androidx.compose.ui.semantics;

import androidx.compose.runtime.internal.StabilityInferred;
import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;
import sn.a;
import tn.i;
import tn.p;

/* JADX INFO: compiled from: SemanticsProperties.kt */
/* JADX INFO: loaded from: classes9.dex */
@StabilityInferred(parameters = 0)
@Metadata(bv = {}, d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0007\n\u0002\b\u0006\n\u0002\u0010\u000b\n\u0002\b\u0007\b\u0007\u0018\u00002\u00020\u0001B-\u0012\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004\u0012\f\u0010\n\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004\u0012\b\b\u0002\u0010\r\u001a\u00020\f¢\u0006\u0004\b\u0011\u0010\u0012J\b\u0010\u0003\u001a\u00020\u0002H\u0016R\u001d\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u00048\u0006¢\u0006\f\n\u0004\b\u0006\u0010\u0007\u001a\u0004\b\b\u0010\tR\u001d\u0010\n\u001a\b\u0012\u0004\u0012\u00020\u00050\u00048\u0006¢\u0006\f\n\u0004\b\n\u0010\u0007\u001a\u0004\b\u000b\u0010\tR\u0017\u0010\r\u001a\u00020\f8\u0006¢\u0006\f\n\u0004\b\r\u0010\u000e\u001a\u0004\b\u000f\u0010\u0010¨\u0006\u0013"}, d2 = {"Landroidx/compose/ui/semantics/ScrollAxisRange;", "", "", "toString", "Lkotlin/Function0;", "", "value", "Lsn/a;", "getValue", "()Lsn/a;", "maxValue", "getMaxValue", "", "reverseScrolling", "Z", "getReverseScrolling", "()Z", "<init>", "(Lsn/a;Lsn/a;Z)V", "ui_release"}, k = 1, mv = {1, 6, 0})
public final class ScrollAxisRange {
    public static final int $stable = 0;

    @NotNull
    private final a<Float> maxValue;
    private final boolean reverseScrolling;

    @NotNull
    private final a<Float> value;

    public ScrollAxisRange(@NotNull a<Float> aVar, @NotNull a<Float> aVar2, boolean z10) {
        p.k(aVar, "value");
        p.k(aVar2, "maxValue");
        this.value = aVar;
        this.maxValue = aVar2;
        this.reverseScrolling = z10;
    }

    public /* synthetic */ ScrollAxisRange(a aVar, a aVar2, boolean z10, int i10, i iVar) {
        this(aVar, aVar2, (i10 & 4) != 0 ? false : z10);
    }

    @NotNull
    public final a<Float> getMaxValue() {
        return this.maxValue;
    }

    public final boolean getReverseScrolling() {
        return this.reverseScrolling;
    }

    @NotNull
    public final a<Float> getValue() {
        return this.value;
    }

    @NotNull
    public String toString() {
        return "ScrollAxisRange(value=" + this.value.invoke().floatValue() + ", maxValue=" + this.maxValue.invoke().floatValue() + ", reverseScrolling=" + this.reverseScrolling + ')';
    }
}
