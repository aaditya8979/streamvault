package sg.bigo.ads.ad.interstitial.d;

import android.view.ViewGroup;
import androidx.annotation.NonNull;
import sg.bigo.ads.ad.d.f;
import sg.bigo.ads.ad.interstitial.AdCountDownButton;

/* JADX INFO: loaded from: classes12.dex */
public class ab extends w {
    public ab(@NonNull sg.bigo.ads.ad.b.b bVar, sg.bigo.ads.api.a.m mVar) {
        super(bVar, mVar);
    }

    @Override // sg.bigo.ads.ad.d.f
    public final void a(AdCountDownButton adCountDownButton, ViewGroup viewGroup, f.a aVar) {
        if (viewGroup == null) {
            return;
        }
        if (this.f80156o == null) {
            this.f80156o = new sg.bigo.ads.ad.d.d();
        }
        this.f80156o.a();
        this.f80156o.a(viewGroup, m(), aVar);
    }
}
