package l;

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

/* JADX INFO: loaded from: classes11.dex */
public final class u implements ImageHandler.IImageHandlerCallback {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ Context f73615a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ String f73616b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ e0 f73617c;

    public u(e0 e0Var, Activity activity, String str) {
        this.f73617c = e0Var;
        this.f73615a = activity;
        this.f73616b = str;
    }

    @Override // com.yk.e.util.ImageHandler.IImageHandlerCallback
    public final void onFailed(String str) {
        AdLog.e("resource load failed, msg = " + str);
        this.f73617c.a("resource load failed, msg = " + str);
    }

    @Override // com.yk.e.util.ImageHandler.IImageHandlerCallback
    public final void onSuccess(Drawable drawable) {
        CoreUtils.addCacheImgAdsID(this.f73615a, this.f73617c.f71961j);
        try {
            e0 e0Var = this.f73617c;
            String str = this.f73616b;
            e0Var.getClass();
            Bitmap bitmap = !".gif".equals(str.substring(str.lastIndexOf(".")).toLowerCase(Locale.ROOT)) ? ((BitmapDrawable) drawable).getBitmap() : ((GifDrawable) drawable).getFirstFrame();
            if (bitmap == null) {
                this.f73617c.a("img is null");
                return;
            }
            e0.C(this.f73617c, bitmap);
            e0.D(this.f73617c, bitmap, this.f73616b);
            this.f73617c.A();
        } catch (Exception e10) {
            b.d.a(e10, new StringBuilder("MainNative loadAd error, msg = "), e10);
            this.f73617c.a("resource load failed, msg = " + e10.getMessage());
        }
    }
}
