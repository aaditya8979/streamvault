package yads;

import android.content.Context;
import com.yandex.mobile.ads.R$string;
import kotlin.NoWhenBranchMatchedException;

/* JADX INFO: loaded from: classes10.dex */
public final class fr1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Context f89669a;

    public fr1(Context context) {
        this.f89669a = context;
    }

    public final String a(dr1 dr1Var) {
        int i10 = dr1Var == null ? -1 : er1.f89367a[dr1Var.ordinal()];
        if (i10 == -1) {
            return null;
        }
        if (i10 == 1) {
            return this.f89669a.getString(R$string.invalid_mediation_adapter_version);
        }
        throw new NoWhenBranchMatchedException();
    }
}
