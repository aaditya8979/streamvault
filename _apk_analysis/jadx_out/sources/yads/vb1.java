package yads;

import com.yandex.mobile.ads.features.debugpanel.ui.IntegrationInspectorActivity;
import kotlin.jvm.internal.Lambda;

/* JADX INFO: loaded from: classes3.dex */
public final class vb1 extends Lambda implements sn.a {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ IntegrationInspectorActivity f96055b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public vb1(IntegrationInspectorActivity integrationInspectorActivity) {
        super(0);
        this.f96055b = integrationInspectorActivity;
    }

    @Override // sn.a
    public final Object invoke() {
        return new m70(this.f96055b.getApplicationContext());
    }
}
