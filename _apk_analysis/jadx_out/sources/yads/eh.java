package yads;

import android.content.Context;
import io.appmetrica.analytics.AppMetrica;
import io.appmetrica.analytics.ReporterConfig;
import kotlin.jvm.internal.Lambda;

/* JADX INFO: loaded from: classes3.dex */
public final class eh extends Lambda implements sn.a {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ cq3 f89251b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ Context f89252c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ fh f89253d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final /* synthetic */ String f89254e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public eh(cq3 cq3Var, Context context, fh fhVar, String str) {
        super(0);
        this.f89251b = cq3Var;
        this.f89252c = context;
        this.f89253d = fhVar;
        this.f89254e = str;
    }

    @Override // sn.a
    public final Object invoke() {
        cq3 cq3Var = this.f89251b;
        cq3Var.f88589a.a(this.f89252c);
        fh fhVar = this.f89253d;
        Context context = this.f89252c;
        String str = this.f89254e;
        if (fhVar.f89580a.a()) {
            try {
                AppMetrica.activateReporter(context, ReporterConfig.newConfigBuilder(str).build());
            } catch (Throwable unused) {
                boolean z10 = ad1.f87661a;
            }
        }
        return AppMetrica.getReporter(this.f89252c, this.f89254e);
    }
}
