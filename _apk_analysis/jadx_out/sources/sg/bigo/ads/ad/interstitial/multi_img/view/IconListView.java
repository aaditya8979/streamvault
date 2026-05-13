package sg.bigo.ads.ad.interstitial.multi_img.view;

import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.annotation.Nullable;
import com.ironsource.Z7;
import java.util.ArrayList;
import java.util.List;
import java.util.Random;
import sg.bigo.ads.R;
import sg.bigo.ads.ad.b.e;
import sg.bigo.ads.ad.interstitial.f;
import sg.bigo.ads.common.utils.q;

/* JADX INFO: loaded from: classes5.dex */
public class IconListView extends LinearLayout {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private boolean f81180a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private List<a> f81181b;

    public static class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final Context f81182a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final View f81183b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public boolean f81184c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public final LinearLayout f81185d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public final TextView f81186e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        public final ImageView f81187f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        public final LinearLayout f81188g;

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        public final TextView f81189h;

        /* JADX INFO: renamed from: i, reason: collision with root package name */
        public final ImageView f81190i;

        /* JADX INFO: renamed from: j, reason: collision with root package name */
        public final f.a f81191j;

        /* JADX INFO: renamed from: k, reason: collision with root package name */
        public final String f81192k;

        public a(Context context, f.a aVar, String str, boolean z10) {
            this.f81182a = context;
            View viewA = sg.bigo.ads.common.utils.a.a(context, R.layout.bigo_ad_layout_ic_item, null, false);
            this.f81183b = viewA;
            this.f81184c = z10;
            LinearLayout linearLayout = (LinearLayout) viewA.findViewById(R.id.bigo_ad_ic_title_layout);
            this.f81185d = linearLayout;
            this.f81186e = (TextView) viewA.findViewById(R.id.bigo_ad_ic_title_txt);
            this.f81187f = (ImageView) viewA.findViewById(R.id.bigo_ad_ic_title_iv);
            linearLayout.setTag(26);
            LinearLayout linearLayout2 = (LinearLayout) viewA.findViewById(R.id.bigo_ad_ic_desc_layout);
            this.f81188g = linearLayout2;
            this.f81189h = (TextView) viewA.findViewById(R.id.bigo_ad_ic_desc_txt);
            this.f81190i = (ImageView) viewA.findViewById(R.id.bigo_ad_ic_desc_iv);
            linearLayout2.setTag(26);
            this.f81191j = aVar;
            this.f81192k = str;
            a();
        }

        public void a() {
            if (this.f81191j.f80913r == 0) {
                this.f81186e.setVisibility(8);
            } else {
                this.f81186e.setVisibility(0);
                this.f81186e.setText(this.f81191j.f80913r);
                if (this.f81184c) {
                    this.f81186e.setTextColor(-1);
                }
            }
            if (this.f81191j.f80914s == 0) {
                this.f81187f.setVisibility(8);
            } else {
                this.f81187f.setVisibility(0);
                this.f81187f.setImageResource(this.f81191j.f80914s);
            }
            if (this.f81191j.f80915t == 0) {
                this.f81189h.setVisibility(8);
            } else {
                this.f81189h.setVisibility(0);
                this.f81189h.setText(this.f81191j.f80915t);
                if (this.f81184c) {
                    this.f81189h.setTextColor(q.b("#9AFFFFFF", -1));
                }
            }
            if (this.f81191j.f80916u == 0) {
                this.f81190i.setVisibility(8);
            } else {
                this.f81190i.setVisibility(0);
                this.f81190i.setImageResource(this.f81191j.f80916u);
            }
        }
    }

    public static class b extends a {
        public b(Context context, f.a aVar, String str, boolean z10) {
            super(context, aVar, str, z10);
        }

        @Override // sg.bigo.ads.ad.interstitial.multi_img.view.IconListView.a
        public final void a() {
            this.f81186e.setVisibility(0);
            this.f81186e.setText(sg.bigo.ads.common.utils.a.a(this.f81182a, this.f81191j.f80913r, e.a(this.f81192k)));
            if (this.f81184c) {
                this.f81186e.setTextColor(-1);
            }
            this.f81187f.setVisibility(8);
            this.f81189h.setVisibility(0);
            this.f81189h.setText(this.f81191j.f80915t);
            if (this.f81184c) {
                this.f81189h.setTextColor(q.b("#9AFFFFFF", -1));
            }
            this.f81190i.setVisibility(8);
        }
    }

    public static class c extends a {
        public c(Context context, f.a aVar, String str, boolean z10) {
            super(context, aVar, str, z10);
        }

        @Override // sg.bigo.ads.ad.interstitial.multi_img.view.IconListView.a
        public final void a() {
            this.f81186e.setVisibility(8);
            this.f81187f.setVisibility(0);
            this.f81187f.setImageResource(this.f81191j.f80914s);
            this.f81189h.setVisibility(0);
            this.f81189h.setText(this.f81191j.f80915t);
            if (this.f81184c) {
                this.f81189h.setTextColor(q.b("#9AFFFFFF", -1));
            }
            this.f81190i.setVisibility(0);
            this.f81190i.setImageResource(this.f81191j.f80916u);
        }
    }

    public static class d extends a {
        public d(Context context, f.a aVar, String str, boolean z10) {
            super(context, aVar, str, z10);
        }

        @Override // sg.bigo.ads.ad.interstitial.multi_img.view.IconListView.a
        public final void a() {
            this.f81186e.setVisibility(0);
            this.f81186e.setText(sg.bigo.ads.common.utils.a.a(this.f81182a, this.f81191j.f80913r, e.c(this.f81192k)));
            if (this.f81184c) {
                this.f81186e.setTextColor(-1);
            }
            this.f81187f.setVisibility(0);
            this.f81187f.setImageResource(this.f81191j.f80914s);
            this.f81189h.setVisibility(0);
            this.f81189h.setText(e.b(this.f81192k) + Z7.f30794r + sg.bigo.ads.common.utils.a.a(this.f81182a, this.f81191j.f80915t, new Object[0]));
            if (this.f81184c) {
                this.f81189h.setTextColor(q.b("#9AFFFFFF", -1));
            }
            this.f81190i.setVisibility(8);
        }
    }

    public IconListView(Context context) {
        this(context, null);
    }

    public IconListView(Context context, @Nullable AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    public IconListView(Context context, @Nullable AttributeSet attributeSet, int i10) {
        super(context, attributeSet, i10);
        this.f81180a = false;
        setOrientation(0);
        setGravity(17);
    }

    private List<a> a(Context context, int i10, String str) {
        d dVar;
        c cVar;
        ArrayList arrayList = new ArrayList();
        if (i10 == 1 || i10 == 2 || i10 == 4 || i10 == 8) {
            List<f.a> listA = f.a.a(i10);
            Random random = new Random();
            while (!listA.isEmpty()) {
                arrayList.add(new a(context, listA.remove(random.nextInt(listA.size())), str, this.f81180a));
            }
        } else {
            boolean z10 = this.f81180a;
            if (z10) {
                dVar = new d(context, f.a.f80903i, str, z10);
                arrayList.add(dVar);
                arrayList.add(new b(context, f.a.f80904j, str, this.f81180a));
                cVar = new c(context, f.a.f80905k, str, this.f81180a);
            } else {
                dVar = new d(context, f.a.f80895a, str, z10);
                arrayList.add(dVar);
                arrayList.add(new b(context, f.a.f80896b, str, this.f81180a));
                cVar = new c(context, f.a.f80897c, str, this.f81180a);
            }
            arrayList.add(cVar);
        }
        return arrayList;
    }

    /* JADX WARN: Removed duplicated region for block: B:35:0x0048  */
    /* JADX WARN: Removed duplicated region for block: B:42:0x0064 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:43:0x0065  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void a(sg.bigo.ads.ad.interstitial.f r9) {
        /*
            r8 = this;
            r8.removeAllViews()
            if (r9 != 0) goto L6
            return
        L6:
            android.content.Context r0 = r8.getContext()
            int r1 = r9.f80891a
            r2 = 0
            r3 = 1
            if (r1 == r3) goto L50
            r4 = 4
            r5 = 2
            if (r1 == r5) goto L3e
            r6 = 3
            r7 = 8
            if (r1 == r6) goto L2d
            if (r1 == r4) goto L1c
            return
        L1c:
            boolean r1 = r9.f80894d
            if (r1 == 0) goto L2c
            boolean r1 = r8.f81180a
            if (r1 == 0) goto L25
            r5 = r7
        L25:
            java.lang.String r9 = r9.f80893c
            java.util.List r9 = r8.a(r0, r5, r9)
            goto L5a
        L2c:
            return
        L2d:
            boolean r1 = r9.f80894d
            if (r1 == 0) goto L39
            boolean r1 = r8.f81180a
            if (r1 == 0) goto L37
            r4 = r7
            goto L49
        L37:
            r4 = r5
            goto L49
        L39:
            boolean r1 = r8.f81180a
            if (r1 == 0) goto L48
            goto L49
        L3e:
            boolean r1 = r9.f80894d
            if (r1 == 0) goto L43
            goto L54
        L43:
            boolean r1 = r8.f81180a
            if (r1 == 0) goto L48
            goto L49
        L48:
            r4 = r3
        L49:
            java.lang.String r9 = r9.f80893c
            java.util.List r9 = r8.a(r0, r4, r9)
            goto L5a
        L50:
            boolean r1 = r9.f80894d
            if (r1 == 0) goto L9a
        L54:
            java.lang.String r9 = r9.f80893c
            java.util.List r9 = r8.a(r0, r2, r9)
        L5a:
            r8.f81181b = r9
            java.util.List<sg.bigo.ads.ad.interstitial.multi_img.view.IconListView$a> r9 = r8.f81181b
            boolean r9 = sg.bigo.ads.common.utils.k.a(r9)
            if (r9 == 0) goto L65
            return
        L65:
            r9 = r2
        L66:
            java.util.List<sg.bigo.ads.ad.interstitial.multi_img.view.IconListView$a> r0 = r8.f81181b
            int r0 = r0.size()
            if (r9 >= r0) goto L9a
            if (r9 <= 0) goto L80
            android.content.Context r0 = r8.getContext()
            boolean r1 = r8.f81180a
            if (r1 == 0) goto L7b
            int r1 = sg.bigo.ads.R.layout.bigo_ad_layout_space
            goto L7d
        L7b:
            int r1 = sg.bigo.ads.R.layout.bigo_ad_layout_space_black
        L7d:
            sg.bigo.ads.common.utils.a.a(r0, r1, r8, r3)
        L80:
            android.widget.LinearLayout$LayoutParams r0 = new android.widget.LinearLayout$LayoutParams
            r1 = -2
            r0.<init>(r2, r1)
            r1 = 1065353216(0x3f800000, float:1.0)
            r0.weight = r1
            java.util.List<sg.bigo.ads.ad.interstitial.multi_img.view.IconListView$a> r1 = r8.f81181b
            java.lang.Object r1 = r1.get(r9)
            sg.bigo.ads.ad.interstitial.multi_img.view.IconListView$a r1 = (sg.bigo.ads.ad.interstitial.multi_img.view.IconListView.a) r1
            android.view.View r1 = r1.f81183b
            r8.addView(r1, r0)
            int r9 = r9 + 1
            goto L66
        L9a:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: sg.bigo.ads.ad.interstitial.multi_img.view.IconListView.a(sg.bigo.ads.ad.interstitial.f):void");
    }

    public List<a> getItems() {
        return this.f81181b;
    }

    public void setThemeWhite(boolean z10) {
        this.f81180a = z10;
    }
}
