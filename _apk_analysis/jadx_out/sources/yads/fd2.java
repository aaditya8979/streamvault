package yads;

import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import com.yandex.mobile.ads.R$id;

/* JADX INFO: loaded from: classes11.dex */
public final class fd2 implements zf0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final y00 f89536a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final gy1 f89537b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final jy1 f89538c;

    public /* synthetic */ fd2(y00 y00Var) {
        this(y00Var, new gy1(), new jy1());
    }

    public fd2(y00 y00Var, gy1 gy1Var, jy1 jy1Var) {
        this.f89536a = y00Var;
        this.f89537b = gy1Var;
        this.f89538c = jy1Var;
    }

    @Override // yads.zf0
    public final void a(ViewGroup viewGroup) {
        this.f89537b.getClass();
        ImageView imageView = (ImageView) viewGroup.findViewById(R$id.icon_placeholder);
        y00 y00Var = this.f89536a;
        a10 a10Var = y00Var.f96949c;
        a10 a10Var2 = y00Var.f96948b;
        if (imageView != null && a10Var == null && a10Var2 == null) {
            this.f89538c.getClass();
            yk3 yk3Var = new yk3((TextView) viewGroup.findViewById(R$id.title));
            imageView.setVisibility(0);
            imageView.setOnClickListener(yk3Var);
        }
    }

    @Override // yads.zf0
    public final void c() {
    }
}
