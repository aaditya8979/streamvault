package yads;

import android.graphics.Bitmap;
import java.util.Iterator;
import java.util.Map;

/* JADX INFO: loaded from: classes2.dex */
public final class r02 implements d51 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ s02 f94245a;

    public r02(s02 s02Var) {
        this.f94245a = s02Var;
    }

    @Override // yads.d51
    public final void a(String str, Bitmap bitmap) {
    }

    @Override // yads.d51
    public final void a(Map map) {
        this.f94245a.f94664b.f92364b.putAll(map);
        this.f94245a.f94665c.a();
        Iterator it = this.f94245a.f94669g.iterator();
        while (it.hasNext()) {
            ((b10) it.next()).onFinishLoadingImages();
        }
    }
}
