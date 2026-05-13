package bp;

import android.content.Context;
import android.text.TextUtils;
import com.yk.e.util.AdLog;
import com.yk.e.util.LocalSaveUtil;

/* JADX INFO: loaded from: classes4.dex */
public final class j1 implements r {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ Context f5799a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ r f5800b;

    public j1(Context context, s sVar) {
        this.f5799a = context;
        this.f5800b = sVar;
    }

    @Override // bp.r
    public final void a(String str) {
        AdLog.i("gpAdid " + str);
        if (TextUtils.isEmpty(str)) {
            str = u1.b();
        }
        LocalSaveUtil.put(this.f5799a, "DeviceGPADID", str);
        r rVar = this.f5800b;
        if (rVar != null) {
            rVar.a(str);
        }
    }
}
