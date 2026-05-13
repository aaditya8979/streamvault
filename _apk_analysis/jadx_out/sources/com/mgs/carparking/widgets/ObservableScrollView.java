package com.mgs.carparking.widgets;

import android.content.Context;
import android.util.AttributeSet;
import android.widget.ScrollView;
import id.d;

/* JADX INFO: loaded from: classes5.dex */
public class ObservableScrollView extends ScrollView {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public d f45073b;

    public ObservableScrollView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f45073b = null;
    }

    public ObservableScrollView(Context context, AttributeSet attributeSet, int i10) {
        super(context, attributeSet, i10);
        this.f45073b = null;
    }

    @Override // android.view.View
    public void onScrollChanged(int i10, int i11, int i12, int i13) {
        super.onScrollChanged(i10, i11, i12, i13);
        d dVar = this.f45073b;
        if (dVar != null) {
            dVar.a(this, i10, i11, i12, i13);
        }
    }

    public void setScrollViewListener(d dVar) {
        this.f45073b = dVar;
    }
}
