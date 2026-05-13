package com.yandex.div.core.widget;

import android.annotation.SuppressLint;
import android.content.Context;
import android.content.res.TypedArray;
import android.os.SystemClock;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup;
import cn.a0;
import cn.f0;
import cn.k0;
import cn.r;
import cn.w;
import com.google.android.material.badge.BadgeDrawable;
import com.vungle.ads.internal.protos.Sdk;
import com.yandex.div.R$styleable;
import com.yandex.div.core.widget.GridContainer;
import com.yandex.div.internal.KLog;
import com.yandex.div.internal.widget.DivLayoutParams;
import com.yandex.div.internal.widget.DivViewGroup;
import com.yandex.div.logging.Severity;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import sn.a;
import tn.i;
import tn.p;
import zn.n;

/* JADX INFO: compiled from: GridContainer.kt */
/* JADX INFO: loaded from: classes6.dex */
@SuppressLint({"RtlHardcoded"})
public class GridContainer extends DivViewGroup {

    @NotNull
    public static final Companion Companion = new Companion(null);

    @NotNull
    private final Grid grid;
    private boolean initialized;
    private int lastLayoutHashCode;

    /* JADX INFO: compiled from: GridContainer.kt */
    public static final class Cell {
        public final int columnIndex;
        public int columnSpan;
        public final int rowIndex;
        public int rowSpan;
        public final int viewIndex;

        public Cell(int i10, int i11, int i12, int i13, int i14) {
            this.viewIndex = i10;
            this.columnIndex = i11;
            this.rowIndex = i12;
            this.columnSpan = i13;
            this.rowSpan = i14;
        }
    }

    /* JADX INFO: compiled from: GridContainer.kt */
    public static final class CellProjection {
        public final int contentSize;
        public final int index;
        public final int marginEnd;
        public final int marginStart;
        public final int span;
        public final float weight;

        public CellProjection(int i10, int i11, int i12, int i13, int i14, float f10) {
            this.index = i10;
            this.contentSize = i11;
            this.marginStart = i12;
            this.marginEnd = i13;
            this.span = i14;
            this.weight = f10;
        }

        public final int getSize() {
            return this.contentSize + this.marginStart + this.marginEnd;
        }

        public final int getSpecificSize() {
            return getSize() / this.span;
        }
    }

    /* JADX INFO: compiled from: GridContainer.kt */
    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(i iVar) {
            this();
        }
    }

    /* JADX INFO: compiled from: GridContainer.kt */
    public final class Grid {

        @NotNull
        private final SizeConstraint heightConstraint;

        @NotNull
        private final SizeConstraint widthConstraint;
        private int columnCount = 1;

        @NotNull
        private final Resettable<List<Cell>> _cells = new Resettable<>(new a<List<? extends Cell>>() { // from class: com.yandex.div.core.widget.GridContainer$Grid$_cells$1
            {
                super(0);
            }

            @Override // sn.a
            @NotNull
            public final List<? extends GridContainer.Cell> invoke() {
                return this.this$0.distributeCells();
            }
        });

        @NotNull
        private final Resettable<List<Line>> _columns = new Resettable<>(new a<List<? extends Line>>() { // from class: com.yandex.div.core.widget.GridContainer$Grid$_columns$1
            {
                super(0);
            }

            @Override // sn.a
            @NotNull
            public final List<? extends GridContainer.Line> invoke() {
                return this.this$0.measureColumns();
            }
        });

        @NotNull
        private final Resettable<List<Line>> _rows = new Resettable<>(new a<List<? extends Line>>() { // from class: com.yandex.div.core.widget.GridContainer$Grid$_rows$1
            {
                super(0);
            }

            @Override // sn.a
            @NotNull
            public final List<? extends GridContainer.Line> invoke() {
                return this.this$0.measureRows();
            }
        });

        public Grid() {
            int i10 = 0;
            int i11 = 3;
            i iVar = null;
            this.widthConstraint = new SizeConstraint(i10, i10, i11, iVar);
            this.heightConstraint = new SizeConstraint(i10, i10, i11, iVar);
        }

        private final void adjustWeightedLines(List<Line> list, SizeConstraint sizeConstraint) {
            int size = list.size();
            float weight = 0.0f;
            float fMax = 0.0f;
            int size2 = 0;
            for (int i10 = 0; i10 < size; i10++) {
                Line line = list.get(i10);
                if (line.isFlexible()) {
                    weight += line.getWeight();
                    fMax = Math.max(fMax, line.getSize() / line.getWeight());
                } else {
                    size2 += line.getSize();
                }
                line.getSize();
            }
            int size3 = list.size();
            int iCeil = 0;
            for (int i11 = 0; i11 < size3; i11++) {
                Line line2 = list.get(i11);
                iCeil += line2.isFlexible() ? (int) Math.ceil(line2.getWeight() * fMax) : line2.getSize();
            }
            float fMax2 = Math.max(0, Math.max(sizeConstraint.min, iCeil) - size2) / weight;
            int size4 = list.size();
            for (int i12 = 0; i12 < size4; i12++) {
                Line line3 = list.get(i12);
                if (line3.isFlexible()) {
                    int iCeil2 = (int) Math.ceil(line3.getWeight() * fMax2);
                    Line.include$default(line3, iCeil2 - line3.getMarginSize(), iCeil2, 0.0f, 4, null);
                }
            }
        }

        private final void align(List<Line> list) {
            int size = list.size();
            int size2 = 0;
            for (int i10 = 0; i10 < size; i10++) {
                Line line = list.get(i10);
                line.setOffset(size2);
                size2 += line.getSize();
            }
        }

        private final int calculateSize(List<Line> list) {
            if (list.isEmpty()) {
                return 0;
            }
            Line line = (Line) f0.F0(list);
            return line.getOffset() + line.getSize();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public final List<Cell> distributeCells() {
            int i10;
            Integer numValueOf;
            if (GridContainer.this.getChildCount() == 0) {
                return w.m();
            }
            int i11 = this.columnCount;
            ArrayList arrayList = new ArrayList(GridContainer.this.getChildCount());
            int[] iArr = new int[i11];
            int[] iArr2 = new int[i11];
            GridContainer gridContainer = GridContainer.this;
            int childCount = gridContainer.getChildCount();
            int i12 = 0;
            int i13 = 0;
            int i14 = 0;
            while (i14 < childCount) {
                View childAt = gridContainer.getChildAt(i14);
                if (childAt.getVisibility() != 8) {
                    Integer numU0 = r.u0(iArr2);
                    int iIntValue = numU0 != null ? numU0.intValue() : i12;
                    int iG0 = r.g0(iArr2, iIntValue);
                    int i15 = i13 + iIntValue;
                    zn.i iVarV = n.v(i12, i11);
                    int iF = iVarV.f();
                    int iG = iVarV.g();
                    if (iF <= iG) {
                        while (true) {
                            iArr2[iF] = Math.max(i12, iArr2[iF] - iIntValue);
                            if (iF == iG) {
                                break;
                            }
                            iF++;
                        }
                    }
                    DivViewGroup.Companion companion = DivViewGroup.Companion;
                    ViewGroup.LayoutParams layoutParams = childAt.getLayoutParams();
                    p.i(layoutParams, "null cannot be cast to non-null type com.yandex.div.internal.widget.DivLayoutParams");
                    DivLayoutParams divLayoutParams = (DivLayoutParams) layoutParams;
                    int iMin = Math.min(divLayoutParams.getColumnSpan(), i11 - iG0);
                    int rowSpan = divLayoutParams.getRowSpan();
                    arrayList.add(new Cell(i14, iG0, i15, iMin, rowSpan));
                    int i16 = iG0 + iMin;
                    while (iG0 < i16) {
                        if (iArr2[iG0] > 0) {
                            Cell cell = (Cell) arrayList.get(iArr[iG0]);
                            int i17 = cell.columnIndex;
                            int i18 = cell.columnSpan + i17;
                            while (i17 < i18) {
                                int i19 = iArr2[i17];
                                iArr2[i17] = 0;
                                i17++;
                            }
                            cell.rowSpan = i15 - cell.rowIndex;
                        }
                        iArr[iG0] = i14;
                        iArr2[iG0] = rowSpan;
                        iG0++;
                    }
                    i13 = i15;
                }
                i14++;
                i12 = 0;
            }
            if (i11 == 0) {
                numValueOf = null;
                i10 = 0;
            } else {
                i10 = 0;
                numValueOf = Integer.valueOf(n.e(iArr2[0], 1));
                k0 it = new zn.i(1, r.a0(iArr2)).iterator();
                while (it.hasNext()) {
                    Integer numValueOf2 = Integer.valueOf(n.e(iArr2[it.nextInt()], 1));
                    if (numValueOf.compareTo(numValueOf2) > 0) {
                        numValueOf = numValueOf2;
                    }
                }
            }
            Integer num = numValueOf;
            int iIntValue2 = ((Cell) f0.F0(arrayList)).rowIndex + (num != null ? num.intValue() : 1);
            int size = arrayList.size();
            for (int i20 = i10; i20 < size; i20++) {
                Cell cell2 = (Cell) arrayList.get(i20);
                int i21 = cell2.rowIndex;
                if (cell2.rowSpan + i21 > iIntValue2) {
                    cell2.rowSpan = iIntValue2 - i21;
                }
            }
            return arrayList;
        }

        private final int getHeight() {
            return calculateSize(getRows());
        }

        private final int getWidth() {
            return calculateSize(getColumns());
        }

        /* JADX INFO: Access modifiers changed from: private */
        public final List<Line> measureColumns() {
            int size;
            float weight;
            int i10;
            int i11;
            int i12 = this.columnCount;
            SizeConstraint sizeConstraint = this.widthConstraint;
            List<Cell> list = this._cells.get();
            ArrayList arrayList = new ArrayList(i12);
            for (int i13 = 0; i13 < i12; i13++) {
                arrayList.add(new Line());
            }
            GridContainer gridContainer = GridContainer.this;
            int size2 = list.size();
            for (int i14 = 0; i14 < size2; i14++) {
                Cell cell = list.get(i14);
                View childAt = gridContainer.getChildAt(cell.viewIndex);
                DivViewGroup.Companion companion = DivViewGroup.Companion;
                ViewGroup.LayoutParams layoutParams = childAt.getLayoutParams();
                p.i(layoutParams, "null cannot be cast to non-null type com.yandex.div.internal.widget.DivLayoutParams");
                DivLayoutParams divLayoutParams = (DivLayoutParams) layoutParams;
                CellProjection cellProjection = new CellProjection(cell.columnIndex, childAt.getMeasuredWidth(), ((ViewGroup.MarginLayoutParams) divLayoutParams).leftMargin, ((ViewGroup.MarginLayoutParams) divLayoutParams).rightMargin, cell.columnSpan, GridContainerKt.getColumnWeight(divLayoutParams));
                int i15 = cellProjection.span;
                if (i15 == 1) {
                    ((Line) arrayList.get(cellProjection.index)).include(cellProjection.contentSize, cellProjection.getSize(), cellProjection.weight);
                } else {
                    int i16 = i15 - 1;
                    float f10 = cellProjection.weight / i15;
                    if (i16 >= 0) {
                        while (true) {
                            Line.include$default((Line) arrayList.get(cellProjection.index + i11), 0, 0, f10, 3, null);
                            i11 = i11 != i16 ? i11 + 1 : 0;
                        }
                    }
                }
            }
            ArrayList arrayList2 = new ArrayList();
            GridContainer gridContainer2 = GridContainer.this;
            int size3 = list.size();
            for (int i17 = 0; i17 < size3; i17++) {
                Cell cell2 = list.get(i17);
                View childAt2 = gridContainer2.getChildAt(cell2.viewIndex);
                DivViewGroup.Companion companion2 = DivViewGroup.Companion;
                ViewGroup.LayoutParams layoutParams2 = childAt2.getLayoutParams();
                p.i(layoutParams2, "null cannot be cast to non-null type com.yandex.div.internal.widget.DivLayoutParams");
                DivLayoutParams divLayoutParams2 = (DivLayoutParams) layoutParams2;
                CellProjection cellProjection2 = new CellProjection(cell2.columnIndex, childAt2.getMeasuredWidth(), ((ViewGroup.MarginLayoutParams) divLayoutParams2).leftMargin, ((ViewGroup.MarginLayoutParams) divLayoutParams2).rightMargin, cell2.columnSpan, GridContainerKt.getColumnWeight(divLayoutParams2));
                if (cellProjection2.span > 1) {
                    arrayList2.add(cellProjection2);
                }
            }
            a0.D(arrayList2, SpannedCellComparator.INSTANCE);
            int size4 = arrayList2.size();
            for (int i18 = 0; i18 < size4; i18++) {
                CellProjection cellProjection3 = (CellProjection) arrayList2.get(i18);
                int i19 = cellProjection3.index;
                int i20 = (cellProjection3.span + i19) - 1;
                int size5 = cellProjection3.getSize();
                if (i19 <= i20) {
                    int i21 = i19;
                    size = size5;
                    weight = 0.0f;
                    i10 = 0;
                    while (true) {
                        Line line = (Line) arrayList.get(i21);
                        size5 -= line.getSize();
                        if (line.isFlexible()) {
                            weight += line.getWeight();
                        } else {
                            if (line.getContentSize() == 0) {
                                i10++;
                            }
                            size -= line.getSize();
                        }
                        if (i21 == i20) {
                            break;
                        }
                        i21++;
                    }
                } else {
                    size = size5;
                    weight = 0.0f;
                    i10 = 0;
                }
                if (weight > 0.0f) {
                    if (i19 <= i20) {
                        while (true) {
                            Line line2 = (Line) arrayList.get(i19);
                            if (line2.isFlexible()) {
                                int iCeil = (int) Math.ceil((line2.getWeight() / weight) * size);
                                Line.include$default(line2, iCeil - line2.getMarginSize(), iCeil, 0.0f, 4, null);
                            }
                            if (i19 != i20) {
                                i19++;
                            }
                        }
                    }
                } else if (size5 > 0 && i19 <= i20) {
                    while (true) {
                        Line line3 = (Line) arrayList.get(i19);
                        if (i10 <= 0) {
                            int i22 = size5 / cellProjection3.span;
                            Line.include$default(line3, line3.getContentSize() + i22, line3.getSize() + i22, 0.0f, 4, null);
                        } else if (line3.getContentSize() == 0 && !line3.isFlexible()) {
                            int i23 = size5 / i10;
                            Line.include$default(line3, line3.getContentSize() + i23, line3.getSize() + i23, 0.0f, 4, null);
                        }
                        if (i19 != i20) {
                            i19++;
                        }
                    }
                }
            }
            adjustWeightedLines(arrayList, sizeConstraint);
            align(arrayList);
            return arrayList;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public final List<Line> measureRows() {
            int size;
            float weight;
            int i10;
            int i11;
            int rowCount = getRowCount();
            SizeConstraint sizeConstraint = this.heightConstraint;
            List<Cell> list = this._cells.get();
            ArrayList arrayList = new ArrayList(rowCount);
            for (int i12 = 0; i12 < rowCount; i12++) {
                arrayList.add(new Line());
            }
            GridContainer gridContainer = GridContainer.this;
            int size2 = list.size();
            for (int i13 = 0; i13 < size2; i13++) {
                Cell cell = list.get(i13);
                View childAt = gridContainer.getChildAt(cell.viewIndex);
                DivViewGroup.Companion companion = DivViewGroup.Companion;
                ViewGroup.LayoutParams layoutParams = childAt.getLayoutParams();
                p.i(layoutParams, "null cannot be cast to non-null type com.yandex.div.internal.widget.DivLayoutParams");
                DivLayoutParams divLayoutParams = (DivLayoutParams) layoutParams;
                CellProjection cellProjection = new CellProjection(cell.rowIndex, childAt.getMeasuredHeight(), ((ViewGroup.MarginLayoutParams) divLayoutParams).topMargin, ((ViewGroup.MarginLayoutParams) divLayoutParams).bottomMargin, cell.rowSpan, GridContainerKt.getRowWeight(divLayoutParams));
                int i14 = cellProjection.span;
                if (i14 == 1) {
                    ((Line) arrayList.get(cellProjection.index)).include(cellProjection.contentSize, cellProjection.getSize(), cellProjection.weight);
                } else {
                    int i15 = i14 - 1;
                    float f10 = cellProjection.weight / i14;
                    if (i15 >= 0) {
                        while (true) {
                            Line.include$default((Line) arrayList.get(cellProjection.index + i11), 0, 0, f10, 3, null);
                            i11 = i11 != i15 ? i11 + 1 : 0;
                        }
                    }
                }
            }
            ArrayList arrayList2 = new ArrayList();
            GridContainer gridContainer2 = GridContainer.this;
            int size3 = list.size();
            for (int i16 = 0; i16 < size3; i16++) {
                Cell cell2 = list.get(i16);
                View childAt2 = gridContainer2.getChildAt(cell2.viewIndex);
                DivViewGroup.Companion companion2 = DivViewGroup.Companion;
                ViewGroup.LayoutParams layoutParams2 = childAt2.getLayoutParams();
                p.i(layoutParams2, "null cannot be cast to non-null type com.yandex.div.internal.widget.DivLayoutParams");
                DivLayoutParams divLayoutParams2 = (DivLayoutParams) layoutParams2;
                CellProjection cellProjection2 = new CellProjection(cell2.rowIndex, childAt2.getMeasuredHeight(), ((ViewGroup.MarginLayoutParams) divLayoutParams2).topMargin, ((ViewGroup.MarginLayoutParams) divLayoutParams2).bottomMargin, cell2.rowSpan, GridContainerKt.getRowWeight(divLayoutParams2));
                if (cellProjection2.span > 1) {
                    arrayList2.add(cellProjection2);
                }
            }
            a0.D(arrayList2, SpannedCellComparator.INSTANCE);
            int size4 = arrayList2.size();
            for (int i17 = 0; i17 < size4; i17++) {
                CellProjection cellProjection3 = (CellProjection) arrayList2.get(i17);
                int i18 = cellProjection3.index;
                int i19 = (cellProjection3.span + i18) - 1;
                int size5 = cellProjection3.getSize();
                if (i18 <= i19) {
                    int i20 = i18;
                    size = size5;
                    weight = 0.0f;
                    i10 = 0;
                    while (true) {
                        Line line = (Line) arrayList.get(i20);
                        size5 -= line.getSize();
                        if (line.isFlexible()) {
                            weight += line.getWeight();
                        } else {
                            if (line.getContentSize() == 0) {
                                i10++;
                            }
                            size -= line.getSize();
                        }
                        if (i20 == i19) {
                            break;
                        }
                        i20++;
                    }
                } else {
                    size = size5;
                    weight = 0.0f;
                    i10 = 0;
                }
                if (weight > 0.0f) {
                    if (i18 <= i19) {
                        while (true) {
                            Line line2 = (Line) arrayList.get(i18);
                            if (line2.isFlexible()) {
                                int iCeil = (int) Math.ceil((line2.getWeight() / weight) * size);
                                Line.include$default(line2, iCeil - line2.getMarginSize(), iCeil, 0.0f, 4, null);
                            }
                            if (i18 != i19) {
                                i18++;
                            }
                        }
                    }
                } else if (size5 > 0 && i18 <= i19) {
                    while (true) {
                        Line line3 = (Line) arrayList.get(i18);
                        if (i10 <= 0) {
                            int i21 = size5 / cellProjection3.span;
                            Line.include$default(line3, line3.getContentSize() + i21, line3.getSize() + i21, 0.0f, 4, null);
                        } else if (line3.getContentSize() == 0 && !line3.isFlexible()) {
                            int i22 = size5 / i10;
                            Line.include$default(line3, line3.getContentSize() + i22, line3.getSize() + i22, 0.0f, 4, null);
                        }
                        if (i18 != i19) {
                            i18++;
                        }
                    }
                }
            }
            adjustWeightedLines(arrayList, sizeConstraint);
            align(arrayList);
            return arrayList;
        }

        private final int rowCount(List<Cell> list) {
            if (list.isEmpty()) {
                return 0;
            }
            Cell cell = (Cell) f0.F0(list);
            return cell.rowSpan + cell.rowIndex;
        }

        @NotNull
        public final List<Cell> getCells() {
            return this._cells.get();
        }

        public final int getColumnCount() {
            return this.columnCount;
        }

        @NotNull
        public final List<Line> getColumns() {
            return this._columns.get();
        }

        public final int getMeasuredHeight() {
            if (this._rows.getInitialized()) {
                return calculateSize(this._rows.get());
            }
            return 0;
        }

        public final int getMeasuredWidth() {
            if (this._columns.getInitialized()) {
                return calculateSize(this._columns.get());
            }
            return 0;
        }

        public final int getRowCount() {
            return rowCount(getCells());
        }

        @NotNull
        public final List<Line> getRows() {
            return this._rows.get();
        }

        public final void invalidateMeasurement() {
            this._columns.reset();
            this._rows.reset();
        }

        public final void invalidateStructure() {
            this._cells.reset();
            invalidateMeasurement();
        }

        public final int measureHeight(int i10) {
            this.heightConstraint.set(i10);
            return Math.max(this.heightConstraint.min, Math.min(getHeight(), this.heightConstraint.max));
        }

        public final int measureWidth(int i10) {
            this.widthConstraint.set(i10);
            return Math.max(this.widthConstraint.min, Math.min(getWidth(), this.widthConstraint.max));
        }

        public final void setColumnCount(int i10) {
            if (i10 <= 0 || this.columnCount == i10) {
                return;
            }
            this.columnCount = i10;
            invalidateStructure();
        }
    }

    /* JADX INFO: compiled from: GridContainer.kt */
    public static final class Line {
        private int contentSize;
        private int offset;
        private int size;
        private float weight;

        public static /* synthetic */ void include$default(Line line, int i10, int i11, float f10, int i12, Object obj) {
            if ((i12 & 1) != 0) {
                i10 = 0;
            }
            if ((i12 & 2) != 0) {
                i11 = 0;
            }
            if ((i12 & 4) != 0) {
                f10 = 0.0f;
            }
            line.include(i10, i11, f10);
        }

        public final int getContentSize() {
            return this.contentSize;
        }

        public final int getMarginSize() {
            return this.size - this.contentSize;
        }

        public final int getOffset() {
            return this.offset;
        }

        public final int getSize() {
            return this.size;
        }

        public final float getWeight() {
            return this.weight;
        }

        public final void include(int i10, int i11, float f10) {
            this.contentSize = Math.max(this.contentSize, i10);
            this.size = Math.max(this.size, i11);
            this.weight = Math.max(this.weight, f10);
        }

        public final boolean isFlexible() {
            return this.weight > 0.0f;
        }

        public final void setOffset(int i10) {
            this.offset = i10;
        }
    }

    /* JADX INFO: compiled from: GridContainer.kt */
    public static final class SizeConstraint {
        public int max;
        public int min;

        public SizeConstraint(int i10, int i11) {
            this.min = i10;
            this.max = i11;
        }

        public /* synthetic */ SizeConstraint(int i10, int i11, int i12, i iVar) {
            this((i12 & 1) != 0 ? 0 : i10, (i12 & 2) != 0 ? 32768 : i11);
        }

        public final void set(int i10) {
            int mode = View.MeasureSpec.getMode(i10);
            int size = View.MeasureSpec.getSize(i10);
            if (mode == Integer.MIN_VALUE) {
                this.min = 0;
                this.max = size;
            } else if (mode == 0) {
                this.min = 0;
                this.max = 32768;
            } else {
                if (mode != 1073741824) {
                    return;
                }
                this.min = size;
                this.max = size;
            }
        }
    }

    /* JADX INFO: compiled from: GridContainer.kt */
    public static final class SpannedCellComparator implements Comparator<CellProjection> {

        @NotNull
        public static final SpannedCellComparator INSTANCE = new SpannedCellComparator();

        private SpannedCellComparator() {
        }

        @Override // java.util.Comparator
        public int compare(@NotNull CellProjection cellProjection, @NotNull CellProjection cellProjection2) {
            if (cellProjection.getSpecificSize() < cellProjection2.getSpecificSize()) {
                return 1;
            }
            return cellProjection.getSpecificSize() > cellProjection2.getSpecificSize() ? -1 : 0;
        }
    }

    public GridContainer(@NotNull Context context, @Nullable AttributeSet attributeSet) {
        this(context, attributeSet, 0, 4, null);
    }

    public GridContainer(@NotNull Context context, @Nullable AttributeSet attributeSet, int i10) {
        super(context, attributeSet, i10);
        this.grid = new Grid();
        if (isInEditMode()) {
            TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, R$styleable.GridContainer, i10, 0);
            try {
                setColumnCount(typedArrayObtainStyledAttributes.getInt(R$styleable.GridContainer_android_columnCount, 1));
                setGravity(typedArrayObtainStyledAttributes.getInt(R$styleable.GridContainer_android_gravity, BadgeDrawable.TOP_START));
            } finally {
                typedArrayObtainStyledAttributes.recycle();
            }
        }
        this.initialized = true;
    }

    public /* synthetic */ GridContainer(Context context, AttributeSet attributeSet, int i10, int i11, i iVar) {
        this(context, (i11 & 2) != 0 ? null : attributeSet, (i11 & 4) != 0 ? 0 : i10);
    }

    private final int calculateChildHorizontalPosition(int i10, int i11, int i12, int i13) {
        int i14 = i13 & 7;
        return i14 != 1 ? i14 != 5 ? i10 : (i10 + i11) - i12 : i10 + ((i11 - i12) / 2);
    }

    private final int calculateChildVerticalPosition(int i10, int i11, int i12, int i13) {
        int i14 = i13 & 112;
        return i14 != 16 ? i14 != 80 ? i10 : (i10 + i11) - i12 : i10 + ((i11 - i12) / 2);
    }

    private final int calculateGridHorizontalPosition() {
        int gravity = getGravity() & 7;
        int measuredWidth = this.grid.getMeasuredWidth();
        int measuredWidth2 = (getMeasuredWidth() - getPaddingLeft()) - getPaddingRight();
        return gravity != 1 ? gravity != 5 ? getPaddingLeft() : (getPaddingLeft() + measuredWidth2) - measuredWidth : getPaddingLeft() + ((measuredWidth2 - measuredWidth) / 2);
    }

    private final int calculateGridVerticalPosition() {
        int gravity = getGravity() & 112;
        int measuredHeight = this.grid.getMeasuredHeight();
        int measuredHeight2 = (getMeasuredHeight() - getPaddingTop()) - getPaddingBottom();
        return gravity != 16 ? gravity != 80 ? getPaddingTop() : (getPaddingTop() + measuredHeight2) - measuredHeight : getPaddingTop() + ((measuredHeight2 - measuredHeight) / 2);
    }

    private final void checkConsistency() {
        int i10 = this.lastLayoutHashCode;
        if (i10 == 0) {
            validateLayoutParams();
            this.lastLayoutHashCode = computeLayoutHashCode();
        } else if (i10 != computeLayoutHashCode()) {
            invalidateStructure();
            checkConsistency();
        }
    }

    private final int computeLayoutHashCode() {
        int childCount = getChildCount();
        int iHashCode = Sdk.SDKError.Reason.STALE_CACHED_RESPONSE_VALUE;
        for (int i10 = 0; i10 < childCount; i10++) {
            View childAt = getChildAt(i10);
            if (childAt.getVisibility() != 8) {
                ViewGroup.LayoutParams layoutParams = childAt.getLayoutParams();
                p.i(layoutParams, "null cannot be cast to non-null type com.yandex.div.internal.widget.DivLayoutParams");
                iHashCode = (iHashCode * 31) + ((DivLayoutParams) layoutParams).hashCode();
            }
        }
        return iHashCode;
    }

    private final int getPaddingHorizontal() {
        return getPaddingLeft() + getPaddingRight();
    }

    private final int getPaddingVertical() {
        return getPaddingTop() + getPaddingBottom();
    }

    private final void invalidateMeasurement() {
        this.grid.invalidateMeasurement();
    }

    private final void invalidateStructure() {
        this.lastLayoutHashCode = 0;
        this.grid.invalidateStructure();
    }

    private final void measureChild(View view, int i10, int i11, int i12, int i13) {
        DivViewGroup.Companion companion = DivViewGroup.Companion;
        int minimumWidth = view.getMinimumWidth();
        ViewGroup.LayoutParams layoutParams = view.getLayoutParams();
        p.i(layoutParams, "null cannot be cast to non-null type com.yandex.div.internal.widget.DivLayoutParams");
        int childMeasureSpec = companion.getChildMeasureSpec(i10, 0, i12, minimumWidth, ((DivLayoutParams) layoutParams).getMaxWidth());
        int minimumHeight = view.getMinimumHeight();
        ViewGroup.LayoutParams layoutParams2 = view.getLayoutParams();
        p.i(layoutParams2, "null cannot be cast to non-null type com.yandex.div.internal.widget.DivLayoutParams");
        view.measure(childMeasureSpec, companion.getChildMeasureSpec(i11, 0, i13, minimumHeight, ((DivLayoutParams) layoutParams2).getMaxHeight()));
    }

    private final void measureChildrenInitial(int i10, int i11) {
        int childCount = getChildCount();
        for (int i12 = 0; i12 < childCount; i12++) {
            View childAt = getChildAt(i12);
            if (childAt.getVisibility() != 8) {
                ViewGroup.LayoutParams layoutParams = childAt.getLayoutParams();
                p.i(layoutParams, "null cannot be cast to non-null type com.yandex.div.internal.widget.DivLayoutParams");
                DivLayoutParams divLayoutParams = (DivLayoutParams) layoutParams;
                int i13 = ((ViewGroup.MarginLayoutParams) divLayoutParams).width;
                int i14 = i13 == -1 ? 0 : i13;
                int i15 = ((ViewGroup.MarginLayoutParams) divLayoutParams).height;
                measureChild(childAt, i10, i11, i14, i15 == -1 ? 0 : i15);
            }
        }
    }

    private final void measureMatchParentChild(View view, int i10, int i11, int i12, int i13, int i14, int i15) {
        int childMeasureSpec;
        int childMeasureSpec2;
        if (i12 == -1) {
            childMeasureSpec = View.MeasureSpec.makeMeasureSpec(i14, 1073741824);
        } else {
            DivViewGroup.Companion companion = DivViewGroup.Companion;
            int minimumWidth = view.getMinimumWidth();
            ViewGroup.LayoutParams layoutParams = view.getLayoutParams();
            p.i(layoutParams, "null cannot be cast to non-null type com.yandex.div.internal.widget.DivLayoutParams");
            childMeasureSpec = companion.getChildMeasureSpec(i10, 0, i12, minimumWidth, ((DivLayoutParams) layoutParams).getMaxWidth());
        }
        if (i13 == -1) {
            childMeasureSpec2 = View.MeasureSpec.makeMeasureSpec(i15, 1073741824);
        } else {
            DivViewGroup.Companion companion2 = DivViewGroup.Companion;
            int minimumHeight = view.getMinimumHeight();
            ViewGroup.LayoutParams layoutParams2 = view.getLayoutParams();
            p.i(layoutParams2, "null cannot be cast to non-null type com.yandex.div.internal.widget.DivLayoutParams");
            childMeasureSpec2 = companion2.getChildMeasureSpec(i11, 0, i13, minimumHeight, ((DivLayoutParams) layoutParams2).getMaxHeight());
        }
        view.measure(childMeasureSpec, childMeasureSpec2);
    }

    private final void remeasureChildrenHeight(int i10, int i11) {
        List<Cell> cells = this.grid.getCells();
        List<Line> columns = this.grid.getColumns();
        List<Line> rows = this.grid.getRows();
        int childCount = getChildCount();
        int i12 = 0;
        for (int i13 = 0; i13 < childCount; i13++) {
            View childAt = getChildAt(i13);
            if (childAt.getVisibility() != 8) {
                ViewGroup.LayoutParams layoutParams = childAt.getLayoutParams();
                p.i(layoutParams, "null cannot be cast to non-null type com.yandex.div.internal.widget.DivLayoutParams");
                DivLayoutParams divLayoutParams = (DivLayoutParams) layoutParams;
                if (((ViewGroup.MarginLayoutParams) divLayoutParams).height == -1) {
                    Cell cell = cells.get(i12);
                    Line line = columns.get((cell.columnIndex + cell.columnSpan) - 1);
                    int offset = ((line.getOffset() + line.getSize()) - columns.get(cell.columnIndex).getOffset()) - divLayoutParams.getHorizontalMargins$div_release();
                    Line line2 = rows.get((cell.rowIndex + cell.rowSpan) - 1);
                    measureMatchParentChild(childAt, i10, i11, ((ViewGroup.MarginLayoutParams) divLayoutParams).width, ((ViewGroup.MarginLayoutParams) divLayoutParams).height, offset, ((line2.getOffset() + line2.getSize()) - rows.get(cell.rowIndex).getOffset()) - divLayoutParams.getVerticalMargins$div_release());
                }
                i12++;
            }
        }
    }

    private final void remeasureChildrenWidth(int i10, int i11) {
        List<Cell> cells = this.grid.getCells();
        List<Line> columns = this.grid.getColumns();
        int childCount = getChildCount();
        int i12 = 0;
        for (int i13 = 0; i13 < childCount; i13++) {
            View childAt = getChildAt(i13);
            if (childAt.getVisibility() != 8) {
                ViewGroup.LayoutParams layoutParams = childAt.getLayoutParams();
                p.i(layoutParams, "null cannot be cast to non-null type com.yandex.div.internal.widget.DivLayoutParams");
                DivLayoutParams divLayoutParams = (DivLayoutParams) layoutParams;
                if (((ViewGroup.MarginLayoutParams) divLayoutParams).width == -1) {
                    Cell cell = cells.get(i12);
                    Line line = columns.get((cell.columnIndex + cell.columnSpan) - 1);
                    measureMatchParentChild(childAt, i10, i11, ((ViewGroup.MarginLayoutParams) divLayoutParams).width, ((ViewGroup.MarginLayoutParams) divLayoutParams).height, ((line.getOffset() + line.getSize()) - columns.get(cell.columnIndex).getOffset()) - divLayoutParams.getHorizontalMargins$div_release(), 0);
                }
                i12++;
            }
        }
    }

    private final void validateLayoutParams() {
        int childCount = getChildCount();
        for (int i10 = 0; i10 < childCount; i10++) {
            ViewGroup.LayoutParams layoutParams = getChildAt(i10).getLayoutParams();
            p.i(layoutParams, "null cannot be cast to non-null type com.yandex.div.internal.widget.DivLayoutParams");
            DivLayoutParams divLayoutParams = (DivLayoutParams) layoutParams;
            if (divLayoutParams.getColumnSpan() < 0 || divLayoutParams.getRowSpan() < 0) {
                throw new IllegalStateException("Negative spans are not supported.");
            }
            if (GridContainerKt.getColumnWeight(divLayoutParams) < 0.0f || GridContainerKt.getRowWeight(divLayoutParams) < 0.0f) {
                throw new IllegalStateException("Negative weights are not supported.");
            }
        }
    }

    public final int getColumnCount() {
        return this.grid.getColumnCount();
    }

    public final int getRowCount() {
        return this.grid.getRowCount();
    }

    @Override // android.view.ViewGroup, android.view.View
    public void onLayout(boolean z10, int i10, int i11, int i12, int i13) {
        List<Line> list;
        List<Cell> list2;
        int i14;
        long jElapsedRealtime = SystemClock.elapsedRealtime();
        checkConsistency();
        List<Line> columns = this.grid.getColumns();
        List<Line> rows = this.grid.getRows();
        List<Cell> cells = this.grid.getCells();
        int iCalculateGridHorizontalPosition = calculateGridHorizontalPosition();
        int iCalculateGridVerticalPosition = calculateGridVerticalPosition();
        int childCount = getChildCount();
        int i15 = 0;
        int i16 = 0;
        while (i15 < childCount) {
            View childAt = getChildAt(i15);
            if (childAt.getVisibility() != 8) {
                ViewGroup.LayoutParams layoutParams = childAt.getLayoutParams();
                p.i(layoutParams, "null cannot be cast to non-null type com.yandex.div.internal.widget.DivLayoutParams");
                DivLayoutParams divLayoutParams = (DivLayoutParams) layoutParams;
                Cell cell = cells.get(i16);
                int offset = columns.get(cell.columnIndex).getOffset() + ((ViewGroup.MarginLayoutParams) divLayoutParams).leftMargin;
                list2 = cells;
                int offset2 = rows.get(cell.rowIndex).getOffset() + ((ViewGroup.MarginLayoutParams) divLayoutParams).topMargin;
                i14 = childCount;
                Line line = columns.get((cell.columnIndex + cell.columnSpan) - 1);
                int offset3 = ((line.getOffset() + line.getSize()) - offset) - ((ViewGroup.MarginLayoutParams) divLayoutParams).rightMargin;
                Line line2 = rows.get((cell.rowIndex + cell.rowSpan) - 1);
                int offset4 = ((line2.getOffset() + line2.getSize()) - offset2) - ((ViewGroup.MarginLayoutParams) divLayoutParams).bottomMargin;
                list = columns;
                int iCalculateChildHorizontalPosition = calculateChildHorizontalPosition(offset, offset3, childAt.getMeasuredWidth(), divLayoutParams.getGravity()) + iCalculateGridHorizontalPosition;
                int iCalculateChildVerticalPosition = calculateChildVerticalPosition(offset2, offset4, childAt.getMeasuredHeight(), divLayoutParams.getGravity()) + iCalculateGridVerticalPosition;
                childAt.layout(iCalculateChildHorizontalPosition, iCalculateChildVerticalPosition, childAt.getMeasuredWidth() + iCalculateChildHorizontalPosition, childAt.getMeasuredHeight() + iCalculateChildVerticalPosition);
                i16++;
            } else {
                list = columns;
                list2 = cells;
                i14 = childCount;
            }
            i15++;
            cells = list2;
            childCount = i14;
            columns = list;
        }
        long jElapsedRealtime2 = SystemClock.elapsedRealtime() - jElapsedRealtime;
        KLog kLog = KLog.INSTANCE;
        if (kLog.isAtLeast(Severity.INFO)) {
            kLog.print(4, "GridContainer", "onLayout() performed in " + jElapsedRealtime2 + " ms");
        }
    }

    @Override // android.view.View
    public void onMeasure(int i10, int i11) {
        long jElapsedRealtime = SystemClock.elapsedRealtime();
        checkConsistency();
        invalidateMeasurement();
        int paddingHorizontal = getPaddingHorizontal();
        int paddingVertical = getPaddingVertical();
        int iMakeMeasureSpec = View.MeasureSpec.makeMeasureSpec(View.MeasureSpec.getSize(i10 - paddingHorizontal), View.MeasureSpec.getMode(i10));
        int iMakeMeasureSpec2 = View.MeasureSpec.makeMeasureSpec(View.MeasureSpec.getSize(i11 - paddingVertical), View.MeasureSpec.getMode(i11));
        measureChildrenInitial(iMakeMeasureSpec, iMakeMeasureSpec2);
        int iMeasureWidth = this.grid.measureWidth(iMakeMeasureSpec);
        remeasureChildrenWidth(iMakeMeasureSpec, iMakeMeasureSpec2);
        int iMeasureHeight = this.grid.measureHeight(iMakeMeasureSpec2);
        remeasureChildrenHeight(iMakeMeasureSpec, iMakeMeasureSpec2);
        setMeasuredDimension(View.resolveSizeAndState(Math.max(iMeasureWidth + paddingHorizontal, getSuggestedMinimumWidth()), i10, 0), View.resolveSizeAndState(Math.max(iMeasureHeight + paddingVertical, getSuggestedMinimumHeight()), i11, 0));
        long jElapsedRealtime2 = SystemClock.elapsedRealtime() - jElapsedRealtime;
        KLog kLog = KLog.INSTANCE;
        if (kLog.isAtLeast(Severity.INFO)) {
            kLog.print(4, "GridContainer", "onMeasure() performed in " + jElapsedRealtime2 + " ms");
        }
    }

    @Override // android.view.ViewGroup
    public void onViewAdded(@NotNull View view) {
        super.onViewAdded(view);
        invalidateStructure();
    }

    @Override // android.view.ViewGroup
    public void onViewRemoved(@NotNull View view) {
        super.onViewRemoved(view);
        invalidateStructure();
    }

    @Override // android.view.View, android.view.ViewParent
    public void requestLayout() {
        super.requestLayout();
        if (this.initialized) {
            invalidateMeasurement();
        }
    }

    public final void setColumnCount(int i10) {
        this.grid.setColumnCount(i10);
        invalidateStructure();
        requestLayout();
    }
}
