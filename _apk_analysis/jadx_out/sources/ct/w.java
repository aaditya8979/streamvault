package ct;

import android.view.View;
import com.yk.e.callBack.MainMaterialCallback;

/* JADX INFO: loaded from: classes9.dex */
public final class w implements View.OnClickListener {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ g f59472b;

    public w(g gVar) {
        this.f59472b = gVar;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        this.f59472b.C();
        MainMaterialCallback mainMaterialCallback = this.f59472b.G;
        if (mainMaterialCallback != null) {
            mainMaterialCallback.onAdClose();
        }
    }
}
