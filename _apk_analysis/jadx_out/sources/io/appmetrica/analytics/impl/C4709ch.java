package io.appmetrica.analytics.impl;

import android.content.Context;
import androidx.annotation.NonNull;
import io.appmetrica.analytics.coreapi.internal.data.ProtobufStateStorage;
import io.appmetrica.analytics.coreutils.internal.AndroidUtils;
import io.appmetrica.analytics.coreutils.internal.collection.CollectionUtils;
import io.appmetrica.analytics.coreutils.internal.services.SafePackageManager;
import io.appmetrica.analytics.coreutils.internal.system.SystemServiceUtils;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/* JADX INFO: renamed from: io.appmetrica.analytics.impl.ch, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes9.dex */
public final class C4709ch extends Sg {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final C5237xe f66532b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final ProtobufStateStorage f66533c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final C5275z2 f66534d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final C4720d2 f66535e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final C5100s2 f66536f;

    public C4709ch(Y4 y42, C5237xe c5237xe) {
        this(y42, c5237xe, ((Sm) Qm.a(U1.class)).create(y42.getContext()), new C5275z2(y42.getContext()), new C4720d2(), new C5100s2(y42.getContext()));
    }

    public C4709ch(Y4 y42, C5237xe c5237xe, ProtobufStateStorage protobufStateStorage, C5275z2 c5275z2, C4720d2 c4720d2, C5100s2 c5100s2) {
        super(y42);
        this.f66532b = c5237xe;
        this.f66533c = protobufStateStorage;
        this.f66534d = c5275z2;
        this.f66535e = c4720d2;
        this.f66536f = c5100s2;
    }

    @Override // io.appmetrica.analytics.impl.Sg
    public final boolean a(@NonNull Q5 q52) {
        Y4 y42 = this.f65880a;
        y42.f66215b.toString();
        if (!y42.f66233t.c() || !y42.x()) {
            return false;
        }
        U1 u12 = (U1) this.f66533c.read();
        List list = u12.f65971a;
        C5250y2 c5250y2 = u12.f65972b;
        C5275z2 c5275z2 = this.f66534d;
        c5275z2.getClass();
        U1 u13 = null;
        C5250y2 c5250y2A = AndroidUtils.isApiAchieved(28) ? C5175v2.a(c5275z2.f68055a, c5275z2.f68056b) : null;
        List list2 = u12.f65973c;
        List list3 = (List) SystemServiceUtils.accessSystemServiceSafelyOrDefault(this.f66536f.f67659a, "getting available providers", "location manager", Collections.emptyList(), new C5075r2());
        C5237xe c5237xe = this.f66532b;
        Context context = this.f65880a.f66214a;
        c5237xe.getClass();
        ArrayList arrayListA = new Qi(context, new SafePackageManager()).a();
        if (CollectionUtils.areCollectionsEqual(arrayListA, list)) {
            arrayListA = null;
        }
        if (arrayListA != null || !mo.a(c5250y2, c5250y2A) || !CollectionUtils.areCollectionsEqual(list2, list3)) {
            if (arrayListA != null) {
                list = arrayListA;
            }
            u13 = new U1(list, c5250y2A, list3);
        }
        if (u13 != null) {
            C4933l9 c4933l9 = y42.f66227n;
            Q5 q5A = Q5.a(q52, u13.f65971a, u13.f65972b, this.f66535e, u13.f65973c);
            c4933l9.a(q5A, Sk.a(c4933l9.f67197c.b(q5A), q5A.f65796i));
            long jCurrentTimeSeconds = c4933l9.f67203i.currentTimeSeconds();
            c4933l9.f67205k = jCurrentTimeSeconds;
            c4933l9.f67195a.a(jCurrentTimeSeconds).b();
            this.f66533c.save(u13);
            return false;
        }
        if (!y42.A()) {
            return false;
        }
        C4933l9 c4933l92 = y42.f66227n;
        Q5 q5A2 = Q5.a(q52, u12.f65971a, u12.f65972b, this.f66535e, u12.f65973c);
        c4933l92.a(q5A2, Sk.a(c4933l92.f67197c.b(q5A2), q5A2.f65796i));
        long jCurrentTimeSeconds2 = c4933l92.f67203i.currentTimeSeconds();
        c4933l92.f67205k = jCurrentTimeSeconds2;
        c4933l92.f67195a.a(jCurrentTimeSeconds2).b();
        return false;
    }
}
