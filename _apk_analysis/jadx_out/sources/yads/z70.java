package yads;

import android.widget.ImageView;
import java.util.List;
import yads.z70;

/* JADX INFO: loaded from: classes3.dex */
public final class z70 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final k41 f97414a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final List f97415b;

    public z70(d03 d03Var, List list) {
        this.f97414a = d03Var;
        this.f97415b = list;
    }

    public static final void a(i41 i41Var) {
        i41Var.a();
    }

    public final et a(String str, ImageView imageView) {
        final i41 i41VarA = this.f97414a.a(str, new y70(imageView), 0, 0);
        et etVar = new et() { // from class: bt.vc
            @Override // yads.et
            public final void cancel() {
                z70.a(i41VarA);
            }
        };
        this.f97415b.add(etVar);
        return etVar;
    }
}
