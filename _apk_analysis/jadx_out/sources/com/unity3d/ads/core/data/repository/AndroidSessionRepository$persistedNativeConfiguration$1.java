package com.unity3d.ads.core.data.repository;

import bn.h;
import bn.r;
import gatewayprotocol.v1.NativeConfigurationOuterClass;
import hn.c;
import jn.d;
import kotlin.Pair;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import sn.q;

/* JADX INFO: compiled from: AndroidSessionRepository.kt */
/* JADX INFO: loaded from: classes5.dex */
@d(c = "com.unity3d.ads.core.data.repository.AndroidSessionRepository$persistedNativeConfiguration$1", f = "AndroidSessionRepository.kt", l = {}, m = "invokeSuspend")
public final class AndroidSessionRepository$persistedNativeConfiguration$1 extends SuspendLambda implements q<NativeConfigurationOuterClass.NativeConfiguration, Boolean, c<? super Pair<? extends NativeConfigurationOuterClass.NativeConfiguration, ? extends Boolean>>, Object> {
    public /* synthetic */ Object L$0;
    public /* synthetic */ boolean Z$0;
    public int label;

    public AndroidSessionRepository$persistedNativeConfiguration$1(c<? super AndroidSessionRepository$persistedNativeConfiguration$1> cVar) {
        super(3, cVar);
    }

    @Nullable
    public final Object invoke(@NotNull NativeConfigurationOuterClass.NativeConfiguration nativeConfiguration, boolean z10, @Nullable c<? super Pair<NativeConfigurationOuterClass.NativeConfiguration, Boolean>> cVar) {
        AndroidSessionRepository$persistedNativeConfiguration$1 androidSessionRepository$persistedNativeConfiguration$1 = new AndroidSessionRepository$persistedNativeConfiguration$1(cVar);
        androidSessionRepository$persistedNativeConfiguration$1.L$0 = nativeConfiguration;
        androidSessionRepository$persistedNativeConfiguration$1.Z$0 = z10;
        return androidSessionRepository$persistedNativeConfiguration$1.invokeSuspend(r.f5635a);
    }

    @Override // sn.q
    public /* bridge */ /* synthetic */ Object invoke(NativeConfigurationOuterClass.NativeConfiguration nativeConfiguration, Boolean bool, c<? super Pair<? extends NativeConfigurationOuterClass.NativeConfiguration, ? extends Boolean>> cVar) {
        return invoke(nativeConfiguration, bool.booleanValue(), (c<? super Pair<NativeConfigurationOuterClass.NativeConfiguration, Boolean>>) cVar);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @Nullable
    public final Object invokeSuspend(@NotNull Object obj) {
        in.a.g();
        if (this.label != 0) {
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        kotlin.c.b(obj);
        return h.a((NativeConfigurationOuterClass.NativeConfiguration) this.L$0, jn.a.a(this.Z$0));
    }
}
