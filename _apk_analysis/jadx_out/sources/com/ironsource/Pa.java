package com.ironsource;

import com.ironsource.InterfaceC4202pb;
import com.unity3d.mediation.LevelPlayAdInfo;
import kotlin.NoWhenBranchMatchedException;

/* JADX INFO: loaded from: classes7.dex */
public final class Pa {
    /* JADX INFO: Access modifiers changed from: private */
    public static final String b(InterfaceC4202pb<LevelPlayAdInfo> interfaceC4202pb) {
        if (interfaceC4202pb instanceof InterfaceC4202pb.b) {
            return "success";
        }
        if (interfaceC4202pb instanceof InterfaceC4202pb.a) {
            return "failure";
        }
        throw new NoWhenBranchMatchedException();
    }
}
