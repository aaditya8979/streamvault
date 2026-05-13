package sg.bigo.ads.common.form.render;

import android.content.Context;
import android.graphics.Rect;
import android.text.TextUtils;
import android.widget.Button;
import android.widget.RelativeLayout;
import android.widget.TextView;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import java.lang.ref.WeakReference;
import java.util.Map;
import sg.bigo.ads.R;
import sg.bigo.ads.api.a.e;
import sg.bigo.ads.common.form.b;
import sg.bigo.ads.common.form.render.c;
import sg.bigo.ads.common.n.d;

/* JADX INFO: loaded from: classes9.dex */
public final class b implements b.a, c.a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NonNull
    public final Context f82073a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @NonNull
    public final e f82074b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final sg.bigo.ads.common.form.render.a.c f82075c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public Button f82076d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public RelativeLayout f82077e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public long f82078f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public int f82079g;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private final WeakReference<a> f82082j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    private int f82083k;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private boolean f82081i = false;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    private boolean[] f82084l = new boolean[13];

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final Runnable f82080h = new Runnable() { // from class: sg.bigo.ads.common.form.render.b.1
        @Override // java.lang.Runnable
        public final void run() {
            b bVar = b.this;
            RelativeLayout relativeLayout = bVar.f82077e;
            if (relativeLayout == null || bVar.f82078f > 0) {
                d.a(bVar.f82080h);
                return;
            }
            if (!sg.bigo.ads.common.ab.a.a(relativeLayout, new Rect())) {
                d.a(2, b.this.f82080h, 500L);
                return;
            }
            d.a(b.this.f82080h);
            b.this.f82078f = System.currentTimeMillis();
            b bVar2 = b.this;
            bVar2.a(1, bVar2.f82079g, 0L);
        }
    };

    public interface a {
        void a();

        void a(String str);
    }

    public b(@NonNull Context context, @NonNull e eVar, @Nullable Map<String, Object> map, int i10, int i11, a aVar) {
        this.f82073a = context;
        this.f82074b = eVar;
        sg.bigo.ads.common.form.render.a.f82047a = eVar.d() == 1;
        this.f82075c = new sg.bigo.ads.common.form.render.a.c(eVar, map, context, this);
        this.f82082j = new WeakReference<>(aVar);
        this.f82079g = i10;
        this.f82083k = i11;
    }

    public static void a(TextView textView, @Nullable String str) {
        if (textView == null) {
            return;
        }
        if (TextUtils.isEmpty(str)) {
            textView.setVisibility(8);
        } else {
            textView.setText(str);
        }
    }

    private void d(String str) {
        if (this.f82082j.get() != null) {
            this.f82082j.get().a(str);
        }
    }

    @Override // sg.bigo.ads.common.form.render.c.a
    public final void a() {
        Button button = this.f82076d;
        if (button == null || this.f82081i) {
            return;
        }
        button.setEnabled(true);
        this.f82076d.setBackgroundResource(R.drawable.bigo_ad_btn_background);
        this.f82076d.setTextColor(-1);
        this.f82081i = true;
        a(2, this.f82079g, System.currentTimeMillis() - this.f82078f);
    }

    @Override // sg.bigo.ads.common.form.b.a
    public final void a(int i10) {
        int i11;
        if (i10 != 1) {
            i11 = i10 == 2 ? 8 : 7;
            sg.bigo.ads.common.form.a.b(this.f82083k);
        }
        a(i11, this.f82079g, System.currentTimeMillis() - this.f82078f);
        sg.bigo.ads.common.form.a.b(this.f82083k);
    }

    public final void a(int i10, int i11, long j10) {
        boolean[] zArr = this.f82084l;
        if (i10 >= zArr.length || zArr[i10]) {
            return;
        }
        sg.bigo.ads.core.d.b.a(i10, i11, j10);
        this.f82084l[i10] = true;
    }

    @Override // sg.bigo.ads.common.form.render.c.a
    public final void a(String str) {
        a(11, this.f82079g, System.currentTimeMillis() - this.f82078f);
        d(str);
    }

    @Override // sg.bigo.ads.common.form.b.a
    public final void a(Map<String, Object> map) {
        sg.bigo.ads.common.form.a.a(this.f82083k, map);
    }

    @Override // sg.bigo.ads.common.form.render.c.a
    public final void b() {
        a(5, this.f82079g, System.currentTimeMillis() - this.f82078f);
    }

    @Override // sg.bigo.ads.common.form.render.c.a
    public final void b(int i10) {
        if (this.f82082j.get() != null) {
            this.f82082j.get().a();
        }
        sg.bigo.ads.common.form.b.a().a(sg.bigo.ads.common.form.a.a(this.f82074b, this.f82075c.b(), this.f82075c.a()), this, i10);
    }

    @Override // sg.bigo.ads.common.form.render.c.a
    public final void b(String str) {
        a(10, this.f82079g, System.currentTimeMillis() - this.f82078f);
        d(str);
    }

    @Override // sg.bigo.ads.common.form.render.c.a
    public final void c() {
        a(6, this.f82079g, System.currentTimeMillis() - this.f82078f);
    }

    @Override // sg.bigo.ads.common.form.render.c.a
    public final void c(String str) {
        a(9, this.f82079g, System.currentTimeMillis() - this.f82078f);
        d(str);
    }
}
