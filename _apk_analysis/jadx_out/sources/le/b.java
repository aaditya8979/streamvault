package le;

import android.content.res.ColorStateList;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.RippleDrawable;
import androidx.annotation.NonNull;
import androidx.annotation.RequiresApi;

/* JADX INFO: compiled from: RippleDrawableUtils.java */
/* JADX INFO: loaded from: classes8.dex */
public class b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public Drawable f73821a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public Drawable f73822b;

    public b(Object obj, Object obj2) {
        this.f73821a = obj == null ? null : (Drawable) obj;
        this.f73822b = obj2 != null ? (Drawable) obj2 : null;
    }

    @RequiresApi(api = 21)
    public RippleDrawable a(@NonNull ColorStateList colorStateList) {
        return new RippleDrawable(colorStateList, this.f73821a, this.f73822b);
    }
}
