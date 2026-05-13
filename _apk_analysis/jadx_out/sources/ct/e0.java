package ct;

import android.graphics.Bitmap;
import android.graphics.drawable.BitmapDrawable;
import android.graphics.drawable.Drawable;
import com.bumptech.glide.load.resource.gif.GifDrawable;
import com.yk.e.util.AdLog;
import com.yk.e.util.CoreUtils;
import com.yk.e.util.ImageHandler;
import java.util.Locale;

/* JADX INFO: loaded from: classes10.dex */
public final class e0 implements ImageHandler.IImageHandlerCallback {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ n f59441a;

    public e0(n nVar) {
        this.f59441a = nVar;
    }

    @Override // com.yk.e.util.ImageHandler.IImageHandlerCallback
    public final void onFailed(String str) {
        AdLog.e("resource load failed, msg = " + str);
        this.f59441a.a("resource load failed, msg = " + str);
    }

    @Override // com.yk.e.util.ImageHandler.IImageHandlerCallback
    public final void onSuccess(Drawable drawable) {
        CoreUtils.addCacheImgAdsID(this.f59441a.G.getApplicationContext(), this.f59441a.f71961j);
        try {
            String str = this.f59441a.f71961j.imgUrl;
            Bitmap bitmap = !".gif".equals(str.substring(str.lastIndexOf(".")).toLowerCase(Locale.ROOT)) ? ((BitmapDrawable) drawable).getBitmap() : ((GifDrawable) drawable).getFirstFrame();
            if (bitmap == null) {
                this.f59441a.a("img is null");
                return;
            }
            n nVar = this.f59441a;
            nVar.getClass();
            nVar.D(bitmap.getWidth(), bitmap.getHeight());
            n nVar2 = this.f59441a;
            n.E(nVar2, bitmap, nVar2.f71961j.imgUrl);
            this.f59441a.A();
        } catch (Exception e10) {
            b.d.a(e10, new StringBuilder("Mainbanner loadAd error, msg = "), e10);
            this.f59441a.a("resource load failed, msg = " + e10.getMessage());
        }
    }
}
