package io.bidmachine.rendering.internal.screenshot;

import android.graphics.Bitmap;
import android.graphics.Rect;
import android.os.Build;
import android.os.Handler;
import android.view.PixelCopy;
import android.view.View;
import android.view.Window;
import com.mbridge.msdk.MBridgeConstans;
import io.bidmachine.util.ViewUtilsKt;
import tn.p;

/* JADX INFO: loaded from: classes6.dex */
public final class a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final a f70565a = new a();

    /* JADX INFO: renamed from: io.bidmachine.rendering.internal.screenshot.a$a, reason: collision with other inner class name */
    public static final class PixelCopyOnPixelCopyFinishedListenerC0838a implements PixelCopy.OnPixelCopyFinishedListener {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final /* synthetic */ b f70566a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final /* synthetic */ Bitmap f70567b;

        public PixelCopyOnPixelCopyFinishedListenerC0838a(b bVar, Bitmap bitmap) {
            this.f70566a = bVar;
            this.f70567b = bitmap;
        }

        @Override // android.view.PixelCopy.OnPixelCopyFinishedListener
        public void onPixelCopyFinished(int i10) {
            if (i10 == 0) {
                this.f70566a.a(this.f70567b);
            } else {
                this.f70566a.a();
            }
        }
    }

    private a() {
    }

    public final void a(View view, Handler handler, b bVar) {
        p.k(view, MBridgeConstans.DYNAMIC_VIEW_KEY_VIEW);
        p.k(handler, "handler");
        p.k(bVar, "screenshotListener");
        if (Build.VERSION.SDK_INT < 26) {
            bVar.a();
            return;
        }
        Window windowFindWindow = ViewUtilsKt.findWindow(view);
        if (windowFindWindow == null) {
            bVar.a();
            return;
        }
        Rect locationInWindow = ViewUtilsKt.getLocationInWindow(view);
        try {
            Bitmap bitmapCreateBitmap = Bitmap.createBitmap(locationInWindow.width(), locationInWindow.height(), Bitmap.Config.ARGB_8888);
            p.j(bitmapCreateBitmap, "{\n            Bitmap.cre…nfig.ARGB_8888)\n        }");
            try {
                PixelCopy.request(windowFindWindow, locationInWindow, bitmapCreateBitmap, new PixelCopyOnPixelCopyFinishedListenerC0838a(bVar, bitmapCreateBitmap), handler);
            } catch (Throwable unused) {
                bVar.a();
            }
        } catch (Throwable unused2) {
            bVar.a();
        }
    }
}
