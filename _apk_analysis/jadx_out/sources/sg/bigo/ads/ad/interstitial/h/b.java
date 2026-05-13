package sg.bigo.ads.ad.interstitial.h;

import android.view.ViewGroup;
import android.widget.TextView;
import androidx.annotation.NonNull;
import sg.bigo.ads.R;
import sg.bigo.ads.ad.interstitial.q;
import sg.bigo.ads.api.a.m;
import sg.bigo.ads.common.p;

/* JADX INFO: loaded from: classes3.dex */
public final class b extends a {

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public TextView f81056s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public TextView f81057t;

    public b(@NonNull sg.bigo.ads.ad.b.b bVar, @NonNull m mVar, @NonNull p pVar) {
        super(bVar, mVar, pVar);
    }

    @Override // sg.bigo.ads.ad.interstitial.h.a
    public final void d(@NonNull q qVar) {
        ViewGroup viewGroup = this.f81035k;
        if (viewGroup == null || qVar == null) {
            return;
        }
        this.f81056s = (TextView) viewGroup.findViewById(R.id.inter_title);
        this.f81057t = (TextView) this.f81035k.findViewById(R.id.inter_description);
        sg.bigo.ads.ad.interstitial.d.a(this.f81056s, -234881024);
        sg.bigo.ads.ad.interstitial.d.a(this.f81057t, -234881024);
    }

    @Override // sg.bigo.ads.ad.interstitial.u
    public final boolean d() {
        return false;
    }

    @Override // sg.bigo.ads.ad.interstitial.h.a
    public final boolean g() {
        p pVar = ((a) this).f81032h;
        return pVar != null && pVar.f82291c > 960;
    }

    @Override // sg.bigo.ads.ad.interstitial.h.a
    public final int h() {
        return R.layout.bigo_ad_view_click_guide_1;
    }
}
