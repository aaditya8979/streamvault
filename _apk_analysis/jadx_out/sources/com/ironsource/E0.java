package com.ironsource;

import com.ironsource.mediationsdk.IronSource;
import com.ironsource.mediationsdk.logger.IronLog;
import java.util.Calendar;
import java.util.HashMap;
import java.util.Map;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes9.dex */
public class E0 {

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    private static final int f29199p = -1;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final IronSource.a f29200a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final b f29201b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private D0 f29202c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final AbstractC4244s3 f29203d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public C3929a9 f29204e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public Ab f29205f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public Xf f29206g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public R1 f29207h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public N f29208i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public C3954bg f29209j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public Tc f29210k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    private Map<B0, a> f29211l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    private Map<B0, a> f29212m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private Map<B0, a> f29213n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    private Map<B0, a> f29214o;

    public static class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final int f29215a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private final int f29216b;

        public a(D5 d52, D5 d53) {
            if (d52 != null) {
                this.f29215a = d52.b();
            } else {
                this.f29215a = -1;
            }
            if (d53 != null) {
                this.f29216b = d53.b();
            } else {
                this.f29216b = -1;
            }
        }

        public int a(b bVar) {
            return b.MEDIATION.equals(bVar) ? this.f29215a : this.f29216b;
        }
    }

    public enum b {
        MEDIATION,
        PROVIDER
    }

    public E0(IronSource.a aVar, b bVar, D0 d02) {
        this(aVar, bVar, d02, a(aVar));
    }

    public E0(IronSource.a aVar, b bVar, D0 d02, AbstractC4244s3 abstractC4244s3) {
        this.f29200a = aVar;
        this.f29201b = bVar;
        this.f29202c = d02;
        this.f29203d = abstractC4244s3 == null ? a(aVar) : abstractC4244s3;
        b();
        this.f29204e = new C3929a9(this);
        this.f29205f = new Ab(this);
        this.f29206g = new Xf(this);
        this.f29207h = new R1(this);
        this.f29208i = new N(this);
        this.f29209j = new C3954bg(this);
        this.f29210k = new Tc(this);
    }

    private int a(B0 b02) {
        try {
            if (IronSource.a.INTERSTITIAL.equals(this.f29200a) && this.f29211l.containsKey(b02)) {
                return this.f29211l.get(b02).a(this.f29201b);
            }
            if (IronSource.a.REWARDED_VIDEO.equals(this.f29200a) && this.f29212m.containsKey(b02)) {
                return this.f29212m.get(b02).a(this.f29201b);
            }
            if (IronSource.a.BANNER.equals(this.f29200a) && this.f29213n.containsKey(b02)) {
                return this.f29213n.get(b02).a(this.f29201b);
            }
            if (IronSource.a.NATIVE_AD.equals(this.f29200a) && this.f29214o.containsKey(b02)) {
                return this.f29214o.get(b02).a(this.f29201b);
            }
            return -1;
        } catch (Exception e10) {
            C4228r4.d().a(e10);
            IronLog.INTERNAL.error(e10.toString());
            return -1;
        }
    }

    private static AbstractC4244s3 a(IronSource.a aVar) {
        return aVar.equals(IronSource.a.REWARDED_VIDEO) ? C3952be.i() : J9.i();
    }

    private void d() {
        HashMap map = new HashMap();
        this.f29214o = map;
        map.put(B0.INIT_STARTED, new a(D5.NT_MANAGER_INIT_STARTED, null));
        this.f29214o.put(B0.INIT_ENDED, new a(D5.NT_MANAGER_INIT_ENDED, null));
        this.f29214o.put(B0.PLACEMENT_CAPPED, new a(D5.NT_PLACEMENT_CAPPED, null));
        this.f29214o.put(B0.AUCTION_REQUEST, new a(D5.NT_AUCTION_REQUEST, null));
        this.f29214o.put(B0.AUCTION_SUCCESS, new a(D5.NT_AUCTION_SUCCESS, null));
        Map<B0, a> map2 = this.f29214o;
        B0 b02 = B0.AUCTION_FAILED;
        D5 d52 = D5.NT_AUCTION_FAILED;
        map2.put(b02, new a(d52, null));
        this.f29214o.put(B0.AUCTION_FAILED_NO_CANDIDATES, new a(d52, null));
        this.f29214o.put(B0.AUCTION_REQUEST_WATERFALL, new a(D5.NT_AUCTION_REQUEST_WATERFALL, null));
        this.f29214o.put(B0.AUCTION_RESULT_WATERFALL, new a(D5.NT_AUCTION_RESPONSE_WATERFALL, null));
        this.f29214o.put(B0.INIT_SUCCESS, new a(null, null));
        this.f29214o.put(B0.INIT_FAILED, new a(null, null));
        this.f29214o.put(B0.AD_OPENED, new a(D5.NT_CALLBACK_SHOW, D5.NT_INSTANCE_SHOW));
        this.f29214o.put(B0.AD_CLICKED, new a(D5.NT_CALLBACK_CLICK, D5.NT_INSTANCE_CLICK));
        this.f29214o.put(B0.LOAD_AD, new a(D5.NT_LOAD, D5.NT_INSTANCE_LOAD));
        this.f29214o.put(B0.LOAD_AD_SUCCESS, new a(D5.NT_CALLBACK_LOAD_SUCCESS, D5.NT_INSTANCE_LOAD_SUCCESS));
        this.f29214o.put(B0.LOAD_AD_FAILED_WITH_REASON, new a(D5.NT_CALLBACK_LOAD_ERROR, D5.NT_INSTANCE_LOAD_ERROR));
        this.f29214o.put(B0.LOAD_AD_NO_FILL, new a(null, D5.NT_INSTANCE_LOAD_NO_FILL));
        this.f29214o.put(B0.AD_FORMAT_CAPPED, new a(D5.NT_AD_UNIT_CAPPED, null));
        Map<B0, a> map3 = this.f29214o;
        B0 b03 = B0.COLLECT_TOKEN;
        D5 d53 = D5.NT_COLLECT_TOKENS;
        D5 d54 = D5.NT_INSTANCE_COLLECT_TOKEN;
        map3.put(b03, new a(d53, d54));
        this.f29214o.put(B0.COLLECT_TOKENS_COMPLETED, new a(D5.NT_COLLECT_TOKENS_COMPLETED, null));
        this.f29214o.put(B0.COLLECT_TOKENS_FAILED, new a(D5.NT_COLLECT_TOKENS_FAILED, null));
        this.f29214o.put(B0.INSTANCE_COLLECT_TOKEN, new a(d54, null));
        Map<B0, a> map4 = this.f29214o;
        B0 b04 = B0.INSTANCE_COLLECT_TOKEN_SUCCESS;
        D5 d55 = D5.NT_INSTANCE_COLLECT_TOKEN_SUCCESS;
        map4.put(b04, new a(d55, d55));
        Map<B0, a> map5 = this.f29214o;
        B0 b05 = B0.INSTANCE_COLLECT_TOKEN_FAILED;
        D5 d56 = D5.NT_INSTANCE_COLLECT_TOKEN_FAILED;
        map5.put(b05, new a(d56, d56));
        Map<B0, a> map6 = this.f29214o;
        B0 b06 = B0.INSTANCE_COLLECT_TOKEN_TIMED_OUT;
        D5 d57 = D5.NT_INSTANCE_COLLECT_TOKEN_TIMED_OUT;
        map6.put(b06, new a(d57, d57));
        this.f29214o.put(B0.DESTROY_AD, new a(D5.NT_DESTROY, D5.NT_INSTANCE_DESTROY));
        this.f29214o.put(B0.TROUBLESHOOT_ILR_REVENUE, new a(D5.TROUBLESHOOTING_NT_ILR_REVENUE, null));
        Map<B0, a> map7 = this.f29214o;
        B0 b07 = B0.TROUBLESHOOT_PROVIDER_SETTINGS_MISSING;
        D5 d58 = D5.TROUBLESHOOTING_NT_PROVIDER_SETTINGS_MISSING;
        map7.put(b07, new a(d58, d58));
        Map<B0, a> map8 = this.f29214o;
        B0 b08 = B0.TROUBLESHOOT_UNEXPECTED_INIT_SUCCESS;
        D5 d59 = D5.TROUBLESHOOTING_NT_UNEXPECTED_INIT_SUCCESS;
        map8.put(b08, new a(d59, d59));
        Map<B0, a> map9 = this.f29214o;
        B0 b09 = B0.TROUBLESHOOT_UNEXPECTED_INIT_FAILED;
        D5 d510 = D5.TROUBLESHOOTING_NT_UNEXPECTED_INIT_FAILED;
        map9.put(b09, new a(d510, d510));
        Map<B0, a> map10 = this.f29214o;
        B0 b010 = B0.TROUBLESHOOT_UNEXPECTED_AUCTION_SUCCESS;
        D5 d511 = D5.TROUBLESHOOTING_NT_UNEXPECTED_AUCTION_SUCCESS;
        map10.put(b010, new a(d511, d511));
        Map<B0, a> map11 = this.f29214o;
        B0 b011 = B0.TROUBLESHOOT_UNEXPECTED_AUCTION_FAILED;
        D5 d512 = D5.TROUBLESHOOTING_NT_UNEXPECTED_AUCTION_FAILED;
        map11.put(b011, new a(d512, d512));
        Map<B0, a> map12 = this.f29214o;
        B0 b012 = B0.TROUBLESHOOT_UNEXPECTED_LOAD_SUCCESS;
        D5 d513 = D5.TROUBLESHOOTING_NT_UNEXPECTED_LOAD_SUCCESS;
        map12.put(b012, new a(d513, d513));
        Map<B0, a> map13 = this.f29214o;
        B0 b013 = B0.TROUBLESHOOT_UNEXPECTED_LOAD_FAILED;
        D5 d514 = D5.TROUBLESHOOTING_NT_UNEXPECTED_LOAD_FAILED;
        map13.put(b013, new a(d514, d514));
        Map<B0, a> map14 = this.f29214o;
        B0 b014 = B0.TROUBLESHOOT_UNEXPECTED_TIMEOUT;
        D5 d515 = D5.TROUBLESHOOTING_NT_UNEXPECTED_TIMEOUT;
        map14.put(b014, new a(d515, d515));
        Map<B0, a> map15 = this.f29214o;
        B0 b015 = B0.TROUBLESHOOT_UNEXPECTED_OPENED;
        D5 d516 = D5.TROUBLESHOOTING_NT_UNEXPECTED_OPENED;
        map15.put(b015, new a(d516, d516));
        Map<B0, a> map16 = this.f29214o;
        B0 b016 = B0.TROUBLESHOOT_INTERNAL_ERROR;
        D5 d517 = D5.TROUBLESHOOTING_NT_INTERNAL_ERROR;
        map16.put(b016, new a(d517, d517));
        Map<B0, a> map17 = this.f29214o;
        B0 b017 = B0.TROUBLESHOOT_ADAPTER_REPOSITORY_INTERNAL_ERROR;
        D5 d518 = D5.TROUBLESHOOTING_ADAPTER_REPOSITORY_INTERNAL_ERROR;
        map17.put(b017, new a(d518, d518));
        Map<B0, a> map18 = this.f29214o;
        B0 b018 = B0.TROUBLESHOOT_AUCTION_SUCCESSFUL_RECOVERY_ERROR;
        D5 d519 = D5.TROUBLESHOOTING_AUCTION_SUCCESSFUL_RECOVERY_ERROR;
        map18.put(b018, new a(d519, d519));
        this.f29214o.put(B0.TROUBLESHOOT_NOTIFICATION_ERROR, new a(D5.TROUBLESHOOTING_NT_NOTIFICATIONS_ERROR, null));
    }

    public void a() {
        HashMap map = new HashMap();
        this.f29213n = map;
        map.put(B0.INIT_STARTED, new a(D5.BN_MANAGER_INIT_STARTED, null));
        this.f29213n.put(B0.INIT_ENDED, new a(D5.BN_MANAGER_INIT_ENDED, null));
        this.f29213n.put(B0.PLACEMENT_CAPPED, new a(D5.BN_PLACEMENT_CAPPED, null));
        this.f29213n.put(B0.AUCTION_REQUEST, new a(D5.BN_AUCTION_REQUEST, null));
        this.f29213n.put(B0.AUCTION_SUCCESS, new a(D5.BN_AUCTION_SUCCESS, null));
        Map<B0, a> map2 = this.f29213n;
        B0 b02 = B0.AUCTION_FAILED;
        D5 d52 = D5.BN_AUCTION_FAILED;
        map2.put(b02, new a(d52, null));
        this.f29213n.put(B0.AUCTION_FAILED_NO_CANDIDATES, new a(d52, null));
        this.f29213n.put(B0.AUCTION_REQUEST_WATERFALL, new a(D5.BN_AUCTION_REQUEST_WATERFALL, null));
        this.f29213n.put(B0.AUCTION_RESULT_WATERFALL, new a(D5.BN_AUCTION_RESPONSE_WATERFALL, null));
        this.f29213n.put(B0.INIT_SUCCESS, new a(null, null));
        this.f29213n.put(B0.INIT_FAILED, new a(null, null));
        this.f29213n.put(B0.AD_OPENED, new a(D5.BN_CALLBACK_SHOW, D5.BN_INSTANCE_SHOW));
        this.f29213n.put(B0.SHOW_AD_FAILED, new a(D5.BN_CALLBACK_SHOW_FAILED, D5.BN_INSTANCE_SHOW_FAILED));
        this.f29213n.put(B0.AD_CLICKED, new a(D5.BN_CALLBACK_CLICK, D5.BN_INSTANCE_CLICK));
        this.f29213n.put(B0.LOAD_AD, new a(D5.BN_LOAD, D5.BN_INSTANCE_LOAD));
        this.f29213n.put(B0.RELOAD_AD, new a(D5.BN_RELOAD, D5.BN_INSTANCE_RELOAD));
        this.f29213n.put(B0.LOAD_AD_SUCCESS, new a(D5.BN_CALLBACK_LOAD_SUCCESS, D5.BN_INSTANCE_LOAD_SUCCESS));
        this.f29213n.put(B0.RELOAD_AD_SUCCESS, new a(D5.BN_CALLBACK_RELOAD_SUCCESS, D5.BN_INSTANCE_RELOAD_SUCCESS));
        this.f29213n.put(B0.LOAD_AD_FAILED_WITH_REASON, new a(D5.BN_CALLBACK_LOAD_ERROR, D5.BN_INSTANCE_LOAD_ERROR));
        this.f29213n.put(B0.RELOAD_AD_FAILED_WITH_REASON, new a(D5.BN_CALLBACK_RELOAD_ERROR, D5.BN_INSTANCE_RELOAD_ERROR));
        this.f29213n.put(B0.LOAD_AD_NO_FILL, new a(null, D5.BN_INSTANCE_LOAD_NO_FILL));
        this.f29213n.put(B0.RELOAD_AD_NO_FILL, new a(null, D5.BN_INSTANCE_RELOAD_NO_FILL));
        this.f29213n.put(B0.AD_FORMAT_CAPPED, new a(D5.BN_AD_UNIT_CAPPED, null));
        this.f29213n.put(B0.COLLECT_TOKEN, new a(D5.BN_COLLECT_TOKENS, null));
        this.f29213n.put(B0.COLLECT_TOKENS_COMPLETED, new a(D5.BN_COLLECT_TOKENS_COMPLETED, null));
        this.f29213n.put(B0.COLLECT_TOKENS_FAILED, new a(D5.BN_COLLECT_TOKENS_FAILED, null));
        this.f29213n.put(B0.INSTANCE_COLLECT_TOKEN, new a(D5.BN_INSTANCE_COLLECT_TOKEN, null));
        Map<B0, a> map3 = this.f29213n;
        B0 b03 = B0.INSTANCE_COLLECT_TOKEN_SUCCESS;
        D5 d53 = D5.BN_INSTANCE_COLLECT_TOKEN_SUCCESS;
        map3.put(b03, new a(d53, d53));
        Map<B0, a> map4 = this.f29213n;
        B0 b04 = B0.INSTANCE_COLLECT_TOKEN_FAILED;
        D5 d54 = D5.BN_INSTANCE_COLLECT_TOKEN_FAILED;
        map4.put(b04, new a(d54, d54));
        Map<B0, a> map5 = this.f29213n;
        B0 b05 = B0.INSTANCE_COLLECT_TOKEN_TIMED_OUT;
        D5 d55 = D5.BN_INSTANCE_COLLECT_TOKEN_TIMED_OUT;
        map5.put(b05, new a(d55, d55));
        this.f29213n.put(B0.DESTROY_AD, new a(D5.BN_DESTROY, D5.BN_INSTANCE_DESTROY));
        this.f29213n.put(B0.SKIP_RELOAD_AD, new a(D5.BN_SKIP_RELOAD, null));
        this.f29213n.put(B0.AD_LEFT_APPLICATION, new a(D5.BN_CALLBACK_LEAVE_APP, D5.BN_INSTANCE_LEAVE_APP));
        this.f29213n.put(B0.AD_PRESENT_SCREEN, new a(D5.BN_CALLBACK_PRESENT_SCREEN, D5.BN_INSTANCE_PRESENT_SCREEN));
        this.f29213n.put(B0.AD_DISMISS_SCREEN, new a(D5.BN_CALLBACK_DISMISS_SCREEN, D5.BN_INSTANCE_DISMISS_SCREEN));
        this.f29213n.put(B0.AD_VIEW_BOUND, new a(D5.BN_BOUND, D5.BN_INSTANCE_BOUND));
        this.f29213n.put(B0.PAUSE_AD, new a(D5.BN_REFRESH_PAUSE, null));
        this.f29213n.put(B0.RESUME_AD, new a(D5.BN_REFRESH_RESUME, null));
        this.f29213n.put(B0.OPERATIONAL_SET_CONFIGURATIONS, new a(D5.BN_SET_CONFIGURATION, null));
        Map<B0, a> map6 = this.f29213n;
        B0 b06 = B0.TROUBLESHOOT_PROVIDER_SETTINGS_MISSING;
        D5 d56 = D5.TROUBLESHOOTING_BN_PROVIDER_SETTINGS_MISSING;
        map6.put(b06, new a(d56, d56));
        Map<B0, a> map7 = this.f29213n;
        B0 b07 = B0.TROUBLESHOOT_UNEXPECTED_INIT_SUCCESS;
        D5 d57 = D5.TROUBLESHOOTING_BN_UNEXPECTED_INIT_SUCCESS;
        map7.put(b07, new a(d57, d57));
        Map<B0, a> map8 = this.f29213n;
        B0 b08 = B0.TROUBLESHOOT_UNEXPECTED_INIT_FAILED;
        D5 d58 = D5.TROUBLESHOOTING_BN_UNEXPECTED_INIT_FAILED;
        map8.put(b08, new a(d58, d58));
        Map<B0, a> map9 = this.f29213n;
        B0 b09 = B0.TROUBLESHOOT_UNEXPECTED_AUCTION_SUCCESS;
        D5 d59 = D5.TROUBLESHOOTING_BN_UNEXPECTED_AUCTION_SUCCESS;
        map9.put(b09, new a(d59, d59));
        Map<B0, a> map10 = this.f29213n;
        B0 b010 = B0.TROUBLESHOOT_UNEXPECTED_AUCTION_FAILED;
        D5 d510 = D5.TROUBLESHOOTING_BN_UNEXPECTED_AUCTION_FAILED;
        map10.put(b010, new a(d510, d510));
        Map<B0, a> map11 = this.f29213n;
        B0 b011 = B0.TROUBLESHOOT_UNEXPECTED_LOAD_SUCCESS;
        D5 d511 = D5.TROUBLESHOOTING_BN_UNEXPECTED_LOAD_SUCCESS;
        map11.put(b011, new a(d511, d511));
        Map<B0, a> map12 = this.f29213n;
        B0 b012 = B0.TROUBLESHOOT_UNEXPECTED_LOAD_FAILED;
        D5 d512 = D5.TROUBLESHOOTING_BN_UNEXPECTED_LOAD_FAILED;
        map12.put(b012, new a(d512, d512));
        Map<B0, a> map13 = this.f29213n;
        B0 b013 = B0.TROUBLESHOOT_UNEXPECTED_RELOAD_SUCCESS;
        D5 d513 = D5.TROUBLESHOOTING_BN_UNEXPECTED_RELOAD_SUCCESS;
        map13.put(b013, new a(d513, d513));
        Map<B0, a> map14 = this.f29213n;
        B0 b014 = B0.TROUBLESHOOT_UNEXPECTED_RELOAD_FAILED;
        D5 d514 = D5.TROUBLESHOOTING_BN_UNEXPECTED_RELOAD_FAILED;
        map14.put(b014, new a(d514, d514));
        Map<B0, a> map15 = this.f29213n;
        B0 b015 = B0.TROUBLESHOOT_UNEXPECTED_TIMEOUT;
        D5 d515 = D5.TROUBLESHOOTING_BN_UNEXPECTED_TIMEOUT;
        map15.put(b015, new a(d515, d515));
        Map<B0, a> map16 = this.f29213n;
        B0 b016 = B0.TROUBLESHOOT_UNEXPECTED_OPENED;
        D5 d516 = D5.TROUBLESHOOTING_BN_UNEXPECTED_OPENED;
        map16.put(b016, new a(d516, d516));
        Map<B0, a> map17 = this.f29213n;
        B0 b017 = B0.TROUBLESHOOT_INTERNAL_ERROR;
        D5 d517 = D5.TROUBLESHOOTING_BN_INTERNAL_ERROR;
        map17.put(b017, new a(d517, d517));
        Map<B0, a> map18 = this.f29213n;
        B0 b018 = B0.TROUBLESHOOT_ADAPTER_REPOSITORY_INTERNAL_ERROR;
        D5 d518 = D5.TROUBLESHOOTING_ADAPTER_REPOSITORY_INTERNAL_ERROR;
        map18.put(b018, new a(d518, d518));
        Map<B0, a> map19 = this.f29213n;
        B0 b019 = B0.TROUBLESHOOT_AUCTION_SUCCESSFUL_RECOVERY_ERROR;
        D5 d519 = D5.TROUBLESHOOTING_AUCTION_SUCCESSFUL_RECOVERY_ERROR;
        map19.put(b019, new a(d519, d519));
        this.f29213n.put(B0.TROUBLESHOOT_NOTIFICATION_ERROR, new a(D5.TROUBLESHOOTING_BN_NOTIFICATIONS_ERROR, null));
        this.f29213n.put(B0.TROUBLESHOOT_BN_RELOAD_EXCEPTION, new a(D5.TROUBLESHOOTING_BN_RELOAD_EXCEPTION, null));
        this.f29213n.put(B0.TROUBLESHOOT_IMPRESSION_TIMEOUT, new a(D5.TROUBLESHOOTING_BN_IMPRESSION_TIMEOUT_REACHED, null));
        this.f29213n.put(B0.TROUBLESHOOT_BANNER_REFRESH_PAUSED, new a(D5.TROUBLESHOOT_BN_BANNER_REFRESH_PAUSED, null));
        this.f29213n.put(B0.TROUBLESHOOT_BANNER_REFRESH_RESUMED, new a(D5.TROUBLESHOOT_BN_BANNER_REFRESH_RESUMED, null));
        this.f29213n.put(B0.TROUBLESHOOT_BANNER_REFRESH_TRIGGER_PAUSE, new a(D5.TROUBLESHOOT_BN_BANNER_REFRESH_TRIGGER_PAUSE, null));
        this.f29213n.put(B0.TROUBLESHOOT_BANNER_REFRESH_TRIGGER_RESUME, new a(D5.TROUBLESHOOT_BN_BANNER_REFRESH_TRIGGER_RESUME, null));
        Map<B0, a> map20 = this.f29213n;
        B0 b020 = B0.TROUBLESHOOT_BANNER_REFRESH_TRANSITION;
        D5 d520 = D5.TROUBLESHOOT_BN_BANNER_REFRESH_TRANSITION;
        map20.put(b020, new a(d520, d520));
        Map<B0, a> map21 = this.f29213n;
        B0 b021 = B0.TROUBLESHOOT_BANNER_REFRESH_ANIMATED;
        D5 d521 = D5.TROUBLESHOOT_BN_BANNER_REFRESH_ANIMATED;
        map21.put(b021, new a(d521, d521));
        Map<B0, a> map22 = this.f29213n;
        B0 b022 = B0.TROUBLESHOOT_ILLEGAL_STATE;
        D5 d522 = D5.TROUBLESHOOTING_BN_ILLEGAL_STATE;
        map22.put(b022, new a(d522, d522));
        this.f29213n.put(B0.TROUBLESHOOT_RELOAD, new a(D5.TROUBLESHOOTING_BN_RELOAD, null));
        Map<B0, a> map23 = this.f29213n;
        B0 b023 = B0.TROUBLESHOOT_LOAD_SKIPPED;
        D5 d523 = D5.TROUBLESHOOTING_BN_LOAD_SKIPPED;
        map23.put(b023, new a(d523, d523));
        this.f29213n.put(B0.TROUBLESHOOT_ILR_REVENUE, new a(D5.TROUBLESHOOTING_BN_ILR_REVENUE, null));
    }

    public void a(B0 b02, Map<String, Object> map) {
        a(b02, map, Calendar.getInstance().getTimeInMillis());
    }

    public void a(B0 b02, Map<String, Object> map, long j10) {
        int iA = a(b02);
        if (-1 == iA) {
            return;
        }
        HashMap map2 = new HashMap();
        D0 d02 = this.f29202c;
        if (d02 != null) {
            map2.putAll(d02.a(b02));
        }
        if (map != null && !map.isEmpty()) {
            map2.putAll(map);
        }
        this.f29203d.a(new C5(iA, j10, new JSONObject(map2)));
    }

    public void b() {
        c();
        e();
        a();
        d();
    }

    public void c() {
        HashMap map = new HashMap();
        this.f29211l = map;
        map.put(B0.INIT_STARTED, new a(D5.IS_MANAGER_INIT_STARTED, null));
        this.f29211l.put(B0.INIT_ENDED, new a(D5.IS_MANAGER_INIT_ENDED, null));
        this.f29211l.put(B0.SESSION_CAPPED, new a(null, D5.IS_CAP_SESSION));
        this.f29211l.put(B0.PLACEMENT_CAPPED, new a(D5.IS_CAP_PLACEMENT, null));
        this.f29211l.put(B0.CHECK_PLACEMENT_CAPPED, new a(D5.IS_CHECK_PLACEMENT_CAPPED, null));
        this.f29211l.put(B0.AUCTION_REQUEST, new a(D5.IS_AUCTION_REQUEST, null));
        this.f29211l.put(B0.AUCTION_SUCCESS, new a(D5.IS_AUCTION_SUCCESS, null));
        Map<B0, a> map2 = this.f29211l;
        B0 b02 = B0.AUCTION_FAILED;
        D5 d52 = D5.IS_AUCTION_FAILED;
        map2.put(b02, new a(d52, null));
        this.f29211l.put(B0.AUCTION_FAILED_NO_CANDIDATES, new a(d52, null));
        this.f29211l.put(B0.AUCTION_REQUEST_WATERFALL, new a(D5.IS_AUCTION_REQUEST_WATERFALL, null));
        this.f29211l.put(B0.AUCTION_RESULT_WATERFALL, new a(D5.IS_RESULT_WATERFALL, null));
        this.f29211l.put(B0.INIT_SUCCESS, new a(null, null));
        this.f29211l.put(B0.INIT_FAILED, new a(null, null));
        this.f29211l.put(B0.AD_OPENED, new a(null, D5.IS_INSTANCE_OPENED));
        this.f29211l.put(B0.AD_CLOSED, new a(D5.IS_CALLBACK_AD_CLOSED, D5.IS_INSTANCE_CLOSED));
        this.f29211l.put(B0.AD_CLICKED, new a(D5.IS_CALLBACK_AD_CLICKED, D5.IS_INSTANCE_CLICKED));
        this.f29211l.put(B0.AD_INFO_CHANGED, new a(D5.IS_CALLBACK_AD_INFO_CHANGED, null));
        this.f29211l.put(B0.LOAD_AD, new a(D5.IS_LOAD_CALLED, D5.IS_INSTANCE_LOAD));
        this.f29211l.put(B0.LOAD_AD_SUCCESS, new a(D5.IS_CALLBACK_LOAD_SUCCESS, D5.IS_INSTANCE_LOAD_SUCCESS));
        this.f29211l.put(B0.LOAD_AD_FAILED_WITH_REASON, new a(D5.IS_CALLBACK_LOAD_ERROR, D5.IS_INSTANCE_LOAD_FAILED));
        this.f29211l.put(B0.LOAD_AD_NO_FILL, new a(null, D5.IS_INSTANCE_LOAD_NO_FILL));
        this.f29211l.put(B0.SHOW_AD, new a(D5.IS_SHOW_CALLED, D5.IS_INSTANCE_SHOW));
        this.f29211l.put(B0.SHOW_AD_FAILED, new a(D5.IS_CALLBACK_AD_SHOW_ERROR, D5.IS_INSTANCE_SHOW_FAILED));
        this.f29211l.put(B0.AD_FORMAT_CAPPED, new a(D5.IS_AD_FORMAT_CAPPED, null));
        this.f29211l.put(B0.AD_UNIT_CAPPED, new a(D5.IS_AD_UNIT_CAPPED, null));
        this.f29211l.put(B0.COLLECT_TOKEN, new a(D5.IS_COLLECT_TOKENS, null));
        this.f29211l.put(B0.COLLECT_TOKENS_COMPLETED, new a(D5.IS_COLLECT_TOKENS_COMPLETED, null));
        this.f29211l.put(B0.COLLECT_TOKENS_FAILED, new a(D5.IS_COLLECT_TOKENS_FAILED, null));
        this.f29211l.put(B0.INSTANCE_COLLECT_TOKEN, new a(D5.IS_INSTANCE_COLLECT_TOKEN, null));
        this.f29211l.put(B0.INSTANCE_COLLECT_TOKEN_SUCCESS, new a(D5.IS_INSTANCE_COLLECT_TOKEN_SUCCESS, null));
        this.f29211l.put(B0.INSTANCE_COLLECT_TOKEN_FAILED, new a(D5.IS_INSTANCE_COLLECT_TOKEN_FAILED, null));
        this.f29211l.put(B0.INSTANCE_COLLECT_TOKEN_TIMED_OUT, new a(D5.IS_INSTANCE_COLLECT_TOKEN_TIMED_OUT, null));
        this.f29211l.put(B0.AD_READY_TRUE, new a(D5.IS_CHECK_READY_TRUE, null));
        this.f29211l.put(B0.AD_READY_FALSE, new a(D5.IS_CHECK_READY_FALSE, null));
        this.f29211l.put(B0.OPERATIONAL_LOAD_AD, new a(D5.IS_OPERATIONAL_LOAD_AD, null));
        this.f29211l.put(B0.OPERATIONAL_LOAD_SUCCESS, new a(D5.IS_OPERATIONAL_LOAD_SUCCESS, null));
        this.f29211l.put(B0.OPERATIONAL_LOAD_FAILED, new a(D5.IS_OPERATIONAL_LOAD_FAILED, null));
        this.f29211l.put(B0.OPERATIONAL_SET_CONFIGURATIONS, new a(D5.IS_SET_CONFIGURATION, null));
        Map<B0, a> map3 = this.f29211l;
        B0 b03 = B0.TROUBLESHOOT_PROVIDER_SETTINGS_MISSING;
        D5 d53 = D5.TROUBLESHOOTING_IS_PROVIDER_SETTINGS_MISSING;
        map3.put(b03, new a(d53, d53));
        Map<B0, a> map4 = this.f29211l;
        B0 b04 = B0.TROUBLESHOOT_UNEXPECTED_INIT_SUCCESS;
        D5 d54 = D5.TROUBLESHOOTING_IS_UNEXPECTED_INIT_SUCCESS;
        map4.put(b04, new a(d54, d54));
        Map<B0, a> map5 = this.f29211l;
        B0 b05 = B0.TROUBLESHOOT_UNEXPECTED_INIT_FAILED;
        D5 d55 = D5.TROUBLESHOOTING_IS_UNEXPECTED_INIT_FAILED;
        map5.put(b05, new a(d55, d55));
        Map<B0, a> map6 = this.f29211l;
        B0 b06 = B0.TROUBLESHOOT_UNEXPECTED_AUCTION_SUCCESS;
        D5 d56 = D5.TROUBLESHOOTING_IS_UNEXPECTED_AUCTION_SUCCESS;
        map6.put(b06, new a(d56, d56));
        Map<B0, a> map7 = this.f29211l;
        B0 b07 = B0.TROUBLESHOOT_UNEXPECTED_AUCTION_FAILED;
        D5 d57 = D5.TROUBLESHOOTING_IS_UNEXPECTED_AUCTION_FAILED;
        map7.put(b07, new a(d57, d57));
        Map<B0, a> map8 = this.f29211l;
        B0 b08 = B0.TROUBLESHOOT_UNEXPECTED_LOAD_SUCCESS;
        D5 d58 = D5.TROUBLESHOOTING_IS_UNEXPECTED_LOAD_SUCCESS;
        map8.put(b08, new a(d58, d58));
        Map<B0, a> map9 = this.f29211l;
        B0 b09 = B0.TROUBLESHOOT_UNEXPECTED_LOAD_FAILED;
        D5 d59 = D5.TROUBLESHOOTING_IS_UNEXPECTED_LOAD_FAILED;
        map9.put(b09, new a(d59, d59));
        Map<B0, a> map10 = this.f29211l;
        B0 b010 = B0.TROUBLESHOOT_UNEXPECTED_SHOW_FAILED;
        D5 d510 = D5.TROUBLESHOOTING_IS_UNEXPECTED_SHOW_FAILED;
        map10.put(b010, new a(d510, d510));
        Map<B0, a> map11 = this.f29211l;
        B0 b011 = B0.TROUBLESHOOT_UNEXPECTED_CLOSED;
        D5 d511 = D5.TROUBLESHOOTING_IS_UNEXPECTED_CLOSED;
        map11.put(b011, new a(d511, d511));
        Map<B0, a> map12 = this.f29211l;
        B0 b012 = B0.TROUBLESHOOT_UNEXPECTED_TIMEOUT;
        D5 d512 = D5.TROUBLESHOOTING_IS_UNEXPECTED_TIMEOUT;
        map12.put(b012, new a(d512, d512));
        Map<B0, a> map13 = this.f29211l;
        B0 b013 = B0.TROUBLESHOOT_INTERNAL_ERROR;
        D5 d513 = D5.TROUBLESHOOTING_IS_INTERNAL_ERROR;
        map13.put(b013, new a(d513, d513));
        Map<B0, a> map14 = this.f29211l;
        B0 b014 = B0.TROUBLESHOOT_ADAPTER_REPOSITORY_INTERNAL_ERROR;
        D5 d514 = D5.TROUBLESHOOTING_ADAPTER_REPOSITORY_INTERNAL_ERROR;
        map14.put(b014, new a(d514, d514));
        Map<B0, a> map15 = this.f29211l;
        B0 b015 = B0.TROUBLESHOOT_AUCTION_SUCCESSFUL_RECOVERY_ERROR;
        D5 d515 = D5.TROUBLESHOOTING_AUCTION_SUCCESSFUL_RECOVERY_ERROR;
        map15.put(b015, new a(d515, d515));
        this.f29211l.put(B0.TROUBLESHOOT_NOTIFICATION_ERROR, new a(D5.TROUBLESHOOTING_IS_NOTIFICATIONS_ERROR, null));
        Map<B0, a> map16 = this.f29211l;
        B0 b016 = B0.TROUBLESHOOT_AD_EXPIRED;
        D5 d516 = D5.TROUBLESHOOTING_IS_AD_EXPIRED;
        map16.put(b016, new a(d516, d516));
        this.f29211l.put(B0.TROUBLESHOOT_LOAD, new a(D5.TROUBLESHOOTING_IS_LOAD, null));
        this.f29211l.put(B0.TROUBLESHOOT_LOAD_WHILE_LOADED, new a(D5.TROUBLESHOOTING_IS_LOAD_WHILE_LOADED, null));
        this.f29211l.put(B0.TROUBLESHOOT_LOAD_SUCCESS, new a(D5.TROUBLESHOOTING_IS_LOAD_SUCCESS, null));
        this.f29211l.put(B0.TROUBLESHOOT_LOAD_FAILED, new a(D5.TROUBLESHOOTING_IS_LOAD_FAILED, null));
        this.f29211l.put(B0.TROUBLESHOOT_SHOW, new a(D5.TROUBLESHOOTING_IS_SHOW, null));
        this.f29211l.put(B0.TROUBLESHOOT_SHOW_SUCCESS, new a(D5.TROUBLESHOOTING_IS_SHOW_SUCCESS, null));
        this.f29211l.put(B0.TROUBLESHOOT_SHOW_FAILED, new a(D5.TROUBLESHOOTING_IS_SHOW_FAILED, null));
        Map<B0, a> map17 = this.f29211l;
        B0 b017 = B0.TROUBLESHOOT_ILLEGAL_STATE;
        D5 d517 = D5.TROUBLESHOOTING_IS_ILLEGAL_STATE;
        map17.put(b017, new a(d517, d517));
        this.f29211l.put(B0.TROUBLESHOOT_AD_INFO_CHANGED, new a(D5.TROUBLESHOOT_IS_AD_INFO_CHANGED, null));
        this.f29211l.put(B0.TROUBLESHOOT_DESTROY_INSTANCES_READY_TO_SHOW, new a(D5.TROUBLESHOOTING_IS_DESTROY_READY_TO_SHOW_INSTANCES, null));
        this.f29211l.put(B0.TROUBLESHOOT_ILR_REVENUE, new a(D5.TROUBLESHOOTING_IS_ILR_REVENUE, null));
        this.f29211l.put(B0.TROUBLESHOOT_SHOW_RECOVERY_INITIATED, new a(D5.TROUBLESHOOT_IS_SHOW_RECOVERY_INITIATED, null));
    }

    public void e() {
        HashMap map = new HashMap();
        this.f29212m = map;
        map.put(B0.INIT_STARTED, new a(D5.RV_MANAGER_INIT_STARTED, null));
        this.f29212m.put(B0.INIT_ENDED, new a(D5.RV_MANAGER_INIT_ENDED, null));
        this.f29212m.put(B0.SESSION_CAPPED, new a(null, D5.RV_CAP_SESSION));
        this.f29212m.put(B0.PLACEMENT_CAPPED, new a(D5.RV_CAP_PLACEMENT, null));
        this.f29212m.put(B0.CHECK_PLACEMENT_CAPPED, new a(D5.RV_CHECK_PLACEMENT_CAPPED, null));
        this.f29212m.put(B0.AUCTION_REQUEST, new a(D5.RV_AUCTION_REQUEST, null));
        this.f29212m.put(B0.AUCTION_SUCCESS, new a(D5.RV_AUCTION_SUCCESS, null));
        Map<B0, a> map2 = this.f29212m;
        B0 b02 = B0.AUCTION_FAILED;
        D5 d52 = D5.RV_AUCTION_FAILED;
        map2.put(b02, new a(d52, null));
        this.f29212m.put(B0.AUCTION_FAILED_NO_CANDIDATES, new a(d52, null));
        this.f29212m.put(B0.AUCTION_REQUEST_WATERFALL, new a(D5.RV_AUCTION_REQUEST_WATERFALL, null));
        this.f29212m.put(B0.AUCTION_RESULT_WATERFALL, new a(D5.RV_AUCTION_RESPONSE_WATERFALL, null));
        this.f29212m.put(B0.INIT_SUCCESS, new a(null, null));
        this.f29212m.put(B0.INIT_FAILED, new a(null, null));
        this.f29212m.put(B0.AD_VISIBLE, new a(null, D5.RV_INSTANCE_VISIBLE));
        this.f29212m.put(B0.AD_OPENED, new a(null, D5.RV_BUSINESS_INSTANCE_OPENED));
        this.f29212m.put(B0.AD_CLOSED, new a(null, D5.RV_INSTANCE_CLOSED));
        this.f29212m.put(B0.AD_STARTED, new a(null, D5.RV_INSTANCE_STARTED));
        this.f29212m.put(B0.AD_ENDED, new a(null, D5.RV_INSTANCE_ENDED));
        this.f29212m.put(B0.AD_CLICKED, new a(D5.RV_CALLBACK_AD_CLICKED, D5.RV_BUSINESS_INSTANCE_CLICKED));
        this.f29212m.put(B0.AD_INFO_CHANGED, new a(D5.RV_CALLBACK_AD_INFO_CHANGED, null));
        this.f29212m.put(B0.AD_REWARDED, new a(null, D5.RV_BUSINESS_INSTANCE_REWARDED));
        this.f29212m.put(B0.AD_AVAILABILITY_CHANGED_TRUE, new a(D5.RV_CALLBACK_AVAILABILITY_TRUE, D5.RV_INSTANCE_AVAILABILITY_TRUE));
        this.f29212m.put(B0.AD_AVAILABILITY_CHANGED_FALSE, new a(D5.RV_CALLBACK_AVAILABILITY_FALSE, D5.RV_INSTANCE_AVAILABILITY_FALSE));
        this.f29212m.put(B0.LOAD_AD, new a(D5.RV_BUSINESS_MEDIATION_LOAD, D5.RV_BUSINESS_INSTANCE_LOAD));
        this.f29212m.put(B0.LOAD_AD_SUCCESS, new a(D5.RV_BUSINESS_MEDIATION_LOAD_SUCCESS, D5.RV_BUSINESS_INSTANCE_LOAD_SUCCESS));
        this.f29212m.put(B0.LOAD_AD_FAILED, new a(null, D5.RV_INSTANCE_LOAD_FAILED));
        this.f29212m.put(B0.LOAD_AD_FAILED_WITH_REASON, new a(D5.RV_MEDIATION_LOAD_ERROR, D5.RV_INSTANCE_LOAD_FAILED_REASON));
        this.f29212m.put(B0.LOAD_AD_NO_FILL, new a(null, D5.RV_INSTANCE_LOAD_NO_FILL));
        this.f29212m.put(B0.SHOW_AD, new a(D5.RV_API_SHOW_CALLED, D5.RV_INSTANCE_SHOW));
        this.f29212m.put(B0.SHOW_AD_CHANCE, new a(null, D5.RV_INSTANCE_SHOW_CHANCE));
        this.f29212m.put(B0.SHOW_AD_FAILED, new a(D5.RV_CALLBACK_SHOW_FAILED, D5.RV_INSTANCE_SHOW_FAILED));
        this.f29212m.put(B0.AD_FORMAT_CAPPED, new a(D5.RV_AD_UNIT_CAPPED, null));
        this.f29212m.put(B0.COLLECT_TOKEN, new a(D5.RV_COLLECT_TOKENS, null));
        this.f29212m.put(B0.COLLECT_TOKENS_COMPLETED, new a(D5.RV_COLLECT_TOKENS_COMPLETED, null));
        this.f29212m.put(B0.COLLECT_TOKENS_FAILED, new a(D5.RV_COLLECT_TOKENS_FAILED, null));
        this.f29212m.put(B0.INSTANCE_COLLECT_TOKEN, new a(D5.RV_INSTANCE_COLLECT_TOKEN, null));
        Map<B0, a> map3 = this.f29212m;
        B0 b03 = B0.INSTANCE_COLLECT_TOKEN_SUCCESS;
        D5 d53 = D5.RV_INSTANCE_COLLECT_TOKEN_SUCCESS;
        map3.put(b03, new a(d53, d53));
        Map<B0, a> map4 = this.f29212m;
        B0 b04 = B0.INSTANCE_COLLECT_TOKEN_FAILED;
        D5 d54 = D5.RV_INSTANCE_COLLECT_TOKEN_FAILED;
        map4.put(b04, new a(d54, d54));
        Map<B0, a> map5 = this.f29212m;
        B0 b05 = B0.INSTANCE_COLLECT_TOKEN_TIMED_OUT;
        D5 d55 = D5.RV_INSTANCE_COLLECT_TOKEN_TIMED_OUT;
        map5.put(b05, new a(d55, d55));
        this.f29212m.put(B0.AD_READY_TRUE, new a(D5.RV_CHECK_READY_TRUE, null));
        this.f29212m.put(B0.AD_READY_FALSE, new a(D5.RV_CHECK_READY_FALSE, null));
        this.f29212m.put(B0.OPERATIONAL_LOAD_AD, new a(D5.RV_OPERATIONAL_LOAD_AD, null));
        this.f29212m.put(B0.OPERATIONAL_LOAD_SUCCESS, new a(D5.RV_OPERATIONAL_LOAD_SUCCESS, null));
        this.f29212m.put(B0.OPERATIONAL_LOAD_FAILED, new a(D5.RV_OPERATIONAL_LOAD_FAILED, null));
        this.f29212m.put(B0.OPERATIONAL_SET_CONFIGURATIONS, new a(D5.RV_SET_CONFIGURATION, null));
        Map<B0, a> map6 = this.f29212m;
        B0 b06 = B0.TROUBLESHOOT_PROVIDER_SETTINGS_MISSING;
        D5 d56 = D5.TROUBLESHOOTING_RV_PROVIDER_SETTINGS_MISSING;
        map6.put(b06, new a(d56, d56));
        Map<B0, a> map7 = this.f29212m;
        B0 b07 = B0.TROUBLESHOOT_UNEXPECTED_INIT_SUCCESS;
        D5 d57 = D5.TROUBLESHOOTING_RV_UNEXPECTED_INIT_SUCCESS;
        map7.put(b07, new a(d57, d57));
        Map<B0, a> map8 = this.f29212m;
        B0 b08 = B0.TROUBLESHOOT_UNEXPECTED_INIT_FAILED;
        D5 d58 = D5.TROUBLESHOOTING_RV_UNEXPECTED_INIT_FAILED;
        map8.put(b08, new a(d58, d58));
        Map<B0, a> map9 = this.f29212m;
        B0 b09 = B0.TROUBLESHOOT_UNEXPECTED_AUCTION_SUCCESS;
        D5 d59 = D5.TROUBLESHOOTING_RV_UNEXPECTED_AUCTION_SUCCESS;
        map9.put(b09, new a(d59, d59));
        Map<B0, a> map10 = this.f29212m;
        B0 b010 = B0.TROUBLESHOOT_UNEXPECTED_AUCTION_FAILED;
        D5 d510 = D5.TROUBLESHOOTING_RV_UNEXPECTED_AUCTION_FAILED;
        map10.put(b010, new a(d510, d510));
        Map<B0, a> map11 = this.f29212m;
        B0 b011 = B0.TROUBLESHOOT_UNEXPECTED_LOAD_SUCCESS;
        D5 d511 = D5.TROUBLESHOOTING_RV_UNEXPECTED_LOAD_SUCCESS;
        map11.put(b011, new a(d511, d511));
        Map<B0, a> map12 = this.f29212m;
        B0 b012 = B0.TROUBLESHOOT_UNEXPECTED_LOAD_FAILED;
        D5 d512 = D5.TROUBLESHOOTING_RV_UNEXPECTED_LOAD_FAILED;
        map12.put(b012, new a(d512, d512));
        Map<B0, a> map13 = this.f29212m;
        B0 b013 = B0.TROUBLESHOOT_UNEXPECTED_SHOW_FAILED;
        D5 d513 = D5.TROUBLESHOOTING_RV_UNEXPECTED_SHOW_FAILED;
        map13.put(b013, new a(d513, d513));
        Map<B0, a> map14 = this.f29212m;
        B0 b014 = B0.TROUBLESHOOT_UNEXPECTED_TIMEOUT;
        D5 d514 = D5.TROUBLESHOOTING_RV_UNEXPECTED_TIMEOUT;
        map14.put(b014, new a(d514, d514));
        Map<B0, a> map15 = this.f29212m;
        B0 b015 = B0.TROUBLESHOOT_UNEXPECTED_CLOSED;
        D5 d515 = D5.TROUBLESHOOTING_RV_UNEXPECTED_CLOSED;
        map15.put(b015, new a(d515, d515));
        Map<B0, a> map16 = this.f29212m;
        B0 b016 = B0.TROUBLESHOOT_LOAD_FAILED;
        D5 d516 = D5.TROUBLESHOOTING_RV_LOAD_FAILED;
        map16.put(b016, new a(d516, d516));
        Map<B0, a> map17 = this.f29212m;
        B0 b017 = B0.TROUBLESHOOT_INTERNAL_ERROR;
        D5 d517 = D5.TROUBLESHOOTING_RV_INTERNAL_ERROR;
        map17.put(b017, new a(d517, d517));
        Map<B0, a> map18 = this.f29212m;
        B0 b018 = B0.TROUBLESHOOT_ADAPTER_REPOSITORY_INTERNAL_ERROR;
        D5 d518 = D5.TROUBLESHOOTING_ADAPTER_REPOSITORY_INTERNAL_ERROR;
        map18.put(b018, new a(d518, d518));
        Map<B0, a> map19 = this.f29212m;
        B0 b019 = B0.TROUBLESHOOT_WATERFALL_OVERHEAD;
        D5 d519 = D5.TROUBLESHOOTING_RV_WATERFALL_OVERHEAD;
        map19.put(b019, new a(d519, d519));
        this.f29212m.put(B0.TROUBLESHOOT_NOTIFICATION_ERROR, new a(D5.TROUBLESHOOTING_RV_NOTIFICATIONS_ERROR, null));
        Map<B0, a> map20 = this.f29212m;
        B0 b020 = B0.TROUBLESHOOT_AD_EXPIRED;
        D5 d520 = D5.TROUBLESHOOTING_RV_AD_EXPIRED;
        map20.put(b020, new a(d520, d520));
        this.f29212m.put(B0.TROUBLESHOOT_LOAD, new a(D5.TROUBLESHOOTING_RV_LOAD, null));
        this.f29212m.put(B0.TROUBLESHOOT_LOAD_WHILE_LOADED, new a(D5.TROUBLESHOOTING_RV_LOAD_WHILE_LOADED, null));
        this.f29212m.put(B0.TROUBLESHOOT_LOAD_SUCCESS, new a(D5.TROUBLESHOOTING_RV_LOAD_SUCCESS, null));
        this.f29212m.put(B0.TROUBLESHOOT_SHOW, new a(D5.TROUBLESHOOTING_RV_SHOW, null));
        this.f29212m.put(B0.TROUBLESHOOT_SHOW_SUCCESS, new a(D5.TROUBLESHOOTING_RV_SHOW_SUCCESS, null));
        this.f29212m.put(B0.TROUBLESHOOT_SHOW_FAILED, new a(D5.TROUBLESHOOTING_RV_SHOW_FAILED, null));
        Map<B0, a> map21 = this.f29212m;
        B0 b021 = B0.TROUBLESHOOT_ILLEGAL_STATE;
        D5 d521 = D5.TROUBLESHOOTING_RV_ILLEGAL_STATE;
        map21.put(b021, new a(d521, d521));
        this.f29212m.put(B0.TROUBLESHOOT_AD_INFO_CHANGED, new a(D5.TROUBLESHOOT_RV_AD_INFO_CHANGED, null));
        this.f29212m.put(B0.TROUBLESHOOT_DESTROY_INSTANCES_READY_TO_SHOW, new a(D5.TROUBLESHOOTING_RV_DESTROY_READY_TO_SHOW_INSTANCES, null));
        this.f29212m.put(B0.TROUBLESHOOT_ILR_REVENUE, new a(D5.TROUBLESHOOTING_RV_ILR_REVENUE, null));
        this.f29212m.put(B0.TROUBLESHOOT_SHOW_RECOVERY_INITIATED, new a(D5.TROUBLESHOOT_RV_SHOW_RECOVERY_INITIATED, null));
    }

    public void f() {
        this.f29202c = null;
        this.f29206g = null;
        this.f29207h = null;
        this.f29204e = null;
        this.f29205f = null;
        this.f29208i = null;
        this.f29209j = null;
        this.f29210k = null;
    }
}
