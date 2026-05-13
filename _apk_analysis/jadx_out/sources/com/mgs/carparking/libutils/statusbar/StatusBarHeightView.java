package com.mgs.carparking.libutils.statusbar;

import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import fc.a;

/* JADX INFO: loaded from: classes3.dex */
public class StatusBarHeightView extends View {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public int f43873b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public boolean f43874c;

    public StatusBarHeightView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    public StatusBarHeightView(Context context, AttributeSet attributeSet, int i10) {
        super(context, attributeSet, i10);
        this.f43874c = true;
        this.f43873b = a.b(getContext());
    }

    @Override // android.view.View
    public void onMeasure(int i10, int i11) {
        super.onMeasure(i10, i11);
        setMeasuredDimension(View.getDefaultSize(getSuggestedMinimumWidth(), i10), this.f43874c ? this.f43873b : 0);
    }
}
