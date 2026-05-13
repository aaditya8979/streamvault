package yads;

import android.graphics.Bitmap;
import android.net.Uri;
import com.yandex.div.core.images.BitmapSource;
import com.yandex.div.core.images.CachedBitmap;
import com.yandex.div.core.images.DivImageDownloadCallback;

/* JADX INFO: loaded from: classes3.dex */
public final class mh0 implements j41 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ DivImageDownloadCallback f92354a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ String f92355b;

    public mh0(String str, DivImageDownloadCallback divImageDownloadCallback) {
        this.f92354a = divImageDownloadCallback;
        this.f92355b = str;
    }

    @Override // yads.j41
    public final void a(i41 i41Var, boolean z10) {
        Bitmap bitmap = i41Var.f90663a;
        if (bitmap != null) {
            this.f92354a.onSuccess(new CachedBitmap(bitmap, Uri.parse(this.f92355b), z10 ? BitmapSource.MEMORY : BitmapSource.NETWORK));
        }
    }

    @Override // yads.tp2
    public final void a(im3 im3Var) {
        this.f92354a.onError();
    }
}
