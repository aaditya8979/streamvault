package io.appmetrica.analytics.impl;

import androidx.annotation.VisibleForTesting;
import java.util.HashMap;
import java.util.LinkedList;

/* JADX INFO: loaded from: classes9.dex */
public final class Y8 extends Gf {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final C5116si f66252a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final HashMap f66253b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final C5077r4 f66254c;

    public Y8(Y4 y42) {
        C5116si c5116si = new C5116si(y42);
        this.f66252a = c5116si;
        this.f66254c = new C5077r4(c5116si);
        this.f66253b = a();
    }

    @Override // io.appmetrica.analytics.impl.Gf
    public final X8 a(int i10) {
        LinkedList linkedList = new LinkedList();
        EnumC4703cb enumC4703cbA = EnumC4703cb.a(i10);
        C5077r4 c5077r4 = this.f66254c;
        if (c5077r4 != null) {
            c5077r4.a(enumC4703cbA, linkedList);
        }
        AbstractC5034pa abstractC5034pa = (AbstractC5034pa) this.f66253b.get(enumC4703cbA);
        if (abstractC5034pa != null) {
            abstractC5034pa.a(linkedList);
        }
        return new W8(linkedList);
    }

    @VisibleForTesting
    public final AbstractC5034pa a(EnumC4703cb enumC4703cb) {
        return (AbstractC5034pa) this.f66253b.get(enumC4703cb);
    }

    public final HashMap a() {
        HashMap map = new HashMap();
        map.put(EnumC4703cb.EVENT_TYPE_ACTIVATION, new C4820h(this.f66252a));
        map.put(EnumC4703cb.EVENT_TYPE_START, new Fl(this.f66252a));
        map.put(EnumC4703cb.EVENT_TYPE_REGULAR, new Hg(this.f66252a));
        C4883jb c4883jb = new C4883jb(this.f66252a);
        map.put(EnumC4703cb.EVENT_TYPE_EXCEPTION_USER_PROTOBUF, c4883jb);
        map.put(EnumC4703cb.EVENT_TYPE_EXCEPTION_USER_CUSTOM_PROTOBUF, c4883jb);
        map.put(EnumC4703cb.EVENT_TYPE_SEND_REFERRER, c4883jb);
        map.put(EnumC4703cb.EVENT_TYPE_CUSTOM_EVENT, c4883jb);
        EnumC4703cb enumC4703cb = EnumC4703cb.EVENT_TYPE_SET_SESSION_EXTRA;
        C5116si c5116si = this.f66252a;
        map.put(enumC4703cb, new Al(c5116si, c5116si.f67697t));
        map.put(EnumC4703cb.EVENT_TYPE_APP_OPEN, new Og(this.f66252a));
        map.put(EnumC4703cb.EVENT_TYPE_PURGE_BUFFER, new Sf(this.f66252a));
        map.put(EnumC4703cb.EVENT_TYPE_CURRENT_SESSION_NATIVE_CRASH_PROTOBUF, new C5129t6(this.f66252a));
        map.put(EnumC4703cb.EVENT_TYPE_PREV_SESSION_NATIVE_CRASH_PROTOBUF, new C5213wf(this.f66252a));
        map.put(EnumC4703cb.EVENT_TYPE_EXCEPTION_UNHANDLED_FROM_FILE, new Wn(this.f66252a));
        map.put(EnumC4703cb.EVENT_TYPE_PREV_SESSION_EXCEPTION_UNHANDLED_FROM_FILE, new C5238xf(this.f66252a));
        map.put(EnumC4703cb.EVENT_TYPE_EXCEPTION_UNHANDLED_PROTOBUF, new Vn(this.f66252a));
        map.put(EnumC4703cb.EVENT_TYPE_ANR, c4883jb);
        EnumC4703cb enumC4703cb2 = EnumC4703cb.EVENT_TYPE_APP_ENVIRONMENT_UPDATED;
        C5116si c5116si2 = this.f66252a;
        map.put(enumC4703cb2, new Al(c5116si2, c5116si2.f67682e));
        EnumC4703cb enumC4703cb3 = EnumC4703cb.EVENT_TYPE_APP_ENVIRONMENT_CLEARED;
        C5116si c5116si3 = this.f66252a;
        map.put(enumC4703cb3, new Al(c5116si3, c5116si3.f67683f));
        map.put(EnumC4703cb.EVENT_TYPE_SEND_USER_PROFILE, c4883jb);
        EnumC4703cb enumC4703cb4 = EnumC4703cb.EVENT_TYPE_SET_USER_PROFILE_ID;
        C5116si c5116si4 = this.f66252a;
        map.put(enumC4703cb4, new Al(c5116si4, c5116si4.f67688k));
        map.put(EnumC4703cb.EVENT_TYPE_SEND_REVENUE_EVENT, c4883jb);
        map.put(EnumC4703cb.EVENT_TYPE_SEND_AD_REVENUE_EVENT, c4883jb);
        map.put(EnumC4703cb.EVENT_TYPE_CLEANUP, c4883jb);
        map.put(EnumC4703cb.EVENT_TYPE_SEND_ECOMMERCE_EVENT, c4883jb);
        map.put(EnumC4703cb.EVENT_TYPE_WEBVIEW_SYNC, c4883jb);
        map.put(EnumC4703cb.EVENT_CLIENT_EXTERNAL_ATTRIBUTION, new F9(this.f66252a));
        return map;
    }

    public final void a(EnumC4703cb enumC4703cb, AbstractC5034pa abstractC5034pa) {
        this.f66253b.put(enumC4703cb, abstractC5034pa);
    }

    public final C5116si b() {
        return this.f66252a;
    }
}
