package androidx.constraintlayout.core.motion.utils;

import androidx.constraintlayout.core.motion.MotionWidget;

/* JADX INFO: loaded from: classes2.dex */
public class ViewState {
    public int bottom;
    public int left;
    public int right;
    public float rotation;

    /* JADX INFO: renamed from: top, reason: collision with root package name */
    public int f4186top;

    public void getState(MotionWidget motionWidget) {
        this.left = motionWidget.getLeft();
        this.f4186top = motionWidget.getTop();
        this.right = motionWidget.getRight();
        this.bottom = motionWidget.getBottom();
        this.rotation = (int) motionWidget.getRotationZ();
    }

    public int height() {
        return this.bottom - this.f4186top;
    }

    public int width() {
        return this.right - this.left;
    }
}
