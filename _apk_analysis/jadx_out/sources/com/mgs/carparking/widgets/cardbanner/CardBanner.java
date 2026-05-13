package com.mgs.carparking.widgets.cardbanner;

import android.content.Context;
import android.content.res.TypedArray;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.PagerSnapHelper;
import com.dramarush.shortin.R;
import com.mgs.carparking.R$styleable;
import com.mgs.carparking.widgets.cardbanner.adapter.CardAdapter;
import com.mgs.carparking.widgets.cardbanner.view.CardView;
import java.util.List;

/* JADX INFO: loaded from: classes12.dex */
public class CardBanner extends FrameLayout {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public nd.c f45089b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public Context f45090c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public int f45091d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public int f45092e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public int f45093f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public int f45094g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public int f45095h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public int f45096i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public int f45097j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public LinearLayoutManager f45098k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public PagerSnapHelper f45099l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public CardView f45100m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public List<nd.b> f45101n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public pd.a f45102o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public qd.a f45103p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public int f45104q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public d f45105r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public od.a f45106s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public boolean f45107t;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    public int f45108u;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public int f45109v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public int f45110w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public CardAdapter f45111x;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public final Runnable f45112y;

    /* JADX INFO: renamed from: z, reason: collision with root package name */
    public e f45113z;

    public class a implements CardView.b {
        public a() {
        }

        @Override // com.mgs.carparking.widgets.cardbanner.view.CardView.b
        public void a(View view) {
            if (CardBanner.this.f45105r != null) {
                CardBanner.this.f45105r.a(((Integer) view.getTag(R.id.key_position)).intValue());
            }
        }
    }

    public class b implements CardView.d {
        public b() {
        }

        @Override // com.mgs.carparking.widgets.cardbanner.view.CardView.d
        public void a(View view) {
            if (view == null || CardBanner.this.f45113z == null || view.getTag(R.id.key_position) == null) {
                return;
            }
            CardBanner.this.f45113z.a(((Integer) view.getTag(R.id.key_position)).intValue());
        }
    }

    public class c implements Runnable {
        public c() {
        }

        @Override // java.lang.Runnable
        public void run() {
            if (CardBanner.this.f45108u <= 1 || !CardBanner.this.f45107t) {
                return;
            }
            CardBanner cardBanner = CardBanner.this;
            cardBanner.f45110w = cardBanner.f45100m.getCurrentItem() + 1;
            if (CardBanner.this.f45113z != null) {
                CardBanner.this.f45113z.a(CardBanner.this.f45110w);
            }
            CardBanner.this.f45100m.smoothScrollToPosition(CardBanner.this.f45110w);
            CardBanner.this.f45089b.a(CardBanner.this.f45112y, CardBanner.this.f45109v);
        }
    }

    public interface d {
        void a(int i10);
    }

    public interface e {
        void a(int i10);
    }

    public CardBanner(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    public CardBanner(Context context, AttributeSet attributeSet, int i10) {
        super(context, attributeSet, i10);
        this.f45089b = new nd.c();
        this.f45091d = -1;
        this.f45092e = -1;
        this.f45093f = 15;
        this.f45094g = 12;
        this.f45095h = 0;
        this.f45096i = 0;
        this.f45097j = 0;
        this.f45099l = new PagerSnapHelper();
        this.f45107t = true;
        this.f45108u = 0;
        this.f45109v = 4000;
        this.f45110w = 0;
        this.f45112y = new c();
        this.f45090c = context;
        l(attributeSet);
    }

    @Override // android.view.ViewGroup, android.view.View
    public boolean dispatchTouchEvent(MotionEvent motionEvent) {
        if (this.f45107t) {
            int action = motionEvent.getAction();
            if (action == 1 || action == 3 || action == 4) {
                k();
            } else if (action == 0) {
                q();
            }
        }
        return super.dispatchTouchEvent(motionEvent);
    }

    public final void k() {
        if (this.f45107t) {
            this.f45089b.b(this.f45112y);
            this.f45089b.a(this.f45112y, this.f45109v);
        }
    }

    public final void l(AttributeSet attributeSet) {
        r(this.f45090c, attributeSet);
        View viewInflate = LayoutInflater.from(this.f45090c).inflate(R.layout.layout_card_banner, (ViewGroup) this, true);
        this.f45104q = this.f45090c.getResources().getDisplayMetrics().widthPixels;
        this.f45100m = (CardView) viewInflate.findViewById(R.id.card_view);
        this.f45103p = new qd.b();
        this.f45098k = new LinearLayoutManager(this.f45090c, 0, false);
    }

    public CardBanner m(od.a aVar) {
        this.f45101n = null;
        this.f45108u = aVar.getCount();
        this.f45106s = aVar;
        return this;
    }

    public final void n() {
        this.f45100m.setLayoutManager(this.f45098k);
        this.f45100m.setViewMode(this.f45103p);
        this.f45099l.attachToRecyclerView(this.f45100m);
        this.f45100m.setOnCenterItemClickListener(new a());
        this.f45100m.setOnScrollPosition(new b());
        CardAdapter cardAdapter = new CardAdapter(this.f45090c, this.f45104q, this.f45095h, this.f45097j);
        this.f45111x = cardAdapter;
        if (this.f45101n != null) {
            pd.a aVar = this.f45102o;
            if (aVar == null) {
                throw new RuntimeException("[CardBanner] --> please set CardImageLoader");
            }
            cardAdapter.f(aVar);
            this.f45100m.setDataCount(this.f45101n.size());
            this.f45111x.h(this.f45101n);
        } else {
            if (this.f45106s == null) {
                throw new RuntimeException("[CardBanner] --> please set BannerAdapter");
            }
            this.f45100m.setDataCount(this.f45108u);
            this.f45111x.g(this.f45108u);
            this.f45111x.e(this.f45106s);
        }
        this.f45111x.i(this.f45093f, this.f45094g);
        this.f45100m.setAdapter(this.f45111x);
    }

    public void o() {
        n();
        if (this.f45107t) {
            k();
        }
    }

    public void p() {
        this.f45089b.b(this.f45112y);
    }

    public final void q() {
        if (this.f45107t) {
            this.f45089b.b(this.f45112y);
        }
    }

    public final void r(Context context, AttributeSet attributeSet) {
        if (attributeSet == null) {
            return;
        }
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, R$styleable.card_banner);
        rd.a aVar = rd.a.f78894a;
        this.f45095h = typedArrayObtainStyledAttributes.getDimensionPixelSize(0, aVar.a(context, this.f45095h));
        this.f45096i = typedArrayObtainStyledAttributes.getDimensionPixelSize(4, aVar.a(context, this.f45096i));
        this.f45091d = typedArrayObtainStyledAttributes.getColor(2, this.f45091d);
        this.f45092e = typedArrayObtainStyledAttributes.getColor(5, this.f45092e);
        this.f45097j = typedArrayObtainStyledAttributes.getDimensionPixelSize(1, aVar.a(context, this.f45097j)) / 2;
        this.f45093f = aVar.b(context, typedArrayObtainStyledAttributes.getDimensionPixelSize(3, aVar.c(context, this.f45093f)));
        this.f45094g = aVar.b(context, typedArrayObtainStyledAttributes.getDimensionPixelSize(6, aVar.c(context, this.f45094g)));
        typedArrayObtainStyledAttributes.recycle();
    }

    public void setOnItemClickListener(d dVar) {
        this.f45105r = dVar;
    }

    public void setScrollToPosition(e eVar) {
        this.f45113z = eVar;
    }
}
