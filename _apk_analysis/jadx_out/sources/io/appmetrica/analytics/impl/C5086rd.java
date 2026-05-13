package io.appmetrica.analytics.impl;

import java.util.Map;
import kotlin.jvm.internal.Lambda;

/* JADX INFO: renamed from: io.appmetrica.analytics.impl.rd, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes10.dex */
public final class C5086rd extends Lambda implements sn.l {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ C4806gb f67614a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C5086rd(C4806gb c4806gb) {
        super(1);
        this.f67614a = c4806gb;
    }

    @Override // sn.l
    public final Object invoke(Object obj) {
        Zc zc2 = (Zc) ((Map.Entry) obj).getValue();
        return zc2.f66298b.parse(this.f67614a);
    }
}
