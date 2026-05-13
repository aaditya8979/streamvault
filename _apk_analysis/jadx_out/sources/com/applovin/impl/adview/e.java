package com.applovin.impl.adview;

import android.content.Context;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import com.safedk.android.analytics.brandsafety.DetectTouchUtils;

/* JADX INFO: loaded from: classes7.dex */
public abstract class e extends View {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public float f7748a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Context f7749b;

    public enum a {
        WHITE_ON_BLACK(0),
        WHITE_ON_TRANSPARENT(1),
        INVISIBLE(2),
        TRANSPARENT_SKIP(3);


        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final int f7755a;

        a(int i10) {
            this.f7755a = i10;
        }

        public int b() {
            return this.f7755a;
        }
    }

    public e(Context context) {
        super(context);
        this.f7748a = 1.0f;
        this.f7749b = context;
    }

    public static e a(a aVar, Context context) {
        return aVar.equals(a.INVISIBLE) ? new h(context) : aVar.equals(a.WHITE_ON_TRANSPARENT) ? new i(context) : aVar.equals(a.TRANSPARENT_SKIP) ? new j(context) : new n(context);
    }

    public void a(int i10) {
        setViewScale(i10 / 30.0f);
        ViewGroup.LayoutParams layoutParams = getLayoutParams();
        if (layoutParams != null) {
            layoutParams.width = (int) getSize();
            layoutParams.height = (int) getSize();
        }
    }

    @Override // android.view.View
    public boolean dispatchTouchEvent(MotionEvent motionEvent) {
        DetectTouchUtils.viewOnTouch(com.safedk.android.utils.g.f53127a, this, motionEvent);
        return super.dispatchTouchEvent(motionEvent);
    }

    public float getSize() {
        return this.f7748a * 30.0f;
    }

    public abstract a getStyle();

    @Override // android.view.View
    protected void onMeasure(int i10, int i11) {
        if (1 == 0) {
            setMeasuredDimension(0, 0);
        } else {
            super.onMeasure(i10, i11);
        }
    }

    public void setViewScale(float f10) {
        this.f7748a = f10;
    }
}
