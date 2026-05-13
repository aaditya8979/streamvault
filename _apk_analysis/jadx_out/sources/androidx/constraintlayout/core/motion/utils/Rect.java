package androidx.constraintlayout.core.motion.utils;

/* JADX INFO: loaded from: classes5.dex */
public class Rect {
    public int bottom;
    public int left;
    public int right;

    /* JADX INFO: renamed from: top, reason: collision with root package name */
    public int f4185top;

    public int height() {
        return this.bottom - this.f4185top;
    }

    public int width() {
        return this.right - this.left;
    }
}
