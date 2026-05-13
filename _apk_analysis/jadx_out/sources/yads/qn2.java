package yads;

import android.graphics.Bitmap;
import android.graphics.drawable.BitmapDrawable;

/* JADX INFO: loaded from: classes3.dex */
public final class qn2 implements Runnable {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final un2 f94088b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final Bitmap f94089c;

    public qn2(un2 un2Var, Bitmap bitmap) {
        this.f94088b = un2Var;
        this.f94089c = bitmap;
    }

    @Override // java.lang.Runnable
    public final void run() {
        this.f94088b.setBackground(new BitmapDrawable(this.f94088b.getResources(), this.f94089c));
        this.f94088b.setVisibility(0);
    }
}
