package bp;

import com.yk.e.object.AdSdkStateCode;
import com.yk.e.util.IDUtil;

/* JADX INFO: loaded from: classes9.dex */
public final class t extends i1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ y f5870a;

    public t(y yVar) {
        this.f5870a = yVar;
    }

    @Override // bp.i1
    public final void a() {
        String string = IDUtil.getString(this.f5870a.f5889a, "main_load_data_fail");
        y yVar = this.f5870a;
        if (!yVar.f5891c) {
            yVar.f5892d.b(AdSdkStateCode.API_REQUEST_FAILED, string);
        }
        y yVar2 = this.f5870a;
        yVar2.f5898j.f(yVar2.f5889a, yVar2.f5893e, "", string + ", msg = 网络错误", "0", "0", null);
    }

    @Override // bp.i1
    public final void b() {
        y yVar = this.f5870a;
        yVar.f5898j.k(yVar.f5889a, yVar.f5894f, yVar.f5895g, yVar.f5893e, yVar.f5896h, yVar.f5897i, yVar.f5892d);
    }
}
