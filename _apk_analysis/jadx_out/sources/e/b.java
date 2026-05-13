package e;

import android.app.Activity;
import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.drawable.BitmapDrawable;
import android.graphics.drawable.Drawable;
import com.bumptech.glide.load.resource.gif.GifDrawable;
import com.yk.e.util.AdLog;
import com.yk.e.util.CoreUtils;
import com.yk.e.util.ImageHandler;
import java.util.Locale;

/* JADX INFO: loaded from: classes3.dex */
public final class b implements ImageHandler.IImageHandlerCallback {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ Context f59991a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ String f59992b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ a f59993c;

    public b(a aVar, Activity activity, String str) {
        this.f59993c = aVar;
        this.f59991a = activity;
        this.f59992b = str;
    }

    @Override // com.yk.e.util.ImageHandler.IImageHandlerCallback
    public final void onFailed(String str) {
        AdLog.e("resource load failed, msg = " + str);
        this.f59993c.a("resource load failed, msg = " + str);
    }

    @Override // com.yk.e.util.ImageHandler.IImageHandlerCallback
    public final void onSuccess(Drawable drawable) {
        CoreUtils.addCacheImgAdsID(this.f59991a, this.f59993c.f71961j);
        try {
            a aVar = this.f59993c;
            String str = this.f59992b;
            aVar.getClass();
            Bitmap bitmap = !".gif".equals(str.substring(str.lastIndexOf(".")).toLowerCase(Locale.ROOT)) ? ((BitmapDrawable) drawable).getBitmap() : ((GifDrawable) drawable).getFirstFrame();
            if (bitmap == null) {
                this.f59993c.a("img is null");
                return;
            }
            a.C(this.f59993c, bitmap);
            a aVar2 = this.f59993c;
            a.D(aVar2, aVar2.f71961j, bitmap, this.f59992b);
            this.f59993c.A();
        } catch (Exception e10) {
            b.d.a(e10, new StringBuilder("Mainbanner loadAd error, msg = "), e10);
            this.f59993c.a("resource load failed, msg = " + e10.getMessage());
        }
    }
}
