package com.inmobi.ads;

import android.content.Context;
import android.graphics.Color;
import android.util.AttributeSet;
import android.view.MotionEvent;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.widget.RelativeLayout;
import com.inmobi.media.C3704r9;
import com.safedk.android.analytics.brandsafety.DetectTouchUtils;
import com.safedk.android.utils.g;
import java.lang.ref.WeakReference;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import tn.p;

/* JADX INFO: loaded from: classes4.dex */
public final class InMobiMovableRelativeLayout extends RelativeLayout {

    @NotNull
    public static final C3704r9 Companion = new C3704r9();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public WeakReference f25100a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public ViewGroup.LayoutParams f25101b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public boolean f25102c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public float f25103d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public float f25104e;

    public InMobiMovableRelativeLayout(@Nullable Context context) {
        super(context);
        this.f25100a = new WeakReference(null);
        this.f25102c = true;
        setBackgroundColor(Color.parseColor("#00000000"));
    }

    public InMobiMovableRelativeLayout(@Nullable Context context, @Nullable AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f25100a = new WeakReference(null);
        this.f25102c = true;
        setBackgroundColor(Color.parseColor("#00000000"));
    }

    public InMobiMovableRelativeLayout(@Nullable Context context, @Nullable AttributeSet attributeSet, int i10) {
        super(context, attributeSet, i10);
        this.f25100a = new WeakReference(null);
        this.f25102c = true;
        setBackgroundColor(Color.parseColor("#00000000"));
    }

    private final void setParentView(ViewGroup viewGroup) {
        this.f25100a = new WeakReference(viewGroup);
    }

    @Override // android.view.ViewGroup, android.view.View
    public boolean dispatchTouchEvent(MotionEvent motionEvent) {
        DetectTouchUtils.viewOnTouch(g.f53135i, this, motionEvent);
        return super.dispatchTouchEvent(motionEvent);
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        ViewParent parent = getParent();
        p.i(parent, "null cannot be cast to non-null type android.view.ViewGroup");
        setParentView((ViewGroup) parent);
        if (this.f25101b == null) {
            this.f25101b = getLayoutParams();
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        setParentView(null);
    }

    @Override // android.view.ViewGroup
    public boolean onInterceptTouchEvent(@NotNull MotionEvent motionEvent) {
        ViewGroup viewGroup;
        p.k(motionEvent, "ev");
        if (this.f25102c) {
            float rawX = motionEvent.getRawX();
            float rawY = motionEvent.getRawY();
            int action = motionEvent.getAction();
            if (action == 0) {
                this.f25103d = rawX;
                this.f25104e = rawY;
            } else if (action == 2 && (viewGroup = (ViewGroup) this.f25100a.get()) != null) {
                float f10 = rawX - this.f25103d;
                int top2 = (int) (getTop() + (rawY - this.f25104e));
                int paddingLeft = viewGroup.getPaddingLeft();
                int paddingTop = viewGroup.getPaddingTop();
                int width = viewGroup.getWidth() - viewGroup.getPaddingRight();
                int height = viewGroup.getHeight() - viewGroup.getPaddingBottom();
                int iMax = Math.max(paddingLeft, Math.min((int) (getLeft() + f10), width - getWidth()));
                int iMax2 = Math.max(paddingTop, Math.min(top2, height - getHeight()));
                layout(iMax, iMax2, getWidth() + iMax, getHeight() + iMax2);
                this.f25103d = rawX;
                this.f25104e = rawY;
            }
        }
        return super.onInterceptTouchEvent(motionEvent);
    }

    @Override // android.widget.RelativeLayout, android.view.View
    protected void onMeasure(int i10, int i11) {
        if (1 == 0) {
            setMeasuredDimension(0, 0);
        } else {
            super.onMeasure(i10, i11);
        }
    }

    public final void resetPosition() {
        setLayoutParams(this.f25101b);
    }

    public final void setIsMovable(boolean z10) {
        this.f25102c = z10;
    }
}
