package sg.bigo.ads.ad.interstitial;

import java.util.ArrayList;
import java.util.List;
import sg.bigo.ads.R;

/* JADX INFO: loaded from: classes10.dex */
public final class f {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int f80891a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final int f80892b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final String f80893c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final boolean f80894d;

    /* JADX WARN: Enum visitor error
    jadx.core.utils.exceptions.JadxRuntimeException: Init of enum field 'a' uses external variables
    	at jadx.core.dex.visitors.EnumVisitor.createEnumFieldByConstructor(EnumVisitor.java:451)
    	at jadx.core.dex.visitors.EnumVisitor.processEnumFieldByRegister(EnumVisitor.java:395)
    	at jadx.core.dex.visitors.EnumVisitor.extractEnumFieldsFromFilledArray(EnumVisitor.java:324)
    	at jadx.core.dex.visitors.EnumVisitor.extractEnumFieldsFromInsn(EnumVisitor.java:262)
    	at jadx.core.dex.visitors.EnumVisitor.convertToEnum(EnumVisitor.java:151)
    	at jadx.core.dex.visitors.EnumVisitor.visit(EnumVisitor.java:100)
     */
    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    public static final class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final a f80895a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public static final a f80896b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public static final a f80897c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public static final a f80898d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public static final a f80899e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        public static final a f80900f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        public static final a f80901g;

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        public static final a f80902h;

        /* JADX INFO: renamed from: i, reason: collision with root package name */
        public static final a f80903i;

        /* JADX INFO: renamed from: j, reason: collision with root package name */
        public static final a f80904j;

        /* JADX INFO: renamed from: k, reason: collision with root package name */
        public static final a f80905k;

        /* JADX INFO: renamed from: l, reason: collision with root package name */
        public static final a f80906l;

        /* JADX INFO: renamed from: m, reason: collision with root package name */
        public static final a f80907m;

        /* JADX INFO: renamed from: n, reason: collision with root package name */
        public static final a f80908n;

        /* JADX INFO: renamed from: o, reason: collision with root package name */
        public static final a f80909o;

        /* JADX INFO: renamed from: p, reason: collision with root package name */
        public static final a f80910p;

        /* JADX INFO: renamed from: v, reason: collision with root package name */
        private static final /* synthetic */ a[] f80911v;

        /* JADX INFO: renamed from: q, reason: collision with root package name */
        public final int f80912q;

        /* JADX INFO: renamed from: r, reason: collision with root package name */
        public final int f80913r;

        /* JADX INFO: renamed from: s, reason: collision with root package name */
        public final int f80914s;

        /* JADX INFO: renamed from: t, reason: collision with root package name */
        public final int f80915t;

        /* JADX INFO: renamed from: u, reason: collision with root package name */
        public final int f80916u;

        static {
            int i10 = R.string.bigo_ad_ic_blank;
            int i11 = R.drawable.bigo_ad_ic_star;
            int i12 = R.string.bigo_ad_comment_num_text;
            a aVar = new a("STAR", 0, 0, i10, i11, i12, 0);
            f80895a = aVar;
            int i13 = R.string.bigo_ad_download_num_text;
            a aVar2 = new a("DOWNLOAD_NUM", 1, 0, i10, 0, i13, 0);
            f80896b = aVar2;
            int i14 = R.drawable.bigo_ad_ic_everyone;
            int i15 = R.string.bigo_ad_ic_everyone;
            a aVar3 = new a("Everyone", 2, 0, 0, i14, i15, R.drawable.bigo_ad_ic_everyone_ic_info);
            f80897c = aVar3;
            int i16 = R.drawable.bigo_ad_ic_web;
            int i17 = R.string.bigo_ad_ic_web;
            a aVar4 = new a("WEB", 3, 1, 0, i16, i17, 0);
            f80898d = aVar4;
            int i18 = R.drawable.bigo_ad_ic_recommend;
            int i19 = R.string.bigo_ad_ic_recommended;
            a aVar5 = new a("RECOMMENDED", 4, 1, 0, i18, i19, 0);
            f80899e = aVar5;
            a aVar6 = new a("REVIEWS", 5, 3, 0, R.drawable.bigo_ad_ic_star2, i12, 0);
            f80900f = aVar6;
            int i20 = R.drawable.bigo_ad_ic_phone;
            int i21 = R.string.bigo_ad_ic_application;
            a aVar7 = new a("APPLICATION", 6, 2, 0, i20, i21, 0);
            f80901g = aVar7;
            a aVar8 = new a("DOWNLOAD", 7, 2, 0, R.drawable.bigo_ad_ic_download_box, i13, 0);
            f80902h = aVar8;
            a aVar9 = new a("STAR_WHITE", 8, 0, i10, R.drawable.bigo_ad_ic_star_white, i12, 0);
            f80903i = aVar9;
            a aVar10 = new a("DOWNLOAD_NUM_WHITE", 9, 0, i10, 0, i13, 0);
            f80904j = aVar10;
            a aVar11 = new a("Everyone_WHITE", 10, 0, 0, R.drawable.bigo_ad_ic_everyone_white, i15, R.drawable.bigo_ad_ic_info_white);
            f80905k = aVar11;
            a aVar12 = new a("WEB_WHITE", 11, 4, 0, R.drawable.bigo_ad_ic_web_white, i17, 0);
            f80906l = aVar12;
            a aVar13 = new a("RECOMMENDED_WHITE", 12, 4, 0, R.drawable.bigo_ad_ic_recommend_white, i19, 0);
            f80907m = aVar13;
            a aVar14 = new a("REVIEWS_WHITE", 13, 12, 0, R.drawable.bigo_ad_ic_star2_white, i12, 0);
            f80908n = aVar14;
            a aVar15 = new a("APPLICATION_WHITE", 14, 8, 0, R.drawable.bigo_ad_ic_phone_white, i21, 0);
            f80909o = aVar15;
            a aVar16 = new a("DOWNLOAD_WHITE", 15, 8, 0, R.drawable.bigo_ad_ic_download_box_white, i13, 0);
            f80910p = aVar16;
            f80911v = new a[]{aVar, aVar2, aVar3, aVar4, aVar5, aVar6, aVar7, aVar8, aVar9, aVar10, aVar11, aVar12, aVar13, aVar14, aVar15, aVar16};
        }

        private a(String str, int i10, int i11, int i12, int i13, int i14, int i15) {
            this.f80912q = i11;
            this.f80913r = i12;
            this.f80914s = i13;
            this.f80915t = i14;
            this.f80916u = i15;
        }

        public static List<a> a(int i10) {
            a[] aVarArrValues = values();
            ArrayList arrayList = new ArrayList();
            for (a aVar : aVarArrValues) {
                int i11 = aVar.f80912q;
                if ((i11 & i10) > 0 || i11 == i10) {
                    arrayList.add(aVar);
                }
            }
            return arrayList;
        }

        public static a valueOf(String str) {
            return (a) Enum.valueOf(a.class, str);
        }

        public static a[] values() {
            return (a[]) f80911v.clone();
        }
    }

    public f(int i10, int i11, String str) {
        this.f80891a = i10;
        this.f80892b = i11;
        this.f80893c = str;
        this.f80894d = !sg.bigo.ads.common.utils.q.a((CharSequence) str);
    }
}
