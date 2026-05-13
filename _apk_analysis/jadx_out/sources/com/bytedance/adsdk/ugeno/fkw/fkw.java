package com.bytedance.adsdk.ugeno.fkw;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.drawable.Drawable;
import android.os.Parcel;
import android.os.Parcelable;
import android.util.SparseIntArray;
import android.view.View;
import android.view.ViewGroup;
import androidx.core.view.ViewCompat;
import com.bytedance.adsdk.ugeno.fkw.yu;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* JADX INFO: loaded from: classes6.dex */
public final class fkw extends ViewGroup implements com.bytedance.adsdk.ugeno.fkw.ouw {
    private Drawable bly;

    /* JADX INFO: renamed from: cf, reason: collision with root package name */
    private int f11682cf;
    private int fkw;

    /* JADX INFO: renamed from: jg, reason: collision with root package name */
    private int[] f11683jg;

    /* JADX INFO: renamed from: ko, reason: collision with root package name */
    private SparseIntArray f11684ko;

    /* JADX INFO: renamed from: le, reason: collision with root package name */
    private int f11685le;

    /* JADX INFO: renamed from: lh, reason: collision with root package name */
    private int f11686lh;
    private int mwh;
    public com.bytedance.adsdk.ugeno.yu ouw;
    private Drawable pno;

    /* JADX INFO: renamed from: ra, reason: collision with root package name */
    private int f11687ra;

    /* JADX INFO: renamed from: rn, reason: collision with root package name */
    private yu f11688rn;
    private int ryl;
    private int tlj;

    /* JADX INFO: renamed from: vm, reason: collision with root package name */
    private yu.ouw f11689vm;
    private int vt;
    private int yu;
    private List<lh> zih;

    public static class ouw extends ViewGroup.MarginLayoutParams implements vt {
        public static final Parcelable.Creator<ouw> CREATOR = new Parcelable.Creator<ouw>() { // from class: com.bytedance.adsdk.ugeno.fkw.fkw.ouw.1
            @Override // android.os.Parcelable.Creator
            public final /* synthetic */ ouw createFromParcel(Parcel parcel) {
                return new ouw(parcel);
            }

            @Override // android.os.Parcelable.Creator
            public final /* bridge */ /* synthetic */ ouw[] newArray(int i10) {
                return new ouw[i10];
            }
        };
        private int bly;
        public float fkw;

        /* JADX INFO: renamed from: le, reason: collision with root package name */
        private int f11690le;

        /* JADX INFO: renamed from: lh, reason: collision with root package name */
        public float f11691lh;
        public int ouw;
        private int pno;

        /* JADX INFO: renamed from: ra, reason: collision with root package name */
        private int f11692ra;
        private boolean tlj;
        public float vt;
        public int yu;

        public ouw(int i10, int i11) {
            super(new ViewGroup.LayoutParams(i10, i11));
            this.ouw = 1;
            this.vt = 0.0f;
            this.f11691lh = 0.0f;
            this.yu = -1;
            this.fkw = -1.0f;
            this.f11690le = -1;
            this.f11692ra = -1;
            this.pno = ViewCompat.MEASURED_SIZE_MASK;
            this.bly = ViewCompat.MEASURED_SIZE_MASK;
        }

        public ouw(Parcel parcel) {
            super(0, 0);
            this.ouw = 1;
            this.vt = 0.0f;
            this.f11691lh = 0.0f;
            this.yu = -1;
            this.fkw = -1.0f;
            this.f11690le = -1;
            this.f11692ra = -1;
            this.pno = ViewCompat.MEASURED_SIZE_MASK;
            this.bly = ViewCompat.MEASURED_SIZE_MASK;
            this.ouw = parcel.readInt();
            this.vt = parcel.readFloat();
            this.f11691lh = parcel.readFloat();
            this.yu = parcel.readInt();
            this.fkw = parcel.readFloat();
            this.f11690le = parcel.readInt();
            this.f11692ra = parcel.readInt();
            this.pno = parcel.readInt();
            this.bly = parcel.readInt();
            this.tlj = parcel.readByte() != 0;
            ((ViewGroup.MarginLayoutParams) this).bottomMargin = parcel.readInt();
            ((ViewGroup.MarginLayoutParams) this).leftMargin = parcel.readInt();
            ((ViewGroup.MarginLayoutParams) this).rightMargin = parcel.readInt();
            ((ViewGroup.MarginLayoutParams) this).topMargin = parcel.readInt();
            ((ViewGroup.MarginLayoutParams) this).height = parcel.readInt();
            ((ViewGroup.MarginLayoutParams) this).width = parcel.readInt();
        }

        public ouw(ViewGroup.LayoutParams layoutParams) {
            super(layoutParams);
            this.ouw = 1;
            this.vt = 0.0f;
            this.f11691lh = 0.0f;
            this.yu = -1;
            this.fkw = -1.0f;
            this.f11690le = -1;
            this.f11692ra = -1;
            this.pno = ViewCompat.MEASURED_SIZE_MASK;
            this.bly = ViewCompat.MEASURED_SIZE_MASK;
        }

        public ouw(ViewGroup.MarginLayoutParams marginLayoutParams) {
            super(marginLayoutParams);
            this.ouw = 1;
            this.vt = 0.0f;
            this.f11691lh = 0.0f;
            this.yu = -1;
            this.fkw = -1.0f;
            this.f11690le = -1;
            this.f11692ra = -1;
            this.pno = ViewCompat.MEASURED_SIZE_MASK;
            this.bly = ViewCompat.MEASURED_SIZE_MASK;
        }

        public ouw(ouw ouwVar) {
            super((ViewGroup.MarginLayoutParams) ouwVar);
            this.ouw = 1;
            this.vt = 0.0f;
            this.f11691lh = 0.0f;
            this.yu = -1;
            this.fkw = -1.0f;
            this.f11690le = -1;
            this.f11692ra = -1;
            this.pno = ViewCompat.MEASURED_SIZE_MASK;
            this.bly = ViewCompat.MEASURED_SIZE_MASK;
            this.ouw = ouwVar.ouw;
            this.vt = ouwVar.vt;
            this.f11691lh = ouwVar.f11691lh;
            this.yu = ouwVar.yu;
            this.fkw = ouwVar.fkw;
            this.f11690le = ouwVar.f11690le;
            this.f11692ra = ouwVar.f11692ra;
            this.pno = ouwVar.pno;
            this.bly = ouwVar.bly;
            this.tlj = ouwVar.tlj;
        }

        @Override // com.bytedance.adsdk.ugeno.fkw.vt
        public final int bly() {
            return this.pno;
        }

        @Override // com.bytedance.adsdk.ugeno.fkw.vt
        public final boolean cf() {
            return this.tlj;
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        @Override // com.bytedance.adsdk.ugeno.fkw.vt
        public final float fkw() {
            return this.f11691lh;
        }

        @Override // com.bytedance.adsdk.ugeno.fkw.vt
        public final int jg() {
            return ((ViewGroup.MarginLayoutParams) this).topMargin;
        }

        @Override // com.bytedance.adsdk.ugeno.fkw.vt
        public final int ko() {
            return ((ViewGroup.MarginLayoutParams) this).rightMargin;
        }

        @Override // com.bytedance.adsdk.ugeno.fkw.vt
        public final int le() {
            return this.yu;
        }

        @Override // com.bytedance.adsdk.ugeno.fkw.vt
        public final int lh() {
            return this.ouw;
        }

        @Override // com.bytedance.adsdk.ugeno.fkw.vt
        public final int mwh() {
            return ((ViewGroup.MarginLayoutParams) this).leftMargin;
        }

        @Override // com.bytedance.adsdk.ugeno.fkw.vt
        public final int ouw() {
            return ((ViewGroup.MarginLayoutParams) this).width;
        }

        @Override // com.bytedance.adsdk.ugeno.fkw.vt
        public final void ouw(int i10) {
            this.f11690le = i10;
        }

        @Override // com.bytedance.adsdk.ugeno.fkw.vt
        public final int pno() {
            return this.f11692ra;
        }

        @Override // com.bytedance.adsdk.ugeno.fkw.vt
        public final int ra() {
            return this.f11690le;
        }

        @Override // com.bytedance.adsdk.ugeno.fkw.vt
        public final int rn() {
            return ((ViewGroup.MarginLayoutParams) this).bottomMargin;
        }

        @Override // com.bytedance.adsdk.ugeno.fkw.vt
        public final float ryl() {
            return this.fkw;
        }

        @Override // com.bytedance.adsdk.ugeno.fkw.vt
        public final int tlj() {
            return this.bly;
        }

        @Override // com.bytedance.adsdk.ugeno.fkw.vt
        public final int vt() {
            return ((ViewGroup.MarginLayoutParams) this).height;
        }

        @Override // com.bytedance.adsdk.ugeno.fkw.vt
        public final void vt(int i10) {
            this.f11692ra = i10;
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel parcel, int i10) {
            parcel.writeInt(this.ouw);
            parcel.writeFloat(this.vt);
            parcel.writeFloat(this.f11691lh);
            parcel.writeInt(this.yu);
            parcel.writeFloat(this.fkw);
            parcel.writeInt(this.f11690le);
            parcel.writeInt(this.f11692ra);
            parcel.writeInt(this.pno);
            parcel.writeInt(this.bly);
            parcel.writeByte(this.tlj ? (byte) 1 : (byte) 0);
            parcel.writeInt(((ViewGroup.MarginLayoutParams) this).bottomMargin);
            parcel.writeInt(((ViewGroup.MarginLayoutParams) this).leftMargin);
            parcel.writeInt(((ViewGroup.MarginLayoutParams) this).rightMargin);
            parcel.writeInt(((ViewGroup.MarginLayoutParams) this).topMargin);
            parcel.writeInt(((ViewGroup.MarginLayoutParams) this).height);
            parcel.writeInt(((ViewGroup.MarginLayoutParams) this).width);
        }

        @Override // com.bytedance.adsdk.ugeno.fkw.vt
        public final float yu() {
            return this.vt;
        }
    }

    public fkw(Context context) {
        super(context, null);
        this.f11687ra = -1;
        this.f11688rn = new yu(this);
        this.zih = new ArrayList();
        this.f11689vm = new yu.ouw();
    }

    private boolean fkw(int i10) {
        for (int i11 = 0; i11 < i10; i11++) {
            if (this.zih.get(i11).ouw() > 0) {
                return false;
            }
        }
        return true;
    }

    private boolean fkw(int i10, int i11) {
        return le(i10, i11) ? ouw() ? (this.f11682cf & 1) != 0 : (this.tlj & 1) != 0 : ouw() ? (this.f11682cf & 2) != 0 : (this.tlj & 2) != 0;
    }

    private boolean le(int i10) {
        if (i10 >= 0 && i10 < this.zih.size()) {
            for (int i11 = i10 + 1; i11 < this.zih.size(); i11++) {
                if (this.zih.get(i11).ouw() > 0) {
                    return false;
                }
            }
            if (ouw()) {
                return (this.tlj & 4) != 0;
            }
            if ((this.f11682cf & 4) != 0) {
                return true;
            }
        }
        return false;
    }

    private boolean le(int i10, int i11) {
        for (int i12 = 1; i12 <= i11; i12++) {
            View viewLh = lh(i10 - i12);
            if (viewLh != null && viewLh.getVisibility() != 8) {
                return false;
            }
        }
        return true;
    }

    private View lh(int i10) {
        if (i10 < 0) {
            return null;
        }
        int[] iArr = this.f11683jg;
        if (i10 >= iArr.length) {
            return null;
        }
        return getChildAt(iArr[i10]);
    }

    private void lh(int i10, int i11) {
        this.zih.clear();
        this.f11689vm.ouw();
        this.f11688rn.ouw(this.f11689vm, i10, i11, (List<lh>) null);
        this.zih = this.f11689vm.ouw;
        this.f11688rn.ouw(i10, i11);
        if (this.fkw == 3) {
            for (lh lhVar : this.zih) {
                int iMax = Integer.MIN_VALUE;
                for (int i12 = 0; i12 < lhVar.pno; i12++) {
                    View viewLh = lh(lhVar.f11702ko + i12);
                    if (viewLh != null && viewLh.getVisibility() != 8) {
                        ouw ouwVar = (ouw) viewLh.getLayoutParams();
                        iMax = this.f11686lh != 2 ? Math.max(iMax, viewLh.getMeasuredHeight() + Math.max(lhVar.ryl - viewLh.getBaseline(), ((ViewGroup.MarginLayoutParams) ouwVar).topMargin) + ((ViewGroup.MarginLayoutParams) ouwVar).bottomMargin) : Math.max(iMax, viewLh.getMeasuredHeight() + ((ViewGroup.MarginLayoutParams) ouwVar).topMargin + Math.max((lhVar.ryl - viewLh.getMeasuredHeight()) + viewLh.getBaseline(), ((ViewGroup.MarginLayoutParams) ouwVar).bottomMargin));
                    }
                }
                lhVar.f11705ra = iMax;
            }
        }
        this.f11688rn.ouw(i10, i11, getPaddingTop() + getPaddingBottom());
        this.f11688rn.ouw();
        ouw(this.vt, i10, i11, this.f11689vm.vt);
    }

    private void ouw(int i10, int i11, int i12, int i13) {
        int sumOfCrossSize;
        int largestMainSize;
        int iResolveSizeAndState;
        int iResolveSizeAndState2;
        int mode = View.MeasureSpec.getMode(i11);
        int size = View.MeasureSpec.getSize(i11);
        int mode2 = View.MeasureSpec.getMode(i12);
        int size2 = View.MeasureSpec.getSize(i12);
        if (i10 == 0 || i10 == 1) {
            sumOfCrossSize = getSumOfCrossSize() + getPaddingTop() + getPaddingBottom();
            largestMainSize = getLargestMainSize();
        } else {
            if (i10 != 2 && i10 != 3) {
                throw new IllegalArgumentException("Invalid flex direction: ".concat(String.valueOf(i10)));
            }
            sumOfCrossSize = getLargestMainSize();
            largestMainSize = getSumOfCrossSize() + getPaddingLeft() + getPaddingRight();
        }
        if (mode == Integer.MIN_VALUE) {
            if (size < largestMainSize) {
                i13 = View.combineMeasuredStates(i13, 16777216);
            } else {
                size = largestMainSize;
            }
            iResolveSizeAndState = View.resolveSizeAndState(size, i11, i13);
        } else if (mode == 0) {
            iResolveSizeAndState = View.resolveSizeAndState(largestMainSize, i11, i13);
        } else {
            if (mode != 1073741824) {
                throw new IllegalStateException("Unknown width mode is set: ".concat(String.valueOf(mode)));
            }
            if (size < largestMainSize) {
                i13 = View.combineMeasuredStates(i13, 16777216);
            }
            iResolveSizeAndState = View.resolveSizeAndState(size, i11, i13);
        }
        if (mode2 == Integer.MIN_VALUE) {
            if (size2 < sumOfCrossSize) {
                i13 = View.combineMeasuredStates(i13, 256);
            } else {
                size2 = sumOfCrossSize;
            }
            iResolveSizeAndState2 = View.resolveSizeAndState(size2, i12, i13);
        } else if (mode2 == 0) {
            iResolveSizeAndState2 = View.resolveSizeAndState(sumOfCrossSize, i12, i13);
        } else {
            if (mode2 != 1073741824) {
                throw new IllegalStateException("Unknown height mode is set: ".concat(String.valueOf(mode2)));
            }
            if (size2 < sumOfCrossSize) {
                i13 = View.combineMeasuredStates(i13, 256);
            }
            iResolveSizeAndState2 = View.resolveSizeAndState(size2, i12, i13);
        }
        setMeasuredDimension(iResolveSizeAndState, iResolveSizeAndState2);
    }

    private void ouw(Canvas canvas, int i10, int i11, int i12) {
        Drawable drawable = this.bly;
        if (drawable == null) {
            return;
        }
        drawable.setBounds(i10, i11, this.mwh + i10, i12 + i11);
        this.bly.draw(canvas);
    }

    private void ouw(Canvas canvas, boolean z10, boolean z11) {
        int paddingLeft = getPaddingLeft();
        int iMax = Math.max(0, (getWidth() - getPaddingRight()) - paddingLeft);
        int size = this.zih.size();
        for (int i10 = 0; i10 < size; i10++) {
            lh lhVar = this.zih.get(i10);
            for (int i11 = 0; i11 < lhVar.pno; i11++) {
                int i12 = lhVar.f11702ko + i11;
                View viewLh = lh(i12);
                if (viewLh != null && viewLh.getVisibility() != 8) {
                    ouw ouwVar = (ouw) viewLh.getLayoutParams();
                    if (fkw(i12, i11)) {
                        ouw(canvas, z10 ? viewLh.getRight() + ((ViewGroup.MarginLayoutParams) ouwVar).rightMargin : (viewLh.getLeft() - ((ViewGroup.MarginLayoutParams) ouwVar).leftMargin) - this.mwh, lhVar.vt, lhVar.f11705ra);
                    }
                    if (i11 == lhVar.pno - 1 && (this.f11682cf & 4) > 0) {
                        ouw(canvas, z10 ? (viewLh.getLeft() - ((ViewGroup.MarginLayoutParams) ouwVar).leftMargin) - this.mwh : viewLh.getRight() + ((ViewGroup.MarginLayoutParams) ouwVar).rightMargin, lhVar.vt, lhVar.f11705ra);
                    }
                }
            }
            if (yu(i10)) {
                vt(canvas, paddingLeft, z11 ? lhVar.yu : lhVar.vt - this.ryl, iMax);
            }
            if (le(i10) && (this.tlj & 4) > 0) {
                vt(canvas, paddingLeft, z11 ? lhVar.vt - this.ryl : lhVar.yu, iMax);
            }
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:41:0x00d1  */
    /* JADX WARN: Removed duplicated region for block: B:58:0x0120  */
    /* JADX WARN: Removed duplicated region for block: B:61:0x017d  */
    /* JADX WARN: Removed duplicated region for block: B:67:0x01e0  */
    /* JADX WARN: Removed duplicated region for block: B:68:0x01ed  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private void ouw(boolean r29, int r30, int r31, int r32, int r33) {
        /*
            Method dump skipped, instruction units count: 552
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bytedance.adsdk.ugeno.fkw.fkw.ouw(boolean, int, int, int, int):void");
    }

    /* JADX WARN: Removed duplicated region for block: B:42:0x00cf  */
    /* JADX WARN: Removed duplicated region for block: B:58:0x0120  */
    /* JADX WARN: Removed duplicated region for block: B:61:0x0179  */
    /* JADX WARN: Removed duplicated region for block: B:67:0x01dc  */
    /* JADX WARN: Removed duplicated region for block: B:68:0x01e9  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private void ouw(boolean r30, boolean r31, int r32, int r33, int r34, int r35) {
        /*
            Method dump skipped, instruction units count: 536
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bytedance.adsdk.ugeno.fkw.fkw.ouw(boolean, boolean, int, int, int, int):void");
    }

    private void vt() {
        if (this.pno == null && this.bly == null) {
            setWillNotDraw(true);
        } else {
            setWillNotDraw(false);
        }
    }

    private void vt(int i10, int i11) {
        if (this.f11684ko == null) {
            this.f11684ko = new SparseIntArray(getChildCount());
        }
        if (this.f11688rn.vt(this.f11684ko)) {
            this.f11683jg = this.f11688rn.ouw(this.f11684ko);
        }
        int i12 = this.vt;
        if (i12 == 0 || i12 == 1) {
            lh(i10, i11);
        } else if (i12 == 2 || i12 == 3) {
            yu(i10, i11);
        } else {
            throw new IllegalStateException("Invalid value for the flex direction is set: " + this.vt);
        }
    }

    private void vt(Canvas canvas, int i10, int i11, int i12) {
        Drawable drawable = this.pno;
        if (drawable == null) {
            return;
        }
        drawable.setBounds(i10, i11, i12 + i10, this.ryl + i11);
        this.pno.draw(canvas);
    }

    private void vt(Canvas canvas, boolean z10, boolean z11) {
        int paddingTop = getPaddingTop();
        int iMax = Math.max(0, (getHeight() - getPaddingBottom()) - paddingTop);
        int size = this.zih.size();
        for (int i10 = 0; i10 < size; i10++) {
            lh lhVar = this.zih.get(i10);
            for (int i11 = 0; i11 < lhVar.pno; i11++) {
                int i12 = lhVar.f11702ko + i11;
                View viewLh = lh(i12);
                if (viewLh != null && viewLh.getVisibility() != 8) {
                    ouw ouwVar = (ouw) viewLh.getLayoutParams();
                    if (fkw(i12, i11)) {
                        vt(canvas, lhVar.ouw, z11 ? viewLh.getBottom() + ((ViewGroup.MarginLayoutParams) ouwVar).bottomMargin : (viewLh.getTop() - ((ViewGroup.MarginLayoutParams) ouwVar).topMargin) - this.ryl, lhVar.f11705ra);
                    }
                    if (i11 == lhVar.pno - 1 && (this.tlj & 4) > 0) {
                        vt(canvas, lhVar.ouw, z11 ? (viewLh.getTop() - ((ViewGroup.MarginLayoutParams) ouwVar).topMargin) - this.ryl : viewLh.getBottom() + ((ViewGroup.MarginLayoutParams) ouwVar).bottomMargin, lhVar.f11705ra);
                    }
                }
            }
            if (yu(i10)) {
                ouw(canvas, z10 ? lhVar.f11704lh : lhVar.ouw - this.mwh, paddingTop, iMax);
            }
            if (le(i10) && (this.f11682cf & 4) > 0) {
                ouw(canvas, z10 ? lhVar.ouw - this.mwh : lhVar.f11704lh, paddingTop, iMax);
            }
        }
    }

    private void yu(int i10, int i11) {
        this.zih.clear();
        this.f11689vm.ouw();
        this.f11688rn.ouw(this.f11689vm, i10, i11);
        this.zih = this.f11689vm.ouw;
        this.f11688rn.ouw(i10, i11);
        this.f11688rn.ouw(i10, i11, getPaddingLeft() + getPaddingRight());
        this.f11688rn.ouw();
        ouw(this.vt, i10, i11, this.f11689vm.vt);
    }

    private boolean yu(int i10) {
        if (i10 >= 0 && i10 < this.zih.size()) {
            if (fkw(i10)) {
                return ouw() ? (this.tlj & 1) != 0 : (this.f11682cf & 1) != 0;
            }
            if (ouw()) {
                return (this.tlj & 2) != 0;
            }
            if ((this.f11682cf & 2) != 0) {
                return true;
            }
        }
        return false;
    }

    @Override // android.view.ViewGroup
    public final void addView(View view, int i10, ViewGroup.LayoutParams layoutParams) {
        if (this.f11684ko == null) {
            this.f11684ko = new SparseIntArray(getChildCount());
        }
        this.f11683jg = this.f11688rn.ouw(view, i10, layoutParams, this.f11684ko);
        super.addView(view, i10, layoutParams);
    }

    @Override // android.view.ViewGroup
    public final boolean checkLayoutParams(ViewGroup.LayoutParams layoutParams) {
        return layoutParams instanceof ouw;
    }

    @Override // android.view.ViewGroup
    public final ViewGroup.LayoutParams generateLayoutParams(ViewGroup.LayoutParams layoutParams) {
        return layoutParams instanceof ouw ? new ouw((ouw) layoutParams) : layoutParams instanceof ViewGroup.MarginLayoutParams ? new ouw((ViewGroup.MarginLayoutParams) layoutParams) : new ouw(layoutParams);
    }

    @Override // com.bytedance.adsdk.ugeno.fkw.ouw
    public final int getAlignContent() {
        return this.f11685le;
    }

    @Override // com.bytedance.adsdk.ugeno.fkw.ouw
    public final int getAlignItems() {
        return this.fkw;
    }

    public final Drawable getDividerDrawableHorizontal() {
        return this.pno;
    }

    public final Drawable getDividerDrawableVertical() {
        return this.bly;
    }

    @Override // com.bytedance.adsdk.ugeno.fkw.ouw
    public final int getFlexDirection() {
        return this.vt;
    }

    @Override // com.bytedance.adsdk.ugeno.fkw.ouw
    public final int getFlexItemCount() {
        return getChildCount();
    }

    public final List<lh> getFlexLines() {
        ArrayList arrayList = new ArrayList(this.zih.size());
        for (lh lhVar : this.zih) {
            if (lhVar.ouw() != 0) {
                arrayList.add(lhVar);
            }
        }
        return arrayList;
    }

    @Override // com.bytedance.adsdk.ugeno.fkw.ouw
    public final List<lh> getFlexLinesInternal() {
        return this.zih;
    }

    @Override // com.bytedance.adsdk.ugeno.fkw.ouw
    public final int getFlexWrap() {
        return this.f11686lh;
    }

    public final int getJustifyContent() {
        return this.yu;
    }

    @Override // com.bytedance.adsdk.ugeno.fkw.ouw
    public final int getLargestMainSize() {
        Iterator<lh> it = this.zih.iterator();
        int iMax = Integer.MIN_VALUE;
        while (it.hasNext()) {
            iMax = Math.max(iMax, it.next().fkw);
        }
        return iMax;
    }

    @Override // com.bytedance.adsdk.ugeno.fkw.ouw
    public final int getMaxLine() {
        return this.f11687ra;
    }

    public final int getShowDividerHorizontal() {
        return this.tlj;
    }

    public final int getShowDividerVertical() {
        return this.f11682cf;
    }

    @Override // com.bytedance.adsdk.ugeno.fkw.ouw
    public final int getSumOfCrossSize() {
        int size = this.zih.size();
        int i10 = 0;
        for (int i11 = 0; i11 < size; i11++) {
            lh lhVar = this.zih.get(i11);
            if (yu(i11)) {
                i10 += ouw() ? this.ryl : this.mwh;
            }
            if (le(i11)) {
                i10 += ouw() ? this.ryl : this.mwh;
            }
            i10 += lhVar.f11705ra;
        }
        return i10;
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        com.bytedance.adsdk.ugeno.yu yuVar = this.ouw;
        if (yuVar != null) {
            yuVar.le();
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        com.bytedance.adsdk.ugeno.yu yuVar = this.ouw;
        if (yuVar != null) {
            yuVar.ra();
        }
    }

    @Override // android.view.View
    public final void onDraw(Canvas canvas) {
        if (this.bly == null && this.pno == null) {
            return;
        }
        if (this.tlj == 0 && this.f11682cf == 0) {
            return;
        }
        int iOuw = com.bytedance.adsdk.ugeno.ra.le.ouw(this);
        int i10 = this.vt;
        if (i10 == 0) {
            ouw(canvas, iOuw == 1, this.f11686lh == 2);
            return;
        }
        if (i10 == 1) {
            ouw(canvas, iOuw != 1, this.f11686lh == 2);
            return;
        }
        if (i10 == 2) {
            boolean z10 = iOuw == 1;
            if (this.f11686lh == 2) {
                z10 = !z10;
            }
            vt(canvas, z10, false);
            return;
        }
        if (i10 != 3) {
            return;
        }
        boolean z11 = iOuw == 1;
        if (this.f11686lh == 2) {
            z11 = !z11;
        }
        vt(canvas, z11, true);
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onLayout(boolean z10, int i10, int i11, int i12, int i13) {
        boolean z11;
        com.bytedance.adsdk.ugeno.yu yuVar = this.ouw;
        if (yuVar != null) {
            yuVar.yu();
        }
        int iOuw = com.bytedance.adsdk.ugeno.ra.le.ouw(this);
        int i14 = this.vt;
        if (i14 == 0) {
            ouw(iOuw == 1, i10, i11, i12, i13);
        } else if (i14 == 1) {
            ouw(iOuw != 1, i10, i11, i12, i13);
        } else if (i14 == 2) {
            z11 = iOuw == 1;
            ouw(this.f11686lh == 2 ? !z11 : z11, false, i10, i11, i12, i13);
        } else {
            if (i14 != 3) {
                throw new IllegalStateException("Invalid flex direction is set: " + this.vt);
            }
            z11 = iOuw == 1;
            ouw(this.f11686lh == 2 ? !z11 : z11, true, i10, i11, i12, i13);
        }
        com.bytedance.adsdk.ugeno.yu yuVar2 = this.ouw;
        if (yuVar2 != null) {
            yuVar2.fkw();
        }
    }

    @Override // android.view.View
    public final void onMeasure(int i10, int i11) {
        com.bytedance.adsdk.ugeno.yu yuVar = this.ouw;
        if (yuVar != null) {
            int[] iArrOuw = yuVar.ouw(i10, i11);
            vt(iArrOuw[0], iArrOuw[1]);
        } else {
            vt(i10, i11);
        }
        com.bytedance.adsdk.ugeno.yu yuVar2 = this.ouw;
        if (yuVar2 != null) {
            yuVar2.lh();
        }
    }

    @Override // android.view.View
    public final void onSizeChanged(int i10, int i11, int i12, int i13) {
        super.onSizeChanged(i10, i11, i12, i13);
        com.bytedance.adsdk.ugeno.yu yuVar = this.ouw;
        if (yuVar != null) {
            yuVar.vt(i10, i11);
        }
    }

    @Override // android.view.View
    public final void onWindowFocusChanged(boolean z10) {
        super.onWindowFocusChanged(z10);
    }

    @Override // com.bytedance.adsdk.ugeno.fkw.ouw
    public final int ouw(int i10, int i11) {
        int i12;
        int i13;
        if (ouw()) {
            i12 = fkw(i10, i11) ? 0 + this.mwh : 0;
            if ((this.f11682cf & 4) <= 0) {
                return i12;
            }
            i13 = this.mwh;
        } else {
            i12 = fkw(i10, i11) ? 0 + this.ryl : 0;
            if ((this.tlj & 4) <= 0) {
                return i12;
            }
            i13 = this.ryl;
        }
        return i12 + i13;
    }

    @Override // com.bytedance.adsdk.ugeno.fkw.ouw
    public final int ouw(int i10, int i11, int i12) {
        return ViewGroup.getChildMeasureSpec(i10, i11, i12);
    }

    @Override // com.bytedance.adsdk.ugeno.fkw.ouw
    public final View ouw(int i10) {
        return getChildAt(i10);
    }

    @Override // com.bytedance.adsdk.ugeno.fkw.ouw
    public final void ouw(int i10, int i11, lh lhVar) {
        if (fkw(i10, i11)) {
            if (ouw()) {
                int i12 = lhVar.fkw;
                int i13 = this.mwh;
                lhVar.fkw = i12 + i13;
                lhVar.f11703le += i13;
                return;
            }
            int i14 = lhVar.fkw;
            int i15 = this.ryl;
            lhVar.fkw = i14 + i15;
            lhVar.f11703le += i15;
        }
    }

    @Override // com.bytedance.adsdk.ugeno.fkw.ouw
    public final void ouw(lh lhVar) {
        if (ouw()) {
            if ((this.f11682cf & 4) > 0) {
                int i10 = lhVar.fkw;
                int i11 = this.mwh;
                lhVar.fkw = i10 + i11;
                lhVar.f11703le += i11;
                return;
            }
            return;
        }
        if ((this.tlj & 4) > 0) {
            int i12 = lhVar.fkw;
            int i13 = this.ryl;
            lhVar.fkw = i12 + i13;
            lhVar.f11703le += i13;
        }
    }

    @Override // com.bytedance.adsdk.ugeno.fkw.ouw
    public final boolean ouw() {
        int i10 = this.vt;
        return i10 == 0 || i10 == 1;
    }

    public final void setAlignContent(int i10) {
        if (this.f11685le != i10) {
            this.f11685le = i10;
            requestLayout();
        }
    }

    public final void setAlignItems(int i10) {
        if (this.fkw != i10) {
            this.fkw = i10;
            requestLayout();
        }
    }

    public final void setDividerDrawable(Drawable drawable) {
        setDividerDrawableHorizontal(drawable);
        setDividerDrawableVertical(drawable);
    }

    public final void setDividerDrawableHorizontal(Drawable drawable) {
        if (drawable == this.pno) {
            return;
        }
        this.pno = drawable;
        if (drawable != null) {
            this.ryl = drawable.getIntrinsicHeight();
        } else {
            this.ryl = 0;
        }
        vt();
        requestLayout();
    }

    public final void setDividerDrawableVertical(Drawable drawable) {
        if (drawable == this.bly) {
            return;
        }
        this.bly = drawable;
        if (drawable != null) {
            this.mwh = drawable.getIntrinsicWidth();
        } else {
            this.mwh = 0;
        }
        vt();
        requestLayout();
    }

    public final void setFlexDirection(int i10) {
        if (this.vt != i10) {
            this.vt = i10;
            requestLayout();
        }
    }

    @Override // com.bytedance.adsdk.ugeno.fkw.ouw
    public final void setFlexLines(List<lh> list) {
        this.zih = list;
    }

    public final void setFlexWrap(int i10) {
        if (this.f11686lh != i10) {
            this.f11686lh = i10;
            requestLayout();
        }
    }

    public final void setJustifyContent(int i10) {
        if (this.yu != i10) {
            this.yu = i10;
            requestLayout();
        }
    }

    public final void setMaxLine(int i10) {
        if (this.f11687ra != i10) {
            this.f11687ra = i10;
            requestLayout();
        }
    }

    public final void setShowDivider(int i10) {
        setShowDividerVertical(i10);
        setShowDividerHorizontal(i10);
    }

    public final void setShowDividerHorizontal(int i10) {
        if (i10 != this.tlj) {
            this.tlj = i10;
            requestLayout();
        }
    }

    public final void setShowDividerVertical(int i10) {
        if (i10 != this.f11682cf) {
            this.f11682cf = i10;
            requestLayout();
        }
    }

    @Override // com.bytedance.adsdk.ugeno.fkw.ouw
    public final int vt(int i10, int i11, int i12) {
        return ViewGroup.getChildMeasureSpec(i10, i11, i12);
    }

    @Override // com.bytedance.adsdk.ugeno.fkw.ouw
    public final View vt(int i10) {
        return lh(i10);
    }
}
