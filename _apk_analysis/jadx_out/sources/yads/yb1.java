package yads;

import com.yandex.mobile.ads.features.debugpanel.ui.IntegrationInspectorActivity;

/* JADX INFO: loaded from: classes2.dex */
public final class yb1 implements go.e {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ IntegrationInspectorActivity f97057a;

    public yb1(IntegrationInspectorActivity integrationInspectorActivity) {
        this.f97057a = integrationInspectorActivity;
    }

    @Override // go.e
    public final Object emit(Object obj, hn.c cVar) {
        p90 p90Var = (p90) obj;
        q90 q90VarC = IntegrationInspectorActivity.c(this.f97057a);
        q90VarC.getClass();
        if (p90Var.f93495c) {
            q90VarC.f93956a.submitList(cn.w.m());
            q90VarC.f93958c.setVisibility(0);
        } else {
            q90VarC.f93956a.submitList(p90Var.f93496d);
            q90VarC.f93958c.setVisibility(8);
        }
        q90VarC.f93957b.setText(p90Var.f93494b.f94728a);
        return bn.r.f5635a;
    }
}
