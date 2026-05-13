package yads;

import android.graphics.Bitmap;
import fo.p;
import java.util.Map;

/* JADX INFO: loaded from: classes3.dex */
public final class z31 implements d51 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ fo.m f97368a;

    public z31(fo.m mVar) {
        this.f97368a = mVar;
    }

    @Override // yads.d51
    public final void a(String str, Bitmap bitmap) {
        this.f97368a.i(new q31(str, bitmap));
    }

    @Override // yads.d51
    public final void a(Map map) {
        p.a.a(this.f97368a.h(), null, 1, null);
    }
}
