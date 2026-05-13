package com.inmobi.media;

import android.graphics.Bitmap;
import com.squareup.picasso.Transformation;

/* JADX INFO: loaded from: classes8.dex */
public final class Lf implements Transformation {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Bitmap.Config f25884a;

    public Lf(Bitmap.Config config) {
        tn.p.k(config, "config");
        this.f25884a = config;
    }

    @Override // com.squareup.picasso.Transformation
    public final String key() {
        return "config(" + this.f25884a + ")";
    }

    @Override // com.squareup.picasso.Transformation
    public final Bitmap transform(Bitmap bitmap) {
        tn.p.k(bitmap, "source");
        Bitmap bitmapCopy = bitmap.copy(this.f25884a, false);
        bitmap.recycle();
        tn.p.h(bitmapCopy);
        return bitmapCopy;
    }
}
