package com.mbridge.msdk.mbnative.controller;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.drawable.BitmapDrawable;
import android.os.Handler;
import android.os.Looper;
import android.os.Message;
import android.text.TextUtils;
import android.util.Log;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewTreeObserver;
import android.widget.FrameLayout;
import android.widget.ImageView;
import androidx.constraintlayout.core.motion.utils.TypedValues;
import androidx.multidex.MultiDexExtractor;
import androidx.room.RoomMasterTable;
import com.iab.omid.library.mmadbridge.adsession.AdEvents;
import com.iab.omid.library.mmadbridge.adsession.AdSession;
import com.iab.omid.library.mmadbridge.adsession.FriendlyObstructionPurpose;
import com.mbridge.msdk.MBridgeConstans;
import com.mbridge.msdk.foundation.download.download.H5DownLoadManager;
import com.mbridge.msdk.foundation.download.download.HTMLResourceManager;
import com.mbridge.msdk.foundation.download.download.ResourceManager;
import com.mbridge.msdk.foundation.entity.CampaignEx;
import com.mbridge.msdk.foundation.entity.CampaignUnit;
import com.mbridge.msdk.foundation.same.c;
import com.mbridge.msdk.foundation.same.task.a;
import com.mbridge.msdk.foundation.tools.SameMD5;
import com.mbridge.msdk.foundation.tools.b1;
import com.mbridge.msdk.foundation.tools.k0;
import com.mbridge.msdk.foundation.tools.m0;
import com.mbridge.msdk.foundation.tools.o0;
import com.mbridge.msdk.foundation.tools.q0;
import com.mbridge.msdk.foundation.tools.v0;
import com.mbridge.msdk.interstitial.view.MBInterstitialActivity;
import com.mbridge.msdk.mbnative.controller.c;
import com.mbridge.msdk.nativex.view.MBMediaView;
import com.mbridge.msdk.out.Campaign;
import com.mbridge.msdk.out.Frame;
import com.mbridge.msdk.out.NativeListener;
import com.unity3d.services.core.fid.Constants;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Hashtable;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import java.util.Queue;
import java.util.Timer;
import java.util.TimerTask;
import java.util.concurrent.CopyOnWriteArrayList;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes9.dex */
public class NativeController extends com.mbridge.msdk.mbnative.controller.a {

    /* JADX INFO: renamed from: c0, reason: collision with root package name */
    private static final String f38609c0 = "NativeController";

    /* JADX INFO: renamed from: d0, reason: collision with root package name */
    public static Map<String, Long> f38610d0 = new HashMap();

    /* JADX INFO: renamed from: e0, reason: collision with root package name */
    private static boolean f38611e0;
    private int A;
    private int B;
    private com.mbridge.msdk.foundation.same.task.b C;
    private List<com.mbridge.msdk.mbnative.controller.c> D;
    private List<c.d> E;
    private CopyOnWriteArrayList<com.mbridge.msdk.foundation.same.task.a> F;
    private Hashtable<String, AdSession> G;
    private int H;
    private int I;
    private n J;
    private boolean K;
    private boolean L;
    private Timer M;
    private String N;
    private String O;
    private ViewTreeObserver.OnGlobalLayoutListener P;
    private com.mbridge.msdk.setting.l Q;
    private long R;
    private int S;
    private int T;
    private boolean U;
    private int V;
    private int W;
    private boolean X;
    private List<Campaign> Y;
    private String Z;

    /* JADX INFO: renamed from: a0, reason: collision with root package name */
    private AdSession f38612a0;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public List<Integer> f38613b;

    /* JADX INFO: renamed from: b0, reason: collision with root package name */
    private AdEvents f38614b0;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public List<Integer> f38615c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public Map<String, Object> f38616d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private com.mbridge.msdk.setting.j f38617e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private com.mbridge.msdk.mbnative.listener.a f38618f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private NativeListener.NativeTrackingListener f38619g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private Context f38620h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private String f38621i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private String f38622j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    private Queue<Integer> f38623k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    private Queue<Long> f38624l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    private String f38625m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private com.mbridge.msdk.foundation.same.report.h f38626n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    private String f38627o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    private com.mbridge.msdk.click.a f38628p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    private int f38629q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    private int f38630r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    private int f38631s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    private int f38632t;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    private String f38633u;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    private boolean f38634v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    private boolean f38635w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    private boolean f38636x;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    private int f38637y;

    /* JADX INFO: renamed from: z, reason: collision with root package name */
    private int f38638z;

    public class a implements Runnable {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final /* synthetic */ List f38639a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final /* synthetic */ NativeListener.NativeAdListener f38640b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final /* synthetic */ int f38641c;

        public a(List list, NativeListener.NativeAdListener nativeAdListener, int i10) {
            this.f38639a = list;
            this.f38640b = nativeAdListener;
            this.f38641c = i10;
        }

        @Override // java.lang.Runnable
        public void run() {
            List list = this.f38639a;
            if (list != null && list.size() > 0) {
                CampaignEx campaignEx = (CampaignEx) this.f38639a.get(0);
                NativeController.this.O = campaignEx.getRequestId();
                NativeController.this.Y = this.f38639a;
            }
            NativeController.this.f38634v = true;
            this.f38640b.onAdLoaded(this.f38639a, this.f38641c);
            com.mbridge.msdk.mbnative.report.a.a(NativeController.this.f38620h, (List<Campaign>) this.f38639a, NativeController.this.f38621i);
        }
    }

    public class b implements Runnable {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final /* synthetic */ com.mbridge.msdk.mbnative.listener.a f38643a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final /* synthetic */ CampaignEx f38644b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final /* synthetic */ String f38645c;

        public b(com.mbridge.msdk.mbnative.listener.a aVar, CampaignEx campaignEx, String str) {
            this.f38643a = aVar;
            this.f38644b = campaignEx;
            this.f38645c = str;
        }

        @Override // java.lang.Runnable
        public void run() {
            this.f38643a.a(this.f38644b, this.f38645c);
        }
    }

    public class c implements com.mbridge.msdk.foundation.same.image.c {
        public c() {
        }

        @Override // com.mbridge.msdk.foundation.same.image.c
        public void onFailedLoad(String str, String str2) {
        }

        @Override // com.mbridge.msdk.foundation.same.image.c
        public void onSuccessLoad(Bitmap bitmap, String str) {
        }
    }

    public class d extends TimerTask {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final /* synthetic */ long f38648a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final /* synthetic */ o f38649b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final /* synthetic */ List f38650c;

        public d(long j10, o oVar, List list) {
            this.f38648a = j10;
            this.f38649b = oVar;
            this.f38650c = list;
        }

        @Override // java.util.TimerTask, java.lang.Runnable
        public void run() {
            boolean z10;
            if (System.currentTimeMillis() - this.f38648a >= 60000) {
                this.f38649b.a();
                NativeController.this.c();
                return;
            }
            int iS = m0.s(NativeController.this.f38620h);
            int iQ = NativeController.this.h().q();
            if (iS != 9 && iQ == 2) {
                this.f38649b.a();
                NativeController.this.c();
                return;
            }
            if (iQ == 3) {
                this.f38649b.a();
                NativeController.this.c();
                return;
            }
            loop0: while (true) {
                z10 = false;
                for (Campaign campaign : this.f38650c) {
                    String id2 = campaign.getId();
                    if (campaign instanceof CampaignEx) {
                        StringBuilder sb2 = new StringBuilder();
                        sb2.append(id2);
                        CampaignEx campaignEx = (CampaignEx) campaign;
                        sb2.append(campaignEx.getVideoUrlEncode());
                        sb2.append(campaignEx.getBidToken());
                        id2 = sb2.toString();
                    }
                    com.mbridge.msdk.videocommon.download.a aVarA = com.mbridge.msdk.videocommon.download.b.getInstance().a(NativeController.this.f38621i, id2);
                    if (aVarA == null || !com.mbridge.msdk.videocommon.download.l.a(aVarA, NativeController.this.h().C())) {
                        break;
                    } else {
                        z10 = true;
                    }
                }
            }
            if (z10) {
                this.f38649b.a();
                NativeController.this.c();
            }
        }
    }

    public class e implements ViewTreeObserver.OnGlobalLayoutListener {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final /* synthetic */ ImageView f38652a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final /* synthetic */ View f38653b;

        public e(ImageView imageView, View view) {
            this.f38652a = imageView;
            this.f38653b = view;
        }

        @Override // android.view.ViewTreeObserver.OnGlobalLayoutListener
        public void onGlobalLayout() {
            if (this.f38652a != null) {
                this.f38652a.setLayoutParams(new FrameLayout.LayoutParams(this.f38653b.getWidth(), this.f38653b.getHeight()));
            }
        }
    }

    public class f extends com.mbridge.msdk.widget.a {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final /* synthetic */ CampaignEx f38655b;

        public f(CampaignEx campaignEx) {
            this.f38655b = campaignEx;
        }

        @Override // com.mbridge.msdk.widget.a
        public void a(View view) {
            NativeController.this.b(view.getContext(), this.f38655b);
        }
    }

    public class g extends com.mbridge.msdk.widget.a {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final /* synthetic */ CampaignEx f38657b;

        public g(CampaignEx campaignEx) {
            this.f38657b = campaignEx;
        }

        @Override // com.mbridge.msdk.widget.a
        public void a(View view) {
            NativeController.this.b(view.getContext(), this.f38657b);
        }
    }

    public class h implements com.mbridge.msdk.widget.dialog.b {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final /* synthetic */ CampaignEx f38659a;

        public h(CampaignEx campaignEx) {
            this.f38659a = campaignEx;
        }

        @Override // com.mbridge.msdk.widget.dialog.b
        public void a() {
        }

        @Override // com.mbridge.msdk.widget.dialog.b
        public void b() {
            NativeController.this.f38628p.a(this.f38659a, NativeController.this.f38618f);
            NativeController.this.b(this.f38659a);
        }

        @Override // com.mbridge.msdk.widget.dialog.b
        public void c() {
        }
    }

    public class i extends com.mbridge.msdk.widget.a {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final /* synthetic */ CampaignEx f38661b;

        public i(CampaignEx campaignEx) {
            this.f38661b = campaignEx;
        }

        @Override // com.mbridge.msdk.widget.a
        public void a(View view) {
            NativeController.this.b(view.getContext(), this.f38661b);
        }
    }

    public class j implements a.InterfaceC0449a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final /* synthetic */ s f38663a;

        public j(s sVar) {
            this.f38663a = sVar;
        }

        @Override // com.mbridge.msdk.foundation.same.task.a.InterfaceC0449a
        public void a(a.b bVar) {
            if (bVar != a.b.FINISH || NativeController.this.F == null || NativeController.this.F.size() <= 0 || !NativeController.this.F.contains(this.f38663a)) {
                return;
            }
            NativeController.this.F.remove(this.f38663a);
        }
    }

    public class k implements c.d {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final /* synthetic */ CampaignEx f38665a;

        public k(CampaignEx campaignEx) {
            this.f38665a = campaignEx;
        }

        @Override // com.mbridge.msdk.mbnative.controller.c.d
        public void a(ArrayList<View> arrayList, ArrayList<View> arrayList2) {
            if (arrayList == null || arrayList.isEmpty()) {
                return;
            }
            com.mbridge.msdk.mbnative.report.b.a(this.f38665a, NativeController.this.f38620h, NativeController.this.f38621i, NativeController.this.f38618f);
        }
    }

    public class l implements o {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final /* synthetic */ List f38667a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final /* synthetic */ int f38668b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final /* synthetic */ com.mbridge.msdk.mbnative.listener.a f38669c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public final /* synthetic */ List f38670d;

        public l(List list, int i10, com.mbridge.msdk.mbnative.listener.a aVar, List list2) {
            this.f38667a = list;
            this.f38668b = i10;
            this.f38669c = aVar;
            this.f38670d = list2;
        }

        @Override // com.mbridge.msdk.mbnative.controller.NativeController.o
        public void a() {
            List listA = NativeController.this.a((List<Campaign>) this.f38667a, true);
            if (listA == null || listA.size() <= 0) {
                NativeController.this.a(this.f38669c, "has no ads", (CampaignEx) this.f38670d.get(0));
            } else {
                NativeController.this.a((List<Campaign>) listA, this.f38668b, this.f38669c);
            }
        }
    }

    public class m implements o {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final /* synthetic */ List f38672a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final /* synthetic */ int f38673b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final /* synthetic */ com.mbridge.msdk.mbnative.listener.a f38674c;

        public m(List list, int i10, com.mbridge.msdk.mbnative.listener.a aVar) {
            this.f38672a = list;
            this.f38673b = i10;
            this.f38674c = aVar;
        }

        @Override // com.mbridge.msdk.mbnative.controller.NativeController.o
        public void a() {
            List listA = NativeController.this.a((List<Campaign>) this.f38672a, false);
            if (listA == null || listA.size() <= 0) {
                NativeController.this.a(this.f38674c, "has no ads", (CampaignEx) null);
            } else {
                NativeController.this.a((List<Campaign>) listA, this.f38673b, this.f38674c);
            }
        }
    }

    public class n extends com.mbridge.msdk.mbnative.service.net.b implements com.mbridge.msdk.foundation.same.task.d {

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        private Runnable f38677d;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private boolean f38676c = false;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        private boolean f38678e = true;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        private List<String> f38679f = null;

        public class a extends c.a {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public final /* synthetic */ CampaignEx f38681a;

            public a(CampaignEx campaignEx, com.mbridge.msdk.foundation.same.report.metrics.callback.a aVar) {
                this.f38681a = campaignEx;
            }

            @Override // com.mbridge.msdk.foundation.same.c.a
            public void a(String str, com.mbridge.msdk.foundation.same.report.metrics.c cVar) {
                com.mbridge.msdk.mbnative.report.a.a(str, cVar, this.f38681a, NativeController.this.f38620h, (com.mbridge.msdk.foundation.same.report.metrics.callback.a) null);
            }
        }

        public n() {
        }

        private void a(CampaignEx campaignEx, com.mbridge.msdk.foundation.same.report.metrics.c cVar, com.mbridge.msdk.foundation.same.report.metrics.callback.a aVar) {
            try {
                com.mbridge.msdk.foundation.same.c.a(campaignEx, NativeController.this.f38620h, cVar, new a(campaignEx, aVar));
            } catch (Exception e10) {
                if (MBridgeConstans.DEBUG) {
                    e10.printStackTrace();
                }
            }
        }

        @Override // com.mbridge.msdk.mbnative.service.net.b
        public void a(int i10, String str) {
            NativeController.this.U = true;
            if (this.f38676c) {
                if (NativeController.this.f38634v || !this.f38678e) {
                    return;
                }
                NativeController.this.a(str, a(), b(), (CampaignEx) null);
                return;
            }
            if (i10 == -1) {
                com.mbridge.msdk.mbnative.controller.d.b(NativeController.this.f38631s, this.unitId);
                NativeController.this.f38632t = 0;
            }
            Runnable runnable = this.f38677d;
            if (runnable != null) {
                NativeController.this.f38702a.removeCallbacks(runnable);
            }
            if (NativeController.this.f38634v) {
                return;
            }
            if (a() == 1 || this.f38678e) {
                NativeController.this.a(str, a(), b(), (CampaignEx) null);
            }
        }

        public void a(Runnable runnable) {
            this.f38677d = runnable;
        }

        @Override // com.mbridge.msdk.mbnative.service.net.b
        public void a(List<Frame> list) {
            if (this.f38676c) {
                return;
            }
            Runnable runnable = this.f38677d;
            if (runnable != null) {
                NativeController.this.f38702a.removeCallbacks(runnable);
            }
            if (list == null || list.size() == 0) {
                if (NativeController.this.f38618f != null) {
                    NativeController.this.f38634v = true;
                    NativeController.this.f38618f.onAdLoadError("frame is empty");
                    return;
                }
                return;
            }
            Iterator<Frame> it = list.iterator();
            while (it.hasNext()) {
                List<CampaignEx> campaigns = it.next().getCampaigns();
                if (campaigns == null || campaigns.size() == 0) {
                    if (NativeController.this.f38618f != null) {
                        NativeController.this.f38634v = true;
                        NativeController.this.f38618f.onAdLoadError("ads in frame is empty");
                        return;
                    }
                    return;
                }
                for (CampaignEx campaignEx : campaigns) {
                    if (NativeController.f38611e0) {
                        campaignEx.loadImageUrlAsyncWithBlock(null);
                        campaignEx.loadIconUrlAsyncWithBlock(null);
                    }
                }
            }
            if (NativeController.this.f38618f != null) {
                NativeController.this.f38618f.onAdFramesLoaded(list);
            }
        }

        @Override // com.mbridge.msdk.mbnative.service.net.b
        public void a(List<com.mbridge.msdk.tracker.network.g> list, CampaignUnit campaignUnit) {
            Integer num;
            boolean z10 = true;
            NativeController.this.U = true;
            com.mbridge.msdk.foundation.db.j jVarA = com.mbridge.msdk.foundation.db.j.a(com.mbridge.msdk.foundation.db.g.a(NativeController.this.f38620h));
            jVarA.d();
            Runnable runnable = this.f38677d;
            if (runnable != null) {
                NativeController.this.f38702a.removeCallbacks(runnable);
            }
            if (com.mbridge.msdk.util.b.a()) {
                NativeController.this.a(campaignUnit);
            }
            if (campaignUnit == null || campaignUnit.getAds() == null || campaignUnit.getAds().size() <= 0) {
                this.unitId = "0_" + this.unitId;
                com.mbridge.msdk.mbnative.controller.d.b(NativeController.this.f38631s, this.unitId);
                NativeController.this.f38632t = 0;
                return;
            }
            NativeController.this.f38627o = campaignUnit.getSessionId();
            ArrayList arrayList = new ArrayList();
            ArrayList arrayList2 = new ArrayList();
            ArrayList arrayList3 = new ArrayList();
            int i10 = 2;
            if (NativeController.this.S <= 0) {
                if (NativeController.this.S == -3) {
                    NativeController.this.S = campaignUnit.getAds().size();
                } else {
                    NativeController nativeController = NativeController.this;
                    nativeController.S = nativeController.f38630r;
                }
                if (NativeController.this.V != 0 && campaignUnit.getTemplate() == 2) {
                    NativeController nativeController2 = NativeController.this;
                    nativeController2.S = nativeController2.V;
                }
                if (NativeController.this.W != 0 && campaignUnit.getTemplate() == 3) {
                    NativeController nativeController3 = NativeController.this;
                    nativeController3.S = nativeController3.W;
                }
            }
            com.mbridge.msdk.foundation.same.report.metrics.e eVar = new com.mbridge.msdk.foundation.same.report.metrics.e();
            eVar.a("adtp", 42);
            if (TextUtils.isEmpty(b())) {
                eVar.a(CampaignEx.JSON_KEY_HB, 0);
            } else {
                eVar.a(CampaignEx.JSON_KEY_HB, 1);
            }
            com.mbridge.msdk.foundation.same.report.metrics.c cVarA = com.mbridge.msdk.foundation.same.report.metrics.d.b().a(true, b(), eVar, campaignUnit.getAds().get(0), this.unitId);
            int i11 = 0;
            while (i11 < campaignUnit.getAds().size()) {
                CampaignEx campaignEx = campaignUnit.getAds().get(i11);
                campaignEx.setLocalRequestId(cVarA.t());
                campaignEx.setCampaignUnitId(this.unitId);
                if (!TextUtils.isEmpty(NativeController.this.N)) {
                    campaignEx.setBidToken(NativeController.this.N);
                    campaignEx.setIsBidCampaign(z10);
                }
                if (NativeController.f38611e0) {
                    campaignEx.loadIconUrlAsyncWithBlock(null);
                    campaignEx.loadImageUrlAsyncWithBlock(null);
                }
                boolean zC = v0.c(NativeController.this.f38620h, campaignEx.getPackageName());
                NativeController nativeController4 = NativeController.this;
                nativeController4.a(nativeController4.f38620h, campaignEx);
                if (i11 < NativeController.this.f38630r && campaignEx.getOfferType() != 99) {
                    if (v0.c(campaignEx)) {
                        campaignEx.setRtinsType(zC ? 1 : i10);
                    }
                    if (com.mbridge.msdk.foundation.same.c.b(NativeController.this.f38620h, campaignEx)) {
                        arrayList.add(campaignEx);
                        if (!TextUtils.isEmpty(campaignEx.getVideoUrlEncode())) {
                            arrayList3.add(campaignEx);
                        }
                    } else {
                        v0.a(this.unitId, campaignEx, com.mbridge.msdk.foundation.same.a.f37715x);
                        NativeController.this.Z = "APP ALREADY INSTALLED";
                    }
                    a(campaignEx, null, null);
                }
                if (i11 < NativeController.this.S && campaignEx.getOfferType() != 99) {
                    if (v0.c(campaignEx)) {
                        campaignEx.setRtinsType(zC ? 1 : 2);
                    }
                    if (!zC || v0.c(campaignEx)) {
                        arrayList2.add(campaignEx);
                    }
                }
                if (!jVarA.a(campaignEx.getId())) {
                    com.mbridge.msdk.foundation.entity.g gVar = new com.mbridge.msdk.foundation.entity.g();
                    gVar.a(campaignEx.getId());
                    gVar.b(campaignEx.getFca());
                    gVar.c(campaignEx.getFcb());
                    gVar.a(0);
                    gVar.d(0);
                    gVar.a(System.currentTimeMillis());
                    jVarA.b(gVar);
                }
                com.mbridge.msdk.click.c.a(NativeController.this.f38620h, campaignEx.getMaitve(), campaignEx.getMaitve_src());
                i11++;
                z10 = true;
                i10 = 2;
            }
            NativeController.this.d(arrayList3);
            int type = campaignUnit.getAds().get(0) != null ? campaignUnit.getAds().get(0).getType() : 1;
            com.mbridge.msdk.mbnative.cache.b<String, List<Campaign>> bVarA = com.mbridge.msdk.mbnative.cache.c.a(type);
            if (bVarA != null) {
                bVarA.a(this.unitId, arrayList2, NativeController.this.N);
            }
            if (arrayList.size() == 0) {
                if (NativeController.this.Z.contains("INSTALLED")) {
                    NativeController.this.a("APP ALREADY INSTALLED", a(), b(), campaignUnit.getAds().get(0));
                    new com.mbridge.msdk.foundation.error.b(880021, "APP ALREADY INSTALLED");
                    return;
                } else {
                    NativeController.this.a("v3 response error", a(), b(), campaignUnit.getAds().get(0));
                    new com.mbridge.msdk.foundation.error.b(880003);
                    return;
                }
            }
            NativeController nativeController5 = NativeController.this;
            nativeController5.c((List<Campaign>) nativeController5.a(type, (List<Campaign>) nativeController5.a(arrayList)));
            if (com.mbridge.msdk.mbnative.controller.d.g().containsKey(this.unitId) && Boolean.TRUE.equals(com.mbridge.msdk.mbnative.controller.d.g().get(this.unitId))) {
                com.mbridge.msdk.mbnative.controller.d.a(NativeController.this.f38631s, this.unitId);
                return;
            }
            int iIntValue = (!com.mbridge.msdk.mbnative.controller.d.d().containsKey(this.unitId) || (num = com.mbridge.msdk.mbnative.controller.d.d().get(this.unitId)) == null) ? 1 : num.intValue();
            int i12 = NativeController.this.f38630r + NativeController.this.f38632t;
            NativeController.this.f38632t = i12 <= iIntValue ? i12 : 0;
        }

        @Override // com.mbridge.msdk.foundation.same.task.d
        public void a(boolean z10) {
            this.f38676c = z10;
        }

        public void b(List<String> list) {
            this.f38679f = list;
        }

        public void b(boolean z10) {
            this.f38678e = z10;
        }
    }

    public interface o {
        void a();
    }

    public class p implements Runnable {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private int f38683a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private com.mbridge.msdk.foundation.same.task.d f38684b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private int f38685c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        private String f38686d;

        public p(int i10, com.mbridge.msdk.foundation.same.task.d dVar, int i11, String str) {
            this.f38683a = i10;
            this.f38684b = dVar;
            this.f38685c = i11;
            this.f38686d = str;
        }

        @Override // java.lang.Runnable
        public void run() {
            this.f38684b.a(true);
            int i10 = this.f38683a;
            if (i10 == 1) {
                NativeController.this.U = true;
                NativeController.this.a("REQUEST_TIMEOUT", this.f38685c, this.f38686d, (CampaignEx) null);
            } else {
                if (i10 != 2) {
                    return;
                }
                if (!NativeController.this.f38634v || this.f38685c == 1) {
                    NativeController.this.a("REQUEST_TIMEOUT", this.f38685c, this.f38686d, (CampaignEx) null);
                }
            }
        }
    }

    public static class q implements H5DownLoadManager.IH5SourceDownloadListener {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private String f38688a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private CampaignEx f38689b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private long f38690c = System.currentTimeMillis();

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        private boolean f38691d;

        public q(String str, CampaignEx campaignEx, boolean z10) {
            this.f38691d = true;
            this.f38688a = str;
            this.f38689b = campaignEx;
            this.f38691d = z10;
        }

        @Override // com.mbridge.msdk.foundation.download.download.H5DownLoadManager.H5ResDownloadListerInter
        public void onFailed(String str, String str2) {
            try {
                if (this.f38691d) {
                    long jCurrentTimeMillis = System.currentTimeMillis() - this.f38690c;
                    com.mbridge.msdk.foundation.db.n.a(com.mbridge.msdk.foundation.db.g.a(com.mbridge.msdk.foundation.controller.c.n().d()));
                    com.mbridge.msdk.foundation.entity.n nVar = new com.mbridge.msdk.foundation.entity.n("2000043", 3, jCurrentTimeMillis + "", str, this.f38689b.getId(), this.f38688a, str2, "2");
                    nVar.n(this.f38689b.getRequestId());
                    nVar.k(this.f38689b.getCurrentLocalRid());
                    nVar.o(this.f38689b.getRequestIdNotice());
                    CampaignEx campaignEx = this.f38689b;
                    if (campaignEx != null && !TextUtils.isEmpty(campaignEx.getId())) {
                        nVar.b(this.f38689b.getId());
                    }
                    CampaignEx campaignEx2 = this.f38689b;
                    if (campaignEx2 != null) {
                        nVar.a(campaignEx2.getAdSpaceT());
                    }
                    nVar.a("1");
                    com.mbridge.msdk.foundation.same.report.g.a(nVar, this.f38688a, this.f38689b);
                }
            } catch (Exception e10) {
                q0.b(NativeController.f38609c0, com.mbridge.msdk.mbnative.common.a.a(e10));
            }
        }

        @Override // com.mbridge.msdk.foundation.download.download.H5DownLoadManager.H5ResDownloadListerInter
        public void onSuccess(String str, String str2, boolean z10) {
            try {
                if (this.f38691d) {
                    long jCurrentTimeMillis = System.currentTimeMillis() - this.f38690c;
                    com.mbridge.msdk.foundation.db.n.a(com.mbridge.msdk.foundation.db.g.a(com.mbridge.msdk.foundation.controller.c.n().d()));
                    com.mbridge.msdk.foundation.entity.n nVar = new com.mbridge.msdk.foundation.entity.n("2000043", 1, jCurrentTimeMillis + "", str, this.f38689b.getId(), this.f38688a, "", "2");
                    CampaignEx campaignEx = this.f38689b;
                    if (campaignEx != null && !TextUtils.isEmpty(campaignEx.getId())) {
                        nVar.b(this.f38689b.getId());
                    }
                    CampaignEx campaignEx2 = this.f38689b;
                    if (campaignEx2 != null) {
                        nVar.n(campaignEx2.getRequestId());
                        nVar.o(this.f38689b.getRequestIdNotice());
                        nVar.k(this.f38689b.getCurrentLocalRid());
                        nVar.a(this.f38689b.getAdSpaceT());
                    }
                    if (!TextUtils.isEmpty(str2)) {
                        nVar.q(str2);
                    }
                    nVar.a("1");
                    com.mbridge.msdk.foundation.same.report.g.a(nVar, this.f38688a, this.f38689b);
                }
            } catch (Exception e10) {
                q0.b(NativeController.f38609c0, com.mbridge.msdk.mbnative.common.a.a(e10));
            }
        }
    }

    public static class r extends Handler {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private WeakReference<NativeController> f38692a;

        public r(NativeController nativeController) {
            this.f38692a = new WeakReference<>(nativeController);
        }

        @Override // android.os.Handler
        public void handleMessage(Message message) {
            WeakReference<NativeController> weakReference;
            NativeController nativeController;
            super.handleMessage(message);
            try {
                if (message.what == 0 && (weakReference = this.f38692a) != null && (nativeController = weakReference.get()) != null) {
                    nativeController.f38626n.a(message.arg1, (String) message.obj);
                }
                if (message.what == 1) {
                    NativeController nativeController2 = null;
                    WeakReference<NativeController> weakReference2 = this.f38692a;
                    if (weakReference2 != null && weakReference2.get() != null) {
                        nativeController2 = this.f38692a.get();
                    }
                    if (nativeController2 != null) {
                        nativeController2.f38635w = true;
                        List<Campaign> listA = nativeController2.a(nativeController2.f38621i, nativeController2.f38630r, nativeController2.N);
                        if (nativeController2.f38634v) {
                            return;
                        }
                        nativeController2.c(listA);
                    }
                }
            } catch (Exception e10) {
                q0.b(NativeController.f38609c0, com.mbridge.msdk.mbnative.common.a.a(e10));
            }
        }
    }

    public static class s extends com.mbridge.msdk.foundation.same.task.a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private CampaignEx f38693a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private WeakReference<View> f38694b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private WeakReference<List<View>> f38695c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        private WeakReference<NativeController> f38696d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        private WeakReference<AdSession> f38697e;

        public s(CampaignEx campaignEx, View view, List<View> list, NativeController nativeController, AdSession adSession) {
            this.f38693a = campaignEx;
            this.f38694b = new WeakReference<>(view);
            this.f38695c = new WeakReference<>(list);
            this.f38696d = new WeakReference<>(nativeController);
            this.f38697e = new WeakReference<>(adSession);
        }

        @Override // com.mbridge.msdk.foundation.same.task.a
        public void cancelTask() {
        }

        @Override // com.mbridge.msdk.foundation.same.task.a
        public void pauseTask(boolean z10) {
        }

        @Override // com.mbridge.msdk.foundation.same.task.a
        public void runTask() {
            WeakReference<View> weakReference;
            try {
                if (this.f38696d == null || (weakReference = this.f38694b) == null || this.f38695c == null) {
                    return;
                }
                View view = weakReference.get();
                List<View> list = this.f38695c.get();
                NativeController nativeController = this.f38696d.get();
                WeakReference<AdSession> weakReference2 = this.f38697e;
                AdSession adSession = weakReference2 != null ? weakReference2.get() : null;
                if (view == null || nativeController == null) {
                    return;
                }
                nativeController.a(this.f38693a, view, list, adSession);
            } catch (Exception e10) {
                q0.b(NativeController.f38609c0, com.mbridge.msdk.mbnative.common.a.a(e10));
            }
        }
    }

    public static final class t implements H5DownLoadManager.ZipDownloadListener {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public String f38698a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public CampaignEx f38699b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private long f38700c = System.currentTimeMillis();

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        private boolean f38701d;

        public t(String str, CampaignEx campaignEx, boolean z10) {
            this.f38701d = true;
            this.f38698a = str;
            this.f38699b = campaignEx;
            this.f38701d = z10;
        }

        @Override // com.mbridge.msdk.foundation.download.download.H5DownLoadManager.H5ResDownloadListerInter
        public void onFailed(String str, String str2) {
            try {
                if (this.f38701d) {
                    long jCurrentTimeMillis = System.currentTimeMillis() - this.f38700c;
                    com.mbridge.msdk.foundation.db.n.a(com.mbridge.msdk.foundation.db.g.a(com.mbridge.msdk.foundation.controller.c.n().d()));
                    com.mbridge.msdk.foundation.entity.n nVar = new com.mbridge.msdk.foundation.entity.n("2000043", 3, jCurrentTimeMillis + "", str2, this.f38699b.getId(), this.f38698a, str, "1");
                    CampaignEx campaignEx = this.f38699b;
                    if (campaignEx != null && !TextUtils.isEmpty(campaignEx.getId())) {
                        nVar.b(this.f38699b.getId());
                    }
                    CampaignEx campaignEx2 = this.f38699b;
                    if (campaignEx2 != null) {
                        nVar.n(campaignEx2.getRequestId());
                        nVar.k(this.f38699b.getCurrentLocalRid());
                        nVar.o(this.f38699b.getRequestIdNotice());
                        nVar.a(this.f38699b.getAdSpaceT());
                    }
                    nVar.a("2");
                    com.mbridge.msdk.foundation.same.report.g.a(nVar, this.f38698a, this.f38699b);
                }
            } catch (Exception e10) {
                q0.b(NativeController.f38609c0, com.mbridge.msdk.mbnative.common.a.a(e10));
            }
        }

        @Override // com.mbridge.msdk.foundation.download.download.H5DownLoadManager.H5ResDownloadListerInter
        public void onSuccess(String str, String str2, boolean z10) {
            try {
                if (this.f38701d) {
                    long jCurrentTimeMillis = System.currentTimeMillis() - this.f38700c;
                    com.mbridge.msdk.foundation.db.n.a(com.mbridge.msdk.foundation.db.g.a(com.mbridge.msdk.foundation.controller.c.n().d()));
                    com.mbridge.msdk.foundation.entity.n nVar = new com.mbridge.msdk.foundation.entity.n("2000043", 1, jCurrentTimeMillis + "", str, this.f38699b.getId(), this.f38698a, "", "1");
                    CampaignEx campaignEx = this.f38699b;
                    if (campaignEx != null && !TextUtils.isEmpty(campaignEx.getId())) {
                        nVar.b(this.f38699b.getId());
                    }
                    CampaignEx campaignEx2 = this.f38699b;
                    if (campaignEx2 != null) {
                        nVar.n(campaignEx2.getRequestId());
                        nVar.k(this.f38699b.getCurrentLocalRid());
                        nVar.o(this.f38699b.getRequestIdNotice());
                        nVar.a(this.f38699b.getAdSpaceT());
                    }
                    if (!TextUtils.isEmpty(str2)) {
                        nVar.q(str2);
                    }
                    nVar.a("2");
                    com.mbridge.msdk.foundation.same.report.g.a(nVar, this.f38698a, this.f38699b);
                }
            } catch (Exception e10) {
                q0.b(NativeController.f38609c0, com.mbridge.msdk.mbnative.common.a.a(e10));
            }
        }
    }

    public NativeController() {
        this.f38629q = 1;
        this.f38630r = 1;
        this.f38631s = -1;
        this.f38632t = 0;
        this.f38634v = false;
        this.f38635w = false;
        this.f38636x = false;
        this.f38637y = 0;
        this.f38638z = 0;
        this.A = 0;
        this.B = 0;
        this.F = new CopyOnWriteArrayList<>();
        this.G = new Hashtable<>();
        this.H = 1;
        this.I = 2;
        this.N = "";
        this.O = "";
        this.Z = "";
    }

    public NativeController(com.mbridge.msdk.mbnative.listener.a aVar, NativeListener.NativeTrackingListener nativeTrackingListener, Map<String, Object> map, Context context) {
        int iIntValue;
        Object obj;
        this.f38629q = 1;
        this.f38630r = 1;
        this.f38631s = -1;
        this.f38632t = 0;
        this.f38634v = false;
        this.f38635w = false;
        this.f38636x = false;
        this.f38637y = 0;
        this.f38638z = 0;
        this.A = 0;
        this.B = 0;
        this.F = new CopyOnWriteArrayList<>();
        this.G = new Hashtable<>();
        this.H = 1;
        this.I = 2;
        this.N = "";
        this.O = "";
        this.Z = "";
        this.f38620h = context;
        this.f38616d = map;
        this.f38617e = new com.mbridge.msdk.setting.j();
        this.f38618f = aVar;
        this.f38619g = nativeTrackingListener;
        this.D = new ArrayList();
        this.E = new ArrayList();
        String str = (String) map.get(MBridgeConstans.PROPERTIES_UNIT_ID);
        this.f38621i = str;
        if (TextUtils.isEmpty(str)) {
            return;
        }
        if (!map.containsKey(MBridgeConstans.PLACEMENT_ID) || map.get(MBridgeConstans.PLACEMENT_ID) == null) {
            this.f38622j = "";
        } else {
            this.f38622j = (String) map.get(MBridgeConstans.PLACEMENT_ID);
        }
        if (map.containsKey(MBridgeConstans.PREIMAGE) && (obj = map.get(MBridgeConstans.PREIMAGE)) != null) {
            f38611e0 = ((Boolean) obj).booleanValue();
        }
        this.f38623k = new LinkedList();
        this.f38624l = new LinkedList();
        this.C = new com.mbridge.msdk.foundation.same.task.b(this.f38620h);
        if (Looper.myLooper() == null) {
            Looper.prepare();
        }
        this.f38702a = new r(this);
        if (map.containsKey(MBridgeConstans.PROPERTIES_API_REUQEST_CATEGORY)) {
            this.f38633u = (String) map.get(MBridgeConstans.PROPERTIES_API_REUQEST_CATEGORY);
        }
        try {
            boolean zEquals = com.mbridge.msdk.mbnative.controller.d.g().containsKey(this.f38621i) ? Boolean.TRUE.equals(com.mbridge.msdk.mbnative.controller.d.g().get(this.f38621i)) : false;
            Object obj2 = map.get("ad_num");
            Object obj3 = map.get(MBridgeConstans.PROPERTIES_AD_FRAME_NUM);
            if (!zEquals) {
                if (map.containsKey("ad_num") && obj2 != null) {
                    try {
                        iIntValue = ((Integer) obj2).intValue();
                    } catch (Exception e10) {
                        if (MBridgeConstans.DEBUG) {
                            q0.b(f38609c0, e10.getMessage());
                        }
                        iIntValue = 1;
                    }
                    iIntValue = iIntValue < 1 ? 1 : iIntValue;
                    iIntValue = iIntValue > 10 ? 10 : iIntValue;
                    this.f38630r = iIntValue;
                    this.f38629q = iIntValue;
                }
                if (map.containsKey(MBridgeConstans.PROPERTIES_AD_FRAME_NUM) && obj3 != null) {
                    try {
                        this.A = ((Integer) obj3).intValue();
                    } catch (Exception e11) {
                        if (MBridgeConstans.DEBUG) {
                            q0.b(f38609c0, e11.getMessage());
                        }
                    }
                }
            } else if (com.mbridge.msdk.mbnative.controller.d.c().containsKey(this.f38621i)) {
                Integer num = com.mbridge.msdk.mbnative.controller.d.c().get(this.f38621i);
                if (num != null) {
                    this.f38630r = num.intValue();
                }
                if (map.containsKey("ad_num") && obj2 != null) {
                    int iIntValue2 = ((Integer) obj2).intValue();
                    this.f38637y = iIntValue2;
                    this.f38629q = iIntValue2;
                }
                if (map.containsKey(MBridgeConstans.PROPERTIES_AD_FRAME_NUM) && obj3 != null) {
                    int iIntValue3 = ((Integer) obj3).intValue();
                    this.f38638z = iIntValue3;
                    this.A = iIntValue3;
                }
            }
        } catch (Exception e12) {
            q0.b(f38609c0, com.mbridge.msdk.mbnative.common.a.a(e12));
        }
        this.f38626n = new com.mbridge.msdk.foundation.same.report.h(this.f38620h);
        this.f38628p = new com.mbridge.msdk.click.a(this.f38620h, this.f38621i);
        try {
            int i10 = MBMediaView.f39028p0;
            this.L = true;
            Map<String, Object> map2 = this.f38616d;
            if (map2 != null && (map2.containsKey(MBridgeConstans.NATIVE_VIDEO_WIDTH) || this.f38616d.containsKey(MBridgeConstans.NATIVE_VIDEO_HEIGHT) || map.containsKey(MBridgeConstans.NATIVE_VIDEO_SUPPORT))) {
                this.K = true;
            }
            com.mbridge.msdk.mbnative.controller.e.a(this.f38620h, this.f38621i);
            o0.a();
            if (TextUtils.isEmpty(this.f38621i)) {
                return;
            }
            com.mbridge.msdk.foundation.db.e.a(com.mbridge.msdk.foundation.db.g.a(this.f38620h)).d();
            int iA = a(map.containsKey(MBridgeConstans.NATIVE_INFO) ? (String) map.get(MBridgeConstans.NATIVE_INFO) : null);
            List<Campaign> listA = a(this.f38621i, iA <= 0 ? this.f38629q : iA);
            if (listA != null) {
                ArrayList arrayList = new ArrayList();
                for (int i11 = 0; i11 < listA.size(); i11++) {
                    CampaignEx campaignEx = (CampaignEx) listA.get(i11);
                    if (!TextUtils.isEmpty(campaignEx.getVideoUrlEncode())) {
                        arrayList.add(campaignEx);
                    }
                }
                if (arrayList.size() > 0) {
                    Object objInvoke = com.mbridge.msdk.videocommon.download.b.class.getMethod(Constants.GET_INSTANCE, new Class[0]).invoke(null, new Object[0]);
                    com.mbridge.msdk.videocommon.download.b.class.getMethod("createUnitCache", Context.class, String.class, CopyOnWriteArrayList.class, Integer.TYPE, com.mbridge.msdk.videocommon.listener.a.class).invoke(objInvoke, context, this.f38621i, new CopyOnWriteArrayList(arrayList), 1, null);
                    com.mbridge.msdk.videocommon.download.b.class.getMethod("load", String.class).invoke(objInvoke, this.f38621i);
                }
            }
        } catch (Throwable unused) {
            q0.b(f38609c0, "please import the nativex aar");
        }
    }

    private int a(String str) {
        if (str == null) {
            return 0;
        }
        try {
            JSONArray jSONArray = new JSONArray(str);
            if (jSONArray.length() > 0) {
                for (int i10 = 0; i10 < jSONArray.length(); i10++) {
                    JSONObject jSONObject = (JSONObject) jSONArray.opt(i10);
                    if (2 == jSONObject.optInt("id", 0)) {
                        return jSONObject.optInt("ad_num");
                    }
                }
            }
        } catch (Exception e10) {
            q0.b(f38609c0, com.mbridge.msdk.mbnative.common.a.a(e10));
        }
        return 0;
    }

    private AdSession a(CampaignEx campaignEx) {
        if (this.G == null) {
            this.G = new Hashtable<>();
        }
        String requestIdNotice = campaignEx.getRequestIdNotice();
        AdSession adSessionA = this.G.get(requestIdNotice);
        if (adSessionA == null && campaignEx.isActiveOm() && TextUtils.isEmpty(campaignEx.getVideoUrlEncode())) {
            adSessionA = com.mbridge.msdk.omsdk.b.a(this.f38620h, true, campaignEx.getOmid(), campaignEx.getRequestId(), campaignEx.getId(), this.f38621i, "", campaignEx.getRequestIdNotice());
        }
        if (adSessionA != null) {
            this.G.put(requestIdNotice, adSessionA);
        }
        return adSessionA;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public List<Campaign> a(int i10, List<Campaign> list) {
        if (i10 != 1 || !this.f38616d.containsKey(MBridgeConstans.NATIVE_INFO) || list == null || list.size() <= 0) {
            return list;
        }
        CampaignEx campaignEx = (CampaignEx) list.get(0);
        int template = campaignEx != null ? campaignEx.getTemplate() : 1;
        if (template == 2) {
            int size = list.size();
            int i11 = this.V;
            return size >= i11 ? list.subList(0, i11) : list;
        }
        if (template != 3) {
            return list;
        }
        int size2 = list.size();
        int i12 = this.W;
        return size2 >= i12 ? list.subList(0, i12) : list;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public List<Campaign> a(List<Campaign> list) {
        if (list == null) {
            return null;
        }
        ArrayList arrayList = new ArrayList(list.size());
        ArrayList arrayList2 = new ArrayList(list.size());
        for (Campaign campaign : list) {
            if (campaign instanceof CampaignEx) {
                CampaignEx campaignEx = (CampaignEx) campaign;
                if (TextUtils.isEmpty(this.N) && TextUtils.isEmpty(campaignEx.getBidToken()) && !campaignEx.isBidCampaign()) {
                    arrayList2.add(campaignEx);
                } else if (!TextUtils.isEmpty(this.N) && TextUtils.equals(campaignEx.getBidToken(), this.N)) {
                    arrayList.add(campaign);
                }
            } else {
                arrayList2.add(campaign);
            }
        }
        return TextUtils.isEmpty(this.N) ? arrayList2 : arrayList;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public List<Campaign> a(List<Campaign> list, boolean z10) {
        if (list != null) {
            for (int size = list.size() - 1; size >= 0; size--) {
                Campaign campaign = list.get(size);
                String id2 = campaign.getId();
                boolean z11 = campaign instanceof CampaignEx;
                if (z11) {
                    StringBuilder sb2 = new StringBuilder();
                    sb2.append(id2);
                    CampaignEx campaignEx = (CampaignEx) campaign;
                    sb2.append(campaignEx.getVideoUrlEncode());
                    sb2.append(campaignEx.getBidToken());
                    id2 = sb2.toString();
                }
                com.mbridge.msdk.videocommon.download.a aVarA = com.mbridge.msdk.videocommon.download.b.getInstance().a(this.f38621i, id2);
                if (z10) {
                    if (aVarA == null || !com.mbridge.msdk.videocommon.download.l.a(aVarA, h().C())) {
                        com.mbridge.msdk.mbnative.cache.c.a(campaign.getType()).a(this.f38621i, list.remove(size), this.N);
                    }
                } else if (z11) {
                    CampaignEx campaignEx2 = (CampaignEx) campaign;
                    if (TextUtils.isEmpty(campaignEx2.getImageUrl()) && !TextUtils.isEmpty(campaignEx2.getVideoUrlEncode()) && (aVarA == null || !com.mbridge.msdk.videocommon.download.l.a(aVarA, h().C()))) {
                        com.mbridge.msdk.mbnative.cache.c.a(campaign.getType()).a(this.f38621i, list.remove(size), this.N);
                    }
                }
            }
        }
        return list;
    }

    public static List<String> a(Map<String, Object> map) {
        Exception e10;
        ArrayList arrayList = null;
        try {
            if (!(map.get(MBridgeConstans.KEY_WORD) instanceof String)) {
                return null;
            }
            String str = (String) map.get(MBridgeConstans.KEY_WORD);
            if (TextUtils.isEmpty(str)) {
                return null;
            }
            JSONArray jSONArray = new JSONArray(str);
            if (jSONArray.length() == 0) {
                return null;
            }
            ArrayList arrayList2 = new ArrayList();
            for (int i10 = 0; i10 < jSONArray.length(); i10++) {
                try {
                    JSONObject jSONObjectOptJSONObject = jSONArray.optJSONObject(i10);
                    if (jSONObjectOptJSONObject != null) {
                        String strOptString = jSONObjectOptJSONObject.optString("p");
                        if (!TextUtils.isEmpty(strOptString)) {
                            arrayList2.add(strOptString);
                        }
                    }
                } catch (Exception e11) {
                    e10 = e11;
                    arrayList = arrayList2;
                }
            }
            return arrayList2;
        } catch (Exception e12) {
            e10 = e12;
        }
        q0.b(f38609c0, com.mbridge.msdk.mbnative.common.a.a(e10));
        return arrayList;
    }

    private void a(View view, CampaignEx campaignEx) {
        BitmapDrawable bitmapDrawableA;
        ImageView imageView;
        if (!(view instanceof FrameLayout) || (bitmapDrawableA = com.mbridge.msdk.foundation.controller.c.n().a(this.f38621i, campaignEx.getAdType())) == null) {
            return;
        }
        try {
            int childCount = ((ViewGroup) view).getChildCount();
            int i10 = 0;
            while (true) {
                if (i10 >= childCount) {
                    imageView = null;
                    break;
                }
                View childAt = ((ViewGroup) view).getChildAt(i10);
                if ((childAt instanceof ImageView) && childAt.getTag() != null && "mb_wm".equals((String) childAt.getTag())) {
                    ((ImageView) childAt).setLayoutParams(new FrameLayout.LayoutParams(view.getWidth(), view.getHeight()));
                    imageView = (ImageView) childAt;
                    break;
                }
                i10++;
            }
            if (imageView == null) {
                imageView = new ImageView(com.mbridge.msdk.foundation.controller.c.n().d());
                imageView.setTag("mb_wm");
                v0.a(imageView, bitmapDrawableA, view.getResources().getDisplayMetrics());
                if (imageView.getParent() == null) {
                    ((FrameLayout) view).addView(imageView, new FrameLayout.LayoutParams(view.getWidth(), view.getHeight()));
                }
                AdSession adSession = this.f38612a0;
                if (adSession != null) {
                    adSession.addFriendlyObstruction(imageView, FriendlyObstructionPurpose.OTHER, null);
                }
            }
            this.P = new e(imageView, view);
            view.getViewTreeObserver().addOnGlobalLayoutListener(this.P);
        } catch (Exception e10) {
            e10.printStackTrace();
        }
    }

    private void a(View view, Class cls) {
        if (view == null) {
            return;
        }
        if (cls != null) {
            try {
                if (cls.isInstance(view)) {
                    return;
                }
            } catch (Throwable unused) {
                return;
            }
        }
        view.setOnClickListener(null);
        if (view instanceof ViewGroup) {
            ViewGroup viewGroup = (ViewGroup) view;
            for (int i10 = 0; i10 < viewGroup.getChildCount(); i10++) {
                a(viewGroup.getChildAt(i10), cls);
            }
        }
    }

    private void a(CampaignEx campaignEx, View view, View.OnClickListener onClickListener, Class cls) {
        if (view == null || onClickListener == null) {
            return;
        }
        if (cls != null) {
            try {
                if (cls.isInstance(view)) {
                    return;
                }
            } catch (Throwable unused) {
                return;
            }
        }
        view.setOnClickListener(onClickListener);
        b1.a(view, campaignEx.getLocalRequestId(), campaignEx.getLocalAllowTrackClick());
        if (view instanceof ViewGroup) {
            ViewGroup viewGroup = (ViewGroup) view;
            for (int i10 = 0; i10 < viewGroup.getChildCount(); i10++) {
                a(campaignEx, viewGroup.getChildAt(i10), onClickListener, cls);
            }
        }
    }

    private void a(CampaignEx campaignEx, View view, List<View> list) {
        AdSession adSessionA;
        try {
            if (this.f38620h == null || campaignEx == null) {
                adSessionA = null;
            } else {
                adSessionA = a(campaignEx);
                if (adSessionA != null) {
                    adSessionA.registerAdView(view);
                    adSessionA.start();
                }
            }
            AdSession adSession = adSessionA;
            com.mbridge.msdk.setting.l lVar = this.Q;
            int iS = lVar != null ? lVar.s() : 0;
            if (campaignEx != null && campaignEx.getImpReportType() == 1) {
                iS = 0;
            }
            s sVar = new s(campaignEx, view, list, this, adSession);
            if (this.F == null) {
                this.F = new CopyOnWriteArrayList<>();
            }
            this.F.add(sVar);
            sVar.setOnStateChangeListener(new j(sVar));
            Handler handler = this.f38702a;
            if (handler != null) {
                handler.postDelayed(sVar, iS * 1000);
            }
        } catch (Exception e10) {
            q0.b(f38609c0, com.mbridge.msdk.mbnative.common.a.a(e10));
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void a(CampaignEx campaignEx, View view, List<View> list, AdSession adSession) {
        try {
            k kVar = new k(campaignEx);
            com.mbridge.msdk.mbnative.controller.c cVar = new com.mbridge.msdk.mbnative.controller.c(list, kVar, new Handler(Looper.getMainLooper()), campaignEx.getImpReportType());
            cVar.a(view);
            List<com.mbridge.msdk.mbnative.controller.c> list2 = this.D;
            if (list2 != null) {
                list2.add(cVar);
            }
            List<c.d> list3 = this.E;
            if (list3 != null) {
                list3.add(kVar);
            }
            AdEvents adEvents = this.f38614b0;
            if (adEvents != null) {
                adEvents.impressionOccurred();
            }
        } catch (Exception unused) {
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void a(com.mbridge.msdk.mbnative.listener.a aVar, String str, CampaignEx campaignEx) {
        this.f38702a.post(new b(aVar, campaignEx, str));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void a(List<Campaign> list, int i10, NativeListener.NativeAdListener nativeAdListener) {
        this.f38702a.post(new a(list, nativeAdListener, i10));
    }

    private void a(List<Campaign> list, o oVar) {
        c();
        long jCurrentTimeMillis = System.currentTimeMillis();
        Timer timer = new Timer();
        this.M = timer;
        timer.schedule(new d(jCurrentTimeMillis, oVar, list), 0L, 1000L);
    }

    private void a(boolean z10, int i10) {
        boolean zB;
        if (z10 && i10 == 1 && a(i10)) {
            return;
        }
        String strB = com.mbridge.msdk.foundation.controller.c.n().b();
        String strC = com.mbridge.msdk.foundation.controller.c.n().c();
        if (this.f38616d.containsKey("app_id") && this.f38616d.containsKey(MBridgeConstans.APP_KEY) && this.f38616d.containsKey(MBridgeConstans.KEY_WORD)) {
            strB = (String) this.f38616d.get("app_id");
            strC = (String) this.f38616d.get(MBridgeConstans.APP_KEY);
        }
        a(strB, strC);
        com.mbridge.msdk.setting.l lVarE = com.mbridge.msdk.setting.h.b().e(strB, this.f38621i);
        this.Q = lVarE;
        if (lVarE == null) {
            this.Q = com.mbridge.msdk.setting.l.i(this.f38621i);
        }
        com.mbridge.msdk.mbnative.controller.d.d().put(this.f38621i, Integer.valueOf(this.Q.y() * this.f38630r));
        this.f38613b = this.Q.b();
        this.f38615c = this.Q.c();
        this.T = this.Q.f();
        this.S = this.Q.e();
        this.f38630r = this.f38629q;
        List<Integer> list = this.f38613b;
        if (list == null || list.size() == 0) {
            com.mbridge.msdk.mbnative.listener.a aVar = this.f38618f;
            if (aVar != null) {
                this.f38634v = true;
                aVar.onAdLoadError("do not have sorceList");
                return;
            }
            return;
        }
        try {
            zB = com.mbridge.msdk.mbsignalcommon.webEnvCheck.a.b(com.mbridge.msdk.foundation.controller.c.n().d());
        } catch (Exception unused) {
            zB = false;
        }
        if (!zB) {
            com.mbridge.msdk.mbnative.listener.a aVar2 = this.f38618f;
            if (aVar2 != null) {
                aVar2.onAdLoadError("webview is not available");
                return;
            }
            return;
        }
        if (this.f38616d.containsKey(MBridgeConstans.NATIVE_INFO) && this.f38625m == null) {
            this.f38625m = (String) this.f38616d.get(MBridgeConstans.NATIVE_INFO);
            f();
        }
        if ((!this.f38613b.contains(1) || this.f38613b.get(0).intValue() == 1) && i10 == 0 && c(a(this.f38621i, this.f38630r, this.N))) {
            return;
        }
        this.X = true;
        if (this.f38613b.contains(1) && i10 == 0 && this.f38613b.get(0).intValue() != 1) {
            int iIntValue = this.f38613b.get(0).intValue();
            com.mbridge.msdk.mbnative.cache.b<String, List<Campaign>> bVarA = com.mbridge.msdk.mbnative.cache.c.a(iIntValue);
            if (iIntValue == 2 && this.f38616d.containsKey(MBridgeConstans.NATIVE_INFO)) {
                this.f38630r = this.H;
            } else {
                this.f38630r = this.f38629q;
            }
            if (bVarA != null && c(a(iIntValue, a(bVarA.a(this.f38621i, this.f38630r))))) {
                return;
            }
            this.X = false;
            try {
                a(this.f38615c.get(this.f38613b.indexOf(1)).intValue() * 1000, i10, false, this.f38621i, this.N);
            } catch (Exception unused2) {
            }
        }
        this.f38702a.sendEmptyMessageDelayed(1, this.Q.K() * 1000);
        j();
        b(i10, this.N);
    }

    private List<Campaign> b(List<Campaign> list) {
        ArrayList arrayList = null;
        if (list != null) {
            for (Campaign campaign : list) {
                if (campaign instanceof CampaignEx) {
                    CampaignEx campaignEx = (CampaignEx) campaign;
                    if (TextUtils.isEmpty(campaignEx.getImageUrl()) && !TextUtils.isEmpty(campaignEx.getVideoUrlEncode())) {
                        if (arrayList == null) {
                            arrayList = new ArrayList();
                        }
                        arrayList.add(campaign);
                    }
                }
            }
        }
        return arrayList;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void b(Context context, CampaignEx campaignEx) {
        if (campaignEx != null) {
            try {
                if (campaignEx.needShowIDialog() && com.mbridge.msdk.util.b.a()) {
                    h hVar = new h(campaignEx);
                    if (com.mbridge.msdk.click.c.a(campaignEx) && campaignEx.needShowIDialog()) {
                        if (a(this.f38628p, context, campaignEx, this.f38621i, hVar)) {
                            return;
                        }
                        b(campaignEx);
                        this.f38618f.onAdClick(campaignEx);
                        return;
                    }
                }
            } catch (Throwable th2) {
                q0.a(f38609c0, th2.getMessage());
            }
        }
        this.f38628p.a(campaignEx, this.f38618f);
        b(campaignEx);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void b(CampaignEx campaignEx) {
        if (campaignEx == null || campaignEx.isReportClick()) {
            return;
        }
        campaignEx.setReportClick(true);
        if (campaignEx.getNativeVideoTracking() == null || campaignEx.getNativeVideoTracking().i() == null) {
            return;
        }
        com.mbridge.msdk.click.a.a(this.f38620h, campaignEx, campaignEx.getCampaignUnitId(), campaignEx.getNativeVideoTracking().i(), false, false);
    }

    public static boolean b(Map<String, Object> map) {
        if (map == null) {
            return false;
        }
        try {
            if (map.containsKey("app_id") && map.containsKey(MBridgeConstans.APP_KEY) && map.containsKey(MBridgeConstans.KEY_WORD)) {
                return map.get(MBridgeConstans.KEY_WORD) != null;
            }
            return false;
        } catch (Exception e10) {
            q0.b(f38609c0, com.mbridge.msdk.mbnative.common.a.a(e10));
            return false;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void c() {
        Timer timer = this.M;
        if (timer != null) {
            timer.cancel();
            this.M = null;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public boolean c(List<Campaign> list) {
        if ((!TextUtils.isEmpty(this.N) && list != null && list.size() == 0) || list == null || list.size() <= 0) {
            return false;
        }
        com.mbridge.msdk.mbnative.listener.a aVar = this.f38618f;
        if (aVar == null) {
            return true;
        }
        CampaignEx campaignEx = (CampaignEx) list.get(0);
        if (campaignEx != null && campaignEx.isActiveOm()) {
            AdSession adSessionA = a(campaignEx);
            this.f38612a0 = adSessionA;
            if (adSessionA != null) {
                adSessionA.start();
                AdEvents adEventsCreateAdEvents = AdEvents.createAdEvents(this.f38612a0);
                this.f38614b0 = adEventsCreateAdEvents;
                adEventsCreateAdEvents.loaded();
            }
        }
        int template = campaignEx != null ? campaignEx.getTemplate() : 2;
        com.mbridge.msdk.foundation.db.j jVarA = com.mbridge.msdk.foundation.db.j.a(com.mbridge.msdk.foundation.db.g.a(this.f38620h));
        jVarA.d();
        for (int i10 = 0; i10 < list.size(); i10++) {
            CampaignEx campaignEx2 = (CampaignEx) list.get(i10);
            if (!jVarA.a(campaignEx2.getId())) {
                com.mbridge.msdk.foundation.entity.g gVar = new com.mbridge.msdk.foundation.entity.g();
                gVar.a(campaignEx2.getId());
                gVar.b(campaignEx2.getFca());
                gVar.c(campaignEx2.getFcb());
                gVar.a(0);
                gVar.d(0);
                gVar.a(System.currentTimeMillis());
                jVarA.b(gVar);
            }
        }
        if (!this.L || !this.K) {
            if (list.size() <= 0) {
                a(aVar, "has no ads", (CampaignEx) null);
                return true;
            }
            Iterator<Campaign> it = list.iterator();
            while (it.hasNext()) {
                it.next().setVideoLength(0);
            }
            a(list, template, aVar);
            return true;
        }
        if (h().m() == 3) {
            List<Campaign> listE = e(list);
            if (list.size() > 0) {
                a(list, new l(listE, template, aVar, list));
                return true;
            }
            a(aVar, "has no ads", (CampaignEx) null);
            return true;
        }
        List<Campaign> listB = b(list);
        if (listB == null || listB.size() <= 0) {
            a(list, template, aVar);
            return true;
        }
        a(listB, new m(list, template, aVar));
        return true;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void d(List<CampaignEx> list) {
        if (list != null) {
            try {
                if (list.size() > 0) {
                    try {
                        int i10 = MBMediaView.f39028p0;
                        Object objInvoke = com.mbridge.msdk.videocommon.download.b.class.getMethod(Constants.GET_INSTANCE, new Class[0]).invoke(null, new Object[0]);
                        if (objInvoke != null) {
                            com.mbridge.msdk.videocommon.download.b.class.getMethod("createUnitCache", Context.class, String.class, CopyOnWriteArrayList.class, Integer.TYPE, com.mbridge.msdk.videocommon.listener.a.class).invoke(objInvoke, this.f38620h, this.f38621i, new CopyOnWriteArrayList(list), 1, null);
                            com.mbridge.msdk.videocommon.download.b.class.getMethod("load", String.class).invoke(objInvoke, this.f38621i);
                        }
                        Iterator<CampaignEx> it = list.iterator();
                        while (it.hasNext()) {
                            CampaignEx next = it.next();
                            if (next != null && !TextUtils.isEmpty(next.getImageUrl())) {
                                com.mbridge.msdk.foundation.same.image.b.a(com.mbridge.msdk.foundation.controller.c.n().d()).a(next.getImageUrl(), new c());
                            }
                            String str = "";
                            if (next != null) {
                                try {
                                    str = next.getendcard_url();
                                } catch (Exception unused) {
                                }
                            }
                            com.mbridge.msdk.foundation.same.report.metrics.c cVar = new com.mbridge.msdk.foundation.same.report.metrics.c();
                            cVar.a(next);
                            if (!TextUtils.isEmpty(str)) {
                                cVar.f((next == null || next.getAabEntity() == null) ? 0 : next.getAabEntity().h3c);
                                if (str.contains(MultiDexExtractor.EXTRACTED_SUFFIX) && str.contains(ResourceManager.KEY_MD5FILENAME)) {
                                    H5DownLoadManager.getInstance().downloadH5Res(cVar, str, new t(this.f38621i, next, TextUtils.isEmpty(H5DownLoadManager.getInstance().getH5ResAddress(str))));
                                } else {
                                    H5DownLoadManager.getInstance().downloadH5Res(cVar, str, new q(this.f38621i, next, TextUtils.isEmpty(HTMLResourceManager.getInstance().getHtmlContentFromUrl(str))));
                                }
                            }
                        }
                    } catch (Throwable unused2) {
                        q0.b(f38609c0, "please import the videocommon and nativex aar");
                    }
                }
            } catch (Throwable th2) {
                if (MBridgeConstans.DEBUG) {
                    th2.printStackTrace();
                }
            }
        }
    }

    private List<Campaign> e(List<Campaign> list) {
        if (list != null) {
            CampaignEx campaignEx = null;
            for (int size = list.size() - 1; size >= 0; size--) {
                try {
                    campaignEx = (CampaignEx) list.get(size);
                } catch (Throwable th2) {
                    th2.printStackTrace();
                }
                if (campaignEx != null && TextUtils.isEmpty(campaignEx.getVideoUrlEncode())) {
                    Campaign campaignRemove = list.remove(size);
                    com.mbridge.msdk.mbnative.cache.c.a(campaignEx.getType()).a(this.f38621i, campaignRemove, this.N);
                    q0.a(f38609c0, "remove no videoURL ads:" + campaignRemove);
                }
            }
        }
        return list;
    }

    private void f() {
        try {
            if (this.f38625m == null) {
                return;
            }
            JSONArray jSONArray = new JSONArray(this.f38625m);
            if (jSONArray.length() > 0) {
                for (int i10 = 0; i10 < jSONArray.length(); i10++) {
                    JSONObject jSONObject = (JSONObject) jSONArray.opt(i10);
                    int iOptInt = jSONObject.optInt("id", 0);
                    if (2 == iOptInt) {
                        this.V = jSONObject.optInt("ad_num");
                        if (this.T > 0) {
                            jSONObject.remove("ad_num");
                            jSONObject.put("ad_num", this.T);
                        }
                    } else if (3 == iOptInt) {
                        this.W = jSONObject.optInt("ad_num");
                        if (this.T > 0) {
                            jSONObject.remove("ad_num");
                            jSONObject.put("ad_num", this.T);
                        }
                    }
                }
            }
            this.H = Math.max(this.V, this.W);
            this.f38625m = jSONArray.toString();
        } catch (JSONException e10) {
            q0.b(f38609c0, com.mbridge.msdk.mbnative.common.a.a(e10));
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public com.mbridge.msdk.setting.l h() {
        com.mbridge.msdk.setting.l lVarE = com.mbridge.msdk.setting.h.b().e("", this.f38621i);
        this.Q = lVarE;
        if (lVarE == null) {
            this.Q = com.mbridge.msdk.setting.l.i(this.f38621i);
        }
        return this.Q;
    }

    public List<Campaign> a(String str, int i10) {
        com.mbridge.msdk.mbnative.cache.b<String, List<Campaign>> bVarA;
        com.mbridge.msdk.setting.l lVarE = com.mbridge.msdk.setting.h.b().e("", str);
        this.Q = lVarE;
        if (lVarE == null) {
            this.Q = com.mbridge.msdk.setting.l.i(str);
        }
        List<Integer> listB = this.Q.b();
        this.f38613b = listB;
        if (listB == null || listB.size() <= 0 || !this.f38613b.contains(1) || (bVarA = com.mbridge.msdk.mbnative.cache.c.a(1)) == null) {
            return null;
        }
        return bVarA.a(str, i10);
    }

    public List<Campaign> a(String str, int i10, String str2) {
        List<Campaign> listA = null;
        if (this.f38613b != null) {
            ArrayList arrayList = new ArrayList(this.f38613b);
            for (int i11 = 0; i11 < arrayList.size(); i11++) {
                com.mbridge.msdk.mbnative.cache.b<String, List<Campaign>> bVarA = com.mbridge.msdk.mbnative.cache.c.a(((Integer) arrayList.get(i11)).intValue());
                if (bVarA != null) {
                    listA = a(((Integer) arrayList.get(i11)).intValue(), bVarA.a(str, ((((Integer) arrayList.get(i11)).intValue() == 1 || ((Integer) arrayList.get(i11)).intValue() == 2) && this.f38616d.containsKey(MBridgeConstans.NATIVE_INFO)) ? this.H : this.f38629q));
                    if (listA != null) {
                        break;
                    }
                }
            }
            if (listA == null) {
                for (int i12 = 0; i12 < arrayList.size(); i12++) {
                    listA = a(((Integer) arrayList.get(i12)).intValue(), com.mbridge.msdk.mbnative.cache.c.a(((Integer) arrayList.get(i12)).intValue()).b(str, ((((Integer) arrayList.get(i12)).intValue() == 1 || ((Integer) arrayList.get(i12)).intValue() == 2) && this.f38616d.containsKey(MBridgeConstans.NATIVE_INFO)) ? this.H : this.f38629q));
                    if (listA != null) {
                        break;
                    }
                }
            }
        }
        return a(listA);
    }

    @Override // com.mbridge.msdk.mbnative.controller.a
    public synchronized void a(int i10, long j10, int i11, String str) {
        n nVar;
        com.mbridge.msdk.foundation.same.net.wrapper.e eVar;
        com.mbridge.msdk.foundation.same.net.wrapper.c cVar;
        p pVar;
        int i12;
        com.mbridge.msdk.foundation.entity.k kVar;
        try {
            if (this.f38616d.containsKey(MBridgeConstans.NATIVE_INFO)) {
                this.f38630r = Math.max(this.V, this.W);
            }
            if (i11 == 0) {
                com.mbridge.msdk.mbnative.cache.b<String, List<Campaign>> bVarA = com.mbridge.msdk.mbnative.cache.c.a(i10);
                if (bVarA != null && c(a(1, a(bVarA.a(this.f38621i, this.f38630r))))) {
                    return;
                }
                n nVar2 = this.J;
                if (nVar2 != null && !this.U) {
                    nVar2.b(true);
                }
                if (this.U && !this.f38634v) {
                    a("mb load failed", i11, str, (CampaignEx) null);
                }
                if (!this.X) {
                    return;
                }
            }
            int i13 = this.f38631s;
            if (i13 == -1) {
                this.f38631s = i10;
            } else if (i13 != i10) {
                this.f38632t = 0;
            }
            com.mbridge.msdk.foundation.db.e.a(com.mbridge.msdk.foundation.db.g.a(this.f38620h)).d();
            com.mbridge.msdk.foundation.same.net.wrapper.c aVar = new com.mbridge.msdk.mbnative.service.net.a(this.f38620h);
            com.mbridge.msdk.foundation.same.net.wrapper.e eVar2 = new com.mbridge.msdk.foundation.same.net.wrapper.e();
            String strB = com.mbridge.msdk.foundation.controller.c.n().b();
            String strC = com.mbridge.msdk.foundation.controller.c.n().c();
            Map<String, Object> map = this.f38616d;
            if (map != null && map.containsKey("app_id") && this.f38616d.containsKey(MBridgeConstans.APP_KEY) && this.f38616d.containsKey(MBridgeConstans.KEY_WORD) && this.f38616d.get(MBridgeConstans.KEY_WORD) != null) {
                if (this.f38616d.get("app_id") instanceof String) {
                    strB = (String) this.f38616d.get("app_id");
                }
                if (this.f38616d.get(MBridgeConstans.APP_KEY) instanceof String) {
                    strC = (String) this.f38616d.get(MBridgeConstans.APP_KEY);
                }
                String str2 = this.f38616d.get(MBridgeConstans.KEY_WORD) instanceof String ? (String) this.f38616d.get(MBridgeConstans.KEY_WORD) : null;
                if (!TextUtils.isEmpty(str2)) {
                    eVar2.a("smart", k0.b(str2));
                }
            }
            eVar2.a("app_id", strB);
            eVar2.a(MBridgeConstans.PROPERTIES_UNIT_ID, this.f38621i);
            if (!TextUtils.isEmpty(this.f38622j)) {
                eVar2.a(MBridgeConstans.PLACEMENT_ID, this.f38622j);
            }
            eVar2.a("req_type", "2");
            if (!TextUtils.isEmpty(this.f38633u)) {
                eVar2.a("category", this.f38633u);
            }
            eVar2.a("sign", SameMD5.getMD5(strB + strC));
            if (this.T <= 0 || i11 != 0) {
                eVar2.a("ad_num", this.f38629q + "");
            } else {
                eVar2.a("ad_num", this.T + "");
            }
            String strD = v0.d(this.f38621i);
            if (!TextUtils.isEmpty(strD)) {
                eVar2.a("j", strD);
            }
            eVar2.a("only_impression", "1");
            eVar2.a("ping_mode", "1");
            if (this.A != 0) {
                eVar2.a("frame_num", this.A + "");
            }
            if (!TextUtils.isEmpty(this.f38625m)) {
                eVar2.a(MBridgeConstans.NATIVE_INFO, this.f38625m);
                if (i10 == 1) {
                    eVar2.a("tnum", this.H + "");
                }
            } else if (i10 == 1) {
                eVar2.a("tnum", this.f38629q + "");
            }
            a(eVar2, i10);
            String strA = com.mbridge.msdk.foundation.same.buffer.b.a(this.f38621i, "native");
            if (!TextUtils.isEmpty(strA)) {
                eVar2.a(com.mbridge.msdk.foundation.same.net.wrapper.e.f37863g, strA);
            }
            if (this.f38616d.containsKey(MBridgeConstans.NATIVE_VIDEO_WIDTH) && (this.f38616d.get(MBridgeConstans.NATIVE_VIDEO_WIDTH) instanceof Integer)) {
                eVar2.a("video_width", ((Integer) this.f38616d.get(MBridgeConstans.NATIVE_VIDEO_WIDTH)).intValue() + "");
            }
            if (this.f38616d.containsKey(MBridgeConstans.NATIVE_VIDEO_HEIGHT) && (this.f38616d.get(MBridgeConstans.NATIVE_VIDEO_HEIGHT) instanceof Integer)) {
                eVar2.a("video_height", ((Integer) this.f38616d.get(MBridgeConstans.NATIVE_VIDEO_HEIGHT)).intValue() + "");
            }
            if (this.f38616d.containsKey(MBridgeConstans.NATIVE_VIDEO_SUPPORT) && (this.f38616d.get(MBridgeConstans.NATIVE_VIDEO_SUPPORT) instanceof Boolean)) {
                ((Boolean) this.f38616d.get(MBridgeConstans.NATIVE_VIDEO_SUPPORT)).booleanValue();
            }
            eVar2.a("video_version", "2.0");
            if (com.mbridge.msdk.setting.h.b().d(com.mbridge.msdk.foundation.controller.c.n().b()) == null) {
                com.mbridge.msdk.setting.h.b().a();
            }
            if (!b(this.f38616d)) {
                JSONArray jSONArrayB = v0.b(this.f38620h, this.f38621i);
                if (jSONArrayB.length() > 0) {
                    eVar2.a(com.mbridge.msdk.foundation.same.net.wrapper.e.f37864h, v0.a(jSONArrayB));
                }
            }
            if (com.mbridge.msdk.mbnative.controller.d.g().containsKey(this.f38621i) && com.mbridge.msdk.mbnative.controller.d.g().get(this.f38621i).booleanValue() && com.mbridge.msdk.mbnative.controller.d.e().get(this.f38621i) != null && (kVar = com.mbridge.msdk.mbnative.controller.d.e().get(this.f38621i)) != null) {
                if (i10 == 1) {
                    this.f38632t = kVar.a();
                } else if (i10 == 2) {
                    this.f38632t = kVar.b();
                }
            }
            eVar2.a(TypedValues.CycleType.S_WAVE_OFFSET, this.f38632t + "");
            eVar2.a("ad_type", RoomMasterTable.DEFAULT_ID);
            eVar2.a(CampaignEx.JSON_KEY_AD_SOURCE_ID, i10 + "");
            if (!TextUtils.isEmpty(this.f38627o)) {
                eVar2.a(com.mbridge.msdk.foundation.same.net.wrapper.e.f37865i, this.f38627o);
            }
            n nVar3 = new n();
            nVar3.b(a(this.f38616d));
            nVar3.setUnitId(this.f38621i);
            nVar3.setPlacementId(this.f38622j);
            nVar3.setAdType(42);
            nVar3.b(true);
            p pVar2 = new p(1, nVar3, i11, str);
            nVar3.a(pVar2);
            nVar3.a(i11);
            nVar3.a(str);
            if (i11 == 0) {
                if (!TextUtils.isEmpty(str)) {
                    eVar2.a("token", str);
                }
                nVar = nVar3;
                eVar = eVar2;
                cVar = aVar;
                pVar = pVar2;
                i12 = 1;
                aVar.choiceV3OrV5BySetting(1, eVar, nVar, str, com.mbridge.msdk.foundation.same.c.a(j10, 30000L));
            } else {
                nVar = nVar3;
                eVar = eVar2;
                cVar = aVar;
                pVar = pVar2;
                i12 = 1;
            }
            if (i11 == i12) {
                cVar.getLoadOrSetting(1, com.mbridge.msdk.foundation.same.net.utils.d.h().f37828b0, eVar, nVar, MBInterstitialActivity.INTENT_CAMAPIGN, com.mbridge.msdk.foundation.same.c.a(j10, 30000L));
            }
            this.f38702a.postDelayed(pVar, j10);
        } catch (Exception e10) {
            String str3 = f38609c0;
            q0.b(str3, com.mbridge.msdk.mbnative.common.a.a(e10));
            q0.b(str3, e10.getMessage());
        }
    }

    public void a(int i10, String str) {
        boolean zEquals = false;
        this.f38634v = false;
        this.f38635w = false;
        this.f38636x = false;
        this.U = false;
        this.N = str;
        this.f38618f.a(!TextUtils.isEmpty(str));
        this.J = null;
        Map<String, Long> map = f38610d0;
        if (map != null && map.size() > 0) {
            f38610d0.clear();
        }
        if (com.mbridge.msdk.mbnative.controller.d.g() != null && com.mbridge.msdk.mbnative.controller.d.g().containsKey(this.f38621i)) {
            zEquals = Boolean.TRUE.equals(com.mbridge.msdk.mbnative.controller.d.g().get(this.f38621i));
        }
        a(zEquals, i10);
    }

    public void a(Campaign campaign, View view) {
        try {
            NativeListener.NativeTrackingListener nativeTrackingListener = this.f38619g;
            if (nativeTrackingListener != null) {
                this.f38628p.a(nativeTrackingListener);
            }
            com.mbridge.msdk.mbnative.cache.c.a(campaign.getType()).a(this.f38621i, campaign, this.N);
            CampaignEx campaignEx = (CampaignEx) campaign;
            com.mbridge.msdk.foundation.same.buffer.b.a(this.f38621i, campaignEx, "native");
            b1.a(view, campaignEx.getLocalRequestId(), campaignEx.getLocalAllowTrackClick());
            i iVar = new i(campaignEx);
            try {
                int i10 = MBMediaView.f39028p0;
                a(campaignEx, view, iVar, MBMediaView.class);
            } catch (Throwable unused) {
                a(campaignEx, view, iVar, (Class) null);
            }
            if (!com.mbridge.msdk.util.b.a()) {
                a(view, (CampaignEx) campaign);
            }
            if (campaignEx.isReport()) {
                return;
            }
            ArrayList arrayList = new ArrayList();
            arrayList.add(view);
            a(campaignEx, view, (List<View>) arrayList);
            q0.c(f38609c0, "sendImpression" + campaignEx);
        } catch (Exception unused2) {
            q0.b(f38609c0, "registerview exception!");
        }
    }

    public void a(Campaign campaign, View view, List<View> list) {
        try {
            a(view, (CampaignEx) campaign);
            NativeListener.NativeTrackingListener nativeTrackingListener = this.f38619g;
            if (nativeTrackingListener != null) {
                this.f38628p.a(nativeTrackingListener);
            }
            com.mbridge.msdk.mbnative.cache.c.a(campaign.getType()).a(this.f38621i, campaign, this.N);
            CampaignEx campaignEx = (CampaignEx) campaign;
            Class cls = null;
            try {
                int i10 = MBMediaView.f39028p0;
                cls = MBMediaView.class;
            } catch (Throwable unused) {
            }
            com.mbridge.msdk.foundation.same.buffer.b.a(this.f38621i, campaignEx, "native");
            if (view != null) {
                if (cls != null && cls.isInstance(view)) {
                    return;
                }
                b1.a(view, campaignEx.getLocalRequestId(), campaignEx.getLocalAllowTrackClick());
                view.setOnClickListener(new f(campaignEx));
            }
            if (list != null && list.size() > 0) {
                for (View view2 : list) {
                    if (cls != null && cls.isInstance(view2)) {
                        break;
                    }
                    b1.a(view2, campaignEx.getLocalRequestId(), campaignEx.getLocalAllowTrackClick());
                    view2.setOnClickListener(new g(campaignEx));
                }
            }
            if (campaignEx.isReport()) {
                return;
            }
            a(campaignEx, view, list);
            Log.e(f38609c0, "sendImpression" + campaignEx);
        } catch (Exception unused2) {
            q0.b(f38609c0, "registerview exception!");
        }
    }

    public void a(String str, int i10, String str2, CampaignEx campaignEx) {
        Queue<Integer> queue = this.f38623k;
        if ((queue == null || queue.size() > 0) && this.f38623k != null) {
            b(i10, str2);
            return;
        }
        com.mbridge.msdk.mbnative.listener.a aVar = this.f38618f;
        if (aVar == null || this.f38634v) {
            return;
        }
        this.f38634v = true;
        aVar.a(campaignEx, str);
    }

    public void a(String str, String str2) {
        this.f38617e.a(this.f38620h, str, str2, this.f38621i);
    }

    public boolean a(int i10) {
        int iMin;
        int iOptInt;
        int iOptInt2;
        com.mbridge.msdk.mbnative.listener.a aVar;
        int i11 = 0;
        if (com.mbridge.msdk.mbnative.controller.d.g().containsKey(this.f38621i) && Boolean.TRUE.equals(com.mbridge.msdk.mbnative.controller.d.g().get(this.f38621i))) {
            Map<String, Map<Long, Object>> mapF = com.mbridge.msdk.mbnative.controller.d.f();
            Map<Long, Object> map = mapF.get(i10 + "_" + this.f38621i);
            Integer num = com.mbridge.msdk.mbnative.controller.d.c().get(this.f38621i);
            com.mbridge.msdk.setting.g gVarD = com.mbridge.msdk.setting.h.b().d(com.mbridge.msdk.foundation.controller.c.n().b());
            if (num != null) {
                this.f38630r = num.intValue();
            }
            if (map != null && map.size() > 0) {
                Long next = map.keySet().iterator().next();
                long jCurrentTimeMillis = System.currentTimeMillis();
                if (gVarD == null) {
                    gVarD = com.mbridge.msdk.setting.h.b().a();
                }
                if (jCurrentTimeMillis - next.longValue() >= gVarD.a0() * 1000) {
                    mapF.remove(i10 + "_" + this.f38621i);
                } else {
                    if (i10 == 1) {
                        List<Frame> list = (List) map.get(next);
                        if (list == null || list.size() <= 0 || (aVar = this.f38618f) == null) {
                            return false;
                        }
                        if (this.A >= list.size()) {
                            mapF.remove(i10 + "_" + this.f38621i);
                            aVar.onAdFramesLoaded(list);
                            return true;
                        }
                        if (this.A == 0) {
                            return false;
                        }
                        List<Frame> listSubList = list.subList(0, this.f38638z);
                        aVar.onAdFramesLoaded(list);
                        list.removeAll(listSubList);
                        map.put(next, listSubList);
                        ArrayList arrayList = new ArrayList();
                        for (Frame frame : list) {
                            if (i11 >= this.A) {
                                arrayList.add(frame);
                            }
                            i11++;
                        }
                        map.put(next, arrayList);
                        mapF.put(i10 + "_" + this.f38621i, map);
                        aVar.onAdFramesLoaded(listSubList);
                        return true;
                    }
                    List list2 = (List) map.get(next);
                    if (list2 != null && list2.size() > 0) {
                        List<Campaign> arrayList2 = new ArrayList<>();
                        if (((CampaignEx) list2.get(0)).getType() == 1) {
                            if (TextUtils.isEmpty(this.f38625m)) {
                                iMin = Math.min(this.f38637y, list2.size());
                            } else {
                                try {
                                    JSONArray jSONArray = new JSONArray(this.f38625m);
                                    if (jSONArray.length() > 0) {
                                        iOptInt = 0;
                                        iOptInt2 = 0;
                                        for (int i12 = 0; i12 < jSONArray.length(); i12++) {
                                            JSONObject jSONObject = (JSONObject) jSONArray.opt(i12);
                                            int iOptInt3 = jSONObject.optInt("id", 0);
                                            if (2 == iOptInt3) {
                                                iOptInt = jSONObject.optInt("ad_num");
                                            } else if (3 == iOptInt3) {
                                                iOptInt2 = jSONObject.optInt("ad_num");
                                            }
                                        }
                                    } else {
                                        iOptInt = 0;
                                        iOptInt2 = 0;
                                    }
                                    iMin = 3 == ((CampaignEx) list2.get(0)).getTemplate() ? Math.min(iOptInt2, list2.size()) : Math.min(iOptInt, list2.size());
                                } catch (Exception unused) {
                                    q0.b(f38609c0, "load from catch error in get nativeinfo adnum");
                                    iMin = 0;
                                }
                            }
                            if (iMin <= 0) {
                                return false;
                            }
                            Iterator it = list2.iterator();
                            while (it.hasNext() && i11 != iMin) {
                                CampaignEx campaignEx = (CampaignEx) it.next();
                                campaignEx.getTemplate();
                                arrayList2.add(campaignEx);
                                it.remove();
                                i11++;
                            }
                        } else {
                            int iMin2 = Math.min(this.f38637y, list2.size());
                            if (iMin2 > 0) {
                                Iterator it2 = list2.iterator();
                                while (it2.hasNext() && i11 != iMin2) {
                                    CampaignEx campaignEx2 = (CampaignEx) it2.next();
                                    campaignEx2.getTemplate();
                                    arrayList2.add(campaignEx2);
                                    it2.remove();
                                    i11++;
                                }
                            }
                        }
                        c(arrayList2);
                        return true;
                    }
                }
            }
        }
        return false;
    }

    public void b(int i10, long j10, int i11, String str) {
        com.mbridge.msdk.mbnative.cache.b<String, List<Campaign>> bVarA;
        if (i11 == 0 && (bVarA = com.mbridge.msdk.mbnative.cache.c.a(i10)) != null) {
            if ((i10 == 1 || i10 == 2) && this.f38616d.containsKey(MBridgeConstans.NATIVE_INFO)) {
                this.f38630r = this.H;
            } else {
                this.f38630r = this.f38629q;
            }
            if (c(a(i10, a(bVarA.a(this.f38621i, this.f38630r))))) {
                return;
            }
        }
        if (i10 == 1) {
            a(j10, i11, true, this.f38621i, str);
        } else if (i10 != 2) {
            a(i10, j10, i11, str);
        } else {
            a(2, j10, i11, str);
        }
    }

    public void b(int i10, String str) {
        com.mbridge.msdk.mbnative.listener.a aVar;
        Long lPoll;
        Queue<Integer> queue = this.f38623k;
        if (queue == null || queue.size() <= 0) {
            if (this.f38634v || (aVar = this.f38618f) == null) {
                return;
            }
            this.f38634v = true;
            aVar.onAdLoadError("no ad source");
            return;
        }
        Integer numPoll = this.f38623k.poll();
        int iIntValue = numPoll != null ? numPoll.intValue() : 1;
        this.R = MBridgeConstans.REQUEST_TIME_OUT;
        Queue<Long> queue2 = this.f38624l;
        if (queue2 != null && queue2.size() > 0 && (lPoll = this.f38624l.poll()) != null) {
            this.R = lPoll.longValue();
        }
        b(iIntValue, this.R, i10, str);
    }

    public void b(Campaign campaign, View view) {
        b(campaign, view, null);
    }

    public void b(Campaign campaign, View view, List<View> list) {
        if (view != null && this.P != null) {
            try {
                view.getViewTreeObserver().removeOnGlobalLayoutListener(this.P);
            } catch (Exception e10) {
                e10.printStackTrace();
            }
        }
        if (campaign != null) {
            int type = campaign.getType();
            if (type == 1 || type == 2) {
                Class cls = null;
                try {
                    int i10 = MBMediaView.f39028p0;
                    cls = MBMediaView.class;
                } catch (Throwable unused) {
                }
                if (list == null || list.size() <= 0) {
                    if (view != null) {
                        a(view, cls);
                    }
                } else {
                    Iterator<View> it = list.iterator();
                    while (it.hasNext()) {
                        a(it.next(), cls);
                    }
                }
            }
        }
    }

    public void d() {
        o0.b();
    }

    public String e() {
        ArrayList arrayList = new ArrayList();
        List<Campaign> list = this.Y;
        if (list != null) {
            for (Campaign campaign : list) {
                CampaignEx campaignEx = new CampaignEx();
                campaignEx.setCreativeId(campaign.getCreativeId());
                arrayList.add(campaignEx);
            }
        }
        return com.mbridge.msdk.foundation.same.c.b(arrayList);
    }

    public String g() {
        return this.O;
    }

    public void i() {
        com.mbridge.msdk.foundation.same.task.a next;
        com.mbridge.msdk.foundation.same.task.b bVar = this.C;
        if (bVar != null) {
            bVar.a();
            this.C = null;
        }
        Hashtable<String, AdSession> hashtable = this.G;
        if (hashtable != null) {
            for (AdSession adSession : hashtable.values()) {
                if (adSession != null) {
                    adSession.finish();
                }
            }
            this.G.clear();
        }
        Handler handler = this.f38702a;
        if (handler != null) {
            handler.removeCallbacksAndMessages(null);
        }
        this.f38619g = null;
        this.f38628p.c();
        try {
            Context context = this.f38620h;
            if (context != null) {
                com.mbridge.msdk.foundation.same.image.b.a(context).b();
            }
            List<com.mbridge.msdk.mbnative.controller.c> list = this.D;
            if (list != null && list.size() > 0) {
                Iterator<com.mbridge.msdk.mbnative.controller.c> it = this.D.iterator();
                while (it.hasNext()) {
                    it.next().a();
                }
                this.D.clear();
                this.D = null;
            }
            List<c.d> list2 = this.E;
            if (list2 != null && list2.size() > 0) {
                for (c.d dVar : this.E) {
                }
                this.E.clear();
                this.E = null;
            }
            CopyOnWriteArrayList<com.mbridge.msdk.foundation.same.task.a> copyOnWriteArrayList = this.F;
            if (copyOnWriteArrayList == null || copyOnWriteArrayList.size() <= 0) {
                return;
            }
            Iterator<com.mbridge.msdk.foundation.same.task.a> it2 = this.F.iterator();
            if (it2.hasNext() && (next = it2.next()) != null) {
                next.cancel();
                this.f38702a.removeCallbacks(next);
            }
            this.F.clear();
        } catch (Exception unused) {
        }
    }

    public void j() {
        List<Integer> list = this.f38613b;
        if (list != null && list.size() > 0) {
            Queue<Integer> queue = this.f38623k;
            if (queue != null && queue.size() > 0) {
                this.f38623k.clear();
            }
            for (Integer num : this.f38613b) {
                Queue<Integer> queue2 = this.f38623k;
                if (queue2 != null) {
                    queue2.add(num);
                }
            }
        }
        List<Integer> list2 = this.f38615c;
        if (list2 == null || list2.size() <= 0) {
            return;
        }
        Queue<Long> queue3 = this.f38624l;
        if (queue3 != null && queue3.size() > 0) {
            this.f38624l.clear();
        }
        for (Integer num2 : this.f38615c) {
            Queue<Long> queue4 = this.f38624l;
            if (queue4 != null) {
                queue4.add(Long.valueOf(num2.intValue() * 1000));
            }
        }
    }
}
