package io.bidmachine.rendering.internal.event;

import bn.r;
import io.bidmachine.rendering.internal.h;
import io.bidmachine.rendering.model.EventTaskParams;
import io.bidmachine.rendering.model.EventType;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.EnumMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import p000do.i;
import p000do.l0;
import sn.p;

/* JADX INFO: loaded from: classes11.dex */
public final class c implements b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final String f70418a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final e f70419b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final e f70420c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final d f70421d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final l0 f70422e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private final h f70423f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private final Map f70424g;

    public static final class a extends SuspendLambda implements p {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public int f70425a;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final /* synthetic */ Object[] f70427c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public final /* synthetic */ EventType f70428d;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(Object[] objArr, EventType eventType, hn.c cVar) {
            super(2, cVar);
            this.f70427c = objArr;
            this.f70428d = eventType;
        }

        @Override // sn.p
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final Object mo2invoke(l0 l0Var, hn.c cVar) {
            return ((a) create(l0Var, cVar)).invokeSuspend(r.f5635a);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final hn.c create(Object obj, hn.c cVar) {
            return c.this.new a(this.f70427c, this.f70428d, cVar);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            in.a.g();
            if (this.f70425a != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            kotlin.c.b(obj);
            e eVar = c.this.f70420c;
            List listI0 = cn.r.I0(this.f70427c);
            listI0.add(0, this.f70428d);
            if (eVar.a(listI0)) {
                return r.f5635a;
            }
            List list = (List) c.this.f70424g.get(this.f70428d);
            if (list != null) {
                if (!(!list.isEmpty())) {
                    list = null;
                }
                if (list != null) {
                    c cVar = c.this;
                    ArrayList arrayList = new ArrayList();
                    for (Object obj2 : list) {
                        if (!cVar.f70419b.a(((EventTaskParams) obj2).getStateGroups())) {
                            arrayList.add(obj2);
                        }
                    }
                    c cVar2 = c.this;
                    EventType eventType = this.f70428d;
                    Object[] objArr = this.f70427c;
                    Iterator it = arrayList.iterator();
                    while (it.hasNext()) {
                        cVar2.f70421d.a(eventType, (EventTaskParams) it.next(), Arrays.copyOf(objArr, objArr.length));
                    }
                }
            }
            return r.f5635a;
        }
    }

    public c(String str, e eVar, e eVar2, d dVar, l0 l0Var, h hVar, Map map) {
        tn.p.k(str, "sourceName");
        tn.p.k(eVar, "stateGroupEventInterceptor");
        tn.p.k(eVar2, "animationEventInterceptor");
        tn.p.k(dVar, "callbackProcessor");
        tn.p.k(l0Var, "coroutineScope");
        tn.p.k(hVar, "coroutineDispatchers");
        this.f70418a = str;
        this.f70419b = eVar;
        this.f70420c = eVar2;
        this.f70421d = dVar;
        this.f70422e = l0Var;
        this.f70423f = hVar;
        this.f70424g = map == null ? new EnumMap(EventType.class) : map;
    }

    @Override // io.bidmachine.rendering.internal.event.b
    public void a() {
        a(EventType.OnComplete, new Object[0]);
    }

    @Override // io.bidmachine.rendering.internal.event.b
    public void a(int i10) {
        a(EventType.OnClick, Integer.valueOf(i10));
    }

    @Override // io.bidmachine.rendering.internal.event.b
    public void a(long j10, long j11) {
        a(EventType.OnProgress, Long.valueOf(j10), Long.valueOf(j11));
    }

    public final void a(EventType eventType, Object... objArr) {
        tn.p.k(eventType, "eventType");
        tn.p.k(objArr, "params");
        i.d(this.f70422e, this.f70423f.b(), null, new a(objArr, eventType, null), 2, null);
    }

    @Override // io.bidmachine.rendering.internal.event.b
    public void a(String str) {
        tn.p.k(str, "url");
        a(EventType.OnNavigate, str);
    }

    @Override // io.bidmachine.rendering.internal.event.b
    public void b() {
        a(EventType.OnResume, new Object[0]);
    }

    @Override // io.bidmachine.rendering.internal.event.b
    public void c() {
        a(EventType.OnUnMute, new Object[0]);
    }

    @Override // io.bidmachine.rendering.internal.event.b
    public void d() {
        a(EventType.OnThirdQuartile, new Object[0]);
    }

    @Override // io.bidmachine.rendering.internal.event.b
    public void e() {
        a(EventType.OnSkip, new Object[0]);
    }

    @Override // io.bidmachine.rendering.internal.event.b
    public void f() {
        a(EventType.OnMute, new Object[0]);
    }

    @Override // io.bidmachine.rendering.internal.event.b
    public String g() {
        return this.f70418a;
    }

    @Override // io.bidmachine.rendering.internal.event.b
    public void h() {
        a(EventType.OnPause, new Object[0]);
    }

    @Override // io.bidmachine.rendering.internal.event.b
    public void i() {
        a(EventType.OnMidpoint, new Object[0]);
    }

    @Override // io.bidmachine.rendering.internal.event.b
    public void j() {
        a(EventType.OnScheduled, new Object[0]);
    }

    @Override // io.bidmachine.rendering.internal.event.b
    public void k() {
        a(EventType.OnFirstQuartile, new Object[0]);
    }

    @Override // io.bidmachine.rendering.internal.event.b
    public void l() {
        a(EventType.OnStart, new Object[0]);
    }

    @Override // io.bidmachine.rendering.internal.event.b
    public void m() {
        a(EventType.OnImpression, new Object[0]);
    }

    @Override // io.bidmachine.rendering.internal.event.b
    public void onClose() {
        a(EventType.OnClose, new Object[0]);
    }

    @Override // io.bidmachine.rendering.internal.event.b
    public void onUseCustomClose(boolean z10) {
        a(EventType.OnUseCustomClose, Boolean.valueOf(z10));
    }
}
