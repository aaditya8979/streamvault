package com.unity3d.ads.core.data.datasource;

import kotlin.Result;
import kotlin.c;
import org.jetbrains.annotations.NotNull;
import tn.p;

/* JADX INFO: compiled from: AndroidFIdExistenceDataSource.kt */
/* JADX INFO: loaded from: classes11.dex */
public final class AndroidFIdExistenceDataSource implements FIdExistenceDataSource {

    @NotNull
    private final String className;

    public AndroidFIdExistenceDataSource(@NotNull String str) {
        p.k(str, "className");
        this.className = str;
    }

    @Override // com.unity3d.ads.core.data.datasource.FIdExistenceDataSource
    public boolean invoke() {
        Object objM7534constructorimpl;
        try {
            Result.a aVar = Result.Companion;
            objM7534constructorimpl = Result.m7534constructorimpl(Class.forName(this.className));
        } catch (Throwable th2) {
            Result.a aVar2 = Result.Companion;
            objM7534constructorimpl = Result.m7534constructorimpl(c.a(th2));
        }
        return Result.m7540isSuccessimpl(objM7534constructorimpl);
    }
}
