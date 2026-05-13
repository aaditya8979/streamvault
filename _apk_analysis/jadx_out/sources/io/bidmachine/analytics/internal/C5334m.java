package io.bidmachine.analytics.internal;

import android.content.Context;
import com.fyber.inneractive.sdk.external.InneractiveMediationDefs;
import com.unity3d.services.core.device.reader.JsonStorageKeyNames;
import io.bidmachine.ads.networks.gam_dynamic.GAMConfig;
import io.bidmachine.analytics.AnalyticsConfig;
import io.bidmachine.analytics.MonitorConfig;
import io.bidmachine.analytics.ReaderConfig;
import io.bidmachine.analytics.internal.ReaderRecord;
import io.bidmachine.analytics.internal.X;
import io.bidmachine.analytics.internal.g0;
import io.bidmachine.analytics.internal.n0;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import kotlin.Metadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import p000do.j2;

/* JADX INFO: renamed from: io.bidmachine.analytics.internal.m, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes8.dex */
@Metadata(bv = {}, d1 = {"\u0000\u0082\u0001\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010$\n\u0002\u0010\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010 \n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0011\n\u0002\u0010!\n\u0002\b\u0005\bÀ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\bH\u00108J#\u0010\u0007\u001a\u00020\u00062\u0012\u0010\u0005\u001a\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00040\u0002H\u0002¢\u0006\u0004\b\u0007\u0010\bJ\u0017\u0010\u0007\u001a\u00020\u000b2\u0006\u0010\n\u001a\u00020\tH\u0002¢\u0006\u0004\b\u0007\u0010\fJ\u0017\u0010\u000e\u001a\u00020\r2\u0006\u0010\n\u001a\u00020\tH\u0002¢\u0006\u0004\b\u000e\u0010\u000fJ\u0017\u0010\u0007\u001a\u00020\t2\u0006\u0010\u0011\u001a\u00020\u0010H\u0002¢\u0006\u0004\b\u0007\u0010\u0012J+\u0010\u0007\u001a\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00040\u00022\u0006\u0010\u0014\u001a\u00020\u00132\u0006\u0010\u0015\u001a\u00020\u000bH\u0002¢\u0006\u0004\b\u0007\u0010\u0016J3\u0010\u0007\u001a\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00180\u00022\u0006\u0010\u0011\u001a\u00020\u00102\u0006\u0010\u0014\u001a\u00020\u00132\u0006\u0010\u0017\u001a\u00020\rH\u0002¢\u0006\u0004\b\u0007\u0010\u0019J\u0017\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u001a\u001a\u00020\u0003H\u0002¢\u0006\u0004\b\u0007\u0010\u001bJ-\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u001c\u001a\u00020\u000b2\u0006\u0010\u001a\u001a\u00020\u00032\f\u0010\u001e\u001a\b\u0012\u0004\u0012\u00020\u00030\u001dH\u0002¢\u0006\u0004\b\u0007\u0010\u001fJ3\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u001c\u001a\u00020\r2\f\u0010 \u001a\b\u0012\u0004\u0012\u00020\u00030\u001d2\f\u0010\"\u001a\b\u0012\u0004\u0012\u00020!0\u001dH\u0002¢\u0006\u0004\b\u0007\u0010#J\u001f\u0010\u0007\u001a\u00020\u00062\u0006\u0010$\u001a\u00020\u00102\u0006\u0010\u0014\u001a\u00020\u0013H\u0007¢\u0006\u0004\b\u0007\u0010%J\u0015\u0010\u0007\u001a\u00020\u00062\u0006\u0010'\u001a\u00020&¢\u0006\u0004\b\u0007\u0010(J\u0015\u0010\u0007\u001a\u00020\u00062\u0006\u0010*\u001a\u00020)¢\u0006\u0004\b\u0007\u0010+J#\u0010\u0007\u001a\u00020\u00062\u0006\u0010,\u001a\u00020\u00032\f\u0010-\u001a\b\u0012\u0004\u0012\u00020)0\u001d¢\u0006\u0004\b\u0007\u0010.R\u0014\u00101\u001a\u00020/8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000e\u00100R \u00109\u001a\u0002028\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b3\u00104\u0012\u0004\b7\u00108\u001a\u0004\b5\u00106R\u0018\u0010\n\u001a\u0004\u0018\u00010\t8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b:\u0010;R\u0018\u0010\u0015\u001a\u0004\u0018\u00010\u000b8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b<\u0010=R\u0018\u0010\u0017\u001a\u0004\u0018\u00010\r8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b>\u0010?R\"\u0010\u0005\u001a\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00040\u00028\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b@\u0010AR\"\u0010C\u001a\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00180\u00028\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bB\u0010AR\u001a\u0010G\u001a\b\u0012\u0004\u0012\u00020&0D8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bE\u0010F¨\u0006I"}, d2 = {"Lio/bidmachine/analytics/internal/m;", "", "", "", "Lio/bidmachine/analytics/internal/X;", "monitorTrackerMap", "Lbn/r;", "a", "(Ljava/util/Map;)V", "Lio/bidmachine/analytics/internal/c;", "analyticsDb", "Lio/bidmachine/analytics/internal/V;", "(Lio/bidmachine/analytics/internal/c;)Lio/bidmachine/analytics/internal/V;", "Lio/bidmachine/analytics/internal/l0;", "b", "(Lio/bidmachine/analytics/internal/c;)Lio/bidmachine/analytics/internal/l0;", "Landroid/content/Context;", GAMConfig.KEY_CONTEXT, "(Landroid/content/Context;)Lio/bidmachine/analytics/internal/c;", "Lio/bidmachine/analytics/AnalyticsConfig;", "analyticsConfig", "monitorRepository", "(Lio/bidmachine/analytics/AnalyticsConfig;Lio/bidmachine/analytics/internal/V;)Ljava/util/Map;", "readerRepository", "Lio/bidmachine/analytics/internal/n0;", "(Landroid/content/Context;Lio/bidmachine/analytics/AnalyticsConfig;Lio/bidmachine/analytics/internal/l0;)Ljava/util/Map;", JsonStorageKeyNames.SESSION_ID_KEY, "(Ljava/lang/String;)V", "repository", "", "activeMonitorNameList", "(Lio/bidmachine/analytics/internal/V;Ljava/lang/String;Ljava/util/List;)V", "activeReaderNameList", "Lio/bidmachine/analytics/internal/h0$a;", "activeReaderRuleList", "(Lio/bidmachine/analytics/internal/l0;Ljava/util/List;Ljava/util/List;)V", "applicationContext", "(Landroid/content/Context;Lio/bidmachine/analytics/AnalyticsConfig;)V", "Lio/bidmachine/analytics/internal/Q;", "monitorRecord", "(Lio/bidmachine/analytics/internal/Q;)V", "Lio/bidmachine/analytics/internal/h0;", "readerRecord", "(Lio/bidmachine/analytics/internal/h0;)V", "readerName", "readerRecordList", "(Ljava/lang/String;Ljava/util/List;)V", "Lio/bidmachine/analytics/internal/p0;", "Lio/bidmachine/analytics/internal/p0;", "dispatchers", "Ldo/l0;", "c", "Ldo/l0;", "getScope", "()Ldo/l0;", "getScope$annotations", "()V", "scope", "d", "Lio/bidmachine/analytics/internal/c;", "e", "Lio/bidmachine/analytics/internal/V;", InneractiveMediationDefs.GENDER_FEMALE, "Lio/bidmachine/analytics/internal/l0;", "g", "Ljava/util/Map;", "h", "readerTrackerMap", "", "i", "Ljava/util/List;", "pendingMonitorRecordList", "<init>", "bidmachine-android-sdk_bh_3_3_0"}, k = 1, mv = {1, 7, 1})
public final class C5334m {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final C5334m f68923a = new C5334m();

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
    private static final p0 dispatchers;

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
    private static final p000do.l0 scope;

    /* JADX INFO: renamed from: d, reason: collision with root package name and from kotlin metadata */
    private static C5324c analyticsDb;

    /* JADX INFO: renamed from: e, reason: collision with root package name and from kotlin metadata */
    private static V monitorRepository;

    /* JADX INFO: renamed from: f, reason: collision with root package name and from kotlin metadata */
    private static l0 readerRepository;

    /* JADX INFO: renamed from: g, reason: collision with root package name and from kotlin metadata */
    private static Map<String, X> monitorTrackerMap;

    /* JADX INFO: renamed from: h, reason: collision with root package name and from kotlin metadata */
    private static Map<String, n0> readerTrackerMap;

    /* JADX INFO: renamed from: i, reason: collision with root package name and from kotlin metadata */
    private static final List<MonitorRecord> pendingMonitorRecordList;

    /* JADX INFO: renamed from: io.bidmachine.analytics.internal.m$a */
    @Metadata(bv = {}, d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u008a@"}, d2 = {"Ldo/l0;", "Lbn/r;", "<anonymous>"}, k = 3, mv = {1, 7, 1})
    @jn.d(c = "io.bidmachine.analytics.sdk.tracker.AnalyticsTrackerManager$cleanupMonitorRecords$1", f = "AnalyticsTrackerManager.kt", l = {}, m = "invokeSuspend")
    public static final class a extends SuspendLambda implements sn.p<p000do.l0, hn.c<? super bn.r>, Object> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public int f68932a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final /* synthetic */ V f68933b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final /* synthetic */ String f68934c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public final /* synthetic */ List<String> f68935d;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(V v10, String str, List<String> list, hn.c<? super a> cVar) {
            super(2, cVar);
            this.f68933b = v10;
            this.f68934c = str;
            this.f68935d = list;
        }

        @Override // sn.p
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final Object mo2invoke(p000do.l0 l0Var, hn.c<? super bn.r> cVar) {
            return ((a) create(l0Var, cVar)).invokeSuspend(bn.r.f5635a);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final hn.c<bn.r> create(Object obj, hn.c<?> cVar) {
            return new a(this.f68933b, this.f68934c, this.f68935d, cVar);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            in.a.g();
            if (this.f68932a != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            kotlin.c.b(obj);
            this.f68933b.a(this.f68934c, this.f68935d);
            return bn.r.f5635a;
        }
    }

    /* JADX INFO: renamed from: io.bidmachine.analytics.internal.m$b */
    @Metadata(bv = {}, d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u008a@"}, d2 = {"Ldo/l0;", "Lbn/r;", "<anonymous>"}, k = 3, mv = {1, 7, 1})
    @jn.d(c = "io.bidmachine.analytics.sdk.tracker.AnalyticsTrackerManager$cleanupReaderRecords$1", f = "AnalyticsTrackerManager.kt", l = {}, m = "invokeSuspend")
    public static final class b extends SuspendLambda implements sn.p<p000do.l0, hn.c<? super bn.r>, Object> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public int f68936a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final /* synthetic */ l0 f68937b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final /* synthetic */ List<String> f68938c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public final /* synthetic */ List<ReaderRecord.Rule> f68939d;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public b(l0 l0Var, List<String> list, List<ReaderRecord.Rule> list2, hn.c<? super b> cVar) {
            super(2, cVar);
            this.f68937b = l0Var;
            this.f68938c = list;
            this.f68939d = list2;
        }

        @Override // sn.p
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final Object mo2invoke(p000do.l0 l0Var, hn.c<? super bn.r> cVar) {
            return ((b) create(l0Var, cVar)).invokeSuspend(bn.r.f5635a);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final hn.c<bn.r> create(Object obj, hn.c<?> cVar) {
            return new b(this.f68937b, this.f68938c, this.f68939d, cVar);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            in.a.g();
            if (this.f68936a != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            kotlin.c.b(obj);
            this.f68937b.a(this.f68938c, this.f68939d);
            return bn.r.f5635a;
        }
    }

    static {
        p0 p0VarA = p0.INSTANCE.a();
        dispatchers = p0VarA;
        scope = kotlinx.coroutines.d.a(j2.b(null, 1, null).plus(p0VarA.b()));
        monitorTrackerMap = kotlin.collections.a.j();
        readerTrackerMap = kotlin.collections.a.j();
        pendingMonitorRecordList = Collections.synchronizedList(new ArrayList());
    }

    private C5334m() {
    }

    private final V a(C5324c analyticsDb2) {
        V v10 = monitorRepository;
        if (v10 != null) {
            return v10;
        }
        W w10 = new W(analyticsDb2);
        w10.b();
        monitorRepository = w10;
        return w10;
    }

    private final synchronized C5324c a(Context context) {
        C5324c c5324c;
        c5324c = analyticsDb;
        if (c5324c == null) {
            c5324c = new C5324c(context);
            analyticsDb = c5324c;
        }
        return c5324c;
    }

    private final Map<String, n0> a(Context context, AnalyticsConfig analyticsConfig, l0 readerRepository2) {
        g0.a c5341u;
        n0 n0Var;
        List<ReaderConfig> readerConfigList = analyticsConfig.getReaderConfigList();
        ArrayList arrayList = new ArrayList();
        for (ReaderConfig readerConfig : readerConfigList) {
            String name = readerConfig.getName();
            int iHashCode = name.hashCode();
            if (iHashCode == 2990623) {
                if (name.equals("aexs")) {
                    c5341u = new C5341u();
                    n0Var = new n0(p0.INSTANCE.a(), new n0.a(readerConfig, analyticsConfig.getCom.unity3d.services.core.device.reader.JsonStorageKeyNames.SESSION_ID_KEY java.lang.String(), analyticsConfig.getExtras(), c5341u), readerRepository2);
                }
                n0Var = null;
            } else if (iHashCode == 2997059) {
                if (name.equals("alog")) {
                    c5341u = new E(C5332k.f68912a.a().a());
                    n0Var = new n0(p0.INSTANCE.a(), new n0.a(readerConfig, analyticsConfig.getCom.unity3d.services.core.device.reader.JsonStorageKeyNames.SESSION_ID_KEY java.lang.String(), analyticsConfig.getExtras(), c5341u), readerRepository2);
                }
                n0Var = null;
            } else if (iHashCode != 3001100) {
                if (iHashCode == 92819013 && name.equals("aints")) {
                    c5341u = new C5345y(context.getFilesDir().getParentFile());
                    n0Var = new n0(p0.INSTANCE.a(), new n0.a(readerConfig, analyticsConfig.getCom.unity3d.services.core.device.reader.JsonStorageKeyNames.SESSION_ID_KEY java.lang.String(), analyticsConfig.getExtras(), c5341u), readerRepository2);
                }
                n0Var = null;
            } else {
                if (name.equals("apur")) {
                    c5341u = new c0(C5332k.f68912a.a().b());
                    n0Var = new n0(p0.INSTANCE.a(), new n0.a(readerConfig, analyticsConfig.getCom.unity3d.services.core.device.reader.JsonStorageKeyNames.SESSION_ID_KEY java.lang.String(), analyticsConfig.getExtras(), c5341u), readerRepository2);
                }
                n0Var = null;
            }
            if (n0Var != null) {
                arrayList.add(n0Var);
            }
        }
        LinkedHashMap linkedHashMap = new LinkedHashMap(zn.n.e(cn.p0.f(cn.x.x(arrayList, 10)), 16));
        for (Object obj : arrayList) {
            linkedHashMap.put(((n0) obj).getName(), obj);
        }
        return linkedHashMap;
    }

    private final Map<String, X> a(AnalyticsConfig analyticsConfig, V monitorRepository2) {
        List<MonitorConfig> monitorConfigList = analyticsConfig.getMonitorConfigList();
        ArrayList arrayList = new ArrayList();
        for (Object obj : monitorConfigList) {
            if (((MonitorConfig) obj).getIsReportEnabled()) {
                arrayList.add(obj);
            }
        }
        ArrayList arrayList2 = new ArrayList(cn.x.x(arrayList, 10));
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            arrayList2.add(new X(p0.INSTANCE.a(), new X.b((MonitorConfig) it.next(), analyticsConfig.getCom.unity3d.services.core.device.reader.JsonStorageKeyNames.SESSION_ID_KEY java.lang.String(), analyticsConfig.getExtras()), monitorRepository2));
        }
        LinkedHashMap linkedHashMap = new LinkedHashMap(zn.n.e(cn.p0.f(cn.x.x(arrayList2, 10)), 16));
        for (Object obj2 : arrayList2) {
            linkedHashMap.put(((X) obj2).getName(), obj2);
        }
        return linkedHashMap;
    }

    private final void a(V repository, String sessionId, List<String> activeMonitorNameList) {
        p000do.i.d(scope, dispatchers.c(), null, new a(repository, sessionId, activeMonitorNameList, null), 2, null);
    }

    private final void a(l0 repository, List<String> activeReaderNameList, List<ReaderRecord.Rule> activeReaderRuleList) {
        p000do.i.d(scope, dispatchers.c(), null, new b(repository, activeReaderNameList, activeReaderRuleList, null), 2, null);
    }

    private final void a(String sessionId) {
        List<MonitorRecord> list = pendingMonitorRecordList;
        List listG1 = cn.f0.g1(list);
        list.clear();
        Iterator it = listG1.iterator();
        while (it.hasNext()) {
            f68923a.a(MonitorRecord.a((MonitorRecord) it.next(), null, null, sessionId, 0L, null, null, 59, null));
        }
    }

    private final void a(Map<String, X> monitorTrackerMap2) {
        Iterator<T> it = monitorTrackerMap2.values().iterator();
        while (it.hasNext()) {
            ((X) it.next()).a();
        }
    }

    private final synchronized l0 b(C5324c analyticsDb2) {
        l0 l0Var;
        l0 l0Var2 = readerRepository;
        l0Var = l0Var2;
        if (l0Var2 == null) {
            m0 m0Var = new m0(analyticsDb2);
            m0Var.b();
            readerRepository = m0Var;
            l0Var = m0Var;
        }
        return l0Var;
    }

    public final void a(Context applicationContext, AnalyticsConfig analyticsConfig) {
        synchronized (this) {
            C5334m c5334m = f68923a;
            C5324c c5324cA = c5334m.a(applicationContext);
            V vA = c5334m.a(c5324cA);
            l0 l0VarB = c5334m.b(c5324cA);
            c5334m.a(monitorTrackerMap);
            monitorTrackerMap = c5334m.a(analyticsConfig, vA);
            readerTrackerMap = c5334m.a(applicationContext, analyticsConfig, l0VarB);
            c5334m.a(analyticsConfig.getCom.unity3d.services.core.device.reader.JsonStorageKeyNames.SESSION_ID_KEY java.lang.String());
            String str = analyticsConfig.getCom.unity3d.services.core.device.reader.JsonStorageKeyNames.SESSION_ID_KEY java.lang.String();
            List<MonitorConfig> monitorConfigList = analyticsConfig.getMonitorConfigList();
            ArrayList arrayList = new ArrayList(cn.x.x(monitorConfigList, 10));
            Iterator<T> it = monitorConfigList.iterator();
            while (it.hasNext()) {
                arrayList.add(((MonitorConfig) it.next()).getName());
            }
            c5334m.a(vA, str, arrayList);
            C5334m c5334m2 = f68923a;
            List<ReaderConfig> readerConfigList = analyticsConfig.getReaderConfigList();
            ArrayList arrayList2 = new ArrayList(cn.x.x(readerConfigList, 10));
            Iterator<T> it2 = readerConfigList.iterator();
            while (it2.hasNext()) {
                arrayList2.add(((ReaderConfig) it2.next()).getName());
            }
            List<ReaderConfig> readerConfigList2 = analyticsConfig.getReaderConfigList();
            ArrayList<List> arrayList3 = new ArrayList(cn.x.x(readerConfigList2, 10));
            Iterator<T> it3 = readerConfigList2.iterator();
            while (it3.hasNext()) {
                arrayList3.add(((ReaderConfig) it3.next()).getRules());
            }
            ArrayList arrayList4 = new ArrayList();
            for (List<ReaderConfig.Rule> list : arrayList3) {
                ArrayList arrayList5 = new ArrayList(cn.x.x(list, 10));
                for (ReaderConfig.Rule rule : list) {
                    arrayList5.add(new ReaderRecord.Rule(rule.getTag(), rule.getPath()));
                }
                cn.b0.F(arrayList4, arrayList5);
            }
            c5334m2.a(l0VarB, arrayList2, arrayList4);
            bn.r rVar = bn.r.f5635a;
        }
    }

    public final void a(MonitorRecord monitorRecord) {
        if (tn.p.f(monitorRecord.getSessionId(), "")) {
            pendingMonitorRecordList.add(monitorRecord);
            return;
        }
        X x10 = monitorTrackerMap.get(monitorRecord.getName());
        if (x10 != null) {
            x10.b(monitorRecord);
        }
    }

    public final void a(ReaderRecord readerRecord) {
        a(readerRecord.getName(), cn.v.e(readerRecord));
    }

    public final void a(String readerName, List<ReaderRecord> readerRecordList) {
        n0 n0Var = readerTrackerMap.get(readerName);
        if (n0Var != null) {
            n0Var.b(readerName, readerRecordList);
        }
    }
}
