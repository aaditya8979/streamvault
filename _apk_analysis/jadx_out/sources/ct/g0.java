package ct;

import android.view.View;
import com.yk.e.callBack.MainMaterialCallback;

/* JADX INFO: loaded from: classes10.dex */
public final class g0 implements View.OnClickListener {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ v f59445b;

    public g0(v vVar) {
        this.f59445b = vVar;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        this.f59445b.C();
        MainMaterialCallback mainMaterialCallback = this.f59445b.G;
        if (mainMaterialCallback != null) {
            mainMaterialCallback.onAdClose();
        }
    }
}
