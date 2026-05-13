package cr;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.net.NetworkInfo;
import android.net.wifi.WifiManager;
import ir.f;
import java.util.logging.Level;
import java.util.logging.Logger;
import org.eclipse.jetty.util.security.Constraint;
import org.fourthline.cling.transport.RouterException;
import org.fourthline.cling.transport.spi.InitializationException;

/* JADX INFO: compiled from: AndroidRouter.java */
/* JADX INFO: loaded from: classes7.dex */
public class b extends is.b {

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public static final Logger f59422s = Logger.getLogger(is.a.class.getName());

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public final Context f59423m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public final WifiManager f59424n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public WifiManager.MulticastLock f59425o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public WifiManager.WifiLock f59426p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public NetworkInfo f59427q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public BroadcastReceiver f59428r;

    /* JADX INFO: compiled from: AndroidRouter.java */
    public class a extends BroadcastReceiver {
        public a() {
        }

        public void a(Intent intent) {
            boolean booleanExtra = intent.getBooleanExtra("noConnectivity", false);
            String stringExtra = intent.getStringExtra("reason");
            boolean booleanExtra2 = intent.getBooleanExtra("isFailover", false);
            Object obj = (NetworkInfo) intent.getParcelableExtra("networkInfo");
            Object obj2 = (NetworkInfo) intent.getParcelableExtra("otherNetwork");
            b.f59422s.info("Connectivity change detected...");
            b.f59422s.info("EXTRA_NO_CONNECTIVITY: " + booleanExtra);
            b.f59422s.info("EXTRA_REASON: " + stringExtra);
            b.f59422s.info("EXTRA_IS_FAILOVER: " + booleanExtra2);
            Logger logger = b.f59422s;
            StringBuilder sb2 = new StringBuilder();
            sb2.append("EXTRA_NETWORK_INFO: ");
            if (obj == null) {
                obj = "none";
            }
            sb2.append(obj);
            logger.info(sb2.toString());
            Logger logger2 = b.f59422s;
            StringBuilder sb3 = new StringBuilder();
            sb3.append("EXTRA_OTHER_NETWORK_INFO: ");
            if (obj2 == null) {
                obj2 = "none";
            }
            sb3.append(obj2);
            logger2.info(sb3.toString());
            b.f59422s.info("EXTRA_EXTRA_INFO: " + intent.getStringExtra("extraInfo"));
        }

        public boolean b(NetworkInfo networkInfo, NetworkInfo networkInfo2) {
            if (networkInfo == null && networkInfo2 == null) {
                return true;
            }
            return (networkInfo == null || networkInfo2 == null || networkInfo.getType() != networkInfo2.getType()) ? false : true;
        }

        @Override // android.content.BroadcastReceiver
        public void onReceive(Context context, Intent intent) {
            if (intent.getAction().equals("android.net.conn.CONNECTIVITY_CHANGE")) {
                a(intent);
                NetworkInfo networkInfoA = e.a(context);
                if (b.this.f59427q != null && networkInfoA == null) {
                    for (int i10 = 1; i10 <= 3; i10++) {
                        try {
                            Thread.sleep(1000L);
                            b.f59422s.warning(String.format("%s => NONE network transition, waiting for new network... retry #%d", b.this.f59427q.getTypeName(), Integer.valueOf(i10)));
                            networkInfoA = e.a(context);
                            if (networkInfoA != null) {
                                break;
                            }
                        } catch (InterruptedException unused) {
                            return;
                        }
                    }
                }
                if (b(b.this.f59427q, networkInfoA)) {
                    b.f59422s.info("No actual network change... ignoring event!");
                    return;
                }
                try {
                    b bVar = b.this;
                    bVar.s(bVar.f59427q, networkInfoA);
                } catch (RouterException e10) {
                    b.this.q(e10);
                }
            }
        }
    }

    public b(br.c cVar, vr.a aVar, Context context) throws InitializationException {
        super(cVar, aVar);
        this.f59423m = context;
        this.f59424n = (WifiManager) context.getSystemService("wifi");
        this.f59427q = e.a(context);
        if (f.f71774b) {
            return;
        }
        BroadcastReceiver broadcastReceiverP = p();
        this.f59428r = broadcastReceiverP;
        context.registerReceiver(broadcastReceiverP, new IntentFilter("android.net.conn.CONNECTIVITY_CHANGE"));
    }

    @Override // is.b
    public boolean b() throws RouterException {
        j(this.f71799f);
        try {
            if (r()) {
                t(false);
                u(false);
            }
            return super.b();
        } finally {
            n(this.f71799f);
        }
    }

    @Override // is.b
    public int c() {
        return 15000;
    }

    @Override // is.b, is.a
    public boolean enable() throws RouterException {
        j(this.f71799f);
        try {
            boolean zEnable = super.enable();
            if (zEnable && r()) {
                t(true);
                u(true);
            }
            return zEnable;
        } finally {
            n(this.f71799f);
        }
    }

    public BroadcastReceiver p() {
        return new a();
    }

    public void q(RouterException routerException) {
        Throwable thA = os.a.a(routerException);
        if (thA instanceof InterruptedException) {
            f59422s.log(Level.INFO, "Router was interrupted: " + routerException, thA);
            return;
        }
        f59422s.log(Level.WARNING, "Router error on network change: " + routerException, (Throwable) routerException);
    }

    public boolean r() {
        return e.c(this.f59427q);
    }

    public void s(NetworkInfo networkInfo, NetworkInfo networkInfo2) throws RouterException {
        Logger logger = f59422s;
        Object[] objArr = new Object[2];
        objArr[0] = networkInfo == null ? "" : networkInfo.getTypeName();
        String typeName = Constraint.NONE;
        objArr[1] = networkInfo2 == null ? Constraint.NONE : networkInfo2.getTypeName();
        logger.info(String.format("Network type changed %s => %s", objArr));
        if (b()) {
            Object[] objArr2 = new Object[1];
            objArr2[0] = networkInfo == null ? Constraint.NONE : networkInfo.getTypeName();
            logger.info(String.format("Disabled router on network type change (old network: %s)", objArr2));
        }
        this.f59427q = networkInfo2;
        if (enable()) {
            Object[] objArr3 = new Object[1];
            if (networkInfo2 != null) {
                typeName = networkInfo2.getTypeName();
            }
            objArr3[0] = typeName;
            logger.info(String.format("Enabled router on network type change (new network: %s)", objArr3));
        }
    }

    @Override // is.b, is.a
    public void shutdown() throws RouterException {
        super.shutdown();
        v();
    }

    public void t(boolean z10) {
        if (this.f59425o == null) {
            this.f59425o = this.f59424n.createMulticastLock(getClass().getSimpleName());
        }
        if (z10) {
            if (this.f59425o.isHeld()) {
                f59422s.warning("WiFi multicast lock already acquired");
                return;
            } else {
                f59422s.info("WiFi multicast lock acquired");
                this.f59425o.acquire();
                return;
            }
        }
        if (!this.f59425o.isHeld()) {
            f59422s.warning("WiFi multicast lock already released");
        } else {
            f59422s.info("WiFi multicast lock released");
            this.f59425o.release();
        }
    }

    public void u(boolean z10) {
        if (this.f59426p == null) {
            this.f59426p = this.f59424n.createWifiLock(3, getClass().getSimpleName());
        }
        if (z10) {
            if (this.f59426p.isHeld()) {
                f59422s.warning("WiFi lock already acquired");
                return;
            } else {
                f59422s.info("WiFi lock acquired");
                this.f59426p.acquire();
                return;
            }
        }
        if (!this.f59426p.isHeld()) {
            f59422s.warning("WiFi lock already released");
        } else {
            f59422s.info("WiFi lock released");
            this.f59426p.release();
        }
    }

    public void v() {
        BroadcastReceiver broadcastReceiver = this.f59428r;
        if (broadcastReceiver != null) {
            this.f59423m.unregisterReceiver(broadcastReceiver);
            this.f59428r = null;
        }
    }
}
