package com.google.android.exoplayer2.ui;

import android.content.Context;
import android.graphics.Canvas;
import android.util.AttributeSet;
import android.view.MotionEvent;
import android.view.View;
import androidx.annotation.Nullable;
import com.google.android.exoplayer2.ui.SubtitleView;
import com.safedk.android.analytics.brandsafety.DetectTouchUtils;
import g7.b;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/* JADX INFO: loaded from: classes12.dex */
final class CanvasSubtitleOutput extends View implements SubtitleView.a {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final List<h0> f22498b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public List<g7.b> f22499c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public int f22500d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public float f22501e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public b f22502f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public float f22503g;

    public CanvasSubtitleOutput(Context context) {
        this(context, null);
    }

    public CanvasSubtitleOutput(Context context, @Nullable AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f22498b = new ArrayList();
        this.f22499c = Collections.emptyList();
        this.f22500d = 0;
        this.f22501e = 0.0533f;
        this.f22502f = b.f22729g;
        this.f22503g = 0.08f;
    }

    public static g7.b a(g7.b bVar) {
        b.C0768b c0768bP = bVar.b().k(-3.4028235E38f).l(Integer.MIN_VALUE).p(null);
        if (bVar.f62142g == 0) {
            c0768bP.h(1.0f - bVar.f62141f, 0);
        } else {
            c0768bP.h((-bVar.f62141f) - 1.0f, 1);
        }
        int i10 = bVar.f62143h;
        if (i10 == 0) {
            c0768bP.i(2);
        } else if (i10 == 2) {
            c0768bP.i(0);
        }
        return c0768bP.a();
    }

    @Override // android.view.View
    public void dispatchDraw(Canvas canvas) {
        List<g7.b> list = this.f22499c;
        if (list.isEmpty()) {
            return;
        }
        int height = getHeight();
        int paddingLeft = getPaddingLeft();
        int paddingTop = getPaddingTop();
        int width = getWidth() - getPaddingRight();
        int paddingBottom = height - getPaddingBottom();
        if (paddingBottom <= paddingTop || width <= paddingLeft) {
            return;
        }
        int i10 = paddingBottom - paddingTop;
        float fH = k0.h(this.f22500d, this.f22501e, height, i10);
        if (fH <= 0.0f) {
            return;
        }
        int size = list.size();
        int i11 = 0;
        while (i11 < size) {
            g7.b bVarA = list.get(i11);
            if (bVarA.f62152q != Integer.MIN_VALUE) {
                bVarA = a(bVarA);
            }
            g7.b bVar = bVarA;
            int i12 = paddingBottom;
            this.f22498b.get(i11).b(bVar, this.f22502f, fH, k0.h(bVar.f62150o, bVar.f62151p, height, i10), this.f22503g, canvas, paddingLeft, paddingTop, width, i12);
            i11++;
            size = size;
            i10 = i10;
            paddingBottom = i12;
            width = width;
        }
    }

    @Override // android.view.View
    public boolean dispatchTouchEvent(MotionEvent motionEvent) {
        DetectTouchUtils.viewOnTouch("com.google.android.exoplayer", this, motionEvent);
        return super.dispatchTouchEvent(motionEvent);
    }

    @Override // android.view.View
    protected void onMeasure(int i10, int i11) {
        if (1 == 0) {
            setMeasuredDimension(0, 0);
        } else {
            super.onMeasure(i10, i11);
        }
    }

    @Override // com.google.android.exoplayer2.ui.SubtitleView.a
    public void update(List<g7.b> list, b bVar, float f10, int i10, float f11) {
        this.f22499c = list;
        this.f22502f = bVar;
        this.f22501e = f10;
        this.f22500d = i10;
        this.f22503g = f11;
        while (this.f22498b.size() < list.size()) {
            this.f22498b.add(new h0(getContext()));
        }
        invalidate();
    }
}
