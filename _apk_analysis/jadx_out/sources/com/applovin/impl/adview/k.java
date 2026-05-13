package com.applovin.impl.adview;

import android.content.Context;
import android.graphics.drawable.Drawable;
import android.view.MotionEvent;
import android.view.View;
import com.applovin.impl.c2;
import com.safedk.android.analytics.brandsafety.DetectTouchUtils;

/* JADX INFO: loaded from: classes7.dex */
public class k extends View {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final c2 f7775a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private boolean f7776b;

    public interface a {
        void a();

        void b();
    }

    public k(c2 c2Var, Context context) {
        super(context);
        this.f7775a = c2Var;
        setClickable(false);
        setFocusable(false);
    }

    public void a(a aVar) {
        if (this.f7776b) {
            if (aVar != null) {
                aVar.a();
                return;
            }
            return;
        }
        Drawable drawableA = this.f7775a.a();
        if (drawableA == null) {
            if (aVar != null) {
                aVar.b();
            }
        } else {
            setBackground(drawableA);
            this.f7776b = true;
            if (aVar != null) {
                aVar.a();
            }
        }
    }

    public boolean a() {
        return this.f7776b;
    }

    public void b() {
        a(null);
    }

    @Override // android.view.View
    public boolean dispatchTouchEvent(MotionEvent motionEvent) {
        DetectTouchUtils.viewOnTouch(com.safedk.android.utils.g.f53127a, this, motionEvent);
        return super.dispatchTouchEvent(motionEvent);
    }

    public String getIdentifier() {
        return this.f7775a.b();
    }

    @Override // android.view.View
    protected void onMeasure(int i10, int i11) {
        if (1 == 0) {
            setMeasuredDimension(0, 0);
        } else {
            super.onMeasure(i10, i11);
        }
    }
}
