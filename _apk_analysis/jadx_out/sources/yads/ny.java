package yads;

import android.view.View;
import android.widget.ImageView;
import com.yandex.mobile.ads.R$id;

/* JADX INFO: loaded from: classes12.dex */
public final class ny {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final y00 f93039a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final int f93040b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final gy1 f93041c;

    public ny(y00 y00Var, int i10, gy1 gy1Var) {
        this.f93039a = y00Var;
        this.f93040b = i10;
        this.f93041c = gy1Var;
    }

    public final ImageView a(View view, my myVar, a10 a10Var) {
        ImageView imageView;
        y00 y00Var = this.f93039a;
        my myVar2 = y00Var.f96949c != null ? my.f92635c : y00Var.f96948b != null ? my.f92634b : my.f92636d;
        if (a10Var == null || myVar2 != myVar) {
            return null;
        }
        int i10 = a10Var.f87541c;
        int i11 = a10Var.f87542d;
        int i12 = this.f93040b;
        if (i12 > i10 || i12 > i11) {
            this.f93041c.getClass();
            imageView = (ImageView) view.findViewById(R$id.icon_small);
        } else {
            this.f93041c.getClass();
            imageView = (ImageView) view.findViewById(R$id.icon_large);
        }
        return imageView;
    }
}
