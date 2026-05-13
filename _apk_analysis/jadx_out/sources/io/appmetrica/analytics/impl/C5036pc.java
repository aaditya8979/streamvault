package io.appmetrica.analytics.impl;

import androidx.annotation.Nullable;
import androidx.fragment.app.FragmentTransaction;

/* JADX INFO: renamed from: io.appmetrica.analytics.impl.pc, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes10.dex */
public final class C5036pc implements InterfaceC4940lg {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ C5061qc f67519a;

    public C5036pc(C5061qc c5061qc) {
        this.f67519a = c5061qc;
    }

    @Override // io.appmetrica.analytics.impl.InterfaceC4940lg
    public final void a(@Nullable C5015og c5015og) {
        if (c5015og == null) {
            return;
        }
        Q5 q52 = new Q5("", "", 0);
        q52.setValueBytes(c5015og.a());
        EnumC4703cb enumC4703cb = EnumC4703cb.EVENT_TYPE_UNDEFINED;
        q52.f65791d = FragmentTransaction.TRANSIT_FRAGMENT_OPEN;
        this.f67519a.a(q52);
    }
}
