package com.unity3d.ads.core.data.datasource;

import android.content.Context;
import android.content.pm.PackageManager;
import android.os.Build;
import cn.f0;
import io.bidmachine.ads.networks.gam_dynamic.GAMConfig;
import java.util.ArrayList;
import java.util.List;
import org.jetbrains.annotations.NotNull;
import tn.p;

/* JADX INFO: compiled from: AndroidStoreDataSource.kt */
/* JADX INFO: loaded from: classes5.dex */
public final class AndroidStoreDataSource implements StoreDataSource {

    @NotNull
    private final Context context;

    public AndroidStoreDataSource(@NotNull Context context) {
        p.k(context, GAMConfig.KEY_CONTEXT);
        this.context = context;
    }

    @Override // com.unity3d.ads.core.data.datasource.StoreDataSource
    @NotNull
    public List<String> fetchStores(@NotNull List<String> list) {
        p.k(list, "additionalStores");
        AndroidKnownStore[] androidKnownStoreArrValues = AndroidKnownStore.values();
        ArrayList arrayList = new ArrayList(androidKnownStoreArrValues.length);
        for (AndroidKnownStore androidKnownStore : androidKnownStoreArrValues) {
            arrayList.add(androidKnownStore.getPackageName());
        }
        List listK0 = f0.k0(f0.O0(arrayList, list));
        PackageManager packageManager = this.context.getPackageManager();
        ArrayList arrayList2 = new ArrayList();
        for (Object obj : listK0) {
            String str = (String) obj;
            boolean z10 = (Build.VERSION.SDK_INT >= 33 ? packageManager.getPackageInfo(str, PackageManager.PackageInfoFlags.of(0L)) : packageManager.getPackageInfo(str, 0)) != null;
            if (z10) {
                arrayList2.add(obj);
            }
        }
        return arrayList2;
    }
}
