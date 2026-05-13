package com.ironsource;

import com.ironsource.environment.ContextProvider;
import com.ironsource.mediationsdk.adunit.adapter.utility.AdData;
import com.ironsource.mediationsdk.bidding.BiddingDataCallback;
import com.ironsource.mediationsdk.logger.IronLog;
import com.ironsource.mediationsdk.model.NetworkSettings;
import java.util.Map;
import java.util.concurrent.ArrayBlockingQueue;
import java.util.concurrent.BlockingQueue;
import java.util.concurrent.Callable;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: com.ironsource.x3, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes10.dex */
public class CallableC4329x3 implements Callable<B3> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final int f34367a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final String f34368b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final AdData f34369c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final InterfaceC4363z3 f34370d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final InterfaceC4346y3 f34371e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private final NetworkSettings f34372f;

    /* JADX INFO: renamed from: com.ironsource.x3$a */
    public class a implements BiddingDataCallback {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final /* synthetic */ C4122l5 f34373a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final /* synthetic */ BlockingQueue f34374b;

        public a(C4122l5 c4122l5, BlockingQueue blockingQueue) {
            this.f34373a = c4122l5;
            this.f34374b = blockingQueue;
        }

        @Override // com.ironsource.mediationsdk.bidding.BiddingDataCallback
        public void onFailure(@NotNull String str) {
            this.f34374b.add(new B3(CallableC4329x3.this.d(), CallableC4329x3.this.c(), null, C4122l5.a(this.f34373a), str));
        }

        @Override // com.ironsource.mediationsdk.bidding.BiddingDataCallback
        public void onSuccess(@NotNull Map<String, Object> map) {
            this.f34374b.add(new B3(CallableC4329x3.this.d(), CallableC4329x3.this.c(), map, C4122l5.a(this.f34373a), null));
        }
    }

    public CallableC4329x3(int i10, String str, AdData adData, InterfaceC4363z3 interfaceC4363z3, InterfaceC4346y3 interfaceC4346y3, NetworkSettings networkSettings) {
        this.f34367a = i10;
        this.f34368b = str;
        this.f34369c = adData;
        this.f34370d = interfaceC4363z3;
        this.f34371e = interfaceC4346y3;
        this.f34372f = networkSettings;
    }

    @Override // java.util.concurrent.Callable
    /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
    public B3 call() throws Exception {
        C4122l5 c4122l5 = new C4122l5();
        IronLog.INTERNAL.verbose(c() + " fetching bidding data");
        ArrayBlockingQueue arrayBlockingQueue = new ArrayBlockingQueue(1);
        try {
            b().collectBiddingData(this.f34369c, ContextProvider.getInstance().getActiveContext(), new a(c4122l5, arrayBlockingQueue));
        } catch (Exception e10) {
            C4228r4.d().a(e10);
            String str = "Exception while calling collectBiddingData - " + e10.getMessage();
            IronLog.INTERNAL.error(str);
            InterfaceC4346y3 interfaceC4346y3 = this.f34371e;
            if (interfaceC4346y3 != null) {
                interfaceC4346y3.a(str);
            }
        } catch (NoClassDefFoundError e11) {
            C4228r4.d().a(e11);
            String str2 = "Error while calling collectBiddingData - " + e11.getMessage();
            IronLog.INTERNAL.error(str2);
            InterfaceC4346y3 interfaceC4346y32 = this.f34371e;
            if (interfaceC4346y32 != null) {
                interfaceC4346y32.a(str2);
            }
        }
        InterfaceC4346y3 interfaceC4346y33 = this.f34371e;
        if (interfaceC4346y33 != null) {
            interfaceC4346y33.a(this.f34372f);
        }
        return (B3) arrayBlockingQueue.take();
    }

    public InterfaceC4363z3 b() {
        return this.f34370d;
    }

    public String c() {
        return this.f34368b;
    }

    public int d() {
        return this.f34367a;
    }
}
