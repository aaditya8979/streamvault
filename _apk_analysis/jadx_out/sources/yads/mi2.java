package yads;

import android.content.Context;
import android.graphics.Bitmap;
import java.util.LinkedHashMap;

/* JADX INFO: loaded from: classes3.dex */
public final class mi2 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final xr f92363a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final LinkedHashMap f92364b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final LinkedHashMap f92365c;

    public /* synthetic */ mi2(Context context) {
        this(new xr(context, 0));
    }

    public mi2(xr xrVar) {
        this.f92363a = xrVar;
        this.f92364b = new LinkedHashMap();
        this.f92365c = new LinkedHashMap();
    }

    public final Bitmap a(u41 u41Var) {
        Bitmap bitmap;
        String str = u41Var.f95549c;
        Bitmap bitmap2 = (Bitmap) this.f92364b.get(str);
        if (bitmap2 != null) {
            return bitmap2;
        }
        pa3 pa3Var = w82.f96306d.a(this.f92363a.f96857a).f96310c;
        String str2 = u41Var.f95549c;
        Bitmap bitmapA = pa3Var.a(str2);
        if (bitmapA != null && bitmapA.getWidth() == 1 && bitmapA.getHeight() == 1) {
            Bitmap bitmapCreateScaledBitmap = Bitmap.createScaledBitmap(bitmapA, u41Var.f95547a, u41Var.f95548b, false);
            pa3Var.a(str2, bitmapCreateScaledBitmap);
            bitmap = bitmapCreateScaledBitmap;
        } else {
            bitmap = bitmapA;
        }
        if (bitmap == null) {
            return null;
        }
        this.f92364b.put(str, bitmap);
        return bitmap;
    }
}
