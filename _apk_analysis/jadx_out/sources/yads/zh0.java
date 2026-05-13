package yads;

import android.net.Uri;
import android.view.View;
import com.ironsource.C3978d4;
import java.util.LinkedHashMap;

/* JADX INFO: loaded from: classes3.dex */
public final class zh0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final pu f97576a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public qu f97577b;

    public zh0(pu puVar) {
        this.f97576a = puVar;
    }

    public final void a(Uri uri, View view) {
        LinkedHashMap linkedHashMap;
        ui uiVar;
        View.OnClickListener onClickListener;
        String queryParameter = uri.getQueryParameter("assetName");
        if (queryParameter != null) {
            String queryParameter2 = uri.getQueryParameter(C3978d4.i.L);
            pu puVar = null;
            Integer numR = queryParameter2 != null ? bo.z.r(queryParameter2) : null;
            if (numR == null) {
                puVar = this.f97576a;
            } else {
                qu quVar = this.f97577b;
                if (quVar != null && (linkedHashMap = quVar.f94152b) != null) {
                    puVar = (pu) linkedHashMap.get(numR);
                }
            }
            if (puVar == null || (uiVar = puVar.f93774b) == null || (onClickListener = (View.OnClickListener) uiVar.f95667a.get(queryParameter)) == null) {
                return;
            }
            onClickListener.onClick(view);
        }
    }
}
