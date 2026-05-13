package n3;

import android.graphics.Bitmap;
import android.graphics.drawable.BitmapDrawable;
import android.graphics.drawable.Drawable;
import android.util.Log;
import androidx.annotation.VisibleForTesting;
import java.util.Collections;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map;

/* JADX INFO: compiled from: InMobiMemoryCache.java */
/* JADX INFO: loaded from: classes11.dex */
public class k {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Map<String, Drawable> f75087a = Collections.synchronizedMap(new LinkedHashMap(10, 1.5f, true));

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @VisibleForTesting
    public long f75088b = 0;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public long f75089c = 1000000;

    public k() {
        e(Runtime.getRuntime().maxMemory() / 4);
    }

    public final void a() {
        Log.i("MemoryCache", "cache size=" + this.f75088b + " length=" + this.f75087a.size());
        if (this.f75088b > this.f75089c) {
            Iterator<Map.Entry<String, Drawable>> it = this.f75087a.entrySet().iterator();
            while (it.hasNext()) {
                this.f75088b -= c(((BitmapDrawable) it.next().getValue()).getBitmap());
                it.remove();
                if (this.f75088b <= this.f75089c) {
                    break;
                }
            }
            Log.i("MemoryCache", "Clean cache. New size " + this.f75087a.size());
        }
    }

    public Drawable b(String str) {
        try {
            if (this.f75087a.containsKey(str)) {
                return this.f75087a.get(str);
            }
            return null;
        } catch (NullPointerException e10) {
            e10.printStackTrace();
            return null;
        }
    }

    public final long c(Bitmap bitmap) {
        if (bitmap == null) {
            return 0L;
        }
        return bitmap.getRowBytes() * bitmap.getHeight();
    }

    public void d(String str, Drawable drawable) {
        try {
            if (this.f75087a.containsKey(str)) {
                this.f75088b -= c(((BitmapDrawable) this.f75087a.get(str)).getBitmap());
            }
            this.f75087a.put(str, drawable);
            this.f75088b += c(((BitmapDrawable) drawable).getBitmap());
            a();
            Log.d("MemoryCache", "Drawable used from cache");
        } catch (Throwable th2) {
            th2.printStackTrace();
        }
    }

    public final void e(long j10) {
        this.f75089c = j10;
        Log.i("MemoryCache", "MemoryCache will use up to " + ((this.f75089c / 1024.0d) / 1024.0d) + "MB");
    }
}
