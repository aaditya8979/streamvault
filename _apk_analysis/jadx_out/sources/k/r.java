package k;

import android.app.Activity;
import android.content.Context;
import android.graphics.drawable.Drawable;
import com.yk.e.util.CoreUtils;
import com.yk.e.util.ImageHandler;

/* JADX INFO: loaded from: classes8.dex */
public final class r implements ImageHandler.IImageHandlerCallback {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ Context f72662a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ String f72663b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ x f72664c;

    public r(x xVar, Activity activity, String str) {
        this.f72664c = xVar;
        this.f72662a = activity;
        this.f72663b = str;
    }

    @Override // com.yk.e.util.ImageHandler.IImageHandlerCallback
    public final void onFailed(String str) {
        this.f72664c.a("resource load failed, msg = " + str);
    }

    @Override // com.yk.e.util.ImageHandler.IImageHandlerCallback
    public final void onSuccess(Drawable drawable) {
        CoreUtils.addCacheImgAdsID(this.f72662a, this.f72664c.f71961j);
        this.f72664c.H.setVisibility(0);
        this.f72664c.J.setVisibility(8);
        new ImageHandler().loadImg(this.f72662a, this.f72663b, this.f72664c.H, "", null);
        x xVar = this.f72664c;
        xVar.O = true;
        xVar.A();
    }
}
