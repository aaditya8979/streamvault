package com.mbridge.msdk.video.dynview;

import android.content.Context;
import android.view.View;
import com.mbridge.msdk.foundation.entity.CampaignEx;
import java.util.List;

/* JADX INFO: compiled from: ViewOption.java */
/* JADX INFO: loaded from: classes2.dex */
public class c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private Context f41376a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private String f41377b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private int f41378c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private float f41379d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private float f41380e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private int f41381f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private int f41382g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private View f41383h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private List<CampaignEx> f41384i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private int f41385j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    private boolean f41386k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    private List<String> f41387l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    private int f41388m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private String f41389n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    private int f41390o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    private int f41391p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    private String f41392q;

    /* JADX INFO: compiled from: ViewOption.java */
    public static class b implements InterfaceC0513c {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private Context f41393a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private String f41394b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private int f41395c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        private float f41396d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        private float f41397e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        private int f41398f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        private int f41399g;

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        private View f41400h;

        /* JADX INFO: renamed from: i, reason: collision with root package name */
        private List<CampaignEx> f41401i;

        /* JADX INFO: renamed from: j, reason: collision with root package name */
        private int f41402j;

        /* JADX INFO: renamed from: k, reason: collision with root package name */
        private boolean f41403k;

        /* JADX INFO: renamed from: l, reason: collision with root package name */
        private List<String> f41404l;

        /* JADX INFO: renamed from: m, reason: collision with root package name */
        private int f41405m;

        /* JADX INFO: renamed from: n, reason: collision with root package name */
        private String f41406n;

        /* JADX INFO: renamed from: o, reason: collision with root package name */
        private int f41407o;

        /* JADX INFO: renamed from: p, reason: collision with root package name */
        private int f41408p = 1;

        /* JADX INFO: renamed from: q, reason: collision with root package name */
        private String f41409q;

        @Override // com.mbridge.msdk.video.dynview.c.InterfaceC0513c
        public InterfaceC0513c a(float f10) {
            this.f41397e = f10;
            return this;
        }

        @Override // com.mbridge.msdk.video.dynview.c.InterfaceC0513c
        public InterfaceC0513c a(int i10) {
            this.f41402j = i10;
            return this;
        }

        @Override // com.mbridge.msdk.video.dynview.c.InterfaceC0513c
        public InterfaceC0513c a(Context context) {
            this.f41393a = context.getApplicationContext();
            return this;
        }

        @Override // com.mbridge.msdk.video.dynview.c.InterfaceC0513c
        public InterfaceC0513c a(View view) {
            this.f41400h = view;
            return this;
        }

        @Override // com.mbridge.msdk.video.dynview.c.InterfaceC0513c
        public InterfaceC0513c a(String str) {
            this.f41406n = str;
            return this;
        }

        @Override // com.mbridge.msdk.video.dynview.c.InterfaceC0513c
        public InterfaceC0513c a(List<CampaignEx> list) {
            this.f41401i = list;
            return this;
        }

        @Override // com.mbridge.msdk.video.dynview.c.InterfaceC0513c
        public InterfaceC0513c a(boolean z10) {
            this.f41403k = z10;
            return this;
        }

        @Override // com.mbridge.msdk.video.dynview.c.InterfaceC0513c
        public InterfaceC0513c b(float f10) {
            this.f41396d = f10;
            return this;
        }

        @Override // com.mbridge.msdk.video.dynview.c.InterfaceC0513c
        public InterfaceC0513c b(int i10) {
            this.f41395c = i10;
            return this;
        }

        @Override // com.mbridge.msdk.video.dynview.c.InterfaceC0513c
        public InterfaceC0513c b(String str) {
            this.f41409q = str;
            return this;
        }

        @Override // com.mbridge.msdk.video.dynview.c.InterfaceC0513c
        public c build() {
            return new c(this);
        }

        @Override // com.mbridge.msdk.video.dynview.c.InterfaceC0513c
        public InterfaceC0513c c(int i10) {
            this.f41399g = i10;
            return this;
        }

        @Override // com.mbridge.msdk.video.dynview.c.InterfaceC0513c
        public InterfaceC0513c c(String str) {
            this.f41394b = str;
            return this;
        }

        @Override // com.mbridge.msdk.video.dynview.c.InterfaceC0513c
        public InterfaceC0513c d(int i10) {
            this.f41405m = i10;
            return this;
        }

        @Override // com.mbridge.msdk.video.dynview.c.InterfaceC0513c
        public InterfaceC0513c e(int i10) {
            this.f41408p = i10;
            return this;
        }

        @Override // com.mbridge.msdk.video.dynview.c.InterfaceC0513c
        public InterfaceC0513c f(int i10) {
            this.f41407o = i10;
            return this;
        }

        @Override // com.mbridge.msdk.video.dynview.c.InterfaceC0513c
        public InterfaceC0513c fileDirs(List<String> list) {
            this.f41404l = list;
            return this;
        }

        @Override // com.mbridge.msdk.video.dynview.c.InterfaceC0513c
        public InterfaceC0513c orientation(int i10) {
            this.f41398f = i10;
            return this;
        }
    }

    /* JADX INFO: renamed from: com.mbridge.msdk.video.dynview.c$c, reason: collision with other inner class name */
    /* JADX INFO: compiled from: ViewOption.java */
    public interface InterfaceC0513c {
        InterfaceC0513c a(float f10);

        InterfaceC0513c a(int i10);

        InterfaceC0513c a(Context context);

        InterfaceC0513c a(View view);

        InterfaceC0513c a(String str);

        InterfaceC0513c a(List<CampaignEx> list);

        InterfaceC0513c a(boolean z10);

        InterfaceC0513c b(float f10);

        InterfaceC0513c b(int i10);

        InterfaceC0513c b(String str);

        c build();

        InterfaceC0513c c(int i10);

        InterfaceC0513c c(String str);

        InterfaceC0513c d(int i10);

        InterfaceC0513c e(int i10);

        InterfaceC0513c f(int i10);

        InterfaceC0513c fileDirs(List<String> list);

        InterfaceC0513c orientation(int i10);
    }

    private c(b bVar) {
        this.f41380e = bVar.f41397e;
        this.f41379d = bVar.f41396d;
        this.f41381f = bVar.f41398f;
        this.f41382g = bVar.f41399g;
        this.f41376a = bVar.f41393a;
        this.f41377b = bVar.f41394b;
        this.f41378c = bVar.f41395c;
        this.f41383h = bVar.f41400h;
        this.f41384i = bVar.f41401i;
        this.f41385j = bVar.f41402j;
        this.f41386k = bVar.f41403k;
        this.f41387l = bVar.f41404l;
        this.f41388m = bVar.f41405m;
        this.f41389n = bVar.f41406n;
        this.f41390o = bVar.f41407o;
        this.f41391p = bVar.f41408p;
        this.f41392q = bVar.f41409q;
    }

    public static b a() {
        return new b();
    }

    public List<CampaignEx> b() {
        return this.f41384i;
    }

    public Context c() {
        return this.f41376a;
    }

    public List<String> d() {
        return this.f41387l;
    }

    public int e() {
        return this.f41390o;
    }

    public String f() {
        return this.f41377b;
    }

    public int g() {
        return this.f41378c;
    }

    public int h() {
        return this.f41381f;
    }

    public View i() {
        return this.f41383h;
    }

    public int j() {
        return this.f41382g;
    }

    public float k() {
        return this.f41379d;
    }

    public int l() {
        return this.f41385j;
    }

    public float m() {
        return this.f41380e;
    }

    public String n() {
        return this.f41392q;
    }

    public int o() {
        return this.f41391p;
    }

    public boolean p() {
        return this.f41386k;
    }
}
