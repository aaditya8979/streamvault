package com.inmobi.media;

import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.drawable.Drawable;
import android.view.View;
import com.inmobi.media.core.config.models.AdConfig;
import java.lang.ref.WeakReference;

/* JADX INFO: loaded from: classes8.dex */
public final class Hi extends AbstractC3747t2 {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final WeakReference f25616b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public Hi(View view, AdConfig.AdQualityConfig adQualityConfig) {
        super(adQualityConfig);
        tn.p.k(view, "adView");
        tn.p.k(adQualityConfig, "adQualityConfig");
        this.f25616b = new WeakReference(view);
    }

    @Override // com.inmobi.media.M0
    /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
    public final Bitmap a() {
        System.currentTimeMillis();
        View view = (View) this.f25616b.get();
        if (view == null) {
            System.currentTimeMillis();
            return null;
        }
        tn.p.k(view, "adView");
        Bitmap bitmapCreateBitmap = Bitmap.createBitmap(view.getMeasuredWidth(), view.getMeasuredHeight(), Bitmap.Config.ARGB_8888);
        tn.p.j(bitmapCreateBitmap, "createBitmap(...)");
        Canvas canvas = new Canvas(bitmapCreateBitmap);
        Drawable background = view.getBackground();
        if (background != null) {
            background.draw(canvas);
        } else {
            canvas.drawColor(-1);
        }
        view.draw(canvas);
        if (bitmapCreateBitmap == null) {
            return null;
        }
        System.currentTimeMillis();
        return a(bitmapCreateBitmap);
    }
}
