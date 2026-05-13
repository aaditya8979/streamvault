package com.inmobi.media;

import android.graphics.Bitmap;
import android.graphics.Rect;
import android.os.Handler;
import android.os.Looper;
import android.view.PixelCopy;
import android.view.Window;
import com.inmobi.media.C3687qg;
import com.inmobi.media.core.config.models.AdConfig;
import java.util.concurrent.atomic.AtomicBoolean;
import kotlin.jvm.internal.Ref$BooleanRef;

/* JADX INFO: renamed from: com.inmobi.media.qg, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes11.dex */
public final class C3687qg extends AbstractC3747t2 {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Window f27980b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final AtomicBoolean f27981c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C3687qg(Window window, AdConfig.AdQualityConfig adQualityConfig) {
        super(adQualityConfig);
        tn.p.k(window, "window");
        tn.p.k(adQualityConfig, "config");
        this.f27980b = window;
        this.f27981c = new AtomicBoolean(false);
    }

    public static final void a(Ref$BooleanRef ref$BooleanRef, C3687qg c3687qg, int i10) {
        if (i10 == 0) {
            ref$BooleanRef.element = true;
        }
        boolean z10 = ref$BooleanRef.element;
        c3687qg.f27981c.set(true);
    }

    @Override // com.inmobi.media.M0
    /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
    public final Bitmap a() throws InterruptedException {
        System.currentTimeMillis();
        int width = this.f27980b.getDecorView().getWidth();
        int height = this.f27980b.getDecorView().getHeight();
        Bitmap bitmapCreateBitmap = Bitmap.createBitmap(width, height, Bitmap.Config.ARGB_8888);
        tn.p.j(bitmapCreateBitmap, "createBitmap(...)");
        Rect rect = new Rect(0, 0, width, height);
        final Ref$BooleanRef ref$BooleanRef = new Ref$BooleanRef();
        int layerType = this.f27980b.getDecorView().getLayerType();
        this.f27980b.getDecorView().setLayerType(0, null);
        PixelCopy.request(this.f27980b, rect, bitmapCreateBitmap, new PixelCopy.OnPixelCopyFinishedListener() { // from class: n9.ca
            @Override // android.view.PixelCopy.OnPixelCopyFinishedListener
            public final void onPixelCopyFinished(int i10) {
                C3687qg.a(ref$BooleanRef, this, i10);
            }
        }, new Handler(Looper.getMainLooper()));
        while (!this.f27981c.get()) {
            Thread.sleep(500L);
        }
        System.currentTimeMillis();
        this.f27980b.getDecorView().setLayerType(layerType, null);
        if (ref$BooleanRef.element) {
            return a(bitmapCreateBitmap);
        }
        return null;
    }
}
