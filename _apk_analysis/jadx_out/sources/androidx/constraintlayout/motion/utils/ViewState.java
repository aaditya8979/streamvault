package androidx.constraintlayout.motion.utils;

import android.view.View;

/* JADX INFO: loaded from: classes7.dex */
public class ViewState {
    public int bottom;
    public int left;
    public int right;
    public float rotation;

    /* JADX INFO: renamed from: top, reason: collision with root package name */
    public int f4196top;

    public void getState(View view) {
        this.left = view.getLeft();
        this.f4196top = view.getTop();
        this.right = view.getRight();
        this.bottom = view.getBottom();
        this.rotation = view.getRotation();
    }

    public int height() {
        return this.bottom - this.f4196top;
    }

    public int width() {
        return this.right - this.left;
    }
}
