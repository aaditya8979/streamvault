package io.bidmachine.analytics.internal;

import android.content.Context;
import androidx.core.app.NotificationCompat;
import com.unity3d.services.core.device.reader.JsonStorageKeyNames;
import io.bidmachine.ads.networks.gam_dynamic.GAMConfig;
import io.bidmachine.analytics.AnalyticsConfig;
import io.bidmachine.analytics.MonitorConfig;
import io.bidmachine.analytics.ReaderConfig;
import io.bidmachine.analytics.internal.AbstractC5326e;
import io.bidmachine.analytics.internal.AbstractC5328g;
import io.bidmachine.analytics.internal.AbstractC5330i;
import io.bidmachine.analytics.internal.InterfaceC5329h;
import io.bidmachine.analytics.internal.ReaderRecord;
import io.bidmachine.analytics.internal.TrackerError;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.atomic.AtomicBoolean;
import kotlin.Metadata;
import kotlin.Result;

/* JADX INFO: renamed from: io.bidmachine.analytics.internal.k, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes2.dex */
@Metadata(bv = {}, d1 = {"\u0000p\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0010#\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\"\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0003\n\u0002\b\u0007\n\u0002\u0010$\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0007\bÀ\u0002\u0018\u00002\u00020\u0001:\u0002\n\u0013B\t\b\u0002¢\u0006\u0004\b2\u00103J3\u0010\n\u001a\u00020\t2\u0006\u0010\u0003\u001a\u00020\u00022\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u00042\f\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00020\u0007H\u0002¢\u0006\u0004\b\n\u0010\u000bJ+\u0010\n\u001a\u00020\t2\f\u0010\r\u001a\b\u0012\u0004\u0012\u00020\f0\u00042\f\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00020\u0007H\u0002¢\u0006\u0004\b\n\u0010\u000eJ-\u0010\u0013\u001a\u00020\t2\u0006\u0010\u0010\u001a\u00020\u000f2\u0006\u0010\u0003\u001a\u00020\u00022\f\u0010\u0012\u001a\b\u0012\u0004\u0012\u00020\u00020\u0011H\u0002¢\u0006\u0004\b\u0013\u0010\u0014J-\u0010\n\u001a\u00020\t2\u0006\u0010\u0010\u001a\u00020\u000f2\u0006\u0010\u0003\u001a\u00020\u00022\f\u0010\u0012\u001a\b\u0012\u0004\u0012\u00020\u00020\u0011H\u0002¢\u0006\u0004\b\n\u0010\u0014J+\u0010\n\u001a\u00020\t2\n\u0010\u0016\u001a\u0006\u0012\u0002\b\u00030\u00152\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0018\u001a\u00020\u0017H\u0002¢\u0006\u0004\b\n\u0010\u0019J'\u0010\n\u001a\u00020\t2\u0006\u0010\u001a\u001a\u00020\u00022\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0018\u001a\u00020\u0017H\u0002¢\u0006\u0004\b\n\u0010\u001bJ\u001f\u0010\n\u001a\u00020\t2\u0006\u0010\u001a\u001a\u00020\u00022\u0006\u0010\u0018\u001a\u00020\u0017H\u0002¢\u0006\u0004\b\n\u0010\u001cJ\u0015\u0010\u0013\u001a\u00020\t2\u0006\u0010\u001d\u001a\u00020\u000f¢\u0006\u0004\b\u0013\u0010\u001eJ'\u0010\n\u001a\u0012\u0012\u0004\u0012\u00020\u0002\u0012\b\u0012\u0006\u0012\u0002\b\u00030\u00150\u001f2\u0006\u0010\u001d\u001a\u00020\u000fH\u0001¢\u0006\u0004\b\n\u0010 J\u001d\u0010\n\u001a\u00020\t2\u0006\u0010\u001d\u001a\u00020\u000f2\u0006\u0010\"\u001a\u00020!¢\u0006\u0004\b\n\u0010#J-\u0010\n\u001a\u001a\u0012\u0004\u0012\u00020\u0002\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00010\u001f0\u001f2\u0006\u0010%\u001a\u00020$¢\u0006\u0004\b\n\u0010&R\u0014\u0010)\u001a\u00020'8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0013\u0010(R&\u0010,\u001a\u0012\u0012\u0004\u0012\u00020\u0002\u0012\b\u0012\u0006\u0012\u0002\b\u00030\u00150\u001f8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b*\u0010+R\u001a\u00101\u001a\u00020-8\u0000X\u0080\u0004¢\u0006\f\n\u0004\b.\u0010/\u001a\u0004\b\n\u00100¨\u00064"}, d2 = {"Lio/bidmachine/analytics/internal/k;", "", "", JsonStorageKeyNames.SESSION_ID_KEY, "", "Lio/bidmachine/analytics/MonitorConfig;", "monitorConfigList", "", "toEnableServiceNameSet", "Lbn/r;", "a", "(Ljava/lang/String;Ljava/util/List;Ljava/util/Set;)V", "Lio/bidmachine/analytics/ReaderConfig;", "readerConfigList", "(Ljava/util/List;Ljava/util/Set;)V", "Landroid/content/Context;", GAMConfig.KEY_CONTEXT, "", "serviceNameSet", "b", "(Landroid/content/Context;Ljava/lang/String;Ljava/util/Set;)V", "Lio/bidmachine/analytics/internal/j;", NotificationCompat.CATEGORY_SERVICE, "", "error", "(Lio/bidmachine/analytics/internal/j;Ljava/lang/String;Ljava/lang/Throwable;)V", "serviceName", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)V", "(Ljava/lang/String;Ljava/lang/Throwable;)V", "applicationContext", "(Landroid/content/Context;)V", "", "(Landroid/content/Context;)Ljava/util/Map;", "Lio/bidmachine/analytics/AnalyticsConfig;", "analyticsConfig", "(Landroid/content/Context;Lio/bidmachine/analytics/AnalyticsConfig;)V", "Lio/bidmachine/analytics/internal/e$a;", "adType", "(Lio/bidmachine/analytics/internal/e$a;)Ljava/util/Map;", "Ljava/util/concurrent/atomic/AtomicBoolean;", "Ljava/util/concurrent/atomic/AtomicBoolean;", "IS_INITIALIZED", "c", "Ljava/util/Map;", "analyticsServices", "Lio/bidmachine/analytics/internal/l;", "d", "Lio/bidmachine/analytics/internal/l;", "()Lio/bidmachine/analytics/internal/l;", "storages", "<init>", "()V", "bidmachine-android-sdk_bh_3_3_0"}, k = 1, mv = {1, 7, 1})
public final class C5332k {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final C5332k f68912a = new C5332k();

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
    private static final AtomicBoolean IS_INITIALIZED = new AtomicBoolean(false);

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
    private static Map<String, ? extends AbstractC5331j<?>> analyticsServices = kotlin.collections.a.j();

    /* JADX INFO: renamed from: d, reason: collision with root package name and from kotlin metadata */
    private static final C5333l storages = new C5333l();

    /* JADX INFO: renamed from: io.bidmachine.analytics.internal.k$a */
    @Metadata(bv = {}, d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010$\n\u0002\u0010\u000e\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\t\b\u0002\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\r\u001a\u00020\u0003\u0012\u0006\u0010\u000f\u001a\u00020\u0003¢\u0006\u0004\b\u0010\u0010\u0011J#\u0010\u0007\u001a\u00020\u00062\u0012\u0010\u0005\u001a\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00040\u0002H\u0016¢\u0006\u0004\b\u0007\u0010\bJ\u0017\u0010\u0007\u001a\u00020\u00062\u0006\u0010\n\u001a\u00020\tH\u0016¢\u0006\u0004\b\u0007\u0010\u000bR\u0014\u0010\r\u001a\u00020\u00038\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0007\u0010\fR\u0014\u0010\u000f\u001a\u00020\u00038\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000e\u0010\f¨\u0006\u0012"}, d2 = {"Lio/bidmachine/analytics/internal/k$a;", "Lio/bidmachine/analytics/internal/f;", "", "", "", "data", "Lbn/r;", "a", "(Ljava/util/Map;)V", "Lio/bidmachine/analytics/internal/q0;", "error", "(Lio/bidmachine/analytics/internal/q0;)V", "Ljava/lang/String;", "name", "b", JsonStorageKeyNames.SESSION_ID_KEY, "<init>", "(Ljava/lang/String;Ljava/lang/String;)V", "bidmachine-android-sdk_bh_3_3_0"}, k = 1, mv = {1, 7, 1})
    public static final class a implements InterfaceC5327f {

        /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
        private final String name;

        /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
        private final String sessionId;

        public a(String str, String str2) {
            this.name = str;
            this.sessionId = str2;
        }

        @Override // io.bidmachine.analytics.internal.InterfaceC5327f
        public void a(TrackerError error) {
            C5334m.f68923a.a(new MonitorRecord(null, this.name, this.sessionId, 0L, null, error, 25, null));
        }

        @Override // io.bidmachine.analytics.internal.InterfaceC5327f
        public void a(Map<String, ? extends Object> data) {
            C5334m.f68923a.a(new MonitorRecord(null, this.name, this.sessionId, 0L, data, null, 41, null));
        }
    }

    /* JADX INFO: renamed from: io.bidmachine.analytics.internal.k$b */
    @Metadata(bv = {}, d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0005\b\u0002\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\n\u001a\u00020\b¢\u0006\u0004\b\u000b\u0010\fJ\u001d\u0010\u0006\u001a\u00020\u00052\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002H\u0016¢\u0006\u0004\b\u0006\u0010\u0007R\u0014\u0010\n\u001a\u00020\b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0006\u0010\t¨\u0006\r"}, d2 = {"Lio/bidmachine/analytics/internal/k$b;", "Lio/bidmachine/analytics/internal/h;", "", "Lio/bidmachine/analytics/internal/h$a;", "dataList", "Lbn/r;", "a", "(Ljava/util/List;)V", "", "Ljava/lang/String;", "name", "<init>", "(Ljava/lang/String;)V", "bidmachine-android-sdk_bh_3_3_0"}, k = 1, mv = {1, 7, 1})
    public static final class b implements InterfaceC5329h {

        /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
        private final String name;

        public b(String str) {
            this.name = str;
        }

        @Override // io.bidmachine.analytics.internal.InterfaceC5329h
        public void a(List<InterfaceC5329h.Data> dataList) {
            ArrayList arrayList = new ArrayList(cn.x.x(dataList, 10));
            for (InterfaceC5329h.Data data : dataList) {
                String str = this.name;
                String dataHash = data.getDataHash();
                if (dataHash == null) {
                    dataHash = "";
                }
                arrayList.add(new ReaderRecord(null, str, 0L, dataHash, new ReaderRecord.Rule(data.getRule().getTag(), data.getRule().getPath()), data.getError(), false, 69, null));
            }
            C5334m.f68923a.a(this.name, arrayList);
        }
    }

    private C5332k() {
    }

    private final void a(Context context, String sessionId, Set<String> serviceNameSet) {
        Object objM7534constructorimpl;
        Context applicationContext = context.getApplicationContext();
        Iterator<T> it = serviceNameSet.iterator();
        while (it.hasNext()) {
            AbstractC5331j<?> abstractC5331j = analyticsServices.get((String) it.next());
            if (abstractC5331j != null) {
                try {
                    Result.a aVar = Result.Companion;
                    abstractC5331j.b(applicationContext);
                    objM7534constructorimpl = Result.m7534constructorimpl(bn.r.f5635a);
                } catch (Throwable th2) {
                    Result.a aVar2 = Result.Companion;
                    objM7534constructorimpl = Result.m7534constructorimpl(kotlin.c.a(th2));
                }
                Throwable thM7537exceptionOrNullimpl = Result.m7537exceptionOrNullimpl(objM7534constructorimpl);
                if (thM7537exceptionOrNullimpl != null) {
                    f68912a.a(abstractC5331j, sessionId, thM7537exceptionOrNullimpl);
                }
            }
        }
    }

    private final void a(AbstractC5331j<?> service, String sessionId, Throwable error) {
        if (service instanceof AbstractC5328g) {
            a(service.getName(), sessionId, error);
        } else if (service instanceof AbstractC5330i) {
            a(service.getName(), error);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void a(String serviceName, String sessionId, Throwable error) {
        C5334m.f68923a.a(new MonitorRecord(null, serviceName, sessionId, 0L, null, new TrackerError(serviceName, TrackerError.a.MONITOR_INVALID, s0.a(error)), 25, null));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void a(String serviceName, Throwable error) {
        C5334m.f68923a.a(new ReaderRecord(null, serviceName, 0L, "", new ReaderRecord.Rule("", ""), new TrackerError(serviceName, TrackerError.a.READER_INVALID, s0.a(error)), false, 69, null));
    }

    private final void a(String sessionId, List<MonitorConfig> monitorConfigList, Set<String> toEnableServiceNameSet) {
        Object objM7534constructorimpl;
        bn.r rVar;
        Iterator<MonitorConfig> it = monitorConfigList.iterator();
        while (it.hasNext()) {
            String name = it.next().getName();
            try {
                Result.a aVar = Result.Companion;
                AbstractC5331j<?> abstractC5331j = analyticsServices.get(name);
                if (abstractC5331j != null) {
                    if (abstractC5331j instanceof AbstractC5328g) {
                        ((AbstractC5328g) abstractC5331j).a(new AbstractC5328g.a(new a(name, sessionId)));
                    }
                    rVar = bn.r.f5635a;
                } else {
                    rVar = null;
                }
                objM7534constructorimpl = Result.m7534constructorimpl(rVar);
            } catch (Throwable th2) {
                Result.a aVar2 = Result.Companion;
                objM7534constructorimpl = Result.m7534constructorimpl(kotlin.c.a(th2));
            }
            if (Result.m7540isSuccessimpl(objM7534constructorimpl)) {
                toEnableServiceNameSet.add(name);
            }
            Throwable thM7537exceptionOrNullimpl = Result.m7537exceptionOrNullimpl(objM7534constructorimpl);
            if (thM7537exceptionOrNullimpl != null) {
                f68912a.a(name, sessionId, thM7537exceptionOrNullimpl);
            }
        }
    }

    private final void a(List<ReaderConfig> readerConfigList, Set<String> toEnableServiceNameSet) {
        Object objM7534constructorimpl;
        bn.r rVar;
        for (ReaderConfig readerConfig : readerConfigList) {
            String name = readerConfig.getName();
            try {
                Result.a aVar = Result.Companion;
                AbstractC5331j<?> abstractC5331j = analyticsServices.get(name);
                if (abstractC5331j != null) {
                    if (abstractC5331j instanceof AbstractC5330i) {
                        ((AbstractC5330i) abstractC5331j).a(new AbstractC5330i.a(readerConfig.getInterval(), readerConfig.getRules(), new b(name)));
                    }
                    rVar = bn.r.f5635a;
                } else {
                    rVar = null;
                }
                objM7534constructorimpl = Result.m7534constructorimpl(rVar);
            } catch (Throwable th2) {
                Result.a aVar2 = Result.Companion;
                objM7534constructorimpl = Result.m7534constructorimpl(kotlin.c.a(th2));
            }
            if (Result.m7540isSuccessimpl(objM7534constructorimpl)) {
                toEnableServiceNameSet.add(name);
            }
            Throwable thM7537exceptionOrNullimpl = Result.m7537exceptionOrNullimpl(objM7534constructorimpl);
            if (thM7537exceptionOrNullimpl != null) {
                f68912a.a(name, thM7537exceptionOrNullimpl);
            }
        }
    }

    private final void b(Context context, String sessionId, Set<String> serviceNameSet) {
        Object objM7534constructorimpl;
        Context applicationContext = context.getApplicationContext();
        Iterator<T> it = serviceNameSet.iterator();
        while (it.hasNext()) {
            AbstractC5331j<?> abstractC5331j = analyticsServices.get((String) it.next());
            if (abstractC5331j != null) {
                try {
                    Result.a aVar = Result.Companion;
                    abstractC5331j.c(applicationContext);
                    objM7534constructorimpl = Result.m7534constructorimpl(bn.r.f5635a);
                } catch (Throwable th2) {
                    Result.a aVar2 = Result.Companion;
                    objM7534constructorimpl = Result.m7534constructorimpl(kotlin.c.a(th2));
                }
                Throwable thM7537exceptionOrNullimpl = Result.m7537exceptionOrNullimpl(objM7534constructorimpl);
                if (thM7537exceptionOrNullimpl != null) {
                    f68912a.a(abstractC5331j, sessionId, thM7537exceptionOrNullimpl);
                }
            }
        }
    }

    public final C5333l a() {
        return storages;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final Map<String, AbstractC5331j<?>> a(Context applicationContext) {
        Object objM7534constructorimpl;
        Object objM7534constructorimpl2;
        Object objM7534constructorimpl3;
        Object objM7534constructorimpl4;
        Object objM7534constructorimpl5;
        Object objM7534constructorimpl6;
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        try {
            Result.a aVar = Result.Companion;
            O o10 = new O();
            o10.a(applicationContext);
            linkedHashMap.put(o10.getName(), o10);
            objM7534constructorimpl = Result.m7534constructorimpl(bn.r.f5635a);
        } catch (Throwable th2) {
            Result.a aVar2 = Result.Companion;
            objM7534constructorimpl = Result.m7534constructorimpl(kotlin.c.a(th2));
        }
        Throwable thM7537exceptionOrNullimpl = Result.m7537exceptionOrNullimpl(objM7534constructorimpl);
        if (thM7537exceptionOrNullimpl != null) {
            f68912a.a("mimp", "", thM7537exceptionOrNullimpl);
        }
        try {
            A a10 = new A();
            a10.a(applicationContext);
            linkedHashMap.put(a10.getName(), a10);
            objM7534constructorimpl2 = Result.m7534constructorimpl(bn.r.f5635a);
        } catch (Throwable th3) {
            Result.a aVar3 = Result.Companion;
            objM7534constructorimpl2 = Result.m7534constructorimpl(kotlin.c.a(th3));
        }
        Throwable thM7537exceptionOrNullimpl2 = Result.m7537exceptionOrNullimpl(objM7534constructorimpl2);
        if (thM7537exceptionOrNullimpl2 != null) {
            f68912a.a("isimp", "", thM7537exceptionOrNullimpl2);
        }
        try {
            C5346z c5346z = new C5346z(applicationContext.getFilesDir().getParentFile());
            c5346z.a(applicationContext);
            linkedHashMap.put(c5346z.getName(), c5346z);
            objM7534constructorimpl3 = Result.m7534constructorimpl(bn.r.f5635a);
        } catch (Throwable th4) {
            Result.a aVar4 = Result.Companion;
            objM7534constructorimpl3 = Result.m7534constructorimpl(kotlin.c.a(th4));
        }
        Throwable thM7537exceptionOrNullimpl3 = Result.m7537exceptionOrNullimpl(objM7534constructorimpl3);
        if (thM7537exceptionOrNullimpl3 != null) {
            f68912a.a("aints", thM7537exceptionOrNullimpl3);
        }
        try {
            C5342v c5342v = new C5342v();
            c5342v.a(applicationContext);
            linkedHashMap.put(c5342v.getName(), c5342v);
            objM7534constructorimpl4 = Result.m7534constructorimpl(bn.r.f5635a);
        } catch (Throwable th5) {
            Result.a aVar5 = Result.Companion;
            objM7534constructorimpl4 = Result.m7534constructorimpl(kotlin.c.a(th5));
        }
        Throwable thM7537exceptionOrNullimpl4 = Result.m7537exceptionOrNullimpl(objM7534constructorimpl4);
        if (thM7537exceptionOrNullimpl4 != null) {
            f68912a.a("aexs", thM7537exceptionOrNullimpl4);
        }
        int i10 = 2;
        sn.l lVar = null;
        Object[] objArr = 0;
        try {
            H h10 = new H(storages.a(), null, 2, null);
            h10.a(applicationContext);
            linkedHashMap.put(h10.getName(), h10);
            objM7534constructorimpl5 = Result.m7534constructorimpl(bn.r.f5635a);
        } catch (Throwable th6) {
            Result.a aVar6 = Result.Companion;
            objM7534constructorimpl5 = Result.m7534constructorimpl(kotlin.c.a(th6));
        }
        Throwable thM7537exceptionOrNullimpl5 = Result.m7537exceptionOrNullimpl(objM7534constructorimpl5);
        if (thM7537exceptionOrNullimpl5 != null) {
            f68912a.a("alog", thM7537exceptionOrNullimpl5);
        }
        try {
            d0 d0Var = new d0(storages.b(), lVar, i10, objArr == true ? 1 : 0);
            d0Var.a(applicationContext);
            linkedHashMap.put(d0Var.getName(), d0Var);
            objM7534constructorimpl6 = Result.m7534constructorimpl(bn.r.f5635a);
        } catch (Throwable th7) {
            Result.a aVar7 = Result.Companion;
            objM7534constructorimpl6 = Result.m7534constructorimpl(kotlin.c.a(th7));
        }
        Throwable thM7537exceptionOrNullimpl6 = Result.m7537exceptionOrNullimpl(objM7534constructorimpl6);
        if (thM7537exceptionOrNullimpl6 != null) {
            f68912a.a("apur", thM7537exceptionOrNullimpl6);
        }
        return linkedHashMap;
    }

    public final Map<String, Map<String, Object>> a(AbstractC5326e.a adType) {
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        for (Map.Entry<String, ? extends AbstractC5331j<?>> entry : analyticsServices.entrySet()) {
            String key = entry.getKey();
            AbstractC5331j<?> value = entry.getValue();
            if (value instanceof AbstractC5326e) {
                LinkedHashMap linkedHashMap2 = new LinkedHashMap();
                AbstractC5326e abstractC5326e = (AbstractC5326e) value;
                AbstractC5326e.b bVarB = abstractC5326e.b();
                if (bVarB != null) {
                    linkedHashMap2.put("imd", Integer.valueOf(bVarB.getCount()));
                    linkedHashMap2.put("wp", Float.valueOf(bVarB.getCpm()));
                    linkedHashMap2.put("agency", bVarB.getNetworkName());
                }
                AbstractC5326e.b bVarA = abstractC5326e.a(adType);
                if (bVarA != null) {
                    linkedHashMap2.put("imimd", Integer.valueOf(bVarA.getCount()));
                    linkedHashMap2.put("imwp", Float.valueOf(bVarA.getCpm()));
                    linkedHashMap2.put("imagency", bVarA.getNetworkName());
                }
                linkedHashMap.put(key, linkedHashMap2);
            }
        }
        return linkedHashMap;
    }

    public final void a(Context applicationContext, AnalyticsConfig analyticsConfig) {
        a(applicationContext, analyticsConfig.getCom.unity3d.services.core.device.reader.JsonStorageKeyNames.SESSION_ID_KEY java.lang.String(), analyticsServices.keySet());
        HashSet hashSet = new HashSet();
        a(analyticsConfig.getCom.unity3d.services.core.device.reader.JsonStorageKeyNames.SESSION_ID_KEY java.lang.String(), analyticsConfig.getMonitorConfigList(), hashSet);
        a(analyticsConfig.getReaderConfigList(), hashSet);
        b(applicationContext, analyticsConfig.getCom.unity3d.services.core.device.reader.JsonStorageKeyNames.SESSION_ID_KEY java.lang.String(), hashSet);
    }

    public final void b(Context applicationContext) {
        if (IS_INITIALIZED.compareAndSet(false, true) && !s0.a(applicationContext)) {
            analyticsServices = a(applicationContext);
        }
    }
}
