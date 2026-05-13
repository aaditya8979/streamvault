package d;

import android.graphics.Bitmap;
import com.yk.e.util.ImageLoader;

/* JADX INFO: loaded from: classes2.dex */
public final class p extends ImageLoader.ImageLoadCallBack {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ q f59508a;

    public p(q qVar) {
        this.f59508a = qVar;
    }

    @Override // com.yk.e.util.ImageLoader.ImageLoadCallBack
    public final void execute(Bitmap bitmap) {
        if (bitmap != null) {
            this.f59508a.f59514f.setImageBitmap(bitmap);
        }
    }
}
