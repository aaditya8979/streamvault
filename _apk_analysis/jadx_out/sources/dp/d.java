package dp;

import android.view.View;
import com.yk.e.callBack.MainFloatViewCallback;

/* JADX INFO: loaded from: classes3.dex */
public final class d implements View.OnClickListener {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ e f59917b;

    public d(e eVar) {
        this.f59917b = eVar;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        MainFloatViewCallback mainFloatViewCallback;
        e eVar = this.f59917b;
        if (!eVar.D && (mainFloatViewCallback = eVar.C) != null) {
            mainFloatViewCallback.onAdClick();
        }
        eVar.m(eVar.B, 27);
    }
}
