package com.yandex.div.core.view2;

import android.view.GestureDetector;
import android.view.MotionEvent;
import bn.r;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import sn.a;

/* JADX INFO: compiled from: DivGestureListener.kt */
/* JADX INFO: loaded from: classes10.dex */
public final class DivGestureListener extends GestureDetector.SimpleOnGestureListener {
    private final boolean awaitLongClick;

    @Nullable
    private a<r> onDoubleTapListener;

    @Nullable
    private a<r> onSingleTapListener;

    public DivGestureListener(boolean z10) {
        this.awaitLongClick = z10;
    }

    @Nullable
    public final a<r> getOnDoubleTapListener() {
        return this.onDoubleTapListener;
    }

    @Nullable
    public final a<r> getOnSingleTapListener() {
        return this.onSingleTapListener;
    }

    @Override // android.view.GestureDetector.SimpleOnGestureListener, android.view.GestureDetector.OnDoubleTapListener
    public boolean onDoubleTap(@NotNull MotionEvent motionEvent) {
        a<r> aVar = this.onDoubleTapListener;
        if (aVar == null) {
            return false;
        }
        aVar.invoke();
        return true;
    }

    @Override // android.view.GestureDetector.SimpleOnGestureListener, android.view.GestureDetector.OnGestureListener
    public boolean onDown(@NotNull MotionEvent motionEvent) {
        return (this.awaitLongClick || (this.onDoubleTapListener == null && this.onSingleTapListener == null)) ? false : true;
    }

    @Override // android.view.GestureDetector.SimpleOnGestureListener, android.view.GestureDetector.OnDoubleTapListener
    public boolean onSingleTapConfirmed(@NotNull MotionEvent motionEvent) {
        a<r> aVar;
        if (this.onDoubleTapListener == null || (aVar = this.onSingleTapListener) == null) {
            return false;
        }
        if (aVar == null) {
            return true;
        }
        aVar.invoke();
        return true;
    }

    @Override // android.view.GestureDetector.SimpleOnGestureListener, android.view.GestureDetector.OnGestureListener
    public boolean onSingleTapUp(@NotNull MotionEvent motionEvent) {
        a<r> aVar;
        if (this.onDoubleTapListener != null || (aVar = this.onSingleTapListener) == null) {
            return false;
        }
        if (aVar == null) {
            return true;
        }
        aVar.invoke();
        return true;
    }

    public final void setOnDoubleTapListener(@Nullable a<r> aVar) {
        this.onDoubleTapListener = aVar;
    }

    public final void setOnSingleTapListener(@Nullable a<r> aVar) {
        this.onSingleTapListener = aVar;
    }
}
