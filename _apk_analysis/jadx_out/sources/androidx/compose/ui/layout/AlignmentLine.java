package androidx.compose.ui.layout;

import androidx.compose.runtime.Immutable;
import io.bidmachine.iab.vast.tags.VastTagName;
import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;
import sn.p;
import tn.i;

/* JADX INFO: compiled from: AlignmentLine.kt */
/* JADX INFO: loaded from: classes11.dex */
@Immutable
@Metadata(bv = {}, d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b7\u0018\u0000 \n2\u00020\u0001:\u0001\nB#\b\u0004\u0012\u0018\u0010\u0004\u001a\u0014\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00030\u0002¢\u0006\u0004\b\b\u0010\tR,\u0010\u0004\u001a\u0014\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00030\u00028\u0000X\u0080\u0004¢\u0006\f\n\u0004\b\u0004\u0010\u0005\u001a\u0004\b\u0006\u0010\u0007\u0082\u0001\u0002\u000b\f¨\u0006\r"}, d2 = {"Landroidx/compose/ui/layout/AlignmentLine;", "", "Lkotlin/Function2;", "", "merger", "Lsn/p;", "getMerger$ui_release", "()Lsn/p;", "<init>", "(Lsn/p;)V", VastTagName.COMPANION, "Landroidx/compose/ui/layout/VerticalAlignmentLine;", "Landroidx/compose/ui/layout/HorizontalAlignmentLine;", "ui_release"}, k = 1, mv = {1, 6, 0})
public abstract class AlignmentLine {
    public static final int Unspecified = Integer.MIN_VALUE;

    @NotNull
    private final p<Integer, Integer, Integer> merger;

    /* JADX WARN: Multi-variable type inference failed */
    private AlignmentLine(p<? super Integer, ? super Integer, Integer> pVar) {
        this.merger = pVar;
    }

    public /* synthetic */ AlignmentLine(p pVar, i iVar) {
        this(pVar);
    }

    @NotNull
    public final p<Integer, Integer, Integer> getMerger$ui_release() {
        return this.merger;
    }
}
