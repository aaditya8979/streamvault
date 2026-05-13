package f;

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

/* JADX INFO: loaded from: classes5.dex */
public final class v implements ImageHandler.IImageHandlerCallback {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ Context f61391a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ String f61392b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ g f61393c;

    public v(g gVar, Activity activity, String str) {
        this.f61393c = gVar;
        this.f61391a = activity;
        this.f61392b = str;
    }

    @Override // com.yk.e.util.ImageHandler.IImageHandlerCallback
    public final void onFailed(String str) {
        AdLog.e("resource load failed, msg = " + str);
        this.f61393c.a("resource load failed, msg = " + str);
    }

    @Override // com.yk.e.util.ImageHandler.IImageHandlerCallback
    public final void onSuccess(Drawable drawable) {
        CoreUtils.addCacheImgAdsID(this.f61391a, this.f61393c.f71961j);
        try {
            g gVar = this.f61393c;
            String str = this.f61392b;
            gVar.getClass();
            Bitmap bitmap = !".gif".equals(str.substring(str.lastIndexOf(".")).toLowerCase(Locale.ROOT)) ? ((BitmapDrawable) drawable).getBitmap() : ((GifDrawable) drawable).getFirstFrame();
            if (bitmap == null) {
                this.f61393c.a("img is null");
                return;
            }
            g.C(this.f61393c, bitmap);
            g.D(this.f61393c, bitmap, this.f61392b);
            this.f61393c.A();
        } catch (Exception e10) {
            b.d.a(e10, new StringBuilder("Mainbanner loadAd error, msg = "), e10);
            this.f61393c.a("resource load failed, msg = " + e10.getMessage());
        }
    }
}
