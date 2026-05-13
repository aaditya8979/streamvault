package com.mbridge.msdk.video.dynview.wrapper;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.Color;
import android.text.TextUtils;
import android.view.View;
import android.widget.AdapterView;
import android.widget.GridView;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.ListAdapter;
import android.widget.ListView;
import android.widget.RelativeLayout;
import android.widget.TextView;
import com.ironsource.C3978d4;
import com.mbridge.msdk.MBridgeConstans;
import com.mbridge.msdk.dycreator.baseview.MBHeatLevelLayoutView;
import com.mbridge.msdk.dycreator.baseview.MBStarLevelLayoutView;
import com.mbridge.msdk.dycreator.baseview.cusview.MBCusRoundImageView;
import com.mbridge.msdk.foundation.entity.CampaignEx;
import com.mbridge.msdk.foundation.tools.SameMD5;
import com.mbridge.msdk.foundation.tools.a0;
import com.mbridge.msdk.foundation.tools.c1;
import com.mbridge.msdk.foundation.tools.i0;
import com.mbridge.msdk.foundation.tools.q0;
import com.mbridge.msdk.foundation.tools.v0;
import com.mbridge.msdk.video.dynview.shape.a;
import com.mbridge.msdk.video.dynview.widget.MBridgeLevelLayoutView;
import com.mbridge.msdk.videocommon.view.RoundImageView;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

/* JADX INFO: compiled from: DataEnergizeWrapper.java */
/* JADX INFO: loaded from: classes12.dex */
public class a {

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    private static boolean f41554m;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private com.mbridge.msdk.video.dynview.util.time.b f41555a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private Map<String, Bitmap> f41556b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private volatile boolean f41557c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private String f41558d = "#FFFFFFFF";

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private String f41559e = "#60000000";

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private String f41560f = "#FF5F5F5F";

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private String f41561g = "#90ECECEC";

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private volatile long f41562h = 0;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private com.mbridge.msdk.video.dynview.util.time.a f41563i = null;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private boolean f41564j = false;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    private int f41565k = 0;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public com.mbridge.msdk.video.dynview.inter.a f41566l = new c();

    /* JADX INFO: renamed from: com.mbridge.msdk.video.dynview.wrapper.a$a, reason: collision with other inner class name */
    /* JADX INFO: compiled from: DataEnergizeWrapper.java */
    public class C0522a implements com.mbridge.msdk.video.dynview.util.time.a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final /* synthetic */ TextView f41567a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final /* synthetic */ String f41568b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final /* synthetic */ CampaignEx f41569c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public final /* synthetic */ Map f41570d;

        public C0522a(TextView textView, String str, CampaignEx campaignEx, Map map) {
            this.f41567a = textView;
            this.f41568b = str;
            this.f41569c = campaignEx;
            this.f41570d = map;
        }

        @Override // com.mbridge.msdk.video.dynview.util.time.a
        public void onFinish() {
            this.f41569c.setShowType(com.mbridge.msdk.foundation.same.report.metrics.a.f37938c);
            a.this.b(this.f41570d);
        }

        @Override // com.mbridge.msdk.video.dynview.util.time.a
        public void onTick(long j10) {
            a.this.f41565k = (int) (j10 / 1000);
            this.f41567a.setText(com.mbridge.msdk.video.dynview.util.a.a(a.this.f41565k, this.f41567a.getContext()));
            a.this.f41562h++;
            if (TextUtils.isEmpty(this.f41568b) || !this.f41568b.equals("1")) {
                return;
            }
            com.mbridge.msdk.foundation.same.report.metrics.e eVar = new com.mbridge.msdk.foundation.same.report.metrics.e();
            eVar.a("type", "choseFromTwoHeartbeat");
            eVar.a("xtSecond", "countTimeForReport");
            eVar.a("autoPlayCountDownTime", "mLeftOverCountTime");
            com.mbridge.msdk.video.module.report.a.a("2000103", this.f41569c, eVar);
        }
    }

    /* JADX INFO: compiled from: DataEnergizeWrapper.java */
    public class b implements com.mbridge.msdk.foundation.feedback.a {
        public b() {
        }

        @Override // com.mbridge.msdk.foundation.feedback.a
        public void a() {
            if (a.this.f41555a != null) {
                a.this.f41555a.a();
                a.this.f41564j = true;
            }
        }

        @Override // com.mbridge.msdk.foundation.feedback.a
        public void a(String str) {
            if (!a.this.f41564j || a.this.f41555a == null) {
                return;
            }
            a.this.f41555a.a(a.this.f41565k * 1000, a.this.f41563i);
            a.this.f41564j = false;
        }

        @Override // com.mbridge.msdk.foundation.feedback.a
        public void close() {
            if (!a.this.f41564j || a.this.f41555a == null) {
                return;
            }
            a.this.f41555a.a(a.this.f41565k * 1000, a.this.f41563i);
            a.this.f41564j = false;
        }
    }

    /* JADX INFO: compiled from: DataEnergizeWrapper.java */
    public class c implements com.mbridge.msdk.video.dynview.inter.a {
        public c() {
        }

        @Override // com.mbridge.msdk.video.dynview.inter.a
        public void a() {
            if (!a.this.f41564j || a.this.f41555a == null) {
                return;
            }
            a.this.f41555a.a(a.this.f41565k * 1000, a.this.f41563i);
            a.this.f41564j = false;
        }

        @Override // com.mbridge.msdk.video.dynview.inter.a
        public void b() {
            if (a.this.f41555a != null) {
                a.this.f41555a.a();
                a.this.f41564j = true;
            }
        }

        @Override // com.mbridge.msdk.video.dynview.inter.a
        public void c() {
            if (a.this.f41555a != null) {
                a.this.f41555a.a();
                a.this.f41564j = true;
            }
        }
    }

    /* JADX INFO: compiled from: DataEnergizeWrapper.java */
    public class d extends com.mbridge.msdk.widget.a {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final /* synthetic */ Map f41574b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final /* synthetic */ List f41575c;

        public d(Map map, List list) {
            this.f41574b = map;
            this.f41575c = list;
        }

        @Override // com.mbridge.msdk.widget.a
        public void a(View view) {
            if (a.this.f41557c) {
                return;
            }
            a.this.f41557c = true;
            a.this.a(this.f41574b, (List<CampaignEx>) this.f41575c, 0);
        }
    }

    /* JADX INFO: compiled from: DataEnergizeWrapper.java */
    public class e extends com.mbridge.msdk.widget.a {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final /* synthetic */ Map f41577b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final /* synthetic */ List f41578c;

        public e(Map map, List list) {
            this.f41577b = map;
            this.f41578c = list;
        }

        @Override // com.mbridge.msdk.widget.a
        public void a(View view) {
            if (a.this.f41557c) {
                return;
            }
            a.this.f41557c = true;
            a.this.a(this.f41577b, (List<CampaignEx>) this.f41578c, 1);
        }
    }

    /* JADX INFO: compiled from: DataEnergizeWrapper.java */
    public class f implements AdapterView.OnItemClickListener {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final /* synthetic */ Map f41580a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final /* synthetic */ List f41581b;

        public f(Map map, List list) {
            this.f41580a = map;
            this.f41581b = list;
        }

        @Override // android.widget.AdapterView.OnItemClickListener
        public void onItemClick(AdapterView<?> adapterView, View view, int i10, long j10) {
            a.this.a(this.f41580a, (List<CampaignEx>) this.f41581b, i10);
        }
    }

    /* JADX INFO: compiled from: DataEnergizeWrapper.java */
    public class g implements AdapterView.OnItemClickListener {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final /* synthetic */ Map f41583a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final /* synthetic */ List f41584b;

        public g(Map map, List list) {
            this.f41583a = map;
            this.f41584b = list;
        }

        @Override // android.widget.AdapterView.OnItemClickListener
        public void onItemClick(AdapterView<?> adapterView, View view, int i10, long j10) {
            a.this.a(this.f41583a, (List<CampaignEx>) this.f41584b, i10);
        }
    }

    /* JADX INFO: compiled from: DataEnergizeWrapper.java */
    public class h implements View.OnClickListener {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final /* synthetic */ Map f41586a;

        public h(Map map) {
            this.f41586a = map;
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            a.this.a(this.f41586a);
        }
    }

    /* JADX INFO: compiled from: DataEnergizeWrapper.java */
    public class i implements com.mbridge.msdk.foundation.same.image.c {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final /* synthetic */ int f41588a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final /* synthetic */ ImageView f41589b;

        /* JADX INFO: renamed from: com.mbridge.msdk.video.dynview.wrapper.a$i$a, reason: collision with other inner class name */
        /* JADX INFO: compiled from: DataEnergizeWrapper.java */
        public class RunnableC0523a implements Runnable {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public final /* synthetic */ Bitmap f41591a;

            /* JADX INFO: renamed from: com.mbridge.msdk.video.dynview.wrapper.a$i$a$a, reason: collision with other inner class name */
            /* JADX INFO: compiled from: DataEnergizeWrapper.java */
            public class RunnableC0524a implements Runnable {

                /* JADX INFO: renamed from: a, reason: collision with root package name */
                public final /* synthetic */ Bitmap f41593a;

                public RunnableC0524a(Bitmap bitmap) {
                    this.f41593a = bitmap;
                }

                @Override // java.lang.Runnable
                public void run() {
                    i.this.f41589b.setImageBitmap(this.f41593a);
                }
            }

            public RunnableC0523a(Bitmap bitmap) {
                this.f41591a = bitmap;
            }

            @Override // java.lang.Runnable
            public void run() {
                try {
                    i.this.f41589b.post(new RunnableC0524a(a0.a(this.f41591a, 10)));
                } catch (Exception e10) {
                    q0.b("DataEnergizeWrapper", e10.getMessage());
                }
            }
        }

        public i(int i10, ImageView imageView) {
            this.f41588a = i10;
            this.f41589b = imageView;
        }

        @Override // com.mbridge.msdk.foundation.same.image.c
        public void onFailedLoad(String str, String str2) {
            try {
                int iA = i0.a(this.f41589b.getContext(), "mbridge_icon_play_bg", "drawable");
                this.f41589b.setBackgroundColor(Color.parseColor(a.this.f41560f));
                this.f41589b.setImageResource(iA);
                this.f41589b.setScaleType(ImageView.ScaleType.CENTER);
            } catch (Exception e10) {
                q0.a("DataEnergizeWrapper", e10.getMessage());
            }
        }

        @Override // com.mbridge.msdk.foundation.same.image.c
        public void onSuccessLoad(Bitmap bitmap, String str) {
            if (bitmap == null || bitmap.isRecycled()) {
                int iA = i0.a(this.f41589b.getContext(), "mbridge_icon_play_bg", "drawable");
                this.f41589b.setBackgroundColor(Color.parseColor(a.this.f41560f));
                this.f41589b.setImageResource(iA);
                this.f41589b.setScaleType(ImageView.ScaleType.CENTER);
                return;
            }
            int i10 = this.f41588a;
            if (i10 != 501 && i10 != 802) {
                this.f41589b.setImageBitmap(bitmap);
            } else {
                com.mbridge.msdk.foundation.same.threadpool.a.a().execute(new RunnableC0523a(bitmap));
            }
        }
    }

    /* JADX INFO: compiled from: DataEnergizeWrapper.java */
    public class j implements com.mbridge.msdk.foundation.same.image.c {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final /* synthetic */ ImageView f41595a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final /* synthetic */ String f41596b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final /* synthetic */ com.mbridge.msdk.video.dynview.c f41597c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public final /* synthetic */ View f41598d;

        public j(ImageView imageView, String str, com.mbridge.msdk.video.dynview.c cVar, View view) {
            this.f41595a = imageView;
            this.f41596b = str;
            this.f41597c = cVar;
            this.f41598d = view;
        }

        @Override // com.mbridge.msdk.foundation.same.image.c
        public void onFailedLoad(String str, String str2) {
        }

        @Override // com.mbridge.msdk.foundation.same.image.c
        public void onSuccessLoad(Bitmap bitmap, String str) {
            ImageView imageView;
            if (bitmap == null || bitmap.isRecycled() || (imageView = this.f41595a) == null) {
                return;
            }
            imageView.setImageBitmap(bitmap);
            if (a.this.f41556b != null) {
                a.this.f41556b.put(SameMD5.getMD5(this.f41596b), bitmap);
                a.this.a(this.f41597c, this.f41598d);
            }
        }
    }

    /* JADX INFO: compiled from: DataEnergizeWrapper.java */
    public class k extends com.mbridge.msdk.widget.a {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final /* synthetic */ CampaignEx f41600b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final /* synthetic */ Map f41601c;

        public k(CampaignEx campaignEx, Map map) {
            this.f41600b = campaignEx;
            this.f41601c = map;
        }

        @Override // com.mbridge.msdk.widget.a
        public void a(View view) {
            if (a.this.f41557c) {
                return;
            }
            a.this.f41557c = true;
            this.f41600b.setShowType(com.mbridge.msdk.foundation.same.report.metrics.a.f37939d);
            a.this.b(this.f41601c);
        }
    }

    private int a(boolean z10, String str) {
        try {
            if (!z10) {
                return i0.a(com.mbridge.msdk.foundation.controller.c.n().d(), str, "id");
            }
            if (TextUtils.isEmpty(str)) {
                return -1;
            }
            return str.hashCode();
        } catch (Exception e10) {
            q0.b("DataEnergizeWrapper", e10.getMessage());
            return -1;
        }
    }

    private Bitmap a() {
        Bitmap bitmapCreateBitmap = null;
        try {
            bitmapCreateBitmap = Bitmap.createBitmap(1, 1, Bitmap.Config.ARGB_4444);
            bitmapCreateBitmap.eraseColor(Color.parseColor(this.f41561g));
            return bitmapCreateBitmap;
        } catch (Exception e10) {
            if (!MBridgeConstans.DEBUG) {
                return bitmapCreateBitmap;
            }
            e10.printStackTrace();
            return bitmapCreateBitmap;
        }
    }

    private void a(ImageView imageView, String str, int i10) {
        if (TextUtils.isEmpty(str) || imageView == null) {
            return;
        }
        com.mbridge.msdk.foundation.same.image.b.a(imageView.getContext()).a(str, new i(i10, imageView));
    }

    private void a(ListView listView, com.mbridge.msdk.video.dynview.c cVar) {
        if (listView == null || cVar == null) {
            return;
        }
        try {
            RelativeLayout.LayoutParams layoutParams = (RelativeLayout.LayoutParams) listView.getLayoutParams();
            if (layoutParams == null) {
                return;
            }
            layoutParams.height = -1;
            float fK = (cVar.k() - v0.a(com.mbridge.msdk.foundation.controller.c.n().d(), 720.0f)) / 2.0f;
            int iA = v0.a(com.mbridge.msdk.foundation.controller.c.n().d(), 10.0f);
            int i10 = (int) fK;
            layoutParams.setMargins(iA, i10, iA, i10);
            listView.setLayoutParams(layoutParams);
        } catch (Exception e10) {
            q0.b("DataEnergizeWrapper", e10.getMessage());
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void a(com.mbridge.msdk.video.dynview.c cVar, View view) {
        Map<String, Bitmap> map = this.f41556b;
        if (map == null || map.size() <= 1) {
            return;
        }
        new com.mbridge.msdk.video.dynview.ui.b().a(this.f41556b, cVar, view);
    }

    private void a(String str, Context context, View view, int i10, Map map, CampaignEx campaignEx) {
        String strA = c1.a(str, "cltp");
        String strA2 = c1.a(str, "xt");
        long j10 = !TextUtils.isEmpty(strA) ? Long.parseLong(strA) : 0L;
        if (j10 != 0) {
            if (map != null && map.containsKey("is_dy_success")) {
                f41554m = ((Boolean) map.get("is_dy_success")).booleanValue();
            }
            TextView textView = (TextView) view.findViewById(a(f41554m, "mbridge_choice_one_countdown_tv"));
            if (textView != null) {
                textView.setTextSize(11.0f);
                textView.setTextColor(Color.parseColor(this.f41558d));
                String str2 = this.f41559e;
                com.mbridge.msdk.video.dynview.util.drawable.a.a(textView, 1, 12, str2, str2);
                textView.setVisibility(0);
                textView.setOnClickListener(new k(campaignEx, map));
                this.f41563i = new C0522a(textView, strA2, campaignEx, map);
                com.mbridge.msdk.video.dynview.util.time.b bVarA = new com.mbridge.msdk.video.dynview.util.time.b().b(j10 * 1000).a(1000L).a(this.f41563i);
                this.f41555a = bVarA;
                bVarA.c();
            }
            ImageView imageView = (ImageView) view.findViewById(a(f41554m, "mbridge_iv_link"));
            if (campaignEx == null) {
                return;
            }
            if (campaignEx.getAdchoice() != null) {
                campaignEx.getAdchoice().g("");
            }
            v0.a(4, imageView, campaignEx, com.mbridge.msdk.foundation.controller.c.n().d(), false, new b());
        }
    }

    private void a(String str, ImageView imageView) {
        if (TextUtils.isEmpty(str) || imageView == null) {
            return;
        }
        a(imageView, str, -1);
    }

    private void a(String str, ImageView imageView, com.mbridge.msdk.video.dynview.c cVar, View view) {
        com.mbridge.msdk.foundation.same.image.b.a(imageView.getContext()).a(str, new j(imageView, str, cVar, view));
        try {
            Bitmap bitmapA = a();
            if (bitmapA == null || bitmapA.isRecycled()) {
                return;
            }
            b(cVar, view);
        } catch (Exception e10) {
            q0.b("DataEnergizeWrapper", e10.getMessage());
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void a(Map map) {
        if (map != null) {
            try {
                if (map.containsKey("order_view_callback") && (map.get("order_view_callback") instanceof com.mbridge.msdk.video.dynview.listener.c)) {
                    ((com.mbridge.msdk.video.dynview.listener.c) map.get("order_view_callback")).close();
                    b();
                }
            } catch (Exception e10) {
                q0.b("DataEnergizeWrapper", e10.getMessage());
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void a(Map map, List<CampaignEx> list, int i10) {
        if (map == null || list == null || list.size() <= 1) {
            return;
        }
        if (!map.containsKey("choice_one_callback") || !(map.get("choice_one_callback") instanceof com.mbridge.msdk.video.dynview.listener.d)) {
            if (map.containsKey("order_view_callback") && (map.get("order_view_callback") instanceof com.mbridge.msdk.video.dynview.listener.c)) {
                com.mbridge.msdk.video.dynview.listener.c cVar = (com.mbridge.msdk.video.dynview.listener.c) map.get("order_view_callback");
                if (cVar != null) {
                    cVar.a(list.get(i10), i10);
                }
                b();
                return;
            }
            return;
        }
        com.mbridge.msdk.video.dynview.listener.d dVar = (com.mbridge.msdk.video.dynview.listener.d) map.get("choice_one_callback");
        if (dVar != null) {
            dVar.a(list.get(i10));
            try {
                CampaignEx campaignEx = list.get(i10);
                com.mbridge.msdk.foundation.same.report.metrics.e eVar = new com.mbridge.msdk.foundation.same.report.metrics.e();
                eVar.a("click", "0");
                eVar.a("time", Long.valueOf(this.f41562h));
                eVar.a("choose_cid", campaignEx.getId());
                eVar.a(C3978d4.i.L, Integer.valueOf(i10));
                eVar.a("type", "choseFromTwoSelect");
                com.mbridge.msdk.video.module.report.a.a("2000103", campaignEx, eVar);
            } catch (Exception e10) {
                if (MBridgeConstans.DEBUG) {
                    e10.printStackTrace();
                }
            }
        }
        b();
    }

    private void b() {
        com.mbridge.msdk.video.dynview.util.draw.a.a().b();
        com.mbridge.msdk.video.dynview.util.time.b bVar = this.f41555a;
        if (bVar != null) {
            bVar.a();
            this.f41555a = null;
        }
        com.mbridge.msdk.video.dynview.energize.a.a().f41416a = null;
        if (this.f41566l != null) {
            this.f41566l = null;
        }
        Map<String, Bitmap> map = this.f41556b;
        if (map != null) {
            if (map.entrySet() != null) {
                try {
                    Iterator<Map.Entry<String, Bitmap>> it = this.f41556b.entrySet().iterator();
                    while (it.hasNext()) {
                        Map.Entry<String, Bitmap> next = it.next();
                        if (next != null && next.getValue() != null && !next.getValue().isRecycled()) {
                            next.getValue().recycle();
                        }
                        it.remove();
                    }
                } catch (Exception e10) {
                    e10.printStackTrace();
                }
            }
            this.f41556b.clear();
        }
    }

    private void b(com.mbridge.msdk.video.dynview.c cVar, View view) {
        a.b bVarA = com.mbridge.msdk.video.dynview.shape.a.a();
        bVarA.orientation(cVar.h()).a(true);
        if (cVar.h() != 2 || cVar.m() > cVar.k()) {
            bVarA.b(cVar.m()).a(cVar.k());
        } else {
            bVarA.b(cVar.k()).a(cVar.m());
        }
        if (view.getBackground() == null) {
            view.setBackground(bVarA.build());
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void b(Map map) {
        if (map != null) {
            try {
                if (map.containsKey("choice_one_callback") && (map.get("choice_one_callback") instanceof com.mbridge.msdk.video.dynview.listener.d)) {
                    ((com.mbridge.msdk.video.dynview.listener.d) map.get("choice_one_callback")).a();
                    b();
                }
            } catch (Exception e10) {
                q0.b("DataEnergizeWrapper", e10.getMessage());
            }
        }
    }

    public void a(com.mbridge.msdk.video.dynview.c cVar, View view, com.mbridge.msdk.video.dynview.listener.e eVar) {
        if (eVar == null) {
            return;
        }
        if (cVar == null) {
            eVar.a(com.mbridge.msdk.video.dynview.error.a.NOT_FOUND_VIEWOPTION);
            return;
        }
        try {
            ImageView imageView = (ImageView) view.findViewById(i0.a(com.mbridge.msdk.foundation.controller.c.n().d(), "mbridge_iv_adbanner_bg", "id"));
            if (imageView != null) {
                imageView.setBackgroundColor(Color.parseColor(this.f41561g));
            }
            ImageView imageView2 = (ImageView) view.findViewById(i0.a(com.mbridge.msdk.foundation.controller.c.n().d(), "mbridge_iv_adbanner", "id"));
            if (imageView2 != null) {
                imageView2.setBackgroundColor(Color.parseColor(this.f41561g));
            }
            eVar.a(view, new ArrayList());
        } catch (Exception e10) {
            q0.a("DataEnergizeWrapper", e10.getMessage());
            eVar.a(com.mbridge.msdk.video.dynview.error.a.NOT_FOUND_VIEWOPTION);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:52:0x0201  */
    /* JADX WARN: Removed duplicated region for block: B:54:0x020d  */
    /* JADX WARN: Removed duplicated region for block: B:56:0x0216  */
    /* JADX WARN: Removed duplicated region for block: B:61:0x022f  */
    /* JADX WARN: Removed duplicated region for block: B:63:0x0239  */
    /* JADX WARN: Removed duplicated region for block: B:72:0x02c4  */
    /* JADX WARN: Removed duplicated region for block: B:76:0x02cb  */
    /* JADX WARN: Removed duplicated region for block: B:79:0x02d9  */
    /* JADX WARN: Removed duplicated region for block: B:82:0x02e4  */
    /* JADX WARN: Removed duplicated region for block: B:85:0x0302  */
    /* JADX WARN: Removed duplicated region for block: B:91:0x0333  */
    /* JADX WARN: Removed duplicated region for block: B:93:? A[RETURN, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public void a(com.mbridge.msdk.video.dynview.c r35, android.view.View r36, java.util.Map r37, com.mbridge.msdk.video.dynview.listener.e r38) {
        /*
            Method dump skipped, instruction units count: 824
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.mbridge.msdk.video.dynview.wrapper.a.a(com.mbridge.msdk.video.dynview.c, android.view.View, java.util.Map, com.mbridge.msdk.video.dynview.listener.e):void");
    }

    public void b(com.mbridge.msdk.video.dynview.c cVar, View view, Map map, com.mbridge.msdk.video.dynview.listener.e eVar) {
        if (eVar == null) {
            return;
        }
        if (cVar == null) {
            eVar.a(com.mbridge.msdk.video.dynview.error.a.NOT_FOUND_VIEWOPTION);
            return;
        }
        if (map != null && map.containsKey("is_dy_success")) {
            f41554m = ((Boolean) map.get("is_dy_success")).booleanValue();
        }
        boolean z10 = f41554m;
        LinearLayout linearLayout = z10 ? (LinearLayout) view.findViewById(a(z10, "mbridge_reward_heat_mllv")) : null;
        ImageView imageView = (ImageView) view.findViewById(a(f41554m, "mbridge_reward_icon_riv"));
        TextView textView = (TextView) view.findViewById(a(f41554m, "mbridge_reward_title_tv"));
        LinearLayout linearLayout2 = (LinearLayout) view.findViewById(a(f41554m, "mbridge_reward_stars_mllv"));
        TextView textView2 = (TextView) view.findViewById(a(f41554m, "mbridge_reward_click_tv"));
        ImageView imageView2 = (ImageView) view.findViewById(a(f41554m, "mbridge_videoview_bg"));
        TextView textView3 = (TextView) view.findViewById(a(f41554m, "mbridge_reward_desc_tv"));
        View view2 = (RelativeLayout) view.findViewById(a(f41554m, "mbridge_reward_bottom_layout"));
        List<View> arrayList = new ArrayList<>();
        List<CampaignEx> listB = cVar.b();
        if (listB == null || listB.size() <= 0) {
            eVar.a(com.mbridge.msdk.video.dynview.error.a.CAMPAIGNEX_IS_NULL);
            return;
        }
        CampaignEx campaignEx = listB.get(0);
        if (campaignEx == null) {
            eVar.a(com.mbridge.msdk.video.dynview.error.a.CAMPAIGNEX_IS_NULL);
            return;
        }
        if (imageView != null) {
            if (!f41554m) {
                ((RoundImageView) imageView).setBorderRadius(10);
            } else if (imageView instanceof MBCusRoundImageView) {
                ((MBCusRoundImageView) imageView).setCustomBorder(30, 30, 30, 30, 10, -1);
            }
            a(campaignEx.getIconUrl(), imageView);
        }
        if (textView != null) {
            textView.setText(campaignEx.getAppName());
        }
        if (textView3 != null) {
            textView3.setText(campaignEx.getAppDesc());
        }
        if (linearLayout2 != null) {
            double rating = campaignEx.getRating();
            if (rating <= 0.0d) {
                rating = 5.0d;
            }
            if (f41554m) {
                if (linearLayout2 instanceof MBStarLevelLayoutView) {
                    MBStarLevelLayoutView mBStarLevelLayoutView = (MBStarLevelLayoutView) linearLayout2;
                    mBStarLevelLayoutView.setRating((int) rating);
                    mBStarLevelLayoutView.setOrientation(0);
                }
                if (linearLayout instanceof MBHeatLevelLayoutView) {
                    ((MBHeatLevelLayoutView) linearLayout).setHeatCount(campaignEx.getNumberRating());
                }
            } else {
                ((MBridgeLevelLayoutView) linearLayout2).setRatingAndUser(rating, campaignEx.getNumberRating());
            }
        }
        if (textView2 != null) {
            textView2.setText(campaignEx.getAdCall());
        }
        int iL = cVar.l();
        if (iL == 102 || iL == 202 || iL == 302) {
            if (textView2 != null) {
                arrayList.add(textView2);
            }
        } else if (iL == 802) {
            if (imageView != null) {
                arrayList.add(imageView);
            }
            if (textView2 != null) {
                arrayList.add(textView2);
            }
            a(imageView2, campaignEx.getImageUrl(), iL);
        } else if (iL != 902) {
            if (iL != 904) {
                if (iL == 5002010) {
                    if (cVar.p() && view2 != null && view2.getVisibility() == 0) {
                        arrayList.add(view2);
                    } else {
                        if (imageView != null) {
                            arrayList.add(imageView);
                        }
                        if (textView2 != null) {
                            arrayList.add(textView2);
                        }
                    }
                }
            } else if (cVar.p()) {
                arrayList.add(view);
            }
        } else if (TextUtils.isEmpty(cVar.n()) || !cVar.n().equals("dsp") || !TextUtils.isEmpty(campaignEx.getClickURL())) {
            arrayList.add(view);
        }
        eVar.a(view, arrayList);
    }

    public void c(com.mbridge.msdk.video.dynview.c cVar, View view, Map map, com.mbridge.msdk.video.dynview.listener.e eVar) {
        try {
            if (this.f41556b == null) {
                this.f41556b = new HashMap();
            }
            List<CampaignEx> listB = cVar.b();
            if (view.getContext() == null) {
                eVar.a(com.mbridge.msdk.video.dynview.error.a.NOT_FOUND_CONTEXT);
                return;
            }
            if (map != null && map.containsKey("is_dy_success")) {
                f41554m = ((Boolean) map.get("is_dy_success")).booleanValue();
            }
            for (CampaignEx campaignEx : listB) {
                if (campaignEx != null) {
                    campaignEx.setECTemplateRenderSucc(f41554m);
                }
            }
            ListView listView = (ListView) view.findViewById(a(f41554m, "mbridge_order_view_lv"));
            GridView gridView = (GridView) view.findViewById(a(f41554m, "mbridge_order_view_h_lv"));
            ImageView imageView = (ImageView) view.findViewById(a(f41554m, "mbridge_order_view_iv_close"));
            com.mbridge.msdk.video.dynview.ordercamp.adapter.a aVar = new com.mbridge.msdk.video.dynview.ordercamp.adapter.a(listB);
            if (cVar.h() == 1) {
                if (listView != null) {
                    a(listView, cVar);
                    listView.setAdapter((ListAdapter) aVar);
                    listView.setOnItemClickListener(new f(map, listB));
                }
            } else if (gridView != null) {
                int iM = (int) cVar.m();
                int size = iM / listB.size();
                int i10 = size / 9;
                int i11 = i10 / 2;
                LinearLayout.LayoutParams layoutParams = (LinearLayout.LayoutParams) gridView.getLayoutParams();
                layoutParams.width = iM - (i10 * 2);
                gridView.setLayoutParams(layoutParams);
                gridView.setColumnWidth((size - i10) - (i11 / 2));
                gridView.setHorizontalSpacing(i11);
                gridView.setStretchMode(0);
                gridView.setNumColumns(listB.size());
                gridView.setAdapter((ListAdapter) aVar);
                gridView.setOnItemClickListener(new g(map, listB));
            }
            if (imageView != null) {
                imageView.setOnClickListener(new h(map));
            }
            if (eVar != null) {
                eVar.a(view, null);
            }
        } catch (Exception unused) {
            if (eVar != null) {
                eVar.a(com.mbridge.msdk.video.dynview.error.a.NOT_FOUND_VIEWOPTION);
            }
        }
    }
}
