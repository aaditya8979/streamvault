package com.bytedance.sdk.openadsdk.tlj;

import android.graphics.Bitmap;
import android.graphics.drawable.AnimatedImageDrawable;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.widget.ImageView;
import androidx.annotation.Nullable;
import com.bytedance.sdk.component.fkw.cf;
import com.bytedance.sdk.component.fkw.rn;
import com.bytedance.sdk.openadsdk.core.jg;
import com.bytedance.sdk.openadsdk.core.model.vpp;
import com.bytedance.sdk.openadsdk.utils.bs;
import java.lang.ref.WeakReference;

/* JADX INFO: loaded from: classes10.dex */
public final class lh implements rn {

    /* JADX INFO: renamed from: lh, reason: collision with root package name */
    private rn f14290lh;
    private final WeakReference<ImageView> ouw;
    private final String vt = "ImageLoaderToViewWrapper";

    private lh(ImageView imageView) {
        this.ouw = new WeakReference<>(imageView);
    }

    public lh(ImageView imageView, rn rnVar) {
        this.ouw = new WeakReference<>(imageView);
        this.f14290lh = rnVar;
    }

    public static rn ouw(vpp vppVar, String str, ImageView imageView) {
        return new vt(vppVar, str, new lh(imageView));
    }

    public static void ouw(Object obj, ImageView imageView) {
        if (Build.VERSION.SDK_INT >= 28 && (obj instanceof AnimatedImageDrawable)) {
            ((AnimatedImageDrawable) obj).start();
        }
        imageView.setImageDrawable((Drawable) obj);
    }

    @Override // com.bytedance.sdk.component.fkw.rn
    public final void ouw(int i10, String str, @Nullable Throwable th2) {
        rn rnVar = this.f14290lh;
        if (rnVar != null) {
            rnVar.ouw(i10, str, th2);
        }
    }

    @Override // com.bytedance.sdk.component.fkw.rn
    public final void ouw(cf cfVar) {
        final ImageView imageView = this.ouw.get();
        if (imageView != null) {
            final Object objVt = cfVar.vt();
            if (!(objVt instanceof Bitmap)) {
                if (objVt instanceof Drawable) {
                    if (bs.le()) {
                        ouw(objVt, imageView);
                        return;
                    } else {
                        jg.lh().post(new Runnable() { // from class: com.bytedance.sdk.openadsdk.tlj.lh.2
                            @Override // java.lang.Runnable
                            public final void run() {
                                lh.ouw(objVt, imageView);
                            }
                        });
                        return;
                    }
                }
                return;
            }
            if (bs.le()) {
                imageView.setImageBitmap((Bitmap) objVt);
            } else {
                jg.lh().post(new Runnable() { // from class: com.bytedance.sdk.openadsdk.tlj.lh.1
                    @Override // java.lang.Runnable
                    public final void run() {
                        imageView.setImageBitmap((Bitmap) objVt);
                    }
                });
            }
            rn rnVar = this.f14290lh;
            if (rnVar != null) {
                rnVar.ouw(cfVar);
            }
        }
    }
}
