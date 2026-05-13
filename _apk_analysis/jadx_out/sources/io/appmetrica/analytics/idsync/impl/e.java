package io.appmetrica.analytics.idsync.impl;

import io.appmetrica.analytics.coreapi.internal.data.ProtobufConverter;
import io.appmetrica.analytics.idsync.internal.model.IdSyncConfig;
import java.util.ArrayList;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes12.dex */
public final class e implements ProtobufConverter {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final x f64888a = new x();

    @Override // io.appmetrica.analytics.coreapi.internal.data.Converter
    @NotNull
    /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
    public final o fromModel(@NotNull IdSyncConfig idSyncConfig) {
        o oVar = new o();
        oVar.f64919a = idSyncConfig.getEnabled();
        n nVar = new n();
        nVar.f64914a = idSyncConfig.getLaunchDelay();
        int size = idSyncConfig.getRequests().size();
        m[] mVarArr = new m[size];
        for (int i10 = 0; i10 < size; i10++) {
            mVarArr[i10] = this.f64888a.fromModel(idSyncConfig.getRequests().get(i10));
        }
        nVar.f64915b = mVarArr;
        oVar.f64920b = nVar;
        return oVar;
    }

    @Override // io.appmetrica.analytics.coreapi.internal.data.Converter
    @NotNull
    /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
    public final IdSyncConfig toModel(@NotNull o oVar) {
        n nVar = oVar.f64920b;
        if (nVar == null) {
            nVar = new n();
        }
        boolean z10 = oVar.f64919a;
        long j10 = nVar.f64914a;
        m[] mVarArr = nVar.f64915b;
        ArrayList arrayList = new ArrayList(mVarArr.length);
        for (m mVar : mVarArr) {
            arrayList.add(this.f64888a.toModel(mVar));
        }
        return new IdSyncConfig(z10, j10, arrayList);
    }
}
