package com.google.android.gms.internal.ads;

import kotlin.coroutines.jvm.internal.ContinuationImpl;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads@@24.9.0 */
/* JADX INFO: loaded from: classes10.dex */
final class zzfzz extends ContinuationImpl {
    public Object zza;
    public /* synthetic */ Object zzb;
    public final /* synthetic */ zzgaf zzc;
    public int zzd;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public zzfzz(zzgaf zzgafVar, hn.c cVar) {
        super(cVar);
        this.zzc = zzgafVar;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @Nullable
    public final Object invokeSuspend(@NotNull Object obj) {
        this.zzb = obj;
        this.zzd |= Integer.MIN_VALUE;
        return this.zzc.zzh(this);
    }
}
