package yads;

import android.graphics.Bitmap;
import android.util.LruCache;

/* JADX INFO: loaded from: classes.dex */
public final class t82 implements h41 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final LruCache f95103a;

    public t82(v82 v82Var) {
        this.f95103a = v82Var;
    }

    public final Bitmap a(String str) {
        return (Bitmap) this.f95103a.get(str);
    }

    public final void a(String str, Bitmap bitmap) {
        this.f95103a.put(str, bitmap);
    }
}
