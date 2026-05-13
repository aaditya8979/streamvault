package yads;

import com.yandex.varioqub.appmetricaadapter.AppMetricaAdapter;
import java.util.Set;

/* JADX INFO: loaded from: classes3.dex */
public final class ou3 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final qg f93334a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final zg f93335b;

    public ou3(qg qgVar, zg zgVar) {
        this.f93334a = qgVar;
        this.f93335b = zgVar;
    }

    public final void a(String str) {
        if (this.f93335b.c()) {
            qg qgVar = this.f93334a;
            qgVar.getClass();
            try {
                AppMetricaAdapter appMetricaAdapter = qgVar.f94028a;
                if (appMetricaAdapter != null) {
                    appMetricaAdapter.setExperiments(str);
                }
            } catch (Throwable unused) {
                boolean z10 = ad1.f87661a;
            }
        }
    }

    public final void a(Set set) {
        if (this.f93335b.c()) {
            qg qgVar = this.f93334a;
            qgVar.getClass();
            try {
                AppMetricaAdapter appMetricaAdapter = qgVar.f94028a;
                if (appMetricaAdapter != null) {
                    appMetricaAdapter.setTriggeredTestIds(set);
                }
            } catch (Throwable unused) {
                set.toString();
                boolean z10 = ad1.f87661a;
            }
        }
    }
}
