package yads;

import android.content.Context;
import com.yandex.mobile.ads.R$dimen;
import com.yandex.mobile.ads.R$layout;

/* JADX INFO: loaded from: classes2.dex */
public final class pe1 implements vy0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final zf0 f93567a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final io2 f93568b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final sp2 f93569c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final rx f93570d;

    public pe1(qw qwVar, at1 at1Var, sp2 sp2Var, rx rxVar) {
        this.f93567a = qwVar;
        this.f93568b = at1Var;
        this.f93569c = sp2Var;
        this.f93570d = rxVar;
    }

    @Override // yads.vy0
    public final se1 a(Context context, v9 v9Var, w02 w02Var, kz kzVar, z00 z00Var) {
        y00 adAssets = w02Var.getAdAssets();
        sp2 sp2Var = this.f93569c;
        int i10 = R$dimen.monetization_ads_internal_landscape_vertical_icon_size;
        sp2Var.getClass();
        ly lyVar = new ly(adAssets, vn.c.d(context.getResources().getDimension(i10)));
        rx rxVar = this.f93570d;
        zf0 zf0Var = this.f93567a;
        io2 io2Var = this.f93568b;
        rxVar.getClass();
        jy jyVar = new jy(lyVar, rx.a(w02Var, kzVar, z00Var, zf0Var, io2Var), new pj1(adAssets), new fd2(adAssets), new gn3(), new xs(w02Var));
        y00 adAssets2 = w02Var.getAdAssets();
        sp2 sp2Var2 = this.f93569c;
        int i11 = R$dimen.monetization_ads_internal_landscape_vertical_media_content_min_width;
        sp2Var2.getClass();
        return new se1(R$layout.monetization_ads_internal_native_interstitial_landscape_vetrical_media, jyVar, new ky(new ua2(2), new wj1(vn.c.d(context.getResources().getDimension(i11)), new qj1(adAssets2))));
    }
}
