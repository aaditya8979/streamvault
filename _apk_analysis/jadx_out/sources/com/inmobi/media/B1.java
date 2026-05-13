package com.inmobi.media;

import android.content.Context;
import com.google.android.gms.appset.AppSet;
import com.google.android.gms.appset.AppSetIdClient;
import com.google.android.gms.appset.AppSetIdInfo;
import com.google.android.gms.tasks.OnSuccessListener;
import com.google.android.gms.tasks.Task;
import com.inmobi.media.B1;
import java.util.LinkedHashMap;

/* JADX INFO: loaded from: classes7.dex */
public abstract class B1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static AppSetIdInfo f25190a;

    static {
        b();
    }

    public static final bn.r a(AppSetIdInfo appSetIdInfo) {
        f25190a = appSetIdInfo;
        return bn.r.f5635a;
    }

    public static void a(LinkedHashMap linkedHashMap) {
        AppSetIdInfo appSetIdInfo;
        tn.p.k(linkedHashMap, "mutableMap");
        if (a() && (appSetIdInfo = f25190a) != null) {
            linkedHashMap.put("d-app-set-id", appSetIdInfo.getId());
            int scope = appSetIdInfo.getScope();
            StringBuilder sb2 = new StringBuilder();
            sb2.append(scope);
        }
    }

    public static final void a(sn.l lVar, Object obj) {
        lVar.invoke(obj);
    }

    public static boolean a() {
        try {
            tn.t.b(AppSetIdInfo.class).getSimpleName();
            tn.t.b(Task.class).getSimpleName();
            return true;
        } catch (NoClassDefFoundError e10) {
            tn.p.j("B1", "tag");
            e10.toString();
            return false;
        }
    }

    public static void b() {
        Context context = Ji.f25747a;
        if (context != null && a()) {
            AppSetIdClient client = AppSet.getClient(context);
            tn.p.j(client, "getClient(...)");
            Task<AppSetIdInfo> appSetIdInfo = client.getAppSetIdInfo();
            tn.p.j(appSetIdInfo, "getAppSetIdInfo(...)");
            final sn.l lVar = new sn.l() { // from class: n9.d
                @Override // sn.l
                public final Object invoke(Object obj) {
                    return B1.a((AppSetIdInfo) obj);
                }
            };
            appSetIdInfo.addOnSuccessListener(new OnSuccessListener() { // from class: n9.e
                @Override // com.google.android.gms.tasks.OnSuccessListener
                public final void onSuccess(Object obj) {
                    B1.a(lVar, obj);
                }
            });
        }
    }
}
