package n3;

import android.graphics.drawable.Drawable;
import android.net.Uri;
import androidx.annotation.NonNull;
import com.google.android.gms.ads.formats.NativeAd;

/* JADX INFO: compiled from: InMobiNativeMappedImage.java */
/* JADX INFO: loaded from: classes11.dex */
public class l extends NativeAd.Image {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Drawable f75090a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Uri f75091b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final double f75092c;

    public l(Drawable drawable, Uri uri, double d10) {
        this.f75090a = drawable;
        this.f75091b = uri;
        this.f75092c = d10;
    }

    @Override // com.google.android.gms.ads.formats.NativeAd.Image
    @NonNull
    public Drawable getDrawable() {
        return this.f75090a;
    }

    @Override // com.google.android.gms.ads.formats.NativeAd.Image
    public double getScale() {
        return this.f75092c;
    }

    @Override // com.google.android.gms.ads.formats.NativeAd.Image
    @NonNull
    public Uri getUri() {
        return this.f75091b;
    }
}
