package md;

import android.content.Context;
import android.graphics.Bitmap;
import java.util.HashSet;
import java.util.Set;

/* JADX INFO: compiled from: ImageLoader.java */
/* JADX INFO: loaded from: classes.dex */
public class b<D> extends a<Bitmap> {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public Set<Object> f74114d;

    public b(String str, Context context) {
        super(str, context);
        if (this.f74114d == null) {
            this.f74114d = new HashSet();
        }
    }
}
