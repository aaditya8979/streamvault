package androidx.constraintlayout.core.widgets;

/* JADX INFO: loaded from: classes4.dex */
public class Rectangle {
    public int height;
    public int width;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public int f4191x;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public int f4192y;

    public boolean contains(int i10, int i11) {
        int i12;
        int i13 = this.f4191x;
        return i10 >= i13 && i10 < i13 + this.width && i11 >= (i12 = this.f4192y) && i11 < i12 + this.height;
    }

    public int getCenterX() {
        return (this.f4191x + this.width) / 2;
    }

    public int getCenterY() {
        return (this.f4192y + this.height) / 2;
    }

    public void grow(int i10, int i11) {
        this.f4191x -= i10;
        this.f4192y -= i11;
        this.width += i10 * 2;
        this.height += i11 * 2;
    }

    public boolean intersects(Rectangle rectangle) {
        int i10;
        int i11;
        int i12 = this.f4191x;
        int i13 = rectangle.f4191x;
        return i12 >= i13 && i12 < i13 + rectangle.width && (i10 = this.f4192y) >= (i11 = rectangle.f4192y) && i10 < i11 + rectangle.height;
    }

    public void setBounds(int i10, int i11, int i12, int i13) {
        this.f4191x = i10;
        this.f4192y = i11;
        this.width = i12;
        this.height = i13;
    }
}
