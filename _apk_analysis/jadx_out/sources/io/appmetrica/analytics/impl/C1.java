package io.appmetrica.analytics.impl;

import android.content.Context;
import android.content.Intent;
import android.content.res.Configuration;
import android.net.Uri;
import android.os.Bundle;
import android.text.TextUtils;
import androidx.annotation.MainThread;
import androidx.annotation.NonNull;
import androidx.annotation.WorkerThread;
import io.appmetrica.analytics.AppMetrica;
import io.appmetrica.analytics.coreapi.internal.executors.IHandlerExecutor;
import io.appmetrica.analytics.coreutils.internal.executors.BlockingExecutor;
import io.appmetrica.analytics.coreutils.internal.io.FileUtils;
import io.appmetrica.analytics.internal.CounterConfiguration;
import io.appmetrica.analytics.ndkcrashesapi.internal.NativeCrash;
import io.appmetrica.analytics.ndkcrashesapi.internal.NativeCrashServiceConfig;
import io.appmetrica.analytics.networktasks.internal.NetworkServiceLocator;
import java.io.File;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Objects;

/* JADX INFO: loaded from: classes4.dex */
public final class C1 implements B1, InterfaceC5098s0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public boolean f65077a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Context f65078b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final A1 f65079c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final C4670b4 f65080d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final K1 f65081e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public Tg f65082f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final C4779fa f65083g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final C4823h2 f65084h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final D1 f65085i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final C4760eh f65086j;

    @MainThread
    public C1(@NonNull Context context, @NonNull A1 a12) {
        this(context, a12, new C4748e5(context));
    }

    public C1(Context context, A1 a12, C4670b4 c4670b4, K1 k12, C4779fa c4779fa, C4823h2 c4823h2, D1 d12) {
        this.f65077a = false;
        this.f65078b = context;
        this.f65079c = a12;
        this.f65080d = c4670b4;
        this.f65081e = k12;
        this.f65083g = c4779fa;
        this.f65084h = c4823h2;
        this.f65085i = d12;
        this.f65086j = new C4760eh();
    }

    public C1(Context context, A1 a12, C4748e5 c4748e5) {
        this(context, a12, new C4670b4(context, c4748e5), new K1(), C4779fa.f66768d, C5009oa.k().e(), new D1());
    }

    public final void a() {
        this.f65081e.c(new J1() { // from class: mh.a
            @Override // io.appmetrica.analytics.impl.J1
            public final void a(Intent intent) {
                this.f74249a.d(intent);
            }
        });
    }

    @Override // io.appmetrica.analytics.impl.B1
    @WorkerThread
    public final void a(Intent intent) {
        K1 k12 = this.f65081e;
        if (intent == null) {
            k12.getClass();
            return;
        }
        k12.getClass();
        String action = intent.getAction();
        if (!TextUtils.isEmpty(action)) {
            k12.f65457a.a(action, Integer.valueOf(K1.a(intent)));
        }
        for (Map.Entry entry : k12.f65458b.entrySet()) {
            J1 j12 = (J1) entry.getKey();
            if (((I1) entry.getValue()).a(intent)) {
                j12.a(intent);
            }
        }
    }

    @Override // io.appmetrica.analytics.impl.B1
    @WorkerThread
    public final void a(Intent intent, int i10) {
        ((C5148u0) this.f65079c).f67757a.stopSelf(i10);
    }

    @Override // io.appmetrica.analytics.impl.B1
    @WorkerThread
    public final void a(Intent intent, int i10, int i11) {
        ((C5148u0) this.f65079c).f67757a.stopSelf(i11);
    }

    @WorkerThread
    public final void a(Bundle bundle) {
        bundle.setClassLoader(CounterConfiguration.class.getClassLoader());
        Q5.b(bundle);
        Tg tg2 = this.f65082f;
        if (tg2 != null) {
            tg2.a(Q5.b(bundle), bundle);
        }
    }

    @Override // io.appmetrica.analytics.impl.B1
    @WorkerThread
    public final void b(Intent intent) {
        this.f65081e.d(intent);
        if (intent != null) {
            String action = intent.getAction();
            Uri data = intent.getData();
            String encodedAuthority = data == null ? null : data.getEncodedAuthority();
            if (!"io.appmetrica.analytics.IAppMetricaService".equals(action) || encodedAuthority == null || data == null || !Objects.equals(data.getPath(), "/client")) {
                return;
            }
            int i10 = Integer.parseInt(data.getQueryParameter("pid"));
            this.f65080d.a(encodedAuthority, Integer.valueOf(i10), data.getQueryParameter("psid"));
            this.f65084h.a(i10);
        }
    }

    @Override // io.appmetrica.analytics.impl.B1
    @WorkerThread
    public final void c(Intent intent) {
        K1 k12 = this.f65081e;
        if (intent == null) {
            k12.getClass();
            return;
        }
        k12.getClass();
        String action = intent.getAction();
        if (!TextUtils.isEmpty(action)) {
            k12.f65457a.a(action, Integer.valueOf(K1.a(intent)));
        }
        for (Map.Entry entry : k12.f65458b.entrySet()) {
            J1 j12 = (J1) entry.getKey();
            if (((I1) entry.getValue()).a(intent)) {
                j12.a(intent);
            }
        }
    }

    public final void d(Intent intent) {
        C5009oa.I.v().a(AbstractC4832hb.e(intent.getStringExtra("screen_size")));
    }

    @Override // io.appmetrica.analytics.impl.B1
    @WorkerThread
    public final void onConfigurationChanged(@NonNull Configuration configuration) {
        C5009oa.I.v().a(configuration);
    }

    @Override // io.appmetrica.analytics.impl.B1
    @WorkerThread
    public final void onCreate() {
        if (this.f65077a) {
            C5009oa.I.v().a(this.f65078b.getResources().getConfiguration());
        } else {
            this.f65083g.b(this.f65078b);
            C5009oa c5009oa = C5009oa.I;
            synchronized (c5009oa) {
                c5009oa.B.initAsync();
                c5009oa.f67438u.a(c5009oa.f67418a);
                c5009oa.f67438u.a(new C4922ko(c5009oa.B));
                NetworkServiceLocator.init(new C4800g5(new C5067qi(c5009oa.h()), new C5054q5(c5009oa.f67418a)));
                c5009oa.l().a(c5009oa.f67434q);
                c5009oa.E();
            }
            Xj.f66181a.e();
            C4868im c4868im = C5009oa.I.f67438u;
            c4868im.b();
            C4817gm c4817gmB = c4868im.b();
            C5268yk c5268ykP = C5009oa.I.p();
            c5268ykP.a(new C4738dk(new C4679bd(this.f65081e)), c4817gmB);
            c4868im.a(c5268ykP);
            ((Bl) C5009oa.I.z()).getClass();
            a();
            C5009oa.I.m().init();
            C5009oa.I.c().init();
            D1 d12 = this.f65085i;
            Context context = this.f65078b;
            C4670b4 c4670b4 = this.f65080d;
            d12.getClass();
            this.f65082f = new Tg(context, c4670b4);
            Context context2 = this.f65078b;
            AbstractC5174v1.f67799a.b(context2);
            AppMetrica.getReporter(context2, "20799a27-fa80-4b36-b2db-0f8141f24180");
            Context context3 = this.f65078b;
            Tg tg2 = this.f65082f;
            Pd pdR = C5009oa.k().r();
            IHandlerExecutor iHandlerExecutorD = C5009oa.k().w().d();
            C4827h6 c4827h6 = new C4827h6(context3, tg2, EnumC4703cb.EVENT_TYPE_PREV_SESSION_EXCEPTION_UNHANDLED_FROM_FILE, new X(), new BlockingExecutor(), "previous");
            C4827h6 c4827h62 = new C4827h6(context3, tg2, EnumC4703cb.EVENT_TYPE_EXCEPTION_UNHANDLED_FROM_FILE, new C4985nb(), iHandlerExecutorD, "actual");
            File crashesDirectory = FileUtils.getCrashesDirectory(context3);
            if (crashesDirectory != null) {
                FileObserverC4775f6 fileObserverC4775f6 = new FileObserverC4775f6(crashesDirectory, c4827h62, new C4676ba());
                iHandlerExecutorD.execute(new Vf(crashesDirectory, c4827h6));
                if (!crashesDirectory.exists()) {
                    crashesDirectory.mkdir();
                } else if (!crashesDirectory.isDirectory() && crashesDirectory.delete()) {
                    crashesDirectory.mkdir();
                }
                fileObserverC4775f6.startWatching();
                C5009oa.I.E.storeReference(fileObserverC4775f6);
            }
            pdR.getClass();
            File nativeCrashDirectory = FileUtils.getNativeCrashDirectory(context3);
            String absolutePath = nativeCrashDirectory != null ? nativeCrashDirectory.getAbsolutePath() : null;
            if (absolutePath != null) {
                pdR.f65746a.init(context3, new NativeCrashServiceConfig(absolutePath));
                List<NativeCrash> allCrashes = pdR.f65746a.getAllCrashes();
                if (!allCrashes.isEmpty()) {
                    Kd kdB = pdR.f65747b.b(context3, tg2);
                    Iterator<T> it = allCrashes.iterator();
                    while (it.hasNext()) {
                        kdB.newCrash((NativeCrash) it.next());
                    }
                }
                pdR.f65746a.setDefaultCrashHandler(pdR.f65747b.a(context3, tg2));
            }
            new J5(cn.v.e(new Zg())).run();
            this.f65077a = true;
        }
        C5009oa.I.l().a();
    }

    @Override // io.appmetrica.analytics.impl.B1
    @MainThread
    public final void onDestroy() {
        Gb gbL = C5009oa.I.l();
        synchronized (gbL) {
            Iterator it = gbL.f65279c.iterator();
            while (it.hasNext()) {
                ((InterfaceC4969mk) it.next()).onDestroy();
            }
        }
    }

    @Override // io.appmetrica.analytics.impl.B1
    @WorkerThread
    public final void pauseUserSession(@NonNull Bundle bundle) {
        Cf cf2;
        bundle.setClassLoader(Cf.class.getClassLoader());
        String str = Cf.f65117c;
        try {
            cf2 = (Cf) bundle.getParcelable("PROCESS_CFG_OBJ");
        } catch (Throwable unused) {
            cf2 = null;
        }
        Integer asInteger = cf2 != null ? cf2.f65118a.getAsInteger("PROCESS_CFG_PROCESS_ID") : null;
        if (asInteger != null) {
            this.f65084h.b(asInteger.intValue());
        }
    }

    @Override // io.appmetrica.analytics.impl.B1
    @WorkerThread
    public final void reportData(int i10, Bundle bundle) {
        this.f65086j.getClass();
        List listM = (List) C5009oa.I.f67439v.f66794a.get(Integer.valueOf(i10));
        if (listM == null) {
            listM = cn.w.m();
        }
        if (listM.isEmpty()) {
            return;
        }
        Iterator it = listM.iterator();
        while (it.hasNext()) {
            ((InterfaceC4763ek) it.next()).reportData(i10, bundle);
        }
    }

    @Override // io.appmetrica.analytics.impl.B1
    @WorkerThread
    public final void resumeUserSession(@NonNull Bundle bundle) {
        Cf cf2;
        bundle.setClassLoader(Cf.class.getClassLoader());
        String str = Cf.f65117c;
        try {
            cf2 = (Cf) bundle.getParcelable("PROCESS_CFG_OBJ");
        } catch (Throwable unused) {
            cf2 = null;
        }
        Integer asInteger = cf2 != null ? cf2.f65118a.getAsInteger("PROCESS_CFG_PROCESS_ID") : null;
        if (asInteger != null) {
            this.f65084h.c(asInteger.intValue());
        }
    }
}
