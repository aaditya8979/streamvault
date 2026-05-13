package com.applovin.impl.adview;

import android.annotation.SuppressLint;
import android.content.Context;
import android.graphics.Point;
import android.graphics.PointF;
import android.os.SystemClock;
import android.view.MotionEvent;
import android.view.View;
import com.applovin.impl.o0;
import com.applovin.impl.x4;
import com.applovin.sdk.AppLovinSdkUtils;

/* JADX INFO: loaded from: classes8.dex */
public class AppLovinTouchToClickListener implements View.OnTouchListener {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final long f7668a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final int f7669b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final int f7670c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final ClickRecognitionState f7671d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private long f7672e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private PointF f7673f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private boolean f7674g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private final Context f7675h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private final OnClickListener f7676i;

    public enum ClickRecognitionState {
        DISABLED,
        ACTION_DOWN,
        ACTION_POINTER_UP,
        ACTION_UP
    }

    public interface OnClickListener {
        void onClick(View view, MotionEvent motionEvent);
    }

    public AppLovinTouchToClickListener(com.applovin.impl.sdk.k kVar, x4 x4Var, Context context, OnClickListener onClickListener) {
        this.f7668a = ((Long) kVar.a(x4.f10692c0)).longValue();
        this.f7669b = ((Integer) kVar.a(x4.f10701d0)).intValue();
        this.f7670c = AppLovinSdkUtils.dpToPx(context, ((Integer) kVar.a(x4.f10737h0)).intValue());
        this.f7671d = ClickRecognitionState.values()[((Integer) kVar.a(x4Var)).intValue()];
        this.f7675h = context;
        this.f7676i = onClickListener;
    }

    private float a(float f10) {
        return f10 / this.f7675h.getResources().getDisplayMetrics().density;
    }

    private float a(PointF pointF, PointF pointF2) {
        float f10 = pointF.x - pointF2.x;
        float f11 = pointF.y - pointF2.y;
        return a((float) Math.sqrt((f10 * f10) + (f11 * f11)));
    }

    private void a(View view, MotionEvent motionEvent) {
        this.f7676i.onClick(view, motionEvent);
        this.f7674g = true;
    }

    private boolean a(MotionEvent motionEvent) {
        if (this.f7670c <= 0) {
            return true;
        }
        Point pointB = o0.b(this.f7675h);
        float rawX = motionEvent.getRawX();
        float rawY = motionEvent.getRawY();
        int i10 = this.f7670c;
        float f10 = i10;
        return rawX >= f10 && rawY >= f10 && rawX <= ((float) (pointB.x - i10)) && rawY <= ((float) (pointB.y - i10));
    }

    @Override // android.view.View.OnTouchListener
    @SuppressLint({"ClickableViewAccessibility"})
    public boolean onTouch(View view, MotionEvent motionEvent) {
        int i10;
        int actionMasked = motionEvent.getActionMasked();
        if (actionMasked != 0) {
            if (actionMasked != 1) {
                if (actionMasked == 6 && !this.f7674g && this.f7671d == ClickRecognitionState.ACTION_POINTER_UP) {
                    a(view, motionEvent);
                }
            } else if (!this.f7674g && this.f7671d == ClickRecognitionState.ACTION_UP) {
                a(view, motionEvent);
            } else if (this.f7671d == ClickRecognitionState.DISABLED) {
                long jElapsedRealtime = SystemClock.elapsedRealtime() - this.f7672e;
                float fA = a(this.f7673f, new PointF(motionEvent.getX(), motionEvent.getY()));
                if (!this.f7674g) {
                    long j10 = this.f7668a;
                    if ((j10 < 0 || jElapsedRealtime < j10) && ((i10 = this.f7669b) < 0 || fA < i10)) {
                        a(view, motionEvent);
                    }
                }
            }
        } else if (this.f7671d != ClickRecognitionState.ACTION_DOWN) {
            this.f7672e = SystemClock.elapsedRealtime();
            this.f7673f = new PointF(motionEvent.getX(), motionEvent.getY());
            this.f7674g = false;
        } else if (a(motionEvent)) {
            a(view, motionEvent);
        }
        return true;
    }
}
