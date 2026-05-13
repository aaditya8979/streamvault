package io.appmetrica.analytics.impl;

import android.content.Context;
import io.appmetrica.analytics.coreapi.internal.data.ProtobufStateStorage;
import io.appmetrica.analytics.coreutils.internal.parsing.JsonUtils;
import java.util.Iterator;
import java.util.concurrent.CopyOnWriteArrayList;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: io.appmetrica.analytics.impl.im, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes10.dex */
public final class C4868im implements InterfaceC4946lm {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public volatile C4817gm f66993a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final CopyOnWriteArrayList f66994b = new CopyOnWriteArrayList();

    public final void a(@NotNull Context context) {
        String strOptStringOrNull;
        ProtobufStateStorage<Object> protobufStateStorageCreate = ((Sm) Qm.a(C4920km.class)).create(context);
        xo xoVarA = C5009oa.k().D().a();
        synchronized (xoVarA) {
            strOptStringOrNull = JsonUtils.optStringOrNull(xoVarA.f67993a.a(), "device_id");
        }
        a(new C4817gm(strOptStringOrNull, xoVarA.a(), (C4920km) protobufStateStorageCreate.read()));
    }

    @Override // io.appmetrica.analytics.impl.InterfaceC4946lm
    public final void a(@NotNull C4817gm c4817gm) {
        this.f66993a = c4817gm;
        Iterator it = this.f66994b.iterator();
        while (it.hasNext()) {
            ((InterfaceC4946lm) it.next()).a(c4817gm);
        }
    }

    public final void a(@NotNull InterfaceC4946lm interfaceC4946lm) {
        this.f66994b.add(interfaceC4946lm);
        if (this.f66993a != null) {
            C4817gm c4817gm = this.f66993a;
            if (c4817gm == null) {
                tn.p.C("startupState");
                c4817gm = null;
            }
            interfaceC4946lm.a(c4817gm);
        }
    }

    @NotNull
    public final C4817gm b() {
        C4817gm c4817gm = this.f66993a;
        if (c4817gm != null) {
            return c4817gm;
        }
        tn.p.C("startupState");
        return null;
    }

    public final void b(@NotNull InterfaceC4946lm interfaceC4946lm) {
        this.f66994b.remove(interfaceC4946lm);
    }
}
