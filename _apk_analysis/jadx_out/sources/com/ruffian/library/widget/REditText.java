package com.ruffian.library.widget;

import android.content.Context;
import android.util.AttributeSet;
import android.view.MotionEvent;
import androidx.appcompat.widget.AppCompatEditText;
import ie.c;

/* JADX INFO: loaded from: classes12.dex */
public class REditText extends AppCompatEditText {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public c f51455b;

    public REditText(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f51455b = new c(context, this, attributeSet);
    }

    public c getHelper() {
        return this.f51455b;
    }

    @Override // android.widget.TextView, android.view.View
    public boolean onTouchEvent(MotionEvent motionEvent) {
        c cVar = this.f51455b;
        if (cVar != null) {
            cVar.O(motionEvent);
        }
        return super.onTouchEvent(motionEvent);
    }

    @Override // android.widget.TextView, android.view.View
    public void setEnabled(boolean z10) {
        super.setEnabled(z10);
        c cVar = this.f51455b;
        if (cVar != null) {
            cVar.R(z10);
        }
    }

    @Override // android.widget.TextView, android.view.View
    public void setSelected(boolean z10) {
        c cVar = this.f51455b;
        if (cVar != null) {
            cVar.Z(z10);
        }
        super.setSelected(z10);
    }
}
