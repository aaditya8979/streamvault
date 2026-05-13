package yads;

import android.widget.Toast;
import com.yandex.mobile.ads.R$string;
import kotlin.jvm.internal.Lambda;

/* JADX INFO: loaded from: classes4.dex */
public final class n90 extends Lambda implements sn.a {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ o90 f92787b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public n90(o90 o90Var) {
        super(0);
        this.f92787b = o90Var;
    }

    @Override // sn.a
    public final Object invoke() {
        synchronized (eu1.f89373a) {
            eu1.f89374b = true;
        }
        o90 o90Var = this.f92787b;
        Toast.makeText(o90Var.f93156a, o90Var.f93156a.getString(R$string.logging_is_enabled), 0).show();
        return bn.r.f5635a;
    }
}
