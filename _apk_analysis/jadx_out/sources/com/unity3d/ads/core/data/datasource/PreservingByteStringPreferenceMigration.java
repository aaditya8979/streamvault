package com.unity3d.ads.core.data.datasource;

import android.content.Context;
import androidx.datastore.core.DataMigration;
import bn.r;
import com.unity3d.ads.datastore.ByteStringStoreOuterClass;
import hn.c;
import io.bidmachine.ads.networks.gam_dynamic.GAMConfig;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import tn.p;

/* JADX INFO: compiled from: PreservingByteStringPreferenceMigration.kt */
/* JADX INFO: loaded from: classes10.dex */
public final class PreservingByteStringPreferenceMigration implements DataMigration<ByteStringStoreOuterClass.ByteStringStore> {

    @NotNull
    private final Context context;

    @NotNull
    private final GetByteStringData getByteStringData;

    @NotNull
    private final String key;

    @NotNull
    private final String name;

    public PreservingByteStringPreferenceMigration(@NotNull Context context, @NotNull String str, @NotNull String str2, @NotNull GetByteStringData getByteStringData) {
        p.k(context, GAMConfig.KEY_CONTEXT);
        p.k(str, "name");
        p.k(str2, "key");
        p.k(getByteStringData, "getByteStringData");
        this.context = context;
        this.name = str;
        this.key = str2;
        this.getByteStringData = getByteStringData;
    }

    @Override // androidx.datastore.core.DataMigration
    @Nullable
    public Object cleanUp(@NotNull c<? super r> cVar) {
        return r.f5635a;
    }

    @Override // androidx.datastore.core.DataMigration
    @Nullable
    public Object migrate(@NotNull ByteStringStoreOuterClass.ByteStringStore byteStringStore, @NotNull c<? super ByteStringStoreOuterClass.ByteStringStore> cVar) {
        if (!byteStringStore.getData().isEmpty()) {
            return byteStringStore;
        }
        String string = this.context.getSharedPreferences(this.name, 0).getString(this.key, null);
        if (string == null || string.length() == 0) {
            return byteStringStore;
        }
        ByteStringStoreOuterClass.ByteStringStore byteStringStoreBuild = ByteStringStoreOuterClass.ByteStringStore.newBuilder().setData(this.getByteStringData.invoke(string)).build();
        p.j(byteStringStoreBuild, "newBuilder()\n           …                 .build()");
        return byteStringStoreBuild;
    }

    @Nullable
    /* JADX INFO: renamed from: shouldMigrate, reason: avoid collision after fix types in other method */
    public Object shouldMigrate2(@NotNull ByteStringStoreOuterClass.ByteStringStore byteStringStore, @NotNull c<? super Boolean> cVar) {
        return jn.a.a(byteStringStore.getData().isEmpty());
    }

    @Override // androidx.datastore.core.DataMigration
    public /* bridge */ /* synthetic */ Object shouldMigrate(ByteStringStoreOuterClass.ByteStringStore byteStringStore, c cVar) {
        return shouldMigrate2(byteStringStore, (c<? super Boolean>) cVar);
    }
}
