package com.mgs.carparking.widgets.cardbanner.view;

import android.content.Context;
import android.os.Handler;
import android.os.Message;
import android.util.AttributeSet;
import android.util.Log;
import android.view.MotionEvent;
import android.view.View;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import com.dramarush.shortin.R;

/* JADX INFO: loaded from: classes12.dex */
public class CardView extends RecyclerView implements View.OnClickListener {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public int f45130b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public boolean f45131c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public qd.a f45132d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public boolean f45133e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public b f45134f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public View f45135g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public c f45136h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public boolean f45137i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public boolean f45138j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public int f45139k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public Handler f45140l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public d f45141m;

    public class a extends Handler {
        public a() {
        }

        @Override // android.os.Handler
        public void handleMessage(Message message) {
            if (CardView.this.f45139k > 0) {
                CardView cardView = CardView.this;
                cardView.scrollToPosition(268435455 >> (2 % cardView.f45139k));
            }
        }
    }

    public interface b {
        void a(View view);
    }

    public interface c {
        void a(int i10);

        void b(int i10, int i11);

        void c(int i10, int i11, int i12, int i13);
    }

    public interface d {
        void a(View view);
    }

    public CardView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    public CardView(Context context, AttributeSet attributeSet, int i10) {
        super(context, attributeSet, i10);
        this.f45133e = true;
        this.f45138j = true;
        this.f45140l = new a();
        setOverScrollMode(2);
    }

    public View b(int i10, int i11) {
        int childCount = getChildCount();
        for (int i12 = 0; i12 < childCount; i12++) {
            View childAt = getChildAt(i12);
            int left = childAt.getLeft();
            int top2 = childAt.getTop();
            int width = childAt.getWidth() + left;
            int height = childAt.getHeight() + top2;
            if (i10 >= left && i10 <= width && i11 >= top2 && i11 <= height) {
                return childAt;
            }
        }
        return null;
    }

    public View c() {
        if (getLayoutManager().canScrollVertically()) {
            return b(0, getHeight() / 2);
        }
        if (getLayoutManager().canScrollHorizontally()) {
            return b(getWidth() / 2, 0);
        }
        return null;
    }

    public void d(View view) {
        int i10;
        float x10;
        int width;
        if (!(getLayoutManager() instanceof LinearLayoutManager)) {
            throw new IllegalArgumentException("CircleRecyclerView just support T extend LinearLayoutManager!");
        }
        if (getLayoutManager().canScrollVertically()) {
            x10 = view.getY() + (view.getHeight() * 0.5f);
            width = getHeight();
        } else if (!getLayoutManager().canScrollHorizontally()) {
            i10 = 0;
            smoothScrollBy(i10, i10);
        } else {
            x10 = view.getX() + (view.getWidth() * 0.5f);
            width = getWidth();
        }
        i10 = (int) (x10 - (width * 0.5f));
        smoothScrollBy(i10, i10);
    }

    public int getCurrentItem() {
        this.f45135g = c();
        try {
            return ((Integer) c().getTag(R.id.key_item)).intValue();
        } catch (Exception e10) {
            Log.i("cardView", e10.toString());
            return 0;
        }
    }

    @Override // android.view.View.OnClickListener
    public void onClick(View view) {
        b bVar = this.f45134f;
        if (bVar != null) {
            bVar.a(view);
        }
    }

    @Override // androidx.recyclerview.widget.RecyclerView, android.view.ViewGroup, android.view.View
    public void onLayout(boolean z10, int i10, int i11, int i12, int i13) {
        super.onLayout(z10, i10, i11, i12, i13);
        if (this.f45138j) {
            return;
        }
        if (this.f45133e) {
            if (!this.f45137i) {
                this.f45137i = true;
                this.f45140l.sendEmptyMessage(0);
            }
            View viewC = c();
            this.f45135g = viewC;
            if (viewC != null) {
                d(viewC);
            }
        }
        View view = this.f45135g;
        if (view != null) {
            view.setOnClickListener(this);
        }
    }

    @Override // android.view.View
    public void onScrollChanged(int i10, int i11, int i12, int i13) {
        super.onScrollChanged(i10, i11, i12, i13);
        if (this.f45132d != null) {
            int childCount = getChildCount();
            for (int i14 = 0; i14 < childCount; i14++) {
                View childAt = getChildAt(i14);
                if (childAt != this.f45135g && this.f45134f != null) {
                    childAt.setOnClickListener(null);
                }
                this.f45132d.a(childAt, this);
            }
        }
        c cVar = this.f45136h;
        if (cVar != null) {
            cVar.c(i10, i11, i12, i13);
        }
    }

    @Override // androidx.recyclerview.widget.RecyclerView
    public void onScrollStateChanged(int i10) {
        View view;
        if (i10 == 0) {
            View viewC = c();
            this.f45135g = viewC;
            if (viewC != null && this.f45134f != null) {
                viewC.setOnClickListener(this);
            }
            d dVar = this.f45141m;
            if (dVar != null && (view = this.f45135g) != null) {
                dVar.a(view);
            }
        }
        c cVar = this.f45136h;
        if (cVar != null) {
            cVar.a(i10);
        }
    }

    @Override // androidx.recyclerview.widget.RecyclerView
    public void onScrolled(int i10, int i11) {
        super.onScrolled(i10, i11);
        c cVar = this.f45136h;
        if (cVar != null) {
            cVar.b(i10, i11);
        }
    }

    @Override // androidx.recyclerview.widget.RecyclerView, android.view.View
    public boolean onTouchEvent(MotionEvent motionEvent) {
        this.f45131c = false;
        return super.onTouchEvent(motionEvent);
    }

    @Override // androidx.recyclerview.widget.RecyclerView
    public void setAdapter(RecyclerView.Adapter adapter) {
        this.f45130b = adapter.getItemCount();
        super.setAdapter(adapter);
        if (this.f45138j) {
            this.f45138j = false;
        } else {
            this.f45140l.sendEmptyMessage(0);
        }
    }

    public void setDataCount(int i10) {
        this.f45139k = i10;
    }

    public void setNeedLoop(boolean z10) {
        this.f45133e = z10;
    }

    public void setOnCenterItemClickListener(b bVar) {
        this.f45134f = bVar;
    }

    public void setOnScrollListener(c cVar) {
        this.f45136h = cVar;
    }

    public void setOnScrollPosition(d dVar) {
        this.f45141m = dVar;
    }

    public void setViewMode(qd.a aVar) {
        this.f45132d = aVar;
    }
}
