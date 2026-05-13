package com.mgs.carparking.widgets.rv;

import android.content.Context;
import androidx.recyclerview.widget.LinearSmoothScroller;

/* JADX INFO: loaded from: classes2.dex */
public class TopSmoothScroller extends LinearSmoothScroller {
    public TopSmoothScroller(Context context) {
        super(context);
    }

    @Override // androidx.recyclerview.widget.LinearSmoothScroller
    public int getHorizontalSnapPreference() {
        return -1;
    }

    @Override // androidx.recyclerview.widget.LinearSmoothScroller
    public int getVerticalSnapPreference() {
        return -1;
    }
}
