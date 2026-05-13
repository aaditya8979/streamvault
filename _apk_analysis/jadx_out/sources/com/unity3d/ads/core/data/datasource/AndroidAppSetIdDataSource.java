package com.unity3d.ads.core.data.datasource;

import android.content.Context;
import bn.r;
import com.google.android.gms.appset.AppSet;
import com.google.android.gms.appset.AppSetIdInfo;
import com.google.android.gms.tasks.OnSuccessListener;
import com.google.android.gms.tasks.Task;
import go.l;
import go.v;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import tn.p;

/* JADX INFO: compiled from: AndroidAppSetIdDataSource.kt */
/* JADX INFO: loaded from: classes3.dex */
public final class AndroidAppSetIdDataSource {

    @NotNull
    private final l<String> _appSetIdFlow;

    @NotNull
    private final Context applicationContext;

    @NotNull
    private final l<Boolean> isCollecting;

    public AndroidAppSetIdDataSource(@NotNull Context context) {
        p.k(context, "applicationContext");
        this.applicationContext = context;
        this.isCollecting = v.a(Boolean.FALSE);
        this._appSetIdFlow = v.a(null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void invoke$lambda$1(sn.l lVar, Object obj) {
        p.k(lVar, "$tmp0");
        lVar.invoke(obj);
    }

    @Nullable
    public final String getAppSetId() {
        return this._appSetIdFlow.getValue();
    }

    public final void invoke() {
        Boolean value;
        Boolean bool;
        l<Boolean> lVar = this.isCollecting;
        do {
            value = lVar.getValue();
            bool = value;
            bool.booleanValue();
        } while (!lVar.b(value, Boolean.TRUE));
        if (bool.booleanValue()) {
            return;
        }
        try {
            Task<AppSetIdInfo> appSetIdInfo = AppSet.getClient(this.applicationContext).getAppSetIdInfo();
            final sn.l<AppSetIdInfo, r> lVar2 = new sn.l<AppSetIdInfo, r>() { // from class: com.unity3d.ads.core.data.datasource.AndroidAppSetIdDataSource.invoke.2
                {
                    super(1);
                }

                @Override // sn.l
                public /* bridge */ /* synthetic */ r invoke(AppSetIdInfo appSetIdInfo2) {
                    invoke2(appSetIdInfo2);
                    return r.f5635a;
                }

                /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
                public final void invoke2(AppSetIdInfo appSetIdInfo2) {
                    String id2 = appSetIdInfo2.getId();
                    p.j(id2, "it.id");
                    AndroidAppSetIdDataSource.this._appSetIdFlow.setValue(id2);
                }
            };
            appSetIdInfo.addOnSuccessListener(new OnSuccessListener() { // from class: com.unity3d.ads.core.data.datasource.a
                @Override // com.google.android.gms.tasks.OnSuccessListener
                public final void onSuccess(Object obj) {
                    AndroidAppSetIdDataSource.invoke$lambda$1(lVar2, obj);
                }
            });
        } catch (Throwable unused) {
        }
    }
}
