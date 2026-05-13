package androidx.constraintlayout.core.motion.utils;

/* JADX INFO: loaded from: classes4.dex */
public class FloatRect {
    public float bottom;
    public float left;
    public float right;

    /* JADX INFO: renamed from: top, reason: collision with root package name */
    public float f4184top;

    public final float centerX() {
        return (this.left + this.right) * 0.5f;
    }

    public final float centerY() {
        return (this.f4184top + this.bottom) * 0.5f;
    }
}
