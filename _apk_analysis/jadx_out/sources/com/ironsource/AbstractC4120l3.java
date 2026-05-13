package com.ironsource;

import android.app.Activity;
import com.ironsource.AbstractC4138m3;
import com.ironsource.AbstractC4158n3;
import com.ironsource.environment.ContextProvider;
import com.ironsource.mediationsdk.adunit.adapter.internal.listener.AdapterAdInteractionListener;
import com.ironsource.mediationsdk.h;
import com.ironsource.mediationsdk.logger.IronLog;
import com.ironsource.mediationsdk.logger.IronSourceError;
import com.ironsource.mediationsdk.utils.ErrorBuilder;
import com.ironsource.mediationsdk.utils.IronSourceUtils;
import io.appmetrica.analytics.coreutils.internal.StringUtils;
import java.util.Iterator;
import java.util.List;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: renamed from: com.ironsource.l3, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes11.dex */
public abstract class AbstractC4120l3<Smash extends AbstractC4138m3<?>, Listener extends AdapterAdInteractionListener> extends AbstractC4158n3<Smash, Listener> implements J0 {

    /* JADX INFO: renamed from: com.ironsource.l3$a */
    public class a extends AbstractRunnableC4078ie {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final /* synthetic */ Activity f32189b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final /* synthetic */ C4041gd f32190c;

        public a(Activity activity, C4041gd c4041gd) {
            this.f32189b = activity;
            this.f32190c = c4041gd;
        }

        @Override // com.ironsource.AbstractRunnableC4078ie
        public void a() {
            AbstractC4120l3.this.b(this.f32189b, this.f32190c);
        }
    }

    public AbstractC4120l3(L7 l72, K7 k72, V v10, C4201pa c4201pa, C4002ea c4002ea) {
        super(l72, k72, v10, c4201pa, c4002ea);
    }

    public AbstractC4120l3(V v10, C4201pa c4201pa, C4002ea c4002ea) {
        super(v10, c4201pa, c4002ea);
    }

    private String a(List<Smash> list) {
        StringBuilder sb2 = new StringBuilder();
        for (Smash smash : list) {
            if (smash.e() != null) {
                sb2.append(smash.c());
                sb2.append(StringUtils.PROCESS_POSTFIX_DELIMITER);
                sb2.append(smash.e());
                sb2.append(StringUtils.COMMA);
            }
        }
        return sb2.toString();
    }

    private void a(Activity activity, AbstractC4138m3<?> abstractC4138m3, C4041gd c4041gd) {
        if (this.f33046o.h().e()) {
            this.f33049r.a();
        }
        abstractC4138m3.a(activity, c4041gd);
    }

    private void a(@Nullable Smash smash, List<Smash> list) {
        for (Smash smash2 : list) {
            if (smash != null && smash2 == smash) {
                smash.b(true);
                return;
            }
            smash2.b(false);
            IronLog.INTERNAL.verbose(b(smash2.k() + " - not ready to show"));
        }
    }

    private void a(IronSourceError ironSourceError, AbstractC4138m3<?> abstractC4138m3, String str) {
        this.f33050s.f29208i.a(n(), ironSourceError.getErrorCode(), ironSourceError.getErrorMessage(), null);
        this.f33048q.g();
        this.f33051t.a(ironSourceError, abstractC4138m3 != null ? abstractC4138m3.f() : null);
        if (this.f33046o.h().e()) {
            b(false);
        }
    }

    private void a(IronSourceError ironSourceError, String str) {
        a(ironSourceError, (AbstractC4138m3<?>) null, str);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Multi-variable type inference failed */
    public void b(Activity activity, C4041gd c4041gd) {
        AbstractC4138m3 abstractC4138m3;
        IronSourceError ironSourceError;
        IronLog.INTERNAL.verbose(b("state = " + this.f33047p));
        synchronized (this.f33055x) {
            this.f33040i = c4041gd;
            this.f33050s.f29208i.a(activity, n());
            AbstractC4158n3.f fVar = this.f33047p;
            AbstractC4158n3.f fVar2 = AbstractC4158n3.f.SHOWING;
            abstractC4138m3 = null;
            if (fVar == fVar2) {
                ironSourceError = new IronSourceError(A0.g(this.f33046o.b()), "can't show ad while an ad is already showing");
            } else if (fVar != AbstractC4158n3.f.READY_TO_SHOW) {
                ironSourceError = new IronSourceError(509, "show called while no ads are available");
            } else if (c4041gd == null) {
                ironSourceError = new IronSourceError(A0.b(this.f33046o.b()), "empty default placement");
            } else if (this.E.c(ContextProvider.getInstance().getApplicationContext(), c4041gd, this.f33046o.b())) {
                ironSourceError = new IronSourceError(A0.f(this.f33046o.b()), "placement " + c4041gd.c() + " is capped");
            } else {
                ironSourceError = null;
            }
            if (ironSourceError != null) {
                IronLog.API.error(b(ironSourceError.getErrorMessage()));
                a(ironSourceError, "");
            } else {
                List listB = this.f33032a.b();
                Fg fg2 = new Fg(this.f33046o);
                abstractC4138m3 = (AbstractC4138m3) fg2.c(listB);
                a(abstractC4138m3, (List<AbstractC4138m3>) fg2.b(listB));
                if (abstractC4138m3 != null) {
                    a(fVar2);
                    i(abstractC4138m3);
                } else {
                    a(ErrorBuilder.buildNoAdsToShowError(this.f33046o.b().toString()), a(listB));
                }
            }
        }
        if (abstractC4138m3 != null) {
            a(activity, (AbstractC4138m3<?>) abstractC4138m3, this.f33040i);
        }
    }

    public void a(Activity activity, C4041gd c4041gd) {
        if (e()) {
            a(new a(activity, c4041gd));
        } else {
            b(activity, c4041gd);
        }
    }

    @Override // com.ironsource.J0
    public void a(AbstractC4138m3<?> abstractC4138m3) {
        IronLog.INTERNAL.verbose(b(abstractC4138m3.k()));
        if (this.f33047p == AbstractC4158n3.f.SHOWING) {
            a(AbstractC4158n3.f.READY_TO_LOAD);
        }
        this.f33048q.f();
        this.f33051t.a(abstractC4138m3.f());
    }

    @Override // com.ironsource.J0
    public void a(IronSourceError ironSourceError, AbstractC4138m3<?> abstractC4138m3) {
        IronLog.INTERNAL.verbose(b(abstractC4138m3.k() + " - error = " + ironSourceError));
        this.f33033b.put(abstractC4138m3.c(), h.a.ISAuctionPerformanceFailedToShow);
        a(AbstractC4158n3.f.READY_TO_LOAD);
        a(ironSourceError, abstractC4138m3, "");
    }

    @Override // com.ironsource.J0
    public void b(AbstractC4138m3<?> abstractC4138m3) {
        IronLog.INTERNAL.verbose(b(abstractC4138m3.k()));
        this.f33051t.g(abstractC4138m3.f());
    }

    @Override // com.ironsource.J0
    public void c(AbstractC4138m3<?> abstractC4138m3) {
        IronLog.INTERNAL.verbose(b(abstractC4138m3.k()));
        this.f33051t.a();
    }

    @Override // com.ironsource.J0
    public void d(AbstractC4138m3<?> abstractC4138m3) {
        IronLog.INTERNAL.verbose(b(abstractC4138m3.k()));
        this.f33051t.b();
    }

    @Override // com.ironsource.J0
    public String f() {
        StringBuilder sb2 = new StringBuilder();
        if (this.f33047p == AbstractC4158n3.f.READY_TO_SHOW) {
            for (AbstractC4138m3 abstractC4138m3 : this.f33032a.b()) {
                if (abstractC4138m3.y()) {
                    sb2.append(abstractC4138m3.c());
                    sb2.append(";");
                }
            }
        }
        return sb2.toString();
    }

    @Override // com.ironsource.AbstractC4158n3
    public boolean u() {
        if (!x()) {
            return false;
        }
        if (this.f33041j && !IronSourceUtils.g(ContextProvider.getInstance().getApplicationContext())) {
            return false;
        }
        Iterator it = this.f33032a.b().iterator();
        while (it.hasNext()) {
            if (((AbstractC4138m3) it.next()).B()) {
                return true;
            }
        }
        return false;
    }

    @Override // com.ironsource.AbstractC4158n3
    public boolean v() {
        return false;
    }
}
