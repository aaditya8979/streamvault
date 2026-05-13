package yads;

import android.graphics.Bitmap;
import android.util.LruCache;
import android.widget.ImageView;

/* JADX INFO: loaded from: classes2.dex */
public final class pa3 implements u82 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final LruCache f93513a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final k31 f93514b;

    public pa3(v82 v82Var, k31 k31Var) {
        this.f93513a = v82Var;
        this.f93514b = k31Var;
    }

    public final Bitmap a(String str) {
        this.f93514b.getClass();
        return (Bitmap) this.f93513a.get(k31.a(str, ImageView.ScaleType.CENTER_INSIDE));
    }

    public final void a(String str, Bitmap bitmap) {
        this.f93514b.getClass();
        this.f93513a.put(k31.a(str, ImageView.ScaleType.CENTER_INSIDE), bitmap);
    }
}
