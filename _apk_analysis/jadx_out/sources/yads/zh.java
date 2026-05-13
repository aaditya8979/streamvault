package yads;

import android.app.ActivityManager;
import androidx.appcompat.widget.ActivityChooserModel;
import kotlin.jvm.internal.Lambda;

/* JADX INFO: loaded from: classes2.dex */
public final class zh extends Lambda implements sn.a {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ ei f97575b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public zh(ei eiVar) {
        super(0);
        this.f97575b = eiVar;
    }

    @Override // sn.a
    public final Object invoke() {
        try {
            Object systemService = this.f97575b.f89259a.getSystemService(ActivityChooserModel.ATTRIBUTE_ACTIVITY);
            if (systemService instanceof ActivityManager) {
                return (ActivityManager) systemService;
            }
        } catch (Throwable unused) {
        }
        return null;
    }
}
