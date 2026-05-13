package com.fyber.inneractive.sdk.player.ui;

import android.view.GestureDetector;
import android.view.MotionEvent;
import android.view.View;
import com.fyber.inneractive.sdk.player.controller.z;
import com.fyber.inneractive.sdk.util.g1;

/* JADX INFO: loaded from: classes4.dex */
public final class q extends GestureDetector.SimpleOnGestureListener {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ View f19032a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ int[] f19033b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ int f19034c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ s f19035d;

    public q(s sVar, View view, int[] iArr, int i10) {
        this.f19035d = sVar;
        this.f19032a = view;
        this.f19033b = iArr;
        this.f19034c = i10;
    }

    @Override // android.view.GestureDetector.SimpleOnGestureListener, android.view.GestureDetector.OnDoubleTapListener
    public final boolean onDoubleTap(MotionEvent motionEvent) {
        onSingleTapConfirmed(motionEvent);
        return true;
    }

    @Override // android.view.GestureDetector.SimpleOnGestureListener, android.view.GestureDetector.OnGestureListener
    public final boolean onDown(MotionEvent motionEvent) {
        return true;
    }

    @Override // android.view.GestureDetector.SimpleOnGestureListener, android.view.GestureDetector.OnGestureListener
    public final void onLongPress(MotionEvent motionEvent) {
        onSingleTapConfirmed(motionEvent);
    }

    @Override // android.view.GestureDetector.SimpleOnGestureListener, android.view.GestureDetector.OnDoubleTapListener
    public final boolean onSingleTapConfirmed(MotionEvent motionEvent) {
        if (motionEvent.getAction() == 0) {
            this.f19032a.getRootView().getLocationOnScreen(this.f19033b);
            float rawX = motionEvent.getRawX() - this.f19033b[0];
            float rawY = motionEvent.getRawY() - this.f19033b[1];
            g1 g1Var = this.f19035d.f19016a;
            g1Var.f19528a = rawX;
            g1Var.f19529b = rawY;
        }
        s sVar = this.f19035d;
        n nVar = sVar.f19022g;
        if (nVar != null) {
            ((z) nVar).a(this.f19034c, sVar.f19016a);
        }
        return true;
    }

    @Override // android.view.GestureDetector.SimpleOnGestureListener, android.view.GestureDetector.OnGestureListener
    public final boolean onSingleTapUp(MotionEvent motionEvent) {
        return true;
    }
}
