package sg.bigo.ads.core.adview;

import android.view.View;
import androidx.annotation.NonNull;
import sg.bigo.ads.common.utils.u;

/* JADX INFO: loaded from: classes12.dex */
public abstract class c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NonNull
    public final sg.bigo.ads.api.a<?> f83574a;

    public c(@NonNull sg.bigo.ads.api.a<?> aVar) {
        this.f83574a = aVar;
    }

    public final void a(int i10) {
        this.f83574a.setTag(Integer.valueOf(i10));
    }

    public void a(View view) {
        u.a(view, this.f83574a, null, -1);
    }

    public boolean a(int i10, int i11) {
        return u.a(this.f83574a, i10, i11);
    }
}
