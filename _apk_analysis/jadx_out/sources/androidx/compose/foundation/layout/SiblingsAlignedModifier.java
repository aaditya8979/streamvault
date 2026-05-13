package androidx.compose.foundation.layout;

import androidx.compose.foundation.layout.AlignmentLineProvider;
import androidx.compose.ui.layout.AlignmentLine;
import androidx.compose.ui.layout.Measured;
import androidx.compose.ui.layout.ParentDataModifier;
import androidx.compose.ui.platform.InspectorInfo;
import androidx.compose.ui.platform.InspectorValueInfo;
import androidx.compose.ui.unit.Density;
import bn.r;
import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import sn.l;
import tn.i;
import tn.p;

/* JADX INFO: compiled from: RowColumnImpl.kt */
/* JADX INFO: loaded from: classes11.dex */
@Metadata(bv = {}, d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b0\u0018\u00002\u00020\u00012\u00020\u0002:\u0002\r\u000eB\u001d\b\u0004\u0012\u0012\u0010\n\u001a\u000e\u0012\u0004\u0012\u00020\b\u0012\u0004\u0012\u00020\t0\u0007¢\u0006\u0004\b\u000b\u0010\fJ\u0018\u0010\u0006\u001a\u0004\u0018\u00010\u0004*\u00020\u00032\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004H&\u0082\u0001\u0002\u000f\u0010¨\u0006\u0011"}, d2 = {"Landroidx/compose/foundation/layout/SiblingsAlignedModifier;", "Landroidx/compose/ui/layout/ParentDataModifier;", "Landroidx/compose/ui/platform/InspectorValueInfo;", "Landroidx/compose/ui/unit/Density;", "", "parentData", "modifyParentData", "Lkotlin/Function1;", "Landroidx/compose/ui/platform/InspectorInfo;", "Lbn/r;", "inspectorInfo", "<init>", "(Lsn/l;)V", "WithAlignmentLine", "WithAlignmentLineBlock", "Landroidx/compose/foundation/layout/SiblingsAlignedModifier$WithAlignmentLineBlock;", "Landroidx/compose/foundation/layout/SiblingsAlignedModifier$WithAlignmentLine;", "foundation-layout_release"}, k = 1, mv = {1, 6, 0})
public abstract class SiblingsAlignedModifier extends InspectorValueInfo implements ParentDataModifier {

    /* JADX INFO: compiled from: RowColumnImpl.kt */
    @Metadata(bv = {}, d1 = {"\u0000>\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0000\u0018\u00002\u00020\u0001B#\u0012\u0006\u0010\u000e\u001a\u00020\r\u0012\u0012\u0010\u0015\u001a\u000e\u0012\u0004\u0012\u00020\u0013\u0012\u0004\u0012\u00020\u00140\u0012¢\u0006\u0004\b\u0016\u0010\u0017J\u0016\u0010\u0005\u001a\u00020\u0003*\u00020\u00022\b\u0010\u0004\u001a\u0004\u0018\u00010\u0003H\u0016J\u0013\u0010\b\u001a\u00020\u00072\b\u0010\u0006\u001a\u0004\u0018\u00010\u0003H\u0096\u0002J\b\u0010\n\u001a\u00020\tH\u0016J\b\u0010\f\u001a\u00020\u000bH\u0016R\u0017\u0010\u000e\u001a\u00020\r8\u0006¢\u0006\f\n\u0004\b\u000e\u0010\u000f\u001a\u0004\b\u0010\u0010\u0011¨\u0006\u0018"}, d2 = {"Landroidx/compose/foundation/layout/SiblingsAlignedModifier$WithAlignmentLine;", "Landroidx/compose/foundation/layout/SiblingsAlignedModifier;", "Landroidx/compose/ui/unit/Density;", "", "parentData", "modifyParentData", "other", "", "equals", "", "hashCode", "", "toString", "Landroidx/compose/ui/layout/AlignmentLine;", "alignmentLine", "Landroidx/compose/ui/layout/AlignmentLine;", "getAlignmentLine", "()Landroidx/compose/ui/layout/AlignmentLine;", "Lkotlin/Function1;", "Landroidx/compose/ui/platform/InspectorInfo;", "Lbn/r;", "inspectorInfo", "<init>", "(Landroidx/compose/ui/layout/AlignmentLine;Lsn/l;)V", "foundation-layout_release"}, k = 1, mv = {1, 6, 0})
    public static final class WithAlignmentLine extends SiblingsAlignedModifier {

        /* JADX INFO: renamed from: alignmentLine, reason: from kotlin metadata and from toString */
        @NotNull
        private final AlignmentLine line;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public WithAlignmentLine(@NotNull AlignmentLine alignmentLine, @NotNull l<? super InspectorInfo, r> lVar) {
            super(lVar, null);
            p.k(alignmentLine, "alignmentLine");
            p.k(lVar, "inspectorInfo");
            this.line = alignmentLine;
        }

        public boolean equals(@Nullable Object other) {
            if (this == other) {
                return true;
            }
            WithAlignmentLine withAlignmentLine = other instanceof WithAlignmentLine ? (WithAlignmentLine) other : null;
            if (withAlignmentLine == null) {
                return false;
            }
            return p.f(this.line, withAlignmentLine.line);
        }

        @NotNull
        /* JADX INFO: renamed from: getAlignmentLine, reason: from getter */
        public final AlignmentLine getLine() {
            return this.line;
        }

        public int hashCode() {
            return this.line.hashCode();
        }

        @Override // androidx.compose.foundation.layout.SiblingsAlignedModifier, androidx.compose.ui.layout.ParentDataModifier
        @NotNull
        public Object modifyParentData(@NotNull Density density, @Nullable Object obj) {
            p.k(density, "<this>");
            RowColumnParentData rowColumnParentData = obj instanceof RowColumnParentData ? (RowColumnParentData) obj : null;
            if (rowColumnParentData == null) {
                rowColumnParentData = new RowColumnParentData(0.0f, false, null, 7, null);
            }
            rowColumnParentData.setCrossAxisAlignment(CrossAxisAlignment.INSTANCE.Relative$foundation_layout_release(new AlignmentLineProvider.Value(this.line)));
            return rowColumnParentData;
        }

        @NotNull
        public String toString() {
            return "WithAlignmentLine(line=" + this.line + ')';
        }
    }

    /* JADX INFO: compiled from: RowColumnImpl.kt */
    @Metadata(bv = {}, d1 = {"\u0000>\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0000\u0018\u00002\u00020\u0001B/\u0012\u0012\u0010\u000f\u001a\u000e\u0012\u0004\u0012\u00020\u000e\u0012\u0004\u0012\u00020\t0\r\u0012\u0012\u0010\u0015\u001a\u000e\u0012\u0004\u0012\u00020\u0013\u0012\u0004\u0012\u00020\u00140\r¢\u0006\u0004\b\u0016\u0010\u0017J\u0016\u0010\u0005\u001a\u00020\u0003*\u00020\u00022\b\u0010\u0004\u001a\u0004\u0018\u00010\u0003H\u0016J\u0013\u0010\b\u001a\u00020\u00072\b\u0010\u0006\u001a\u0004\u0018\u00010\u0003H\u0096\u0002J\b\u0010\n\u001a\u00020\tH\u0016J\b\u0010\f\u001a\u00020\u000bH\u0016R#\u0010\u000f\u001a\u000e\u0012\u0004\u0012\u00020\u000e\u0012\u0004\u0012\u00020\t0\r8\u0006¢\u0006\f\n\u0004\b\u000f\u0010\u0010\u001a\u0004\b\u0011\u0010\u0012¨\u0006\u0018"}, d2 = {"Landroidx/compose/foundation/layout/SiblingsAlignedModifier$WithAlignmentLineBlock;", "Landroidx/compose/foundation/layout/SiblingsAlignedModifier;", "Landroidx/compose/ui/unit/Density;", "", "parentData", "modifyParentData", "other", "", "equals", "", "hashCode", "", "toString", "Lkotlin/Function1;", "Landroidx/compose/ui/layout/Measured;", "block", "Lsn/l;", "getBlock", "()Lsn/l;", "Landroidx/compose/ui/platform/InspectorInfo;", "Lbn/r;", "inspectorInfo", "<init>", "(Lsn/l;Lsn/l;)V", "foundation-layout_release"}, k = 1, mv = {1, 6, 0})
    public static final class WithAlignmentLineBlock extends SiblingsAlignedModifier {

        @NotNull
        private final l<Measured, Integer> block;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        public WithAlignmentLineBlock(@NotNull l<? super Measured, Integer> lVar, @NotNull l<? super InspectorInfo, r> lVar2) {
            super(lVar2, null);
            p.k(lVar, "block");
            p.k(lVar2, "inspectorInfo");
            this.block = lVar;
        }

        public boolean equals(@Nullable Object other) {
            if (this == other) {
                return true;
            }
            WithAlignmentLineBlock withAlignmentLineBlock = other instanceof WithAlignmentLineBlock ? (WithAlignmentLineBlock) other : null;
            if (withAlignmentLineBlock == null) {
                return false;
            }
            return p.f(this.block, withAlignmentLineBlock.block);
        }

        @NotNull
        public final l<Measured, Integer> getBlock() {
            return this.block;
        }

        public int hashCode() {
            return this.block.hashCode();
        }

        @Override // androidx.compose.foundation.layout.SiblingsAlignedModifier, androidx.compose.ui.layout.ParentDataModifier
        @NotNull
        public Object modifyParentData(@NotNull Density density, @Nullable Object obj) {
            p.k(density, "<this>");
            RowColumnParentData rowColumnParentData = obj instanceof RowColumnParentData ? (RowColumnParentData) obj : null;
            if (rowColumnParentData == null) {
                rowColumnParentData = new RowColumnParentData(0.0f, false, null, 7, null);
            }
            rowColumnParentData.setCrossAxisAlignment(CrossAxisAlignment.INSTANCE.Relative$foundation_layout_release(new AlignmentLineProvider.Block(this.block)));
            return rowColumnParentData;
        }

        @NotNull
        public String toString() {
            return "WithAlignmentLineBlock(block=" + this.block + ')';
        }
    }

    private SiblingsAlignedModifier(l<? super InspectorInfo, r> lVar) {
        super(lVar);
    }

    public /* synthetic */ SiblingsAlignedModifier(l lVar, i iVar) {
        this(lVar);
    }

    @Override // androidx.compose.ui.layout.ParentDataModifier
    @Nullable
    public abstract Object modifyParentData(@NotNull Density density, @Nullable Object obj);
}
